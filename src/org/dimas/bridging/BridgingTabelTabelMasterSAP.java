/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.config.spring.hibernate.model.TMasterProduct;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.config.spring.hibernate.model.TMasterSalesman;
import org.config.spring.hibernate.model.TabelKeyAccount;
import org.config.spring.hibernate.model.TabelOutletArea;
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
import org.config.spring.hibernate.model.tablemodel.GenericTableModel;
import org.dimas.bridging.backkupandrestore.BackupFileMasterSap;
import org.dimas.bridging.backkupandrestore.BackupTabelTabelSap;
import org.dimas.bridging.backkupandrestore.RestoreFileMasterSap;
import org.dimas.bridging.backkupandrestore.RestoreTabelTabelSap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class BridgingTabelTabelMasterSAP extends BridgingDefault {
    
         private static final Logger logger = LoggerFactory.getLogger(BridgingTabelTabelMasterSAP.class);
         
         public BridgingTabelTabelMasterSAP(){
             initActionsAdditional();
             initiates();
         }
         public void initiates(){
             initiatesComboBoxMasterSAP();
             
         }
         public void initiatesComboBoxMasterSAP(){
             initiatesComboBoxMasterSalesman();
             initiatesComboBoxMasterOutlet();
             initiatesComboBoxMasterProduct();
         }
         public void initiatesComboBoxMasterOutlet(){
             //1. Key Account
             DefaultComboBoxModel<TabelKeyAccount> cmTabelKeyAccount = new DefaultComboBoxModel<>();
             List<TabelKeyAccount> lst = tabelKeyAccountDao.findAll();
             for (TabelKeyAccount itm: lst) {
                 cmTabelKeyAccount.addElement(itm);
             }             
             getComboMapOutletKeyAccountId().setModel(cmTabelKeyAccount);             
             
             DefaultComboBoxModel<TabelOutletType> cmbTabelOutletType = new DefaultComboBoxModel<>();
             List<TabelOutletType> lstTabelOutletType = tabelOutletTypeDao.getAll();
             for (TabelOutletType itm: lstTabelOutletType) {
                 cmbTabelOutletType.addElement(itm);
             }             
             getComboMapOutletOutletType().setModel(cmbTabelOutletType);
             
             DefaultComboBoxModel<TabelOutletGroup> cmbTabelOutletGroup = new DefaultComboBoxModel<>();
             List<TabelOutletGroup> lstTabelOutletGroup = tabelOutletGroupDao.getAll();
             for (TabelOutletGroup itm: lstTabelOutletGroup) {
                 cmbTabelOutletGroup.addElement(itm);
             }             
             getComboMapOutletGroupId().setModel(cmbTabelOutletGroup);
             
             DefaultComboBoxModel<TabelOutletSubGroup> cmbTabelOutletSubGroup = new DefaultComboBoxModel<>();
             List<TabelOutletSubGroup> lstTabelOutletSubGroup = tabelOutletSubGroupDao.getAll();
             for (TabelOutletSubGroup itm: lstTabelOutletSubGroup) {
                 cmbTabelOutletSubGroup.addElement(itm);
             }             
             getComboMapOutletSubGroupId().setModel(cmbTabelOutletSubGroup);
             
             DefaultComboBoxModel<TabelOutletClass> cmbTabelOutletClass = new DefaultComboBoxModel<>();
             List<TabelOutletClass> lstTabelOutletClass = tabelOutletClassDao.getAll();
             for (TabelOutletClass itm: lstTabelOutletClass) {
                 cmbTabelOutletClass.addElement(itm);
             }             
             getComboMapOutletClassId().setModel(cmbTabelOutletClass);
             
             DefaultComboBoxModel<TabelOutletSize> cmbTabelOutletSize = new DefaultComboBoxModel<>();
             List<TabelOutletSize> lstTabelOutletSize = tabelOutletSizeDao.getAll();
             for (TabelOutletSize itm: lstTabelOutletSize) {
                 cmbTabelOutletSize.addElement(itm);
             }             
             getComboMapOutletBSizeId().setModel(cmbTabelOutletSize);

             DefaultComboBoxModel<TabelOutletLocation> cmbTabelOutletLocation = new DefaultComboBoxModel<>();
             List<TabelOutletLocation> lstTabelOutletLocation = tabelOutletLocationDao.getAll();
             for (TabelOutletLocation itm: lstTabelOutletLocation) {
                 cmbTabelOutletLocation.addElement(itm);
             }             
             getComboMapOutletLocationId().setModel(cmbTabelOutletLocation);
             
             //Area Statis Aja
             DefaultComboBoxModel<TabelOutletArea> cmbTabelOutletArea = new DefaultComboBoxModel<>();
             List<TabelOutletArea> lstTabelOutletArea = tabelOutletAreaDao.getAll();
             for (TabelOutletArea itm: lstTabelOutletArea) {
                 cmbTabelOutletArea.addElement(itm);
             }             
             getComboMapOutletAreaId().setModel(cmbTabelOutletArea);
             
             //Tabel Salesman
             DefaultComboBoxModel<TMasterSalesman> cmbTSalesman = new DefaultComboBoxModel<>();
             List<TMasterSalesman> lstTSalesman = tMasterSalesmanDao.getAll();
             for (TMasterSalesman itm: lstTSalesman) {
                 cmbTSalesman.addElement(itm);
             }             
             getComboMapOutletSalesmanCode().setModel(cmbTSalesman);
             
             //Tabel Salesman Nasional Code
             getComboMapOutletNasionalSalesmanCode().setModel(cmbTSalesman);
                          
         }
         public void initiatesComboBoxMasterSalesman(){
         }
         public void initiatesComboBoxMasterProduct(){
             DefaultComboBoxModel<TabelProdDivisi> cmbTabelProdDivisi = new DefaultComboBoxModel<>();
             List<TabelProdDivisi> lstTabelProdDivisi = tabelProdDivisiDao.getAll();
             for (TabelProdDivisi itm: lstTabelProdDivisi) {
                 cmbTabelProdDivisi.addElement(itm);
             }             
             getComboMapProductDivisi().setModel(cmbTabelProdDivisi);
             
             DefaultComboBoxModel<TabelProdBrand> cmbTabelProdBrand = new DefaultComboBoxModel<>();
             List<TabelProdBrand> lstTabelProdBrand = tabelProdBrandDao.getAll();
             for (TabelProdBrand itm: lstTabelProdBrand) {
                 cmbTabelProdBrand.addElement(itm);
             }             
             getComboMapProductBrand().setModel(cmbTabelProdBrand);
             
             DefaultComboBoxModel<TabelProdSubBrand> cmbTabelProdSubBrand = new DefaultComboBoxModel<>();
             List<TabelProdSubBrand> lstTabelProdSubBrand = tabelProdSubBrandDao.getAll();
             for (TabelProdSubBrand itm: lstTabelProdSubBrand) {
                 cmbTabelProdSubBrand.addElement(itm);
             }             
             getComboMapProductSubBrand().setModel(cmbTabelProdSubBrand);
             
             DefaultComboBoxModel<TabelProdCategory> cmbTabelProdCategory = new DefaultComboBoxModel<>();
             List<TabelProdCategory> lstTabelProdCategory  = tabelProdCategoryDao.getAll();
             for (TabelProdCategory itm: lstTabelProdCategory) {
                 cmbTabelProdCategory.addElement(itm);
             }
             getComboMapProductCategory().setModel(cmbTabelProdCategory);
                     
             DefaultComboBoxModel<TabelProdSubCategory> cmbTabelProdSubCategory = new DefaultComboBoxModel<>();
             List<TabelProdSubCategory> lstTabelProdSubCategory = tabelProdSubCategoryDao.getAll();
             for (TabelProdSubCategory itm: lstTabelProdSubCategory) {
                 cmbTabelProdSubCategory.addElement(itm);
             }             
             getComboMapProductSubCategory().setModel(cmbTabelProdSubCategory);

             DefaultComboBoxModel<TabelProdVariance> cmbTabelProdVariance = new DefaultComboBoxModel<>();
             List<TabelProdVariance> lstTabelProdVariance = tabelProdVarianceDao.getAll();
             for (TabelProdVariance itm: lstTabelProdVariance) {
                 cmbTabelProdVariance.addElement(itm);
             }             
             getComboMapProductVariance().setModel(cmbTabelProdVariance);
             
             DefaultComboBoxModel<TabelProdSize> cmbTabelProdSize = new DefaultComboBoxModel<>();
             List<TabelProdSize> lstTabelProdSize = tabelProdSizeDao.getAll();
             for (TabelProdSize itm: lstTabelProdSize) {
                 cmbTabelProdSize.addElement(itm);
             }             
             getComboMapProductSize().setModel(cmbTabelProdSize);             
         }
         
         public void initActionsAdditional(){
             getTableTabelKeyAccount().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelKeyAccountSelected();
                 }
             });
             getTableTabelOutletChain().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletChainSelected();
                 }
             });
             getTableTabelOutletClass().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletClassSelected();
                 }
             });
             getTableTabelOutletGroup().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletGroupSelected();
                 }
             });
             getTableTabelOutletLocation().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletLocationSelected();
                 }
             });
             getTableTabelOutletSize().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletSizeSelected();
                 }
             });
             getTableTabelOutletSubGroup().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletSubGroupSelected();
                 }
             });
             getTableTabelOutletType().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletTypeSelected();
                 }
             });
             
             getTableTabelProdBrand().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdBrandSelected();
                 }
             });
             getTableTabelProdCateg().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelTabelProdCategSelected();
                 }
             });
             getTableTabelProdDivisi().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdDivisiSelected();
                 }
             });
             getTableTabelProdSize().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdSizeSelected();
                 }
             });
             getTableTabelProdSubBrand().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdSubBrandSelected();
                 }
             });
             getTableTabelProdSubCateg().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdSubCategSelected();
                 }
             });
             getTableTabelProdVariance().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdVarianceSelected();
                 }
             });
//TABEL MASTER Product, Outlet, Salesman
             getTableMapProduct().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelMapProduct();
                 }
             });
             getTableMapOutlet().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelMapOutlet();
                 }
             });
             getTableMapSalesman().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelMapSalesman();
                 }
             });
                     
         }
         
         //List Tabel Product Selected
         public void aksiListTabelProdVarianceSelected(){
             int rowIndex = getTableTabelProdVariance().getSelectedRow();
             if (rowIndex >= 0) {
                 TabelProdVariance item = new TabelProdVariance();
                 item = tmTabelProdVariance.get(rowIndex);
                 getTextTabelProdVarianceVarianceId().setText(item.getVarianceId().trim());
                 getTextTabelProdVarianceVarianceNm().setText(item.getVarianceNm().trim());
             }
         }
         public void aksiListTabelProdSubCategSelected(){
             int rowIndex = getTableTabelProdSubCateg().getSelectedRow();
             if (rowIndex >= 0){
                 TabelProdSubCategory item = new TabelProdSubCategory();
                 item = tmTabelProdSubCategory.get(rowIndex);
                 getTextTabelProdSubCategSubCategId().setText(item.getSubCategoryId().trim());
                 getTextTabelProdSubCategSubCategNm().setText(item.getSubCategoryNm().trim());
             }
         }
         public void aksiListTabelProdSubBrandSelected(){
             int rowIndex = getTableTabelProdSubBrand().getSelectedRow();
             if (rowIndex >= 0) {
                 TabelProdSubBrand item = new TabelProdSubBrand();
                 item = tmTabelProdSubBrand.get(rowIndex);
                 getTextTabelProdSubBrandSubBrandId().setText(item.getSubBrandId().trim());
                 getTextTabelProdSubBrandSubBrandNm().setText(item.getSubBrandNm().trim());
             }
         }
         public void aksiListTabelProdSizeSelected(){
             int rowIndex = getTableTabelProdSize().getSelectedRow();
             if (rowIndex >= 0 ) {
                 TabelProdSize item = new TabelProdSize();
                 item = tmTabelProdSize.get(rowIndex);
                 getTextTabelProdSizeSizeId().setText(item.getSizeId().trim());
                 getTextTabelProdSizeSizeNm().setText(item.getSizeNm().trim());
             }         
         }         
         public void aksiListTabelProdDivisiSelected(){
             int rowIndex = getTableTabelProdDivisi().getSelectedRow();
             if (rowIndex >= 0) {
                 TabelProdDivisi item = new TabelProdDivisi();
                 item = tmTabelProdDivisi.get(rowIndex);
                 getTextTabelProdDivisiDivisiId().setText(item.getDivisiId().trim());
                 getTextTabelProdDivisiDivisiNm().setText(item.getDivisiNm().trim());
             }
         }
         public void aksiListTabelTabelProdCategSelected(){
             int rowIndex = getTableTabelProdCateg().getSelectedRow();
             if (rowIndex >=0){
                 TabelProdCategory item = new TabelProdCategory();
                 item = tmTabelProdCatetory.get(rowIndex);
                 getTextTabelProdCategCatedId().setText(item.getCategoryId().trim());
                 getTextTabelProdCategCategNm().setText(item.getCategoryNm().trim());
             }
         }
         public void aksiListTabelProdBrandSelected(){
             int rowIndex = getTableTabelProdBrand().getSelectedRow();
             if (rowIndex >=0){
                 TabelProdBrand item = new TabelProdBrand();
                 item = tmTabelProdBrand.get(rowIndex);
                 getTextTabelProdBrandBrandId().setText(item.getBrandId().trim());
                 getTextTabelProdBrandBrandNm().setText(item.getBrandNm().trim());
             }
         }
         
         //List Tabel Outlet Selected
         public void aksiListTabelOutletTypeSelected(){
             int rowIndex = getTableTabelOutletType().getSelectedRow();
             if (rowIndex >=0 ) {
                 TabelOutletType item = new TabelOutletType();
                 item = tmTabelOutletType.get(rowIndex);
                 getTextTabelOutletTypeKodeType().setText(item.getKodeType().trim());
                 getTextTabelOutletTypeNamaType().setText(item.getNamaType().trim());
             }
         }
         public void aksiListTabelOutletSubGroupSelected(){
             int rowIndex = getTableTabelOutletSubGroup().getSelectedRow();
             if (rowIndex >=0) {
                 TabelOutletSubGroup item = new TabelOutletSubGroup();
                 item = tmTabelOutletSubGroup.get(rowIndex);
                 getTextTabelOutletSubGroupOutletSubGroupId().setText(item.getSubGroupId().trim());
                 getTextTabelOutletSubGroupOutletSubGroupNm().setText(item.getSubGroupNm().trim());
             }
         }
         public void aksiListTabelOutletSizeSelected(){
             int rowIndex = getTableTabelOutletSize().getSelectedRow();
             if (rowIndex >=0) {
                 TabelOutletSize item = new TabelOutletSize();
                 item = tmTabelOutletSize.get(rowIndex);
                 getTextTabelOutletSizeKodeSize().setText(item.getKodeSize().trim());
                 getTextTabelOutletSizelNamaSize().setText(item.getNamaSize().trim());
             }
         }
         public void aksiListTabelOutletLocationSelected(){
             int rowIndex = getTableTabelOutletLocation().getSelectedRow();
             if (rowIndex >=0) {
                 TabelOutletLocation item = new TabelOutletLocation();
                 item = tmTabelOutletLocation.get(rowIndex);
                 getTextTabelOutletLocationKodeLokasi().setText(item.getKodeLokasi().trim());
                 getTextTabelOutletLocationNamaLokasi().setText(item.getNamaLokasi().trim());
             }
         }
         public void aksiListTabelOutletGroupSelected(){
             int rowIndex = getTableTabelOutletGroup().getSelectedRow();
             if (rowIndex >=0 ) {
                 TabelOutletGroup item = new TabelOutletGroup();
                 item = tmTabelOutletGroup.get(rowIndex);
                 getTextTabelOutletGroupOutletGroupId().setText(item.getGroupId().trim());
                 getTextTabelOutletGroupOutletGroupNm().setText(item.getGroupNm().trim());
             }
         }
         public void aksiListTabelOutletClassSelected(){
             int rowIndex = getTableTabelOutletClass().getSelectedRow();
             if (rowIndex >= 0) {
                 TabelOutletClass item = new TabelOutletClass();
                 item = tmTabelOutletClass.get(rowIndex);
                 getTextTabelOutletClassOutletClassId().setText(item.getClassId().trim());
                 getTextTabelOutletClassOutletClassNm().setText(item.getClassNm().trim());
             }
         }
         public void aksiListTabelOutletChainSelected(){
             int rowIndex = getTableTabelOutletChain().getSelectedRow();
             if (rowIndex >=0){
                 TabelOutletChain item = new TabelOutletChain();
                 item = tmTabelOutletChain.get(rowIndex);
                 getTextTabelOutletChainKodeChain().setText(item.getKodeChain().trim());
                 getTextTabelOutletChainNamaChain().setText(item.getNamaChain().trim());
             }
         }
         public void aksiListTabelKeyAccountSelected(){
             int rowIndex = getTableTabelKeyAccount().getSelectedRow();
             if (rowIndex >=0) {
                 TabelKeyAccount item = new TabelKeyAccount();
                 item = tmTabelKeyAccount.get(rowIndex);
                 getTextTabelKeyAccountKodeKa().setText(item.getKodeKa().trim());
                 getTextTabelKeyAccountNama().setText(item.getNamaKa().trim());
                 getTextTabelKeyAccountKeterangan().setText(item.getKeterangan().trim());
             }
         }
         
         //Tabel-tabel
         @Override
         public void aksiBtnTabelKeyAccountSave(){
             TabelKeyAccount item = new TabelKeyAccount();
             item.setKodeKa(getTextTabelKeyAccountKodeKa().getText().trim().toUpperCase());
             item.setNamaKa(getTextTabelKeyAccountNama().getText().trim());
             item.setKeterangan(getTextTabelKeyAccountKeterangan().getText().trim());
             if (! item.getKodeKa().equals("")) {
                tabelKeyAccountDao.saveOrUpdate(item);             
                aksiBtnTabelKeyAccountReload();
             }             
         }
         @Override
         public void aksiBtnTabelKeyAccountDelete(){
             TabelKeyAccount item = new TabelKeyAccount();
             item.setKodeKa(getTextTabelKeyAccountKodeKa().getText().trim().toUpperCase());
             item.setNamaKa(getTextTabelKeyAccountNama().getText().trim());
             item.setKeterangan(getTextTabelKeyAccountKeterangan().getText().trim());
             tabelKeyAccountDao.delete(item);
             aksiBtnTabelKeyAccountReload();
         }
         
         @Override
         public void aksiBtnTabelOutletGroupSave(){
             TabelOutletGroup item = new TabelOutletGroup();
             item.setGroupId(getTextTabelOutletGroupOutletGroupId().getText().trim().toUpperCase());
             item.setGroupNm(getTextTabelOutletGroupOutletGroupNm().getText().trim());
             if (! item.getGroupId().equals("")) {
                 tabelOutletGroupDao.saveOrUpdate(item);
                 aksiBtnTabelOutletGroupReload();
             }
         }
         @Override
         public void aksiBtnTabelOutletGroupDelete(){
             TabelOutletGroup item = new TabelOutletGroup();
             item.setGroupId(getTextTabelOutletGroupOutletGroupId().getText().trim().toUpperCase());
             item.setGroupNm(getTextTabelOutletGroupOutletGroupNm().getText().trim());
             tabelOutletGroupDao.delete(item);
             aksiBtnTabelOutletGroupReload();
         }
         @Override
         public void aksiBtnTabelOutletSubGroupSave(){
             TabelOutletSubGroup item = new TabelOutletSubGroup();
             item.setSubGroupId(getTextTabelOutletSubGroupOutletSubGroupId().getText().trim().toUpperCase());
             item.setSubGroupNm(getTextTabelOutletSubGroupOutletSubGroupNm().getText().trim());
             if (! item.getSubGroupId().equals("")) {
                 tabelOutletSubGroupDao.saveOrUpdate(item);
                 aksiBtnTabelOutletSubGroupReload();
             }
         }
         @Override
         public void aksiBtnTabelOutletSubGroupDelete(){
             TabelOutletSubGroup item = new TabelOutletSubGroup();
             item.setSubGroupId(getTextTabelOutletSubGroupOutletSubGroupId().getText().trim().toUpperCase());
             item.setSubGroupNm(getTextTabelOutletSubGroupOutletSubGroupNm().getText().trim());
            tabelOutletSubGroupDao.delete(item);
            aksiBtnTabelOutletSubGroupReload();
         }
         @Override
         public void aksiBtnTabelOutletClassDelete(){
             TabelOutletClass item= new TabelOutletClass();
             item.setClassId(getTextTabelOutletClassOutletClassId().getText().trim().toUpperCase());
             item.setClassNm(getTextTabelOutletClassOutletClassNm().getText().trim());
             tabelOutletClassDao.delete(item);
             aksiBtnTabelOutletClassReload();
         }
         @Override
         public void aksiBtnTabelOutletClassSave(){
             TabelOutletClass item= new TabelOutletClass();
             item.setClassId(getTextTabelOutletClassOutletClassId().getText().trim().toUpperCase());
             item.setClassNm(getTextTabelOutletClassOutletClassNm().getText().trim());
             if (! item.getClassId().equals("")) {
                 tabelOutletClassDao.saveOrUpdate(item);
                 aksiBtnTabelOutletClassReload();
             }
         }
         @Override
         public void aksiBtnTabelOutletChainSave(){
             TabelOutletChain item = new TabelOutletChain();
             item.setKodeChain(getTextTabelOutletChainKodeChain().getText().trim().toUpperCase());
             item.setNamaChain(getTextTabelOutletChainNamaChain().getText().trim());
             if (! item.getKodeChain().equals("")) {
                 tabelOutletChainDao.saveOrUpdate(item);
                 aksiBtnTabelOutletChainReload();
             }
         }
         @Override
         public void aksiBtnTabelOutletChainDelete() {
             TabelOutletChain item = new TabelOutletChain();
             item.setKodeChain(getTextTabelOutletChainKodeChain().getText().trim().toUpperCase());
             item.setNamaChain(getTextTabelOutletChainNamaChain().getText().trim());
            tabelOutletChainDao.delete(item);
            aksiBtnTabelOutletChainReload();
         }
         @Override
         public void aksiBtnTabelOutletLocationSave(){
             TabelOutletLocation item = new TabelOutletLocation();
             item.setKodeLokasi(getTextTabelOutletLocationKodeLokasi().getText().trim().toUpperCase());
             item.setNamaLokasi(getTextTabelOutletLocationNamaLokasi().getText().trim());
             if (! item.getKodeLokasi().equals("")) {
                 tabelOutletLocationDao.saveOrUpdate(item);
                 aksiBtnTabelOutletLocationReload();
             }
         }
         @Override
         public void aksiBtnTabelOutletLocationDelete(){
             TabelOutletLocation item = new TabelOutletLocation();
             item.setKodeLokasi(getTextTabelOutletLocationKodeLokasi().getText().trim().toUpperCase());
             item.setNamaLokasi(getTextTabelOutletLocationNamaLokasi().getText().trim());
            tabelOutletLocationDao.delete(item);
            aksiBtnTabelOutletLocationReload();
         }
         @Override
         public void aksiBtnTabelOutletTypeSave(){
             TabelOutletType item = new TabelOutletType();
             item.setKodeType(getTextTabelOutletTypeKodeType().getText().trim().toUpperCase());
             item.setNamaType(getTextTabelOutletTypeNamaType().getText().trim());
             if (! item.getKodeType().equals("")) {
                 tabelOutletTypeDao.saveOrUpdate(item);
                 aksiBtnTabelOutletTypeReload();
             }
         }
         @Override
         public void aksiBtnTabelOutletTypeDelete(){
             TabelOutletType item = new TabelOutletType();
             item.setKodeType(getTextTabelOutletTypeKodeType().getText().trim().toUpperCase());
             item.setNamaType(getTextTabelOutletTypeNamaType().getText().trim());
            tabelOutletTypeDao.delete(item);
            aksiBtnTabelOutletTypeReload();
         }
         @Override
         public void aksiBtnTabelOutletSizeSave(){
             TabelOutletSize item = new TabelOutletSize();
             item.setKodeSize(getTextTabelOutletSizeKodeSize().getText().trim().toUpperCase());
             item.setNamaSize(getTextTabelOutletSizelNamaSize().getText().trim());
             if (! item.getKodeSize().equals("")) {
                 tabelOutletSizeDao.saveOrUpdate(item);
                 aksiBtnTabelOutletSizeReload();
             }
         }
         @Override
         public void aksiBtnTabelOutletSizeDelete(){
             TabelOutletSize item = new TabelOutletSize();
             item.setKodeSize(getTextTabelOutletSizeKodeSize().getText().trim().toUpperCase());
             item.setNamaSize(getTextTabelOutletSizelNamaSize().getText().trim());
            tabelOutletSizeDao.delete(item);
            aksiBtnTabelOutletSizeReload();
    }
         //Tabel-Tabel Product
         @Override
         public void aksiBtnTabelProdVarianceSave(){
             TabelProdVariance item = new TabelProdVariance();
             item.setVarianceId(getTextTabelProdVarianceVarianceId().getText().trim().toUpperCase());
             item.setVarianceNm(getTextTabelProdVarianceVarianceNm().getText().trim());
             if (! item.getVarianceId().equals("")) {
                 tabelProdVarianceDao.saveOrUpdate(item);
                 aksiBtnTabelProdVarianceReload();
             }
         }
         @Override
         public void aksiBtnTabelProdVarianceDelete(){
             TabelProdVariance item = new TabelProdVariance();
             item.setVarianceId(getTextTabelProdVarianceVarianceId().getText().trim().toUpperCase());
             item.setVarianceNm(getTextTabelProdVarianceVarianceNm().getText().trim());
            tabelProdVarianceDao.delete(item);
            aksiBtnTabelProdVarianceReload();
         }
         @Override
         public void aksiBtnTabelProdSubCategSave(){
             TabelProdSubCategory item = new TabelProdSubCategory();
             item.setSubCategoryId(getTextTabelProdSubCategSubCategId().getText().trim().toUpperCase());
             item.setSubCategoryNm(getTextTabelProdSubCategSubCategNm().getText().trim());
             if (! item.getSubCategoryId().equals("")) {
                 tabelProdSubCategoryDao.saveOrUpdate(item);
                 aksiBtnTabelProdSubCategoryReload();
             }
         }
         @Override
         public void aksiBtnTabelProdSubCategDelete(){
             TabelProdSubCategory item = new TabelProdSubCategory();
             item.setSubCategoryId(getTextTabelProdSubCategSubCategId().getText().trim().toUpperCase());
             item.setSubCategoryNm(getTextTabelProdSubCategSubCategNm().getText().trim());
            tabelProdSubCategoryDao.delete(item);
            aksiBtnTabelProdSubCategoryReload();
         }
         @Override
         public void aksiBtnTabelProdSubBrandSave(){
             TabelProdSubBrand item = new TabelProdSubBrand();
             item.setSubBrandId(getTextTabelProdSubBrandSubBrandId().getText().trim().toUpperCase());
             item.setSubBrandNm(getTextTabelProdSubBrandSubBrandNm().getText().trim());
             if (! item.getSubBrandId().equals("")) {
                 tabelProdSubBrandDao.saveOrUpdate(item);
                 aksiBtnTabelProdSubBrandReload();
             }
         }
         @Override
         public void aksiBtnTabelProdSubBrandDelete(){
             TabelProdSubBrand item = new TabelProdSubBrand();
             item.setSubBrandId(getTextTabelProdSubBrandSubBrandId().getText().trim().toUpperCase());
             item.setSubBrandNm(getTextTabelProdSubBrandSubBrandNm().getText().trim());
            tabelProdSubBrandDao.delete(item);
            aksiBtnTabelProdSubBrandReload();
         }
         @Override
         public void aksiBtnTAbelProdSizeSave(){
             TabelProdSize item = new TabelProdSize();
             item.setSizeId(getTextTabelProdSizeSizeId().getText().trim().toUpperCase());
             item.setSizeNm(getTextTabelProdSizeSizeNm().getText().trim());
             if (! item.getSizeId().equals("")) {
                 tabelProdSizeDao.saveOrUpdate(item);
                 aksiBtnTabelProdSizeReload();
             }
         }
         @Override
         public void aksiBtnTabelProdSizeDelete(){
             TabelProdSize item = new TabelProdSize();
             item.setSizeId(getTextTabelProdSizeSizeId().getText().trim().toUpperCase());
             item.setSizeNm(getTextTabelProdSizeSizeNm().getText().trim());
            tabelProdSizeDao.delete(item);
            aksiBtnTabelProdSizeReload();
         }
         @Override
         public void aksiBtnTabelProdDivisiSave(){
             TabelProdDivisi item = new TabelProdDivisi();
             item.setDivisiId(getTextTabelProdDivisiDivisiId().getText().trim().toUpperCase());
             item.setDivisiNm(getTextTabelProdDivisiDivisiNm().getText().trim());
             if (! item.getDivisiId().equals("")) {
                 tabelProdDivisiDao.saveOrUpdate(item);
                 aksiBtnTabelProdDivisiReload();
             }
         }
         @Override
         public void aksiBtnTabelProdDivisiDelete(){
             TabelProdDivisi item = new TabelProdDivisi();
             item.setDivisiId(getTextTabelProdDivisiDivisiId().getText().trim().toUpperCase());
             item.setDivisiNm(getTextTabelProdDivisiDivisiNm().getText().trim());
            tabelProdDivisiDao.delete(item);
            aksiBtnTabelProdDivisiReload();
         }
         @Override
         public void aksiBtnTabelProdCategSave(){
             TabelProdCategory item = new TabelProdCategory();
             item.setCategoryId(getTextTabelProdCategCatedId().getText().trim().toUpperCase());
             item.setCategoryNm(getTextTabelProdCategCategNm().getText().trim());
             if (! item.getCategoryId().equals("")) {
                 tabelProdCategoryDao.saveOrUpdate(item);
                 aksiBtnTabelProdCategoryReload();
             }                 
         }
         @Override
         public void aksiBtnTabelProdCategDelete(){
             TabelProdCategory item = new TabelProdCategory();
             item.setCategoryId(getTextTabelProdCategCatedId().getText().trim().toUpperCase());
             item.setCategoryNm(getTextTabelProdCategCategNm().getText().trim());
            tabelProdCategoryDao.delete(item);
            aksiBtnTabelProdCategoryReload();
         }
         @Override
         public void aksiBtnTabelProdBrandSave(){
             TabelProdBrand item = new TabelProdBrand();
             item.setBrandId(getTextTabelProdBrandBrandId().getText().trim().toUpperCase());
             item.setBrandNm(getTextTabelProdBrandBrandNm().getText().trim());
             if (! item.getBrandId().equals("")){
                 tabelProdBrandDao.saveOrUpdate(item);
                 aksiBtnTabelProdBrandReload();
             }
         }
         @Override
         public void aksiBtnTabelProdBrandDelete(){
             TabelProdBrand item = new TabelProdBrand();
             item.setBrandId(getTextTabelProdBrandBrandId().getText().trim().toUpperCase());
             item.setBrandNm(getTextTabelProdBrandBrandNm().getText().trim());
            tabelProdBrandDao.delete(item);
            aksiBtnTabelProdBrandReload();
         }
         
         //Mapping Master Product, Outlet, Salesman
         @Override
         public void aksiBtnMapSalesmanSave(){
             TMasterSalesman item = new TMasterSalesman();
             
             item.setDistiCode(getTextMapSalesmanDistributorId().getText().trim());
             //item.setSalesIdScy(getTextMapSalesmanSalesmanId().getText().trim());
             
             item.setSalesIdSap(getTextMapSalesmanSalesmanId().getText().trim());
             item.setSalesIdScy(getTextMapSalesmanSalesmanIdScylla().getText().trim());
             item.setSalesNmSap(getTextMapSalesmanSalesmanName().getText().trim());
             
             //Jika tidak diisi maka ngikut kode scylla
             if (item.getSalesIdScy()==null) item.setSalesIdScy(item.getSalesIdSap());
             //Nama Salesman Scylla Ngikut
             if (item.getSalesNm()==null) item.setSalesNm(item.getSalesNmSap());
             
             item.setCalamat1(getTextMapSalesmanCAlamat1().getText().trim());
             item.setCalamat2(getTextMapSalesmanCAlamat2().getText().trim());
             item.setCkota(getTextMapSalesmanCKota().getText().trim());
             item.setCtelp(getTextMapSalesmanCTelpon().getText().trim());
             item.setKodeLevel(getTextMapSalesmanKodeLevel().getText().trim());
             item.setRpttoCode(getTextMapSalesmanRTTPCode().getText().trim());
             
             //Save jika kodenya tidak kosong
             if (! item.getSalesIdSap().equals("")) {
                 tMasterSalesmanDao.saveOrUpdate(item);
                aksiBtnTMasterSalesmanReload();
             } else {
                 JOptionPane.showMessageDialog(rootPane, "Kode Harus Diisi!!..", "Validasi..", JOptionPane.ERROR_MESSAGE);
             }
             
             
         }
         @Override
         public void aksiBtnMapSalesmanDelete(){
             if (JOptionPane.showConfirmDialog(rootPane, "Yakin Akan Hapus?", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
                int rowIndex = getTableMapSalesman().getSelectedRow();
                if (rowIndex >-1) {
                    TMasterSalesman item = new TMasterSalesman();
                    item = tmTMasterSalesman.get(rowIndex);
                    tMasterSalesmanDao.delete(item);
                     aksiBtnTMasterSalesmanReload();
                }   
             }
         }
         @Override
         public void aksiBtnMapSalesmanReload(){
             aksiBtnTMasterSalesmanReload();
             initiatesComboBoxMasterSalesman();
         }
         public void aksiListTabelMapSalesman(){
             int rowIndex = getTableMapSalesman().getSelectedRow();
             if (rowIndex >-1) {
                 TMasterSalesman item = new TMasterSalesman();
                 item = tmTMasterSalesman.get(rowIndex);
                 
                 getTextMapSalesmanDistributorId().setText(item.getDistiCode());
                 
                 getTextMapSalesmanSalesmanIdScylla().setText(item.getSalesIdScy());                 
                 getTextMapSalesmanSalesmanId().setText(item.getSalesIdSap());
                 getTextMapSalesmanSalesmanName().setText(item.getSalesNm());
                         
                 getTextMapSalesmanCAlamat1().setText(item.getCalamat1());
                 getTextMapSalesmanCAlamat2().setText(item.getCalamat2());
                 getTextMapSalesmanCKota().setText(item.getCkota());
                 getTextMapSalesmanCTelpon().setText(item.getCtelp());
                 getTextMapSalesmanKodeLevel().setText(item.getKodeLevel());
                 getTextMapSalesmanRTTPCode().setText(item.getRpttoCode());
                 
             }
         }
         
         @Override
         public void aksiBtnMapOutletSave(){
             TMasterOutlet item = new TMasterOutlet();
             item.setDistiId(getTextMapOutletDistiId().getText().trim());
             
             //TOutletPK itemPK = new TOutletPK();
             //itemPK.setScyOutCode(getTextMapOutletScyOutletCode().getText().trim());
             //itemPK.setMslsoutCode(getTextMapOutletMSLOutletCode().getText().trim());
             //item.settOutletPK(itemPK);
             item.setScyOutCode(getTextMapOutletScyOutletCode().getText().trim());
             item.setMslsoutCode(getTextMapOutletMSLOutletCode().getText().trim());
             
             item.setMslsoutDesc(getTextMapOutletMSLOutletName().getText().trim());
             
             TabelOutletType itemTabelOutletType = new TabelOutletType();
             itemTabelOutletType = (TabelOutletType) getComboMapOutletOutletType().getModel().getSelectedItem();
             if (itemTabelOutletType!=null) {
                item.setTypeId(itemTabelOutletType.getKodeType());
                item.setTypeNm(itemTabelOutletType.getNamaType());
             }
             TabelOutletGroup itemTabelOutletGroup = new TabelOutletGroup();
             itemTabelOutletGroup = (TabelOutletGroup) getComboMapOutletGroupId().getModel().getSelectedItem();
             if(itemTabelOutletType!=null){
                 item.setGroupId(itemTabelOutletGroup.getGroupId());
                 item.setGroupNm(itemTabelOutletGroup.getGroupNm());
             }
             TabelOutletSubGroup itemTabelOutletSubGroup = new TabelOutletSubGroup();
             itemTabelOutletSubGroup = (TabelOutletSubGroup) getComboMapOutletSubGroupId().getModel().getSelectedItem();
             if (itemTabelOutletSubGroup!=null){
                 item.setSubGrpId(itemTabelOutletSubGroup.getSubGroupId());
                 item.setGroupNm(itemTabelOutletSubGroup.getSubGroupNm());
             }
             TabelOutletClass itemTabelOutletClass = new TabelOutletClass();
             itemTabelOutletClass =  (TabelOutletClass) getComboMapOutletClassId().getModel().getSelectedItem();
             if (itemTabelOutletClass!=null) {
                 item.setClassId(itemTabelOutletClass.getClassId());
                 item.setClassNm(itemTabelOutletClass.getClassNm());
             }
             TabelOutletSize itemTabelOutletSize = new TabelOutletSize();
             itemTabelOutletSize = (TabelOutletSize) getComboMapOutletBSizeId().getModel().getSelectedItem();
             if (itemTabelOutletSize!=null){
                 item.setBsizeId(itemTabelOutletSize.getKodeSize());
                 item.setBsizeNm(itemTabelOutletSize.getNamaSize());
             }
             TabelOutletLocation itemTabelOutletLocation = new TabelOutletLocation();
             itemTabelOutletLocation = (TabelOutletLocation) getComboMapOutletLocationId().getModel().getSelectedItem();
             if(itemTabelOutletLocation!=null){
                 item.setLokId(itemTabelOutletLocation.getKodeLokasi());
                 item.setLokNm(itemTabelOutletLocation.getNamaLokasi());
             }
             TMasterSalesman itemTSalesman = new TMasterSalesman();
             itemTSalesman = (TMasterSalesman) getComboMapOutletSalesmanCode().getModel().getSelectedItem();
             if(itemTSalesman!=null){
                 item.setSalesCode(itemTSalesman.getSalesIdSap());
                 item.setSalesNm(itemTSalesman.getSalesNmSap());
             }
             TMasterSalesman itemTSalesmanNas = new TMasterSalesman();
             itemTSalesmanNas =  (TMasterSalesman) getComboMapOutletNasionalSalesmanCode().getModel().getSelectedItem();
             if (itemTSalesmanNas!=null){
                 item.setNasSalesCode(itemTSalesmanNas.getNasSalesmanCode());
                 item.setNasSalesNm(itemTSalesmanNas.getNasSalesmanNm());
             }
             TabelKeyAccount itemTabelKeyAccount = new TabelKeyAccount();
             itemTabelKeyAccount =  (TabelKeyAccount) getComboMapOutletKeyAccountId().getModel().getSelectedItem();
             if(itemTabelKeyAccount!=null){
                 item.setKaccId(itemTabelKeyAccount.getKodeKa());
                 item.setKaccNm(itemTabelKeyAccount.getNamaKa());
             }
             
             item.setBaru(getCheckMapOutletBaru().isSelected());
             item.setAllowTransfer(getCheckMapOutletDikirim().isSelected());
             item.setAktif(getCheckMapOutletAktif().isSelected());
             
             
             //Operasi Simpan
             if (item.getScyOutCode().trim().equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Kode Scylla Harus Diisi!!..", "Validasi..", JOptionPane.ERROR_MESSAGE);
             } else {
                tMasterOutletDao.saveOrUpdate(item);
                aksiBtnTMasterOutletReload();
             }
             
             //System.out.println(item.getTypeId());
             //System.out.println(item.getTypeNm());
             
         }
         @Override
         public void aksiBtnMapOutletDelete(){
             if (JOptionPane.showConfirmDialog(rootPane, "Yakin Akan Hapus?", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
                int rowIndex = getTableMapOutlet().getSelectedRow();
                if (rowIndex >-1) {
                    TMasterOutlet item = new TMasterOutlet();
                    item = tmTMasterOutlet.get(rowIndex);
                    tMasterOutletDao.delete(item);
                    aksiBtnTMasterOutletReload();
                }   
             }
             
         }
         @Override
         public void aksiBtnMapOutletSearch(){
            String scyId=getTextMapOutletSearchScyOutletCode().getText().trim();
            String sapId=getTextMapOutletSearchMSLOutletCode().getText().trim();
            String sapDesc = getTextMapOutletSearchMSLOutletName().getText().trim();
            
            Boolean semua = getCheckMapOutletSearchSemua().isSelected();
            Boolean baruSaja = getCheckMapOutletSearchBaruSaja().isSelected();
            Boolean dikirimSaja =getCheckMapOutletSearchDikirimSaja().isSelected();
            Boolean aktifSaja = getCheckMapOutletSearchAktifSaja().isSelected();
            
            List<TMasterOutlet> lst = new ArrayList<>();
            lst = tMasterOutletDao.findById(scyId, sapId, sapDesc, semua, baruSaja, dikirimSaja, aktifSaja);
            tmTMasterOutlet = new GenericTableModel<>(lst,TMasterOutlet.class);
            getTableMapOutlet().setModel(tmTMasterOutlet);
             
         }
         @Override
         public void aksiBtnMapOutletReload(){
             initiatesComboBoxMasterOutlet();
             aksiBtnTMasterOutletReload();     
             
             resetSearchMapOutlet();
         }         
         public void aksiListTabelMapOutlet(){
             int rowIndex = getTableMapOutlet().getSelectedRow();
             if (rowIndex > -1) {
                 TMasterOutlet item = new TMasterOutlet();
                 item = tmTMasterOutlet.get(rowIndex);
                 if (item!=null){
                     getTextMapOutletDistiId().setText(item.getDistiId());
                     
                     //getTextMapOutletScyOutletCode().setText(item.gettOutletPK().getScyOutCode());
                     //getTextMapOutletMSLOutletCode().setText(item.gettOutletPK().getMslsoutCode());
                     getTextMapOutletScyOutletCode().setText(item.getScyOutCode());
                     getTextMapOutletMSLOutletCode().setText(item.getMslsoutCode());
                     
                     
                     getTextMapOutletMSLOutletName().setText(item.getMslsoutDesc());
                     
                     TabelOutletType itemTabelOutletType = new TabelOutletType();
                     itemTabelOutletType.setKodeType(item.getTypeId());
                     itemTabelOutletType.setNamaType(item.getTypeNm());
                     getComboMapOutletOutletType().setSelectedItem(itemTabelOutletType);
                     
                    TabelOutletGroup itemTabelOutletGroup = new TabelOutletGroup();
                    itemTabelOutletGroup.setGroupId(item.getGroupId());
                    itemTabelOutletGroup.setGroupNm(item.getGroupNm());
                    getComboMapOutletGroupId().setSelectedItem(itemTabelOutletGroup);
                    
                    TabelOutletSubGroup itemTabelOutletSubGroup = new TabelOutletSubGroup();
                    itemTabelOutletSubGroup.setSubGroupId(item.getSubGrpId());
                    itemTabelOutletSubGroup.setSubGroupNm(item.getSubGrpNm());
                    getComboMapOutletSubGroupId().setSelectedItem(itemTabelOutletSubGroup);
                    
                    TabelOutletClass itemTabelOutletClass = new TabelOutletClass();
                    itemTabelOutletClass.setClassId(item.getClassId());
                    itemTabelOutletClass.setClassNm(item.getClassNm());
                    getComboMapOutletClassId().setSelectedItem(itemTabelOutletClass);
                    
                    TabelOutletSize itemTabelOutletSize = new TabelOutletSize();
                    itemTabelOutletSize.setKodeSize(item.getBsizeId());
                    itemTabelOutletSize.setNamaSize(item.getBsizeNm());
                    getComboMapOutletBSizeId().setSelectedItem(itemTabelOutletSize);
                    
                    TabelOutletLocation itemTabelOutletLocation = new TabelOutletLocation();
                    itemTabelOutletLocation.setKodeLokasi(item.getLokId());
                    itemTabelOutletLocation.setNamaLokasi(item.getLokNm());
                    getComboMapOutletLocationId().setSelectedItem(itemTabelOutletLocation);
                    
                    TMasterSalesman itemTSalesman = new TMasterSalesman();
                    itemTSalesman.setSalesIdSap(item.getSalesCode());
                    itemTSalesman.setSalesNmSap(item.getSalesNm());
                    getComboMapOutletSalesmanCode().setSelectedItem(itemTSalesman);
                    
                    TMasterSalesman itemTSalesmanNas = new TMasterSalesman();
                    itemTSalesmanNas.setNasSalesmanCode(item.getNasSalesCode());
                    itemTSalesmanNas.setNasSalesmanNm(item.getNasSalesNm());
                    getComboMapOutletNasionalSalesmanCode().setSelectedItem(itemTSalesmanNas);
                    
                    TabelKeyAccount itemTabelKeyAccount = new TabelKeyAccount();
                    itemTabelKeyAccount.setKodeKa(item.getKaccId());
                    itemTabelKeyAccount.setNamaKa(item.getKaccNm());
                    getComboMapOutletKeyAccountId().setSelectedItem(itemTabelKeyAccount);        
                    
                    //Penanda
                    getCheckMapOutletBaru().setSelected(item.getBaru()!=null?item.getBaru():false);
                    getCheckMapOutletDikirim().setSelected(item.getAllowTransfer()!=null?item.getAllowTransfer():false);
                    getCheckMapOutletAktif().setSelected(item.getAktif()!=null?item.getAktif():false);
                     
                 }
             }
         }
         
         @Override
         public void aksiBtnMapProductSearch(){
            String scyId=getTextMapProductSearchIdBrgScylla().getText().trim();
            String sapId=getTextMapProductSearchIdSap().getText().trim();
            String sapDesc = getTextMapProductSearchNamaBarangSAP().getText().trim();

            Boolean semua = getCheckMapProductSearchSemua().isSelected();
            Boolean baruSaja = getCheckMapProductSearchBaruSaja().isSelected();
            Boolean dikirimSaja =getCheckMapProductSearchDikirimSaja().isSelected();
            Boolean bonusSaja = getCheckMapProductSearchBonusSaja().isSelected();
            Boolean aktifSaja = getCheckMapProductSearchAktifSaja().isSelected();
            
            List<TMasterProduct> lst = new ArrayList<>();
            lst = tMasterProductDao.findById(scyId, sapId, sapDesc, semua, baruSaja, dikirimSaja, bonusSaja, aktifSaja);
            tmTMasterProduct = new GenericTableModel<>(lst,TMasterProduct.class);
            getTableMapProduct().setModel(tmTMasterProduct);
         }
         
         @Override
         public void aksiBtnMapProductSave(){
             TMasterProduct item = new TMasterProduct();
             item.setAreaId(getTextMapProductAreaId().getText().trim());
             item.setDistId(getTextMapProductDistributorId().getText().trim());
             //Primary
             item.setPcodeScylla(getTextMapProductIdBrgScylla().getText().trim());
             
             item.setPcodeSap(getTextMapProductIdSap().getText().trim());
             item.setPnameSap(getTextMapProductNamaBarangSAP().getText().trim());
             
             TabelProdDivisi itemTabelProdDivisi = new TabelProdDivisi();
             itemTabelProdDivisi = (TabelProdDivisi) getComboMapProductDivisi().getModel().getSelectedItem();
             if (itemTabelProdDivisi!=null) {
                 item.setKodeDivisi(itemTabelProdDivisi.getDivisiId());
                 item.setNamaDivisi(itemTabelProdDivisi.getDivisiNm());
             }
             TabelProdBrand itemTabelProdBrand = new TabelProdBrand();
             itemTabelProdBrand = (TabelProdBrand) getComboMapProductBrand().getModel().getSelectedItem();
             if (itemTabelProdBrand!=null){
                 item.setKodeBrand(itemTabelProdBrand.getBrandId());
                 item.setNamaBrand(itemTabelProdBrand.getBrandNm());
             }
             TabelProdSubBrand itemTabelProdSubBrand = new TabelProdSubBrand();
             itemTabelProdSubBrand =  (TabelProdSubBrand) getComboMapProductSubBrand().getModel().getSelectedItem();
             if(itemTabelProdSubBrand!=null){
                 item.setKodeSubBrand(itemTabelProdSubBrand.getSubBrandId());
                 item.setNamaSubBrand(itemTabelProdSubBrand.getSubBrandNm());
             }
             TabelProdCategory itemTabelProdCategory = new TabelProdCategory();
             itemTabelProdCategory = (TabelProdCategory) getComboMapProductCategory().getModel().getSelectedItem();
             if (itemTabelProdCategory!=null){
                 item.setKodeCategory(itemTabelProdCategory.getCategoryId());
                 item.setNamaCategory(itemTabelProdCategory.getCategoryNm());
             }
             TabelProdSubCategory itemTabelProdSubCategory = new TabelProdSubCategory();
             itemTabelProdSubCategory = (TabelProdSubCategory) getComboMapProductSubCategory().getModel().getSelectedItem();
             if (itemTabelProdSubCategory!=null){
                 item.setKodeSubCategory(itemTabelProdSubCategory.getSubCategoryId());
                 item.setNamaSubCategory(itemTabelProdSubCategory.getSubCategoryNm());
             }
             TabelProdVariance itemTabelProdVariance = new TabelProdVariance();
             itemTabelProdVariance = (TabelProdVariance) getComboMapProductVariance().getModel().getSelectedItem();
             if (itemTabelProdVariance!=null){
                 item.setKodeVariance(itemTabelProdVariance.getVarianceId());
                 item.setNamaVariance(itemTabelProdVariance.getVarianceNm());
             }
             TabelProdSize itemTabelProdSize = new TabelProdSize();
             itemTabelProdSize = (TabelProdSize) getComboMapProductSize().getModel().getSelectedItem();
             if (itemTabelProdSize!=null){
                 item.setKodeSize(itemTabelProdSize.getSizeId());
                 item.setNamaSize(itemTabelProdSize.getSizeNm());
             }
             
             item.setBaru(getCheckMapProductBaru().isSelected());
             item.setAllowTransfer(getCheckMapProductDikirim().isSelected());
             item.setBonus(getCheckMapProductBonus().isSelected());
             item.setAktif(getCheckMapProductAktif().isSelected());
             
             //Dao Simpan
             if (! item.getPcodeScylla().trim().equals("")) {
                 tMasterProductDao.saveOrUpdate(item);
                aksiBtnTMasterProductReload();
             } else {
                 JOptionPane.showMessageDialog(rootPane, "Kode Scylla Harus Diisi!!..", "Validasi..", JOptionPane.ERROR_MESSAGE);
             
             }
             
         }
         @Override
         public void aksiBtnMapProductDelete(){
             if (JOptionPane.showConfirmDialog(rootPane, "Yakin Akan Hapus?", "Konfirmasi..", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
                int rowIndex = getTableMapProduct().getSelectedRow();
                if (rowIndex >-1) {
                    TMasterProduct item = new TMasterProduct();
                    item = tmTMasterProduct.get(rowIndex);
                    tMasterProductDao.delete(item);
                    aksiBtnTMasterProductReload();
                }   
             }
             
             aksiBtnMapProductReload();
         }
         @Override
         public void aksiBtnMapProductReload(){
             initiatesComboBoxMasterProduct();
             aksiBtnTMasterProductReload();
             
             resetSearchMapProduct();
         }         
         public void aksiListTabelMapProduct(){
             int rowIndex = getTableMapProduct().getSelectedRow();
             if (rowIndex > -1) {
                 TMasterProduct item = new TMasterProduct();
                 item = tmTMasterProduct.get(rowIndex);
                 if (item!=null){
                     getTextMapProductAreaId().setText(item.getAreaId());
                     getTextMapProductDistributorId().setText(item.getDistId());
                     getTextMapProductIdBrgScylla().setText(item.getPcodeScylla());
                     getTextMapProductIdSap().setText(item.getPcodeSap());
                     getTextMapProductNamaBarangSAP().setText(item.getPnameSap());

                    TabelProdDivisi itemTabelProdDivisi = new TabelProdDivisi();
                    itemTabelProdDivisi.setDivisiId(item.getKodeDivisi());
                    itemTabelProdDivisi.setDivisiNm(item.getNamaDivisi());
                    getComboMapProductDivisi().setSelectedItem(itemTabelProdDivisi);
                    
                    TabelProdBrand itemTabelProdBrand = new TabelProdBrand();
                    itemTabelProdBrand.setBrandId(item.getKodeBrand());
                    itemTabelProdBrand.setBrandNm(item.getNamaBrand());
                    getComboMapProductBrand().setSelectedItem(itemTabelProdBrand);
                    
                    TabelProdSubBrand itemTabelProdSubBrand = new TabelProdSubBrand();
                    itemTabelProdSubBrand.setSubBrandId(item.getKodeSubBrand());
                    itemTabelProdSubBrand.setSubBrandNm(item.getNamaSubBrand());
                    getComboMapProductSubBrand().setSelectedItem(itemTabelProdSubBrand);
                    
                    TabelProdCategory itemTabelProdCategory = new TabelProdCategory();
                    itemTabelProdCategory.setCategoryId(item.getKodeCategory());
                    itemTabelProdCategory.setCategoryNm(item.getNamaCategory());
                    getComboMapProductCategory().setSelectedItem(itemTabelProdCategory);
                    
                    TabelProdSubCategory itemTabelProdSubCategory = new TabelProdSubCategory();
                    itemTabelProdSubCategory.setSubCategoryId(item.getKodeSubCategory());
                    itemTabelProdSubCategory.setSubCategoryNm(item.getNamaCategory());
                    getComboMapProductSubCategory().setSelectedItem(itemTabelProdSubCategory);
                    
                    TabelProdVariance itemTabelProdVariance = new TabelProdVariance();
                    itemTabelProdVariance.setVarianceId(item.getKodeVariance());
                    itemTabelProdVariance.setVarianceNm(item.getNamaVariance());
                    getComboMapProductVariance().setSelectedItem(itemTabelProdVariance);
                    
                    TabelProdSize itemTabelProdSize = new TabelProdSize();
                    itemTabelProdSize.setSizeId(item.getKodeSize());
                    itemTabelProdSize.setSizeNm(item.getNamaSize());
                    getComboMapProductSize().setSelectedItem(itemTabelProdVariance);
                    
                    //Penanda
                    getCheckMapProductBaru().setSelected(item.getBaru()!=null?item.getBaru():false);
                    getCheckMapProductDikirim().setSelected(item.getAllowTransfer()!=null?item.getAllowTransfer():false);
                    getCheckMapProductBonus().setSelected(item.getBonus()!=null?item.getBonus():false);
                    getCheckMapProductAktif().setSelected(item.getAktif()!=null?item.getAktif():false);
                 }
             }     
         }

        //Backup dan Reatore
        @Override
        public void aksiBtnBackupAndRestoreBackupPath(){
            JFileChooser fileChooser1 =  new JFileChooser(currentPath);
            fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser1.setDialogTitle("Path Backup File");        

            if (fileChooser1.showOpenDialog(this) ==JFileChooser.APPROVE_OPTION){
                File filePath = fileChooser1.getSelectedFile();
                currentPath = filePath.toString();            
                if (filePath != null) {
                    String strDirPath = filePath.getAbsolutePath() + File.separator;
                    getTextBackupAndRestoreBackupPath().setText(strDirPath);
                }
            }    
        }
        @Override
        public void aksiBtnBackupAndRestoreBackupStartBackup(){
            String delimeted = "COMMA";
            if (getRadioBackupAndRestoreBackupTabDelimeted().isSelected()) {
                delimeted = "TAB";
            }
            if (getCheckBackupAndRestoreBackupTabelTabel().isSelected()) {
                BackupTabelTabelSap bakTabelTabel = new BackupTabelTabelSap();
                if (! getTextBackupAndRestoreBackupPath().getText().trim().equals("")) {
                    bakTabelTabel.runBackupTabelTabelSap(getTextBackupAndRestoreBackupPath().getText().trim(), delimeted);
                }
            }
            if (getCheckBackupRestoreBackupFileMaster().isSelected()) {
                BackupFileMasterSap bakFileMaster = new BackupFileMasterSap();
                if (! getTextBackupAndRestoreBackupPath().getText().trim().equals("")) {
                    bakFileMaster.runBackupMasterSap(getTextBackupAndRestoreBackupPath().getText().trim(), delimeted);
                }
            }     
            currentPath = getTextBackupAndRestoreBackupPath().getText().trim();
            JOptionPane.showMessageDialog(this, "Backup Tabel-tabel dan Master SAP Sukses...", "Backup", JOptionPane.INFORMATION_MESSAGE);
        }
        @Override
        public void aksiBtnBackupAndRestoreRestorePath(){
            JFileChooser fileChooser1 =  new JFileChooser(currentPath);
            fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser1.setDialogTitle("Path Backup File");        

            if (fileChooser1.showOpenDialog(this) ==JFileChooser.APPROVE_OPTION){
                File filePath = fileChooser1.getSelectedFile();
                currentPath = filePath.toString();            
                if (filePath != null) {
                    String strDirPath = filePath.getAbsolutePath() + File.separator;
                    getTextBackupAndRestoreRestorePath().setText(strDirPath);
                }
            }    
         }
        @Override
        public void aksiBtnBackupAndRestoreStartRestore(){
           if (! getTextBackupAndRestoreRestorePath().getText().trim().equals("")) {  
               int isOverwrite=0;
               int isGantiBaru=0;
               
               if (getCheckBackupAndRestoreRestoreOverwrite().isSelected()) {
                   isOverwrite=1;
               }
               if (getCheckBackupAndRestoreRestoreGantiDenganDataBaru().isSelected()) {
                   isOverwrite=1;
               }
               String tambahanPesan = "Terdapat kesalahan pada";
               //Restore Tabel TMaster
                if (getCheckBackupAndRestoreRestoreFileMaster().isSelected()) {
                    try {
                        RestoreFileMasterSap fm= new RestoreFileMasterSap();
                        fm.runRestoreMasterSap(getTextBackupAndRestoreRestorePath().getText().trim(),isOverwrite, isGantiBaru);
                    } catch(Exception ex){
                        logger.error("Error Button Restore File Master", ex);
                        tambahanPesan += " RESTORE FILE MASTER";
                    }
                    aksiReloadMasterSAP();
                }
                //Restore Tabel-Tabel
                if (getCheckBackupAndRestoreRestoreTabelTabel().isSelected()) {
                    try {
                        RestoreTabelTabelSap ft = new RestoreTabelTabelSap();
                        ft.runRestoreTabelTabelSap(getTextBackupAndRestoreRestorePath().getText().trim(),isOverwrite, isGantiBaru);
                    } catch(Exception ex){
                        logger.error("Error Button Restore Tabel Tabel", ex);
                        if (tambahanPesan.equalsIgnoreCase("Terdapat kesalahan pada")) tambahanPesan += " dan ";
                        tambahanPesan += " RESTORE TABEL-TABEL";
                    }
                    aksiReloadTabelTabel();
                }
                 currentPath = getTextBackupAndRestoreRestorePath().getText().trim();
                 if (tambahanPesan.equalsIgnoreCase("Terdapat kesalahan pada")) {
                    JOptionPane.showMessageDialog(this, "Proses RESTORE Tabel-tabel dan Master SAP Selesai...", "Informasi..", JOptionPane.INFORMATION_MESSAGE);
                 } else {
                     JOptionPane.showMessageDialog(this, "Proses RESTORE Selesai namun " + tambahanPesan, "Informasi..", JOptionPane.WARNING_MESSAGE);
                 }
           }
            
           
        }
    
}
