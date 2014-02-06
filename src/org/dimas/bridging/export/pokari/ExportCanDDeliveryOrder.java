/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.export.pokari;

import org.dimas.bridging.export.*;
import java.io.File;
import java.io.FileOutputStream;
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
import org.config.spring.hibernate.model.pokari.CanDDeliveryOrder;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class ExportCanDDeliveryOrder {
    private static final Logger logger = LoggerFactory.getLogger(ExportCanDDeliveryOrder.class);
    
//    ApplicationContext appContext;
//    SysvarDaoInter sysvarDao;

    public ExportCanDDeliveryOrder() {
        initiates();
    }  
    
    public void initiates(){
    }
    public List<OutputCanDDeliveryOrder> exportFromListToFileExel(String filePathDestination, Date tglTransaksi, List<JHeader> lst){
       
        List<OutputCanDDeliveryOrder> list = new ArrayList<>();
        //FileWriter fileWriter = null;
        FileOutputStream out = null;
        logger.info("Starting OutputCanDDeliveryOrder");
        try {
            /**
             * APACHE POI EXEL : Cuma bisa menggunakan OutputStream
             */
            out = new FileOutputStream(new File(filePathDestination));
            

            /**
             * CREATE EXEL USING POI
             */
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("CanDDeliveryOrder sheet");

            Map<Integer, Object[]> data = new HashMap<Integer, Object[]>();
            //CREATE HEADER
            data.put(1, new Object[] {"", "", "", "", "", "", 
                "", "", "", "", "", ""});
            data.put(2, new Object[] {"","szDocId", "szCustomreId", "szEmployeeId", "szVehicleId", "szOrderTypeId", 
                "dtmDoc", "dtmCreated", "dtmLastUpdated", "szWorkplaceId", "szManualId", "szSalesId"});
            //printWriter.println("disticode,transdate,transno,outletcode,salesmancode,itemcode,quantity,uom,unitprice,fbonus,discamt1,discamt2,discamt3,discamt4,discamt5,discamt6,discitem,discitempct,discitemval,skuqty,nppnamt,totalsales"); 

            
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            int lastRow= 2;
            /**
             * SORRY : WE DON'T USE THIS
             */
//            for (CanDDeliveryOrder itm: lst) {
//                lastRow++;
//                
//                data.put(lastRow, new Object[] {"","szDocId", "szCustomerId", "szEmployeeId", "szVehicleId", "szOrderTypeId", 
//                    "dtmDoc", "dtmCreated", "dtmLastUpdated", "szWorkplaceId", "szManualId", "szSalesId"});
//            }
              for (JHeader item: lst){
                    lastRow++;
                    
                    String szDocId;
                    String szCustomerId;
                    String szEmployeeId;
                    String szVehicleId;
                    String szOrderTypeId;
                    String dtmDoc;
                    String dtmCreated;
                    String dtmLastUpdated;
                    String szWorkplaceId;
                    String szManualId;
                    String szSalesId;

                    data.put(lastRow, new Object[] {"","szDocId", "szCustomerId", "szEmployeeId", "szVehicleId", "szOrderTypeId", 
                        "dtmDoc", "dtmCreated", "dtmLastUpdated", "szWorkplaceId", "szManualId", "szSalesId"});
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
            System.out.println("OutputCanDDeliveryOrder written successfully..");            
            
        } catch (IOException ex) {
            logger.error("FileWriter pada method ExportToExel", ex);
        } finally {
            try {
                //fileWriter.close();
                out.close();
            } catch (IOException ex) {
                logger.error("Finally FileWriter pada method ExportToExel", ex);
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
