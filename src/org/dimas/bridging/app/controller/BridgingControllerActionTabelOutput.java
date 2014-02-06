package org.dimas.bridging.app.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import org.config.spring.hibernate.model.TAdjstk;
import org.config.spring.hibernate.model.TDatdpr;
import org.config.spring.hibernate.model.TDatdsl;
import org.config.spring.hibernate.model.TDatdsr;
import org.config.spring.hibernate.model.TDatsri;
import org.config.spring.hibernate.model.TOutlet;
import org.config.spring.hibernate.model.TSalesman;
import org.config.spring.hibernate.model.TStok;
import org.config.spring.hibernate.model.TblClientId;
import org.config.spring.hibernate.model.TblSalesId;
import org.config.spring.hibernate.model.TblSoId;
import org.config.spring.hibernate.model.TblStockId;
import org.config.spring.hibernate.model.pokari.OutputArCustomer;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrder;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDetail;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDisc;
import org.config.spring.hibernate.model.pokari.OutputSpEmployee;
import org.config.spring.hibernate.model.pokari.OutputSpEmployeeTarget;
import org.config.spring.hibernate.model.pokari.OutputSpEmployeeTargetItemDetail;
import org.config.spring.hibernate.model.tablemodel.GenericTableModel;
import org.config.spring.hibernate.model.tablemodel.OutputSpEmployeeTargetTableModel;

/**
 * @author yhawin
 */
public class BridgingControllerActionTabelOutput {

	private BridgingController controller;


	/**
	 * 
	 * @param controller
	 */
    BridgingControllerActionTabelOutput(BridgingController controller) {
        this.controller = controller;
        initAction();
    }

    public void initAction() {
        /**
         * BAYGON : INIT ACTION
         */
         controller.getView().getjPanelSubOutputBaygon1().getBtnOutputClientReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputClientReload();
             }
         });
         controller.getView().getjPanelSubOutputBaygon1().getBtnOutputSalesOrderReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputSalesOrderReload();
             }

         } );
         controller.getView().getjPanelSubOutputBaygon1().getBtnOutputSalesReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputSalesReload();
             }
         });
         controller.getView().getjPanelSubOutputBaygon1().getBtnOutputStockReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputStockReload();
             }
         });
         
         //Reload Tab Output
         controller.getView().getjPanelSubOutputKek1().getBtnOutputTSalesmanReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTSalesmanReload();
             }
         });
         controller.getView().getjPanelSubOutputKek1().getBtnOutputTOutletReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTOutletReload();
             }
         });
         controller.getView().getjPanelSubOutputKek1().getBtnOutputTStokReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTStokReload();
             }
         });
         controller.getView().getjPanelSubOutputKek1().getBtnOutputTDatdslReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTDatdslReload();
             }
         });
         controller.getView().getjPanelSubOutputKek1().getBtnOutputTDatdsrReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTDatdsrReload();
             }
         });
         controller.getView().getjPanelSubOutputKek1().getBtnOutputTDatdprReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTDatdprReload();
             }
         });
         controller.getView().getjPanelSubOutputKek1().getBtnOutputTDatsriReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTDatsriReload();
             }
         });
         controller.getView().getjPanelSubOutputKek1().getBtnOutputTAdjstkReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTAdjstkReload();
             }
         });
         
         //Init Action For Pokari
         //controller.getView().getBtnOutput
         
         controller.getView().getjPanelSubOutputPokari1().getBtnOutputPokariArCustomerReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputPokariArCustomerReload();
             }
         });
         controller.getView().getjPanelSubOutputPokari1().getBtnOutputPokariCanDDeliveryOrderReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputPokariCanDDeliveryOrderReload();
             }
         });
         controller.getView().getjPanelSubOutputPokari1().getBtnOutputPokariCanDDeliveryOrderDetailReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputPokariCanDDeliveryOrderDetailReload();
             }
         });
         controller.getView().getjPanelSubOutputPokari1().getBtnOutputPokariEmployeeTargetReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputPokariEmployeeTargetReload();
             }
         });
         controller.getView().getjPanelSubOutputPokari1().getBtnOutputPokariEmployeeTargetItemDetailReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputPokariEmployeeTargetDetailReload();
             }
         });
         controller.getView().getjPanelSubOutputPokari1().getBtnOutputPokariSpEmployeeReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputPokariSpEmployeeReload();
             }
         });
         controller.getView().getjPanelSubOutputPokari1().getBtnOutputPokariCanDDeliveryOrderDiscReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputPokariCanDDeliveryOrderDiscReload();
             }
         });
    }
    
//             public void aksiBtnOutputClientReload() {}
//             public void aksiBtnOutputSalesOrderReload() {}
//             public void aksiBtnOutputSalesReload() {}
//             public void aksiBtnOutputStockReload() {}        
//    
//            //Tambahan Aksi Reload Output
//            public void aksiBtnOutputTSalesmanReload(){}
//            public void aksiBtnOutputTOutletReload(){}
//            public void aksiBtnOutputTStokReload(){}
//            public void aksiBtnOutputTDatdslReload(){}
//            public void aksiBtnOutputTDatdprReload(){}
//            public void aksiBtnOutputTDatdsrReload(){}
//            public void aksiBtnOutputTDatsriReload(){}
//            public void aksiBtnOutputTAdjstkReload(){}                            
    
    //********* RELOAD OUTPUT KEK
    public void aksiBtnOutputTAdjstkReload(){
        List<TAdjstk> lst = new ArrayList();
       if (controller.getModel().getDatabaseMode()==true) {
           lst = controller.getModel().tAdjstkDao.findAll();
       } else {
           lst = controller.getModel().tAdjstkDaoMem.findAll();
       }
       controller.getModel().tmOutputTAdjstk= new GenericTableModel<>(lst, TAdjstk.class);
       controller.getView().getjPanelSubOutputKek1().getTableOutputTAdjstk().setModel(controller.getModel().tmOutputTAdjstk);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TAdjstk itm: lst){
           intJumlahRecord++;
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord; 
       controller.getView().getjPanelSubOutputKek1().getLblOutputTAdjstkFooterInfo().setText(teksFooter);
    }
    
    public void aksiBtnOutputTSalesmanReload(){
       List<TSalesman> lst = new ArrayList<>();
       if (controller.getModel().getDatabaseMode()==true) {
           lst = controller.getModel().tSalesmanDao.findAll();
       } else {
           lst = controller.getModel().tSalesmanDaoMem.findAll();
       }
       controller.getModel().tmOutputTSalesman= new GenericTableModel<>(lst, TSalesman.class);
        controller.getView().getjPanelSubOutputKek1().getTableOutputTSalesman().setModel(controller.getModel().tmOutputTSalesman);
    }
    
    public void aksiBtnOutputTOutletReload(){
       List<TOutlet> lst = new ArrayList<>();
       if (controller.getModel().getDatabaseMode()==true) {
           lst = controller.getModel().tOutletDao.findAll();
       } else {
           lst = controller.getModel().tOutletDaoMem.findAll();
       }
      controller.getModel().tmOutputTOutlet= new GenericTableModel<>(lst, TOutlet.class);
      controller.getView().getjPanelSubOutputKek1().getTableOutputTOutlet().setModel(controller.getModel().tmOutputTOutlet);
    }
    public void aksiBtnOutputTStokReload(){
       List<TStok> lst = new ArrayList<>();
       if (controller.getModel().getDatabaseMode()==true) {
           lst = controller.getModel().tStokDao.findAll();
       } else {
           lst = controller.getModel().tStokDaoMem.findAll();
       }
      controller.getModel().tmOutputTStok= new GenericTableModel<>(lst, TStok.class);
      controller.getView().getjPanelSubOutputKek1().getTableOutputTStok().setModel(controller.getModel().tmOutputTStok);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TStok itm: lst){
           intJumlahRecord++;
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord; 
    }
    public void aksiBtnOutputTDatdprReload(){
       List<TDatdpr> lst = new ArrayList<>();
       if (controller.getModel().getDatabaseMode()==true) {
           lst = controller.getModel().tDatdprDao.findAll();
       } else {
           lst = controller.getModel().tDatdprDaoMem.findAll();
       }
      controller.getModel().tmOutputTDatdpr= new GenericTableModel<>(lst, TDatdpr.class);
      controller.getView().getjPanelSubOutputKek1().getTableOutputTDatdpr().setModel(controller.getModel().tmOutputTDatdpr);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TDatdpr itm: lst){
           intJumlahRecord++;
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord ; 
      controller.getView().getjPanelSubOutputKek1().getLblOutputTDatdprFooterInfo().setText(teksFooter);
       
    }
    public void aksiBtnOutputTDatdslReload(){
       List<TDatdsl> lst = new ArrayList<>();
       if (controller.getModel().getDatabaseMode()==true) {
           lst = controller.getModel().tDatdslDao.findAll();
       } else {
           lst = controller.getModel().tDatdslDaoMem.findAll();
       }
      controller.getModel().tmOutputTDatdsl= new GenericTableModel<>(lst, TDatdsl.class);
      controller.getView().getjPanelSubOutputKek1().getTableOutputTDatdsl().setModel(controller.getModel().tmOutputTDatdsl);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TDatdsl itm: lst){
           intJumlahRecord++;
           doubleJumlahTotalSales += itm.getTotalSales();
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord + "\t TotalSales: " + doubleJumlahTotalSales; 
      controller.getView().getjPanelSubOutputKek1().getLblOutputTDatdslFooterInfo().setText(teksFooter);
       
    }
    
    public void aksiBtnOutputTDatdsrReload(){
       List<TDatdsr> lst = new ArrayList<>();
       if (controller.getModel().getDatabaseMode()==true) {
           lst = controller.getModel().tDatdsrDao.findAll();
       } else {
           lst = controller.getModel().tDatdsrDaoMem.findAll();
       }
      controller.getModel().tmOutputTDatdsr= new GenericTableModel<>(lst, TDatdsr.class);
      controller.getView().getjPanelSubOutputKek1().getTableOutputTDatdsr().setModel(controller.getModel().tmOutputTDatdsr);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TDatdsr itm: lst){
           intJumlahRecord++;
           doubleJumlahTotalSales += itm.getTotalSales();
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord + "\t TotalSales: " + doubleJumlahTotalSales; 
      controller.getView().getjPanelSubOutputKek1().getLblOutputTDatdsrFooterInfo().setText(teksFooter);
       
    }
   
   
    
    public void aksiBtnOutputTDatsriReload(){
       List<TDatsri> lst = new ArrayList<>();
       if (controller.getModel().getDatabaseMode()==true) {
           lst = controller.getModel().tDatsriDao.findAll();
       } else {
           lst = controller.getModel().tDatsriDaoMem.findAll();
       }
      controller.getModel().tmOutputTDatsri= new GenericTableModel<>(lst, TDatsri.class);
      controller.getView().getjPanelSubOutputKek1().getTableOutputTDatsri().setModel(controller.getModel().tmOutputTDatsri);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TDatsri itm: lst){
           intJumlahRecord++;
           doubleJumlahTotalSales += itm.getTotalSales();
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord + "\t TotalSales: " + doubleJumlahTotalSales; 
      controller.getView().getjPanelSubOutputKek1().getLblOutputTDatsriFooterInfo().setText(teksFooter);
    }
    
    
//   RELOAD BUTTON OUTPUT BAYGON 
   
    public void aksiBtnOutputClientReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblClientId> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().tblClientIdDao.findAll();
        } else  {
            lst = controller.getModel().tblClientIdDaoMem.findAll();
        }
           controller.getModel().tmTblClientId = new GenericTableModel<>(lst, TblClientId.class);
           controller.getView().getjPanelSubOutputBaygon1().getTableOutputClient().setModel(controller.getModel().tmTblClientId);
    }
    public void aksiBtnOutputSalesOrderReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblSoId> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().tblSoIdDao.findAll();
        }else {
            lst = controller.getModel().tblSoIdDaoMem.findAll();
        }
            controller.getModel().tmTblSoId = new GenericTableModel<>(lst, TblSoId.class);
            controller.getView().getjPanelSubOutputBaygon1().getTableOutputSalesOrder().setModel(controller.getModel().tmTblSoId);
        
    }
    public void aksiBtnOutputSalesReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblSalesId> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().tblSalesIdDao.findAll();
        }else {
            lst = controller.getModel().tblSalesIdDaoMem.findAll();
        }
           controller.getModel().tmTblSalesId = new GenericTableModel<>(lst, TblSalesId.class);
           controller.getView().getjPanelSubOutputBaygon1().getTableOutputSales().setModel(controller.getModel().tmTblSalesId);
    }
    public void aksiBtnOutputStockReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblStockId> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().tblStockIdDao.findAll();
        }else {
            lst = controller.getModel().tblStockIdDaoMem.findAll();
        }
            controller.getModel().tmTblStockId = new GenericTableModel<>(lst, TblStockId.class);
            controller.getView().getjPanelSubOutputBaygon1().getTableOutputStock().setModel(controller.getModel().tmTblStockId);
    }

    //POKARI : RELOAD
    public void aksiBtnOutputPokariArCustomerReload(){
        //Reload Output hanya bisa jika MODE DATABASE
        List<OutputArCustomer> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().outputArCustomerDao.findAll();
        }else {
            lst = controller.getModel().outputArCustomerDaoMem.findAll();
        }
        controller.getModel().tmOutputArCustomer = new GenericTableModel<>(lst, OutputArCustomer.class);    
        controller.getView().getjPanelSubOutputPokari1().getTableOutputPokariArCustomer().setModel(controller.getModel().tmOutputArCustomer);
    }
    public void aksiBtnOutputPokariCanDDeliveryOrderReload(){
        //Reload Output hanya bisa jika MODE DATABASE
        List<OutputCanDDeliveryOrder> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().outputCanDDeliveryOrderDao.findAll();
        }else {
            lst = controller.getModel().outputCanDDeliveryOrderDaoMem.findAll();
        }
        controller.getModel().tmOutputCanDDeliveryOrder = new GenericTableModel<>(lst, OutputCanDDeliveryOrder.class);    
        controller.getView().getjPanelSubOutputPokari1().getTableOutputPokariCanDDeliveryOrder().setModel(controller.getModel().tmOutputCanDDeliveryOrder);
    }
    public void aksiBtnOutputPokariCanDDeliveryOrderDetailReload(){
        //Reload Output hanya bisa jika MODE DATABASE
        List<OutputCanDDeliveryOrderItemDetail> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().outputCanDDeliveryOrderItemDetailDao.findAll();
        }else {
            lst = controller.getModel().outputCanDDeliveryOrderItemDetailDaoMem.findAll();
        }
        controller.getModel().tmOutputCanDDeliveryOrderItemDetail = new GenericTableModel<>(lst, OutputCanDDeliveryOrderItemDetail.class);    
        controller.getView().getjPanelSubOutputPokari1().getTableOutputPokariCanDDeliveryOrderDetail().setModel(controller.getModel().tmOutputCanDDeliveryOrderItemDetail);
    }
    public void aksiBtnOutputPokariCanDDeliveryOrderDiscReload(){
        //Reload Output hanya bisa jika MODE DATABASE
        List<OutputCanDDeliveryOrderItemDisc> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().outputCanDDeliveryOrderItemDiscDao.findAll();
        }else {
            lst = controller.getModel().outputCanDDeliveryOrderItemDiscDaoMem.findAll();
        }
        controller.getModel().tmOutputCanDDeliveryOrderItemDisc = new GenericTableModel<>(lst, OutputCanDDeliveryOrderItemDisc.class);    
        controller.getView().getjPanelSubOutputPokari1().getTableOutputPokariCanDDeliveryOrderDisc().setModel(controller.getModel().tmOutputCanDDeliveryOrderItemDisc);
    }
    public void aksiBtnOutputPokariEmployeeTargetReload(){
        //Reload Output hanya bisa jika MODE DATABASE
        List<OutputSpEmployeeTarget> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().outputSpEmployeeTargetDao.findAll();
        }else {
            lst = controller.getModel().outputSpEmployeeTargetDaoMem.findAll();
        }
        
        controller.getModel().tmOutputSpEmployeeTargetTableModel = new OutputSpEmployeeTargetTableModel(lst);    
        controller.getView().getjPanelSubOutputPokari1().getTableOutputPokariEmployeeTarget().setModel(controller.getModel().tmOutputSpEmployeeTargetTableModel);        
    }
    public void aksiBtnOutputPokariEmployeeTargetDetailReload(){
        //Reload Output hanya bisa jika MODE DATABASE
        List<OutputSpEmployeeTargetItemDetail> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().outputSpEmployeeTargetItemDetailDao.findAll();
        }else {
            lst = controller.getModel().outputSpEmployeeTargetItemDetailDaoMem.findAll();
        }
        //TABLE MODEL MANUAL
        controller.getModel().tmOutputSpEmployeeTargetItemDetail = new GenericTableModel<>(lst, OutputSpEmployeeTargetItemDetail.class);    
        controller.getView().getjPanelSubOutputPokari1().getTableOutputPokariEmployeeTargetDetail().setModel(controller.getModel().tmOutputSpEmployeeTargetItemDetail);
    }
    public void aksiBtnOutputPokariSpEmployeeReload(){
        //Reload Output hanya bisa jika MODE DATABASE
        List<OutputSpEmployee> lst = new ArrayList<>();
        if (controller.getModel().getDatabaseMode()==true) {
            lst = controller.getModel().outputSpEmployeeDao.findAll();
        }else {
            lst = controller.getModel().outputSpEmployeeDaoMem.findAll();
        }
        controller.getModel().tmOutputSpEmployee = new GenericTableModel<>(lst, OutputSpEmployee.class);    
        controller.getView().getjPanelSubOutputPokari1().getTableOutputPokariSpEmployee().setModel(controller.getModel().tmOutputSpEmployee);
    }
    
    
    public void aksiReloadOutput(){
        aksiReloadOutputBaygon();
        aksiReloadOutputKek();
        aksiReloadOutputPokari();
    }
    public void aksiReloadOutputKek(){
        //Reload Output KEK
        aksiBtnOutputTAdjstkReload();
        aksiBtnOutputTDatdprReload();
        aksiBtnOutputTDatdslReload();
        aksiBtnOutputTDatdsrReload();
        aksiBtnOutputTDatsriReload();
        aksiBtnOutputTOutletReload();
        aksiBtnOutputTSalesmanReload();
        aksiBtnOutputTStokReload();
    }
    public void aksiReloadOutputPokari(){
        aksiBtnOutputPokariArCustomerReload();
        aksiBtnOutputPokariCanDDeliveryOrderReload();
        aksiBtnOutputPokariCanDDeliveryOrderDetailReload();
        aksiBtnOutputPokariCanDDeliveryOrderDiscReload();
        aksiBtnOutputPokariEmployeeTargetReload();
        aksiBtnOutputPokariEmployeeTargetDetailReload();
        aksiBtnOutputPokariSpEmployeeReload();
    }
    public void aksiReloadOutputBaygon(){
        //Reload Output Baygon
        aksiBtnOutputClientReload();
        aksiBtnOutputSalesOrderReload();
        aksiBtnOutputSalesReload();
        aksiBtnOutputStockReload();
    }
    
             

}