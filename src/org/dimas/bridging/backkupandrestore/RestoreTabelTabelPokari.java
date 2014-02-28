/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.pu
 */
package org.dimas.bridging.backkupandrestore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.config.spring.hibernate.model.pokari.CustomerGroup;
import org.config.spring.hibernate.model.pokari.CustomerHirarchy;
import org.config.spring.hibernate.model.pokari.GroupSales;
import org.config.spring.hibernate.model.pokari.ProductBrand;
import org.config.spring.hibernate.model.pokari.SalesTerritory;
import org.config.spring.hibernate.model.pokari.TeamSales;
import org.config.spring.hibernate.model.pokari.TypeSales;
import org.config.spring.hibernate.model.pokari.WorkPlace;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class RestoreTabelTabelPokari {
    private static final Logger logger = LoggerFactory.getLogger(RestoreTabelTabelPokari.class);
    BridgingController controller;

    public RestoreTabelTabelPokari(BridgingController controller) {
        this.controller = controller;
    }
    
    public void runRestoreTabelTabelPokari(String sourcePath, int isOverwrite, int isGantiBaru){
            if (sourcePath.trim().substring(sourcePath.trim().length(), sourcePath.trim().length()) != File.separator) {
                sourcePath += File.separator;
            }
            
            runRestoreTabelPokariCustomerGroup(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelPokariCustomerHirarchy(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelPokariGroupSales(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelPokariProductBrand(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelPokariSalesTerritory(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelPokariTeamSales(sourcePath, isOverwrite, isGantiBaru);   
            runRestoreTabelPokariTypeSales(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelPokariWorkplace(sourcePath, isOverwrite, isGantiBaru);

            
    }
    
    
    public int runRestoreTabelPokariCustomerGroup(String sourcePath, int isOverwrite, int isGantiBaru) {
            if (isGantiBaru==1){
                List<CustomerGroup> lst = controller.getModel().customerGroupDao.findAll();
                for (CustomerGroup  itm : lst) {
                    controller.getModel().customerGroupDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "CustomerGroup.txt");
            if (filePath.exists()) {
                Reader readerFile;
                BufferedReader bufReadFile;
                 try {
                        readerFile = new FileReader(filePath);
                        bufReadFile = new BufferedReader(readerFile);

                        String readByte;
                        int pencacah=0;
                        while (( readByte = bufReadFile.readLine()) != null) {
                            if (pencacah>0) { //header tidak boleh dimasukkan
                                String [] data = readByte.split("\\t");  
                                if (data.length<=2) {
                                    data = readByte.split("\\,");  
                                }
                                CustomerGroup item = new CustomerGroup();                                
                                item.setIsDefault(data[0].trim()=="true"?true:null);
                                item.setIdGroup(data[1].trim());
                                item.setDescription(data[2].trim());
                                if (isOverwrite==1) {
                                    controller.getModel().customerGroupDao.saveOrUpdate(item);
                                } else {
                                    try {
                                        controller.getModel().customerGroupDao.save(item);
                                    } catch(Exception ex) {
                                        logger.error("Error save(item) Restore TabelTabelPokari", ex);
                                    }
                                }

                            }
                            pencacah++;
                        }
                        bufReadFile.close();
                        readerFile.close();
                 } catch (IOException ex) {
                     logger.error("Error : + " + RestoreTabelTabelPokari.class.getName());
                 }
             } else {
                isErr = 1;
            }
            return isErr;
   }
    public int runRestoreTabelPokariCustomerHirarchy(String sourcePath, int isOverwrite, int isGantiBaru) {
             if (isGantiBaru==1){
                List<CustomerHirarchy> lst = controller.getModel().customerHirarchyDao.findAll();
                for (CustomerHirarchy  itm : lst) {
                    controller.getModel().customerHirarchyDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "CustomerHirarchy.txt");
            if (filePath.exists()) {
                Reader readerFile;
                BufferedReader bufReadFile;
                 try {
                        readerFile = new FileReader(filePath);
                        bufReadFile = new BufferedReader(readerFile);

                        String readByte;
                        int pencacah=0;
                        while (( readByte = bufReadFile.readLine()) != null) {
                            if (pencacah>0) { //header tidak boleh dimasukkan
                                String [] data = readByte.split("\\t");  
                                if (data.length<=2) {
                                    data = readByte.split("\\,");  
                                }
                                CustomerHirarchy item = new CustomerHirarchy();                                
                                item.setIsDefault(data[0].trim()=="true"?true:null);
                                item.setIdHirarchy(data[1].trim());
                                item.setDescription(data[2].trim());
                                if (isOverwrite==1) {
                                    controller.getModel().customerHirarchyDao.saveOrUpdate(item);
                                } else {
                                    try {
                                        controller.getModel().customerHirarchyDao.save(item);
                                    } catch(Exception ex) {
                                        logger.error("Error save(item) Restore TabelTabelPokari", ex);
                                    }
                                }

                            }
                            pencacah++;
                        }
                        bufReadFile.close();
                        readerFile.close();
                 } catch (IOException ex) {
                     logger.error("Error : + " + RestoreTabelTabelPokari.class.getName());
                 }
             } else {
                isErr = 1;
            }
            return isErr;
   }    
    public int runRestoreTabelPokariGroupSales(String sourcePath, int isOverwrite, int isGantiBaru) {
             if (isGantiBaru==1){
                List<GroupSales> lst = controller.getModel().groupSalesDao.findAll();
                for (GroupSales  itm : lst) {
                    controller.getModel().groupSalesDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "GroupSales.txt");
            if (filePath.exists()) {
                Reader readerFile;
                BufferedReader bufReadFile;
                 try {
                        readerFile = new FileReader(filePath);
                        bufReadFile = new BufferedReader(readerFile);

                        String readByte;
                        int pencacah=0;
                        while (( readByte = bufReadFile.readLine()) != null) {
                            if (pencacah>0) { //header tidak boleh dimasukkan
                                String [] data = readByte.split("\\t");  
                                if (data.length<=2) {
                                    data = readByte.split("\\,");  
                                }
                                GroupSales item = new GroupSales();                                
                                item.setIsDefault(data[0].trim()=="true"?true:null);
                                item.setTypeGroup(data[1].trim());
                                item.setName(data[2].trim());
                                if (isOverwrite==1) {
                                    controller.getModel().groupSalesDao.saveOrUpdate(item);
                                } else {
                                    try {
                                        controller.getModel().groupSalesDao.save(item);
                                    } catch(Exception ex) {
                                        logger.error("Error save(item) Restore TabelTabelPokari", ex);
                                    }
                                }

                            }
                            pencacah++;
                        }
                        bufReadFile.close();
                        readerFile.close();
                 } catch (IOException ex) {
                     logger.error("Error : + " + RestoreTabelTabelPokari.class.getName());
                 }
             } else {
                isErr = 1;
            }
            return isErr;
   }    
    public int runRestoreTabelPokariProductBrand(String sourcePath, int isOverwrite, int isGantiBaru) {
             if (isGantiBaru==1){
                List<ProductBrand> lst = controller.getModel().productBrandDao.findAll();
                for (ProductBrand  itm : lst) {
                    controller.getModel().productBrandDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "ProductBrand.txt");
            if (filePath.exists()) {
                Reader readerFile;
                BufferedReader bufReadFile;
                 try {
                        readerFile = new FileReader(filePath);
                        bufReadFile = new BufferedReader(readerFile);

                        String readByte;
                        int pencacah=0;
                        while (( readByte = bufReadFile.readLine()) != null) {
                            if (pencacah>0) { //header tidak boleh dimasukkan
                                String [] data = readByte.split("\\t");  
                                if (data.length<=2) {
                                    data = readByte.split("\\,");  
                                }
                                ProductBrand item = new ProductBrand();                                
                                item.setIsDefault(data[0].trim()=="true"?true:null);
                                item.setSzBrandId(data[1].trim());
                                item.setSzName(data[2].trim());
                                item.setSzHirarchyId(data[3].trim());
                                if (isOverwrite==1) {
                                    controller.getModel().productBrandDao.saveOrUpdate(item);
                                } else {
                                    try {
                                        controller.getModel().productBrandDao.save(item);
                                    } catch(Exception ex) {
                                        logger.error("Error save(item) Restore TabelTabelPokari", ex);
                                    }
                                }

                            }
                            pencacah++;
                        }
                        bufReadFile.close();
                        readerFile.close();
                 } catch (IOException ex) {
                     logger.error("Error : + " + RestoreTabelTabelPokari.class.getName());
                 }
             } else {
                isErr = 1;
            }
            return isErr;
   }
    public int runRestoreTabelPokariSalesTerritory(String sourcePath, int isOverwrite, int isGantiBaru) {
             if (isGantiBaru==1){
                List<SalesTerritory> lst = controller.getModel().salesTerritoryDao.findAll();
                for (SalesTerritory  itm : lst) {
                    controller.getModel().salesTerritoryDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "SalesTerritory.txt");
            if (filePath.exists()) {
                Reader readerFile;
                BufferedReader bufReadFile;
                 try {
                        readerFile = new FileReader(filePath);
                        bufReadFile = new BufferedReader(readerFile);

                        String readByte;
                        int pencacah=0;
                        while (( readByte = bufReadFile.readLine()) != null) {
                            if (pencacah>0) { //header tidak boleh dimasukkan
                                String [] data = readByte.split("\\t");  
                                if (data.length<=2) {
                                    data = readByte.split("\\,");  
                                }
                                SalesTerritory item = new SalesTerritory();                                
                                item.setIsDefault(data[0].trim()=="true"?true:null);
                                item.setIdTerritory(data[1].trim());
                                item.setDescription(data[2].trim());
                                if (isOverwrite==1) {
                                    controller.getModel().salesTerritoryDao.saveOrUpdate(item);
                                } else {
                                    try {
                                        controller.getModel().salesTerritoryDao.save(item);
                                    } catch(Exception ex) {
                                        logger.error("Error save(item) Restore TabelTabelPokari", ex);
                                    }
                                }

                            }
                            pencacah++;
                        }
                        bufReadFile.close();
                        readerFile.close();
                 } catch (IOException ex) {
                     logger.error("Error : + " + RestoreTabelTabelPokari.class.getName());
                 }
             } else {
                isErr = 1;
            }
            return isErr;
   }    
    public int runRestoreTabelPokariTeamSales(String sourcePath, int isOverwrite, int isGantiBaru) {
             if (isGantiBaru==1){
                List<TeamSales> lst = controller.getModel().teamSalesDao.findAll();
                for (TeamSales  itm : lst) {
                    controller.getModel().teamSalesDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TeamSales.txt");
            if (filePath.exists()) {
                Reader readerFile;
                BufferedReader bufReadFile;
                 try {
                        readerFile = new FileReader(filePath);
                        bufReadFile = new BufferedReader(readerFile);

                        String readByte;
                        int pencacah=0;
                        while (( readByte = bufReadFile.readLine()) != null) {
                            if (pencacah>0) { //header tidak boleh dimasukkan
                                String [] data = readByte.split("\\t");  
                                if (data.length<=2) {
                                    data = readByte.split("\\,");  
                                }
                                TeamSales item = new TeamSales();                                
                                item.setIsDefault(data[0].trim()=="true"?true:null);
                                item.setTeamId(data[1].trim());
                                item.setName(data[2].trim());
                                if (isOverwrite==1) {
                                    controller.getModel().teamSalesDao.saveOrUpdate(item);
                                } else {
                                    try {
                                        controller.getModel().teamSalesDao.save(item);
                                    } catch(Exception ex) {
                                        logger.error("Error save(item) Restore TabelTabelPokari", ex);
                                    }
                                }

                            }
                            pencacah++;
                        }
                        bufReadFile.close();
                        readerFile.close();
                 } catch (IOException ex) {
                     logger.error("Error : + " + RestoreTabelTabelPokari.class.getName());
                 }
             } else {
                isErr = 1;
            }
            return isErr;
   }
    public int runRestoreTabelPokariTypeSales(String sourcePath, int isOverwrite, int isGantiBaru) {
             if (isGantiBaru==1){
                List<TypeSales> lst = controller.getModel().typeSalesDao.findAll();
                for (TypeSales  itm : lst) {
                    controller.getModel().typeSalesDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TypeSales.txt");
            if (filePath.exists()) {
                Reader readerFile;
                BufferedReader bufReadFile;
                 try {
                        readerFile = new FileReader(filePath);
                        bufReadFile = new BufferedReader(readerFile);

                        String readByte;
                        int pencacah=0;
                        while (( readByte = bufReadFile.readLine()) != null) {
                            if (pencacah>0) { //header tidak boleh dimasukkan
                                String [] data = readByte.split("\\t");  
                                if (data.length<=2) {
                                    data = readByte.split("\\,");  
                                }
                                TypeSales item = new TypeSales();                                
                                item.setIsDefault(data[0].trim()=="true"?true:null);
                                item.setTypeSales(data[1].trim());
                                item.setName(data[2].trim());
                                if (isOverwrite==1) {
                                    controller.getModel().typeSalesDao.saveOrUpdate(item);
                                } else {
                                    try {
                                        controller.getModel().typeSalesDao.save(item);
                                    } catch(Exception ex) {
                                        logger.error("Error save(item) Restore TabelTabelPokari", ex);
                                    }
                                }

                            }
                            pencacah++;
                        }
                        bufReadFile.close();
                        readerFile.close();
                 } catch (IOException ex) {
                     logger.error("Error : + " + RestoreTabelTabelPokari.class.getName());
                 }
             } else {
                isErr = 1;
            }
            return isErr;
   }
    public int runRestoreTabelPokariWorkplace(String sourcePath, int isOverwrite, int isGantiBaru) {
             if (isGantiBaru==1){
                List<WorkPlace> lst = controller.getModel().workplaceDao.findAll();
                for (WorkPlace  itm : lst) {
                    controller.getModel().workplaceDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "Workplace.txt");
            if (filePath.exists()) {
                Reader readerFile;
                BufferedReader bufReadFile;
                 try {
                        readerFile = new FileReader(filePath);
                        bufReadFile = new BufferedReader(readerFile);

                        String readByte;
                        int pencacah=0;
                        while (( readByte = bufReadFile.readLine()) != null) {
                            if (pencacah>0) { //header tidak boleh dimasukkan
                                String [] data = readByte.split("\\t");  
                                if (data.length<=2) {
                                    data = readByte.split("\\,");  
                                }
                                WorkPlace item = new WorkPlace();                                
                                item.setIsDefault(data[0].trim()=="true"?true:null);
                                item.setWorkPlaceId(data[1].trim());
                                item.setArea(data[2].trim());
                                if (isOverwrite==1) {
                                    controller.getModel().workplaceDao.saveOrUpdate(item);
                                } else {
                                    try {
                                        controller.getModel().workplaceDao.save(item);
                                    } catch(Exception ex) {
                                        logger.error("Error save(item) Restore TabelTabelPokari", ex);
                                    }
                                }

                            }
                            pencacah++;
                        }
                        bufReadFile.close();
                        readerFile.close();
                 } catch (IOException ex) {
                     logger.error("Error : + " + RestoreTabelTabelPokari.class.getName());
                 }
             } else {
                isErr = 1;
            }
            return isErr;
   }
    
    
    public static void main(String [] args){
    }
  
}
