/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.export.pokari;

import org.dimas.bridging.export.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.out;
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
import org.config.spring.hibernate.model.pokari.OutputSpEmployee;
import org.config.spring.hibernate.model.pokari.SpEmployee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class ExportSpEmployee {
    private static final Logger logger = LoggerFactory.getLogger(ExportSpEmployee.class);
    
//    ApplicationContext appContext;
//    SysvarDaoInter sysvarDao;

    public ExportSpEmployee() {
        initiates();
    }  
    
    public void initiates(){
//            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
//            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    }
    
    public List<OutputSpEmployee> exportFromListToFileExelUsingTemplate(String filePathDestination, List<SpEmployee> lst){
        List<OutputSpEmployee> list = new ArrayList<>();
        //FileWriter fileWriter = null;
        FileInputStream file = null;
        logger.info("Starting export OutputSpEmployee " + filePathDestination);
        try {
            file = new FileInputStream(new File(filePathDestination));            
            
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheet("Template Sp_Employee");
            Cell cell = null;                   
        
            
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            int lastRow= 1;
            for (SpEmployee obj: lst) {
//                if (obj.getAllowTransfer()==true){                
                        try {
                            lastRow++;
                            OutputSpEmployee itemOut = new OutputSpEmployee();
                            
                            Row dataRow = sheet.createRow(lastRow);
                            dataRow.createCell(1).setCellValue(obj.getSzEmployeeId()); itemOut.setSzEmployeeId(obj.getSzEmployeeId());
                            dataRow.createCell(2).setCellValue(obj.getSzName()); itemOut.setSzName(obj.getSzName());
                            dataRow.createCell(3).setCellValue(obj.getSzWorkplaceId()); itemOut.setSzWorkplaceId(obj.getSzWorkplaceId());
                            dataRow.createCell(4).setCellValue(obj.getSzSalesType()); itemOut.setSzSalesType(obj.getSzSalesType());
                            dataRow.createCell(5).setCellValue(obj.getSzSalesGroup()); itemOut.setSzSalesGroup(obj.getSzSalesGroup());
                            dataRow.createCell(6).setCellValue(obj.getSzTeamId()); itemOut.setSzTeamId(obj.getSzTeamId());
                            dataRow.createCell(7).setCellValue(obj.getSzVehicleId()); itemOut.setSzVehicleId(obj.getSzVehicleId());
                            dataRow.createCell(8).setCellValue(obj.getSzVehicleName()); itemOut.setSzVehicleName(obj.getSzVehicleName());
                            dataRow.createCell(9).setCellValue(obj.getSzPoliceNo()); itemOut.setSzPoliceNo(obj.getSzPoliceNo());
                            
                            list.add(itemOut);
                        } catch(Exception ex){
                            logger.error("exportFromListToFileExelUsingTemplate " );
                        }
                }
                

//            }
            
            file.close();
            FileOutputStream out =new FileOutputStream(new File(filePathDestination));
            workbook.write(out);
            out.close();           
            
            System.out.println("OutputSpEmployee Excel written successfully..");            
            
        } catch (IOException ex) {
            logger.error("FileWriter pada method ExportToExel", ex);
        } finally {
            try {
                //fileWriter.close();
                out.close();
            } catch (Exception ex) {
                logger.error("Finally FileWriter pada method ExportToExel", ex);
            }
        }
        
        return list;                
    }
    
    public List<OutputSpEmployee> exportFromListToFileExel(String filePathDestination, List<SpEmployee> lst){
        List<OutputSpEmployee> list = new ArrayList<>();
        //FileWriter fileWriter = null;
        FileOutputStream out = null;
        logger.info("Starting export OutputSpEmployee");
        try {
//            File filePath = new File(filePathDestination);
//            fileWriter = new FileWriter(filePath);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            /**
             * APACHE POI EXEL : Cuma bisa menggunakan OutputStream
             */
            out = new FileOutputStream(new File(filePathDestination));
            
            //Seragam Distributor Code Pake Parameter Sistem
//            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();
//            String distName = sysvarDao.findById("_DIST_NAME").getNilaiString1();

            /**
             * CREATE EXEL USING POI
             */
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("SpEmployee sheet");

            Map<Integer, Object[]> data = new HashMap<Integer, Object[]>();
            //CREATE HEADER
            data.put(1, new Object[] {"", "", "", "", "", "", 
                "", "", "", ""});
            data.put(2, new Object[] {"","szEmployeeId", "szName", "szWorkplaceId", "szSalesType", "szSalesGroup", 
                "szTeamId", "szVehicleId", "szVehicleName", "szPoliceNo"});
            //printWriter.println("disticode,transdate,transno,outletcode,salesmancode,itemcode,quantity,uom,unitprice,fbonus,discamt1,discamt2,discamt3,discamt4,discamt5,discamt6,discitem,discitempct,discitemval,skuqty,nppnamt,totalsales"); 

            
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            int lastRow= 2;
            for (SpEmployee spEmployee: lst) {
                lastRow++;
                data.put(lastRow, new Object[] {"",spEmployee.getSzEmployeeId(), spEmployee.getSzName(), 
                spEmployee.getSzWorkplaceId(), spEmployee.getSzSalesType(), spEmployee.getSzSalesGroup(), 
                spEmployee.getSzTeamId(), spEmployee.getSzVehicleId(), spEmployee.getSzVehicleName(), 
                spEmployee.getSzPoliceNo()});
                
                /**
                 * TAMBAH ROW KEBAWAH
                 */
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
            System.out.println("OutputSpEmployee Excel written successfully..");            
            
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
