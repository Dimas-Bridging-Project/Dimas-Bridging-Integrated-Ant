/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.export;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.model.ScyPenyesuaianItem;
import org.config.spring.hibernate.model.TAdjstk;
import org.config.spring.hibernate.model.TAdjstkPK;
import org.config.spring.provider.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ExportTAdjstk {
    private static final Logger logger = LoggerFactory.getLogger(ExportTAdjstk.class);
    
    ApplicationContext appContext;
    SysvarDaoInter sysvarDao;

    public ExportTAdjstk() {
        initiates();
    }
    
    public void initiates(){
            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    }
    public List<TAdjstk> exportToCsvFromListToFile(String filePathDestination, Date tglTransaksi, List<ScyPenyesuaianItem> lst){
        List<TAdjstk> list = new ArrayList<>();
        FileWriter fileWriter = null;
        logger.info("Starting ExprortTAdjstk");
        try {
            File filePath = new File(filePathDestination);
            fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            //Seragam Distributor Code Pake Parameter Sistem
            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();
            String distName = sysvarDao.findById("_DIST_NAME").getNilaiString1();

            //Header
            printWriter.println("disticode,transdate,transno,itemcode,qtyadj,skuqty,reason"); 
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            for (ScyPenyesuaianItem itm: lst) {
                //System.out.println(sdf.format(tglTransaksi) + " == " + sdf.format(itm.getStockPK().getTangalStock()));                
                if (sdf.format(tglTransaksi).equalsIgnoreCase(sdf.format(itm.getTanggalPenyesuaian()))) {
                    //Cuma Barang Baik Saja yang akan di transfer
                    if (itm.getAdjBrgBaikPcs()!=null && itm.getAdjBrgBaikPcs()!=0){
                        //1. disticode,
                        printWriter.print("\"" + distCode + "\",");

                        //2. transdate,
                        Date tglDokumen = itm.getTanggalPenyesuaian();
                        String strTglDokumen =sdf.format(tglDokumen);                
                        printWriter.print("" + strTglDokumen + ",");
                        //3. transno,
                        printWriter.print("\"" + itm.getScyPenyesuaianItemPK().getNoDokumen() + "\",");
                        //4. itemcode,
                        printWriter.print("\"" + itm.gettMasterProduct().getPcodeSap() + "\",");
                        //5. qtyadj,
                        Integer qtyAdjKarton=0;
                        Integer qtyAdjPcs =0;
                        if (itm.getAdjBrgBaikRp()<0) {
                            qtyAdjKarton = - itm.getAdjBrgBaikKarton();
                            qtyAdjPcs = - itm.getAdjBrgBaikPcs();
                        } else {
                            qtyAdjKarton = itm.getAdjBrgBaikKarton();
                            qtyAdjPcs = itm.getAdjBrgBaikPcs();                    
                        }
                        printWriter.print("" + qtyAdjKarton + ",");
                        //6. skuqty,
                        printWriter.print("" + qtyAdjPcs + ",");
                        //7. reason
                        printWriter.print("\"" + "" + "\""); //Menggukan petik dua manu tidak koma

                        //TurunBaris
                        printWriter.println();

                        //Untuk Isi List
                        TAdjstk item = new TAdjstk();   
                        TAdjstkPK tAdjstkPK = new TAdjstkPK();
                        tAdjstkPK.setTransNo(itm.getScyPenyesuaianItemPK().getNoDokumen());
                        tAdjstkPK.setItemCode(itm.gettMasterProduct().getPcodeSap());
                        item.settAdjstkPK(tAdjstkPK);

                        item.setDistiCode(distCode);
                        item.setTransDate(itm.getTanggalPenyesuaian());

                        item.setQtyAdj(qtyAdjKarton);
                        item.setSkuQty(qtyAdjPcs);

                        list.add(item);
                    }
                }
                
            }
            printWriter.close();
        } catch (IOException ex) {
            logger.error("FileWriter pada method exportToCsvFromListToFile", ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                logger.error("Finally FileWriter pada method exportToCsvFromListToFile", ex);
            }
        }
        return list;        
    }
    public static void main(String [] args){
    
    }

}
