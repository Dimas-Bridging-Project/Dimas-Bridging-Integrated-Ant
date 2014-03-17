/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.app.model;

import java.util.ArrayList;
import java.util.List;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.config.spring.hibernate.model.TMasterProduct;
import org.config.spring.hibernate.model.TMasterSalesman;
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.config.spring.hibernate.model.pokari.MappingProduct;
import org.config.spring.hibernate.model.pokari.SpEmployee;
import org.config.spring.hibernate.model.pokari.TMasterProductPokari;
import static org.dimas.bridging.app.model.BridgingModelInit.logger;

/**
 *
 * @author yhawin
 */
public class BridgingModel extends BridgingModelInit{
    public void loadMappingProductToMem(){
         if (databaseMode==false){
                if (isLoadMappingProductToMem==false) {                    
                    List<MappingProduct> mappingProducts = new ArrayList<>();
                    mappingProducts = mappingProductDao.findAll();
                    
//                    System.out.println("OKE MAPPING: " + mappingProducts.size());
                    
                    try {                        
                        for (MappingProduct mappingProduct: mappingProducts){
                            mappingProductDaoMem.saveOrUpdate(mappingProduct);
                        }
                    } catch(Exception ex){
                        logger.error("error MappingProductDao --> MappingProductDaoMem", ex);
                    }
                    
//                    System.out.println("OKE MAMPPING AFTER : " + mappingProductDaoMem.getAll().size());
                    
                    isLoadMappingProductToMem = true;
                }
         }       
         
    }
    public void loadMappingArCustomerToMem(){
         if (databaseMode==false){
                if (isLoadMappingArCustomerToMem==false) {
                    List<ArCustomer> mappingArCustomers = new ArrayList<>();
                    mappingArCustomers = arCustomerDao.findAll();
                    try {                        
                        for (ArCustomer mappingArCustomer: mappingArCustomers){
                            arCustomerDaoMem.saveOrUpdate(mappingArCustomer);
                        }
                    } catch(Exception ex){
                        logger.error("error MappingArCustomerDao --> MappingArCustomerDaoMem", ex);
                    }
                    isLoadMappingArCustomerToMem = true;
                }
         }       
    }
    public void loadMappingSpEmployeeToMem(){
         if (databaseMode==false){
                if (isLoadMappingSpEmployeeToMem == false) {
                    List<SpEmployee> spEmployees = new ArrayList<>();
                    spEmployees = spEmployeeDao.findAll();
                    try {                        
                        for (SpEmployee spEmployee: spEmployees){
                            spEmployeeDaoMem.saveOrUpdate(spEmployee);
                        }
                    } catch(Exception ex){
                        logger.error("error SpEmployeeDao --> SpEmployeeDaoMem", ex);
                    }
                    isLoadMappingSpEmployeeToMem = true;
                }
         }       
    }
     public void loadTMasterProductToMem(){
         if (databaseMode==false){
                if (isLoadTMasterProductToMem==false) {
                    List<TMasterProduct> lstTMasterProduct = new ArrayList<>();
                    lstTMasterProduct = tMasterProductDao.findAll();
                    try {                        
                        for (TMasterProduct itemTMasterProduct: lstTMasterProduct){
                            tMasterProductDaoMem.saveOrUpdate(itemTMasterProduct);
                        }
                    } catch(Exception ex){
                        logger.error("error TMasterProductDao --> TMasterProductDaoMem", ex);
                    }
                    isLoadTMasterProductToMem=true;
                }
         }       
     }
     
     public void loadTMasterProductPokariToMem(){
         if (databaseMode==false){
                if (isLoadTMasterProductPokariToMem==false) {
                    List<TMasterProductPokari> lstTMasterProductPokari = new ArrayList<>();
                    lstTMasterProductPokari = tMasterProductPokariDao.findAll();
                    try {                        
                        for (TMasterProductPokari itemTMasterProductPokari: lstTMasterProductPokari){
                            tMasterProductPokariDaoMem.saveOrUpdate(itemTMasterProductPokari);
                        }
                    } catch(Exception ex){
                        logger.error("error TMasterProductPokariDao --> TMasterProductPokariDaoMem", ex);
                    }
                    isLoadTMasterProductPokariToMem=true;
                }
         }       
     }

     public void loadTMasterOutletToMem(){
         if (databaseMode==false){
                if (isLoadTMasterOutletToMem==false){
                    List<TMasterOutlet> lstTMasterOutlet = new ArrayList<>();
                    lstTMasterOutlet = tMasterOutletDao.findAll();
                    try {
                        for (TMasterOutlet itemTMasterOutlet: lstTMasterOutlet){
                            tMasterOutletDaoMem.saveOrUpdate(itemTMasterOutlet);
                        }
                    } catch (Exception ex){
                        logger.error("error TMasterOutletDao --> TMasterOutletDaoMem", ex);
                    }
                    isLoadTMasterOutletToMem=true;
                }
         }       
     }
     public void loadTMasterSalesmanToMem(){
         if (databaseMode==false){
                if (isLoadTMasterSalesmanToMem==false){
                    List<TMasterSalesman> lstTMasterSalesman = new ArrayList<>();
                    lstTMasterSalesman = tMasterSalesmanDao.findAll();
                    try {
                        for (TMasterSalesman itemTMasterSalesman: lstTMasterSalesman){
                            tMasterSalesmanDaoMem.saveOrUpdate(itemTMasterSalesman);
                        }
                    } catch(Exception ex){
                        logger.error("error TMasterSalesmanDao --> TMasterSalesmanDaoMem", ex);
                    }
                    isLoadTMasterSalesmanToMem=true;
                }
         }       
     }

     
}
