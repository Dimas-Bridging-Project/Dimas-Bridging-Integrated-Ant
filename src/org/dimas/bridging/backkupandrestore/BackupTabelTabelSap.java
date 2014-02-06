/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.backkupandrestore;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class BackupTabelTabelSap {
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
  
    public BackupTabelTabelSap() {
        inisialisasi();
    }
    public void inisialisasi(){
        
    }
    
    public void runBackupTabelTabelSap(String destinationPath, String delimeted){
        if (destinationPath.trim().substring(destinationPath.trim().length(), destinationPath.trim().length()) != File.separator) {
            destinationPath += File.separator;
        }
        runBackupTabelKeyAccount(destinationPath, delimeted);
        runBackupTabelOutletChain(destinationPath, delimeted);
        runBackupTabelOutletClass(destinationPath, delimeted);
        runBackupTabelOutletGroup(destinationPath, delimeted);
        runBackupTabelOutletSubGroup(destinationPath, delimeted);
        runBackupTabelOutletLocation(destinationPath, delimeted);
        runBackupTabelOutletSize(destinationPath, delimeted);
        runBackupTabelOutletType(destinationPath, delimeted);
        
        runBackupTabelProdBrand(destinationPath, delimeted);
        runBackupTabelProdCategory(destinationPath, delimeted);
        runBackupTabelProdDivisi(destinationPath, delimeted);
        runBackupTabelProdSize(destinationPath, delimeted);
        runBackupTabelProdSubBrand(destinationPath, delimeted);
        runBackupTabelProdSubCategory(destinationPath, delimeted);
        runBackupTabelProdVariance(destinationPath, delimeted);
        
        
    }
    public void runBackupTabelKeyAccount(String destinationPath, String delimeted) {
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelKeyAccount.txt");
        List<TabelKeyAccount> lst = new ArrayList<>();
        lst = tabelKeyAccountDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("KodeKa" + strDelimeted + "NamaKa" + strDelimeted + "Keterangan");
            for (TabelKeyAccount item : lst) {
                printWriter.print(item.getKodeKa() + strDelimeted);
                printWriter.print(item.getNamaKa() + strDelimeted);
                printWriter.print(item.getKeterangan() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelOutletChain(String destinationPath, String delimeted) {
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelOutletChain.txt");
        List<TabelOutletChain> lst = new ArrayList<>();
        lst = tabelOutletChainDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("KodeChain" + strDelimeted + "NamaChain" );
            for (TabelOutletChain item : lst) {
                printWriter.print(item.getKodeChain() + strDelimeted);
                printWriter.print(item.getNamaChain() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelOutletClass(String destinationPath, String delimeted) {
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelOutletClass.txt");
        List<TabelOutletClass> lst = new ArrayList<>();
        lst = tabelOutletClassDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("ClassId" + strDelimeted + "ClassNm" );
            for (TabelOutletClass item : lst) {
                printWriter.print(item.getClassId() + strDelimeted);
                printWriter.print(item.getClassNm() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelOutletGroup(String destinationPath, String delimeted) {
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelOutletGroup.txt");
        List<TabelOutletGroup> lst = new ArrayList<>();
        lst = tabelOutletGroupDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("GroupId" + strDelimeted + "GroupNm" );
            for (TabelOutletGroup item : lst) {
                printWriter.print(item.getGroupId() + strDelimeted);
                printWriter.print(item.getGroupNm() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelOutletLocation(String destinationPath, String delimeted) {
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelOutletLocation.txt");
        List<TabelOutletLocation> lst = new ArrayList<>();
        lst = tabelOutletLocationDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("KodeLokasi" + strDelimeted + "NamaLokasi" );
            for ( TabelOutletLocation item : lst) {
                printWriter.print(item.getKodeLokasi() + strDelimeted);
                printWriter.print(item.getNamaLokasi() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelOutletSize(String destinationPath, String delimeted){
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelOutletSize.txt");
        List<TabelOutletSize> lst = new ArrayList<>();
        lst = tabelOutletSizeDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("KodeSize" + strDelimeted + "NamaSize" );
            for ( TabelOutletSize item : lst) {
                printWriter.print(item.getKodeSize() + strDelimeted);
                printWriter.print(item.getNamaSize() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelOutletSubGroup(String destinationPath, String delimeted){
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelOutletSubGroup.txt");
        List<TabelOutletSubGroup> lst = new ArrayList<>();
        lst = tabelOutletSubGroupDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("SubGroupId" + strDelimeted + "SubGroupNm" );
            for ( TabelOutletSubGroup item : lst) {
                printWriter.print(item.getSubGroupId() + strDelimeted);
                printWriter.print(item.getSubGroupNm() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelOutletType(String destinationPath, String delimeted) {
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelOutletType.txt");
        List<TabelOutletType> lst = new ArrayList<>();
        lst = tabelOutletTypeDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("KodeType" + strDelimeted + "NamaType" );
            for ( TabelOutletType item : lst) {
                printWriter.print(item.getKodeType() + strDelimeted);
                printWriter.print(item.getNamaType() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    public void runBackupTabelProdBrand(String destinationPath, String delimeted){
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelProdBrand.txt");
        List<TabelProdBrand> lst = new ArrayList<>();
        lst = tabelProdBrandDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("BrandId" + strDelimeted + "BrandNm" );
            for ( TabelProdBrand item : lst) {
                printWriter.print(item.getBrandId() + strDelimeted);
                printWriter.print(item.getBrandNm() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelProdCategory(String destinationPath, String delimeted){
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelProdCategory.txt");
        List<TabelProdCategory> lst = new ArrayList<>();
        lst = tabelProdCategoryDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("CategoryId" + strDelimeted + "CategoryNm" );
            for ( TabelProdCategory item : lst) {
                printWriter.print(item.getCategoryId() + strDelimeted);
                printWriter.print(item.getCategoryNm() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelProdDivisi(String destinationPath, String delimeted){
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelProdDivisi.txt");
        List<TabelProdDivisi> lst = new ArrayList<>();
        lst = tabelProdDivisiDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("DivisiId" + strDelimeted + "DivisiNm" );
            for ( TabelProdDivisi item : lst) {
                printWriter.print(item.getDivisiId() + strDelimeted);
                printWriter.print(item.getDivisiNm() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelProdSize(String destinationPath, String delimeted){
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelProdSize.txt");
        List<TabelProdSize> lst = new ArrayList<>();
        lst = tabelProdSizeDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("SizeId" + strDelimeted + "SizeNm" );
            for ( TabelProdSize item : lst) {
                printWriter.print(item.getSizeId() + strDelimeted);
                printWriter.print(item.getSizeNm() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelProdSubBrand(String destinationPath, String delimeted){
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelProdSubBrand.txt");
        List<TabelProdSubBrand> lst = new ArrayList<>();
        lst = tabelProdSubBrandDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("BrandId" + strDelimeted + "BrandNm" );
            for ( TabelProdSubBrand item : lst) {
                printWriter.print(item.getSubBrandId() + strDelimeted);
                printWriter.print(item.getSubBrandNm() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelProdSubCategory(String destinationPath, String delimeted){
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelProdSubCategory.txt");
        List<TabelProdSubCategory> lst = new ArrayList<>();
        lst = tabelProdSubCategoryDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("SubCategoryId" + strDelimeted + "SubCategoryNm" );
            for (TabelProdSubCategory item : lst) {
                printWriter.print(item.getSubCategoryId() + strDelimeted);
                printWriter.print(item.getSubCategoryNm() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void runBackupTabelProdVariance(String destinationPath, String delimeted){
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TabelProdVariance.txt");
        List<TabelProdVariance> lst = new ArrayList<>();
        lst = tabelProdVarianceDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("VarianceId" + strDelimeted + "VarianceNm" );
            for (TabelProdVariance item : lst) {
                printWriter.print(item.getVarianceId() + strDelimeted);
                printWriter.print(item.getVarianceNm() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BackupTabelTabelSap.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    public static void main(String [] args){
     
        BackupTabelTabelSap f = new BackupTabelTabelSap();
        f.runBackupTabelTabelSap("/home/yhawin/", "COMMA");
    }
    
}
