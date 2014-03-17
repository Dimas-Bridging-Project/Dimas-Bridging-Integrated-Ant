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
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.JTpru;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDisc;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDiscPK;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class ExportCanDDeliveryOrderItemDisc {
    private static final Logger logger = LoggerFactory.getLogger(ExportCanDDeliveryOrderItemDisc.class);
    
//    ApplicationContext appContext;
//    SysvarDaoInter sysvarDao;

    public ExportCanDDeliveryOrderItemDisc() {
        initiates();
    }  
    
    public void initiates(){
//            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
//            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    }
      public List<OutputCanDDeliveryOrderItemDisc> exportFromListToFileExelUsingTemplate(String filePathDestination, List<JHeader> lst){
        List<OutputCanDDeliveryOrderItemDisc> list = new ArrayList<>();
        //FileWriter fileWriter = null;
        FileInputStream file = null;
        FileOutputStream out = null;
        logger.info("Starting OutputCanDDeliveryOrderItemDisc");
        try {
            file = new FileInputStream(new File(filePathDestination));            
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheet("Can_DDeliveryOrderItemDisc");
            Cell cell = null;                   
            
//            data.put(2, new Object[] {"","szDocId", "shItemNumber", "decDisc"});
            //printWriter.println("disticode,transdate,transno,outletcode,salesmancode,itemcode,quantity,uom,unitprice,fbonus,discamt1,discamt2,discamt3,discamt4,discamt5,discamt6,discitem,discitempct,discitemval,skuqty,nppnamt,totalsales"); 

            
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
              int lastRow= 1;
              for (JHeader item: lst){
                    
                    int itemNumber = 0;
                    List<JTprb> lstDetail = new ArrayList<>(item.getJtprbSet());
                    for (JTprb itm: lstDetail){
                        try {
                            lastRow++;
                            
                            OutputCanDDeliveryOrderItemDisc itemOut = new OutputCanDDeliveryOrderItemDisc();
                            OutputCanDDeliveryOrderItemDiscPK itemOutPK = new OutputCanDDeliveryOrderItemDiscPK();
                            
                            Row dataRow = sheet.createRow(lastRow);
                            dataRow.createCell(1).setCellValue(itm.getJtprbPK().getIdOrder()); itemOutPK.setSzDocId(itm.getJtprbPK().getIdOrder());
                            dataRow.createCell(2).setCellValue(itemNumber); itemOutPK.setShItemNumber(itemNumber);
                            dataRow.createCell(6).setCellValue(itm.getHargaNoPpn()); itemOut.setDecDisc(itm.getHargaNoPpn().doubleValue());
                            
                            itemOut.setOutputCanDDeliveryOrderItemDiscPK(itemOutPK);
                            list.add(itemOut);
                            
                            itemNumber ++;    
                        } catch(Exception ex){                         
                            logger.error(ex.toString());
                        }
//                        data.put(lastRow, new Object[] {"","szDocId", "shItemNumber", "decDisc"});
                    }
                    List<JTpru> lstDetail2 = new ArrayList<>(item.getJtpruSet());
                    for (JTpru itm: lstDetail2){
                        try {
                            lastRow++;
                            
                            OutputCanDDeliveryOrderItemDisc itemOut = new OutputCanDDeliveryOrderItemDisc();
                            OutputCanDDeliveryOrderItemDiscPK itemOutPK = new OutputCanDDeliveryOrderItemDiscPK();
                            
                            Row dataRow = sheet.createRow(lastRow);
                            dataRow.createCell(1).setCellValue(itm.getJtpruPK().getIdOrder()); itemOutPK.setSzDocId(itm.getJtpruPK().getIdOrder());                 
                            dataRow.createCell(2).setCellValue(itemNumber); itemOutPK.setShItemNumber(itemNumber);
                            dataRow.createCell(6).setCellValue(itm.getHargaNoPpn()); itemOut.setDecDisc(itm.getHargaNoPpn().doubleValue());
                            
                            itemOut.setOutputCanDDeliveryOrderItemDiscPK(itemOutPK);
                            list.add(itemOut);
                            
                            itemNumber++;    
                        } catch(Exception ex){                         
                            logger.error(ex.toString());
                        }
//                        data.put(lastRow, new Object[] {"","szDocId", "shItemNumber", "decDisc"});
                    }
                    
              }
            
            file.close();
            out =new FileOutputStream(new File(filePathDestination));
            workbook.write(out);
            out.close();     
            
            System.out.println("OutputCanDDeliveryOrderItemDisc written successfully..");            
            
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
  
    
    public List<OutputCanDDeliveryOrderItemDisc> exportFromListToFileExel(String filePathDestination, List<JHeader> lst){
        List<OutputCanDDeliveryOrderItemDisc> list = new ArrayList<>();
        //FileWriter fileWriter = null;
        FileOutputStream out = null;
        logger.info("Starting OutputCanDDeliveryOrderItemDisc");
        try {
            /**
             * APACHE POI EXEL : Cuma bisa menggunakan OutputStream
             */
            out = new FileOutputStream(new File(filePathDestination));
            

            /**
             * CREATE EXEL USING POI
             */
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("CanDDeliveryOrderItemDisc sheet");

            Map<Integer, Object[]> data = new HashMap<Integer, Object[]>();
            //CREATE HEADER
            data.put(1, new Object[] {"", "", "", ""});
            data.put(2, new Object[] {"","szDocId", "shItemNumber", "decDisc"});
            //printWriter.println("disticode,transdate,transno,outletcode,salesmancode,itemcode,quantity,uom,unitprice,fbonus,discamt1,discamt2,discamt3,discamt4,discamt5,discamt6,discitem,discitempct,discitemval,skuqty,nppnamt,totalsales"); 

            
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            /**
             * SORRY : WE DON'T USE THIS
             */
            
//            int lastRow= 2;
//            for (CanDDeliveryOrderItemDisc canDDeliveryOrderItemDisc: lst) {
//                lastRow++;
//                data.put(lastRow, new Object[] {"","szDocId", "shItemNumber", "decDisc"});
//            }
            
              int lastRow= 2;
              for (JHeader item: lst){

                    List<JPcode> lstDetail = new ArrayList<>(item.getJpcodeSet());
                    for (JPcode itm: lstDetail){
                        lastRow++;
                        data.put(lastRow, new Object[] {"","szDocId", "shItemNumber", "decDisc"});
                    }
              }
            
            
//                //System.out.println(sdf.format(tglTransaksi) + " == " + sdf.format(itm.getStockPK().getTangalStock()));                
//                if (sdf.format(tglTransaksi).equalsIgnoreCase(sdf.format(itmJHeader.getTanggal()))) {
//                    
//                    Integer intDiskonAtasFakturPersen = itmJHeader.getDisAtasFaktur()/itmJHeader.getGross() * 100;
//                    
//                    List<JPcode> listJPcode = new ArrayList<>(itmJHeader.getJpcodeSet());
//                    for (JPcode itmJPcode:listJPcode) {
//                        if (itmJPcode.getTipeFakturRetur().contains("F")) {
//                            
//                            //1. disticode,
//                            printWriter.print("\"" + distCode + "\",");
//                            //2. transdate,
//                            Date tglFaktur = itmJPcode.getJheader().getTanggal();
//                            String strTglFaktur =sdf.format(tglFaktur);                
//                            printWriter.print("" + strTglFaktur + ",");                        
//                            //3. transno,
//                            printWriter.print("\"" + itmJPcode.getJpcodePK().getIdOrder() + "\",");
//                            //3. outletcode,
//                            printWriter.print("\"" + itmJPcode.getJheader().gettMasterOutlet().getMslsoutCode() + "\",");
//                            //4. salesmancode,
//                            printWriter.print("\"" + itmJPcode.getJheader().gettMasterSalesman().getSalesIdSap() + "\",");
//                            //5. itemcode,
//                            printWriter.print("\"" + itmJPcode.gettMasterProduct().getPcodeSap() + "\",");        
//                            //6. quantity,
//                            String strQty = itmJPcode.getQtyInFib();
//                            if (strQty==null) {
//                                strQty = "0";
//                            } else if (strQty.trim().equals("")) {
//                                strQty = "0";
//                            }
//                            int posisiDot = strQty.indexOf(".");
//                            String strQtyKarton="";
//                            if (posisiDot==-1) {
//                                strQtyKarton = strQty;
//                            } else {
//                                strQtyKarton = strQty.substring(0, strQty.indexOf("."));                            
//                            }
//                            Integer intQtyKarton = Integer.parseInt(strQtyKarton);
//                            printWriter.print("" + intQtyKarton + ",");
//                            //7. uom,
//                            printWriter.print("\"" + "KRT" + "\","); //Semuanya bagian ini pakai karton
//                            //8. unitprice,
//                            printWriter.print("" + itmJPcode.getHrgJualKartonNoPpn() + ",");
//                           
//                            //9. fbonus,
//                            Boolean bolBonus = itmJPcode.gettMasterProduct().getBonus()!=null?itmJPcode.gettMasterProduct().getBonus():false;
//                            Integer intBonus = bolBonus==true?1:0;
//                            printWriter.print("" + intBonus + ",");
//                            //10. discamt,
//                            Integer intPersenDiskon = 0;
//                            Integer diskonUang = 0;
//                            List<JTpru> listJTpru = new ArrayList<>();
//                            if (databaseMode ==true) { 
//                                listJTpru = jtpruDao.findAllByIdOrderAndPcode(itmJPcode.getJpcodePK().getIdOrder(), itmJPcode.getJpcodePK().getPcode());
//                            }else {
//                                listJTpru = jtpruDaoMem.findAllByIdOrderAndPcode(itmJPcode.getJpcodePK().getIdOrder(), itmJPcode.getJpcodePK().getPcode());
//                            }
//                            for (JTpru itemJTpru: listJTpru) {
//                                diskonUang += itemJTpru.getHargaNoPpn();
//                            }
//                            // Persen diskon pada barang sama dengan diskon uang pada barang
//                            intPersenDiskon = (diskonUang/itmJPcode.getHargaNoPpn())*100;      
//                            printWriter.print("" + intPersenDiskon + ",");
//                            //11. discamt2,
//                            printWriter.print("" + intDiskonAtasFakturPersen + ",");
//                            //12. discamt3,
//                            printWriter.print("" + "0" + ",");
//                            //13. discamt4,
//                            printWriter.print("" + "0" + ",");
//                            //14. discamt5,
//                            printWriter.print("" + "0" + ",");
//                            //15. discamt6,
//                            printWriter.print("" + "0" + ",");
//                            //16. discitem,
//                            printWriter.print("" + "0" + ",");
//                            //17. discitempct,
//                            Integer intTotalDiskonAmountPersen = intPersenDiskon + intDiskonAtasFakturPersen;
//                            Integer intTotalDiskonAmountRupiah = (intTotalDiskonAmountPersen/100) * itmJPcode.getHargaNoPpn();
//                            printWriter.print("" + intTotalDiskonAmountPersen + ",");
//                            //18. discitemval,
//                            printWriter.print("" + intTotalDiskonAmountRupiah + ",");
//                            //19. skuqty,
//                            printWriter.print("" + itmJPcode.getQtyInSat() + ",");                            
//                            //20. nppnamt,
//                            Integer intTotalSalesNoPpnWithDiskon = itmJPcode.getHargaNoPpn()- intTotalDiskonAmountRupiah;                            
//                            Double doubleNppAmt = intTotalSalesNoPpnWithDiskon * 0.01;
//                            Integer intNppAmt = doubleNppAmt.intValue();
//                            Integer intTotalSalesWithPpnWithDiskon = intTotalSalesNoPpnWithDiskon + intNppAmt;
//                            
//                            printWriter.print("" + intNppAmt + ",");
//                            //21. totalsales           
//                            printWriter.print("" + intTotalSalesWithPpnWithDiskon + "");
//
//                            //TurunBaris
//                            printWriter.println();
//
//                            //Untuk Isi List
//                            TDatdsl item = new TDatdsl();
//                            TDatdslPK tDatdslPK = new TDatdslPK();
//                            tDatdslPK.setTransNo(itmJPcode.getJpcodePK().getIdOrder());
//                            tDatdslPK.setItemCode(itmJPcode.gettMasterProduct().getPcodeSap());
//                            item.setTdatdslPK(tDatdslPK);
//                            
//                            item.setTransDate(itmJPcode.getJheader().getTanggal());
//                            item.setDistiCode(distCode);
//                            item.setOutletCode(itmJPcode.getJheader().gettMasterOutlet().getMslsoutCode());
//                            item.setSalesmanCode(itmJPcode.getJheader().gettMasterSalesman().getSalesIdSap());
//                            
//                            item.setQuantity(intQtyKarton);
//                            item.setUom1("KRT");                            
//                            item.setUnitPrice(itmJPcode.getHrgJualKartonNoPpn());
//                            item.setFbonus(bolBonus);
//
//                            item.setDiscAmt1(intPersenDiskon);
//                            item.setDiscAmt2(intDiskonAtasFakturPersen);
//                            item.setDiscAmt3(0);
//                            item.setDiscAmt4(0);
//                            item.setDiscAmt5(0);
//                            item.setDiscAmt6(0);
//                            item.setDiscItem(0);
//                            item.setDiscItemPct(intTotalDiskonAmountPersen);
//                            item.setDiscItemVal(intTotalDiskonAmountRupiah);
//                            
//                            item.setSkuQty(itmJPcode.getQtyInSat());
//                            item.setNppnAmt(intNppAmt);
//                            item.setTotalSales(intTotalSalesWithPpnWithDiskon);
//                            
//                            list.add(item);
//                        }
//                    }    
//                    //KHUSUS JTPRB
//                    //TPRB --> NILAI BARANG LANGSUNG DIKOSONGI
//                    List<JTprb> listJTprb = new ArrayList<>(itmJHeader.getJtprbSet());
//                    for (JTprb itmJTprb:listJTprb) {
//                        if (itmJTprb.getTipeFakturRetur().contains("F")) {
//                            //1. disticode,
//                            printWriter.print("\"" + distCode + "\",");
//                            //2. transdate,
//                            Date tglFaktur = itmJTprb.getJheader().getTanggal();
//                            String strTglFaktur =sdf.format(tglFaktur);                
//                            printWriter.print("\"" + strTglFaktur + "\",");                        
//                            //3. transno,
//                            printWriter.print("\"" + itmJTprb.getJtprbPK().getIdOrder() + "\",");
//                            //3. outletcode,
//                            printWriter.print("\"" + itmJTprb.getJheader().gettMasterOutlet().getMslsoutCode() + "\",");
//                            //4. salesmancode,
//                            printWriter.print("\"" + itmJTprb.getJheader().gettMasterSalesman().getSalesIdSap() + "\",");
//                            //5. itemcode,
//                            printWriter.print("\"" + itmJTprb.gettMasterProduct().getPcodeSap() + "\",");        
//                            //6. quantity,
//                            String strQty = itmJTprb.getQtyInFib();
//                            if (strQty==null) {
//                                strQty = "0";
//                            } else if (strQty.trim().equals("")) {
//                                strQty = "0";
//                            }
//                            int posisiDot = strQty.indexOf(".");
//                            String strQtyKarton="";
//                            if (posisiDot==-1) {
//                                strQtyKarton = strQty;
//                            } else {
//                                strQtyKarton = strQty.substring(0, strQty.indexOf("."));                            
//                            }
//                            Integer intQtyKarton = Integer.parseInt(strQtyKarton);
//                            printWriter.print("\"" + intQtyKarton + "\",");
//                            //7. uom,
//                            printWriter.print("\"" + "KRT" + "\","); //Semuanya bagian ini pakai karton
//                            //8. unitprice,
//                            printWriter.print("\"" + itmJTprb.getHrgJualKartonNoPpn() + "\",");
//                           
//                            //9. fbonus,
//                            //Boolean bolBonus = itmJTprb.gettMasterProduct().getBonus()!=null?itmJTprb.gettMasterProduct().getBonus():false;
//                            //Integer intBonus = bolBonus==true?1:0;
//                            //Khusus untuk JTprb >> semua barang dianggap bonus
//                            Boolean bolBonus = true;
//                            Integer intBonus = 1; 
//                            printWriter.print("\"" + intBonus + "\",");
//                            //10. discamt,
//                            Integer intPersenDiskon = 0;
//                            int diskonUang = 0;
//                            /*
//                            List<JTpru> listJTpru = jtpruDao.findAllByIdOrderAndPcode(itmJPcode.getJpcodePK().getIdOrder(), itmJPcode.getJpcodePK().getPcode());
//                            for (JTpru itemJTpru: listJTpru) {
//                                diskonUang += itemJTpru.getHargaNoPpn();
//                            }
//                            */ 
//                            printWriter.print("\"" + intPersenDiskon + "\",");
//                            //11. discamt2,
//                            printWriter.print("\"" + "0" + "\",");
//                            //12. discamt3,
//                            printWriter.print("\"" + "0" + "\",");
//                            //13. discamt4,
//                            printWriter.print("\"" + "0" + "\",");
//                            //14. discamt5,
//                            printWriter.print("\"" + "0" + "\",");
//                            //15. discamt6,
//                            printWriter.print("\"" + "0" + "\",");
//                            //16. discitem,
//                            printWriter.print("\"" + "0" + "\",");
//                            //17. discitempct,
//                            printWriter.print("\"" + "0" + "\",");
//                            //18. discitemval,
//                            printWriter.print("\"" + "0" + "\",");
//                            //19. skuqty,
//                            printWriter.print("\"" + itmJTprb.getQtyInSat() + "\",");                            
//                            //20. nppnamt,
//                            //Harusnya NOL >> GAK JUGA >> Jika barang itu Beli Loreal 10 dapat 1 maka >> 1 sebagai bonus ada nilainya yang akan mengurangi                                                        
//                            Integer intNppAmt = 0; // --> Langsung di Nol kan saja                                                         
//                            printWriter.print("\"" + intNppAmt + "\",");
//                            //21. totalsales           
//                            Integer intTotalSalesWithPpnWithDiskon = 0;  // --> Langsung di Nol kan saja
//                            printWriter.print("\"" + intTotalSalesWithPpnWithDiskon + "\"");
//
//                            //TurunBaris
//                            printWriter.println();
//
//                            //Untuk Isi List
//                            TDatdsl item = new TDatdsl();
//                            TDatdslPK tDatdslPK = new TDatdslPK();
//                            tDatdslPK.setTransNo(itmJTprb.getJtprbPK().getIdOrder());
//                            tDatdslPK.setItemCode(itmJTprb.gettMasterProduct().getPcodeSap());
//                            item.setTdatdslPK(tDatdslPK);
//                            
//                            item.setTransDate(itmJTprb.getJheader().getTanggal());
//                            item.setDistiCode(distCode);
//                            item.setOutletCode(itmJTprb.getJheader().gettMasterOutlet().getMslsoutCode());
//                            item.setSalesmanCode(itmJTprb.getJheader().gettMasterSalesman().getSalesIdSap());
//                            
//                            item.setQuantity(intQtyKarton);
//                            item.setUom1("KRT");                            
//                            item.setUnitPrice(itmJTprb.getHrgJualKartonNoPpn());
//                            item.setFbonus(bolBonus);
//
//                            item.setDiscAmt1(intPersenDiskon);
//                            item.setDiscAmt2(0);
//                            item.setDiscAmt3(0);
//                            item.setDiscAmt4(0);
//                            item.setDiscAmt5(0);
//                            item.setDiscAmt6(0);
//                            item.setDiscItem(0);
//                            item.setDiscItemPct(0);
//                            item.setDiscItemVal(0);
//                            
//                            item.setSkuQty(itmJTprb.getQtyInSat());
//                            item.setNppnAmt(intNppAmt);
//                            item.setTotalSales(intTotalSalesWithPpnWithDiskon);
//                            
//                            list.add(item);
//                        }
//                    }    
//                    
//                }
//                
  
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
            System.out.println("OutputCanDDeliveryOrderItemDisc written successfully..");            
            
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
