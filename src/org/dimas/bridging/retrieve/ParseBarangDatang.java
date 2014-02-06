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
import org.config.spring.hibernate.model.Produk;
import org.config.spring.hibernate.model.ScyBDItem;
import org.config.spring.hibernate.model.ScyBDItemPK;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class ParseBarangDatang {
    private static final Logger logger = LoggerFactory.getLogger(ParseBarangDatang.class);
    BridgingController controller;
    
//    ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContextMem();
//    ProdukDaoInter produkDao = (ProdukDaoInter) appContext.getBean("ProdukDaoBean");
    
    public ParseBarangDatang(BridgingController controller){
        this.controller = controller;
    }
    
    public List<ScyBDItem> parseBarangDatang(String strFilePath, String principal){
         //System.out.println("Parsing Barang Datang >> Starting");
         logger.info("Parse Barang Datang >> Starting");
         
         Reader readerFile = null;
         List<ScyBDItem> lst = new ArrayList<>();
         
        try {
            File filePath = new File(strFilePath);
            readerFile = new FileReader(filePath);
            BufferedReader bufReadFile = new BufferedReader(readerFile);
            String readByte;
            int pencacah =0;
            //Inisialisasi HEADER yang akan diubah-ubah secara periodik/Tidak selalu berubah-ubah
            Date tglFaktur = null ;          
            Date tglJTempo = null;
            Date tglTerima = null;
            Date tglKirim = null;
            String noFaktur = ""; String noDokumen=""; String noKirim="";
            while ((readByte = bufReadFile.readLine()) !=null) {
               String data = readByte;
                                   
               //Menentukan Header yang tidak selalu berubah-ubah 
               //1. Header NoDokumen >> Panjang baris seharusnya 84 (toleransi 1)
               if (data.trim().length()>=82 && data.trim().length()<=86) {
                   if (data.substring(0, 10).equals("No.Faktur:")) {
                       noFaktur = data.substring(10, 18).trim(); //Ditambah 2 digit sebagai toleransi
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
                   
                   if (data.substring(0, 10).equals("TglFaktur:")) {
                       String strTanggal = data.substring(10, 21).trim();
                        try {
                            if (! strTanggal.trim().equals(""))
                                tglFaktur = sdf.parse(strTanggal);      
                        } catch (ParseException ex) {
                            logger.error("error Format tanggal Faktur", ex);
                        }
                   }
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
                       String strTanggal = data.substring(78, 89).trim();
                        try {
                            if (! strTanggal.trim().equals(""))
                                tglKirim = sdf.parse(strTanggal);      
                        } catch (ParseException ex) {
                            logger.error("error Format tanggal Kirim", ex);
                        }
                   }
                   
               }               
               //Menentukan Item/Detil >> Panjang baris seharusnya 94 (toleransi 2) >> Hanya bagian ini yang akan disimpan
               if (data.trim().length()>=92 && data.trim().length()<=96) {
                   if (data.substring(0, 5).trim().length()>3){
                    if (! (data.substring(0, 5).equals("PCODE") || data.substring(0, 5).equals("-----"))){
                        ScyBDItem item = new ScyBDItem();
                        ScyBDItemPK scyBdItemPK = new ScyBDItemPK();
                        scyBdItemPK.setNoDokumen(noDokumen);                        
                        scyBdItemPK.setPcode(data.substring(0, 7).trim());                    
                        item.setScyBdItemPK(scyBdItemPK);

                        //Perhitungan Faktor Konversi >> Ambil dari Produk
                        Produk produk = controller.getModel().produkDao.findById(scyBdItemPK.getPcode().trim());
                        item.setConvfact1(produk.getConvFact1()!=null?produk.getConvFact1():0);
                        item.setConvfact2(produk.getConvFact2()!=null?produk.getConvFact2():0);
                        
                        item.setNoFaktur(noFaktur);
                        item.setNoKirim(noKirim);

                        item.setTglFaktur(tglFaktur);
                        item.setTglJTempo(tglJTempo);
                        item.setTglKirim(tglKirim);
                        item.setTglTerima(tglTerima);

                        item.setNamaBarang(data.substring(9, 39).trim());
                        Integer intHrgBeli = Integer.parseInt(data.substring(39, 49).trim().replaceAll("\\.", ""));
                        item.setHrgBeli(intHrgBeli);
                        
                        try {
                            item.setJmlBarang(Integer.parseInt(data.substring(50, 64).trim())); //Asumsi dalam karton
                        } catch(Exception ex){
                            logger.error("error parse Integer Jumlah Barang", ex);
                        }
                        
                        //akan dioleh pada saat Extract
                        item.setUom(data); //Menggunakan TMasterProduct
                        
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
                        
                        try{
                            item.setPersenDisc(Double.valueOf(data.substring(64, 70).trim().replaceAll("\\,", "."))); //tergantung format komputer
                        } catch(Exception ex){
                            logger.error("Error parsing PersenDisc", ex);
                        }                        
                        Integer intRpDisc = Integer.parseInt(data.substring(70, 81).trim().replaceAll("\\.", ""));
                        item.setRpDisc(intRpDisc);
                        
                        Integer intJumlahRupiah = Integer.parseInt(data.substring(81, 94).trim().replaceAll("\\.", ""));                        
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
            logger.error("error pada method parseBarangDatang", ex);
        } catch (IOException ex) {
            logger.error("error pada method parseBarangDatang", ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
            logger.error("error pada method parseBarangDatang", ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
    }
    
}
