/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.app.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.config.spring.hibernate.model.TMasterProduct;
import org.config.spring.hibernate.model.TMasterSalesman;
import org.config.spring.hibernate.model.TabelKeyAccount;
import org.config.spring.hibernate.model.TabelOutletArea;
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
import org.config.spring.hibernate.model.enumpokari.EnumBAllowToCredit;
import org.config.spring.hibernate.model.enumpokari.EnumModelPokari;
import org.config.spring.hibernate.model.enumpokari.EnumPaymentTermId;
import org.config.spring.hibernate.model.enumpokari.EnumSzDistrChannelId;
import org.config.spring.hibernate.model.enumpokari.EnumSzStatus;
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.config.spring.hibernate.model.pokari.CustomerGroup;
import org.config.spring.hibernate.model.pokari.CustomerHirarchy;
import org.config.spring.hibernate.model.pokari.GroupSales;
import org.config.spring.hibernate.model.pokari.MappingProduct;
import org.config.spring.hibernate.model.pokari.ProductBrand;
import org.config.spring.hibernate.model.pokari.SalesTerritory;
import org.config.spring.hibernate.model.pokari.SpEmployee;
import org.config.spring.hibernate.model.pokari.TeamSales;
import org.config.spring.hibernate.model.pokari.TypeSales;
import org.config.spring.hibernate.model.pokari.WorkPlace;
import org.config.spring.hibernate.model.tablemodel.GenericTableModel;
import org.dimas.bridging.backkupandrestore.BackupFileMasterPokari;
import org.dimas.bridging.backkupandrestore.BackupFileMasterSap;
import org.dimas.bridging.backkupandrestore.BackupTabelTabelPokari;
import org.dimas.bridging.backkupandrestore.BackupTabelTabelSap;
import org.dimas.bridging.backkupandrestore.RestoreFileMasterPokari;
import org.dimas.bridging.backkupandrestore.RestoreFileMasterSap;
import org.dimas.bridging.backkupandrestore.RestoreTabelTabelPokari;
import org.dimas.bridging.backkupandrestore.RestoreTabelTabelSap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  YHAWIN
 */
public class BridgingControllerActionMappingMaster {
    private static final Logger logger = LoggerFactory.getLogger(BridgingControllerActionMappingMaster.class);    
    private BridgingController controller;
    
    public BridgingControllerActionMappingMaster(BridgingController controller){
        this.controller = controller;
        initAction();
    }
    
    public void initAction(){
         //Map Product, Outlet dan Salesman
         controller.getView().getBtnMapProductDelete().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapProductDelete();
             }
         });
         controller.getView().getBtnMapProductSave().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapProductSave();
             }
         });
         controller.getView().getBtnMapProductSearch().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {             
                 aksiBtnMapProductSearch();
             }
         });
         controller.getView().getBtnMapProductReload().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapProductReload();
             }
         });         
         controller.getView().getBtnMapOutletDelete().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapOutletDelete();
             }
         });
         controller.getView().getBtnMapOutletSave().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapOutletSave();
             }
         });
         controller.getView().getBtnMapOutletSearch().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapOutletSearch();
             }
         });
         controller.getView().getBtnMapOutletReload().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapOutletReload();
             }
         });
         controller.getView().getBtnMapSalesmanDelete().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapSalesmanDelete();
             }
         });
         controller.getView().getBtnMapSalesmanSave().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapSalesmanSave();
             }
         });
        controller.getView().getBtnMapSalesmanReload().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapSalesmanReload();
             }
         });
        
       //KEK : Backup and Restore
        controller.getView().getBtnBackupAndRestoreBackupPath().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreBackupPath();
             }
         });
        controller.getView().getBtnBackupAndRestoreBackupStartBackup().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreBackupStartBackup();
             }
         });
        controller.getView().getBtnBackupAndRestoreRestorePath().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreRestorePath();
             }
         });
        controller.getView().getBtnBackupAndRestoreRestoreStartRestore().addActionListener(new ActionListener() {
              
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreStartRestore();
             }
         });
        
        //POKARI BACKUP AND RESTORE
        controller.getView().getBtnBackupAndRestoreBackupPathPokari().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreBackupPathPokari();
             }
         });
        controller.getView().getBtnBackupAndRestoreBackupStartBackupPokari().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreBackupStartBackupPokari();
             }
         });
        controller.getView().getBtnBackupAndRestoreRestorePathPokari().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreRestorePathPokari();
             }
         });
        controller.getView().getBtnBackupAndRestoreRestoreStartRestorePokari().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreRestoreStartRestorePokari();
             }
         });
                        
        //TABEL MASTER Product, Outlet, Salesman
         controller.getView().getTableMapProduct().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
                 aksiListTabelMapProduct();
             }
         });
         controller.getView().getTableMapOutlet().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
                 aksiListTabelMapOutlet();
             }
         });
         controller.getView().getTableMapSalesman().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
                 aksiListTabelMapSalesman();
             }
         });

         //POKARI : RELOAD
         controller.getView().getBtnMappingMasterPokariCustomerReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMappingMasterPokariCustomerReload();
             }
         });
        controller.getView().getBtnMappingMasterPokariEmployeeReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMappingMasterPokariEmployeeReload();
             }
         });
        controller.getView().getBtnMappingMasterPokariProductReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMappingMasterPokariProductReload();
             }
         });
    
         //POKARI : DELETE, SAVE, SEARCH
        controller.getView().getBtnMappingMasterPokariCustomerDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMappingMasterPokariCustomerDelete();
             }
         });
        controller.getView().getBtnMappingMasterPokariCustomerSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMappingMasterPokariCustomerSave();
             }
         });
        controller.getView().getBtnMappingMasterPokariCustomerSearch().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMappingMasterPokariCustomerSearch();
             }
         });
        controller.getView().getBtnMappingMasterPokariEmployeeDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMappingMasterPokariEmployeeDelete();
             }
         });
        controller.getView().getBtnMappingMasterPokariEmployeeSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMappingMasterPokariEmployeeSave();
             }
         });        
        controller.getView().getBtnMappingMasterPokariProductDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMappingMasterPokariProductDelete();
             }
         });
        controller.getView().getBtnMappingMasterPokariProductSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMappingMasterPokariProductSave();
             }
         });
        controller.getView().getBtnMappingMasterPokariProductSearch().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMappingMasterPokariProductSearch();
             }
         });
        
        //POKARI: MASTER SELECTED
        controller.getView().getTableMappingMasterPokariCustomer().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
                 aksiTableMappingMasterPokariCustomerSelected();
             }
         });
        controller.getView().getTableMappingMasterPokariEmployee().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
                 aksiTableMappingMasterPokariEmployeeSelected();
             }
         });
        controller.getView().getTableMappingMasterPokariProduct().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
                 aksiTableMappingMasterPokariProductSelected();
             }
         });

        //CHEK BOX MASTER CUSTOMER
        controller.getView().getCheckMappingMasterPokariCustomerAktif().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiCheckMappingMasterPokariCustomerAktif();
             }
         });
        controller.getView().getCheckMappingMasterPokariCustomerBaru().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiCheckMappingMasterPokariCustomerBaru();
             }
         });
        controller.getView().getCheckMappingMasterPokariCustomerDikirim().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 aksiCheckMappingMasterPokariCustomerDikirim();  
            }
        });
         
        //CHECK BOX MASTER MASTER
         controller.getView().getCheckMappingMasterPokariProductAktif().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiCheckMappingMasterPokariProductAktif();
             }
         });
         controller.getView().getCheckMappingMasterPokariProductBaru().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiCheckMappingMasterPokariProductBaru();
             }
         });
         controller.getView().getCheckMappingMasterPokariProductDikirim().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiCheckMappingMasterPokariProductDikirim();
             }
         });
         
         
         
    }
    
    //AKSI CHECKBOX POKARI
    public void aksiCheckMappingMasterPokariCustomerAktif(){
            boolean isSelected = controller.getView().getCheckMappingMasterPokariCustomerAktif().isSelected();
             int [] rowsIndex = controller.getView().getTableMappingMasterPokariCustomer().getSelectedRows();
             if (rowsIndex.length > 0) {
                 if (JOptionPane.showConfirmDialog(null, "Yakin Akan Set STATUS Customer AKTIF untuk "  + String.valueOf(rowsIndex.length) +   " record?" +
                         "\n", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                   //DELETE dengan Referensi Array
                   for (int row:rowsIndex){
                           ArCustomer item = new ArCustomer();
                           item = controller.getModel().tmArCustomer.get(row);
                           item.setAktif(isSelected);
                           controller.getModel().arCustomerDao.saveOrUpdate(item);
                     }
                     aksiBtnMappingMasterPokariCustomerReload();
                 }             
             }        
    }
    public void aksiCheckMappingMasterPokariCustomerBaru(){
             boolean isSelected = controller.getView().getCheckMappingMasterPokariCustomerBaru().isSelected();
             int [] rowsIndex = controller.getView().getTableMappingMasterPokariCustomer().getSelectedRows();
             if (rowsIndex.length > 0) {
                 if (JOptionPane.showConfirmDialog(null, "Yakin Akan Set STATUS Customer BARU untuk "  + String.valueOf(rowsIndex.length) +   " record?" +
                         "\n", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                   //DELETE dengan Referensi Array
                   for (int row:rowsIndex){
                           ArCustomer item = new ArCustomer();
                           item = controller.getModel().tmArCustomer.get(row);
                           item.setBaru(isSelected);
                           controller.getModel().arCustomerDao.saveOrUpdate(item);
                     }
                     aksiBtnMappingMasterPokariCustomerReload();
                 }             
             }                
    }
    public void aksiCheckMappingMasterPokariCustomerDikirim(){
            boolean isSelected = controller.getView().getCheckMappingMasterPokariCustomerDikirim().isSelected();
             int [] rowsIndex = controller.getView().getTableMappingMasterPokariCustomer().getSelectedRows();
             if (rowsIndex.length > 0) {
                 if (JOptionPane.showConfirmDialog(null, "Yakin Akan Set STATUS Customer DIKIRIM/EXTRACT untuk "  + String.valueOf(rowsIndex.length) +   " record?" +
                         "\n", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                   //DELETE dengan Referensi Array
                   for (int row:rowsIndex){
                           ArCustomer item = new ArCustomer();
                           item = controller.getModel().tmArCustomer.get(row);
                           item.setAllowTransfer(isSelected);
                           controller.getModel().arCustomerDao.saveOrUpdate(item);
                     }
                     aksiBtnMappingMasterPokariCustomerReload();
                 }             
             }                
    }
    
    public void aksiCheckMappingMasterPokariProductAktif(){
            boolean isSelected = controller.getView().getCheckMappingMasterPokariProductAktif().isSelected();
             int [] rowsIndex = controller.getView().getTableMappingMasterPokariProduct().getSelectedRows();
             if (rowsIndex.length > 0) {
                 if (JOptionPane.showConfirmDialog(null, "Yakin Akan Set STATUS Product ACTIVE untuk "  + String.valueOf(rowsIndex.length) +   " record?" +
                         "\n", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                   //DELETE dengan Referensi Array
                   for (int row:rowsIndex){
                           MappingProduct item = new MappingProduct();
                           item = controller.getModel().tmMappingProduct.get(row);
                           item.setAktif(isSelected);
                           controller.getModel().mappingProductDao.saveOrUpdate(item);
                     }
                     aksiBtnMappingMasterPokariProductReload();
                 }             
             }                
    }
    public void aksiCheckMappingMasterPokariProductBaru(){
            boolean isSelected = controller.getView().getCheckMappingMasterPokariProductBaru().isSelected();
             int [] rowsIndex = controller.getView().getTableMappingMasterPokariProduct().getSelectedRows();
             if (rowsIndex.length > 0) {
                 if (JOptionPane.showConfirmDialog(null, "Yakin Akan Set STATUS Product BARU untuk "  + String.valueOf(rowsIndex.length) +   " record?" +
                         "\n", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                   //DELETE dengan Referensi Array
                   for (int row:rowsIndex){
                           MappingProduct item = new MappingProduct();
                           item = controller.getModel().tmMappingProduct.get(row);
                           item.setBaru(isSelected);
                           controller.getModel().mappingProductDao.saveOrUpdate(item);
                     }
                     aksiBtnMappingMasterPokariProductReload();
                 }             
             }                
        
    }
    public void aksiCheckMappingMasterPokariProductDikirim(){
            boolean isSelected = controller.getView().getCheckMappingMasterPokariProductDikirim().isSelected();
             int [] rowsIndex = controller.getView().getTableMappingMasterPokariProduct().getSelectedRows();
             if (rowsIndex.length > 0) {
                 if (JOptionPane.showConfirmDialog(null, "Yakin Akan Set STATUS Product DIKIRIM/EXTRACT untuk "  + String.valueOf(rowsIndex.length) +   " record?" +
                         "\n", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                   //DELETE dengan Referensi Array
                   for (int row:rowsIndex){
                           MappingProduct item = new MappingProduct();
                           item = controller.getModel().tmMappingProduct.get(row);
                           item.setAllowTransfer(isSelected);
                           controller.getModel().mappingProductDao.saveOrUpdate(item);
                     }
                     aksiBtnMappingMasterPokariProductReload();
                 }             
             }                
    }
    
    public void aksiTableMappingMasterPokariCustomerSelected(){
             int rowIndex =controller.getView().getTableMappingMasterPokariCustomer().getSelectedRow();
             if (rowIndex > -1) {
                 ArCustomer item = new ArCustomer();
                 item =controller.getModel().tmArCustomer.get(rowIndex);
                 controller.getModel().arCustomerSelected = item;
                 if (item != null){
                    controller.getView().getTextMappingMasterPokariCustomerIdPokari().setText(item.getSzCustomerId());
                    controller.getView().getTextMappingMasterPokariCustomerIdScylla().setText(item.getScyCustomerId());
                    controller.getView().getTextMappingMasterPokariCustomerName().setText(item.getSzName());
                    controller.getView().getTextMappingMasterPokariCustomerAddress().setText(item.getSzAddress());
                    controller.getView().getTextMappingMasterPokariCustomerState().setText(item.getSzState());
                    controller.getView().getTextMappingMasterPokariCustomerCity().setText(item.getSzCity());
                    controller.getView().getTextMappingMasterPokariCustomerDistrict().setText(item.getSzDistrict());
                    controller.getView().getTextMappingMasterPokariCustomerZipCode().setText(item.getSzZipCode());
                    controller.getView().getTextMappingMasterPokariCustomerPhone().setText(item.getSzPhone1());
                    controller.getView().getTextMappingMasterPokariCustomerFax().setText(item.getSzFax());
                    controller.getView().getTextMappingMasterPokariCustomerContact().setText(item.getSzContact());
                    controller.getView().getTextMappingMasterPokariCustomerEmail().setText(item.getSzEmail());
                    
                    String strLimitCredit = "0.0";
                    if (item.getDecLimitCredit() != null){
                        try {
                            strLimitCredit = String.valueOf(item.getDecLimitCredit());
                        } catch(Exception ex){}                    
                    }                   
                    controller.getView().getTextMappingMasterPokariCustomerLimitCredit().setText(strLimitCredit);                    
                    
                    controller.getView().getTextMappingMasterPokariCustomerNPWP().setText(item.getSzNPWP());
                    
                    if (item.getDtmRegisterDate() != null){
                        try {
                            controller.getView().getTextMappingMasterPokariCustomerRegisteredDate().setDate(item.getDtmRegisterDate());
                        } catch(Exception ex){}        
                    }
                    
                    CustomerGroup itemCustomerGroup = new CustomerGroup();
                    itemCustomerGroup.setIdGroup(item.getSzCustomerGroupId());
                    controller.getView().getComboMappingMasterPokariCustomerCustomerGroup().setSelectedItem(itemCustomerGroup);
                    
                    WorkPlace itemWorkPlace = new WorkPlace();
                    itemWorkPlace.setWorkPlaceId(item.getSzWorkplaceId());
                    controller.getView().getComboMappingMasterPokariCustomerWorkPlace().setSelectedItem(itemWorkPlace);
                    
                    CustomerHirarchy itemCustomerHirarchy = new CustomerHirarchy();
                    itemCustomerHirarchy.setIdHirarchy(item.getSzHirarchyId());
                    controller.getView().getComboMappingMasterPokariCustomerHirarchy().setSelectedItem(itemCustomerHirarchy);
                    
                    SalesTerritory itemSalesTerritory = new SalesTerritory();
                    itemSalesTerritory.setIdTerritory(item.getSzSalesTerritoryId());
                    controller.getView().getComboMappingMasterPokariCustomerSalesTerritory().setSelectedItem(itemSalesTerritory);
                    
                    SpEmployee itemSpEmployee = new SpEmployee();                    
                    itemSpEmployee.setSzEmployeeId(item.getSzEmployeeId());
                    controller.getView().getComboMappingMasterPokariCustomerEmployee().setSelectedItem(itemSpEmployee);
                    
                    //Penanda
                   controller.getView().getCheckMappingMasterPokariCustomerAktif().setSelected(item.getAktif()!=null? item.getAktif():false);
                   controller.getView().getCheckMappingMasterPokariCustomerBaru().setSelected(item.getBaru()!=null? item.getBaru():false);
                   controller.getView().getCheckMappingMasterPokariCustomerDikirim().setSelected(item.getAllowTransfer()!=null?item.getAllowTransfer():false);

                   //COMBOBOX MANUAL
                   EnumModelPokari itemSzStatus = new EnumModelPokari();                   
                   itemSzStatus.setStrCode(item.getSzStatus());
                   controller.getView().getComboMappingMasterPokariCustomerStatus().setSelectedItem(itemSzStatus);
                   
                   EnumModelPokari itemDistrChannelId = new EnumModelPokari();                   
                   itemDistrChannelId.setStrCode(item.getSzDistrChannelId());
                   controller.getView().getComboMappingMasterPokariCustomerDistrChannelId().setSelectedItem(itemDistrChannelId);
                   
                   //record
                   int rowCount = controller.getModel().tmArCustomer.getRowCount();
                   controller.getView().getJPanelMappingMasterPokariCustomerDetail().setBorder(javax.swing.BorderFactory.createTitledBorder(rowIndex+1 + " of "+ rowCount + " records"));
                   
                   EnumModelPokari itemAllowToCredit = new EnumModelPokari();     
                   itemAllowToCredit.setStrCode(EnumBAllowToCredit.CASH.getStrCode());
                   if (item.getbAllowToCredit() != null){                       
                        if (item.getbAllowToCredit() == true){
                             itemAllowToCredit.setStrCode(EnumBAllowToCredit.CREDIT.getStrCode());
                        }
                   }                   
                   controller.getView().getComboMappingMasterPokariCustomerAllowToCredit().setSelectedItem(itemAllowToCredit);
                   
                   EnumModelPokari itemPaymentTermId = new EnumModelPokari();                   
                   itemPaymentTermId.setStrCode(item.getSzPaymentTermId());
                   controller.getView().getComboMappingMasterPokariCustomerPaymentTermId().setSelectedItem(itemPaymentTermId);
                   
                 }
             }
    }
    public void aksiTableMappingMasterPokariEmployeeSelected(){
             int rowIndex =controller.getView().getTableMappingMasterPokariEmployee().getSelectedRow();
             if (rowIndex > -1) {
                 SpEmployee item = new SpEmployee();
                 item =controller.getModel().tmSpEmployee.get(rowIndex);
                 controller.getModel().spEmployeeSelected = item;                 
                 
                 if (item != null){
                    controller.getView().getTextMappingMasterPokariEmployeeIdPokari().setText(item.getSzEmployeeId());
                    controller.getView().getTextMappingMasterPokariEmployeeIdScylla().setText(item.getScyEmployeeId());
                    controller.getView().getTextMappingMasterPokariEmployeeName().setText(item.getSzName());
                    controller.getView().getTextMappingMasterPokariEmployeePoliceNo().setText(item.getSzPoliceNo());
                    controller.getView().getTextMappingMasterPokariEmployeeVehicleId().setText(item.getSzVehicleId());
                    controller.getView().getTextMappingMasterPokariEmployeeVehicleName().setText(item.getSzVehicleName());
                     
                    WorkPlace itemWorkPlace = new WorkPlace();
                    itemWorkPlace.setWorkPlaceId(item.getSzWorkplaceId());
                    controller.getView().getComboMappingMasterPokariEmployeeWorkplace().setSelectedItem(itemWorkPlace);
                    
                    TypeSales itemTypeSales = new TypeSales();
                    itemTypeSales.setTypeSales(item.getSzSalesType());
                    controller.getView().getComboMappingMasterPokariEmployeeSalesType().setSelectedItem(itemTypeSales);
                    
                    GroupSales itemGroupSales = new GroupSales();
                    itemGroupSales.setTypeGroup(item.getSzSalesGroup());
                    controller.getView().getComboMappingMasterPokariEmployeeSalesGroup().setSelectedItem(itemGroupSales);
                    
                    TeamSales itemTeamSales = new TeamSales();
                    itemTeamSales.setTeamId(item.getSzTeamId());
                    controller.getView().getComboMappingMasterPokariEmployeeSalesTeam().setSelectedItem(itemTeamSales);

                    //Penanda
                   controller.getView().getCheckMappingMasterPokariSpEmployeeAktif().setSelected(item.getAktif()!=null? item.getAktif():false);
                   controller.getView().getCheckMappingMasterPokariSpEmployeeBaru().setSelected(item.getBaru()!=null? item.getBaru():false);
                   controller.getView().getCheckMappingMasterPokariSpEmployeeDikirim().setSelected(item.getAllowTransfer()!=null?item.getAllowTransfer():false);

                    //record
                   int rowCount = controller.getModel().tmSpEmployee.getRowCount();
                   controller.getView().getJPanelMappingMasterPokariEmployeeDetail().setBorder(javax.swing.BorderFactory.createTitledBorder(rowIndex+1 + " of "+ rowCount + " records"));
                     
                 }
             }
    }    
    public void aksiTableMappingMasterPokariProductSelected(){
             int rowIndex =controller.getView().getTableMappingMasterPokariProduct().getSelectedRow();
             if (rowIndex > -1) {
                 MappingProduct item = new MappingProduct();
                 item =controller.getModel().tmMappingProduct.get(rowIndex);
                 controller.getModel().mappingProductSelected = item;
                 
                 if (item != null){
                    controller.getView().getTextMappingMasterPokariProductIdBrgScylla().setText(item.getPcodeScylla());
                    controller.getView().getTextMappingMasterPokariProductIdPokari().setText(item.getSzProductId());
                    controller.getView().getTextMappingMasterPokariProductNamaBarang().setText(item.getSzProductName());
                     
                    ProductBrand itemProductBrand = new ProductBrand();
                    itemProductBrand.setSzBrandId(item.getSzBrandId());
                    //itemCustomerGroup.setDescription(item.getszcu);
                    controller.getView().getComboMappingMasterPokariProductBrand().setSelectedItem(itemProductBrand);
                    //Penanda
                   controller.getView().getCheckMappingMasterPokariProductAktif().setSelected(item.getAktif()!=null? item.getAktif():false);
                   controller.getView().getCheckMappingMasterPokariProductBaru().setSelected(item.getBaru()!=null? item.getBaru():false);
                   controller.getView().getCheckMappingMasterPokariProductDikirim().setSelected(item.getAllowTransfer()!=null?item.getAllowTransfer():false);
                   //record
                   int rowCount = controller.getModel().tmMappingProduct.getRowCount();
                   controller.getView().getJPanelMappingMasterPokariProdukDetail().setBorder(javax.swing.BorderFactory.createTitledBorder(rowIndex+1 + " of "+ rowCount + " records"));
                     
                 }
             }
    }
    
    public void aksiBtnMappingMasterPokariProductDelete(){
             int [] rowsIndex = controller.getView().getTableMappingMasterPokariProduct().getSelectedRows();
             if (rowsIndex.length > 0) {
                 if (JOptionPane.showConfirmDialog(null, "Yakin Akan Hapus "  + String.valueOf(rowsIndex.length) +   " record?" +
                         "\n", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                   //DELETE dengan Referensi Array
                   for (int row:rowsIndex){
                        MappingProduct item = new MappingProduct();
                        item = controller.getModel().tmMappingProduct.get(row);
                        controller.getModel().mappingProductDao.delete(item);
                   }
                   //Refresh Tampilan
                   aksiBtnMappingMasterPokariProductReload();                           
                 }
                 
             }
             
//             if (JOptionPane.showConfirmDialog(null, "Yakin Akan Hapus?", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
//                int rowIndex = controller.getView().getTableMappingMasterPokariProduct().getSelectedRow();                
//                
//                if (rowIndex >-1) {
//                    MappingProduct item = new MappingProduct();
//                    item = controller.getModel().tmMappingProduct.get(rowIndex);
//                   controller.getModel().mappingProductDao.delete(item);
//                    aksiBtnMappingMasterPokariProductReload();
//                }   
//             }
             
             
    }
    public void aksiBtnMappingMasterPokariEmployeeDelete(){
             int [] rowsIndex = controller.getView().getTableMappingMasterPokariEmployee().getSelectedRows();
             if (rowsIndex.length > 0) {
                 if (JOptionPane.showConfirmDialog(null, "Yakin Akan Hapus "  + String.valueOf(rowsIndex.length) +   " record?" +
                         "\n", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                     for (int row: rowsIndex){
                        SpEmployee item = new SpEmployee();
                        item = controller.getModel().tmSpEmployee.get(row);
                        controller.getModel().spEmployeeDao.delete(item);
                     }
                     aksiBtnMappingMasterPokariEmployeeReload();
                 }
             }
    }
    
    public void aksiBtnMappingMasterPokariCustomerDelete(){
             int [] rowsIndex = controller.getView().getTableMappingMasterPokariCustomer().getSelectedRows();
             if (rowsIndex.length > 0) {
                 if (JOptionPane.showConfirmDialog(null, "Yakin Akan Hapus "  + String.valueOf(rowsIndex.length) +   " record?" +
                         "\n", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                     for (int row: rowsIndex){
                            ArCustomer item = new ArCustomer();
                            item = controller.getModel().tmArCustomer.get(row);
                           controller.getModel().arCustomerDao.delete(item);                     
                     }
                     aksiBtnMappingMasterPokariCustomerReload();
                 }
             }
             
    }

    public void aksiBtnMappingMasterPokariProductSave(){
             MappingProduct item = new MappingProduct();
             item = controller.getModel().mappingProductSelected; //KASIH DEFAULT DARI SELECTED
             
             item.setPcodeScylla(controller.getView().getTextMappingMasterPokariProductIdBrgScylla().getText().trim().toUpperCase());  
             item.setSzProductId(controller.getView().getTextMappingMasterPokariProductIdPokari().getText().trim().toUpperCase());
             item.setSzProductName(controller.getView().getTextMappingMasterPokariProductNamaBarang().getText().trim());

             //NAMUN JIKA KOSONG MAKA AKAN DIAMBIL DARI SCYLLA >> SEBAGAI DEFAULT
             if (item.getSzProductId().trim().equals("")) item.setSzProductId(item.getPcodeScylla());             
             if (item.getSzProductName().trim().equals("")) item.setSzProductName(item.getPnameScylla());
             
             ProductBrand itemProductBrand = new ProductBrand();
             itemProductBrand = (ProductBrand)controller.getView().getComboMappingMasterPokariProductBrand().getModel().getSelectedItem();
             if (itemProductBrand !=null) {
                 item.setSzBrandId(itemProductBrand.getSzBrandId().trim());
             }
             
             item.setBaru(controller.getView().getCheckMappingMasterPokariProductBaru().isSelected());              
             item.setAktif(controller.getView().getCheckMappingMasterPokariProductAktif().isSelected());
             item.setAllowTransfer(controller.getView().getCheckMappingMasterPokariProductDikirim().isSelected());
             
             //Save jika kodenya tidak kosong
             if (! item.getPcodeScylla().equals("")) {
                controller.getModel().mappingProductDao.saveOrUpdate(item);
                //aksiBtnMappingMasterPokariProductReload();
                aksiBtnMappingMasterPokariProductSearch();
             } else {
                 JOptionPane.showMessageDialog(null, "Kode Harus Diisi!!..", "Validasi..", JOptionPane.ERROR_MESSAGE);
             }
             
    }
    public void aksiBtnMappingMasterPokariEmployeeSave(){
             SpEmployee item = new SpEmployee();
             item = controller.getModel().spEmployeeSelected; //KASIH DEFAULT DARI SELECTED
             
             item.setScyEmployeeId(controller.getView().getTextMappingMasterPokariEmployeeIdScylla().getText().trim().toUpperCase());
             item.setSzEmployeeId(controller.getView().getTextMappingMasterPokariEmployeeIdPokari().getText().trim().toUpperCase());
             item.setSzName(controller.getView().getTextMappingMasterPokariEmployeeName().getText().trim());             
             if (item.getSzEmployeeId().trim().equals("")) item.setSzEmployeeId(item.getScyEmployeeId());
             if (item.getSzName().trim().equals("")) item.setSzName(item.getScyName());

             item.setSzVehicleId(controller.getView().getTextMappingMasterPokariEmployeeVehicleId().getText().trim());
             item.setSzVehicleName(controller.getView().getTextMappingMasterPokariEmployeeVehicleName().getText().trim());
             item.setSzPoliceNo(controller.getView().getTextMappingMasterPokariEmployeePoliceNo().getText().trim());

             WorkPlace itemWorkPlace = new WorkPlace();
             itemWorkPlace = (WorkPlace)controller.getView().getComboMappingMasterPokariEmployeeWorkplace().getModel().getSelectedItem();
             if (itemWorkPlace !=null) {
                 item.setSzWorkplaceId(itemWorkPlace.getWorkPlaceId().trim());
             }
             TypeSales itemTypeSales = new TypeSales();
             itemTypeSales = (TypeSales)controller.getView().getComboMappingMasterPokariEmployeeSalesType().getModel().getSelectedItem();
             if (itemTypeSales !=null) {
                 item.setSzSalesType(itemTypeSales.getTypeSales().trim());
             }
             GroupSales itemGroupSales = new GroupSales();
             itemGroupSales = (GroupSales)controller.getView().getComboMappingMasterPokariEmployeeSalesGroup().getModel().getSelectedItem();
             if (itemGroupSales !=null) {
                 item.setSzSalesGroup(itemGroupSales.getTypeGroup().trim());
             }
             TeamSales itemTeamSales = new TeamSales();
             itemTeamSales = (TeamSales)controller.getView().getComboMappingMasterPokariEmployeeSalesTeam().getModel().getSelectedItem();
             if (itemTeamSales !=null) {
                 item.setSzTeamId(itemTeamSales.getTeamId().trim());
             }
             
             item.setBaru(controller.getView().getCheckMappingMasterPokariSpEmployeeBaru().isSelected());              
             item.setAktif(controller.getView().getCheckMappingMasterPokariSpEmployeeAktif().isSelected());
             item.setAllowTransfer(controller.getView().getCheckMappingMasterPokariSpEmployeeDikirim().isSelected());
             

//             item.set(controller.getView().getTextMappingMasterPokari.getText().trim());              
//             item.set(controller.getView().getTextMappingMasterPokari.getText().trim());              
             
             
             //Save jika kodenya tidak kosong
             if (! item.getScyEmployeeId().equals("")) {
                controller.getModel().spEmployeeDao.saveOrUpdate(item);
                aksiBtnMappingMasterPokariEmployeeReload();
             } else {
                 JOptionPane.showMessageDialog(null, "Kode Harus Diisi!!..", "Validasi..", JOptionPane.ERROR_MESSAGE);
             }
    }
    public void aksiBtnMappingMasterPokariCustomerSave(){
             ArCustomer item = new ArCustomer();
             item = controller.getModel().arCustomerSelected; //KASIH DEFAULT DARI SELECTED
              
             item.setScyCustomerId(controller.getView().getTextMappingMasterPokariCustomerIdScylla().getText().trim().toUpperCase());
             item.setSzCustomerId(controller.getView().getTextMappingMasterPokariCustomerIdPokari().getText().trim().toUpperCase());
             item.setSzName(controller.getView().getTextMappingMasterPokariCustomerName().getText().trim());
             if (item.getSzCustomerId().trim().equals("")) item.setSzCustomerId(item.getScyCustomerId());
             if (item.getSzName().trim().equals("")) item.setSzName(item.getScyName());             
             if (item.getScyName()==null) {
                 item.setScyName(item.getSzName());
             } else if (item.getScyName().trim().equals("")) {
                 item.setScyName(item.getSzName());
             }    
                 
             item.setSzAddress(controller.getView().getTextMappingMasterPokariCustomerAddress().getText().trim());
             item.setSzState(controller.getView().getTextMappingMasterPokariCustomerState().getText().trim());
             item.setSzCity(controller.getView().getTextMappingMasterPokariCustomerCity().getText().trim());
             item.setSzDistrict(controller.getView().getTextMappingMasterPokariCustomerDistrict().getText().trim());
             item.setSzZipCode(controller.getView().getTextMappingMasterPokariCustomerZipCode().getText().trim());
             item.setSzPhone1(controller.getView().getTextMappingMasterPokariCustomerPhone().getText().trim());
             item.setSzFax(controller.getView().getTextMappingMasterPokariCustomerFax().getText().trim());
             item.setSzContact(controller.getView().getTextMappingMasterPokariCustomerContact().getText().trim());
             item.setSzEmail(controller.getView().getTextMappingMasterPokariCustomerEmail().getText().trim());
             try {
                item.setDecLimitCredit(Double.parseDouble(controller.getView().getTextMappingMasterPokariCustomerLimitCredit().getText().trim()));
             } catch(Exception ex){}
             
             item.setSzNPWP(controller.getView().getTextMappingMasterPokariCustomerNPWP().getText().trim());

             try {
                item.setDtmRegisterDate(controller.getView().getTextMappingMasterPokariCustomerRegisteredDate().getDate());
             } catch(Exception ex){}
             
             CustomerGroup itemCustomerGroup = new CustomerGroup();
             itemCustomerGroup = (CustomerGroup)controller.getView().getComboMappingMasterPokariCustomerCustomerGroup().getModel().getSelectedItem();
             if (itemCustomerGroup !=null) {
                 item.setSzCustomerGroupId(itemCustomerGroup.getIdGroup().trim());
             }
             
             WorkPlace itemWorkPlace = new WorkPlace();
             itemWorkPlace = (WorkPlace)controller.getView().getComboMappingMasterPokariCustomerWorkPlace().getModel().getSelectedItem();
             if (itemWorkPlace !=null) {
                 item.setSzWorkplaceId(itemWorkPlace.getWorkPlaceId().trim());
             }
             CustomerHirarchy itemCustomerHirarchy = new CustomerHirarchy();
             itemCustomerHirarchy = (CustomerHirarchy)controller.getView().getComboMappingMasterPokariCustomerHirarchy().getModel().getSelectedItem();
             if (itemCustomerHirarchy !=null) {
                 item.setSzHirarchyId(itemCustomerHirarchy.getIdHirarchy().trim());
             }
             SalesTerritory itemSalesTerritory = new SalesTerritory();
             itemSalesTerritory = (SalesTerritory)controller.getView().getComboMappingMasterPokariCustomerSalesTerritory().getModel().getSelectedItem();
             if (itemSalesTerritory !=null) {
                 item.setSzSalesTerritoryId(itemSalesTerritory.getIdTerritory().trim());
             }
             SpEmployee itemSpEmployee = new SpEmployee();
             itemSpEmployee = (SpEmployee)controller.getView().getComboMappingMasterPokariCustomerEmployee().getModel().getSelectedItem();
             if (itemSpEmployee !=null) {
                 item.setSzEmployeeId(itemSpEmployee.getSzEmployeeId().trim());
             }
             
             item.setBaru(controller.getView().getCheckMappingMasterPokariCustomerBaru().isSelected());              
             item.setAktif(controller.getView().getCheckMappingMasterPokariCustomerAktif().isSelected());
             item.setAllowTransfer(controller.getView().getCheckMappingMasterPokariCustomerDikirim().isSelected());
             
             /**
              * SAVE COMBO MANUAL
              */
             EnumModelPokari szStatus = new EnumModelPokari();
             szStatus = (EnumModelPokari) controller.getView().getComboMappingMasterPokariCustomerStatus().getSelectedItem();
             item.setSzStatus(szStatus.getStrCode());
             
             EnumModelPokari szDistrChannelId = new EnumModelPokari();
             szDistrChannelId = (EnumModelPokari) controller.getView().getComboMappingMasterPokariCustomerDistrChannelId().getSelectedItem();
             item.setSzDistrChannelId(szDistrChannelId.getStrCode());
             
             EnumModelPokari bAllowToCredit = new EnumModelPokari();
             bAllowToCredit = (EnumModelPokari) controller.getView().getComboMappingMasterPokariCustomerAllowToCredit().getSelectedItem();           
             Boolean bolAllowToCredit = false;
             if (bAllowToCredit != null){
                 try {
                     if (bAllowToCredit.getIntCode() == 1) bolAllowToCredit = true;
                 } catch (Exception ex){}
             } 
             item.setbAllowToCredit(bolAllowToCredit);
             
             EnumModelPokari szPaymentTermId = new EnumModelPokari();
             szPaymentTermId = (EnumModelPokari) controller.getView().getComboMappingMasterPokariCustomerPaymentTermId().getSelectedItem();
             item.setSzPaymentTermId(szPaymentTermId.getStrCode());
             
             //Save jika kodenya tidak kosong
             if (! item.getScyCustomerId().equals("")) {
                controller.getModel().arCustomerDao.saveOrUpdate(item);
                
                //aksiBtnMappingMasterPokariCustomerReload();
                aksiBtnMappingMasterPokariCustomerSearch();
             } else {
                 JOptionPane.showMessageDialog(null, "Kode Harus Diisi!!..", "Validasi..", JOptionPane.ERROR_MESSAGE);
             }
    }
    
    /**
     * POKARI : SEARCH
     */
    public void aksiBtnMappingMasterPokariProductSearch(){
            String scyllaIdSearch = controller.getView().getTextMappingMasterPokariProductSearchIdBrgScylla().getText().trim();
            String productIdSearch = controller.getView().getTextMappingMasterPokariProductSearchIdPokari().getText().trim();
            String productNameSearch = controller.getView().getTextMappingMasterPokariProductSearchNamaBarangPokari().getText().trim();

            Boolean semua =controller.getView().getCheckMappingMasterPokariProductSearchSemua().isSelected();
            Boolean baruSaja =controller.getView().getCheckMappingMasterPokariProductSearchBaruSaja().isSelected();
            Boolean dikirimSaja =controller.getView().getCheckMappingMasterPokariProductSearchDikirimSaja().isSelected();
            //Boolean bonusSaja =controller.getView().getCheckMappingMasterPokariProducts().isSelected();
            //Boolean bonusSaja = false;
            Boolean aktifSaja =controller.getView().getCheckMappingMasterPokariProductSearchAktifSaja().isSelected();
            
            List<MappingProduct> lst = new ArrayList<>();
            lst =controller.getModel().mappingProductDao.findById(scyllaIdSearch, productIdSearch, productNameSearch, 
                    semua, baruSaja, dikirimSaja, aktifSaja);
            
            controller.getModel().tmMappingProduct = new GenericTableModel<>(lst,MappingProduct.class);
            controller.getView().getTableMappingMasterPokariProduct().setModel(controller.getModel().tmMappingProduct);
            controller.getView().renderTableModelPokariMappingMasterProduct();
    }
    public void aksiBtnMappingMasterPokariCustomerSearch(){
            String scyllaIdSearch = controller.getView().getTextMappingMasterPokariCustomerSearchIdScylla().getText().trim();
            String outletIdSearch = controller.getView().getTextMappingMasterPokariCustomerSearchIdPokari().getText().trim();
            String outletNameSearch = controller.getView().getTextMappingMasterPokariCustomerSearchName().getText().trim();

            Boolean semua = controller.getView().getCheckMappingMasterPokariCustomerSearchSemua().isSelected();
            Boolean baruSaja = controller.getView().getCheckMappingMasterPokariCustomerSearchBaruSaja().isSelected();
            Boolean dikirimSaja = controller.getView().getCheckMapingMasterPokariCustomerSearchDikirimSaja().isSelected();
            Boolean aktifSaja =controller.getView().getCheckMappingMasterPokariCustomerSearchAktifSaja().isSelected();
            
            List<ArCustomer> lst = new ArrayList<>();
            lst = controller.getModel().arCustomerDao.findById(scyllaIdSearch, outletIdSearch, outletNameSearch, 
                    semua, baruSaja, dikirimSaja, aktifSaja);
            
            controller.getModel().tmArCustomer = new GenericTableModel<>(lst,ArCustomer.class);
            controller.getView().getTableMappingMasterPokariCustomer().setModel(controller.getModel().tmArCustomer);
            controller.getView().renderTableModelPokariMappingMasterArCustomer();
    
    }
    
    public void aksiReloadMaster(){
        aksiReloadMasterPokari();
        aksiReloadMasterSAP();
    }
    public void aksiReloadMasterPokari(){
        aksiBtnMappingMasterPokariCustomerReload();
        aksiBtnMappingMasterPokariEmployeeReload();
        aksiBtnMappingMasterPokariProductReload();        
    }
    public void aksiReloadMasterSAP(){
        aksiBtnTMasterProductReload();
        aksiBtnMapProductReload();
        
        aksiBtnTMasterOutletReload();
        aksiBtnMapOutletReload();
        
        aksiBtnTMasterSalesmanReload();
    }
     
        //POKARI : RELOAD
        public void aksiBtnMappingMasterPokariCustomerReload(){
            //Reload ComboBox
            initComboBoxMappingMasterPokariCustomerReload();
            initComboBoxManualMappingMasterPokariCustomerReload();

            //Reset Text
            //controller.getView().resetTeksMappingMasterPokari();
            //Reload Table
            List<ArCustomer> lst = new ArrayList<>();
            lst = controller.getModel().arCustomerDao.findAll();
            controller.getModel().tmArCustomer = new GenericTableModel<>(lst, ArCustomer.class);
            controller.getView().getTableMappingMasterPokariCustomer().setModel(controller.getModel().tmArCustomer);
            /**
             * SET TABLE MODEL BIAR OKE
             */
           controller.getView().renderTableModelPokariMappingMasterArCustomer();

        }
        public void aksiBtnMappingMasterPokariEmployeeReload(){
            //Reload ComboBox
            initComboBoxMappingMasterPokariEmployeeReload();
            //Reset Text
            //controller.getView().resetTeksMappingMasterPokari();
            //Reload Table
            List<SpEmployee> lst = new ArrayList<>();
            lst = controller.getModel().spEmployeeDao.findAll();
            controller.getModel().tmSpEmployee = new GenericTableModel<>(lst, SpEmployee.class);
            controller.getView().getTableMappingMasterPokariEmployee().setModel(controller.getModel().tmSpEmployee);
            /**
             * SET TABLE MODEL BIAR OKE
             */
           controller.getView().renderTableModelPokariMappingMasterSpEmployee();
        }
        public void aksiBtnMappingMasterPokariProductReload(){
            //Reload ComboBox
            initComboBoxMappingMasterPokariProductReload();
            //Reset Text
            //controller.getView().resetTeksMappingMasterPokari();
            //Reload Table
            List<MappingProduct> lst = new ArrayList<>();
            lst = controller.getModel().mappingProductDao.findAll();
            controller.getModel().tmMappingProduct = new GenericTableModel<>(lst, MappingProduct.class);
            controller.getView().getTableMappingMasterPokariProduct().setModel(controller.getModel().tmMappingProduct);

            /**
             * SET TABLE MODEL BIAR OKE
             */
           controller.getView().renderTableModelPokariMappingMasterProduct();
        }

        //POKARI : COMBOBOX RELOAD
        public void initComboBoxMappingMasterPokariProductReload(){
            DefaultComboBoxModel<ProductBrand> cmbProductBrand = new DefaultComboBoxModel<>();
            for (ProductBrand itm: controller.getModel().productBrandDao.getAll()) {
                cmbProductBrand.addElement(itm);
            }             
            controller.getView().getComboMappingMasterPokariProductBrand().setModel(cmbProductBrand);
        }     
        public void initComboBoxMappingMasterPokariCustomerReload(){
            DefaultComboBoxModel<CustomerGroup> cmbCustomerGroup = new DefaultComboBoxModel<>();
            for (CustomerGroup itm: controller.getModel().customerGroupDao.getAll()) {
                cmbCustomerGroup.addElement(itm);
            }             
            CustomerGroup itmCustGroup = new CustomerGroup(); itmCustGroup.setIdGroup(""); itmCustGroup.setDescription("K O S O N G");
            cmbCustomerGroup.addElement(itmCustGroup);
            controller.getView().getComboMappingMasterPokariCustomerCustomerGroup().setModel(cmbCustomerGroup);

            DefaultComboBoxModel<WorkPlace> cmbWorkPlace = new DefaultComboBoxModel<>();
            for (WorkPlace itm: controller.getModel().workplaceDao.getAll()) {
                cmbWorkPlace.addElement(itm);
            }             
            controller.getView().getComboMappingMasterPokariCustomerWorkPlace().setModel(cmbWorkPlace);

            DefaultComboBoxModel<CustomerHirarchy> cmbCustomerHirarchy = new DefaultComboBoxModel<>();
            for (CustomerHirarchy itm: controller.getModel().customerHirarchyDao.getAll()) {
                cmbCustomerHirarchy.addElement(itm);
            }             
            controller.getView().getComboMappingMasterPokariCustomerHirarchy().setModel(cmbCustomerHirarchy);

            DefaultComboBoxModel<SalesTerritory> cmbSalesTerritory = new DefaultComboBoxModel<>();
            for (SalesTerritory itm: controller.getModel().salesTerritoryDao.getAll()) {
                cmbSalesTerritory.addElement(itm);
            }             
            controller.getView().getComboMappingMasterPokariCustomerSalesTerritory().setModel(cmbSalesTerritory);
            DefaultComboBoxModel<SpEmployee> cmbSpEmployee = new DefaultComboBoxModel<>();
            for (SpEmployee itm: controller.getModel().spEmployeeDao.getAll()) {
                cmbSpEmployee.addElement(itm);
            }             
            controller.getView().getComboMappingMasterPokariCustomerEmployee().setModel(cmbSpEmployee);

        }
        public void initComboBoxManualMappingMasterPokariCustomerReload(){
            /**
             * COMBO MANUAL
             */
            /**
             * Status
             */
            DefaultComboBoxModel<EnumModelPokari> cmbModelStatus = new DefaultComboBoxModel<>();
            EnumModelPokari enumModelStatus0 = new EnumModelPokari();
            enumModelStatus0.setIntCode(EnumSzStatus.NONACTIVE.getIntCode());
            enumModelStatus0.setStrCode(EnumSzStatus.NONACTIVE.getStrCode());
            enumModelStatus0.setDescription(EnumSzStatus.NONACTIVE.getDescription());
            cmbModelStatus.addElement(enumModelStatus0);      
            EnumModelPokari enumModelStatus1 = new EnumModelPokari();
            enumModelStatus1.setIntCode(EnumSzStatus.ACTIVE.getIntCode());
            enumModelStatus1.setStrCode(EnumSzStatus.ACTIVE.getStrCode());
            enumModelStatus1.setDescription(EnumSzStatus.ACTIVE.getDescription());
            cmbModelStatus.addElement(enumModelStatus1);
            EnumModelPokari enumModelStatus2 = new EnumModelPokari();
            enumModelStatus2.setIntCode(EnumSzStatus.DESTROY.getIntCode());
            enumModelStatus2.setStrCode(EnumSzStatus.DESTROY.getStrCode());
            enumModelStatus2.setDescription(EnumSzStatus.DESTROY.getDescription());
            cmbModelStatus.addElement(enumModelStatus2);
            controller.getView().getComboMappingMasterPokariCustomerStatus().setModel(cmbModelStatus);

            /**
             * DistrChannelId
             */        
            DefaultComboBoxModel<EnumModelPokari> cmbModelDistrChannelId = new DefaultComboBoxModel<>();
            EnumModelPokari enumModelModelDistrChannelId1 =  new EnumModelPokari();
            enumModelModelDistrChannelId1.setIntCode(EnumSzDistrChannelId.TRADITIONAL_MARKET.getIntCode());
            enumModelModelDistrChannelId1.setStrCode(EnumSzDistrChannelId.TRADITIONAL_MARKET.getStrCode());
            enumModelModelDistrChannelId1.setDescription(EnumSzDistrChannelId.TRADITIONAL_MARKET.getDescription());
            cmbModelDistrChannelId.addElement(enumModelModelDistrChannelId1);
            EnumModelPokari enumModelModelDistrChannelId2 =  new EnumModelPokari();
            enumModelModelDistrChannelId2.setIntCode(EnumSzDistrChannelId.MODERN_MARKET.getIntCode());
            enumModelModelDistrChannelId2.setStrCode(EnumSzDistrChannelId.MODERN_MARKET.getStrCode());
            enumModelModelDistrChannelId2.setDescription(EnumSzDistrChannelId.MODERN_MARKET.getDescription());
            cmbModelDistrChannelId.addElement(enumModelModelDistrChannelId2);
            controller.getView().getComboMappingMasterPokariCustomerDistrChannelId().setModel(cmbModelDistrChannelId);

            /**
             * AllowToCredit
             */
            DefaultComboBoxModel<EnumModelPokari> cmbModelAllowToCredit = new DefaultComboBoxModel<>();
            EnumModelPokari enumModelAllowToCredit1 = new EnumModelPokari();
            enumModelAllowToCredit1.setIntCode(EnumBAllowToCredit.CASH.getIntCode());
            enumModelAllowToCredit1.setStrCode(EnumBAllowToCredit.CASH.getStrCode());
            enumModelAllowToCredit1.setDescription(EnumBAllowToCredit.CASH.getDescription());
            cmbModelAllowToCredit.addElement(enumModelAllowToCredit1);
            EnumModelPokari enumModelAllowToCredit2 = new EnumModelPokari();
            enumModelAllowToCredit2.setIntCode(EnumBAllowToCredit.CREDIT.getIntCode());
            enumModelAllowToCredit2.setStrCode(EnumBAllowToCredit.CREDIT.getStrCode());
            enumModelAllowToCredit2.setDescription(EnumBAllowToCredit.CREDIT.getDescription());
            cmbModelAllowToCredit.addElement(enumModelAllowToCredit2);
            controller.getView().getComboMappingMasterPokariCustomerAllowToCredit().setModel(cmbModelAllowToCredit);
            /**
             * PaymentTerm
             */
            DefaultComboBoxModel<EnumModelPokari> cmbModelPaymentTermId = new DefaultComboBoxModel<>();
            EnumModelPokari enumModelPaymentTermId1 = new EnumModelPokari();
            enumModelPaymentTermId1.setIntCode(EnumPaymentTermId.HARI_0.getIntCode());
            enumModelPaymentTermId1.setStrCode(EnumPaymentTermId.HARI_0.getStrCode());
            enumModelPaymentTermId1.setDescription(EnumPaymentTermId.HARI_0.getDescription());
            cmbModelPaymentTermId.addElement(enumModelPaymentTermId1);
            EnumModelPokari enumModelPaymentTermId2 = new EnumModelPokari();
            enumModelPaymentTermId2.setIntCode(EnumPaymentTermId.HARI_7.getIntCode());
            enumModelPaymentTermId2.setStrCode(EnumPaymentTermId.HARI_7.getStrCode());
            enumModelPaymentTermId2.setDescription(EnumPaymentTermId.HARI_7.getDescription());
            cmbModelPaymentTermId.addElement(enumModelPaymentTermId2);
            EnumModelPokari enumModelPaymentTermId3 = new EnumModelPokari();
            enumModelPaymentTermId3.setIntCode(EnumPaymentTermId.HARI_10.getIntCode());
            enumModelPaymentTermId3.setStrCode(EnumPaymentTermId.HARI_10.getStrCode());
            enumModelPaymentTermId3.setDescription(EnumPaymentTermId.HARI_10.getDescription());
            cmbModelPaymentTermId.addElement(enumModelPaymentTermId3);
            EnumModelPokari enumModelPaymentTermId4 = new EnumModelPokari();
            enumModelPaymentTermId4.setIntCode(EnumPaymentTermId.HARI_14.getIntCode());
            enumModelPaymentTermId4.setStrCode(EnumPaymentTermId.HARI_14.getStrCode());
            enumModelPaymentTermId4.setDescription(EnumPaymentTermId.HARI_14.getDescription());
            cmbModelPaymentTermId.addElement(enumModelPaymentTermId4);
            EnumModelPokari enumModelPaymentTermId5 = new EnumModelPokari();
            enumModelPaymentTermId5.setIntCode(EnumPaymentTermId.HARI_21.getIntCode());
            enumModelPaymentTermId5.setStrCode(EnumPaymentTermId.HARI_21.getStrCode());
            enumModelPaymentTermId5.setDescription(EnumPaymentTermId.HARI_21.getDescription());
            cmbModelPaymentTermId.addElement(enumModelPaymentTermId5);

            controller.getView().getComboMappingMasterPokariCustomerPaymentTermId().setModel(cmbModelPaymentTermId);
        }
        public void initComboBoxMappingMasterPokariEmployeeReload(){
            /**
             * COMBO FROM ENTITY
             */
            DefaultComboBoxModel<WorkPlace> cmbWorkPlace = new DefaultComboBoxModel<>();
            for (WorkPlace itm: controller.getModel().workplaceDao.getAll()) {
                cmbWorkPlace.addElement(itm);
            }             
            controller.getView().getComboMappingMasterPokariEmployeeWorkplace().setModel(cmbWorkPlace);

            DefaultComboBoxModel<TypeSales> cmbTypeSales = new DefaultComboBoxModel<>();
            for (TypeSales itm: controller.getModel().typeSalesDao.getAll()) {
                cmbTypeSales.addElement(itm);
            }             
            controller.getView().getComboMappingMasterPokariEmployeeSalesType().setModel(cmbTypeSales);

            DefaultComboBoxModel<GroupSales> cmbGroupSales = new DefaultComboBoxModel<>();
            for (GroupSales itm: controller.getModel().groupSalesDao.getAll()) {
                cmbGroupSales.addElement(itm);
            }             
            controller.getView().getComboMappingMasterPokariEmployeeSalesGroup().setModel(cmbGroupSales);

            DefaultComboBoxModel<TeamSales> cmbTeamSales = new DefaultComboBoxModel<>();
            for (TeamSales itm: controller.getModel().teamSalesDao.getAll()) {
                cmbTeamSales.addElement(itm);
            }             
            controller.getView().getComboMappingMasterPokariEmployeeSalesTeam().setModel(cmbTeamSales);

        }
    
        //Reload Kita tidak jadikan satu dengan class BridgingTabelTabelMasterSAP.java karena biar bisa diakses semua 
        public void aksiBtnTMasterProductReload(){       
            List<TMasterProduct> lst = new ArrayList<>();
            lst = controller.getModel().tMasterProductDao.findAll();
            controller.getModel().tmTMasterProduct = new GenericTableModel<>(lst, TMasterProduct.class);
            controller.getView().getTableMapProduct().setModel(controller.getModel().tmTMasterProduct);
        }
        public void aksiBtnTMasterOutletReload(){
            List<TMasterOutlet> lst = new ArrayList<>();
            lst =controller.getModel().tMasterOutletDao.findAll();
           controller.getModel().tmTMasterOutlet = new GenericTableModel<>(lst,TMasterOutlet.class);
           controller.getView().getTableMapOutlet().setModel(controller.getModel().tmTMasterOutlet);
        }
        public void aksiBtnTMasterSalesmanReload(){
            List<TMasterSalesman> lst = new ArrayList();
            lst =controller.getModel().tMasterSalesmanDao.findAll();
           controller.getModel().tmTMasterSalesman = new GenericTableModel<>(lst, TMasterSalesman.class);
           controller.getView().getTableMapSalesman().setModel(controller.getModel().tmTMasterSalesman);
        }
        
        //Mapping Master Product, Outlet, Salesman
        public void aksiBtnMapSalesmanSave(){
            TMasterSalesman item = new TMasterSalesman();

            item.setDistiCode(controller.getView().getTextMapSalesmanDistributorId().getText().trim());
            //item.setSalesIdScy(controller.getView().getTextMapSalesmanSalesmanId().getText().trim());

            item.setSalesIdSap(controller.getView().getTextMapSalesmanSalesmanId().getText().trim());
            item.setSalesIdScy(controller.getView().getTextMapSalesmanSalesmanIdScylla().getText().trim());
            item.setSalesNmSap(controller.getView().getTextMapSalesmanSalesmanName().getText().trim());

            //Jika tidak diisi maka ngikut kode scylla
            if (item.getSalesIdScy()==null) item.setSalesIdScy(item.getSalesIdSap());
            //Nama Salesman Scylla Ngikut
            if (item.getSalesNm()==null) item.setSalesNm(item.getSalesNmSap());

            item.setCalamat1(controller.getView().getTextMapSalesmanCAlamat1().getText().trim());
            item.setCalamat2(controller.getView().getTextMapSalesmanCAlamat2().getText().trim());
            item.setCkota(controller.getView().getTextMapSalesmanCKota().getText().trim());
            item.setCtelp(controller.getView().getTextMapSalesmanCTelpon().getText().trim());
            item.setKodeLevel(controller.getView().getTextMapSalesmanKodeLevel().getText().trim());
            item.setRpttoCode(controller.getView().getTextMapSalesmanRTTPCode().getText().trim());

            //Save jika kodenya tidak kosong
            if (! item.getSalesIdSap().equals("")) {
               controller.getModel().tMasterSalesmanDao.saveOrUpdate(item);
               aksiBtnTMasterSalesmanReload();
            } else {
                JOptionPane.showMessageDialog(null, "Kode Harus Diisi!!..", "Validasi..", JOptionPane.ERROR_MESSAGE);
            }


        }          
        public void aksiBtnMapSalesmanDelete(){
            if (JOptionPane.showConfirmDialog(null, "Yakin Akan Hapus?", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
               int rowIndex = controller.getView().getTableMapSalesman().getSelectedRow();
               if (rowIndex >-1) {
                   TMasterSalesman item = new TMasterSalesman();
                   item = controller.getModel().tmTMasterSalesman.get(rowIndex);
                  controller.getModel().tMasterSalesmanDao.delete(item);
                    aksiBtnTMasterSalesmanReload();
               }   
            }
        }          
        public void aksiBtnMapSalesmanReload(){
            aksiBtnTMasterSalesmanReload();
            initiatesComboBoxMasterSalesman();
        }
        public void aksiListTabelMapSalesman(){
            int rowIndex =controller.getView().getTableMapSalesman().getSelectedRow();
            if (rowIndex >-1) {
                TMasterSalesman item = new TMasterSalesman();
                item =controller.getModel().tmTMasterSalesman.get(rowIndex);

               controller.getView().getTextMapSalesmanDistributorId().setText(item.getDistiCode());

               controller.getView().getTextMapSalesmanSalesmanIdScylla().setText(item.getSalesIdScy());                 
               controller.getView().getTextMapSalesmanSalesmanId().setText(item.getSalesIdSap());
               controller.getView().getTextMapSalesmanSalesmanName().setText(item.getSalesNm());

               controller.getView().getTextMapSalesmanCAlamat1().setText(item.getCalamat1());
               controller.getView().getTextMapSalesmanCAlamat2().setText(item.getCalamat2());
               controller.getView().getTextMapSalesmanCKota().setText(item.getCkota());
               controller.getView().getTextMapSalesmanCTelpon().setText(item.getCtelp());
               controller.getView().getTextMapSalesmanKodeLevel().setText(item.getKodeLevel());
               controller.getView().getTextMapSalesmanRTTPCode().setText(item.getRpttoCode());

            }
        }

        public void aksiBtnMapOutletSave(){
            TMasterOutlet item = new TMasterOutlet();
            item.setDistiId(controller.getView().getTextMapOutletDistiId().getText().trim());

            //TOutletPK itemPK = new TOutletPK();
            //itemPK.setScyOutCode(controller.getView().getTextMapOutletScyOutletCode().getText().trim());
            //itemPK.setMslsoutCode(controller.getView().getTextMapOutletMSLOutletCode().getText().trim());
            //item.settOutletPK(itemPK);
            item.setScyOutCode(controller.getView().getTextMapOutletScyOutletCode().getText().trim());
            item.setMslsoutCode(controller.getView().getTextMapOutletMSLOutletCode().getText().trim());

            item.setMslsoutDesc(controller.getView().getTextMapOutletMSLOutletName().getText().trim());

            TabelOutletType itemTabelOutletType = new TabelOutletType();
            itemTabelOutletType = (TabelOutletType) controller.getView().getComboMapOutletOutletType().getModel().getSelectedItem();
            if (itemTabelOutletType!=null) {
               item.setTypeId(itemTabelOutletType.getKodeType());
               item.setTypeNm(itemTabelOutletType.getNamaType());
            }
            TabelOutletGroup itemTabelOutletGroup = new TabelOutletGroup();
            itemTabelOutletGroup = (TabelOutletGroup)controller.getView().getComboMapOutletGroupId().getModel().getSelectedItem();
            if(itemTabelOutletType!=null){
                item.setGroupId(itemTabelOutletGroup.getGroupId());
                item.setGroupNm(itemTabelOutletGroup.getGroupNm());
            }
            TabelOutletSubGroup itemTabelOutletSubGroup = new TabelOutletSubGroup();
            itemTabelOutletSubGroup = (TabelOutletSubGroup)controller.getView().getComboMapOutletSubGroupId().getModel().getSelectedItem();
            if (itemTabelOutletSubGroup!=null){
                item.setSubGrpId(itemTabelOutletSubGroup.getSubGroupId());
                item.setGroupNm(itemTabelOutletSubGroup.getSubGroupNm());
            }
            TabelOutletClass itemTabelOutletClass = new TabelOutletClass();
            itemTabelOutletClass =  (TabelOutletClass)controller.getView().getComboMapOutletClassId().getModel().getSelectedItem();
            if (itemTabelOutletClass!=null) {
                item.setClassId(itemTabelOutletClass.getClassId());
                item.setClassNm(itemTabelOutletClass.getClassNm());
            }
            TabelOutletSize itemTabelOutletSize = new TabelOutletSize();
            itemTabelOutletSize = (TabelOutletSize)controller.getView().getComboMapOutletBSizeId().getModel().getSelectedItem();
            if (itemTabelOutletSize!=null){
                item.setBsizeId(itemTabelOutletSize.getKodeSize());
                item.setBsizeNm(itemTabelOutletSize.getNamaSize());
            }
            TabelOutletLocation itemTabelOutletLocation = new TabelOutletLocation();
            itemTabelOutletLocation = (TabelOutletLocation)controller.getView().getComboMapOutletLocationId().getModel().getSelectedItem();
            if(itemTabelOutletLocation!=null){
                item.setLokId(itemTabelOutletLocation.getKodeLokasi());
                item.setLokNm(itemTabelOutletLocation.getNamaLokasi());
            }
            TMasterSalesman itemTSalesman = new TMasterSalesman();
            itemTSalesman = (TMasterSalesman)controller.getView().getComboMapOutletSalesmanCode().getModel().getSelectedItem();
            if(itemTSalesman!=null){
                item.setSalesCode(itemTSalesman.getSalesIdSap());
                item.setSalesNm(itemTSalesman.getSalesNmSap());
            }
            TMasterSalesman itemTSalesmanNas = new TMasterSalesman();
            itemTSalesmanNas =  (TMasterSalesman)controller.getView().getComboMapOutletNasionalSalesmanCode().getModel().getSelectedItem();
            if (itemTSalesmanNas!=null){
                item.setNasSalesCode(itemTSalesmanNas.getNasSalesmanCode());
                item.setNasSalesNm(itemTSalesmanNas.getNasSalesmanNm());
            }
            TabelKeyAccount itemTabelKeyAccount = new TabelKeyAccount();
            itemTabelKeyAccount =  (TabelKeyAccount)controller.getView().getComboMapOutletKeyAccountId().getModel().getSelectedItem();
            if(itemTabelKeyAccount!=null){
                item.setKaccId(itemTabelKeyAccount.getKodeKa());
                item.setKaccNm(itemTabelKeyAccount.getNamaKa());
            }

            item.setBaru(controller.getView().getCheckMapOutletBaru().isSelected());
            item.setAllowTransfer(controller.getView().getCheckMapOutletDikirim().isSelected());
            item.setAktif(controller.getView().getCheckMapOutletAktif().isSelected());


            //Operasi Simpan
            if (item.getScyOutCode().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Kode Scylla Harus Diisi!!..", "Validasi..", JOptionPane.ERROR_MESSAGE);
            } else {
              controller.getModel().tMasterOutletDao.saveOrUpdate(item);
               aksiBtnTMasterOutletReload();
            }

            //System.out.println(item.getTypeId());
            //System.out.println(item.getTypeNm());

        }    
        public void aksiBtnMapOutletDelete(){
            if (JOptionPane.showConfirmDialog(null, "Yakin Akan Hapus?", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
               int rowIndex =controller.getView().getTableMapOutlet().getSelectedRow();
               if (rowIndex >-1) {
                   TMasterOutlet item = new TMasterOutlet();
                   item =controller.getModel().tmTMasterOutlet.get(rowIndex);
                  controller.getModel().tMasterOutletDao.delete(item);
                   aksiBtnTMasterOutletReload();
               }   
            }

        }
        public void aksiBtnMapOutletSearch(){
           String scyId=controller.getView().getTextMapOutletSearchScyOutletCode().getText().trim();
           String sapId=controller.getView().getTextMapOutletSearchMSLOutletCode().getText().trim();
           String sapDesc =controller.getView().getTextMapOutletSearchMSLOutletName().getText().trim();

           Boolean semua =controller.getView().getCheckMapOutletSearchSemua().isSelected();
           Boolean baruSaja =controller.getView().getCheckMapOutletSearchBaruSaja().isSelected();
           Boolean dikirimSaja =controller.getView().getCheckMapOutletSearchDikirimSaja().isSelected();
           Boolean aktifSaja =controller.getView().getCheckMapOutletSearchAktifSaja().isSelected();

           List<TMasterOutlet> lst = new ArrayList<>();
           lst =controller.getModel().tMasterOutletDao.findById(scyId, sapId, sapDesc, semua, baruSaja, dikirimSaja, aktifSaja);
          controller.getModel().tmTMasterOutlet = new GenericTableModel<>(lst,TMasterOutlet.class);
          controller.getView().getTableMapOutlet().setModel(controller.getModel().tmTMasterOutlet);

        }
        public void aksiBtnMapOutletReload(){
            initiatesComboBoxMasterOutlet();
            aksiBtnTMasterOutletReload();                  
            controller.getView().resetSearchMapOutlet();
        }
        public void aksiListTabelMapOutlet(){
            int rowIndex =controller.getView().getTableMapOutlet().getSelectedRow();
            if (rowIndex > -1) {
                TMasterOutlet item = new TMasterOutlet();
                item =controller.getModel().tmTMasterOutlet.get(rowIndex);
                if (item!=null){
                   controller.getView().getTextMapOutletDistiId().setText(item.getDistiId());

                    //getTextMapOutletScyOutletCode().setText(item.gettOutletPK().getScyOutCode());
                    //getTextMapOutletMSLOutletCode().setText(item.gettOutletPK().getMslsoutCode());
                   controller.getView().getTextMapOutletScyOutletCode().setText(item.getScyOutCode());
                   controller.getView().getTextMapOutletMSLOutletCode().setText(item.getMslsoutCode());


                   controller.getView().getTextMapOutletMSLOutletName().setText(item.getMslsoutDesc());

                    TabelOutletType itemTabelOutletType = new TabelOutletType();
                    itemTabelOutletType.setKodeType(item.getTypeId());
                    itemTabelOutletType.setNamaType(item.getTypeNm());
                   controller.getView().getComboMapOutletOutletType().setSelectedItem(itemTabelOutletType);

                   TabelOutletGroup itemTabelOutletGroup = new TabelOutletGroup();
                   itemTabelOutletGroup.setGroupId(item.getGroupId());
                   itemTabelOutletGroup.setGroupNm(item.getGroupNm());
                  controller.getView().getComboMapOutletGroupId().setSelectedItem(itemTabelOutletGroup);

                   TabelOutletSubGroup itemTabelOutletSubGroup = new TabelOutletSubGroup();
                   itemTabelOutletSubGroup.setSubGroupId(item.getSubGrpId());
                   itemTabelOutletSubGroup.setSubGroupNm(item.getSubGrpNm());
                  controller.getView().getComboMapOutletSubGroupId().setSelectedItem(itemTabelOutletSubGroup);

                   TabelOutletClass itemTabelOutletClass = new TabelOutletClass();
                   itemTabelOutletClass.setClassId(item.getClassId());
                   itemTabelOutletClass.setClassNm(item.getClassNm());
                  controller.getView().getComboMapOutletClassId().setSelectedItem(itemTabelOutletClass);

                   TabelOutletSize itemTabelOutletSize = new TabelOutletSize();
                   itemTabelOutletSize.setKodeSize(item.getBsizeId());
                   itemTabelOutletSize.setNamaSize(item.getBsizeNm());
                  controller.getView().getComboMapOutletBSizeId().setSelectedItem(itemTabelOutletSize);

                   TabelOutletLocation itemTabelOutletLocation = new TabelOutletLocation();
                   itemTabelOutletLocation.setKodeLokasi(item.getLokId());
                   itemTabelOutletLocation.setNamaLokasi(item.getLokNm());
                  controller.getView().getComboMapOutletLocationId().setSelectedItem(itemTabelOutletLocation);

                   TMasterSalesman itemTSalesman = new TMasterSalesman();
                   itemTSalesman.setSalesIdSap(item.getSalesCode());
                   itemTSalesman.setSalesNmSap(item.getSalesNm());
                  controller.getView().getComboMapOutletSalesmanCode().setSelectedItem(itemTSalesman);

                   TMasterSalesman itemTSalesmanNas = new TMasterSalesman();
                   itemTSalesmanNas.setNasSalesmanCode(item.getNasSalesCode());
                   itemTSalesmanNas.setNasSalesmanNm(item.getNasSalesNm());
                  controller.getView().getComboMapOutletNasionalSalesmanCode().setSelectedItem(itemTSalesmanNas);

                   TabelKeyAccount itemTabelKeyAccount = new TabelKeyAccount();
                   itemTabelKeyAccount.setKodeKa(item.getKaccId());
                   itemTabelKeyAccount.setNamaKa(item.getKaccNm());
                  controller.getView().getComboMapOutletKeyAccountId().setSelectedItem(itemTabelKeyAccount);        

                   //Penanda
                  controller.getView().getCheckMapOutletBaru().setSelected(item.getBaru()!=null?item.getBaru():false);
                  controller.getView().getCheckMapOutletDikirim().setSelected(item.getAllowTransfer()!=null?item.getAllowTransfer():false);
                  controller.getView().getCheckMapOutletAktif().setSelected(item.getAktif()!=null?item.getAktif():false);

                }
            }
        }

        public void aksiBtnMapProductSearch(){
           String scyId=controller.getView().getTextMapProductSearchIdBrgScylla().getText().trim();
           String sapId=controller.getView().getTextMapProductSearchIdSap().getText().trim();
           String sapDesc =controller.getView().getTextMapProductSearchNamaBarangSAP().getText().trim();

           Boolean semua =controller.getView().getCheckMapProductSearchSemua().isSelected();
           Boolean baruSaja =controller.getView().getCheckMapProductSearchBaruSaja().isSelected();
           Boolean dikirimSaja =controller.getView().getCheckMapProductSearchDikirimSaja().isSelected();
           Boolean bonusSaja =controller.getView().getCheckMapProductSearchBonusSaja().isSelected();
           Boolean aktifSaja =controller.getView().getCheckMapProductSearchAktifSaja().isSelected();

           List<TMasterProduct> lst = new ArrayList<>();
           lst =controller.getModel().tMasterProductDao.findById(scyId, sapId, sapDesc, semua, baruSaja, dikirimSaja, bonusSaja, aktifSaja);
           controller.getModel().tmTMasterProduct = new GenericTableModel<>(lst,TMasterProduct.class);
           controller.getView().getTableMapProduct().setModel(controller.getModel().tmTMasterProduct);

        }
        public void aksiBtnMapProductSave(){
            TMasterProduct item = new TMasterProduct();
            item.setAreaId(controller.getView().getTextMapProductAreaId().getText().trim());
            item.setDistId(controller.getView().getTextMapProductDistributorId().getText().trim());
            //Primary
            item.setPcodeScylla(controller.getView().getTextMapProductIdBrgScylla().getText().trim());

            item.setPcodeSap(controller.getView().getTextMapProductIdSap().getText().trim());
            item.setPnameSap(controller.getView().getTextMapProductNamaBarangSAP().getText().trim());

            TabelProdDivisi itemTabelProdDivisi = new TabelProdDivisi();
            itemTabelProdDivisi = (TabelProdDivisi)controller.getView().getComboMapProductDivisi().getModel().getSelectedItem();
            if (itemTabelProdDivisi!=null) {
                item.setKodeDivisi(itemTabelProdDivisi.getDivisiId());
                item.setNamaDivisi(itemTabelProdDivisi.getDivisiNm());
            }
            TabelProdBrand itemTabelProdBrand = new TabelProdBrand();
            itemTabelProdBrand = (TabelProdBrand)controller.getView().getComboMapProductBrand().getModel().getSelectedItem();
            if (itemTabelProdBrand!=null){
                item.setKodeBrand(itemTabelProdBrand.getBrandId());
                item.setNamaBrand(itemTabelProdBrand.getBrandNm());
            }
            TabelProdSubBrand itemTabelProdSubBrand = new TabelProdSubBrand();
            itemTabelProdSubBrand =  (TabelProdSubBrand)controller.getView().getComboMapProductSubBrand().getModel().getSelectedItem();
            if(itemTabelProdSubBrand!=null){
                item.setKodeSubBrand(itemTabelProdSubBrand.getSubBrandId());
                item.setNamaSubBrand(itemTabelProdSubBrand.getSubBrandNm());
            }
            TabelProdCategory itemTabelProdCategory = new TabelProdCategory();
            itemTabelProdCategory = (TabelProdCategory)controller.getView().getComboMapProductCategory().getModel().getSelectedItem();
            if (itemTabelProdCategory!=null){
                item.setKodeCategory(itemTabelProdCategory.getCategoryId());
                item.setNamaCategory(itemTabelProdCategory.getCategoryNm());
            }
            TabelProdSubCategory itemTabelProdSubCategory = new TabelProdSubCategory();
            itemTabelProdSubCategory = (TabelProdSubCategory)controller.getView().getComboMapProductSubCategory().getModel().getSelectedItem();
            if (itemTabelProdSubCategory!=null){
                item.setKodeSubCategory(itemTabelProdSubCategory.getSubCategoryId());
                item.setNamaSubCategory(itemTabelProdSubCategory.getSubCategoryNm());
            }
            TabelProdVariance itemTabelProdVariance = new TabelProdVariance();
            itemTabelProdVariance = (TabelProdVariance)controller.getView().getComboMapProductVariance().getModel().getSelectedItem();
            if (itemTabelProdVariance!=null){
                item.setKodeVariance(itemTabelProdVariance.getVarianceId());
                item.setNamaVariance(itemTabelProdVariance.getVarianceNm());
            }
            TabelProdSize itemTabelProdSize = new TabelProdSize();
            itemTabelProdSize = (TabelProdSize)controller.getView().getComboMapProductSize().getModel().getSelectedItem();
            if (itemTabelProdSize!=null){
                item.setKodeSize(itemTabelProdSize.getSizeId());
                item.setNamaSize(itemTabelProdSize.getSizeNm());
            }

            item.setBaru(controller.getView().getCheckMapProductBaru().isSelected());
            item.setAllowTransfer(controller.getView().getCheckMapProductDikirim().isSelected());
            item.setBonus(controller.getView().getCheckMapProductBonus().isSelected());
            item.setAktif(controller.getView().getCheckMapProductAktif().isSelected());

            //Dao Simpan
            if (! item.getPcodeScylla().trim().equals("")) {
               controller.getModel().tMasterProductDao.saveOrUpdate(item);
               aksiBtnTMasterProductReload();
            } else {
                JOptionPane.showMessageDialog(null, "Kode Scylla Harus Diisi!!..", "Validasi..", JOptionPane.ERROR_MESSAGE);

            }

        }          
        public void aksiBtnMapProductDelete(){
            if (JOptionPane.showConfirmDialog(null, "Yakin Akan Hapus?", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
               int rowIndex =controller.getView().getTableMapProduct().getSelectedRow();
               if (rowIndex >-1) {
                   TMasterProduct item = new TMasterProduct();
                   item =controller.getModel().tmTMasterProduct.get(rowIndex);
                  controller.getModel().tMasterProductDao.delete(item);
                   aksiBtnTMasterProductReload();
               }   
            }

            aksiBtnMapProductReload();
        }
        public void aksiBtnMapProductReload(){
            initiatesComboBoxMasterProduct();
            aksiBtnTMasterProductReload();

            controller.getView().resetSearchMapProduct();
        }         
        public void aksiListTabelMapProduct(){
            int rowIndex = controller.getView().getTableMapProduct().getSelectedRow();
            if (rowIndex > -1) {
                TMasterProduct item = new TMasterProduct();
                item = controller.getModel().tmTMasterProduct.get(rowIndex);                 

                if (item!=null){
                   controller.getView().getTextMapProductAreaId().setText(item.getAreaId());
                   controller.getView().getTextMapProductDistributorId().setText(item.getDistId());
                   controller.getView().getTextMapProductIdBrgScylla().setText(item.getPcodeScylla());
                   controller.getView().getTextMapProductIdSap().setText(item.getPcodeSap());
                   controller.getView().getTextMapProductNamaBarangSAP().setText(item.getPnameSap());

                   TabelProdDivisi itemTabelProdDivisi = new TabelProdDivisi();
                   itemTabelProdDivisi.setDivisiId(item.getKodeDivisi());
                   itemTabelProdDivisi.setDivisiNm(item.getNamaDivisi());
                  controller.getView().getComboMapProductDivisi().setSelectedItem(itemTabelProdDivisi);

                   TabelProdBrand itemTabelProdBrand = new TabelProdBrand();
                   itemTabelProdBrand.setBrandId(item.getKodeBrand());
                   itemTabelProdBrand.setBrandNm(item.getNamaBrand());
                  controller.getView().getComboMapProductBrand().setSelectedItem(itemTabelProdBrand);

                   TabelProdSubBrand itemTabelProdSubBrand = new TabelProdSubBrand();
                   itemTabelProdSubBrand.setSubBrandId(item.getKodeSubBrand());
                   itemTabelProdSubBrand.setSubBrandNm(item.getNamaSubBrand());
                  controller.getView().getComboMapProductSubBrand().setSelectedItem(itemTabelProdSubBrand);

                   TabelProdCategory itemTabelProdCategory = new TabelProdCategory();
                   itemTabelProdCategory.setCategoryId(item.getKodeCategory());
                   itemTabelProdCategory.setCategoryNm(item.getNamaCategory());
                  controller.getView().getComboMapProductCategory().setSelectedItem(itemTabelProdCategory);

                   TabelProdSubCategory itemTabelProdSubCategory = new TabelProdSubCategory();
                   itemTabelProdSubCategory.setSubCategoryId(item.getKodeSubCategory());
                   itemTabelProdSubCategory.setSubCategoryNm(item.getNamaCategory());
                  controller.getView().getComboMapProductSubCategory().setSelectedItem(itemTabelProdSubCategory);

                   TabelProdVariance itemTabelProdVariance = new TabelProdVariance();
                   itemTabelProdVariance.setVarianceId(item.getKodeVariance());
                   itemTabelProdVariance.setVarianceNm(item.getNamaVariance());
                  controller.getView().getComboMapProductVariance().setSelectedItem(itemTabelProdVariance);

                   TabelProdSize itemTabelProdSize = new TabelProdSize();
                   itemTabelProdSize.setSizeId(item.getKodeSize());
                   itemTabelProdSize.setSizeNm(item.getNamaSize());
                  controller.getView().getComboMapProductSize().setSelectedItem(itemTabelProdVariance);

                   //Penanda
                  controller.getView().getCheckMapProductBaru().setSelected(item.getBaru()!=null?item.getBaru():false);
                  controller.getView().getCheckMapProductDikirim().setSelected(item.getAllowTransfer()!=null?item.getAllowTransfer():false);
                  controller.getView().getCheckMapProductBonus().setSelected(item.getBonus()!=null?item.getBonus():false);
                  controller.getView().getCheckMapProductAktif().setSelected(item.getAktif()!=null?item.getAktif():false);
                }
            }     
        }
         
        //KEK : BACKUP AND RESTORE         
        public void aksiBtnBackupAndRestoreBackupPath(){
            JFileChooser fileChooser1 =  new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser1.setDialogTitle("Path Backup File");        

            if (fileChooser1.showOpenDialog(null) ==JFileChooser.APPROVE_OPTION){
                File filePath = fileChooser1.getSelectedFile();
                controller.getModel().setCurrentPath(filePath.toString());            
                if (filePath != null) {
                    String strDirPath = filePath.getAbsolutePath() + File.separator;
                   controller.getView().getTextBackupAndRestoreBackupPath().setText(strDirPath);
                }
            }    
        }         
        public void aksiBtnBackupAndRestoreBackupStartBackup(){
            String delimeted = "COMMA";
            if (controller.getView().getRadioBackupAndRestoreBackupTabDelimeted().isSelected()) {
                delimeted = "TAB";
            }
            if (controller.getView().getCheckBackupAndRestoreBackupTabelTabel().isSelected()) {
                BackupTabelTabelSap bakTabelTabel = new BackupTabelTabelSap();
                if (!controller.getView().getTextBackupAndRestoreBackupPath().getText().trim().equals("")) {
                    bakTabelTabel.runBackupTabelTabelSap(controller.getView().getTextBackupAndRestoreBackupPath().getText().trim(), delimeted);
                }
            }
            if (controller.getView().getCheckBackupRestoreBackupFileMaster().isSelected()) {
                BackupFileMasterSap bakFileMaster = new BackupFileMasterSap();
                if (!controller.getView().getTextBackupAndRestoreBackupPath().getText().trim().equals("")) {
                    bakFileMaster.runBackupMasterSap(controller.getView().getTextBackupAndRestoreBackupPath().getText().trim(), delimeted);
                }
            }     
            controller.getModel().setCurrentPath(controller.getView().getTextBackupAndRestoreBackupPath().getText().trim());
            JOptionPane.showMessageDialog(null, "Backup Tabel-tabel dan Master SAP Sukses...", "Backup", JOptionPane.INFORMATION_MESSAGE);
        }
         
        public void aksiBtnBackupAndRestoreRestorePath(){
            JFileChooser fileChooser1 =  new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser1.setDialogTitle("Path Backup File");        

            if (fileChooser1.showOpenDialog(null) ==JFileChooser.APPROVE_OPTION){
                File filePath = fileChooser1.getSelectedFile();
                controller.getModel().setCurrentPath(filePath.toString());            
                if (filePath != null) {
                    String strDirPath = filePath.getAbsolutePath() + File.separator;
                   controller.getView().getTextBackupAndRestoreRestorePath().setText(strDirPath);
                }
            }    
         }         
        public void aksiBtnBackupAndRestoreStartRestore(){
            if (JOptionPane.showConfirmDialog(null, "Yakin akan merestore File Master", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                
                if (!controller.getView().getTextBackupAndRestoreRestorePath().getText().trim().equals("")) {  
                    int isOverwrite=0;
                    int isGantiBaru=0;

                    if (controller.getView().getCheckBackupAndRestoreRestoreOverwrite().isSelected()) {
                        isOverwrite=1;
                    }
                    if (controller.getView().getCheckBackupAndRestoreRestoreGantiDenganDataBaru().isSelected()) {
                        isOverwrite=1;
                    }
                    String tambahanPesan = "Terdapat kesalahan pada";
                    //Restore Tabel TMaster
                     if (controller.getView().getCheckBackupAndRestoreRestoreFileMaster().isSelected()) {
                         try {
                             RestoreFileMasterSap fm= new RestoreFileMasterSap();
                             fm.runRestoreMasterSap(controller.getView().getTextBackupAndRestoreRestorePath().getText().trim(),isOverwrite, isGantiBaru);
                         } catch(Exception ex){
                             logger.error("Error Button Restore File Master", ex);
                             tambahanPesan += " RESTORE FILE MASTER";
                         }
                         aksiReloadMasterSAP();
                     }
                     //Restore Tabel-Tabel
                     if (controller.getView().getCheckBackupAndRestoreRestoreTabelTabel().isSelected()) {
                         try {
                             RestoreTabelTabelSap ft = new RestoreTabelTabelSap();
                             ft.runRestoreTabelTabelSap(controller.getView().getTextBackupAndRestoreRestorePath().getText().trim(),isOverwrite, isGantiBaru);
                         } catch(Exception ex){
                             logger.error("Error Button Restore Tabel Tabel", ex);
                             if (tambahanPesan.equalsIgnoreCase("Terdapat kesalahan pada")) tambahanPesan += " dan ";
                             tambahanPesan += " RESTORE TABEL-TABEL";
                         }
                         //KESALAHAN AWAL: Kesalahan karena
                         //aksiReloadTabelTabel();
                         controller.bridgingControllerActionTabelTabel.aksiReloadTabelTabelKek();
                         controller.bridgingControllerActionMappingMaster.aksiReloadMasterSAP();
                     }
                      controller.getModel().setCurrentPath(controller.getView().getTextBackupAndRestoreRestorePath().getText().trim());
                      if (tambahanPesan.equalsIgnoreCase("Terdapat kesalahan pada")) {
                         JOptionPane.showMessageDialog(null, "Proses RESTORE Tabel-tabel dan Master SAP Selesai...", "Informasi..", JOptionPane.INFORMATION_MESSAGE);
                      } else {
                          JOptionPane.showMessageDialog(null, "Proses RESTORE Selesai namun " + tambahanPesan, "Informasi..", JOptionPane.WARNING_MESSAGE);
                      }
                 }
            }
           
        }
        
        /**
         * POKARI : BACKUP AND RESTORE
         */
        public void aksiBtnBackupAndRestoreBackupPathPokari(){
            JFileChooser fileChooser1 =  new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser1.setDialogTitle("Path Backup File");        

            if (fileChooser1.showOpenDialog(null) ==JFileChooser.APPROVE_OPTION){
                File filePath = fileChooser1.getSelectedFile();
                controller.getModel().setCurrentPath(filePath.toString());            
                if (filePath != null) {
                    String strDirPath = filePath.getAbsolutePath() + File.separator;
                   controller.getView().getTextBackupAndRestoreBackupPathPokari().setText(strDirPath);
                }
            }    
        
        }
        public void aksiBtnBackupAndRestoreBackupStartBackupPokari(){
            String delimeted = "COMMA";
            if (controller.getView().getRadioBackupAndRestoreBackupTabDelimetedPokari().isSelected()) {
                delimeted = "TAB";
            }
            if (controller.getView().getCheckBackupAndRestoreBackupTabelTabelPokari().isSelected()) {
                /**
                 * POKARI : START BACKUP TABEL-TABEL
                 */
                BackupTabelTabelPokari bakTabelTabel = new BackupTabelTabelPokari(this.controller);
                if (!controller.getView().getTextBackupAndRestoreBackupPathPokari().getText().trim().equals("")) {
                    bakTabelTabel.runBackupTabelTabelPokari(
                            controller.getView().getTextBackupAndRestoreBackupPathPokari().getText().trim(), delimeted, null);
                }
            }
            if (controller.getView().getCheckBackupRestoreBackupFileMasterPokari().isSelected()) {
                /**
                 * POKARI : START BACKUP MASTER
                 */
                BackupFileMasterPokari bakFileMaster = new BackupFileMasterPokari(this.controller);
                if (!controller.getView().getTextBackupAndRestoreBackupPathPokari().getText().trim().equals("")) {
                    bakFileMaster.runBackupMasterPokari(controller.getView().getTextBackupAndRestoreBackupPathPokari().getText().trim(), delimeted, null);
                }
            }     
            controller.getModel().setCurrentPath(controller.getView().getTextBackupAndRestoreBackupPathPokari().getText().trim());
            JOptionPane.showMessageDialog(null, "Backup Tabel-tabel dan Master POKARI Sukses...", "Backup", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
        public void aksiBtnBackupAndRestoreRestorePathPokari(){
            JFileChooser fileChooser1 =  new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser1.setDialogTitle("Path Backup File");        

            if (fileChooser1.showOpenDialog(null) ==JFileChooser.APPROVE_OPTION){
                File filePath = fileChooser1.getSelectedFile();
                controller.getModel().setCurrentPath(filePath.toString());            
                if (filePath != null) {
                    String strDirPath = filePath.getAbsolutePath() + File.separator;
                   controller.getView().getTextBackupAndRestoreRestorePathPokari().setText(strDirPath);
                }
            }    
        }        
        public void aksiBtnBackupAndRestoreRestoreStartRestorePokari(){
            if (JOptionPane.showConfirmDialog(null, "Yakin akan merestore File Master", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            
                if (!controller.getView().getTextBackupAndRestoreRestorePathPokari().getText().trim().equals("")) {  
                    int isOverwrite=0;
                    int isGantiBaru=0;

                    if (controller.getView().getCheckBackupAndRestoreRestoreOverwritePokari().isSelected()) {
                        isOverwrite=1;
                    }
                    if (controller.getView().getCheckBackupAndRestoreRestoreGantiDenganDataBaruPokari().isSelected()) {
                        isOverwrite=1;
                    }
                    String tambahanPesan = "Terdapat kesalahan pada";
                    //Restore Tabel TMaster
                     if (controller.getView().getCheckBackupAndRestoreRestoreFileMasterPokari().isSelected()) {
                         try {
                             RestoreFileMasterPokari fm= new RestoreFileMasterPokari(this.controller);
                             fm.runRestoreMasterPokari(controller.getView().getTextBackupAndRestoreRestorePathPokari().getText().trim(),isOverwrite, isGantiBaru);
                         } catch(Exception ex){
                             logger.error("Error Button Restore File Master", ex);
                             tambahanPesan += " RESTORE FILE MASTER";
                         }
                         aksiReloadMasterSAP();
                     }
                     //Restore Tabel-Tabel
                     if (controller.getView().getCheckBackupAndRestoreRestoreTabelTabelPokari().isSelected()) {
                         try {
                             RestoreTabelTabelPokari ft = new RestoreTabelTabelPokari(this.controller);
                             ft.runRestoreTabelTabelPokari(controller.getView().getTextBackupAndRestoreRestorePathPokari().getText().trim(),isOverwrite, isGantiBaru);
                         } catch(Exception ex){
                             logger.error("Error Button Restore Tabel Tabel", ex);
                             if (tambahanPesan.equalsIgnoreCase("Terdapat kesalahan pada")) tambahanPesan += " dan ";
                             tambahanPesan += " RESTORE TABEL-TABEL";
                         }
                         //KESALAHAN AWAL: Kesalahan karena
                         //aksiReloadTabelTabel();
                         controller.bridgingControllerActionTabelTabel.aksiReloadTabelTabelPokari();
                         controller.bridgingControllerActionMappingMaster.aksiReloadMasterPokari();
                     }
                      controller.getModel().setCurrentPath(controller.getView().getTextBackupAndRestoreRestorePathPokari().getText().trim());
                      if (tambahanPesan.equalsIgnoreCase("Terdapat kesalahan pada")) {
                         JOptionPane.showMessageDialog(null, "Proses RESTORE Tabel-tabel dan Master POKARI Selesai...", "Informasi..", JOptionPane.INFORMATION_MESSAGE);
                      } else {
                          JOptionPane.showMessageDialog(null, "Proses RESTORE Selesai namun " + tambahanPesan, "Informasi..", JOptionPane.WARNING_MESSAGE);
                      }
                 }
           
            }
        }        
        
        public void initiatesComboBoxMasterOutlet(){
            //1. Key Account
            DefaultComboBoxModel<TabelKeyAccount> cmTabelKeyAccount = new DefaultComboBoxModel<>();
            List<TabelKeyAccount> lst = controller.getModel().tabelKeyAccountDao.findAll();
            for (TabelKeyAccount itm: lst) {
                cmTabelKeyAccount.addElement(itm);
            }             
            controller.getView().getComboMapOutletKeyAccountId().setModel(cmTabelKeyAccount);             

            DefaultComboBoxModel<TabelOutletType> cmbTabelOutletType = new DefaultComboBoxModel<>();
            List<TabelOutletType> lstTabelOutletType = controller.getModel().tabelOutletTypeDao.getAll();
            for (TabelOutletType itm: lstTabelOutletType) {
                cmbTabelOutletType.addElement(itm);
            }             
            controller.getView().getComboMapOutletOutletType().setModel(cmbTabelOutletType);

            DefaultComboBoxModel<TabelOutletGroup> cmbTabelOutletGroup = new DefaultComboBoxModel<>();
            List<TabelOutletGroup> lstTabelOutletGroup = controller.getModel().tabelOutletGroupDao.getAll();
            for (TabelOutletGroup itm: lstTabelOutletGroup) {
                cmbTabelOutletGroup.addElement(itm);
            }             
            //Kosong
//            TabelOutletGroup groupKosong = new TabelOutletGroup();
//            groupKosong.setGroupId("111");groupKosong.setGroupNm("Kosong");
//            cmbTabelOutletGroup.addElement(groupKosong);
            controller.getView().getComboMapOutletGroupId().setModel(cmbTabelOutletGroup);
            
            DefaultComboBoxModel<TabelOutletSubGroup> cmbTabelOutletSubGroup = new DefaultComboBoxModel<>();
            List<TabelOutletSubGroup> lstTabelOutletSubGroup = controller.getModel().tabelOutletSubGroupDao.getAll();
            for (TabelOutletSubGroup itm: lstTabelOutletSubGroup) {
                cmbTabelOutletSubGroup.addElement(itm);
            }             
            //Kosong
//            TabelOutletSubGroup subGroupKosong = new TabelOutletSubGroup();
//            subGroupKosong.setSubGroupId("222");subGroupKosong.setSubGroupNm("Kosong");
//            cmbTabelOutletSubGroup.addElement(subGroupKosong);
            controller.getView().getComboMapOutletSubGroupId().setModel(cmbTabelOutletSubGroup);
            
            
            DefaultComboBoxModel<TabelOutletClass> cmbTabelOutletClass = new DefaultComboBoxModel<>();
            List<TabelOutletClass> lstTabelOutletClass = controller.getModel().tabelOutletClassDao.getAll();
            for (TabelOutletClass itm: lstTabelOutletClass) {
                cmbTabelOutletClass.addElement(itm);
            }             
            controller.getView().getComboMapOutletClassId().setModel(cmbTabelOutletClass);

            DefaultComboBoxModel<TabelOutletSize> cmbTabelOutletSize = new DefaultComboBoxModel<>();
            List<TabelOutletSize> lstTabelOutletSize = controller.getModel().tabelOutletSizeDao.getAll();
            for (TabelOutletSize itm: lstTabelOutletSize) {
                cmbTabelOutletSize.addElement(itm);
            }             
            controller.getView().getComboMapOutletBSizeId().setModel(cmbTabelOutletSize);

            DefaultComboBoxModel<TabelOutletLocation> cmbTabelOutletLocation = new DefaultComboBoxModel<>();
            List<TabelOutletLocation> lstTabelOutletLocation = controller.getModel().tabelOutletLocationDao.getAll();
            for (TabelOutletLocation itm: lstTabelOutletLocation) {
                cmbTabelOutletLocation.addElement(itm);
            }             
            controller.getView().getComboMapOutletLocationId().setModel(cmbTabelOutletLocation);

            //Area Statis Aja
            DefaultComboBoxModel<TabelOutletArea> cmbTabelOutletArea = new DefaultComboBoxModel<>();
            List<TabelOutletArea> lstTabelOutletArea = controller.getModel().tabelOutletAreaDao.getAll();
            for (TabelOutletArea itm: lstTabelOutletArea) {
                cmbTabelOutletArea.addElement(itm);
            }             
            controller.getView().getComboMapOutletAreaId().setModel(cmbTabelOutletArea);

            //Tabel Salesman
            DefaultComboBoxModel<TMasterSalesman> cmbTSalesman = new DefaultComboBoxModel<>();
            List<TMasterSalesman> lstTSalesman = controller.getModel().tMasterSalesmanDao.getAll();
            for (TMasterSalesman itm: lstTSalesman) {
                cmbTSalesman.addElement(itm);
            }             
            controller.getView().getComboMapOutletSalesmanCode().setModel(cmbTSalesman);

            //Tabel Salesman Nasional Code
            controller.getView().getComboMapOutletNasionalSalesmanCode().setModel(cmbTSalesman);

        }        
        public void initiatesComboBoxMasterSalesman(){
        }
        public void initiatesComboBoxMasterProduct(){
            DefaultComboBoxModel<TabelProdDivisi> cmbTabelProdDivisi = new DefaultComboBoxModel<>();
            List<TabelProdDivisi> lstTabelProdDivisi = controller.getModel().tabelProdDivisiDao.getAll();
            for (TabelProdDivisi itm: lstTabelProdDivisi) {
                cmbTabelProdDivisi.addElement(itm);
            }             
            controller.getView().getComboMapProductDivisi().setModel(cmbTabelProdDivisi);

            DefaultComboBoxModel<TabelProdBrand> cmbTabelProdBrand = new DefaultComboBoxModel<>();
            List<TabelProdBrand> lstTabelProdBrand = controller.getModel().tabelProdBrandDao.getAll();
            for (TabelProdBrand itm: lstTabelProdBrand) {
                cmbTabelProdBrand.addElement(itm);
            }             
            controller.getView().getComboMapProductBrand().setModel(cmbTabelProdBrand);

            DefaultComboBoxModel<TabelProdSubBrand> cmbTabelProdSubBrand = new DefaultComboBoxModel<>();
            List<TabelProdSubBrand> lstTabelProdSubBrand = controller.getModel().tabelProdSubBrandDao.getAll();
            for (TabelProdSubBrand itm: lstTabelProdSubBrand) {
                cmbTabelProdSubBrand.addElement(itm);
            }             
            controller.getView().getComboMapProductSubBrand().setModel(cmbTabelProdSubBrand);

            DefaultComboBoxModel<TabelProdCategory> cmbTabelProdCategory = new DefaultComboBoxModel<>();
            List<TabelProdCategory> lstTabelProdCategory  = controller.getModel().tabelProdCategoryDao.getAll();
            for (TabelProdCategory itm: lstTabelProdCategory) {
                cmbTabelProdCategory.addElement(itm);
            }
            controller.getView().getComboMapProductCategory().setModel(cmbTabelProdCategory);

            DefaultComboBoxModel<TabelProdSubCategory> cmbTabelProdSubCategory = new DefaultComboBoxModel<>();
            List<TabelProdSubCategory> lstTabelProdSubCategory = controller.getModel().tabelProdSubCategoryDao.getAll();
            for (TabelProdSubCategory itm: lstTabelProdSubCategory) {
                cmbTabelProdSubCategory.addElement(itm);
            }             
            controller.getView().getComboMapProductSubCategory().setModel(cmbTabelProdSubCategory);

            DefaultComboBoxModel<TabelProdVariance> cmbTabelProdVariance = new DefaultComboBoxModel<>();
            List<TabelProdVariance> lstTabelProdVariance = controller.getModel().tabelProdVarianceDao.getAll();
            for (TabelProdVariance itm: lstTabelProdVariance) {
                cmbTabelProdVariance.addElement(itm);
            }             
            controller.getView().getComboMapProductVariance().setModel(cmbTabelProdVariance);

            DefaultComboBoxModel<TabelProdSize> cmbTabelProdSize = new DefaultComboBoxModel<>();
            List<TabelProdSize> lstTabelProdSize = controller.getModel().tabelProdSizeDao.getAll();
            for (TabelProdSize itm: lstTabelProdSize) {
                cmbTabelProdSize.addElement(itm);
            }             
            controller.getView().getComboMapProductSize().setModel(cmbTabelProdSize);             
        }
        
}
