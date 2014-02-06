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
import java.util.List;
import org.config.spring.hibernate.model.Produk;
import org.config.spring.hibernate.model.TMasterProduct;
import org.config.spring.hibernate.model.enumgeneral.EnumPrincipal;
import org.config.spring.hibernate.model.pokari.MappingProduct;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 *  yhawin
 */
public class ParseMSPCODE {
    private static final Logger logger = LoggerFactory.getLogger(ParseMSPCODE.class);

    BridgingController controller;
//    ApplicationContext appContext;
//    TMasterProductDaoInter tMasterProductDao;
//    SysvarDaoInter sysvarDao;
    
    
    public ParseMSPCODE(BridgingController controller){
        this.controller = controller;
//        appContext= ApplicationContextProvider.getInstance().getApplicationContext();
//        sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
//        tMasterProductDao = (TMasterProductDaoInter) appContext.getBean("TMasterProductDaoBean");
    }
    
    public List<Produk> parseMSPCODE(String strFilePath, String principal){
         logger.info("Parsing MSPCODE/Produk >> Starting");
         Reader readerFile = null;
         List<Produk> lst = new ArrayList<>();
        //Seragam Distributor Code Pake Parameter Sistem
        String distCode = controller.getModel().sysvarDao.findById("_DIST_CODE").getNilaiString1();
        String distName = controller.getModel().sysvarDao.findById("_DIST_NAME").getNilaiString1();
         
        try {
            File filePath = new File(strFilePath);
            readerFile = new FileReader(filePath);
            BufferedReader bufReadFile = new BufferedReader(readerFile);
            String readByte;
            int pencacah =0;
            
            while ((readByte = bufReadFile.readLine()) !=null) {
                //System.out.print(pencacah++ + "-->> " );
                
                //readByte = readByte.replaceAll("\"", "");
                //String [] data = readByte.split("\\,");  
                String data = readByte;
                                     
                //Karena jumlah record benar adalah 5 (8 toleransi)
               if (data.length()==244) {
                    //System.out.println(data);
                    Produk item = new Produk();
                    item.setPcode(data.substring(0, 6).trim());
                    item.setNamaBrg(data.substring(6,36 ).trim());
                    
                    //Konversi barang
                    //Perhitungan Faktor Konversi
                    item.setLstSat(data.substring(95, 102).trim());
                    item.setConvFact1(0);
                    item.setConvFact2(0);
                    if (item.getLstSat().trim().length()==7) {
                        int lusin = Integer.parseInt(item.getLstSat().trim().substring(0, 3));
                        int pcs = Integer.parseInt(item.getLstSat().trim().substring(4, 7));
                        item.setConvFact1(lusin);
                        item.setConvFact2(pcs);
                        //System.out.println(item.getIsiPerLsn().trim().substring(4, 7));
                    }
                    
                    
                    item.setDv(data.substring(36, 38).trim());
                    item.setKt(data.substring(38, 42).trim());
                    item.setBr(data.substring(42, 46).trim());
                    item.setVariant(data.substring(46, 56).trim());
                    item.setUkuran(data.substring(56, 66).trim());
                    item.setJatah(data.substring(66, 67).trim());
                    item.setNmLap1(data.substring(67, 73).trim());

                    item.setNmLap2(data.substring(73, 79).trim());
                    item.setLns(data.substring(79, 82).trim());
                    item.setPk(data.substring(82, 84).trim());
                    item.setAktif(data.substring(84, 85).trim());
                    item.setMain(data.substring(85, 86).trim());
                    item.setBrtKrt(data.substring(86, 95).trim());
                    
                    //Saya pindah ke atas --> untuk faktor konversi
                    //item.setLstSat(data.substring(95, 102).trim());
                    
                    if (data.substring(102, 109).trim().equals("")) {
                        item.setBeliKrt(0);
                    }else {
                        item.setBeliKrt(Integer.parseInt(data.substring(102, 109).trim()));
                    }
                    if (data.substring(109, 116).trim().equals("")) {
                        item.setJualKrt(0);
                    } else {
                        item.setJualKrt(Integer.parseInt(data.substring(109, 116).trim()));
                    }
                    if (data.substring(116,123 ).trim().equals("")) {
                        item.setJualLsn(0);
                    } else {
                        item.setJualLsn(Integer.parseInt(data.substring(116,123 ).trim()));
                    }
                    if (data.substring(123, 130).trim().equals("")) {
                        item.setJualPcs(0);
                    } else  {
                        item.setJualPcs(Integer.parseInt(data.substring(123, 130).trim()));
                    }

                    
                    if (item !=null) 
                            lst.add(item);
                    
                    /**
                     * MENCOBA MEMASUKKAN KE MASTER PRODUCT KEK
                     */
                    /**
                     * ENTITY KEK
                     */
                            TMasterProduct tMasterProduct = new TMasterProduct();
                            tMasterProduct.setPcodeScylla(item.getPcode().trim());
                            tMasterProduct.setPcodeSap(item.getPcode().trim());
                            tMasterProduct.setPnameSap(item.getNamaBrg().trim());
                            /**
                             * NAMA BARANG MASIH BELUM DIPERLUKAN
                             */
                            tMasterProduct.setDistId(distCode);
                            tMasterProduct.setDistNm(distName);

                            tMasterProduct.setBaru(true);
                            tMasterProduct.setAllowTransfer(false);
                            tMasterProduct.setBonus(false);
                            tMasterProduct.setAktif(true);
                            
                    /**
                     * ENTITY POKARI
                     */        
                            MappingProduct mappingProduct = new MappingProduct();
                            mappingProduct.setPcodeScylla(item.getPcode().trim());
                            mappingProduct.setSzProductId(item.getPcode().trim());
                            mappingProduct.setPnameScylla(item.getNamaBrg().trim());
                            mappingProduct.setSzProductName(item.getNamaBrg().trim());
                            
                            /**
                             * BRAND ID AKAN MENGGUNAKAN DEFAULT BRAND ID
                             */
                            mappingProduct.setSzBrandId("");
                            
                            mappingProduct.setAktif(true);
                            mappingProduct.setBaru(true);
                            mappingProduct.setAllowTransfer(false);
                            
                    
                    if (principal.equalsIgnoreCase(EnumPrincipal.KEK.getStrCode())){
                        try {

                            controller.getModel().tMasterProductDao.save(tMasterProduct);
                            /**
                             * DUMMY FOR POKARI AND BAYGON >> TO MEMORY : KARENA HIBERNATE RELATION KITA MASIH BELUM TAHU
                             */
                            controller.getModel().mappingProductDaoMem.saveOrUpdate(mappingProduct);
                        } catch(Exception ex) {
                            logger.error(item.getPcode() + " " + item.getNamaBrg() +  " OF KEK sudah ada");
                        }
                    
                    } else if (principal.equalsIgnoreCase(EnumPrincipal.POKARI.getStrCode())){
                        try {                            
                            //Save to POKARI >> DATABASE
                            controller.getModel().mappingProductDao.save(mappingProduct);                            
                            /**
                             * DUMMY FOR BAYGON AND KEK >> TO MEMORY : KARENA HIBERNATE RELATION KITA MASIH BELUM TAHU
                             */                            
                            controller.getModel().tMasterProductDaoMem.saveOrUpdate(tMasterProduct);
                            
                        } catch(Exception ex){
                            logger.error(item.getPcode() + " " + item.getNamaBrg() +  " OF POKARI sudah ada");
                            
                        }
                        
                    } else if (principal.equalsIgnoreCase(EnumPrincipal.BAYGON.getStrCode())){
                        
                    }
               }         

                    //if (pencacah>2) break;
                    //System.out.println();
                
            }
            
            
        } catch (FileNotFoundException ex) {
            logger.error("error Method parseMSPCODE", ex);
        } catch (IOException ex) {
            logger.error("error Method parseMSPCODE", ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                logger.error("error Method parseMSPCODE", ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
        //ParseMSPCODE f = new ParseMSPCODE();
        //f.parseMSPCODE("/home/yhawin/Dimas/Input-File/MSPCODE.TXT");//Oke --> "\\,"    
        //f.parseMSPCODE("E:/Input-File/MSPCODE.TXT", "POKARI");//Oke --> "\\,"    
        
    }
    
}
