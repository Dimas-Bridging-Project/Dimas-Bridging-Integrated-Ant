/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.pu
 */
package org.dimas.bridging.backkupandrestore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.config.spring.hibernate.dao.TabelKeyAccountDaoInter;
import org.config.spring.hibernate.dao.TabelOutletChainDaoInter;
import org.config.spring.hibernate.dao.TabelOutletClassDaoInter;
import org.config.spring.hibernate.dao.TabelOutletGroupDaoInter;
import org.config.spring.hibernate.dao.TabelOutletLocationDaoInter;
import org.config.spring.hibernate.dao.TabelOutletSizeDaoInter;
import org.config.spring.hibernate.dao.TabelOutletSubGroupDaoInter;
import org.config.spring.hibernate.dao.TabelOutletTypeDaoInter;
import org.config.spring.hibernate.dao.TabelProdBrandDaoInter;
import org.config.spring.hibernate.dao.TabelProdCategoryDaoInter;
import org.config.spring.hibernate.dao.TabelProdDivisiDaoInter;
import org.config.spring.hibernate.dao.TabelProdSizeDaoInter;
import org.config.spring.hibernate.dao.TabelProdSubBrandDaoInter;
import org.config.spring.hibernate.dao.TabelProdSubCategoryDaoInter;
import org.config.spring.hibernate.dao.TabelProdVarianceDaoInter;
import org.config.spring.hibernate.model.TabelKeyAccount;
import org.config.spring.hibernate.model.TabelOutletChain;
import org.config.spring.hibernate.model.TabelOutletClass;
import org.config.spring.hibernate.model.TabelOutletGroup;
import org.config.spring.hibernate.model.TabelOutletLocation;
import org.config.spring.hibernate.model.TabelOutletSize;
import org.config.spring.hibernate.model.TabelOutletSubGroup;
import org.config.spring.hibernate.model.TabelOutletType;
import org.config.spring.hibernate.model.TabelProdBrand;
import org.config.spring.hibernate.model.TabelProdCategory;
import org.config.spring.hibernate.model.TabelProdDivisi;
import org.config.spring.hibernate.model.TabelProdSize;
import org.config.spring.hibernate.model.TabelProdSubBrand;
import org.config.spring.hibernate.model.TabelProdSubCategory;
import org.config.spring.hibernate.model.TabelProdVariance;
import org.config.spring.provider.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class RestoreTabelTabelSap {
    private static final Logger logger = LoggerFactory.getLogger(RestoreTabelTabelSap.class);
    
    ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
     //Tabel-Tabel
    TabelKeyAccountDaoInter tabelKeyAccountDao = (TabelKeyAccountDaoInter) appContext.getBean("TabelKeyAccountDaoBean");
    TabelOutletChainDaoInter tabelOutletChainDao = (TabelOutletChainDaoInter) appContext.getBean("TabelOutletChainDaoBean");
    TabelOutletClassDaoInter tabelOutletClassDao = (TabelOutletClassDaoInter) appContext.getBean("TabelOutletClassDaoBean");
    TabelOutletGroupDaoInter tabelOutletGroupDao = (TabelOutletGroupDaoInter) appContext.getBean("TabelOutletGroupDaoBean");
    TabelOutletLocationDaoInter tabelOutletLocationDao = (TabelOutletLocationDaoInter) appContext.getBean("TabelOutletLocationDaoBean");
    TabelOutletSizeDaoInter tabelOutletSizeDao = (TabelOutletSizeDaoInter) appContext.getBean("TabelOutletSizeDaoBean");
    TabelOutletSubGroupDaoInter tabelOutletSubGroupDao = (TabelOutletSubGroupDaoInter) appContext.getBean("TabelOutletSubGroupDaoBean");
    TabelOutletTypeDaoInter tabelOutletTypeDao = (TabelOutletTypeDaoInter) appContext.getBean("TabelOutletTypeDaoBean");
    
    TabelProdBrandDaoInter tabelProdBrandDao = (TabelProdBrandDaoInter) appContext.getBean("TabelProdBrandDaoBean");
    TabelProdCategoryDaoInter tabelProdCategoryDao = (TabelProdCategoryDaoInter) appContext.getBean("TabelProdCategoryDaoBean");
    TabelProdDivisiDaoInter tabelProdDivisiDao = (TabelProdDivisiDaoInter) appContext.getBean("TabelProdDivisiDaoBean");
    TabelProdSizeDaoInter tabelProdSizeDao = (TabelProdSizeDaoInter) appContext.getBean("TabelProdSizeDaoBean");
    TabelProdSubBrandDaoInter tabelProdSubBrandDao = (TabelProdSubBrandDaoInter) appContext.getBean("TabelProdSubBrandDaoBean");
    TabelProdSubCategoryDaoInter tabelProdSubCategoryDao = (TabelProdSubCategoryDaoInter) appContext.getBean("TabelProdSubCategoryDaoBean");
    TabelProdVarianceDaoInter tabelProdVarianceDao = (TabelProdVarianceDaoInter) appContext.getBean("TabelProdVarianceDaoBean");    

    public RestoreTabelTabelSap() {
    }
    
    public void runRestoreTabelTabelSap(String sourcePath, int isOverwrite, int isGantiBaru){
        try {
            if (sourcePath.trim().substring(sourcePath.trim().length(), sourcePath.trim().length()) != File.separator) {
                sourcePath += File.separator;
            }
            runRestoreTabelKeyAccount(sourcePath, isOverwrite, isGantiBaru);
            
            runRestoreTabelOutletChain(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelOutletClass(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelOutletGroup(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelOutletLocation(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelOutletSize(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelOutletSubGroup(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelOutletType(sourcePath, isOverwrite, isGantiBaru);
            
            runRestoreTabelProdBrand(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelProdCategory(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelProdDivisi(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelProdSize(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelProdSubBrand(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelProdSubCategory(sourcePath, isOverwrite, isGantiBaru);
            runRestoreTabelProdVariance(sourcePath, isOverwrite, isGantiBaru);    
            
        } catch (FileNotFoundException ex) {
            logger.error("Restore Tabel-tabel All SAP", ex);
        } catch (IOException ex) {
            logger.error("Restore Tabel-tabel All SAP", ex);
        }
    }
    
    public int runRestoreTabelKeyAccount(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException {
            if (isGantiBaru==1){
                List<TabelKeyAccount> lst = tabelKeyAccountDao.findAll();
                for (TabelKeyAccount itm : lst) {
                    tabelKeyAccountDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelKeyAccount.txt");
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
                        TabelKeyAccount item = new TabelKeyAccount();
                        item.setKodeKa(data[0].trim());
                        item.setNamaKa(data[1].trim());
                        try{
                            item.setKeterangan(data[2].trim());
                        } catch(Exception ex){}
                        
                        if (isOverwrite==1) {
                            tabelKeyAccountDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelKeyAccountDao.save(item);
                            } catch(Exception ex) {
                                logger.error("tabelKeyAccountDao.save(item)", ex);
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
    
    public int runRestoreTabelOutletChain(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException {
             if (isGantiBaru==1){
                List<TabelOutletChain> lst = tabelOutletChainDao.findAll();
                for ( TabelOutletChain itm : lst) {
                    tabelOutletChainDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelOutletChain.txt");
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
                        TabelOutletChain item = new TabelOutletChain();
                        item.setKodeChain(data[0].trim());
                        item.setNamaChain(data[1].trim());
                        if (isOverwrite==1) {
                            tabelOutletChainDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelOutletChainDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelOutletChainDao.save(item)", ex);
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
    
    public int runRestoreTabelOutletClass(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException {
             if (isGantiBaru==1){
                List<TabelOutletClass> lst = tabelOutletClassDao.findAll();
                for (TabelOutletClass itm : lst) {
                    tabelOutletClassDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelOutletClass.txt");
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
                        TabelOutletClass item = new TabelOutletClass();
                        item.setClassId(data[0].trim());
                        item.setClassNm(data[1].trim());
                        if (isOverwrite==1) {
                            tabelOutletClassDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelOutletClassDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelOutletClassDao.save(item)", ex);
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
    
    public int runRestoreTabelOutletGroup(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException {
             if (isGantiBaru==1){
                List<TabelOutletGroup> lst = tabelOutletGroupDao.findAll();
                for (TabelOutletGroup itm : lst) {
                    tabelOutletGroupDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelOutletGroup.txt");
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
                        TabelOutletGroup item = new TabelOutletGroup();
                        item.setGroupId(data[0].trim());
                        item.setGroupNm(data[1].trim());
                        if (isOverwrite==1) {
                            tabelOutletGroupDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelOutletGroupDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelOutletGroupDao.save(item)", ex);
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
    
    public int runRestoreTabelOutletLocation(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException {
            
             if (isGantiBaru==1){
                List<TabelOutletLocation> lst = tabelOutletLocationDao.findAll();
                for (TabelOutletLocation itm : lst) {
                    tabelOutletLocationDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelOutletLocation.txt");
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
                        TabelOutletLocation item = new TabelOutletLocation();
                        item.setKodeLokasi(data[0].trim());
                        item.setNamaLokasi(data[1].trim());
                        if (isOverwrite==1) {
                            tabelOutletLocationDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelOutletLocationDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelOutletLocationDao.save(item)", ex);
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
    
    public int runRestoreTabelOutletSize(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException{
             if (isGantiBaru==1){
                List<TabelOutletSize> lst = tabelOutletSizeDao.findAll();
                for (TabelOutletSize itm : lst) {
                    tabelOutletSizeDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelOutletSize.txt");
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
                        TabelOutletSize item = new TabelOutletSize();
                        item.setKodeSize(data[0].trim());
                        item.setNamaSize(data[1].trim());
                        if (isOverwrite==1) {
                            tabelOutletSizeDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelOutletSizeDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelOutletSizeDao.save(item)", ex);
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
    
    public int runRestoreTabelOutletSubGroup(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException{
             if (isGantiBaru==1){
                List<TabelOutletSubGroup> lst = tabelOutletSubGroupDao.findAll();
                for (TabelOutletSubGroup itm : lst) {
                    tabelOutletSubGroupDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelOutletSubGroup.txt");
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
                        TabelOutletSubGroup item = new TabelOutletSubGroup();
                        item.setSubGroupId(data[0].trim());
                        item.setSubGroupNm(data[1].trim());
                        if (isOverwrite==1) {
                            tabelOutletSubGroupDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelOutletSubGroupDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelOutletSubGroupDao.save(item)", ex);
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
    
    public int runRestoreTabelOutletType(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException {
             if (isGantiBaru==1){
                List<TabelOutletType> lst = tabelOutletTypeDao.findAll();
                for (TabelOutletType itm : lst) {
                    tabelOutletTypeDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelOutletType.txt");
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
                        TabelOutletType item = new TabelOutletType();
                        item.setKodeType(data[0].trim());
                        item.setNamaType(data[1].trim());
                        if (isOverwrite==1) {
                            tabelOutletTypeDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelOutletTypeDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelOutletTypeDao.save(item)", readByte, ex);
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
    
    public int runRestoreTabelProdBrand(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException{
             if (isGantiBaru==1){
                List<TabelProdBrand> lst = tabelProdBrandDao.findAll();
                for (TabelProdBrand itm : lst) {
                    tabelProdBrandDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelProdBrand.txt");
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
                        TabelProdBrand item = new TabelProdBrand();
                        item.setBrandId(data[0].trim());
                        item.setBrandNm(data[1].trim());
                        if (isOverwrite==1) {
                            tabelProdBrandDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelProdBrandDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelProdBrandDao.save(item)", ex);
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
    public int runRestoreTabelProdCategory(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException{
             if (isGantiBaru==1){
                List<TabelProdCategory> lst = tabelProdCategoryDao.findAll();
                for (TabelProdCategory itm : lst) {
                    tabelProdCategoryDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelProdCategory.txt");
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
                        TabelProdCategory item = new TabelProdCategory();
                        item.setCategoryId(data[0].trim());
                        item.setCategoryNm(data[1].trim());
                        if (isOverwrite==1) {
                            tabelProdCategoryDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelProdCategoryDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelProdCategoryDao.save(item)", ex);
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
    
    public int runRestoreTabelProdDivisi(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException{
             if (isGantiBaru==1){
                List<TabelProdDivisi> lst = tabelProdDivisiDao.findAll();
                for (TabelProdDivisi itm : lst) {
                    tabelProdDivisiDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelProdDivisi.txt");
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
                        TabelProdDivisi item = new TabelProdDivisi();
                        item.setDivisiId(data[0].trim());
                        item.setDivisiNm(data[1].trim());
                        if (isOverwrite==1) {
                            tabelProdDivisiDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelProdDivisiDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelProdDivisiDao.save(item)", ex);
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
    public int runRestoreTabelProdSize(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException{
             if (isGantiBaru==1){
                List<TabelProdSize> lst = tabelProdSizeDao.findAll();
                for (TabelProdSize itm : lst) {
                    tabelProdSizeDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelProdSize.txt");
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
                        TabelProdSize item = new TabelProdSize();
                        item.setSizeId(data[0].trim());
                        item.setSizeNm(data[1].trim());
                        if (isOverwrite==1) {
                            tabelProdSizeDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelProdSizeDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelProdSizeDao.save(item)", ex);
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
    public int runRestoreTabelProdSubBrand(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException{
             if (isGantiBaru==1){
                List<TabelProdSubBrand> lst = tabelProdSubBrandDao.findAll();
                for (TabelProdSubBrand itm : lst) {
                    tabelProdSubBrandDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelProdSubBrand.txt");
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
                        TabelProdSubBrand item = new TabelProdSubBrand();
                        item.setSubBrandId(data[0].trim());
                        item.setSubBrandNm(data[1].trim());
                        if (isOverwrite==1) {
                            tabelProdSubBrandDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelProdSubBrandDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelProdSubBrandDao.save(item)", ex);
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
    public int runRestoreTabelProdSubCategory(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException{
             if (isGantiBaru==1){
                List<TabelProdSubCategory> lst = tabelProdSubCategoryDao.findAll();
                for (TabelProdSubCategory itm : lst) {
                    tabelProdSubCategoryDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelProdSubCategory.txt");
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
                        TabelProdSubCategory item = new TabelProdSubCategory();
                        item.setSubCategoryId(data[0].trim());
                        item.setSubCategoryNm(data[1].trim());
                        if (isOverwrite==1) {
                            tabelProdSubCategoryDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelProdSubCategoryDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelProdSubCategoryDao.save(item)", ex);
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
    public int runRestoreTabelProdVariance(String sourcePath, int isOverwrite, int isGantiBaru) throws FileNotFoundException, IOException{
             if (isGantiBaru==1){
                List<TabelProdVariance> lst = tabelProdVarianceDao.findAll();
                for (TabelProdVariance itm : lst) {
                    tabelProdVarianceDao.delete(itm);
                }
            }
            int isErr = 0;
            File filePath = new File(sourcePath + "TabelProdVariance.txt");
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
                        TabelProdVariance item = new TabelProdVariance();
                        item.setVarianceId(data[0].trim());
                        item.setVarianceNm(data[1].trim());
                        if (isOverwrite==1) {
                            tabelProdVarianceDao.saveOrUpdate(item);
                        } else {
                            try {
                                tabelProdVarianceDao.save(item);
                            } catch(Exception ex) {
                                logger.error("Error tabelProdVarianceDao.save(item)", ex);
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
    
    public static void main(String [] args){
     
        RestoreTabelTabelSap f = new RestoreTabelTabelSap();
        f.runRestoreTabelTabelSap("/home/yhawin/coba", 1, 1);
    }
  
}
