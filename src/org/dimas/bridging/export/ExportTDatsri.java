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
import org.config.spring.hibernate.model.ScyReturPabrikItem;
import org.config.spring.hibernate.model.TDatsri;
import org.config.spring.hibernate.model.TDatsriPK;
import org.config.spring.provider.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ExportTDatsri {
    private static final Logger logger = LoggerFactory.getLogger(ExportTDatsri.class);
    
    ApplicationContext appContext;
    SysvarDaoInter sysvarDao;
    
    public ExportTDatsri(){
        initiates();
    }
    public void initiates(){
            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    }
    public List<TDatsri> exportToCsvFromListToFile(String filePathDestination, Date tglTransaksi, List<ScyReturPabrikItem> lst){
        List<TDatsri> list = new ArrayList<>();
        FileWriter fileWriter = null;
        logger.info("Starting export TDatsri");
        try {
            File filePath = new File(filePathDestination);
            fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            //Seragam Distributor Code Pake Parameter Sistem
            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();
            String distName = sysvarDao.findById("_DIST_NAME").getNilaiString1();

            //Header
            printWriter.println("disticode,transdate,transno,itemcode,quantity,uom,unitprice,skuqty,nppnamt,totalsales"); 
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            for (ScyReturPabrikItem itm: lst) {
                //System.out.println(sdf.format(tglTransaksi) + " == " + sdf.format(itm.getStockPK().getTangalStock()));                
                if (sdf.format(tglTransaksi).equalsIgnoreCase(sdf.format(itm.getTglRetur()))) {
                    //1. disticode,
                    printWriter.print("\"" + distCode + "\",");
                    
                    //2. transdate,
                    Date tglRetur = itm.getTglRetur();
                    String strTglRetur =sdf.format(tglRetur);                
                    printWriter.print("" + strTglRetur + ",");
                    //3. transno,
                    printWriter.print("\"" + itm.getNoRetur() + "\",");
                    //4. itemcode,
                    printWriter.print("\"" + itm.gettMasterProduct().getPcodeSap() + "\",");
                    //5. quantity,
                    printWriter.print("" + itm.getJmlBarang() + ","); //Satuan Karton
                    //6. uom,
                    printWriter.print("\"" + "KRT" + "\","); //Satuan Karton
                    //7. unitprice,
                    printWriter.print("" + itm.getHrgBeli() + ","); 
                    //8. skuqty,
                    printWriter.print("" + itm.getJmlBarangPcs() + ",");
                    //9. nppnamt,
                    Double doubleDisc10Persen = itm.getJumlahRupiah() *0.01;
                    Integer intJumlahRupiahMinDisc10Persen = itm.getJumlahRupiah().intValue() - doubleDisc10Persen.intValue();
                    printWriter.print("" + intJumlahRupiahMinDisc10Persen + ",");
                    //10. totalsales
                    printWriter.print("" + itm.getJumlahRupiah() + "");

                    //TurunBaris
                    printWriter.println();

                    //Untuk Isi List
                    TDatsri item = new TDatsri();      
                    TDatsriPK tDatsriPK = new TDatsriPK();
                    tDatsriPK.setItemCode(itm.gettMasterProduct().getPcodeSap());
                    tDatsriPK.setTransNo(itm.getScyReturPabrikItemPK().getNoDokumen());
                    item.setTdatsriPK(tDatsriPK);
                    
                    item.setTransDate(itm.getTglRetur());
                    item.setDistiCode(distCode);
                    item.setUnitPrice(itm.getHrgBeli());
                    
                    item.setQuantity(itm.getJmlBarang());
                    item.setSkuQty(itm.getJmlBarangPcs());

                    item.setNppnAmt(intJumlahRupiahMinDisc10Persen);
                    item.setTotalSales(itm.getJumlahRupiah());
                    
                    
                    list.add(item);
                    
                    
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
    public int exportToCsvFromDbToFile(String filePathDestination){
    
        return 0;
    }
    public int exportToCsvFromFileToDb(String filePathSource, String filePathDestination){
        return 0;
    }
    
    
    public static void main(String [] args){
        ExportTDatsri f = new ExportTDatsri();
    
    }
    
}
