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
public class BackupTabelTabelPokari {
    private static final Logger logger = LoggerFactory.getLogger(BackupTabelTabelPokari.class);
    BridgingController controller;
  
    public BackupTabelTabelPokari(BridgingController controller) {
        this.controller = controller;
        inisialisasi();
    }
    public void inisialisasi(){
        
    }
    
    public void runBackupTabelTabelPokari(String destinationPath, String delimeted, String ekstensi){
        if (destinationPath.trim().substring(destinationPath.trim().length(), destinationPath.trim().length()) != File.separator) {
            destinationPath += File.separator;
        }
        
        
        runBackupTabelPokariCustomerGroup(destinationPath, delimeted, ekstensi);
        runBackupTabelPokariCustomerHirarchy(destinationPath, delimeted, ekstensi);
        runBackupTabelPokariGroupSales(destinationPath, delimeted, ekstensi);
        runBackupTabelPokariProductBrand(destinationPath, delimeted, ekstensi);
        runBackupTabelPokariSalesTerritory(destinationPath, delimeted, ekstensi);
        runBackupTabelPokariTeamSales(destinationPath, delimeted, ekstensi);
        runBackupTabelPokariTypeSales(destinationPath, delimeted, ekstensi);
        runBackupTabelPokariWorkplace(destinationPath, delimeted, ekstensi);
        
        
    }
    public void runBackupTabelPokariCustomerGroup(String destinationPath, String delimeted, String ekstensi){    
        if (ekstensi == null) {
            ekstensi = ".txt";
        }
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "CustomerGroup" + ekstensi);
        List<CustomerGroup> lst = new ArrayList<>();
        lst = controller.getModel().customerGroupDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("IsDefault" + strDelimeted + "IdGroup" + strDelimeted + "Description");
            for (CustomerGroup item : lst) {
                printWriter.print(item.getIsDefault() + strDelimeted);
                printWriter.print(item.getIdGroup() + strDelimeted);
                printWriter.print(item.getDescription() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error Backup TabelTabel Pokari: ");
        }       
    }
    
    public void runBackupTabelPokariCustomerHirarchy(String destinationPath, String delimeted, String ekstensi){
        if (ekstensi == null) {
            ekstensi = ".txt";
        }
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "CustomerHirarchy" + ekstensi);
        List<CustomerHirarchy> lst = new ArrayList<>();
        lst = controller.getModel().customerHirarchyDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("IsDefault" + strDelimeted + "IdHirarchy" + strDelimeted + "Description");
            for (CustomerHirarchy item : lst) {
                printWriter.print(item.getIsDefault() + strDelimeted);
                printWriter.print(item.getIdHirarchy() + strDelimeted);
                printWriter.print(item.getDescription() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error Backup TabelTabel Pokari : ");
        }       
    }
    public void runBackupTabelPokariGroupSales(String destinationPath, String delimeted, String ekstensi){
        if (ekstensi == null) {
            ekstensi = ".txt";
        }
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "GroupSales" + ekstensi);
        List<GroupSales> lst = new ArrayList<>();
        lst = controller.getModel().groupSalesDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("IsDefault" + strDelimeted + "TypeGroup" + strDelimeted + "Name");
            for (GroupSales item : lst) {
                printWriter.print(item.getIsDefault() + strDelimeted);
                printWriter.print(item.getTypeGroup() + strDelimeted);
                printWriter.print(item.getName() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error Backup TabelTabel Pokari : ");
        }       
    }
    public void runBackupTabelPokariProductBrand(String destinationPath, String delimeted, String ekstensi){
        if (ekstensi == null) {
            ekstensi = ".txt";
        }
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "ProductBrand" + ekstensi);
        List<ProductBrand> lst = new ArrayList<>();
        lst = controller.getModel().productBrandDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("IsDefault" + strDelimeted + "SzBrandId" + strDelimeted + "SzName" + strDelimeted + "SzHirarchyId");
            for (ProductBrand item : lst) {
                printWriter.print(item.getIsDefault() + strDelimeted);
                printWriter.print(item.getSzBrandId() + strDelimeted);
                printWriter.print(item.getSzName() + strDelimeted);
                printWriter.print(item.getSzHirarchyId() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error Backup TabelTabel Pokari : ");
        }       
    }
    public void runBackupTabelPokariSalesTerritory(String destinationPath, String delimeted, String ekstensi){
        if (ekstensi == null) {
            ekstensi = ".txt";
        }
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "SalesTerritory" + ekstensi);
        List<SalesTerritory> lst = new ArrayList<>();
        lst = controller.getModel().salesTerritoryDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("IsDefault" + strDelimeted + "IdTerritory" + strDelimeted + "Description");
            for (SalesTerritory item : lst) {
                printWriter.print(item.getIsDefault()+ strDelimeted);
                printWriter.print(item.getIdTerritory() + strDelimeted);
                printWriter.print(item.getDescription() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error Backup TabelTabel Pokari : ");
        }       
    }
    public void runBackupTabelPokariTeamSales(String destinationPath, String delimeted, String ekstensi){
        if (ekstensi == null) {
            ekstensi = ".txt";
        }
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TeamSales" + ekstensi);
        List<TeamSales> lst = new ArrayList<>();
        lst = controller.getModel().teamSalesDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("IsDefault" + strDelimeted + "TeamId" + strDelimeted + "Name");
            for (TeamSales item : lst) {
                printWriter.print(item.getIsDefault() + strDelimeted);
                printWriter.print(item.getTeamId() + strDelimeted);
                printWriter.print(item.getName() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error Backup TabelTabel Pokari : ");
        }       
    }
    public void runBackupTabelPokariTypeSales(String destinationPath, String delimeted, String ekstensi){
        if (ekstensi == null) {
            ekstensi = ".txt";
        }
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "TypeSales" + ekstensi);
        List<TypeSales> lst = new ArrayList<>();
        lst = controller.getModel().typeSalesDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("IsDefault" + strDelimeted + "TypeSales" + strDelimeted + "Name");
            for (TypeSales item : lst) {
                printWriter.print(item.getIsDefault() + strDelimeted);
                printWriter.print(item.getTypeSales() + strDelimeted);
                printWriter.print(item.getName() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error Backup TabelTabel Pokari : ");
        }       
    }
    public void runBackupTabelPokariWorkplace(String destinationPath, String delimeted, String ekstensi){
        if (ekstensi == null) {
            ekstensi = ".txt";
        }
        String strDelimeted = "";
        if (delimeted.equalsIgnoreCase("COMMA")) {
            strDelimeted = ",";
        } else if (delimeted.equalsIgnoreCase("TAB")) {
            strDelimeted = "\t";
        }
        File filePath = new File(destinationPath + "Workplace" + ekstensi);
        List<WorkPlace> lst = new ArrayList<>();
        lst = controller.getModel().workplaceDao.findAll();
        try {
            
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            printWriter.println("IsDefault" + strDelimeted + "WorkplaceId" + strDelimeted + "Area");
            for (WorkPlace item : lst) {
                printWriter.print(item.getIsDefault() + strDelimeted);
                printWriter.print(item.getWorkPlaceId() + strDelimeted);
                printWriter.print(item.getArea() + "*");
                printWriter.println();
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("Error Backup TabelTabel Pokari : ");
        }       
    }
    
    
    public static void main(String [] args){
    }
    
}
