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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.config.spring.hibernate.dao.ProdukDaoInter;
import org.config.spring.hibernate.model.Produk;
import org.config.spring.hibernate.model.ScyPenyesuaianItem;
import org.config.spring.hibernate.model.ScyPenyesuaianItemPK;
import org.config.spring.provider.ApplicationContextProvider;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ParsePenyesuaian {
    private static final Logger logger = LoggerFactory.getLogger(ParsePenyesuaian.class);
    BridgingController controller;
    
    public ParsePenyesuaian(BridgingController controller){
        this.controller = controller;
    }
    
//    ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContextMem();
//    ProdukDaoInter produkDao = (ProdukDaoInter) appContext.getBean("ProdukDaoBean");
    
    public List<ScyPenyesuaianItem> parsePenyesuaian(String strFilePath, Date tanggalPenyesuaian, String principal){
         //System.out.println("Parsing Barang Datang >> Starting");
         logger.info("Parse Penyesuaian/Stok Adjustment >> Starting");
         
         Reader readerFile = null;
         List<ScyPenyesuaianItem> lst = new ArrayList<>();
         
        try {
            File filePath = new File(strFilePath);
            readerFile = new FileReader(filePath);
            BufferedReader bufReadFile = new BufferedReader(readerFile);
            String readByte;
            int pencacah =0;
            //Inisialisasi HEADER yang akan diubah-ubah secara periodik/Tidak selalu berubah-ubah
            String noDokumen="";            
            while ((readByte = bufReadFile.readLine()) !=null) {
               String data = readByte;
                                   
               //Menentukan Header yang tidak selalu berubah-ubah >> Cari Algoritmanya
               //Tidak Ada Header >> NoDukumen berada di detil
               
               //2. Header Tanggal Penyesuaian diambil dari inputan user
               //Menentukan Item/Detil >> Panjang baris seharusnya 94 (toleransi 2 ke kanan dan 1 ke kiri) >> Hanya bagian ini yang akan disimpan
               if (data.trim().length()>=106 && data.trim().length()<=119) {
                   if (data.substring(0, 5).trim().length()>=1){ //No Dokumen minimal 1(satu) digit
                    if (! (data.substring(0, 5).equals("NODOK") || data.substring(0, 5).equals("-----") || data.substring(0, 5).equals("TOTAL"))){
                        noDokumen = data.substring(0, 8).trim();
                        
                        ScyPenyesuaianItem item = new ScyPenyesuaianItem();
                        ScyPenyesuaianItemPK scyPenyesuaianItemPK = new ScyPenyesuaianItemPK();
                        scyPenyesuaianItemPK.setNoDokumen(noDokumen);                        
                        scyPenyesuaianItemPK.setPcode(data.substring(13, 20).trim());                    
                        item.setScyPenyesuaianItemPK(scyPenyesuaianItemPK);

                        //Perhitungan Faktor Konversi >> Ambil dari Produk
                        Produk produk = controller.getModel().produkDao.findById(scyPenyesuaianItemPK.getPcode().trim());
                        item.setConvfact1(produk.getConvFact1()!=null?produk.getConvFact1():0);
                        item.setConvfact2(produk.getConvFact2()!=null?produk.getConvFact2():0);
                        
                        item.setTanggalPenyesuaian(tanggalPenyesuaian);
                        item.setKodeGudang(data.substring(9, 13).trim());
                        item.setNamaBarang(data.substring(20, 51).trim());
                        
                        try {
                            String strAdjBrgBaikRp = data.substring(67, 81).trim();
                            Integer intAdjBrgBaikRp = Integer.parseInt(strAdjBrgBaikRp.replaceAll("\\.", ""));
                            item.setAdjBrgBaikRp(intAdjBrgBaikRp);
                        } catch(Exception ex){
                        }
                        try{
                            String strAdjBrgBaikStr = data.substring(51, 67).trim();
                            item.setAdjBrgBaikStr(strAdjBrgBaikStr); 
                            //*************PERHITUNGAN JML BARANG IN PCS***********************

                            int pcs=0; int lusin=0; int karton=0;
                            if (strAdjBrgBaikStr.replaceAll("\\-", "").trim().length()<4) { //3 berarti 3x3 digit + 2 dot
                                //SALAH TERNYATA BUKAN PCS TAPI KARTON
                                //pcs = Integer.parseInt(item.getTotalStock().trim());                        
                                karton = Integer.parseInt(strAdjBrgBaikStr.replaceAll("\\-", "").trim());

                            } else  if (strAdjBrgBaikStr.replaceAll("\\-", "").trim().length()< 8){                    
                                int posisiDotPertama = strAdjBrgBaikStr.replaceAll("\\-", "").trim().indexOf(".");
                                lusin = Integer.parseInt(strAdjBrgBaikStr.replaceAll("\\-", "").trim().substring(0, posisiDotPertama));
                                pcs = Integer.parseInt(strAdjBrgBaikStr.replaceAll("\\-", "").trim().substring(posisiDotPertama+1, posisiDotPertama+1+3));

                            } else {                    
                                int posisiDotPertama = strAdjBrgBaikStr.replaceAll("\\-", "").trim().indexOf(".");
                                karton = Integer.parseInt(strAdjBrgBaikStr.replaceAll("\\-", "").trim().substring(0, posisiDotPertama));
                                lusin = Integer.parseInt(strAdjBrgBaikStr.replaceAll("\\-", "").trim().substring(posisiDotPertama+1, posisiDotPertama+1+3));
                                pcs = Integer.parseInt(strAdjBrgBaikStr.replaceAll("\\-", "").trim().substring(posisiDotPertama+1+3+1, posisiDotPertama+1+3+1+3));
                            }

                            int isiPerKarton = (item.getConvfact1() *12) + item.getConvfact2();                    
                            int totalStockPcs = (karton*isiPerKarton )+ (lusin*12)+ pcs;

                            item.setAdjBrgBaikKarton(karton); //Asumsi in karton
                            item.setAdjBrgBaikPcs(totalStockPcs); //Menggunakna Convfact1 dan convfact2 >> Asumsi in Pcs
                            
                        } catch(Exception ex){
                        }
                        
                        
                        //BARANG BS
                        try {
                            String strAdjBrgBsRp = data.substring(94, 109).trim();
                            Integer intAdjBrgBsRp = Integer.parseInt(strAdjBrgBsRp.replaceAll("\\.", ""));
                            item.setAdjBrgBaikRp(intAdjBrgBsRp);
                        } catch (Exception ex){
                        }
                        try {
                            String strAdjBrgBsStr = data.substring(81, 94).trim();
                            item.setAdjBrgBsStr(strAdjBrgBsStr);                        
                            //*************PERHITUNGAN JML BARANG IN PCS***********************

                            int pcs=0; int lusin=0; int karton=0;
                            if (item.getAdjBrgBsStr().length()<4) { //3 berarti 3x3 digit + 2 dot
                                //SALAH TERNYATA BUKAN PCS TAPI KARTON
                                //pcs = Integer.parseInt(item.getTotalStock().trim());                        
                                karton = Integer.parseInt(strAdjBrgBsStr.replaceAll("\\-", "").trim());

                            } else  if (strAdjBrgBsStr.replaceAll("\\-", "").trim().length()< 8){                    
                                int posisiDotPertama = strAdjBrgBsStr.replaceAll("\\-", "").trim().indexOf(".");
                                lusin = Integer.parseInt(strAdjBrgBsStr.replaceAll("\\-", "").trim().substring(0, posisiDotPertama));
                                pcs = Integer.parseInt(strAdjBrgBsStr.replaceAll("\\-", "").trim().substring(posisiDotPertama+1, posisiDotPertama+1+3));

                            } else {                    
                                int posisiDotPertama = strAdjBrgBsStr.replaceAll("\\-", "").trim().indexOf(".");
                                karton = Integer.parseInt(strAdjBrgBsStr.replaceAll("\\-", "").trim().substring(0, posisiDotPertama));
                                lusin = Integer.parseInt(strAdjBrgBsStr.replaceAll("\\-", "").trim().substring(posisiDotPertama+1, posisiDotPertama+1+3));
                                pcs = Integer.parseInt(strAdjBrgBsStr.replaceAll("\\-", "").trim().substring(posisiDotPertama+1+3+1, posisiDotPertama+1+3+1+3));
                            }

                            int isiPerKarton = (item.getConvfact1() *12) + item.getConvfact2();                    
                            int totalStockPcs = (karton*isiPerKarton )+ (lusin*12)+ pcs;

                            item.setAdjBrgBsKarton(karton); //Asumsi in karton
                            item.setAdjBrgBsPcs(totalStockPcs); //Menggunakna Convfact1 dan convfact2 >> Asumsi in Pcs
                        } catch(Exception ex){
                        }
                        
 
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
