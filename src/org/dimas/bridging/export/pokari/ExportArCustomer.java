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
import org.config.spring.hibernate.model.enumpokari.EnumBAllowToCredit;
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.config.spring.hibernate.model.pokari.OutputArCustomer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class ExportArCustomer {
    private static final Logger logger = LoggerFactory.getLogger(ExportArCustomer.class);
    
//    ApplicationContext appContext;
//    SysvarDaoInter sysvarDao;

    public ExportArCustomer() {
        initiates();
    }  
    
    public void initiates(){
//            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
//            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    }
    public List<OutputArCustomer> exportFromListToFileExelUsingTemplate(String filePathDestination, List<ArCustomer> lst){
        List<OutputArCustomer> list = new ArrayList<>();
        //FileWriter fileWriter = null;
        FileInputStream file = null;
        FileOutputStream out = null;
        
        logger.info("Starting exportFromListToFileExelUsingTemplate");
        
        try {
            /**
             * APACHE POI EXEL : Cuma bisa menggunakan OutputStream
             */
            file = new FileInputStream(new File(filePathDestination));

            /**
             * CREATE EXEL USING POI
             */
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheet("Ar_Customer");
            Cell cell = null;        
            
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            int lastRow= 0;
            for (ArCustomer obj: lst) {
                if (obj.getAllowTransfer()==true){
                        try {
                            lastRow++;     
                            
                            int bolAllowtoCredit = EnumBAllowToCredit.CASH.getIntCode();
                            if (obj.getbAllowToCredit() != null){
                                if (obj.getbAllowToCredit() == false){
                                    bolAllowtoCredit = EnumBAllowToCredit.CREDIT.getIntCode();
                                }
                            }

                            String strRegisterdate = "";
                            SimpleDateFormat sdfRegisterDate = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");
                            try {
                                strRegisterdate = sdfRegisterDate.format(obj.getDtmRegisterDate());
                            } catch (Exception ex){}

                            OutputArCustomer itemOut = new OutputArCustomer();
                            
                            Row dataRow = sheet.createRow(lastRow);
                            dataRow.createCell(0).setCellValue(obj.getSzCustomerId()); itemOut.setSzCustomerId(obj.getSzCustomerId());
                            dataRow.createCell(1).setCellValue(obj.getSzName()); itemOut.setSzName(obj.getSzName());
                            dataRow.createCell(2).setCellValue(obj.getSzAddress()); itemOut.setSzAddress(obj.getSzAddress());
                            dataRow.createCell(3).setCellValue(obj.getSzZipCode()); itemOut.setSzZipCode(obj.getSzZipCode());
                            dataRow.createCell(4).setCellValue(obj.getSzState()); itemOut.setSzState(obj.getSzState());
                            dataRow.createCell(5).setCellValue(obj.getSzCity()); itemOut.setSzCity(obj.getSzCity());
                            dataRow.createCell(6).setCellValue(obj.getSzDistrict()); itemOut.setSzDistrict(obj.getSzDistrict());
                            dataRow.createCell(7).setCellValue(obj.getSzPhone1()); itemOut.setSzPhone1(obj.getSzPhone1());
                            dataRow.createCell(8).setCellValue(obj.getSzPhone2()); itemOut.setSzPhone2(obj.getSzPhone2());
                            dataRow.createCell(9).setCellValue(obj.getSzFax()); itemOut.setSzFax(obj.getSzFax());
                            dataRow.createCell(10).setCellValue(obj.getSzContact()); itemOut.setSzContract(obj.getSzContact());
                            dataRow.createCell(11).setCellValue(obj.getSzEmail()); itemOut.setSzEmail(obj.getSzEmail());
                            dataRow.createCell(12).setCellValue(obj.getSzStatus()); itemOut.setSzStatus(obj.getSzStatus());
                            dataRow.createCell(13).setCellValue(obj.getSzDistrChannelId()); itemOut.setSzDistrChannelId(obj.getSzDistrChannelId());
                            dataRow.createCell(14).setCellValue(bolAllowtoCredit); itemOut.setbAllowToCredit(obj.getbAllowToCredit());
                            dataRow.createCell(15).setCellValue(obj.getDecLimitCredit()); itemOut.setDecLimitCredit(obj.getDecLimitCredit());
                            dataRow.createCell(16).setCellValue(obj.getSzPaymentTermId() + " Hari"); itemOut.setSzPaymentTermId(obj.getSzPaymentTermId() +" Hari");
                            dataRow.createCell(17).setCellValue(obj.getSzHirarchyId()); itemOut.setSzHirarchyId(obj.getSzHirarchyId());
                            dataRow.createCell(18).setCellValue(obj.getSzSalesTerritoryId()); itemOut.setSzSalesTerritoryId(obj.getSzSalesTerritoryId());
                            dataRow.createCell(19).setCellValue(obj.getSzEmployeeId()); itemOut.setSzEmployeeId(obj.getSzEmployeeId());
                            dataRow.createCell(20).setCellValue(obj.getSzCustomerGroupId()); itemOut.setSzCustomerGroupId(obj.getSzCustomerGroupId());
                            dataRow.createCell(21).setCellValue(obj.getSzNPWP()); itemOut.setSzNPWP(obj.getSzNPWP());
                            dataRow.createCell(22).setCellValue(strRegisterdate); itemOut.setDtmRegisterDate(obj.getDtmRegisterDate());
                            
                            //ADD TO LIST
                            list.add(itemOut);
                            
                        } catch(Exception ex){
                            logger.error("Salah " + obj.getSzCustomerId() + "\t" + obj.getSzName());
                            logger.error(ex.toString());
                        }
                }
            }
            
            file.close();
            out =new FileOutputStream(new File(filePathDestination));
            workbook.write(out);
            out.close();           
            
            System.out.println("exportFromListToFileExel written successfully..");            
            
        } catch (IOException ex) {
            logger.error("FileWriter pada method exportFromListToFileExel", ex);
        } finally {
            try {
//                fileWriter.close();
                
                out.close();
            } catch (IOException ex) {
                logger.error("Finally FileWriter pada method exportFromListToFileExel", ex);
            }
        }
        
        return list;                
    }    
    public List<OutputArCustomer> exportFromListToFileExel(String filePathDestination, List<ArCustomer> lst){
        List<OutputArCustomer> list = new ArrayList<>();
        //FileWriter fileWriter = null;
        FileOutputStream out = null;
        logger.info("Starting exportFromListToFileExel");
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
            data.put(1, new Object[] {"","", "", "", "", 
                "", "", "", "", "", "", 
                "", "", "", "", "", 
                "", "", "", "", 
                "", "", "", ""});
            data.put(2, new Object[] {"","szCustomerId", "szName", "szAddress", "szZipCode", 
                "szState", "szCity", "szDistrict", "szPhone1", "szPhone2", "szFax", 
                "szContact", "szEmail", "szStatus", "szDistrChannelId", "bAllowToCredit", 
                "decLimitCredit", "szPaymentTermId", "szHirarchyId", "szSalesTerritoryId", 
                "szEmployeeId", "szCustomerGroupId", "szNPWP", "dtmRegisterDate"});

            
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            int lastRow= 2;
            for (ArCustomer obj: lst) {
                lastRow++;
                
                int bolAllowtoCredit = EnumBAllowToCredit.CASH.getIntCode();
                if (obj.getbAllowToCredit() != null){
                    if (obj.getbAllowToCredit() == false){
                        bolAllowtoCredit = EnumBAllowToCredit.CREDIT.getIntCode();
                    }
                }
                
                String strRegisterdate = "";
                SimpleDateFormat sdfRegisterDate = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");
                try {
                    strRegisterdate = sdfRegisterDate.format(obj.getDtmRegisterDate());
                } catch (Exception ex){}
                
                try {
                    data.put(lastRow, new Object[] {"", obj.getSzCustomerId(), obj.getSzName(), obj.getSzAddress(), obj.getSzZipCode(), 
                        obj.getSzState(), obj.getSzCity(), obj.getSzDistrict(), obj.getSzPhone1(), obj.getSzPhone2(), obj.getSzFax(), 
                        obj.getSzContact(), obj.getSzEmail(), obj.getSzStatus(), obj.getSzDistrChannelId(), bolAllowtoCredit, 
                        obj.getDecLimitCredit(), obj.getSzPaymentTermId(), obj.getSzHirarchyId(), obj.getSzSalesTerritoryId(), 
                        obj.getSzEmployeeId(), obj.getSzCustomerGroupId(), obj.getSzNPWP(), strRegisterdate });
                } catch(Exception ex){
                    logger.error("Salah " + obj.getSzCustomerId() + "\t" + obj.getSzName());
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
            System.out.println("exportFromListToFileExel written successfully..");            
            
        } catch (IOException ex) {
            logger.error("FileWriter pada method exportFromListToFileExel", ex);
        } finally {
            try {
//                fileWriter.close();
                
                out.close();
            } catch (IOException ex) {
                logger.error("Finally FileWriter pada method exportFromListToFileExel", ex);
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
