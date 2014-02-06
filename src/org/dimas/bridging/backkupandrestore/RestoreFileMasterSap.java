/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.backkupandrestore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.config.spring.hibernate.dao.TMasterProductDaoInter;
import org.config.spring.hibernate.dao.TMasterOutletDaoInter;
import org.config.spring.hibernate.dao.TMasterSalesmanDaoInter;
import org.config.spring.hibernate.model.TMasterProduct;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.config.spring.hibernate.model.TMasterSalesman;
import org.config.spring.provider.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class RestoreFileMasterSap {
    private static final Logger logger = LoggerFactory.getLogger(RestoreFileMasterSap.class);
    
    ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
    
    TMasterProductDaoInter tMasterProductDao = (TMasterProductDaoInter) appContext.getBean("TMasterProductDaoBean");
    TMasterOutletDaoInter tMasterOutletDao = (TMasterOutletDaoInter) appContext.getBean("TMasterOutletDaoBean");
    TMasterSalesmanDaoInter tMasterSalesmanDao = (TMasterSalesmanDaoInter) appContext.getBean("TMasterSalesmanDaoBean");

    public RestoreFileMasterSap() {
        inisialisasi();
    }
    public void inisialisasi(){
    
    }
    public void runRestoreMasterSap(String sourcePath, int isOverwrite, int isGantiBaru){
       try {
           runRestoreMasterProduct(sourcePath, isOverwrite, isGantiBaru);
           runRestoreMasterOutlet(sourcePath, isOverwrite, isGantiBaru);
           runRestoreMasterSalesman(sourcePath, isOverwrite, isGantiBaru);
       } catch (FileNotFoundException ex) {
           logger.error("Error Restore Master SAP All", ex);
       } catch (IOException ex) {
           logger.error("Error Restore Master SAP All", ex);
       }
                
    }    

    public int runRestoreMasterProduct(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException {
            if (isGantiBaru==1){
                List<TMasterProduct> lst = tMasterProductDao.findAll();
                for (TMasterProduct itm : lst) {
                    tMasterProductDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TMasterProduct.txt");
            if (filePath.exists()) {
                Reader readerFile = new FileReader(filePath);
                BufferedReader bufReadFile = new BufferedReader(readerFile);
                String readByte;
                int pencacah=0;
                while (( readByte = bufReadFile.readLine()) != null) {
                    if (pencacah>0) { //header tidak boleh dimasukkan
                        String [] data = readByte.split("\\t");  
                        if (data.length<=2) {
                            data = readByte.split("\\,");  
                        }
                        TMasterProduct item =  new TMasterProduct();

                        item.setDistId(data[0].trim());
                        item.setDistNm(data[1].trim());
                        item.setPcodeScylla(data[2].trim());
                        item.setPcodeSap(data[3].trim());
                        item.setPnameSap(data[4].trim());
                        item.setAreaId(data[5].trim());
                        item.setAreaNm(data[6].trim());
                        item.setKodeBrand(data[7].trim());
                        item.setNamaBrand(data[8].trim());
                        item.setKodeCategory(data[9].trim());
                        item.setNamaCategory(data[10].trim());
                        item.setKodeDivisi(data[11].trim());
                        item.setNamaDivisi(data[12].trim());
                        item.setKodeSize(data[13].trim());
                        item.setNamaSize(data[14].trim());
                        item.setKodeSubBrand(data[15].trim());
                        item.setNamaSubBrand(data[16].trim());
                        item.setKodeSubCategory(data[17].trim());
                        item.setNamaSubCategory(data[18].trim());
                        item.setKodeVariance(data[19].trim());
                        item.setNamaVariance(data[20].trim());
                        
                        //Karena kalau null --> Kosong ("")                        
                        try {
                            item.setBaru(data[21].trim().equals("true")? 
                                    Boolean.parseBoolean(data[21].trim()):false);
                            item.setAllowTransfer(data[22].trim().equals("true")? 
                                    Boolean.parseBoolean(data[22].trim()):false);
                            item.setBonus(data[23].trim().equals("true")? 
                                    Boolean.parseBoolean(data[23].trim()):false);
                            item.setAktif(data[24].trim().equals("true")? 
                                    Boolean.parseBoolean(data[24].trim()):false);
                        } catch(Exception ex){
                            logger.error("Error parsing Baru, AllowTransfer, Bonus, Aktif");
                        }
                        if (isOverwrite==1) {
                            try {
                                tMasterProductDao.saveOrUpdate(item);
                            } catch(Exception ex) {
                                logger.error("Error tMasterProductDao.saveOrUpdate(item)", ex);
                            }
                        } else {
                            try {
                                tMasterProductDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tMasterProductDao.save(item)", ex);
                            }
                        }
                        
                    }
                    pencacah++;
                }
             } else {
                isErr = 1;
            }
            return isErr;
    }
    public int runRestoreMasterOutlet(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException {
            if (isGantiBaru==1){
                List<TMasterOutlet> lst = tMasterOutletDao.findAll();
                for (TMasterOutlet itm : lst) {
                    tMasterOutletDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TMasterOutlet.txt");
            if (filePath.exists()) {
                Reader readerFile = new FileReader(filePath);
                BufferedReader bufReadFile = new BufferedReader(readerFile);
                String readByte;
                int pencacah=0;
                while (( readByte = bufReadFile.readLine()) != null) {
                    if (pencacah>0) { //header tidak boleh dimasukkan
                        String [] data = readByte.split("\\t");  
                        if (data.length<=2) {
                            data = readByte.split("\\,");  
                        }
                        
                        TMasterOutlet item = new TMasterOutlet();
                        item.setDistiId(data[0].trim());
                        item.setDistiNm(data[1].trim());
                        
                        //TOutletPK itemPK = new TOutletPK();
                        //itemPK.setScyOutCode(data[2].trim());
                        //itemPK.setMslsoutCode(data[3].trim());
                        //item.settOutletPK(itemPK);
                        item.setScyOutCode(data[2].trim());
                        item.setMslsoutCode(data[3].trim());
                                
                        item.setMslsoutDesc(data[4].trim());
                        item.setAreaId(data[5].trim());
                        item.setAreaNm(data[6].trim());
                        item.setBsizeId(data[7].trim());
                        item.setBsizeNm(data[8].trim());
                        item.setChainId(data[9].trim());
                        item.setChainNm(data[10].trim());
                        item.setClassId(data[11].trim());
                        item.setClassNm(data[12].trim());
                        item.setGroupId(data[13].trim());
                        item.setGroupNm(data[14].trim());
                        item.setKaccId(data[15].trim());
                        item.setKaccNm(data[16].trim());
                        item.setLokId(data[17].trim());
                        item.setLokNm(data[18].trim());
                        item.setNasSalesCode(data[19].trim());
                        item.setNasSalesNm(data[20].trim());
                        item.setSalesCode(data[21].trim());
                        item.setSalesNm(data[22].trim());
                        item.setSubGrpId(data[23].trim());
                        item.setSubGrpNm(data[24].trim());
                        item.setTypeId(data[25].trim());
                        item.setTypeNm(data[26].trim());

                        //Karena kalau null --> Kosong ("")                        
                        try {
                            item.setBaru(data[27].trim().equals("true")? 
                                    Boolean.parseBoolean(data[27].trim()):false);
                            item.setAllowTransfer(data[28].trim().equals("true")? 
                                    Boolean.parseBoolean(data[28].trim()):false);
                            item.setAktif(data[29].trim().equals("true")? 
                                    Boolean.parseBoolean(data[29].trim()):false);
                        } catch(Exception ex){
                            logger.error("Error parsing Baru, AllowTransfer, Bonus, Aktif");
                        }
                        
                        if (isOverwrite==1) {
                            try {
                                tMasterOutletDao.saveOrUpdate(item);
                            } catch(Exception ex){
                                logger.error("Error tMasterOutletDao.SaveOrUpdate(item)", ex);
                            }
                        } else {
                            try {
                                tMasterOutletDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tMasterOutletDao.save(item)", ex);
                            }
                        }
                        
                    }
                    pencacah++;
                }
             } else {
                isErr = 1;
            }
            return isErr;
    }
    public int runRestoreMasterSalesman(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException {
            if (isGantiBaru==1){
                List<TMasterSalesman> lst = tMasterSalesmanDao.findAll();
                for (TMasterSalesman itm : lst) {
                    tMasterSalesmanDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TMasterSalesman.txt");
            if (filePath.exists()) {
                Reader readerFile = new FileReader(filePath);
                BufferedReader bufReadFile = new BufferedReader(readerFile);
                String readByte;
                int pencacah=0;
                while (( readByte = bufReadFile.readLine()) != null) {
                    if (pencacah>0) { //header tidak boleh dimasukkan
                        String [] data = readByte.split("\\t");  
                        if (data.length<=2) {
                            data = readByte.split("\\,");  
                        }
                        TMasterSalesman item = new TMasterSalesman();
                        //logger.info("Panjang data >> " + data.length + "\t" + data[2]+ "\t" + data[3]);
                        
                        item.setDistiCode(data[0].trim());
                        item.setDistiName(data[1].trim());
                        item.setSalesIdScy(data[2].trim());
                        item.setSalesIdSap(data[3].trim());
                        item.setSalesNm(data[4].trim());
                        item.setSalesNmSap(data[5].trim());
                        item.setCalamat1(data[6].trim());
                        item.setCalamat2(data[7].trim());
                        item.setCkota(data[8].trim());
                        item.setCpos(data[9].trim());
                        item.setCtelp(data[10].trim());
                        item.setKodeLevel(data[11].trim());
                        item.setRpttoCode(data[12].trim());
                        
                        //Karena kalau null --> Kosong ("")                        
                        try {
                            item.setBaru(data[13].trim().equals("true")? 
                                    Boolean.parseBoolean(data[13].trim()):false);
                            item.setAllowTransfer(data[14].trim().equals("true")? 
                                    Boolean.parseBoolean(data[14].trim()):false);
                            item.setAktif(data[15].trim().equals("true")? 
                                    Boolean.parseBoolean(data[15].trim()):false);
                        } catch(Exception ex){
                            logger.error("Error parsing Baru, AllowTransfer, Bonus, Aktif");
                        }
                        
                        if (isOverwrite==1) {
                            try {
                                tMasterSalesmanDao.saveOrUpdate(item);
                            } catch(Exception ex){
                                logger.error("Error tMasterSalesmanDao.saveOrUpdate(item)", ex);
                            }
                        } else {
                            try {
                                tMasterSalesmanDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tMasterSalesmanDao.save(item)", ex);
                            }
                        }
                        
                    }
                    pencacah++;
                }
             } else {
                isErr = 1;
            }
            return isErr;
    }
    
}
