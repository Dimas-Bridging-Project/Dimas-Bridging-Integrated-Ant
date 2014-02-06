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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import org.config.spring.hibernate.dao.TMasterProductDaoInter;
import org.config.spring.hibernate.dao.TMasterOutletDaoInter;
import org.config.spring.hibernate.dao.TMasterSalesmanDaoInter;
import org.config.spring.hibernate.dao.pokari.ArCustomerDao;
import org.config.spring.hibernate.model.TMasterProduct;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.config.spring.hibernate.model.TMasterSalesman;
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.config.spring.hibernate.model.pokari.MappingProduct;
import org.config.spring.hibernate.model.pokari.SpEmployee;
import org.config.spring.provider.ApplicationContextProvider;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class RestoreFileMasterPokari {
    private static final Logger logger = LoggerFactory.getLogger(RestoreFileMasterPokari.class);
    BridgingController controller;

    public RestoreFileMasterPokari(BridgingController controller) {
        this.controller = controller;
        inisialisasi();
    }
    public void inisialisasi(){
    
    }
    public void runRestoreMasterPokari(String sourcePath, int isOverwrite, int isGantiBaru){
           runRestoreMasterPokariArCustomer(sourcePath, isOverwrite, isGantiBaru);
           runRestoreMasterPokariMappingProduct(sourcePath, isOverwrite, isGantiBaru);
           runRestoreMasterPokariSpEmployee(sourcePath, isOverwrite, isGantiBaru);

    }    
    public int runRestoreMasterPokariArCustomer(String sourcePath, int isOverwrite, int isGantiBaru){
            if (isGantiBaru==1){
                List<ArCustomer> lst = controller.getModel().arCustomerDao.findAll();
                for (ArCustomer itm : lst) {
                    controller.getModel().arCustomerDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "ArCustomer.txt");
            if (filePath.exists()) {
                try {
                    Reader readerFile = new FileReader(filePath);
                    BufferedReader bufReadFile = new BufferedReader(readerFile);
                    String readByte;
                    int pencacah=0;
                    try {
                        while (( readByte = bufReadFile.readLine()) != null) {
                            if (pencacah>0) { //header tidak boleh dimasukkan
                                String [] data = readByte.split("\\t");  
                                if (data.length<=2) {
                                    data = readByte.split("\\,");
                                }

                                ArCustomer item = new ArCustomer();
                                item.setScyCustomerId(data[0].trim());
                                item.setSzCustomerId(data[1].trim());

                                item.setScyName(data[2].trim());
                                item.setSzName(data[3].trim());

                                item.setSzAddress(data[4].trim());
                                item.setSzZipCode(data[5].trim());
                                item.setSzState(data[6].trim());
                                item.setSzCity(data[7].trim());
                                item.setSzDistrict(data[8].trim());
                                item.setSzPhone1(data[9].trim());
                                item.setSzPhone2(data[10].trim());
                                item.setSzFax(data[11].trim());
                                item.setSzContact(data[12].trim());
                                item.setSzEmail(data[13].trim());
                                item.setSzStatus(data[14].trim());
                                item.setSzDistrChannelId(data[15].trim());
                                try {
                                    item.setbAllowToCredit(data[16].trim().equals("true")?
                                            Boolean.parseBoolean(data[16].trim()):false);                                
                                } catch(Exception ex){}
                                
                                Double doubleDecLimit = 0.0;
                                try {
                                    doubleDecLimit = Double.parseDouble(data[17].trim());
                                } catch (Exception ex){}
                                    item.setDecLimitCredit(doubleDecLimit);
                                
                                item.setSzPaymentTermId(data[18].trim());
                                item.setSzHirarchyId(data[19].trim());
                                item.setSzSalesTerritoryId(data[20].trim());
                                item.setSzEmployeeId(data[21].trim());
                                item.setSzWorkplaceId(data[22].trim());
                                item.setSzCustomerGroupId(data[23].trim());
                                item.setSzNPWP(data[24].trim());
                                
                                if (! data[25].trim().equals("")) {
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                    try {
                                        item.setDtmRegisterDate(sdf.parse(data[25].trim()));
                                    } catch (ParseException ex) {
                                        java.util.logging.Logger.getLogger(RestoreFileMasterPokari.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                //Karena kalau null --> Kosong ("")                        
                                try {
                                    item.setBaru(data[26].trim().equals("true")?
                                            Boolean.parseBoolean(data[26].trim()):false);
                                    item.setAllowTransfer(data[27].trim().equals("true")? 
                                            Boolean.parseBoolean(data[27].trim()):false);
                                    item.setAktif(data[28].trim().equals("true")? 
                                            Boolean.parseBoolean(data[28].trim()):false);
                                } catch(Exception ex){
                                    logger.error("Error parsing Baru, AllowTransfer, Bonus, Aktif");
                                }

                                if (isOverwrite==1) {
                                    try {
                                        controller.getModel().arCustomerDao.saveOrUpdate(item);
                                    } catch(Exception ex){
                                        logger.error("Error tMasterOutletDao.SaveOrUpdate(item)", ex);
                                    }
                                } else {
                                    try {
                                        controller.getModel().arCustomerDao.save(item);
                                    } catch(Exception ex) {
                                        logger.error("Error tMasterOutletDao.save(item)", ex);
                                    }
                                }

                            }
                            pencacah++;
                        }
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(RestoreFileMasterPokari.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (FileNotFoundException ex) {
                    java.util.logging.Logger.getLogger(RestoreFileMasterPokari.class.getName()).log(Level.SEVERE, null, ex);
                }
                
             } else {
                isErr = 1;
            }
            return isErr;
    }

    public int runRestoreMasterPokariMappingProduct(String sourcePath, int isOverwrite, int isGantiBaru) {
            if (isGantiBaru==1){
                List<MappingProduct> lst = controller.getModel().mappingProductDao.findAll();
                for (MappingProduct itm : lst) {
                    controller.getModel().mappingProductDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "MappingProduct.txt");
            if (filePath.exists()) {
                Reader readerFile;
                try {
                    readerFile = new FileReader(filePath);
                    BufferedReader bufReadFile = new BufferedReader(readerFile);
                    String readByte;
                    int pencacah=0;
                    try {
                        while (( readByte = bufReadFile.readLine()) != null) {
                            if (pencacah>0) { //header tidak boleh dimasukkan
                                String [] data = readByte.split("\\t");  
                                if (data.length<=2) {
                                    data = readByte.split("\\,");  
                                }
                                MappingProduct item =  new MappingProduct();

                                item.setPcodeScylla(data[0].trim());
                                item.setSzProductId(data[1].trim());
                                item.setPnameScylla(data[2].trim());
                                item.setSzProductName(data[3].trim());
                                item.setSzBrandId(data[4].trim());

                                //Karena kalau null --> Kosong ("")                        
                                try {
                                    item.setBaru(data[5].trim().equals("true")? 
                                            Boolean.parseBoolean(data[5].trim()):false);
                                    item.setAllowTransfer(data[6].trim().equals("true")?
                                            Boolean.parseBoolean(data[6].trim()):false);
                                    item.setAktif(data[7].trim().equals("true")? 
                                            Boolean.parseBoolean(data[7].trim()):false);
                                } catch(Exception ex){
                                    logger.error("Error parsing Baru, AllowTransfer, Bonus, Aktif");
                                }
                                if (isOverwrite==1) {
                                    try {
                                        controller.getModel().mappingProductDao.saveOrUpdate(item);
                                    } catch(Exception ex) {
                                        logger.error("Error tMasterProductDao.saveOrUpdate(item)", ex);
                                    }
                                } else {
                                    try {
                                        controller.getModel().mappingProductDao.save(item);
                                    } catch(Exception ex) {
                                        logger.error("Error MappingProduct Master.save(item)", ex);
                                    }
                                }

                            }
                            pencacah++;
                        }
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(RestoreFileMasterPokari.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (FileNotFoundException ex) {
                    java.util.logging.Logger.getLogger(RestoreFileMasterPokari.class.getName()).log(Level.SEVERE, null, ex);
                }
                
             } else {
                isErr = 1;
            }
            return isErr;
    }
    public int runRestoreMasterPokariSpEmployee(String sourcePath, int isOverwrite, int isGantiBaru) {
            if (isGantiBaru==1){
                List<SpEmployee> lst = controller.getModel().spEmployeeDao.findAll();
                for (SpEmployee itm : lst) {
                    controller.getModel().spEmployeeDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "SpEmployee.txt");
            if (filePath.exists()) {
                try {
                    Reader readerFile = new FileReader(filePath);
                    BufferedReader bufReadFile = new BufferedReader(readerFile);
                    String readByte;
                    int pencacah=0;
                    try {
                        while (( readByte = bufReadFile.readLine()) != null) {
                            if (pencacah>0) { //header tidak boleh dimasukkan
                                String [] data = readByte.split("\\t");  
                                if (data.length<=2) {
                                    data = readByte.split("\\,");  
                                }
                                SpEmployee item = new SpEmployee();
                                //logger.info("Panjang data >> " + data.length + "\t" + data[2]+ "\t" + data[3]);

                                item.setScyEmployeeId(data[0].trim());
                                item.setSzEmployeeId(data[1].trim());
                                item.setScyName(data[2].trim());
                                item.setSzName(data[3].trim());
                                item.setSzWorkplaceId(data[4].trim());
                                item.setSzSalesType(data[5].trim());
                                item.setSzSalesGroup(data[6].trim());
                                item.setSzTeamId(data[7].trim());
                                item.setSzVehicleId(data[8].trim());
                                item.setSzVehicleName(data[9].trim());
                                item.setSzPoliceNo(data[10].trim());

                                //Karena kalau null --> Kosong ("")                        
                                try {
                                    item.setBaru(data[11].trim().equals("true")?
                                            Boolean.parseBoolean(data[11].trim()):false);
                                    item.setAllowTransfer(data[12].trim().equals("true")? 
                                            Boolean.parseBoolean(data[12].trim()):false);
                                    item.setAktif(data[13].trim().equals("true")? 
                                            Boolean.parseBoolean(data[13].trim()):false);
                                } catch(Exception ex){
                                    logger.error("Error parsing Baru, AllowTransfer, Bonus, Aktif");
                                }

                                if (isOverwrite==1) {
                                    try {
                                        controller.getModel().spEmployeeDao.saveOrUpdate(item);
                                    } catch(Exception ex){
                                        logger.error("Error tMasterSalesmanDao.saveOrUpdate(item)", ex);
                                    }
                                } else {
                                    try {
                                        controller.getModel().spEmployeeDao.save(item);
                                    } catch(Exception ex) {
                                        logger.error("Error tMasterSalesmanDao.save(item)", ex);
                                    }
                                }

                            }
                            pencacah++;
                        }
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(RestoreFileMasterPokari.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (FileNotFoundException ex) {
                    java.util.logging.Logger.getLogger(RestoreFileMasterPokari.class.getName()).log(Level.SEVERE, null, ex);
                }
                
             } else {
                isErr = 1;
            }
            return isErr;
    }
    
}
