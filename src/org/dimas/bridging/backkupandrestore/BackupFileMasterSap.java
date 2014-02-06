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
public class BackupFileMasterSap {
    private static final Logger logger = LoggerFactory.getLogger(BackupFileMasterSap.class);
    
    ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
    
    TMasterProductDaoInter tMasterProductDao = (TMasterProductDaoInter) appContext.getBean("TMasterProductDaoBean");
    TMasterOutletDaoInter tMasterOutletDao = (TMasterOutletDaoInter) appContext.getBean("TMasterOutletDaoBean");
    TMasterSalesmanDaoInter tMasterSalesmanDao = (TMasterSalesmanDaoInter) appContext.getBean("TMasterSalesmanDaoBean");

    public BackupFileMasterSap() {
        inisialisasi();
    }
    public void inisialisasi(){
    
    }
    public void runBackupMasterSap(String destinationPath, String delimeted){
        runBackupMasterProduct(destinationPath, delimeted);
        runBackupMasterOutlet(destinationPath, delimeted);
        runBackupMasterSalesman(destinationPath, delimeted);
    }    

    public void runBackupMasterProduct(String destinationPath, String delimeted) {
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        
        File filePath = new File(destinationPath + "TMasterProduct.txt");
        List<TMasterProduct> lst = new ArrayList<>();
        lst = tMasterProductDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("DistId" + strDelimeted + "DistNm"+ strDelimeted + "PcodeScylla" + strDelimeted + "PcodeSap" + strDelimeted  
                    + "PnameSap" + strDelimeted + "AreaId" + strDelimeted + "AreaNm" + strDelimeted + "KodeBrand" + strDelimeted + "NamaBrand" + strDelimeted  
                    + "KodeCategory" + strDelimeted + "NamaCategory" + strDelimeted + "KodeDivisi" + strDelimeted  
                    + "NamaDivisi" + strDelimeted + "KodeSize" + strDelimeted + "NamaSize" + strDelimeted + "KodeSubBrand" + strDelimeted 
                    + "NamaSubBrand" + strDelimeted + "KodeSubCategory" + strDelimeted + "NamaSubCategory" + strDelimeted
                    + "KodeVariance" + strDelimeted + "NamaVariance"+ strDelimeted 
                    + "Baru" + strDelimeted + "AllowTransfer"+ strDelimeted + "Bonus" + strDelimeted + "Aktif"+ strDelimeted 
                    + "*");
            for (TMasterProduct item : lst) {
                printWriter.print((item.getDistId()!=null?item.getDistId():"") + strDelimeted);
                printWriter.print((item.getDistNm()!=null?item.getDistNm():"") + strDelimeted);
                printWriter.print((item.getPcodeScylla()!=null?item.getPcodeScylla():"")+ strDelimeted);
                printWriter.print((item.getPcodeSap()!=null?item.getPcodeSap():"") + strDelimeted);
                
                printWriter.print((item.getPnameSap()!=null?item.getPnameSap():"") + strDelimeted);
                printWriter.print((item.getAreaId()!=null?item.getAreaId():"") + strDelimeted);
                printWriter.print((item.getAreaNm()!=null?item.getAreaNm():"") + strDelimeted);
                printWriter.print((item.getKodeBrand()!=null?item.getKodeBrand():"") + strDelimeted);
                printWriter.print((item.getNamaBrand()!=null?item.getNamaBrand():"") + strDelimeted);
                
                printWriter.print((item.getKodeCategory()!=null?item.getKodeCategory():"") + strDelimeted);
                printWriter.print((item.getNamaCategory()!=null?item.getNamaCategory():"") + strDelimeted);
                printWriter.print((item.getKodeDivisi()!=null?item.getKodeDivisi():"") + strDelimeted);
                
                printWriter.print((item.getNamaDivisi()!=null?item.getNamaDivisi():"") + strDelimeted);
                printWriter.print((item.getKodeSize()!=null?item.getKodeSize():"") + strDelimeted);
                printWriter.print((item.getNamaSize()!=null?item.getNamaSize():"") + strDelimeted);
                printWriter.print((item.getKodeSubBrand()!=null?item.getKodeSubBrand():"") + strDelimeted);
                
                printWriter.print((item.getNamaSubBrand()!=null?item.getNamaSubBrand():"") + strDelimeted);
                printWriter.print((item.getKodeSubCategory()!=null?item.getKodeSubCategory():"") + strDelimeted);
                printWriter.print((item.getNamaSubCategory()!=null?item.getNamaSubCategory():"") + strDelimeted);
                
                printWriter.print((item.getKodeVariance()!=null?item.getKodeVariance():"") + strDelimeted);
                printWriter.print((item.getNamaVariance()!=null?item.getNamaVariance():"") + strDelimeted);
                
                printWriter.print((item.getBaru()!=null?item.getBaru():"") + strDelimeted);
                printWriter.print((item.getAllowTransfer()!=null?item.getAllowTransfer():"") + strDelimeted);
                printWriter.print((item.getBonus()!=null?item.getBonus():"") + strDelimeted);
                printWriter.print((item.getAktif()!=null?item.getAktif() :"") + strDelimeted);                
                printWriter.print("*");
                
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error runBackupMasterProduct", ex);
        }       
    }
    public void runBackupMasterOutlet(String destinationPath, String delimeted) {
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        
        File filePath = new File(destinationPath + "TMasterOutlet.txt");
        List<TMasterOutlet> lst = new ArrayList<>();
        lst = tMasterOutletDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("DistId" + strDelimeted + "DistNm" + strDelimeted + "ScyOutCode"+ strDelimeted + "MsloutCode" + strDelimeted  + "MsloutDesc" + strDelimeted 
                    + "AreaId" + strDelimeted + "AreaNm" + strDelimeted + "BsizeId" + strDelimeted + "BsizeNm" + strDelimeted + "ChainId" + strDelimeted
                    + "ChainNm" + strDelimeted + "ClassId" + strDelimeted + "ClassNm" + strDelimeted + "GroupId" + strDelimeted + "GroupNm"  + strDelimeted
                    + "KaccId" + strDelimeted + "KaccNm" + strDelimeted + "LokId" + strDelimeted + "LokNm" + strDelimeted + "NasSalesCode" +  strDelimeted
                    + "NasSalesNm" + strDelimeted + "SalesCode" + strDelimeted + "SalesNm" + strDelimeted + "SubGrpId" + strDelimeted + "SubGrpNm"  + strDelimeted
                    + "TypeId" + strDelimeted + "TypeNm"+ strDelimeted 
                    + "Baru" + strDelimeted + "AllowTransfer" + strDelimeted + "Aktif"+ strDelimeted 
                    + "*");
            for (TMasterOutlet item : lst) {
                printWriter.print((item.getDistiId()!=null?item.getDistiId():"") + strDelimeted);
                printWriter.print((item.getDistiNm()!=null?item.getDistiNm():"") + strDelimeted);
                printWriter.print((item.getScyOutCode()!=null?item.getScyOutCode():"") + strDelimeted);
                printWriter.print((item.getMslsoutCode()!=null?item.getMslsoutCode():"" )+ strDelimeted);                
                printWriter.print((item.getMslsoutDesc()!=null?item.getMslsoutDesc():"") + strDelimeted);
                
                printWriter.print((item.getAreaId()!=null?item.getAreaId():"") + strDelimeted);
                printWriter.print((item.getAreaNm()!=null?item.getAreaNm():"") + strDelimeted);
                printWriter.print((item.getBsizeId()!=null?item.getBsizeId():"") + strDelimeted);
                printWriter.print((item.getBsizeNm()!=null?item.getBsizeNm():"") + strDelimeted);
                printWriter.print((item.getChainId()!=null?item.getChainId():"") + strDelimeted);
                
                printWriter.print((item.getChainNm()!=null?item.getChainNm():"")  + strDelimeted);
                printWriter.print((item.getClassId()!=null?item.getClassId():"") + strDelimeted);
                printWriter.print((item.getClassNm()!=null?item.getClassNm():"") + strDelimeted);
                printWriter.print((item.getGroupId()!=null?item.getGroupId():"") + strDelimeted);
                printWriter.print((item.getGroupNm()!=null?item.getGroupNm():"") + strDelimeted);
                
                printWriter.print((item.getKaccId()!=null?item.getKaccId():"") + strDelimeted);
                printWriter.print((item.getKaccNm()!=null?item.getKaccNm():"") + strDelimeted);
                printWriter.print((item.getLokId()!=null?item.getLokId():"") + strDelimeted);
                printWriter.print((item.getLokNm()!=null?item.getLokNm():"") + strDelimeted);
                printWriter.print((item.getNasSalesCode()!=null?item.getNasSalesCode():"") + strDelimeted);
                
                printWriter.print((item.getNasSalesNm()!=null?item.getNasSalesNm():"") + strDelimeted);
                printWriter.print((item.getSalesCode()!=null?item.getSalesCode():"") + strDelimeted);
                printWriter.print((item.getSalesNm()!=null?item.getSalesNm():"") + strDelimeted);
                printWriter.print((item.getSubGrpId()!=null?item.getSubGrpId():"") + strDelimeted);
                printWriter.print((item.getSubGrpNm()!=null?item.getSubGrpNm():"") + strDelimeted);
                
                printWriter.print((item.getTypeId()!=null?item.getTypeId():"") + strDelimeted);
                printWriter.print((item.getTypeNm()!=null?item.getTypeNm():"") + strDelimeted);

                printWriter.print((item.getBaru()!=null?item.getBaru():"") + strDelimeted);
                printWriter.print((item.getAllowTransfer()!=null?item.getAllowTransfer():"") + strDelimeted);
                printWriter.print((item.getAktif()!=null?item.getAktif() :"") + strDelimeted);                
                printWriter.print("*");
                
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error runBackupMasterOutlet", ex);
        }       
    }
    public void runBackupMasterSalesman(String destinationPath, String delimeted) {
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        
        File filePath = new File(destinationPath + "TMasterSalesman.txt");
        List<TMasterSalesman> lst = new ArrayList<>();
        lst = tMasterSalesmanDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("DistiCode" + strDelimeted + "DistiName"  + strDelimeted + "SalesIdScy" + strDelimeted + "SalesIdSap" + strDelimeted
                   + "SalesNm" + strDelimeted+ "SalesNmSap" + strDelimeted + "Calamat1"+ strDelimeted  + "Calamat2" + strDelimeted + "Ckota"+ strDelimeted  
                   + "Cpos" + strDelimeted + "Ctelp" + strDelimeted + "KodeLevel" + strDelimeted + "RpttoCode" + strDelimeted 
                    + "Baru" + strDelimeted + "AllowTransfer" + strDelimeted + "Aktif"+ strDelimeted 
                    + "*" );
            
            for (TMasterSalesman item : lst) {
                printWriter.print((item.getDistiCode()!=null?item.getDistiCode():"") + strDelimeted);
                printWriter.print((item.getDistiName()!=null?item.getDistiName():"")+ strDelimeted);
                printWriter.print((item.getSalesIdScy()!=null?item.getSalesIdScy():"") + strDelimeted);
                printWriter.print((item.getSalesIdSap()!=null?item.getSalesIdSap():"")+ strDelimeted);
                
                printWriter.print((item.getSalesNm()!=null?item.getSalesNm():"") + strDelimeted);
                printWriter.print((item.getSalesNmSap()!=null?item.getSalesNmSap():"") + strDelimeted);
                printWriter.print((item.getCalamat1()!=null?item.getCalamat1():"") + strDelimeted);
                printWriter.print((item.getCalamat2()!=null?item.getCalamat2():"") + strDelimeted);
                printWriter.print((item.getCkota()!=null?item.getCkota():"" ) + strDelimeted);
                
                printWriter.print((item.getCpos()!=null?item.getCpos():"")  + strDelimeted);
                printWriter.print((item.getCtelp()!=null?item.getCtelp():"") + strDelimeted);
                printWriter.print((item.getKodeLevel()!=null?item.getKodeLevel():"")  + strDelimeted);
                printWriter.print((item.getRpttoCode()!=null?item.getRpttoCode():"") + strDelimeted);
                
                printWriter.print((item.getBaru()!=null?item.getBaru():"") + strDelimeted);
                printWriter.print((item.getAllowTransfer()!=null?item.getAllowTransfer():"") + strDelimeted);
                printWriter.print((item.getAktif()!=null?item.getAktif() :"") + strDelimeted);                
                printWriter.print("*");

                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error runBackupMasterSalesman", ex);
        }       
    }
    
    
}
