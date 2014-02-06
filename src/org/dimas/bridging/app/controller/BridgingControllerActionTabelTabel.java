/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.app.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
import org.config.spring.hibernate.model.tablemodel.GenericTableModel;

/**
 *
 * @author yhawin
 */
public class BridgingControllerActionTabelTabel {
    private BridgingController controller;
    public BridgingControllerActionTabelTabel(BridgingController controller){
        this.controller = controller;
        initAction();
    }
    public void initAction(){
          //Tabel-Tabel
         controller.getView().getBtnTabelKeyAccountSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelKeyAccountSave();
             }
         });
         controller.getView().getBtnTabelKeyAccountDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelKeyAccountDelete();
             }
         });         
         controller.getView().getBtnTabelOutletGroupSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletGroupSave();
             }
         });
         controller.getView().getBtnTabelOutletGroupDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletGroupDelete();
             }
         });
         controller.getView().getBtnTabelOutletClassSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletClassSave();
             }
         });
         controller.getView().getBtnTabelOutletClassDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletClassDelete();
             }
         });
         controller.getView().getBtnTabelOutletSubGroupSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletSubGroupSave();
             }
         });
         controller.getView().getBtnTabelOutletSubGroupDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletSubGroupDelete();
             }
         });
         
         controller.getView().getBtnTabelOutletChainSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletChainSave();
             }
         });
         controller.getView().getBtnTabelOutletChainDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletChainDelete();
             }
         });
         controller.getView().getBtnTabelOutletLocationDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletLocationDelete();
             }
         });
         controller.getView().getBtnTabelOutletLocationSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletLocationSave();
             }
         });
         controller.getView().getBtnTabelOutletTypeDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletTypeDelete();
             }
         });
         controller.getView().getBtnTabelOutletTypeSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletTypeSave();
             }
         });
         controller.getView().getBtnTabelOutletSizeDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletSizeDelete();
             }
         });
         controller.getView().getBtnTabelOutletSizeSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletSizeSave();
             }
         });
         //Tabel-tabel Product
         controller.getView().getBtnTabelProdBrandDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdBrandDelete();
             }
         });
         controller.getView().getBtnTabelProdBrandSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdBrandSave();
             }
         });
         controller.getView().getBtnTabelProdCategDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdCategDelete();
             }
         });
         controller.getView().getBtnTabelProdCategSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdCategSave();
             }
         });
         controller.getView().getBtnTabelProdDivisiDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdDivisiDelete();
             }
         });
         controller.getView().getBtnTabelProdDivisiSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdDivisiSave();
             }
         });
         controller.getView().getBtnTabelProdSizeDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdSizeDelete();
             }
         });
         controller.getView().getBtnTabelProdSizeSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTAbelProdSizeSave();
             }
         });
         controller.getView().getBtnTabelProdSubBrandDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdSubBrandDelete();
             }
         });
         controller.getView().getBtnTabelProdSubBrandSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdSubBrandSave();
             }
         });
         controller.getView().getBtnTabelProdSubCategDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdSubCategDelete();
             }
         });
         controller.getView().getBtnTabelProdSubCategSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdSubCategSave();
             }
         });
         controller.getView().getBtnTabelProdVarianceDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdVarianceDelete();
             }
         });
         controller.getView().getBtnTabelProdVarianceSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdVarianceSave();
             }
         });
         
       //AKSI LIST TABLE
             controller.getView().getTableTabelKeyAccount().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelKeyAccountSelected();
                 }
             });
             controller.getView().getTableTabelOutletChain().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletChainSelected();
                 }
             });
             controller.getView().getTableTabelOutletClass().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletClassSelected();
                 }
             });
             controller.getView().getTableTabelOutletGroup().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletGroupSelected();
                 }
             });
             controller.getView().getTableTabelOutletLocation().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletLocationSelected();
                 }
             });
             controller.getView().getTableTabelOutletSize().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletSizeSelected();
                 }
             });
             controller.getView().getTableTabelOutletSubGroup().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletSubGroupSelected();
                 }
             });
             controller.getView().getTableTabelOutletType().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelOutletTypeSelected();
                 }
             });
             
             controller.getView().getTableTabelProdBrand().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdBrandSelected();
                 }
             });
             controller.getView().getTableTabelProdCateg().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelTabelProdCategSelected();
                 }
             });
             controller.getView().getTableTabelProdDivisi().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdDivisiSelected();
                 }
             });
             controller.getView().getTableTabelProdSize().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdSizeSelected();
                 }
             });
             controller.getView().getTableTabelProdSubBrand().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdSubBrandSelected();
                 }
             });
             controller.getView().getTableTabelProdSubCateg().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdSubCategSelected();
                 }
             });
             controller.getView().getTableTabelProdVariance().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     aksiListTabelProdVarianceSelected();
                 }
             });
             
             
             //POKARI ACTION LISTENER
         //POKARI : DELETE
         controller.getView().getBtnTabelTabelPokariCustomerGroupDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariCustomerGroupDelete();
             }
         });
         controller.getView().getBtnTabelTabelPokariCustomerHirarchyDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariCustomerHirarchyDelete();
             }
         });
         controller.getView().getBtnTabelTabelPokariGroupSalesDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariGroupSalesDelete();
             }
         });
         controller.getView().getBtnTabelTabelPokariProductBrandDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariProductBrandDelete();
             }
         });
         controller.getView().getBtnTabelTabelPokariSalesTerritoryDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariSalesTerritoryDelete();
             }
         });
         controller.getView().getBtnTabelTabelPokariTeamSalesDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariTeamSalesDelete();
             }
         });
         controller.getView().getBtnTabelTabelPokariTypeSalesDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariTypeSalesDelete();
             }
         });
         controller.getView().getBtnTabelTabelPokariWorkplaceDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariWorkplaceDelete();
             }
         });
             
         //POKARI : SAVE METHOD
         controller.getView().getBtnTabelTabelPokariCustomerGroupSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariCustomerGroupSave();
             }
         });
         controller.getView().getBtnTabelTabelPokariCustomerHirarchySave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariCustomerHirarchySave();
             }
         });
         controller.getView().getBtnTabelTabelPokariGroupSalesSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariGroupSalesSave();
             }
         });
         controller.getView().getBtnTabelTabelPokariProductBrandSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariProductBrandSave();
             }
         });
         controller.getView().getBtnTabelTabelPokariSalesTerritorySave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariSalesTerritorySave();
             }
         });
         controller.getView().getBtnTabelTabelPokariTeamSalesSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariTeamSalesSave();
             }
         });
         controller.getView().getBtnTabelTabelPokariTypeSalesSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariTypeSalesSave();
             }
         });
         controller.getView().getBtnTabelTabelPokariWorkplaceSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelTabelPokariWorkplaceSave();
             }
         });
       
         //POKARI : METHOD SELECTED
        controller.getView().getTableTabelTabelPokariCustomerGroup().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                aksiListTabelTabelPokariCustomerGroupSelected();
            }
        });
        controller.getView().getTableTabelTabelPokariCustomerHirarchy().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                aksiListTabelTabelPokariCustomerHirarchySelected();
            }
        });
        controller.getView().getTableTabelTabelPokariGroupSales().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                aksiListTabelTabelPokariGroupSalesSelected();
            }
        });
        controller.getView().getTableTabelTabelPokariProductBrand().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                aksiListTabelTabelPokariProductBrandSelected();
            }
        });
        controller.getView().getTableTabelTabelPokariSalesTerritory().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                aksiListTabelTabelPokariSalesTerritorySelected();
            }
        });
        controller.getView().getTableTabelTabelPokariTeamSales().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                aksiListTabelTabelPokariTeamSalesSelected();
            }
        });
        controller.getView().getTableTabelTabelPokariTypeSales().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                aksiListTabelTabelPokariTypeSalesSelected();
            }
        });
        controller.getView().getTableTabelTabelPokariWorkplace().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                aksiListTabelTabelPokariWorkplaceSelected();
            }
        });
         
    }
       /*
        * HER IS THE POKARI METHOD
        */
        public void aksiBtnTabelTabelPokariCustomerGroupSave(){
            CustomerGroup item = new CustomerGroup();
            item.setIdGroup(controller.getView().getTextTabelTabelPokariCustomerGroupIdGroup().getText().trim().toUpperCase());
            item.setDescription(controller.getView().getTextTabelTabelPokariCustomerGroupDescription().getText().trim().toUpperCase());
            if (! item.getIdGroup().equals("")) {
                controller.getModel().customerGroupDao.saveOrUpdate(item);
                aksiBtnTabelTabelPokariCustomerGroupReload();
            }
        }
        public void aksiBtnTabelTabelPokariCustomerHirarchySave(){
            CustomerHirarchy item = new CustomerHirarchy();
            item.setIdHirarchy(controller.getView().getTextTabelTabelPokariCustomerHirarchyIdHirarchy().getText().trim().toUpperCase());
            item.setDescription(controller.getView().getTextTabelTabelPokariCustomerHirarchyDescription().getText().trim().toUpperCase());
            if (! item.getIdHirarchy().equals("")) {
                controller.getModel().customerHirarchyDao.saveOrUpdate(item);
                aksiBtnTabelTabelPokariCustomerHirarchyReload();
            }
        }
        public void aksiBtnTabelTabelPokariGroupSalesSave(){
            GroupSales item = new GroupSales();
            item.setTypeGroup(controller.getView().getTextTabelTabelPokariGroupSalesTypeGroup().getText().trim().toUpperCase());
            item.setName(controller.getView().getTextTabelTabelPokariGroupSalesName().getText().trim().toUpperCase());
            if (! item.getTypeGroup().equals("")) {
                controller.getModel().groupSalesDao.saveOrUpdate(item);
                aksiBtnTabelTabelPokariGroupSalesReload();
            }
        }
        public void aksiBtnTabelTabelPokariProductBrandSave(){
            ProductBrand item = new ProductBrand();
            item.setSzBrandId(controller.getView().getTextTabelTabelPokariProductBrandBrandId().getText().trim().toUpperCase());
            item.setSzName(controller.getView().getTextTabelTabelPokariProductBrandName().getText().trim().toUpperCase());
            if (! item.getSzBrandId().equals("")) {
                controller.getModel().productBrandDao.saveOrUpdate(item);
                aksiBtnTabelTabelPokariProductBrandReload();
            }
        }
        public void aksiBtnTabelTabelPokariSalesTerritorySave(){
            SalesTerritory item = new SalesTerritory();
            item.setIdTerritory(controller.getView().getTextTabelTabelPokariSalesTerritoryIdTerritory().getText().trim().toUpperCase());
            item.setDescription(controller.getView().getTextTabelTabelPokariSalesTerritoryDescription().getText().trim().toUpperCase());
            if (! item.getIdTerritory().equals("")) {
                controller.getModel().salesTerritoryDao.saveOrUpdate(item);
                aksiBtnTabelTabelPokariSalesTerritoryReload();
            }
        }
        public void aksiBtnTabelTabelPokariTypeSalesSave(){
            TypeSales item = new TypeSales();
            item.setTypeSales(controller.getView().getTextTabelTabelPokariTypeSalesTypeSales().getText().trim().toUpperCase());
            item.setName(controller.getView().getTextTabelTabelPokariTypeSalesName().getText().trim().toUpperCase());
            if (! item.getTypeSales().equals("")) {
                controller.getModel().typeSalesDao.saveOrUpdate(item);
                aksiBtnTabelTabelPokariTypeSalesReload();
            }
        }
        public void aksiBtnTabelTabelPokariWorkplaceSave(){
            WorkPlace item = new WorkPlace();
            item.setWorkPlaceId(controller.getView().getTextTabelTabelPokariWorkplaceWorkplaceId().getText().trim().toUpperCase());
            item.setArea(controller.getView().getTextTabelTabelPokariWorkplaceArea().getText().trim().toUpperCase());
            if (! item.getWorkPlaceId().equals("")) {
                controller.getModel().workplaceDao.saveOrUpdate(item);
                aksiBtnTabelTabelPokariWorkplaceReload();
            }
        }
        public void aksiBtnTabelTabelPokariTeamSalesSave(){
            TeamSales item = new TeamSales();
            item.setTeamId(controller.getView().getTextTabelTabelPokariTeamSalesTeamId().getText().trim().toUpperCase());
            item.setName(controller.getView().getTextTabelTabelPokariTeamSalesName().getText().trim().toUpperCase());
            if (! item.getTeamId().equals("")) {
                controller.getModel().teamSalesDao.saveOrUpdate(item);
                aksiBtnTabelTabelPokariTeamSalesReload();
            }
        }
        //POKARI: DELETE
        public void aksiBtnTabelTabelPokariCustomerGroupDelete(){
             CustomerGroup item = new CustomerGroup();
             item.setIdGroup(controller.getView().getTextTabelTabelPokariCustomerGroupIdGroup().getText().trim().toUpperCase());
             item.setDescription(controller.getView().getTextTabelTabelPokariCustomerGroupDescription().getText().trim());
             controller.getModel().customerGroupDao.delete(item);
             aksiBtnTabelTabelPokariCustomerGroupReload();
            
        }
        
        public void aksiBtnTabelTabelPokariCustomerHirarchyDelete(){
             CustomerHirarchy item = new CustomerHirarchy();
             item.setIdHirarchy(controller.getView().getTextTabelTabelPokariCustomerHirarchyIdHirarchy().getText().trim().toUpperCase());
             item.setDescription(controller.getView().getTextTabelTabelPokariCustomerHirarchyDescription().getText().trim());
             controller.getModel().customerHirarchyDao.delete(item);
             aksiBtnTabelTabelPokariCustomerHirarchyReload();
        }
        public void aksiBtnTabelTabelPokariGroupSalesDelete(){
             GroupSales item = new GroupSales();
             item.setTypeGroup(controller.getView().getTextTabelTabelPokariGroupSalesTypeGroup().getText().trim().toUpperCase());
             item.setName(controller.getView().getTextTabelTabelPokariGroupSalesName().getText().trim());
             controller.getModel().groupSalesDao.delete(item);
             aksiBtnTabelTabelPokariGroupSalesReload();
        }
        public void aksiBtnTabelTabelPokariProductBrandDelete(){
             ProductBrand item = new ProductBrand();
             item.setSzBrandId(controller.getView().getTextTabelTabelPokariProductBrandBrandId().getText().trim().toUpperCase());
             item.setSzName(controller.getView().getTextTabelTabelPokariProductBrandName().getText().trim());
             controller.getModel().productBrandDao.delete(item);
             aksiBtnTabelTabelPokariProductBrandReload();
        }
        public void aksiBtnTabelTabelPokariSalesTerritoryDelete(){
             SalesTerritory item = new SalesTerritory();
             item.setIdTerritory(controller.getView().getTextTabelTabelPokariSalesTerritoryIdTerritory().getText().trim().toUpperCase());
             item.setDescription(controller.getView().getTextTabelTabelPokariSalesTerritoryDescription().getText().trim());
             controller.getModel().salesTerritoryDao.delete(item);
             aksiBtnTabelTabelPokariSalesTerritoryReload();
        }
        public void aksiBtnTabelTabelPokariTypeSalesDelete(){
             TypeSales item = new TypeSales();
             item.setTypeSales(controller.getView().getTextTabelTabelPokariTypeSalesTypeSales().getText().trim().toUpperCase());
             item.setName(controller.getView().getTextTabelTabelPokariTypeSalesName().getText().trim());
             controller.getModel().typeSalesDao.delete(item);
             aksiBtnTabelTabelPokariTypeSalesReload();
        }
        public void aksiBtnTabelTabelPokariWorkplaceDelete(){
             WorkPlace item = new WorkPlace();
             item.setWorkPlaceId(controller.getView().getTextTabelTabelPokariWorkplaceWorkplaceId().getText().trim().toUpperCase());
             item.setArea(controller.getView().getTextTabelTabelPokariWorkplaceArea().getText().trim());
             controller.getModel().workplaceDao.delete(item);
             aksiBtnTabelTabelPokariWorkplaceReload();
        }
        public void aksiBtnTabelTabelPokariTeamSalesDelete(){
             TeamSales item = new TeamSales();
             item.setTeamId(controller.getView().getTextTabelTabelPokariTeamSalesTeamId().getText().trim().toUpperCase());
             item.setName(controller.getView().getTextTabelTabelPokariTeamSalesName().getText().trim());
             controller.getModel().teamSalesDao.delete(item);
             aksiBtnTabelTabelPokariTeamSalesReload();
        }
    
        public void aksiListTabelTabelPokariCustomerGroupSelected(){
             int rowIndex = controller.getView().getTableTabelTabelPokariCustomerGroup().getSelectedRow();
             if (rowIndex >= 0) {
                 CustomerGroup item = new CustomerGroup();
                 item = controller.getModel().tmCustomerGroup.get(rowIndex);
                controller.getView().getTextTabelTabelPokariCustomerGroupIdGroup().setText(item.getIdGroup().trim());
                controller.getView().getTextTabelTabelPokariCustomerGroupDescription().setText(item.getDescription().trim());
             }
        }
        public void aksiListTabelTabelPokariCustomerHirarchySelected(){
             int rowIndex = controller.getView().getTableTabelTabelPokariCustomerHirarchy().getSelectedRow();
             if (rowIndex >= 0) {
                 CustomerHirarchy item = new CustomerHirarchy();
                 item = controller.getModel().tmCustomerHirarchy.get(rowIndex);
                controller.getView().getTextTabelTabelPokariCustomerHirarchyIdHirarchy().setText(item.getIdHirarchy().trim());
                controller.getView().getTextTabelTabelPokariCustomerHirarchyDescription().setText(item.getDescription().trim());
             }
        }
        public void aksiListTabelTabelPokariGroupSalesSelected(){
             int rowIndex = controller.getView().getTableTabelTabelPokariGroupSales().getSelectedRow();
             if (rowIndex >= 0) {
                 GroupSales item = new GroupSales();
                 item = controller.getModel().tmGroupSales.get(rowIndex);
                controller.getView().getTextTabelTabelPokariGroupSalesTypeGroup().setText(item.getTypeGroup().trim());
                controller.getView().getTextTabelTabelPokariGroupSalesName().setText(item.getName().trim());
             }
        }
        public void aksiListTabelTabelPokariProductBrandSelected(){
             int rowIndex = controller.getView().getTableTabelTabelPokariProductBrand().getSelectedRow();
             if (rowIndex >= 0) {
                 ProductBrand item = new ProductBrand();
                 item = controller.getModel().tmProductBrand.get(rowIndex);
                controller.getView().getTextTabelTabelPokariProductBrandBrandId().setText(item.getSzBrandId().trim());
                controller.getView().getTextTabelTabelPokariProductBrandName().setText(item.getSzName().trim());
             }
        }
        public void aksiListTabelTabelPokariSalesTerritorySelected(){
             int rowIndex = controller.getView().getTableTabelTabelPokariSalesTerritory().getSelectedRow();
             if (rowIndex >= 0) {
                 SalesTerritory item = new SalesTerritory();
                 item = controller.getModel().tmSalesTerritory.get(rowIndex);
                controller.getView().getTextTabelTabelPokariSalesTerritoryIdTerritory().setText(item.getIdTerritory().trim());
                controller.getView().getTextTabelTabelPokariSalesTerritoryDescription().setText(item.getDescription().trim());
             }
        }
        public void aksiListTabelTabelPokariTypeSalesSelected(){
             int rowIndex = controller.getView().getTableTabelTabelPokariTypeSales().getSelectedRow();
             if (rowIndex >= 0) {
                 TypeSales item = new TypeSales();
                 item = controller.getModel().tmTypeSales.get(rowIndex);
                controller.getView().getTextTabelTabelPokariTypeSalesTypeSales().setText(item.getTypeSales().trim());
                controller.getView().getTextTabelTabelPokariTypeSalesName().setText(item.getName().trim());
             }
        }
        public void aksiListTabelTabelPokariWorkplaceSelected(){
             int rowIndex = controller.getView().getTableTabelTabelPokariWorkplace().getSelectedRow();
             if (rowIndex >= 0) {
                 WorkPlace item = new WorkPlace();
                 item = controller.getModel().tmWorkPlace.get(rowIndex);
                controller.getView().getTextTabelTabelPokariWorkplaceWorkplaceId().setText(item.getWorkPlaceId().trim());
                controller.getView().getTextTabelTabelPokariWorkplaceArea().setText(item.getArea().trim());
             }
        }
        public void aksiListTabelTabelPokariTeamSalesSelected(){
             int rowIndex = controller.getView().getTableTabelTabelPokariTeamSales().getSelectedRow();
             if (rowIndex >= 0) {
                 TeamSales item = new TeamSales();
                 item = controller.getModel().tmTeamSales.get(rowIndex);
                controller.getView().getTextTabelTabelPokariTeamSalesTeamId().setText(item.getTeamId().trim());
                controller.getView().getTextTabelTabelPokariTeamSalesName().setText(item.getName().trim());
             }
        }
    
        //KEK
         public void aksiBtnTabelKeyAccountSave(){
             TabelKeyAccount item = new TabelKeyAccount();
             item.setKodeKa(controller.getView().getTextTabelKeyAccountKodeKa().getText().trim().toUpperCase());
             item.setNamaKa(controller.getView().getTextTabelKeyAccountNama().getText().trim());
             item.setKeterangan(controller.getView().getTextTabelKeyAccountKeterangan().getText().trim());
             if (! item.getKodeKa().equals("")) {
                controller.getModel().tabelKeyAccountDao.saveOrUpdate(item);             
                aksiBtnTabelKeyAccountReload();
             }             
         }
         public void aksiBtnTabelKeyAccountDelete(){
             TabelKeyAccount item = new TabelKeyAccount();
             item.setKodeKa(controller.getView().getTextTabelKeyAccountKodeKa().getText().trim().toUpperCase());
             item.setNamaKa(controller.getView().getTextTabelKeyAccountNama().getText().trim());
             item.setKeterangan(controller.getView().getTextTabelKeyAccountKeterangan().getText().trim());
             controller.getModel().tabelKeyAccountDao.delete(item);
             aksiBtnTabelKeyAccountReload();
         }
         
         public void aksiBtnTabelOutletGroupSave(){
             TabelOutletGroup item = new TabelOutletGroup();
             item.setGroupId(controller.getView().getTextTabelOutletGroupOutletGroupId().getText().trim().toUpperCase());
             item.setGroupNm(controller.getView().getTextTabelOutletGroupOutletGroupNm().getText().trim());
             if (! item.getGroupId().equals("")) {
                controller.getModel().tabelOutletGroupDao.saveOrUpdate(item);
                 aksiBtnTabelOutletGroupReload();
             }
         }
         public void aksiBtnTabelOutletGroupDelete(){
             TabelOutletGroup item = new TabelOutletGroup();
             item.setGroupId(controller.getView().getTextTabelOutletGroupOutletGroupId().getText().trim().toUpperCase());
             item.setGroupNm(controller.getView().getTextTabelOutletGroupOutletGroupNm().getText().trim());
            controller.getModel().tabelOutletGroupDao.delete(item);
             aksiBtnTabelOutletGroupReload();
         }
         public void aksiBtnTabelOutletSubGroupSave(){
             TabelOutletSubGroup item = new TabelOutletSubGroup();
             item.setSubGroupId(controller.getView().getTextTabelOutletSubGroupOutletSubGroupId().getText().trim().toUpperCase());
             item.setSubGroupNm(controller.getView().getTextTabelOutletSubGroupOutletSubGroupNm().getText().trim());
             if (! item.getSubGroupId().equals("")) {
                controller.getModel().tabelOutletSubGroupDao.saveOrUpdate(item);
                 aksiBtnTabelOutletSubGroupReload();
             }
         }
         public void aksiBtnTabelOutletSubGroupDelete(){
             TabelOutletSubGroup item = new TabelOutletSubGroup();
             item.setSubGroupId(controller.getView().getTextTabelOutletSubGroupOutletSubGroupId().getText().trim().toUpperCase());
             item.setSubGroupNm(controller.getView().getTextTabelOutletSubGroupOutletSubGroupNm().getText().trim());
            controller.getModel().tabelOutletSubGroupDao.delete(item);
            aksiBtnTabelOutletSubGroupReload();
         }
         public void aksiBtnTabelOutletClassDelete(){
             TabelOutletClass item= new TabelOutletClass();
             item.setClassId(controller.getView().getTextTabelOutletClassOutletClassId().getText().trim().toUpperCase());
             item.setClassNm(controller.getView().getTextTabelOutletClassOutletClassNm().getText().trim());
            controller.getModel().tabelOutletClassDao.delete(item);
             aksiBtnTabelOutletClassReload();
         }
         public void aksiBtnTabelOutletClassSave(){
             TabelOutletClass item= new TabelOutletClass();
             item.setClassId(controller.getView().getTextTabelOutletClassOutletClassId().getText().trim().toUpperCase());
             item.setClassNm(controller.getView().getTextTabelOutletClassOutletClassNm().getText().trim());
             if (! item.getClassId().equals("")) {
                controller.getModel().tabelOutletClassDao.saveOrUpdate(item);
                 aksiBtnTabelOutletClassReload();
             }
         }
         public void aksiBtnTabelOutletChainSave(){
             TabelOutletChain item = new TabelOutletChain();
             item.setKodeChain(controller.getView().getTextTabelOutletChainKodeChain().getText().trim().toUpperCase());
             item.setNamaChain(controller.getView().getTextTabelOutletChainNamaChain().getText().trim());
             if (! item.getKodeChain().equals("")) {
                controller.getModel().tabelOutletChainDao.saveOrUpdate(item);
                 aksiBtnTabelOutletChainReload();
             }
         }
         public void aksiBtnTabelOutletChainDelete() {
             TabelOutletChain item = new TabelOutletChain();
             item.setKodeChain(controller.getView().getTextTabelOutletChainKodeChain().getText().trim().toUpperCase());
             item.setNamaChain(controller.getView().getTextTabelOutletChainNamaChain().getText().trim());
           controller.getModel().tabelOutletChainDao.delete(item);
            aksiBtnTabelOutletChainReload();
         }
         public void aksiBtnTabelOutletLocationSave(){
             TabelOutletLocation item = new TabelOutletLocation();
             item.setKodeLokasi(controller.getView().getTextTabelOutletLocationKodeLokasi().getText().trim().toUpperCase());
             item.setNamaLokasi(controller.getView().getTextTabelOutletLocationNamaLokasi().getText().trim());
             if (! item.getKodeLokasi().equals("")) {
                controller.getModel().tabelOutletLocationDao.saveOrUpdate(item);
                 aksiBtnTabelOutletLocationReload();
             }
         }
         public void aksiBtnTabelOutletLocationDelete(){
             TabelOutletLocation item = new TabelOutletLocation();
             item.setKodeLokasi(controller.getView().getTextTabelOutletLocationKodeLokasi().getText().trim().toUpperCase());
             item.setNamaLokasi(controller.getView().getTextTabelOutletLocationNamaLokasi().getText().trim());
           controller.getModel().tabelOutletLocationDao.delete(item);
            aksiBtnTabelOutletLocationReload();
         }
         public void aksiBtnTabelOutletTypeSave(){
             TabelOutletType item = new TabelOutletType();
             item.setKodeType(controller.getView().getTextTabelOutletTypeKodeType().getText().trim().toUpperCase());
             item.setNamaType(controller.getView().getTextTabelOutletTypeNamaType().getText().trim());
             if (! item.getKodeType().equals("")) {
                controller.getModel().tabelOutletTypeDao.saveOrUpdate(item);
                 aksiBtnTabelOutletTypeReload();
             }
         }
         public void aksiBtnTabelOutletTypeDelete(){
             TabelOutletType item = new TabelOutletType();
             item.setKodeType(controller.getView().getTextTabelOutletTypeKodeType().getText().trim().toUpperCase());
             item.setNamaType(controller.getView().getTextTabelOutletTypeNamaType().getText().trim());
           controller.getModel().tabelOutletTypeDao.delete(item);
            aksiBtnTabelOutletTypeReload();
         }
         public void aksiBtnTabelOutletSizeSave(){
             TabelOutletSize item = new TabelOutletSize();
             item.setKodeSize(controller.getView().getTextTabelOutletSizeKodeSize().getText().trim().toUpperCase());
             item.setNamaSize(controller.getView().getTextTabelOutletSizelNamaSize().getText().trim());
             if (! item.getKodeSize().equals("")) {
                controller.getModel().tabelOutletSizeDao.saveOrUpdate(item);
                 aksiBtnTabelOutletSizeReload();
             }
         }
         public void aksiBtnTabelOutletSizeDelete(){
             TabelOutletSize item = new TabelOutletSize();
             item.setKodeSize(controller.getView().getTextTabelOutletSizeKodeSize().getText().trim().toUpperCase());
             item.setNamaSize(controller.getView().getTextTabelOutletSizelNamaSize().getText().trim());
            controller.getModel().tabelOutletSizeDao.delete(item);
            aksiBtnTabelOutletSizeReload();
        }
         //Tabel-Tabel Product
         public void aksiBtnTabelProdVarianceSave(){
             TabelProdVariance item = new TabelProdVariance();
             item.setVarianceId(controller.getView().getTextTabelProdVarianceVarianceId().getText().trim().toUpperCase());
             item.setVarianceNm(controller.getView().getTextTabelProdVarianceVarianceNm().getText().trim());
             if (! item.getVarianceId().equals("")) {
                controller.getModel().tabelProdVarianceDao.saveOrUpdate(item);
                 aksiBtnTabelProdVarianceReload();
             }
         }
         public void aksiBtnTabelProdVarianceDelete(){
             TabelProdVariance item = new TabelProdVariance();
             item.setVarianceId(controller.getView().getTextTabelProdVarianceVarianceId().getText().trim().toUpperCase());
             item.setVarianceNm(controller.getView().getTextTabelProdVarianceVarianceNm().getText().trim());
           controller.getModel().tabelProdVarianceDao.delete(item);
            aksiBtnTabelProdVarianceReload();
         }
         public void aksiBtnTabelProdSubCategSave(){
             TabelProdSubCategory item = new TabelProdSubCategory();
             item.setSubCategoryId(controller.getView().getTextTabelProdSubCategSubCategId().getText().trim().toUpperCase());
             item.setSubCategoryNm(controller.getView().getTextTabelProdSubCategSubCategNm().getText().trim());
             if (! item.getSubCategoryId().equals("")) {
                controller.getModel().tabelProdSubCategoryDao.saveOrUpdate(item);
                 aksiBtnTabelProdSubCategoryReload();
             }
         }
         public void aksiBtnTabelProdSubCategDelete(){
             TabelProdSubCategory item = new TabelProdSubCategory();
             item.setSubCategoryId(controller.getView().getTextTabelProdSubCategSubCategId().getText().trim().toUpperCase());
             item.setSubCategoryNm(controller.getView().getTextTabelProdSubCategSubCategNm().getText().trim());
           controller.getModel().tabelProdSubCategoryDao.delete(item);
            aksiBtnTabelProdSubCategoryReload();
         }
         public void aksiBtnTabelProdSubBrandSave(){
             TabelProdSubBrand item = new TabelProdSubBrand();
             item.setSubBrandId(controller.getView().getTextTabelProdSubBrandSubBrandId().getText().trim().toUpperCase());
             item.setSubBrandNm(controller.getView().getTextTabelProdSubBrandSubBrandNm().getText().trim());
             if (! item.getSubBrandId().equals("")) {
                controller.getModel().tabelProdSubBrandDao.saveOrUpdate(item);
                 aksiBtnTabelProdSubBrandReload();
             }
         }
         public void aksiBtnTabelProdSubBrandDelete(){
             TabelProdSubBrand item = new TabelProdSubBrand();
             item.setSubBrandId(controller.getView().getTextTabelProdSubBrandSubBrandId().getText().trim().toUpperCase());
             item.setSubBrandNm(controller.getView().getTextTabelProdSubBrandSubBrandNm().getText().trim());
           controller.getModel().tabelProdSubBrandDao.delete(item);
            aksiBtnTabelProdSubBrandReload();
         }
         public void aksiBtnTAbelProdSizeSave(){
             TabelProdSize item = new TabelProdSize();
             item.setSizeId(controller.getView().getTextTabelProdSizeSizeId().getText().trim().toUpperCase());
             item.setSizeNm(controller.getView().getTextTabelProdSizeSizeNm().getText().trim());
             if (! item.getSizeId().equals("")) {
                controller.getModel().tabelProdSizeDao.saveOrUpdate(item);
                 aksiBtnTabelProdSizeReload();
             }
         }
         public void aksiBtnTabelProdSizeDelete(){
             TabelProdSize item = new TabelProdSize();
             item.setSizeId(controller.getView().getTextTabelProdSizeSizeId().getText().trim().toUpperCase());
             item.setSizeNm(controller.getView().getTextTabelProdSizeSizeNm().getText().trim());
           controller.getModel().tabelProdSizeDao.delete(item);
            aksiBtnTabelProdSizeReload();
         }
         public void aksiBtnTabelProdDivisiSave(){
             TabelProdDivisi item = new TabelProdDivisi();
             item.setDivisiId(controller.getView().getTextTabelProdDivisiDivisiId().getText().trim().toUpperCase());
             item.setDivisiNm(controller.getView().getTextTabelProdDivisiDivisiNm().getText().trim());
             if (! item.getDivisiId().equals("")) {
                controller.getModel().tabelProdDivisiDao.saveOrUpdate(item);
                 aksiBtnTabelProdDivisiReload();
             }
         }
         public void aksiBtnTabelProdDivisiDelete(){
             TabelProdDivisi item = new TabelProdDivisi();
             item.setDivisiId(controller.getView().getTextTabelProdDivisiDivisiId().getText().trim().toUpperCase());
             item.setDivisiNm(controller.getView().getTextTabelProdDivisiDivisiNm().getText().trim());
           controller.getModel().tabelProdDivisiDao.delete(item);
            aksiBtnTabelProdDivisiReload();
         }
         public void aksiBtnTabelProdCategSave(){
             TabelProdCategory item = new TabelProdCategory();
             item.setCategoryId(controller.getView().getTextTabelProdCategCatedId().getText().trim().toUpperCase());
             item.setCategoryNm(controller.getView().getTextTabelProdCategCategNm().getText().trim());
             if (! item.getCategoryId().equals("")) {
                controller.getModel().tabelProdCategoryDao.saveOrUpdate(item);
                 aksiBtnTabelProdCategoryReload();
             }                 
         }
         public void aksiBtnTabelProdCategDelete(){
             TabelProdCategory item = new TabelProdCategory();
             item.setCategoryId(controller.getView().getTextTabelProdCategCatedId().getText().trim().toUpperCase());
             item.setCategoryNm(controller.getView().getTextTabelProdCategCategNm().getText().trim());
           controller.getModel().tabelProdCategoryDao.delete(item);
            aksiBtnTabelProdCategoryReload();
         }
         public void aksiBtnTabelProdBrandSave(){
             TabelProdBrand item = new TabelProdBrand();
             item.setBrandId(controller.getView().getTextTabelProdBrandBrandId().getText().trim().toUpperCase());
             item.setBrandNm(controller.getView().getTextTabelProdBrandBrandNm().getText().trim());
             if (! item.getBrandId().equals("")){
                controller.getModel().tabelProdBrandDao.saveOrUpdate(item);
                 aksiBtnTabelProdBrandReload();
             }
         }
         public void aksiBtnTabelProdBrandDelete(){
             TabelProdBrand item = new TabelProdBrand();
             item.setBrandId(controller.getView().getTextTabelProdBrandBrandId().getText().trim().toUpperCase());
             item.setBrandNm(controller.getView().getTextTabelProdBrandBrandNm().getText().trim());
           controller.getModel().tabelProdBrandDao.delete(item);
            aksiBtnTabelProdBrandReload();
         }
         
   
//         //Tabel-tabel
//         public void aksiBtnTabelKeyAccountSave(){}
//         public void aksiBtnTabelKeyAccountDelete(){}
//         public void aksiBtnTabelOutletSubGroupDelete(){}
//         public void aksiBtnTabelOutletSubGroupSave(){}
//         public void aksiBtnTabelOutletClassDelete(){}
//         public void aksiBtnTabelOutletClassSave(){}
//         public void aksiBtnTabelOutletGroupSave(){}
//         public void aksiBtnTabelOutletGroupDelete(){}
//         public void aksiBtnTabelOutletChainSave(){}
//         public void aksiBtnTabelOutletChainDelete() {}
//         public void aksiBtnTabelOutletLocationDelete(){}
//         public void aksiBtnTabelOutletLocationSave(){}
//         public void aksiBtnTabelOutletTypeDelete(){}
//         public void aksiBtnTabelOutletTypeSave(){}
//         public void aksiBtnTabelOutletSizeDelete(){}
//         public void aksiBtnTabelOutletSizeSave(){}
//         
//        //Tabel-tabel Product
//         public void aksiBtnTabelProdVarianceSave(){}
//         public void aksiBtnTabelProdVarianceDelete(){}
//         public void aksiBtnTabelProdSubCategSave(){}
//         public void aksiBtnTabelProdSubCategDelete(){}
//         public void aksiBtnTabelProdSubBrandSave(){}
//         public void aksiBtnTabelProdSubBrandDelete(){}
//         public void aksiBtnTAbelProdSizeSave(){}
//         public void aksiBtnTabelProdSizeDelete(){}
//         public void aksiBtnTabelProdDivisiSave(){}
//         public void aksiBtnTabelProdDivisiDelete(){}
//         public void aksiBtnTabelProdCategSave(){}
//         public void aksiBtnTabelProdCategDelete(){}
//         public void aksiBtnTabelProdBrandSave(){}
//         public void aksiBtnTabelProdBrandDelete(){}
         
    public void aksiReloadTabelTabel(){
        aksiReloadTabelTabelKek();
        aksiReloadTabelTabelPokari();
    }
    public void aksiReloadTabelTabelKek(){
        aksiBtnTabelKeyAccountReload() ;
        aksiBtnTabelOutletChainReload() ;
        aksiBtnTabelOutletClassReload() ;
        aksiBtnTabelOutletGroupReload() ;
        aksiBtnTabelOutletLocationReload() ;
        aksiBtnTabelOutletSizeReload() ;
        aksiBtnTabelOutletSubGroupReload() ;
        aksiBtnTabelOutletTypeReload() ;

        aksiBtnTabelProdBrandReload() ;
        aksiBtnTabelProdCategoryReload() ;
        aksiBtnTabelProdProdDivisiReload() ;
        aksiBtnTabelProdSizeReload() ;
        aksiBtnTabelProdSubBrandReload() ;
        aksiBtnTabelProdSubCategoryReload() ;
        aksiBtnTabelProdVarianceReload() ;
    }
    public void aksiReloadTabelTabelPokari(){
        aksiBtnTabelTabelPokariCustomerGroupReload();
        aksiBtnTabelTabelPokariCustomerHirarchyReload();
        aksiBtnTabelTabelPokariGroupSalesReload();
        aksiBtnTabelTabelPokariSalesTerritoryReload();
        aksiBtnTabelTabelPokariTeamSalesReload();
        aksiBtnTabelTabelPokariTypeSalesReload();
        aksiBtnTabelTabelPokariWorkplaceReload();
        aksiBtnTabelTabelPokariProductBrandReload();
    }
    
    public void aksiBtnTabelTabelPokariCustomerHirarchyReload(){
        List<CustomerHirarchy> lst = new ArrayList<>();
        lst = controller.getModel().customerHirarchyDao.findAll();
        controller.getModel().tmCustomerHirarchy = new GenericTableModel<>(lst, CustomerHirarchy.class);
        controller.getView().getTableTabelTabelPokariCustomerHirarchy().setModel(controller.getModel().tmCustomerHirarchy);
    }
    public void aksiBtnTabelTabelPokariCustomerGroupReload(){
        List<CustomerGroup> lst = new ArrayList<>();
        lst = controller.getModel().customerGroupDao.findAll();
        controller.getModel().tmCustomerGroup = new GenericTableModel<>(lst, CustomerGroup.class);
        controller.getView().getTableTabelTabelPokariCustomerGroup().setModel(controller.getModel().tmCustomerGroup);
    }    
    public void aksiBtnTabelTabelPokariGroupSalesReload(){
        List<GroupSales> lst = new ArrayList<>();
        lst = controller.getModel().groupSalesDao.findAll();
        controller.getModel().tmGroupSales = new GenericTableModel<>(lst, GroupSales.class);
        controller.getView().getTableTabelTabelPokariGroupSales().setModel(controller.getModel().tmGroupSales);
    }
    public void aksiBtnTabelTabelPokariSalesTerritoryReload(){
        List<SalesTerritory> lst = new ArrayList<>();
        lst = controller.getModel().salesTerritoryDao.findAll();
        controller.getModel().tmSalesTerritory = new GenericTableModel<>(lst, SalesTerritory.class);
        controller.getView().getTableTabelTabelPokariSalesTerritory().setModel(controller.getModel().tmSalesTerritory);
    }
    public void aksiBtnTabelTabelPokariTeamSalesReload(){
        List<TeamSales> lst = new ArrayList<>();
        lst = controller.getModel().teamSalesDao.findAll();
        controller.getModel().tmTeamSales = new GenericTableModel<>(lst, TeamSales.class);
        controller.getView().getTableTabelTabelPokariTeamSales().setModel(controller.getModel().tmTeamSales);
    }
    public void aksiBtnTabelTabelPokariTypeSalesReload(){
        List<TypeSales> lst = new ArrayList<>();
        lst = controller.getModel().typeSalesDao.findAll();
        controller.getModel().tmTypeSales = new GenericTableModel<>(lst, TypeSales.class);
        controller.getView().getTableTabelTabelPokariTypeSales().setModel(controller.getModel().tmTypeSales);
    }
    public void aksiBtnTabelTabelPokariWorkplaceReload(){
        List<WorkPlace> lst = new ArrayList<>();
        lst = controller.getModel().workplaceDao.findAll();
        controller.getModel().tmWorkPlace = new GenericTableModel<>(lst, WorkPlace.class);
        controller.getView().getTableTabelTabelPokariWorkplace().setModel(controller.getModel().tmWorkPlace);
    }
    public void aksiBtnTabelTabelPokariProductBrandReload(){
        List<ProductBrand> lst = new ArrayList<>();
        lst = controller.getModel().productBrandDao.findAll();
        controller.getModel().tmProductBrand = new GenericTableModel<>(lst, ProductBrand.class);
        controller.getView().getTableTabelTabelPokariProductBrand().setModel(controller.getModel().tmProductBrand);
    }
    
    // **** RELOAD TAMBAHAN KEK
    public void aksiBtnTabelKeyAccountReload(){
        List<TabelKeyAccount> lst = new ArrayList<>();
        lst =controller.getModel().tabelKeyAccountDao.findAll();
        controller.getModel().tmTabelKeyAccount = new GenericTableModel<>(lst, TabelKeyAccount.class);
        controller.getModel().tmTabelKeyAccount = new GenericTableModel<>(lst, TabelKeyAccount.class);
        controller.getView().getTableTabelKeyAccount().setModel(controller.getModel().tmTabelKeyAccount);
    }
    public void aksiBtnTabelOutletChainReload(){
        List<TabelOutletChain> lst = new ArrayList<>();
        lst =controller.getModel().tabelOutletChainDao.findAll();
       controller.getModel().tmTabelOutletChain = new GenericTableModel<>(lst, TabelOutletChain.class);
       controller.getView().getTableTabelOutletChain().setModel(controller.getModel().tmTabelOutletChain);
    }
    public void aksiBtnTabelOutletClassReload(){
        List<TabelOutletClass> lst = new ArrayList<>();
        lst =controller.getModel().tabelOutletClassDao.findAll();
       controller.getModel().tmTabelOutletClass = new GenericTableModel<>(lst, TabelOutletClass.class );
       controller.getView().getTableTabelOutletClass().setModel(controller.getModel().tmTabelOutletClass);
    }
    public void aksiBtnTabelOutletGroupReload(){
        List<TabelOutletGroup> lst = new ArrayList<>();
        lst =controller.getModel().tabelOutletGroupDao.findAll();
       controller.getModel().tmTabelOutletGroup = new GenericTableModel<>(lst,TabelOutletGroup.class );
       controller.getView().getTableTabelOutletGroup().setModel(controller.getModel().tmTabelOutletGroup);
    }
    public void aksiBtnTabelOutletSubGroupReload(){
       List<TabelOutletSubGroup> lst = new ArrayList<>();
       lst =controller.getModel().tabelOutletSubGroupDao.findAll();
       controller.getModel().tmTabelOutletSubGroup = new GenericTableModel<>(lst,TabelOutletSubGroup.class );
       controller.getView().getTableTabelOutletSubGroup().setModel(controller.getModel().tmTabelOutletSubGroup);    
    }
    public void aksiBtnTabelOutletLocationReload(){
        List<TabelOutletLocation> lst = new ArrayList<>();
        lst =controller.getModel().tabelOutletLocationDao.findAll();
       controller.getModel().tmTabelOutletLocation = new GenericTableModel<>(lst,TabelOutletLocation.class );
       controller.getView().getTableTabelOutletLocation().setModel(controller.getModel().tmTabelOutletLocation);
    }
    public void aksiBtnTabelOutletSizeReload(){
        List<TabelOutletSize> lst = new ArrayList<>();
        lst =controller.getModel().tabelOutletSizeDao.findAll();
       controller.getModel().tmTabelOutletSize = new GenericTableModel<>(lst, TabelOutletSize.class);
       controller.getView().getTableTabelOutletSize().setModel(controller.getModel().tmTabelOutletSize);
    }
    public void aksiBtnTabelOutletTypeReload(){
        List<TabelOutletType> lst = new ArrayList<>();
        lst =controller.getModel().tabelOutletTypeDao.findAll();
       controller.getModel().tmTabelOutletType = new GenericTableModel<>(lst, TabelOutletType.class);
       controller.getView().getTableTabelOutletType().setModel(controller.getModel().tmTabelOutletType);
    }    
    public void aksiBtnTabelProdBrandReload(){
        List<TabelProdBrand> lst = new ArrayList<>();
        lst =controller.getModel().tabelProdBrandDao.findAll();
       controller.getModel().tmTabelProdBrand = new GenericTableModel<>(lst, TabelProdBrand.class);
       controller.getView().getTableTabelProdBrand().setModel(controller.getModel().tmTabelProdBrand);
    }
    public void aksiBtnTabelProdCategoryReload(){
        List<TabelProdCategory> lst = new ArrayList<>();
        lst =controller.getModel().tabelProdCategoryDao.findAll();
       controller.getModel().tmTabelProdCatetory = new GenericTableModel<>(lst, TabelProdCategory.class);
       controller.getView().getTableTabelProdCateg().setModel(controller.getModel().tmTabelProdCatetory);
    }
    public void aksiBtnTabelProdProdDivisiReload(){
        List<TabelProdDivisi> lst = new ArrayList<>();
        lst =controller.getModel().tabelProdDivisiDao.findAll();
       controller.getModel().tmTabelProdDivisi = new GenericTableModel<>(lst, TabelProdDivisi.class);
       controller.getView().getTableTabelProdDivisi().setModel(controller.getModel().tmTabelProdDivisi);
    }
    public void aksiBtnTabelProdSizeReload(){
        List<TabelProdSize> lst = new ArrayList<>();
        lst =controller.getModel().tabelProdSizeDao.findAll();
       controller.getModel().tmTabelProdSize = new GenericTableModel<>(lst, TabelProdSize.class);
       controller.getView().getTableTabelProdSize().setModel(controller.getModel().tmTabelProdSize);
    }
    public void aksiBtnTabelProdDivisiReload(){
        List<TabelProdDivisi> lst = new ArrayList<>();
        lst =controller.getModel().tabelProdDivisiDao.findAll();
       controller.getModel().tmTabelProdDivisi = new GenericTableModel<>(lst, TabelProdDivisi.class);
       controller.getView().getTableTabelProdDivisi().setModel(controller.getModel().tmTabelProdDivisi);
    }
    public void aksiBtnTabelProdSubBrandReload(){
        List<TabelProdSubBrand> lst = new ArrayList<>();
        lst =controller.getModel().tabelProdSubBrandDao.findAll();
       controller.getModel().tmTabelProdSubBrand = new GenericTableModel<>(lst, TabelProdSubBrand.class);
       controller.getView().getTableTabelProdSubBrand().setModel(controller.getModel().tmTabelProdSubBrand);
    }
    public void aksiBtnTabelProdSubCategoryReload(){
        List<TabelProdSubCategory> lst = new ArrayList<>();
        lst =controller.getModel().tabelProdSubCategoryDao.findAll();
       controller.getModel().tmTabelProdSubCategory = new GenericTableModel<>(lst, TabelProdSubCategory.class);
       controller.getView().getTableTabelProdSubCateg().setModel(controller.getModel().tmTabelProdSubCategory);
    }
    public void aksiBtnTabelProdVarianceReload(){        
        List<TabelProdVariance> lst = new ArrayList<>();
        lst =controller.getModel().tabelProdVarianceDao.findAll();
       controller.getModel().tmTabelProdVariance = new GenericTableModel<>(lst, TabelProdVariance.class);
       controller.getView().getTableTabelProdVariance().setModel(controller.getModel().tmTabelProdVariance);
    }
         
    
    //AKSI LIST TABEL
         //List Tabel Product Selected
         public void aksiListTabelProdVarianceSelected(){
             int rowIndex = controller.getView().getTableTabelProdVariance().getSelectedRow();
             if (rowIndex >= 0) {
                 TabelProdVariance item = new TabelProdVariance();
                 item = controller.getModel().tmTabelProdVariance.get(rowIndex);
                controller.getView().getTextTabelProdVarianceVarianceId().setText(item.getVarianceId().trim());
                controller.getView().getTextTabelProdVarianceVarianceNm().setText(item.getVarianceNm().trim());
             }
         }
         public void aksiListTabelProdSubCategSelected(){
             int rowIndex = controller.getView().getTableTabelProdSubCateg().getSelectedRow();
             if (rowIndex >= 0){
                 TabelProdSubCategory item = new TabelProdSubCategory();
                 item = controller.getModel().tmTabelProdSubCategory.get(rowIndex);
                controller.getView().getTextTabelProdSubCategSubCategId().setText(item.getSubCategoryId().trim());
                controller.getView().getTextTabelProdSubCategSubCategNm().setText(item.getSubCategoryNm().trim());
             }
         }
         public void aksiListTabelProdSubBrandSelected(){
             int rowIndex = controller.getView().getTableTabelProdSubBrand().getSelectedRow();
             if (rowIndex >= 0) {
                 TabelProdSubBrand item = new TabelProdSubBrand();
                 item = controller.getModel().tmTabelProdSubBrand.get(rowIndex);
                controller.getView().getTextTabelProdSubBrandSubBrandId().setText(item.getSubBrandId().trim());
                controller.getView().getTextTabelProdSubBrandSubBrandNm().setText(item.getSubBrandNm().trim());
             }
         }
         public void aksiListTabelProdSizeSelected(){
             int rowIndex = controller.getView().getTableTabelProdSize().getSelectedRow();
             if (rowIndex >= 0 ) {
                 TabelProdSize item = new TabelProdSize();
                 item = controller.getModel().tmTabelProdSize.get(rowIndex);
                controller.getView().getTextTabelProdSizeSizeId().setText(item.getSizeId().trim());
                controller.getView().getTextTabelProdSizeSizeNm().setText(item.getSizeNm().trim());
             }         
         }         
         public void aksiListTabelProdDivisiSelected(){
             int rowIndex = controller.getView().getTableTabelProdDivisi().getSelectedRow();
             if (rowIndex >= 0) {
                 TabelProdDivisi item = new TabelProdDivisi();
                 item = controller.getModel().tmTabelProdDivisi.get(rowIndex);
                controller.getView().getTextTabelProdDivisiDivisiId().setText(item.getDivisiId().trim());
                controller.getView().getTextTabelProdDivisiDivisiNm().setText(item.getDivisiNm().trim());
             }
         }
         public void aksiListTabelTabelProdCategSelected(){
             int rowIndex = controller.getView().getTableTabelProdCateg().getSelectedRow();
             if (rowIndex >=0){
                 TabelProdCategory item = new TabelProdCategory();
                 item = controller.getModel().tmTabelProdCatetory.get(rowIndex);
                controller.getView().getTextTabelProdCategCatedId().setText(item.getCategoryId().trim());
                controller.getView().getTextTabelProdCategCategNm().setText(item.getCategoryNm().trim());
             }
         }
         public void aksiListTabelProdBrandSelected(){
             int rowIndex = controller.getView().getTableTabelProdBrand().getSelectedRow();
             if (rowIndex >=0){
                 TabelProdBrand item = new TabelProdBrand();
                 item = controller.getModel().tmTabelProdBrand.get(rowIndex);
                controller.getView().getTextTabelProdBrandBrandId().setText(item.getBrandId().trim());
                controller.getView().getTextTabelProdBrandBrandNm().setText(item.getBrandNm().trim());
             }
         }
         
         //List Tabel Outlet Selected
         public void aksiListTabelOutletTypeSelected(){
             int rowIndex = controller.getView().getTableTabelOutletType().getSelectedRow();
             if (rowIndex >=0 ) {
                 TabelOutletType item = new TabelOutletType();
                 item = controller.getModel().tmTabelOutletType.get(rowIndex);
                controller.getView().getTextTabelOutletTypeKodeType().setText(item.getKodeType().trim());
                controller.getView().getTextTabelOutletTypeNamaType().setText(item.getNamaType().trim());
             }
         }
         public void aksiListTabelOutletSubGroupSelected(){
             int rowIndex = controller.getView().getTableTabelOutletSubGroup().getSelectedRow();
             if (rowIndex >=0) {
                 TabelOutletSubGroup item = new TabelOutletSubGroup();
                 item = controller.getModel().tmTabelOutletSubGroup.get(rowIndex);
                controller.getView().getTextTabelOutletSubGroupOutletSubGroupId().setText(item.getSubGroupId().trim());
                controller.getView().getTextTabelOutletSubGroupOutletSubGroupNm().setText(item.getSubGroupNm().trim());
             }
         }
         public void aksiListTabelOutletSizeSelected(){
             int rowIndex = controller.getView().getTableTabelOutletSize().getSelectedRow();
             if (rowIndex >=0) {
                 TabelOutletSize item = new TabelOutletSize();
                 item = controller.getModel().tmTabelOutletSize.get(rowIndex);
                controller.getView().getTextTabelOutletSizeKodeSize().setText(item.getKodeSize().trim());
                controller.getView().getTextTabelOutletSizelNamaSize().setText(item.getNamaSize().trim());
             }
         }
         public void aksiListTabelOutletLocationSelected(){
             int rowIndex = controller.getView().getTableTabelOutletLocation().getSelectedRow();
             if (rowIndex >=0) {
                 TabelOutletLocation item = new TabelOutletLocation();
                 item = controller.getModel().tmTabelOutletLocation.get(rowIndex);
                controller.getView().getTextTabelOutletLocationKodeLokasi().setText(item.getKodeLokasi().trim());
                controller.getView().getTextTabelOutletLocationNamaLokasi().setText(item.getNamaLokasi().trim());
             }
         }
         public void aksiListTabelOutletGroupSelected(){
             int rowIndex = controller.getView().getTableTabelOutletGroup().getSelectedRow();
             if (rowIndex >=0 ) {
                 TabelOutletGroup item = new TabelOutletGroup();
                 item = controller.getModel().tmTabelOutletGroup.get(rowIndex);
                controller.getView().getTextTabelOutletGroupOutletGroupId().setText(item.getGroupId().trim());
                controller.getView().getTextTabelOutletGroupOutletGroupNm().setText(item.getGroupNm().trim());
             }
         }
         public void aksiListTabelOutletClassSelected(){
             int rowIndex = controller.getView().getTableTabelOutletClass().getSelectedRow();
             if (rowIndex >= 0) {
                 TabelOutletClass item = new TabelOutletClass();
                 item = controller.getModel().tmTabelOutletClass.get(rowIndex);
                controller.getView().getTextTabelOutletClassOutletClassId().setText(item.getClassId().trim());
                controller.getView().getTextTabelOutletClassOutletClassNm().setText(item.getClassNm().trim());
             }
         }
         public void aksiListTabelOutletChainSelected(){
             int rowIndex = controller.getView().getTableTabelOutletChain().getSelectedRow();
             if (rowIndex >=0){
                 TabelOutletChain item = new TabelOutletChain();
                 item = controller.getModel().tmTabelOutletChain.get(rowIndex);
                controller.getView().getTextTabelOutletChainKodeChain().setText(item.getKodeChain().trim());
                controller.getView().getTextTabelOutletChainNamaChain().setText(item.getNamaChain().trim());
             }
         }
         public void aksiListTabelKeyAccountSelected(){
             int rowIndex = controller.getView().getTableTabelKeyAccount().getSelectedRow();
             if (rowIndex >=0) {
                 TabelKeyAccount item = new TabelKeyAccount();
                 item = controller.getModel().tmTabelKeyAccount.get(rowIndex);
                controller.getView().getTextTabelKeyAccountKodeKa().setText(item.getKodeKa().trim());
                controller.getView().getTextTabelKeyAccountNama().setText(item.getNamaKa().trim());
                controller.getView().getTextTabelKeyAccountKeterangan().setText(item.getKeterangan().trim());
             }
         }
         
    
    
}
