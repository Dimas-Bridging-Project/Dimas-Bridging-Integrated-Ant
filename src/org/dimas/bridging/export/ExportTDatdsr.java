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
import org.config.spring.hibernate.dao.JTprbDaoInter;
import org.config.spring.hibernate.dao.JTpruDaoInter;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.JTpru;
import org.config.spring.hibernate.model.TDatdsr;
import org.config.spring.hibernate.model.TDatdsrPK;
import org.config.spring.provider.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */

public class ExportTDatdsr {
    private static final Logger logger = LoggerFactory.getLogger(ExportTDatdsr.class);
    
    ApplicationContext appContext=ApplicationContextProvider.getInstance().getApplicationContext();
    ApplicationContext appContextMem=ApplicationContextProvider.getInstance().getApplicationContextMem();
    SysvarDaoInter sysvarDao=(SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    
    JTprbDaoInter jtprbDao= (JTprbDaoInter) appContext.getBean("JTprbDaoBean");
    JTpruDaoInter jtpruDao=(JTpruDaoInter) appContext.getBean("JTpruDaoBean");
    JTprbDaoInter jtprbDaoMem= (JTprbDaoInter) appContextMem.getBean("JTprbDaoBean");
    JTpruDaoInter jtpruDaoMem= (JTpruDaoInter) appContextMem.getBean("JTpruDaoBean");

    public ExportTDatdsr() {
        initiates();
    }    
    public void initiates(){
    }
    
    public List<TDatdsr> exportToCsvFromListToFile(String filePathDestination, Date tglTransaksi, List<JHeader> lst, 
            Boolean databaseMode){
        List<TDatdsr> list = new ArrayList<>();
        FileWriter fileWriter = null;
        logger.info("Starting export TDatdsr");
        try {
            File filePath = new File(filePathDestination);
            fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            //Seragam Distributor Code Pake Parameter Sistem
            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();
            String distName = sysvarDao.findById("_DIST_NAME").getNilaiString1();

            //Header
            printWriter.println("disticode,transdate,transno,outletcode,salesmancode,itemcode,quantity,uom,unitprice,skuqty,nppnamt,totalsales,fbonus"); 
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            for (JHeader itmJHeader: lst) {
                //System.out.println(sdf.format(tglTransaksi) + " == " + sdf.format(itm.getStockPK().getTangalStock()));                
                if (sdf.format(tglTransaksi).equalsIgnoreCase(sdf.format(itmJHeader.getTanggal()))) {

                    Integer intDiskonAtasFakturPersen = itmJHeader.getDisAtasFaktur()/itmJHeader.getGross() * 100;
                
                    List<JPcode> listJPcode = new ArrayList<>(itmJHeader.getJpcodeSet());
                    for (JPcode itmJPcode:listJPcode) {
                        if (itmJPcode.getTipeFakturRetur().contains("R")) {
                            //1. disticode,
                            printWriter.print("\"" + distCode + "\",");
                            //2. transdate,
                            Date tglRetur = itmJPcode.getJheader().getTanggal();
                            String strTglRetur =sdf.format(tglRetur);                
                            printWriter.print("" + strTglRetur + ",");
                            //3. transno,
                            printWriter.print("\"" + itmJPcode.getJpcodePK().getIdOrder()  + "\",");
                            //4. outletcode,
                            printWriter.print("\"" + itmJPcode.getJheader().gettMasterOutlet().getMslsoutCode() + "\",");
                            //5. salesmancode,
                            printWriter.print("\"" + itmJPcode.getJheader().gettMasterSalesman().getSalesIdSap() + "\",");
                            //6. itemcode,
                            printWriter.print("\"" + itmJPcode.gettMasterProduct().getPcodeSap() + "\",");
                           
                            //7. quantity,
                            String strQty = itmJPcode.getQtyInFib();
                            if (strQty==null) {
                                strQty = "0";
                            } else if (strQty.trim().equals("")) {
                                strQty = "0";
                            }
                            int posisiDot = strQty.indexOf(".");
                            String strQtyKarton="";
                            if (posisiDot==-1) {
                                strQtyKarton = strQty;
                            } else {
                                strQtyKarton = strQty.substring(0, strQty.indexOf("."));                            
                            }
                            Integer intQtyKarton = Integer.parseInt(strQtyKarton);
                            printWriter.print("" + intQtyKarton + ",");                            
                            //8. uom,
                            printWriter.print("\"" + "KRT" + "\","); //Satuan terbesar artinya semua sama karton
                            //9. unitprice,
                            printWriter.print("" + itmJPcode.getHrgJualKartonNoPpn() + ",");
                            //10. skuqty,
                            printWriter.print("" + itmJPcode.getQtyInSat() + ",");
                            
                            //11. nppnamt,
                            Integer intPersenDiskon = 0;
                            Integer diskonUang = 0;
                            List<JTpru> listJTpru = new ArrayList<>();
                            if (databaseMode ==true) { 
                                listJTpru = jtpruDao.findAllByIdOrderAndPcode(itmJPcode.getJpcodePK().getIdOrder(), itmJPcode.getJpcodePK().getPcode());
                            }else {
                                listJTpru = jtpruDaoMem.findAllByIdOrderAndPcode(itmJPcode.getJpcodePK().getIdOrder(), itmJPcode.getJpcodePK().getPcode());
                            }
                            for (JTpru itemJTpru: listJTpru) {
                                diskonUang += itemJTpru.getHargaNoPpn();
                            }
                            // Persen diskon pada barang sama dengan diskon uang pada barang
                            intPersenDiskon = (diskonUang/itmJPcode.getHargaNoPpn())*100;                             
                            
                            Integer intTotalDiskonAmountPersen = intPersenDiskon + intDiskonAtasFakturPersen;
                            Integer intTotalDiskonAmountRupiah = (intTotalDiskonAmountPersen/100) * itmJPcode.getHargaNoPpn();
                            
                            Integer intTotalSalesNoPpnWithDiskon = itmJPcode.getHargaNoPpn()- intTotalDiskonAmountRupiah;
                            Double doubleNppAmt = intTotalSalesNoPpnWithDiskon * 0.01;
                            Integer intNppAmt = doubleNppAmt.intValue();
                            Integer intTotalSalesWithPpnWithDiskon = intTotalSalesNoPpnWithDiskon + intNppAmt;
                            
                            printWriter.print("" + intNppAmt + ",");
                            //12. totalsales,
                            printWriter.print("" + intTotalSalesWithPpnWithDiskon + "");
                            //13. fbonus
                            Boolean bolBonus = itmJPcode.gettMasterProduct().getBonus()!=null?itmJPcode.gettMasterProduct().getBonus():false;
                            Integer intBonus = bolBonus==true?1:0;
                            printWriter.print("" + intBonus + "");

                            //TurunBaris
                            printWriter.println();

                            //Untuk Isi List
                            TDatdsr item = new TDatdsr();    
                            TDatdsrPK tDatdsrPK = new TDatdsrPK();
                            tDatdsrPK.setItemCode(itmJPcode.gettMasterProduct().getPcodeSap());
                            tDatdsrPK.setTransNo(itmJPcode.getJpcodePK().getIdOrder());
                            item.setTdatdsrPK(tDatdsrPK);
                            
                            item.setTransDate(itmJPcode.getJheader().getTanggal());
                            item.setDistiCode(distCode);
                            item.setOutletCode(itmJPcode.getJheader().gettMasterOutlet().getMslsoutCode());
                            item.setSalesmanCode(itmJPcode.getJheader().gettMasterSalesman().getSalesIdSap());
                            
                            item.setQuantity(intQtyKarton);
                            item.setUom1("KRT");                            
                            item.setUnitPrice(itmJPcode.getHrgJualKartonNoPpn());
                            item.setFbonus(bolBonus);

                            item.setSkuQty(itmJPcode.getQtyInSat());
                            item.setNppnAmt(intNppAmt);
                            item.setTotalSales(intTotalSalesWithPpnWithDiskon);
                            
                            list.add(item);
                        }                                                
                    }

                    //TPRB --> NILAI BARANG LANGSUNG DIKOSONGI
                    List<JTprb> listJTprb = new ArrayList<>(itmJHeader.getJtprbSet());
                    for (JTprb itmJTprb:listJTprb) {
                        if (itmJTprb.getTipeFakturRetur().contains("R")) {
                            //1. disticode,
                            printWriter.print("\"" + distCode + "\",");
                            //2. transdate,
                            Date tglRetur = itmJTprb.getJheader().getTanggal();
                            String strTglRetur =sdf.format(tglRetur);                
                            printWriter.print("\"" + strTglRetur + "\",");
                            //3. transno,
                            printWriter.print("\"" + itmJTprb.getJtprbPK().getIdOrder()  + "\",");
                            //4. outletcode,
                            printWriter.print("\"" + itmJTprb.getJheader().gettMasterOutlet().getMslsoutCode() + "\",");
                            //5. salesmancode,
                            printWriter.print("\"" + itmJTprb.getJheader().gettMasterSalesman().getSalesIdSap() + "\",");
                            //6. itemcode,
                            printWriter.print("\"" + itmJTprb.gettMasterProduct().getPcodeSap() + "\",");
                           
                            //7. quantity,
                            String strQty = itmJTprb.getQtyInFib();
                            if (strQty==null) {
                                strQty = "0";
                            } else if (strQty.trim().equals("")) {
                                strQty = "0";
                            }
                            int posisiDot = strQty.indexOf(".");
                            String strQtyKarton="";
                            if (posisiDot==-1) {
                                strQtyKarton = strQty;
                            } else {
                                strQtyKarton = strQty.substring(0, strQty.indexOf("."));                            
                            }
                            Integer intQtyKarton = Integer.parseInt(strQtyKarton);
                            printWriter.print("\"" + intQtyKarton + "\",");                            
                            //8. uom,
                            printWriter.print("\"" + "KRT" + "\","); //Satuan terbesar artinya semua sama karton
                            //9. unitprice,
                            printWriter.print("\"" + itmJTprb.getHrgJualKartonNoPpn() + "\",");
                            //10. skuqty,
                            printWriter.print("\"" + itmJTprb.getQtyInSat() + "\",");
                            //11. nppnamt,
                            Integer intNppAmt = 0; // --> Langsung dikosongkan
                            printWriter.print("\"" + intNppAmt + "\",");
                            //12. totalsales,
                            Integer intTotalSales = 0; // --> Langsung dikosongkan
                            printWriter.print("\"" + intTotalSales + "\"");
                            //13. fbonus
                            //Khusus untuk JTprb >> semua barang dianggap bonus
                            Boolean bolBonus = true;
                            Integer intBonus = 1; 
                            printWriter.print("\"" + intBonus + "\"");

                            //TurunBaris
                            printWriter.println();

                            //Untuk Isi List
                            TDatdsr item = new TDatdsr();    
                            TDatdsrPK tDatdsrPK = new TDatdsrPK();
                            tDatdsrPK.setItemCode(itmJTprb.gettMasterProduct().getPcodeSap());
                            tDatdsrPK.setTransNo(itmJTprb.getJtprbPK().getIdOrder());
                            item.setTdatdsrPK(tDatdsrPK);
                            
                            item.setTransDate(itmJTprb.getJheader().getTanggal());
                            item.setDistiCode(distCode);
                            item.setOutletCode(itmJTprb.getJheader().gettMasterOutlet().getMslsoutCode());
                            item.setSalesmanCode(itmJTprb.getJheader().gettMasterSalesman().getSalesIdSap());
                            
                            item.setQuantity(intQtyKarton);
                            item.setUom1("KRT");                            
                            item.setUnitPrice(itmJTprb.getHrgJualKartonNoPpn());
                            item.setFbonus(bolBonus);

                            item.setSkuQty(itmJTprb.getQtyInSat());
                            item.setNppnAmt(intNppAmt);
                            item.setTotalSales(intTotalSales);
                            
                            list.add(item);
                        }
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
    public int exportToCsvFromDbToFile(String filePathDestination){
    
        return 0;
    }
    public int exportToCsvFromFileToDb(String filePathSource, String filePathDestination){
        return 0;
    }
    
    
    public static void main(String [] args){
        ExportTDatdsr f = new ExportTDatdsr();
    
    }
    
}
