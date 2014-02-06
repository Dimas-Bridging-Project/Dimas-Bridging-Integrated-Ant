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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.config.spring.hibernate.model.pokari.MappingProduct;
import org.config.spring.hibernate.model.pokari.SpEmployee;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class BackupFileMasterPokari {
    private static final Logger logger = LoggerFactory.getLogger(BackupFileMasterPokari.class);
    BridgingController controller;

    public BackupFileMasterPokari(BridgingController controller) {
        this.controller = controller;
        inisialisasi();
    }
    public void inisialisasi(){
    
    }
    public void runBackupMasterPokari(String destinationPath, String delimeted, String ekstensi){
        runBackupMasterPokariArCustomer(destinationPath, delimeted, ekstensi);
        runBackupMasterPokariMappingProduct(destinationPath, delimeted, ekstensi);
        runBackupMasterPokariSpEmployee(destinationPath, delimeted, ekstensi);
    }    
    public void runBackupMasterPokariArCustomer(String destinationPath, String delimeted, String ekstensi) {
        if (ekstensi == null) {
            ekstensi = ".txt";
        }

        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        
        File filePath = new File(destinationPath + "ArCustomer.txt");
        List<ArCustomer> lst = new ArrayList<>();
        lst = controller.getModel().arCustomerDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("scyCustomerId" + strDelimeted + "szCustomerId" + strDelimeted + "scyName"+ strDelimeted + "szName" + strDelimeted  + "szAddress" + strDelimeted 
                    + "szZipCode" + strDelimeted + "szState" + strDelimeted + "szCity" + strDelimeted + "szDistrict" + strDelimeted + "szPhone1" + strDelimeted
                    + "szPhone2" + strDelimeted + "szFax" + strDelimeted + "szContact" + strDelimeted + "szEmail" + strDelimeted + "szStatus"  + strDelimeted
                    + "szDistrChannelId" + strDelimeted + "bAllowToCredit" + strDelimeted + "decLimitCredit" + strDelimeted + "szPaymentTermId" + strDelimeted + "szHirarchyId" +  strDelimeted
                    + "szSalesTerritoryId" + strDelimeted + "szEmployeeId" + strDelimeted + "szWorkplaceId" + strDelimeted + "szCustomerGroupId" + strDelimeted + "szNPWP"  + strDelimeted
                    + "dtmRegisterDate" + strDelimeted 
                    + "Baru" + strDelimeted + "AllowTransfer" + strDelimeted + "Aktif"+ strDelimeted 
                    + "*");
            for (ArCustomer item : lst) {
                printWriter.print((item.getScyCustomerId()!=null?item.getScyCustomerId():"") + strDelimeted);
                printWriter.print((item.getSzCustomerId()!=null?item.getSzCustomerId():"") + strDelimeted);
                printWriter.print((item.getScyName()!=null?item.getScyName():"") + strDelimeted);
                printWriter.print((item.getSzName()!=null?item.getSzName():"" )+ strDelimeted);                
                printWriter.print((item.getSzAddress()!=null?item.getSzAddress():"") + strDelimeted);
                
                printWriter.print((item.getSzZipCode()!=null?item.getSzZipCode():"") + strDelimeted);
                printWriter.print((item.getSzState()!=null?item.getSzState():"") + strDelimeted);
                printWriter.print((item.getSzCity()!=null?item.getSzCity():"") + strDelimeted);
                printWriter.print((item.getSzDistrict()!=null?item.getSzDistrict():"") + strDelimeted);
                printWriter.print((item.getSzPhone1()!=null?item.getSzPhone1():"") + strDelimeted);
                
                printWriter.print((item.getSzPhone2()!=null?item.getSzPhone2():"")  + strDelimeted);
                printWriter.print((item.getSzFax()!=null?item.getSzFax():"") + strDelimeted);
                printWriter.print((item.getSzContact()!=null?item.getSzContact():"") + strDelimeted);
                printWriter.print((item.getSzEmail()!=null?item.getSzEmail():"") + strDelimeted);
                printWriter.print((item.getSzStatus()!=null?item.getSzStatus():"") + strDelimeted);
                
                printWriter.print((item.getSzDistrChannelId()!=null?item.getSzDistrChannelId():"") + strDelimeted);
                printWriter.print((item.getbAllowToCredit()!=null?item.getbAllowToCredit():"") + strDelimeted);
                printWriter.print((item.getDecLimitCredit()!=null?item.getDecLimitCredit():"") + strDelimeted);
                printWriter.print((item.getSzPaymentTermId()!=null?item.getSzPaymentTermId():"") + strDelimeted);
                printWriter.print((item.getSzHirarchyId()!=null?item.getSzHirarchyId():"") + strDelimeted);
                
                printWriter.print((item.getSzSalesTerritoryId()!=null?item.getSzSalesTerritoryId():"") + strDelimeted);
                printWriter.print((item.getSzEmployeeId()!=null?item.getSzEmployeeId():"") + strDelimeted);
                printWriter.print((item.getSzWorkplaceId()!=null?item.getSzWorkplaceId():"") + strDelimeted);
                printWriter.print((item.getSzCustomerGroupId()!=null?item.getSzCustomerGroupId():"") + strDelimeted);
                printWriter.print((item.getSzNPWP()!=null?item.getSzNPWP():"") + strDelimeted);
                
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar cal = Calendar.getInstance();
                String strTanggal = sdf.format((item.getDtmRegisterDate()!=null?item.getDtmRegisterDate():cal.getTime()));
                printWriter.print(strTanggal + strDelimeted);

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

    public void runBackupMasterPokariMappingProduct(String destinationPath, String delimeted, String ekstensi) {
        if (ekstensi == null) {
            ekstensi = ".txt";
        }

        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        
        File filePath = new File(destinationPath + "MappingProduct.txt");
        List<MappingProduct> lst = new ArrayList<>();
        lst = controller.getModel().mappingProductDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("pcodeScylla" + strDelimeted + "szProductId"+ strDelimeted + "pnameScylla" + strDelimeted + "szProductName" + strDelimeted  
                    + "szBrandId" + strDelimeted  
                    + "Baru" + strDelimeted + "AllowTransfer" + strDelimeted + "Aktif"+ strDelimeted 
                    + "*");
            for (MappingProduct item : lst) {
                printWriter.print((item.getPcodeScylla()!=null?item.getPcodeScylla():"") + strDelimeted);
                printWriter.print((item.getSzProductId()!=null?item.getSzProductId():"") + strDelimeted);
                printWriter.print((item.getPnameScylla()!=null?item.getPnameScylla():"")+ strDelimeted);
                printWriter.print((item.getSzProductName()!=null?item.getSzProductName():"") + strDelimeted);
                
                printWriter.print((item.getSzBrandId()!=null?item.getSzBrandId():"") + strDelimeted);
                
                printWriter.print((item.getBaru()!=null?item.getBaru():"") + strDelimeted);
                printWriter.print((item.getAllowTransfer()!=null?item.getAllowTransfer():"") + strDelimeted);
                printWriter.print((item.getAktif()!=null?item.getAktif() :"") + strDelimeted);                
                printWriter.print("*");
                
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error Backup MappingProduct", ex);
        }       
    }
    public void runBackupMasterPokariSpEmployee(String destinationPath, String delimeted, String ekstensi) {
        if (ekstensi == null) {
            ekstensi = ".txt";
        }

        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        
        File filePath = new File(destinationPath + "SpEmployee.txt");
        List<SpEmployee> lst = new ArrayList<>();
        lst = controller.getModel().spEmployeeDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("scyEmployeeId" + strDelimeted + "szEmployeeId"  + strDelimeted + "scyName" + strDelimeted + "szName" + strDelimeted
                   + "szWorkplaceId" + strDelimeted+ "szSalesType" + strDelimeted + "szSalesGroup"+ strDelimeted  + "szTeamId" + strDelimeted 
                    + "szVehicleId"+ strDelimeted + "szVehicleName" + strDelimeted + "szPoliceNo" + strDelimeted 
                    + "Baru" + strDelimeted + "AllowTransfer" + strDelimeted + "Aktif"+ strDelimeted 
                    + "*" );
            
            for (SpEmployee item : lst) {
                printWriter.print((item.getScyEmployeeId()!=null?item.getScyEmployeeId():"") + strDelimeted);
                printWriter.print((item.getSzEmployeeId()!=null?item.getSzEmployeeId():"")+ strDelimeted);
                printWriter.print((item.getScyName()!=null?item.getScyName():"") + strDelimeted);
                printWriter.print((item.getSzName()!=null?item.getSzName():"")+ strDelimeted);
                
                printWriter.print((item.getSzWorkplaceId()!=null?item.getSzWorkplaceId():"") + strDelimeted);
                printWriter.print((item.getSzSalesType()!=null?item.getSzSalesType():"") + strDelimeted);
                printWriter.print((item.getSzSalesGroup()!=null?item.getSzSalesGroup():"") + strDelimeted);
                printWriter.print((item.getSzTeamId()!=null?item.getSzTeamId():"") + strDelimeted);
                printWriter.print((item.getSzVehicleId()!=null?item.getSzVehicleId():"" ) + strDelimeted);
                               
                printWriter.print((item.getBaru()!=null?item.getBaru():"") + strDelimeted);
                printWriter.print((item.getAllowTransfer()!=null?item.getAllowTransfer():"") + strDelimeted);
                printWriter.print((item.getAktif()!=null?item.getAktif() :"") + strDelimeted);                
                printWriter.print("*");

                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error Backup SpEmployee", ex);
        }       
    }
    
    
}
