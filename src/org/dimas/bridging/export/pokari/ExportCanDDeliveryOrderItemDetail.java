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
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDetail;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDetailPK;
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

    public List<OutputCanDDeliveryOrderItemDetail> exportFromListToFileExelUsingTemplate(String filePathDestination, List<JHeader> lst){
        List<OutputCanDDeliveryOrderItemDetail> list = new ArrayList<>();
        //FileWriter fileWriter = null;
        FileInputStream file = null;
        FileOutputStream out = null;
        logger.info("Starting export OutputCanDDeliveryOrderItemDetail");
        try {
            /**
             * APACHE POI EXEL : Cuma bisa menggunakan OutputStream
             */
            file = new FileInputStream(new File(filePathDestination));            
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheet("Template Can_DDeliveryOrderItem");
            Cell cell = null;        
//            data.put(2, new Object[] {"","szDocId", "shItemNumber", "szProductId", "decQty", "decPrice"});
            
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            int lastRow= 1;
              for (JHeader item: lst){
                    //PERSENTASE VOLUME DISKON
                    Double doubleDiskonAtasFakturPersen = (double)item.getDisAtasFaktur()/(double)item.getGross() * 100;

                    List<JPcode> lstDetail = new ArrayList<>(item.getJpcodeSet());
                    int itemNumber = 0;
                    for (JPcode itm: lstDetail){
                        try {
                            lastRow++;
                            
                            OutputCanDDeliveryOrderItemDetail itemOut = new OutputCanDDeliveryOrderItemDetail();
                            OutputCanDDeliveryOrderItemDetailPK itemOutPK = new OutputCanDDeliveryOrderItemDetailPK();
                            
                            Row dataRow = sheet.createRow(lastRow); 
                            dataRow.createCell(1).setCellValue(itm.getJpcodePK().getIdOrder()); itemOutPK.setSzDocId(itm.getJpcodePK().getIdOrder());
                            dataRow.createCell(2).setCellValue(itemNumber); itemOutPK.setShItemNumber(itemNumber);
                            dataRow.createCell(3).setCellValue(itm.getMappingProduct().getSzProductId()); itemOutPK.setSzProductId(itm.getMappingProduct().getSzProductId());
                            dataRow.createCell(4).setCellValue(itm.getQtyInSat()); itemOut.setDecQty(itm.getQtyInSat());
                            
                            //PERHITUNGAN NET DAN DISKON
                            Double doubleHargaNoPpn = Double.valueOf(String.valueOf(itm.getHargaNoPpn()));                            
                            Double grossValueFromNoPpn =  doubleHargaNoPpn ;
                            Double grossValueFromWithPpn = doubleHargaNoPpn + (doubleHargaNoPpn*0.1);
                                                        
                            Double doubleDiskonAtasFakturPecahan = (double)doubleDiskonAtasFakturPersen/100;
                            //OTOMATIS MINUS KARENA  itmJPcode.getHargaNoPpn() bernilai Plus atau Minus
                            Double doubleDiskonAtasFakturBarangTertentuRupiah = doubleDiskonAtasFakturPecahan * itm.getHargaNoPpn();
                            Integer intDiskonAtasFakturBarangTertentuRupiah = doubleDiskonAtasFakturBarangTertentuRupiah.intValue();                           
                            Integer intTotalDisc = intDiskonAtasFakturBarangTertentuRupiah;

                            Double doubleTotalDisc = (double) intTotalDisc;
                            Double doubleNetSalesNoPpn = grossValueFromNoPpn - doubleTotalDisc;
                            Double doubleNetSalesWithPpn = doubleNetSalesNoPpn + (doubleNetSalesNoPpn * 0.1);
                            
                            Integer intHrgJualPerPiece = itm.getHrgJualLsnNoPpn()/12;
                            Double doubleHrgJualPerPiece = intHrgJualPerPiece.doubleValue();
                            dataRow.createCell(5).setCellValue(intHrgJualPerPiece);  itemOut.setDecPrice(doubleHrgJualPerPiece);
                            
                            itemOut.setOutputCanDDeliveryOrderItemDetailPK(itemOutPK);
                            list.add(itemOut);
                            
                            itemNumber++;
                        } catch(Exception ex){                         
                            logger.error(ex.toString());
                        }
//                        data.put(lastRow, new Object[] {"","szDocId", "shItemNumber", "szProductId", "decQty", "decPrice"});
                        
                    }
              }
  
            file.close();
            out =new FileOutputStream(new File(filePathDestination));
            workbook.write(out);
            out.close();           
            
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
    
    public List<OutputCanDDeliveryOrderItemDetail> exportFromListToFileExel(String filePathDestination, List<JHeader> lst){
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
