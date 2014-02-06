/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.export.pokari;

import org.dimas.bridging.export.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.config.spring.hibernate.model.pokari.CanDDeliveryOrderItemDetail;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class ExportCanDDeliveryOrderItemDetail {
    private static final Logger logger = LoggerFactory.getLogger(ExportCanDDeliveryOrderItemDetail.class);
    
//    ApplicationContext appContext;
//    SysvarDaoInter sysvarDao;

    public ExportCanDDeliveryOrderItemDetail() {
        initiates();
    }  
    
    public void initiates(){
//            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
//            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    }
    public List<OutputCanDDeliveryOrderItemDetail> exportFromListToFileExel(String filePathDestination, Date tglTransaksi, List<JHeader> lst){
        List<OutputCanDDeliveryOrderItemDetail> list = new ArrayList<>();
        //FileWriter fileWriter = null;
        FileOutputStream out = null;
        logger.info("Starting export OutputCanDDeliveryOrderItemDetail");
        try {
            /**
             * APACHE POI EXEL : Cuma bisa menggunakan OutputStream
             */
            out = new FileOutputStream(new File(filePathDestination));
            

            /**
             * CREATE EXEL USING POI
             */
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("ArCustomer sheet");

            Map<Integer, Object[]> data = new HashMap<Integer, Object[]>();
            //CREATE HEADER
            data.put(1, new Object[] {"","", "", "", "", ""});
            data.put(2, new Object[] {"","szDocId", "shItemNumber", "szProductId", "decQty", "decPrice"});
            //printWriter.println("disticode,transdate,transno,outletcode,salesmancode,itemcode,quantity,uom,unitprice,fbonus,discamt1,discamt2,discamt3,discamt4,discamt5,discamt6,discitem,discitempct,discitemval,skuqty,nppnamt,totalsales"); 

            
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            /**
             * SORRY: WE DON'T USE THIS
             */
//            for (CanDDeliveryOrderItemDetail canDDeliveryOrderItemDetail: lst) {
//                lastRow++;
//                data.put(lastRow, new Object[] {"","szDocId", "shItemNumber", "szProductId", "decQty", "decPrice"});
//            }
            
            int lastRow= 2;
              for (JHeader item: lst){

                    List<JPcode> lstDetail = new ArrayList<>(item.getJpcodeSet());
                    for (JPcode itm: lstDetail){
                        lastRow++;
                        data.put(lastRow, new Object[] {"","szDocId", "shItemNumber", "szProductId", "decQty", "decPrice"});
                    }
              }

            
  
            /**
             * CREATE FILE EXEL
             */
            Set<Integer> keyset = data.keySet();
            int rownum = 0;
            for (Integer key : keyset) {
                Row row = sheet.createRow(rownum++);
                Object [] objArr = data.get(key);
                int cellnum = 0;
                for (Object obj : objArr) {
                    Cell cell = row.createCell(cellnum++);
                    if(obj instanceof Date)
                        cell.setCellValue((Date)obj);
                    else if(obj instanceof Boolean)
                        cell.setCellValue((Boolean)obj);
                    else if(obj instanceof String)
                        cell.setCellValue((String)obj);
                    else if(obj instanceof Double)
                        cell.setCellValue((Double)obj);
                    else if(obj instanceof Integer)
                        cell.setCellValue((Integer)obj);
                }
            }
            workbook.write(out);
            System.out.println("ArCustomer Excel written successfully..");            
            
        } catch (IOException ex) {
            logger.error("FileWriter pada method exportToCsvFromListToFile", ex);
        } finally {
            try {
                //fileWriter.close();
                out.close();
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
        ExportTOutlet f = new ExportTOutlet();
    
    }
    
}
