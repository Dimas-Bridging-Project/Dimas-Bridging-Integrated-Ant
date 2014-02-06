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
import org.config.spring.hibernate.model.Stock;
import org.config.spring.hibernate.model.TStok;
import org.config.spring.provider.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ExportTStok {
    private static final Logger logger = LoggerFactory.getLogger(ExportTStok.class);
    
    ApplicationContext appContext;
    SysvarDaoInter sysvarDao;

    public ExportTStok() {
        initiates();
    }
    
    public void initiates(){
            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    }
    public List<TStok> exportToCsvFromListToFile(String filePathDestination, Date tglTransaksi,  List<Stock> lst){
        List<TStok> list = new ArrayList<>();
        FileWriter fileWriter = null;
        logger.info("Starting export TStok");
        try {
            File filePath = new File(filePathDestination);
            fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            //Seragam Distributor Code Pake Parameter Sistem
            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();
            String distName = sysvarDao.findById("_DIST_NAME").getNilaiString1();

            //Header
            printWriter.println("disticode,itemcode,qtyintransit,qtyonkhand,procdate"); 
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            for (Stock itm: lst) {
                //System.out.println(sdf.format(tglTransaksi) + " == " + sdf.format(itm.getStockPK().getTangalStock()));                
                if (sdf.format(tglTransaksi).equalsIgnoreCase(sdf.format(itm.getStockPK().getTangalStock()))) {
                    //1. disticode,
                    printWriter.print("\"" + (distCode!=null?distCode:"") + "\",");
                    //2. itemcode,
                    printWriter.print("\"" + (itm.gettMasterProduct().getPcodeSap()!=null?itm.gettMasterProduct().getPcodeSap():"") + "\",");
                    //3. qtyintransit,
                    printWriter.print("" + 0 + ",");
                    //4. qtyonkhand,
                    printWriter.print("" + (itm.getTotalStockInPcs()!=null?itm.getTotalStockInPcs():"") + ",");
                    //5. procdate
                    Date tglStock = itm.getStockPK().getTangalStock();
                    String strTanggal =sdf.format(tglStock);
                    printWriter.print("" + strTanggal + ""); //Terakir tidak pake Koma

                    //Turun Baris
                    printWriter.println();

                    //Untuk Isi List
                    
                    TStok item = new TStok();
                    item.setDistiCode(distCode);
                    item.setItemCode(itm.gettMasterProduct().getPcodeSap());
                    item.setProcDate(itm.getStockPK().getTangalStock());
                    item.setQtyInTransit(0);
                    item.setQtyOnHand(itm.getTotalStockInPcs());
                    list.add(item);
                     
                }
                
            }
            printWriter.close();
        } catch (IOException ex) {
            logger.error("error pada method eexportToCsvFromListToFile", ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
            logger.error("error pada method eexportToCsvFromListToFile", ex);
            }
        }
        return list;        
    }
    
    
    public static void main(String [] args){
        ExportTStok f = new ExportTStok();
    
    }
    
}
