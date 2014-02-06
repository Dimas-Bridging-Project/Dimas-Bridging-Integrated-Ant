/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.retrieve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.config.spring.hibernate.dao.ProdukDaoInter;
import org.config.spring.hibernate.model.Produk;
import org.config.spring.hibernate.model.ScyReturPabrikItem;
import org.config.spring.hibernate.model.ScyReturPabrikItemPK;
import org.config.spring.provider.ApplicationContextProvider;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ParseReturKePabrik {
    private static final Logger logger = LoggerFactory.getLogger(ParseReturKePabrik.class);
    BridgingController controller;
    
    public ParseReturKePabrik(BridgingController controller){
        this.controller = controller;
    }
    
//    ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContextMem();
//    ProdukDaoInter produkDao = (ProdukDaoInter) appContext.getBean("ProdukDaoBean");
    
    public List<ScyReturPabrikItem> parseReturKePabrik(String strFilePath, String principal){
         //System.out.println("Parsing Barang Datang >> Starting");
         logger.info("Parse Retur Ke Pabrik >> Starting");
         
         Reader readerFile = null;
         List<ScyReturPabrikItem> lst = new ArrayList<>();
         
        try {
            File filePath = new File(strFilePath);
            readerFile = new FileReader(filePath);
            BufferedReader bufReadFile = new BufferedReader(readerFile);
            String readByte;
            int pencacah =0;
            //Inisialisasi HEADER yang akan diubah-ubah secara periodik/Tidak selalu berubah-ubah
            Date tglRetur = null ;          
            Date tglJTempo = null;
            Date tglTerima = null;
            Date tglKirim = null;
            String noRetur = ""; String noDokumen=""; String noKirim="";
            while ((readByte = bufReadFile.readLine()) !=null) {
               String data = readByte;
                                   
               //Menentukan Header yang tidak selalu berubah-ubah 
               //1. Header NoDokumen >> Panjang baris seharusnya 84 (toleransi 3)
               if (data.trim().length()>=82 && data.trim().length()<=86) {
                   if (data.substring(0, 10).equals("No.Retur :")) {
                       noRetur = data.substring(10, 18).trim(); //Ditambah 2 digit sebagai toleransi
                   }
                   if (data.substring(46, 56).equals("NoDokumen:")) {
                       noDokumen = data.substring(56, 62).trim();//Ditambah 2 digit sebagai toleransi
                   }
                   if (data.substring(69, 78).equals("No.Kirim:")) {
                       noKirim = data.substring(78, 86).trim();//Ditambah 2 digit sebagai toleransi
                   }
                   
               }
               //2. Header Tanggal >> Panjang baris seharusnya 88 (toleransi 1)
               if (data.trim().length()>=78 && data.trim().length()<=90) {
                   Locale localeId = new Locale("in", "ID"); //Localization Indonesian
                    //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
                   String pattern = "dd MMM yyyy"; // 10 Sep 2013            
                   SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
                   //SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
                   
                   if (data.substring(0, 10).trim().equals("TglFaktur:")) {
                       String strTanggal = data.substring(10, 21).trim();//Ditambah 2 digit sebagai toleransi
                       try {
                            if (! strTanggal.trim().equals(""))
                                tglRetur = sdf.parse(strTanggal);      
                        } catch (ParseException ex) {
                            logger.error("error Format tanggal Faktur", ex);
                        }
                   }
                  /* SEMENTARA TIDAK PAKE TANGGAL-TANGGALAN */
                   if (data.substring(23, 33).equals("TglJTempo:")) {
                       String strTanggal = data.substring(33, 44).trim();
                        try {
                            if (! strTanggal.trim().equals(""))
                                tglJTempo = sdf.parse(strTanggal);      
                        } catch (ParseException ex) {
                            logger.error("error Format tanggal JTempo", ex);
                        }
                   }
                   if (data.substring(46, 56).equals("TglTerima:")) {
                       String strTanggal = data.substring(56, 67).trim();
                        try {
                            if (! strTanggal.trim().equals(""))
                                tglTerima = sdf.parse(strTanggal);      
                        } catch (ParseException ex) {
                            logger.error("error Format tanggal Terima", ex);
                        }
                   }
                   if (data.substring(69, 78).equals("TglKirim:")) {
                       String strTanggal = data.substring(78, 89).trim();//Ditambah 2 digit sebagai toleransi
                        try {
                            if (! strTanggal.trim().equals(""))
                                tglKirim = sdf.parse(strTanggal);      
                        } catch (ParseException ex) {
                            logger.error("error Format tanggal Kirim", ex);
                        }
                   }
                                       
               }        
               
               //System.out.println(tglRetur);
               //Menentukan Item/Detil >> Panjang baris seharusnya 94 (toleransi 2) >> Hanya bagian ini yang akan disimpan
               if (data.trim().length()>=92 && data.trim().length()<=96) {
                   if (data.substring(0, 5).trim().length()>3){
                    if (! (data.substring(0, 5).equals("PCODE") || data.substring(0, 5).equals("-----"))){
                        
                        ScyReturPabrikItem item = new ScyReturPabrikItem();
                        ScyReturPabrikItemPK scyReturPabrikPK = new ScyReturPabrikItemPK();
                        scyReturPabrikPK.setNoDokumen(noDokumen);                        
                        scyReturPabrikPK.setPcode(data.substring(0, 7).trim());                    
                        item.setScyReturPabrikItemPK(scyReturPabrikPK);
  

                        //Perhitungan Faktor Konversi >> Ambil dari Produk
                        Produk produk = controller.getModel().produkDao.findById(scyReturPabrikPK.getPcode().trim());
                        item.setConvfact1(produk.getConvFact1()!=null?produk.getConvFact1():0);
                        item.setConvfact2(produk.getConvFact2()!=null?produk.getConvFact2():0);
                        
                        
                        
                        item.setNoRetur(noRetur);
                        item.setNoKirim(noKirim);

                        item.setTglRetur(tglRetur);
                        item.setTglJTempo(tglJTempo);
                        item.setTglKirim(tglKirim);
                        item.setTglTerima(tglTerima);

                        item.setNamaBarang(data.substring(9, 39).trim());
                        
                        
                        Integer intHrgBeli = Integer.parseInt(data.substring(39, 49).trim().replaceAll("\\.", ""));
                        item.setHrgBeli(intHrgBeli);
                        
                        //Diolah di Extract
                        item.setUom(""); //Menggunakan master TMasterProduct                        

                        //*************PERHITUNGAN JML BARANG IN PCS***********************
                        item.setJmlBarangStr(data.substring(50, 64).trim());
                        
                        int pcs=0; int lusin=0; int karton=0;
                        if (item.getJmlBarangStr().length()<4) { //3 berarti 3x3 digit + 2 dot
                            //SALAH TERNYATA BUKAN PCS TAPI KARTON
                            //pcs = Integer.parseInt(item.getTotalStock().trim());                        
                            karton = Integer.parseInt(item.getJmlBarangStr().trim());

                        } else  if (item.getJmlBarangStr().trim().length()< 8){                    
                            int posisiDotPertama = item.getJmlBarangStr().trim().indexOf(".");
                            lusin = Integer.parseInt(item.getJmlBarangStr().trim().substring(0, posisiDotPertama));
                            pcs = Integer.parseInt(item.getJmlBarangStr().trim().substring(posisiDotPertama+1, posisiDotPertama+1+3));

                        } else {                    
                            int posisiDotPertama = item.getJmlBarangStr().trim().indexOf(".");
                            karton = Integer.parseInt(item.getJmlBarangStr().trim().substring(0, posisiDotPertama));
                            lusin = Integer.parseInt(item.getJmlBarangStr().trim().substring(posisiDotPertama+1, posisiDotPertama+1+3));
                            pcs = Integer.parseInt(item.getJmlBarangStr().trim().substring(posisiDotPertama+1+3+1, posisiDotPertama+1+3+1+3));
                        }
                        
                        int isiPerKarton = (item.getConvfact1() *12) + item.getConvfact2();                    
                        int totalStockPcs = (karton*isiPerKarton )+ (lusin*12)+ pcs;

                        item.setJmlBarang(karton); //Asumsi in karton
                        item.setJmlBarangPcs(totalStockPcs); //Menggunakna Convfact1 dan convfact2 >> Asumsi in Pcs
                        
                        try {
                            item.setPersenDisc(Double.valueOf(data.substring(64, 70).trim().replaceAll("\\,", "."))); //tergantung format komputer
                        } catch(Exception ex){
                            logger.error("Error parsing PersenDisc", ex);
                        }
                        Integer intRpDisc = Integer.parseInt(data.substring(70, 81).trim().replaceAll("\\.", ""));                                               
                        item.setRpDisc(intRpDisc);
                         
                        
                        Integer intJumlahRupiah = Integer.parseInt(data.substring(81, 94).trim().replaceAll("\\.", "").replaceAll("\\-", ""));                        
                        item.setJumlahRupiah(Math.abs(intJumlahRupiah));
                         
                        if (item !=null) 
                                lst.add(item);
                       
                        
                    }
                   }
                    
               }         

                    //if (pencacah>2) break;
                    //System.out.println();
                
            }
            
            
        } catch (FileNotFoundException ex) {
            logger.error("error pada method parseReturKePabrik", ex);
        } catch (IOException ex) {
            logger.error("error pada method parseReturKePabrik", ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
            logger.error("error pada method parseReturKePabrik", ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
    }
    
}
