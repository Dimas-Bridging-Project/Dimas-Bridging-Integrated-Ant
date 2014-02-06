package org.dimas.bridging.app.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import org.config.spring.hibernate.model.CvOutlet;
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.JTpru;
import org.config.spring.hibernate.model.Outlet;
import org.config.spring.hibernate.model.Produk;
import org.config.spring.hibernate.model.Salesman;
import org.config.spring.hibernate.model.ScyBDItem;
import org.config.spring.hibernate.model.ScyPenyesuaianItem;
import org.config.spring.hibernate.model.ScyReturPabrikItem;
import org.config.spring.hibernate.model.Stock;
import org.config.spring.hibernate.model.tablemodel.GenericTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yhawin
 */
public class BridgingControllerActionTabelInput {
    private static final Logger logger = LoggerFactory.getLogger(BridgingControllerActionTabelInput.class);
    
    private BridgingController controller;

    BridgingControllerActionTabelInput(BridgingController controller) {
        this.controller = controller;
        initAction();
    }
    public void initAction() {
         
         controller.getView().getBtnInputCvOutletReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputCvOutletReload();
             }

         });
         controller.getView().getBtnInputJheaderReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJheaderReload();
             }

         });
         controller.getView().getBtnInputJpcodeReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJpcodeReload();
             }

         });
         controller.getView().getBtnInputJtprbReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJtprbReload();
             }

         });
         controller.getView().getBtnInputJtpruReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJtpruReload();
             }

         });
         controller.getView().getBtnInputMasterReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputMasterReload();
             }

         });
         controller.getView().getBtnInputOutletReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputOutletReload();
             }

         });
         controller.getView().getBtnInputSalesmanReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputSalesmanReload();
             }

         });
         controller.getView().getBtnInputStockReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputStockReload();
             }

         });
         
         //Tambahan Buttton Reload
         controller.getView().getBtnInputBarangDatangReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputBarangDatangReload();
             }
         });
         controller.getView().getBtnInputReturKePabrikReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputReturKePabrikReload();
             }
         });
         controller.getView().getBtnInputStockAdjustmentReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputStockAdjustmentReload();
             }
         });
    }

             //Reload Input
             //public void aksiBtnInputCvOutletReload() {}
             //public void aksiBtnInputJheaderReload() {}
             //public void aksiBtnInputJpcodeReload() {}
             //public void aksiBtnInputJtprbReload() {}
             //public void aksiBtnInputJtpruReload() {}
             //public void aksiBtnInputMasterReload() {}
             //public void aksiBtnInputOutletReload() {}
             //public void aksiBtnInputSalesmanReload() {}
             //public void aksiBtnInputStockReload() {}  
             


    public void aksiBtnInputCvOutletReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<CvOutlet> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().cvOutletDao.findAll();
            lst = controller.getModel().cvOutletDao.findAll();
        } else {
            lst = controller.getModel().cvOutletDaoMem.findAll();        
        }
            controller.getModel().tmCvOutlet = new GenericTableModel<>(lst, CvOutlet.class);
            controller.getView().getTableInputCvOutlet().setModel(controller.getModel().tmCvOutlet);
    }
     
    public void aksiBtnInputJheaderReload() {
        //Reload Input hanya berlaku pada saat database mode
        
        List<JHeader> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().jheaderDao.findAll();
        } else {
            lst = controller.getModel().jheaderDaoMem.findAll();
        }
            controller.getModel().tmJHeader = new GenericTableModel<>(lst, JHeader.class);
            controller.getView().getTableInputJheader().setModel(controller.getModel().tmJHeader);
        
    }
    public void aksiBtnInputJpcodeReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<JPcode> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().jpcodeDao.findAll();
        } else {
            lst = controller.getModel().jpcodeDaoMem.findAll();
        }
            controller.getModel().tmJPcode = new GenericTableModel<>(lst, JPcode.class);
            controller.getView().getTableInputJpcode().setModel(controller.getModel().tmJPcode);
    }
    public void aksiBtnInputJtprbReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<JTprb> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().jtprbDao.findAll();
        } else {
            lst = controller.getModel().jtprbDaoMem.findAll();
        }
            controller.getModel().tmJTprb = new GenericTableModel<>(lst, JTprb.class);
            controller.getView().getTableInputJtprb().setModel(controller.getModel().tmJTprb);
    }
    public void aksiBtnInputJtpruReload() {
        //Reload Input hanya berlaku pada saat database mode        
        List<JTpru> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().jtpruDao.findAll();
        }else {
            lst = controller.getModel().jtpruDaoMem.findAll();
        }
            controller.getModel().tmJTpru = new GenericTableModel<>(lst, JTpru.class);
            controller.getView().getTableInputJtpru().setModel(controller.getModel().tmJTpru);
       
    }
    public void aksiBtnInputMasterReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<Produk> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()== true) {
            lst=  controller.getModel().produkDao.findAll();
        } else {
            lst = controller.getModel().produkDaoMem.findAll();
        }
            controller.getModel().tmProduk = new GenericTableModel<>(lst, Produk.class);
            controller.getView().getTableInputMaster().setModel(controller.getModel().tmProduk);
    }
    
    public void aksiBtnInputOutletReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<Outlet> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().outletDao.findAll();
        }else {
            lst = controller.getModel().outletDaoMem.findAll();
        }
            controller.getModel().tmOutlet = new GenericTableModel<>(lst, Outlet.class);
            controller.getView().getTableInputOutlet().setModel(controller.getModel().tmOutlet); 
   
    }

    
    public void aksiBtnInputSalesmanReload() {
         //Reload Input hanya berlaku pada saat database mode
       List<Salesman> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().salesmanDao.findAll();
        } else {
            lst = controller.getModel().salesmanDaoMem.findAll();
        }
            controller.getModel().tmSalesman = new GenericTableModel<>(lst, Salesman.class);
            controller.getView().getTableInputSalesman().setModel(controller.getModel().tmSalesman);
        
    }
 
    
    public void aksiBtnInputStockReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<Stock> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().stockDao.findAll();
        } else {
            lst = controller.getModel().stockDaoMem.findAll();
        }
            controller.getModel().tmStock = new GenericTableModel<>(lst, Stock.class);
            controller.getView().getTableInputStock().setModel(controller.getModel().tmStock);
        
    }
    
   //Reload Input Tambahan untuk KEK
   public void aksiBtnInputReturKePabrikReload() {
       List<ScyReturPabrikItem> lst = new ArrayList<>();
       if (controller.getModel().getDatabaseMode()==true) {
           lst = controller.getModel().scyReturPabriItemkDao.findAll();
       } else {
           lst = controller.getModel().scyReturPabriItemkDaoMem.findAll();
       }
       controller.getModel().tmScyReturPabrikItem = new GenericTableModel<>(lst, ScyReturPabrikItem.class);
       controller.getView().getTableInputReturKePabrik().setModel(controller.getModel().tmScyReturPabrikItem);
   }
   public void aksiBtnInputBarangDatangReload(){
       List<ScyBDItem> lst = new ArrayList<>();
       if (controller.getModel().getDatabaseMode()==true) {
           lst = controller.getModel().scyBDItemDao.findAll();
       } else {
           lst = controller.getModel().scyBDItemDaoMem.findAll();
       }
       controller.getModel().tmScyBDItem= new GenericTableModel<>(lst, ScyBDItem.class);
       controller.getView().getTableInputBarangDatang().setModel(controller.getModel().tmScyBDItem);  
       
   }
   public void aksiBtnInputStockAdjustmentReload(){
       List<ScyPenyesuaianItem> lst = new ArrayList<>();
       if (controller.getModel().getDatabaseMode()==true) {
           lst = controller.getModel().scyPenyesuaianItemDao.findAll();
       } else {
           lst = controller.getModel().scyPenyesuaianItemDaoMem.findAll();
       }
       controller.getModel().tmScyPenyesuaianItem= new GenericTableModel<>(lst, ScyPenyesuaianItem.class);
       controller.getView().getTableInputStockAdjustment().setModel(controller.getModel().tmScyPenyesuaianItem);
      
   }   
    //Tambahan Button Reload Input
    //public void aksiBtnInputReturKePabrikReload() {}
    //public void aksiBtnInputBarangDatangReload(){}
    //public void aksiBtnInputStockAdjustmentReload(){}
             
    public void aksiReloadInput() {
        aksiBtnInputCvOutletReload();
        aksiBtnInputJheaderReload();
        aksiBtnInputJpcodeReload();
        aksiBtnInputJtprbReload();
        aksiBtnInputJtpruReload();
        aksiBtnInputMasterReload();
        aksiBtnInputOutletReload();
        aksiBtnInputSalesmanReload();
        aksiBtnInputStockReload();      
        
        aksiBtnInputReturKePabrikReload();
        aksiBtnInputBarangDatangReload();
        aksiBtnInputStockAdjustmentReload();
    }

}