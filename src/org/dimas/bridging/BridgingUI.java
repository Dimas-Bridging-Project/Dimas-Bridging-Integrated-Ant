/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author yhawin
 */
public class BridgingUI extends javax.swing.JFrame {

    /**
     * Creates new form BridgingUI
     */
    public BridgingUI() {
        initComponents();
        initUserActions();
      
    }
    public void resetTeksInputBackground(){
       textPathInputCvOutlet.setBackground(Color.WHITE);
       
       textPathInputJHeader.setBackground(Color.WHITE);
       textPathInputJPcode.setBackground(Color.WHITE);
       textPathInputJTprb.setBackground(Color.WHITE);
       textPathInputJTpru.setBackground(Color.WHITE);
       textPathInputMaster.setBackground(Color.WHITE);
       textPathInputOutlet.setBackground(Color.WHITE);
       textPathInputSalesman.setBackground(Color.WHITE);
       textPathInputStock.setBackground(Color.WHITE);   
       
       textPathInputBarangDatang.setBackground(Color.WHITE);
       textPathInputReturKePabrik.setBackground(Color.WHITE);
       textPathInputStokAdjustment.setBackground(Color.WHITE);
    }
    
     public void setScreenCenter(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        int frameHeight = this.getHeight();
        int frameWidth = this.getWidth();
        //setSize(screenWidth / 2, screenHeight / 2);
        setLocation((screenWidth/2)-(frameWidth/2), (screenHeight/2)-(frameHeight/2));
     }   
     
    public void resetTeksAll(){
        resetTeksGeneralSetting();
        resetTeksMappingTipeOutlet();
        resetTeksRetrieveAndExtract();
        resetTeksTabel();
        
        resetTeksMapping();
        resetTeksBackupRestore();
        
        resetSearchInputJHeader();
    }
    
    public void resetTeksTabel(){
        //Tabel KeyAccount
        getTextTabelKeyAccountKodeKa().setText("");
        getTextTabelKeyAccountNama().setText("");
        getTextTabelKeyAccountKeterangan().setText("");
        //Tabel Outlet Class, Group dan Sub Group
        getTextTabelOutletClassOutletClassId().setText("");
        getTextTabelOutletClassOutletClassNm().setText("");
        getTextTabelOutletGroupOutletGroupId().setText("");
        getTextTabelOutletGroupOutletGroupNm().setText("");
        getTextTabelOutletSubGroupOutletSubGroupId().setText("");
        getTextTabelOutletSubGroupOutletSubGroupNm().setText("");
        //Tabel OutletChain
        getTextTabelOutletChainKodeChain().setText("");
        getTextTabelOutletChainNamaChain().setText("");
        //Outlet Location
        getTextTabelOutletLocationKodeLokasi().setText("");
        getTextTabelOutletLocationNamaLokasi().setText("");
        //Outlet Type
        getTextTabelOutletTypeKodeType().setText("");
        getTextTabelOutletTypeNamaType().setText("");
        //Outlet Size
        getTextTabelOutletSizeKodeSize().setText("");
        getTextTabelOutletSizelNamaSize().setText("");
        //Prod Brand and Sub
        getTextTabelProdBrandBrandId().setText("");
        getTextTabelProdBrandBrandNm().setText("");
        getTextTabelProdSubBrandSubBrandId().setText("");
        getTextTabelProdSubBrandSubBrandNm().setText("");
        //Prod Categ and Sub
        getTextTabelProdCategCatedId().setText("");
        getTextTabelProdCategCategNm().setText("");
        getTextTabelProdSubCategSubCategId().setText("");
        getTextTabelProdSubCategSubCategNm().setText("");
        //Prod Divisi
        getTextTabelProdDivisiDivisiId().setText("");
        getTextTabelProdDivisiDivisiNm().setText("");
        //Prod variance
        getTextTabelProdVarianceVarianceId().setText("");
        getTextTabelProdVarianceVarianceNm().setText("");
        //Prod Size
        getTextTabelProdSizeSizeId().setText("");
        getTextTabelProdSizeSizeNm().setText("");
        
    }
    public void resetSearchMapProduct(){
             getCheckMapProductSearchSemua().setSelected(true);
             getCheckMapProductSearchAktifSaja().setSelected(false);
             getCheckMapProductSearchBaruSaja().setSelected(false);
             getCheckMapProductSearchBonusSaja().setSelected(false);
             getCheckMapProductSearchDikirimSaja().setSelected(false);
    }
    public void resetSearchMapOutlet(){
        getCheckMapOutletSearchSemua().setSelected(true);
        getCheckMapOutletSearchAktifSaja().setSelected(false);
        getCheckMapOutletSearchBaruSaja().setSelected(false);
        getCheckMapOutletSearchDikirimSaja().setSelected(false);
    }
    public void resetSearchInputJHeader(){
        getTextInputJHeaderSearchIdOrder().setText("");
        getTextInputJHeaderSearchIdOutlet().setText("");
        getTextInputJHeaderSearchSalesman().setText("");
    }
    public void resetTeksMapping(){
        //Product
        getTextMapProductAreaId().setText("");
        getTextMapProductDistributorId().setText("");
        getTextMapProductIdBrgScylla().setText("");
        getTextMapProductIdSap().setText("");
        getTextMapProductNamaBarangSAP().setText("");
        getTextMapProductSearchIdBrgScylla().setText("");
        getTextMapProductSearchIdSap().setText("");
        getTextMapProductSearchNamaBarangSAP().setText("");
        resetSearchMapProduct();
        
        //Outlet
        getTextMapOutletDistiId().setText("");
        getTextMapOutletMSLOutletCode().setText("");
        getTextMapOutletMSLOutletName().setText("");
        getTextMapOutletSearchScyOutletCode().setText("");
        getTextMapOutletSearchMSLOutletCode().setText("");
        getTextMapOutletSearchMSLOutletName().setText("");
        getTextMapOutletScyOutletCode().setText("");
        resetSearchMapOutlet();
        
        //Map salesman
        getTextMapSalesmanCAlamat1().setText("");
        getTextMapSalesmanCAlamat2().setText("");
        getTextMapSalesmanCKota().setText("");
        getTextMapSalesmanCTelpon().setText("");
        getTextMapSalesmanDistributorId().setText("");
        getTextMapSalesmanKodeLevel().setText("");
        getTextMapSalesmanRTTPCode().setText("");
        getTextMapSalesmanSalesmanId().setText("");
        getTextMapSalesmanSalesmanIdScylla().setText("");
        getTextMapSalesmanSalesmanName().setText("");
                
    }
    
    public void resetTeksRetrieveAndExtract(){
       textPathInputCvOutlet.setText("");
       textPathInputCvOutlet.setText("<< BOLEH KOSONG >>");
       
       textPathInputJHeader.setText("");
       textPathInputJPcode.setText("");
       textPathInputJTprb.setText("");
       textPathInputJTpru.setText("");
       textPathInputMaster.setText("");
       textPathInputOutlet.setText("");
       textPathInputSalesman.setText("");
       textPathInputStock.setText("");
       
       textPathInputBarangDatang.setText("");
       textPathInputReturKePabrik.setText("");
       textPathInputStokAdjustment.setText("");
       
       textPathOutput.setText("");
    }
    
    public void resetTeksGeneralSetting(){
        textDistributorCode.setText("");
        textDistributorName.setText("");
        
        textRecordTypeClient.setText("");
        textRecordTypeSales.setText("");
        textRecordTypeSo.setText("");
        textRecordTypeStock.setText("");
        
        textWarehouseWarehouseCode.setText("");
        textWarehouseWarehouseDescription.setText("");
        
        textEmailFrom.setText("");
        textEmailPassword.setText("");
        textEmailTo.setText("");
        textEmailSubject.setText("");
       
    }
    
    public void resetTeksMappingTipeOutlet(){
        textMapTipeOutletDeskripsi.setText("");
        textMapTipeOutletIdTipeOutlet.setText("");
        textMapTipeOutletIdTypeOutletScy.setText("");
    }
    
    public void resetTeksBackupRestore(){
        textBackupAndRestoreBackupPath.setText("");
        textBackupAndRestoreRestorePath.setText("");
    }
          //Extract File BayGon
             public void aksiBtnPathOutput() {}
             public void aksiBtnExtractAll() {}                 
             public void aksiBtnExtractClient() {}
             public void aksiBtnExtractSales() {}
             public void aksiBtnExtractSo() {}
             public void aksiBtnExtractStock() {}
             
            //Extract KEK
            public void aksiBtnExtractMSalesman(){}        
            public void aksiBtnExtractMSlsOut() {}
            public void aksiBtnExtractTAdjStk(){}
            public void aksiBtnExtractTDatdpr(){}
            public void aksiBtnExtractTDatdsl(){}
            public void aksiBtnExtractTDatdsr(){}
            public void aksiBtnExtractTDatsri() {}
            public void aksiBtnExtractTStok(){}
             
             //General Setting / Parameter Sistem
             public void aksiBtnGeneralSettingReload() {}
             public void aksiBtnGeneralSettingSimpan() {}
             public void aksiBtnMapTipeOutletHapus() {}
             public void aksiBtnMapTipeOutletSimpan() {}
             public void aksiBtnMapTipeOutletReload() {}
             //Reload Input
             public void aksiBtnInputCvOutletReload() {}
             public void aksiBtnInputJheaderReload() {}
             public void aksiBtnInputJpcodeReload() {}
             public void aksiBtnInputJtprbReload() {}
             public void aksiBtnInputJtpruReload() {}
             public void aksiBtnInputMasterReload() {}
             public void aksiBtnInputOutletReload() {}
             public void aksiBtnInputSalesmanReload() {}
             public void aksiBtnInputStockReload() {}             
             public void aksiBtnOutputClientReload() {}
             public void aksiBtnOutputSalesOrderReload() {}
             public void aksiBtnOutputSalesReload() {}
             public void aksiBtnOutputStockReload() {}        
            //Tambahan Button Reload Input
            public void aksiBtnInputReturKePabrikReload() {}
            public void aksiBtnInputBarangDatangReload(){}
            public void aksiBtnInputStockAdjustmentReload(){}

            //Tambahan Aksi Reload Output
                 public void aksiBtnOutputTSalesmanReload(){}
                 public void aksiBtnOutputTOutletReload(){}
                 public void aksiBtnOutputTStokReload(){}
                 public void aksiBtnOutputTDatdslReload(){}
                 public void aksiBtnOutputTDatdprReload(){}
                 public void aksiBtnOutputTDatdsrReload(){}
                 public void aksiBtnOutputTDatsriReload(){}
                 public void aksiBtnOutputTAdjstkReload(){}                            
             
              public void aksiBtnPathInputStock() {}
              public void aksiBtnPathInputAuto() {} 
              public void aksiBtnPathInputCvOutlet() {}
              public void aksiBtnPathInputJHeader() {}
              public void aksiPathInputJPcode() {}
              public void aksiBtnPathInputJTprb() {}
              public void aksiBtnPathInputJTpru() {}
              public void aksiBtnPathInputMaster() {}
              public void aksiBtnPathInputOutlet() {}
              public void aksiBtnPathInputSalesman() {}
              
           //Tambahan Btn Path Input
            public void aksiBtnPathInputBarangDatang(){}        
            public void aksiBtnPathInputReturKePabrik(){}
            public void aksiBtnPathInputStokAdjustment(){}
   
            //Retrieve
             public void aksiBtnRetrieveInputCvOutlet() {}
             public void aksiBtnRetrieveInputJHeader() {}
             public void aksiBtnRetrieveInputJPcode() {}
             public void aksiBtnRetrieveInputJTprb() {}
             public void aksiBtnRetrieveInputJTpru() {}
             public void aksiBtnRetrieveInputMaster() {}
             public void aksiBtnRetrieveInputOutlet() {}
             public void aksiBtnRetrieveInputStock() {}
             public void aksiBtnRetrieveInputSalesman() {}
           //Tambahan Btn Retrieve
            public void aksiBtnRetrieveInputBarangDatang(){}
            public void aksiBtnRetrieveInputReturKePabrik(){}
            public void aksiBtnRetrieveInputStokAdjustment(){}
                           
            public void aksiBtnRetrieveInputAll() {}
            public void aksiBtnPathInputClearAll() {}
            public void aksiBtnPathInputReloadAll() {}

            public void aksiBtnKirimByEmail() {}

         //Tabel-tabel
         public void aksiBtnTabelKeyAccountSave(){}
         public void aksiBtnTabelKeyAccountDelete(){}
         public void aksiBtnTabelOutletSubGroupDelete(){}
         public void aksiBtnTabelOutletSubGroupSave(){}
         public void aksiBtnTabelOutletClassDelete(){}
         public void aksiBtnTabelOutletClassSave(){}
         public void aksiBtnTabelOutletGroupSave(){}
         public void aksiBtnTabelOutletGroupDelete(){}
         public void aksiBtnTabelOutletChainSave(){}
         public void aksiBtnTabelOutletChainDelete() {}
         public void aksiBtnTabelOutletLocationDelete(){}
         public void aksiBtnTabelOutletLocationSave(){}
         public void aksiBtnTabelOutletTypeDelete(){}
         public void aksiBtnTabelOutletTypeSave(){}
         public void aksiBtnTabelOutletSizeDelete(){}
         public void aksiBtnTabelOutletSizeSave(){}
         //Tabel-tabel Product
         public void aksiBtnTabelProdVarianceSave(){}
         public void aksiBtnTabelProdVarianceDelete(){}
         public void aksiBtnTabelProdSubCategSave(){}
         public void aksiBtnTabelProdSubCategDelete(){}
         public void aksiBtnTabelProdSubBrandSave(){}
         public void aksiBtnTabelProdSubBrandDelete(){}
         public void aksiBtnTAbelProdSizeSave(){}
         public void aksiBtnTabelProdSizeDelete(){}
         public void aksiBtnTabelProdDivisiSave(){}
         public void aksiBtnTabelProdDivisiDelete(){}
         public void aksiBtnTabelProdCategSave(){}
         public void aksiBtnTabelProdCategDelete(){}
         public void aksiBtnTabelProdBrandSave(){}
         public void aksiBtnTabelProdBrandDelete(){}
         
         //Mapping Master
         public void aksiBtnMapSalesmanSave(){}
         public void aksiBtnMapSalesmanDelete(){}
         public void aksiBtnMapSalesmanReload(){}
         
         public void aksiBtnMapOutletSave(){}
         public void aksiBtnMapOutletDelete(){}
         public void aksiBtnMapOutletSearch(){}
         public void aksiBtnMapOutletReload(){}         
         
         public void aksiBtnMapProductSearch(){}
         public void aksiBtnMapProductSave(){}
         public void aksiBtnMapProductDelete(){}
         public void aksiBtnMapProductReload(){}         

        public void aksiBtnBackupAndRestoreBackupPath(){}
        public void aksiBtnBackupAndRestoreBackupStartBackup(){}
        public void aksiBtnBackupAndRestoreRestorePath(){}
        public void aksiBtnBackupAndRestoreStartRestore(){}
         
     public void initUserActions(){
  
         this.getBtnPathOutput().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnPathOutput();
             }

         });
         this.getBtnExtractAll().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractAll();
             }

         });
         //Button Extract Dibawah ini tidak dipakai kecuali All
          this.getBtnExtractClient().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractClient();
             }
         });
         this.getBtnExtractSales().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractSales();
             }
         });
         this.getBtnExtractSo().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractSo();
             }
         });
         this.getBtnExtractStock().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractStock();
             }
         });
         
         //Ekstract diatas tidak dipakai 
         this.getBtnExtractMSalesman().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractMSalesman();
             }
         });
         this.getBtnExtractMSlsOut().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractMSlsOut();
             }
         });
         this.getBtnExtractTAdjStk().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTAdjStk();
             }
         });
         this.getBtnExtractTDatdpr().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatdpr();
             }
         });
         this.getBtnExtractTDatdsl().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatdsl();
             }
         });
         this.getBtnExtractTDatdsr().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatdsr();
             }
         });
         this.getBtnExtractTDatsri().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatsri();
             }
         });
         this.getBtnExtractTStok().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTStok();
             }
         });
         
         this.getBtnGeneralSettingReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnGeneralSettingReload();
             }

         });
         this.getBtnGeneralSettingSimpan().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnGeneralSettingSimpan();
             }

         });
         
         this.getBtnInputCvOutletReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputCvOutletReload();
             }

         });
         this.getBtnInputJheaderReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJheaderReload();
             }

         });
         this.getBtnInputJpcodeReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJpcodeReload();
             }

         });
         this.getBtnInputJtprbReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJtprbReload();
             }

         });
         this.getBtnInputJtpruReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJtpruReload();
             }

         });
         this.getBtnInputMasterReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputMasterReload();
             }

         });
         this.getBtnInputOutletReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputOutletReload();
             }

         });
         this.getBtnInputSalesmanReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputSalesmanReload();
             }

         });
         this.getBtnInputStockReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputStockReload();
             }

         });
         //Tambahan Buttton Reload
         this.getBtnInputBarangDatangReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputBarangDatangReload();
             }
         });
         this.getBtnInputReturKePabrikReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputReturKePabrikReload();
             }
         });
         this.getBtnInputStockAdjustmentReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputStockAdjustmentReload();
             }
         });
         //Reload Tab Output
         this.getBtnOutputTSalesmanReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTSalesmanReload();
             }
         });
         this.getBtnOutputTOutletReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTOutletReload();
             }
         });
         this.getBtnOutputTStokReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTStokReload();
             }
         });
         this.getBtnOutputTDatdslReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTDatdslReload();
             }
         });
         this.getBtnOutputTDatdsrReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTDatdsrReload();
             }
         });
         this.getBtnOutputTDatdprReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTDatdprReload();
             }
         });
         this.getBtnOutputTDatsriReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTDatsriReload();
             }
         });
         this.getBtnOutputTAdjstkReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputTAdjstkReload();
             }
         });
         
         this.getBtnMapTipeOutletHapus().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapTipeOutletHapus();
             }
         });
         this.getBtnMapTipeOutletSimpan().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapTipeOutletSimpan();
             }
         });
         this.getBtnMapTipeOutletReload().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnMapTipeOutletReload();
              }

          });
         this.getBtnOutputClientReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputClientReload();
             }
         });
         this.getBtnOutputSalesOrderReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputSalesOrderReload();
             }

         } );
         this.getBtnOutputSalesReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputSalesReload();
             }
         });
         this.getBtnOutputStockReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputStockReload();
             }
         });
         
         //Button Path Input
         this.getBtnPathInputAuto().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputAuto();
              }
          });
         this.getBtnPathInputCvOutlet().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                    aksiBtnPathInputCvOutlet();                  
              }
          });
         this.getBtnPathInputJHeader().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputJHeader();
              }
          });
         this.getBtnPathInputJPcode().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiPathInputJPcode();
              }
          });
         this.getBtnPathInputJTprb().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputJTprb();
              }
          });
         this.getBtnPathInputJTpru().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputJTpru();
              }
          });
         this.getBtnPathInputMaster().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputMaster();
              }
          });
         this.getBtnPathInputOutlet().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputOutlet();
              }
          });
         this.getBtnPathInputSalesman().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputSalesman();
              }
          });
         this.getBtnPathInputStock().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputStock();
              }
          });
    
         this.getBtnPathInputBarangDatang().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnPathInputBarangDatang();
             }
         });
         this.getBtnPathInputReturKePabrik().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnPathInputReturKePabrik();
             }
         });
         this.getBtnPathInputStokAdjustment().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnPathInputStokAdjustment();
             }
         });
                 
         
         this.getBtnRetrieveInputCvOutlet().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputCvOutlet();
              }
          });
         this.getBtnRetrieveInputSalesman().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnRetrieveInputSalesman();
             }
         });
         
         this.getBtnRetrieveInputJHeader().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJHeader();
              }
          });
         this.getBtnRetrieveInputJPcode().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJPcode();
              }
          });
         this.getBtnRetrieveInputJTprb().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJTprb();
              }
          });
         this.getBtnRetrieveInputJTpru().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJTpru();
              }
          });
         this.getBtnRetrieveInputMaster().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputMaster();
              }
          });
         this.getBtnRetrieveInputOutlet().addActionListener(new ActionListener() {
           @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputOutlet();
              }
          });
         this.getBtnRetrieveInputStock().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputStock();
              }
          });
    
         this.getBtnRetrieveInputAll().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputAll();
              }
          });
         //Tambahan Retrieve
         this.getBtnRetrieveInputBarangDatang().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnRetrieveInputBarangDatang();
             }
         });
         this.getBtnRetrieveInputReturKePabrik().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnRetrieveInputReturKePabrik();
             }
         });
         this.getBtnRetrieveInputStokAdjustment().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnRetrieveInputStokAdjustment();
             }
         });
         
         this.getBtnPathInputClearAll().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputClearAll();
              }
          });
         this.getBtnPathInputReloadAll().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputReloadAll();
              }
          });
         this.getBtnKirimByEmail().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnKirimByEmail();
             }
         });
         
         
         //Tabel-Tabel
         this.getBtnTabelKeyAccountSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelKeyAccountSave();
             }
         });
         this.getBtnTabelKeyAccountDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelKeyAccountDelete();
             }
         });         
         this.getBtnTabelOutletGroupSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletGroupSave();
             }
         });
         this.getBtnTabelOutletGroupDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletGroupDelete();
             }
         });
         this.getBtnTabelOutletClassSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletClassSave();
             }
         });
         this.getBtnTabelOutletClassDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletClassDelete();
             }
         });
         this.getBtnTabelOutletSubGroupSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletSubGroupSave();
             }
         });
         this.getBtnTabelOutletSubGroupDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletSubGroupDelete();
             }
         });
         
         this.getBtnTabelOutletChainSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletChainSave();
             }
         });
         this.getBtnTabelOutletChainDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletChainDelete();
             }
         });
         this.getBtnTabelOutletLocationDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletLocationDelete();
             }
         });
         this.getBtnTabelOutletLocationSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletLocationSave();
             }
         });
         this.getBtnTabelOutletTypeDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletTypeDelete();
             }
         });
         this.getBtnTabelOutletTypeSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletTypeSave();
             }
         });
         this.getBtnTabelOutletSizeDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletSizeDelete();
             }
         });
         this.getBtnTabelOutletSizeSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelOutletSizeSave();
             }
         });
         //Tabel-tabel Product
         this.getBtnTabelProdBrandDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdBrandDelete();
             }
         });
         this.getBtnTabelProdBrandSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdBrandSave();
             }
         });
         this.getBtnTabelProdCategDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdCategDelete();
             }
         });
         this.getBtnTabelProdCategSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdCategSave();
             }
         });
         this.getBtnTabelProdDivisiDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdDivisiDelete();
             }
         });
         this.getBtnTabelProdDivisiSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdDivisiSave();
             }
         });
         this.getBtnTabelProdSizeDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdSizeDelete();
             }
         });
         this.getBtnTabelProdSizeSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTAbelProdSizeSave();
             }
         });
         this.getBtnTabelProdSubBrandDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdSubBrandDelete();
             }
         });
         this.getBtnTabelProdSubBrandSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdSubBrandSave();
             }
         });
         this.getBtnTabelProdSubCategDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdSubCategDelete();
             }
         });
         this.getBtnTabelProdSubCategSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdSubCategSave();
             }
         });
         this.getBtnTabelProdVarianceDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdVarianceDelete();
             }
         });
         this.getBtnTabelProdVarianceSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnTabelProdVarianceSave();
             }
         });
         //public void aksiBtnTabelProdVarianceSave(){}
         //public void aksiBtnTabelProdVarianceDelete(){}
         //public void aksiBtnTabelProdSubCategSave(){}
         //public void aksiBtnTabelProdSubCategDelete(){}
         //public void aksiBtnTabelProdSubBrandSave(){}
         //public void aksiBtnTabelProdSubBrandDelete(){}
         //public void aksiBtnTAbelProdSizeSave(){}
         //public void aksiBtnTabelProdSizeDelete(){}
         //public void aksiBtnTabelProdDivisiSave(){}
         //public void aksiBtnTabelProdDivisiDelete(){}
         //public void aksiBtnTabelProdCategSave(){}
         //public void aksiBtnTabelProdCategDelete(){}
         //public void aksiBtnTabelProdBrandSave(){}
         //public void aksiBtnTabelProdBrandDelete(){}
         
         
         //Map Product, Outlet dan Salesman
         this.getBtnMapProductDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapProductDelete();
             }
         });
         this.getBtnMapProductSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapProductSave();
             }
         });
         this.getBtnMapProductSearch().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {             
                 aksiBtnMapProductSearch();
             }
         });
         this.getBtnMapProductReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapProductReload();
             }
         });
         
         this.getBtnMapOutletDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapOutletDelete();
             }
         });
         this.getBtnMapOutletSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapOutletSave();
             }
         });
         this.getBtnMapOutletSearch().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapOutletSearch();
             }
         });
         this.getBtnMapOutletReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapOutletReload();
             }
         });
         this.getBtnMapSalesmanDelete().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapSalesmanDelete();
             }
         });
         this.getBtnMapSalesmanSave().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapSalesmanSave();
             }
         });
        this.getBtnMapSalesmanReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapSalesmanReload();
             }
         });
        
       //Backup and Restore
        this.getBtnBackupAndRestoreBackupPath().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreBackupPath();
             }
         });
        this.getBtnBackupAndRestoreBackupStartBackup().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreBackupStartBackup();
             }
         });
        this.getBtnBackupAndRestoreRestorePath().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreRestorePath();
             }
         });
        this.getBtnBackupAndRestoreRestoreStartRestore().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnBackupAndRestoreStartRestore();
             }
         });
        
        this.getRadioBackupAndRestoreBackupCommaDelimeted().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 getRadioBackupAndRestoreBackupCommaDelimeted().setSelected(true);
                 getRadioBackupAndRestoreBackupTabDelimeted().setSelected(false);
             }
         });
        this.getRadioBackupAndRestoreBackupTabDelimeted().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 getRadioBackupAndRestoreBackupCommaDelimeted().setSelected(false);
                 getRadioBackupAndRestoreBackupTabDelimeted().setSelected(true);                 
             }
         });
        
        
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelTabMasterProduct = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInputMaster = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        btnInputMasterReload = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        btnInputStockReload = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInputStock = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        btnInputOutletReload = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableInputOutlet = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        btnInputCvOutletReload = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableInputCvOutlet = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        btnInputSalesmanReload = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableInputSalesman = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        btnInputJheaderReload = new javax.swing.JButton();
        btnInputJheaderUbah = new javax.swing.JButton();
        btnInputJheaderBaru = new javax.swing.JButton();
        lblInputJHeaderFooterInfo = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableInputJheader = new javax.swing.JTable();
        textInputJHeaderSearchSalesman = new javax.swing.JTextField();
        textInputJHeaderSearchIdOrder = new javax.swing.JTextField();
        btnInputJheaderSearch = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        textInputJHeaderSearchIdOutlet = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        btnInputJpcodeReload = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableInputJpcode = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        btnInputJtprbReload = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableInputJtprb = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        btnInputJtpruReload = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableInputJtpru = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        textDistributorCode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        textRecordTypeSales = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textRecordTypeStock = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textRecordTypeClient = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        textRecordTypeSo = new javax.swing.JTextField();
        jPanel53 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        textWarehouseWarehouseCode = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        textWarehouseWarehouseDescription = new javax.swing.JTextField();
        btnGeneralSettingSimpan = new javax.swing.JButton();
        btnGeneralSettingReload = new javax.swing.JButton();
        jPanel54 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        textEmailFrom = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        textEmailTo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        textEmailSubject = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        textEmailPassword = new javax.swing.JPasswordField();
        jPanel56 = new javax.swing.JPanel();
        checkTprbDiluarBarang = new javax.swing.JCheckBox();
        textDistributorName = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableMappingTipeOutlet = new javax.swing.JTable();
        jPanel42 = new javax.swing.JPanel();
        btnMapTipeOutletSimpan = new javax.swing.JButton();
        btnMapTipeOutletHapus = new javax.swing.JButton();
        btnMapTipeOutletReload = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        textMapTipeOutletIdTypeOutletScy = new javax.swing.JTextField();
        textMapTipeOutletIdTipeOutlet = new javax.swing.JTextField();
        textMapTipeOutletDeskripsi = new javax.swing.JTextField();
        jPanel57 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        checkBackupAndRestoreRestoreTabelTabel = new javax.swing.JCheckBox();
        checkBackupAndRestoreRestoreFileMaster = new javax.swing.JCheckBox();
        textBackupAndRestoreRestorePath = new javax.swing.JTextField();
        btnBackupAndRestoreRestorePath = new javax.swing.JButton();
        btnBackupAndRestoreRestoreStartRestore = new javax.swing.JButton();
        checkBackupAndRestoreRestoreOverwrite = new javax.swing.JCheckBox();
        checkBackupAndRestoreRestoreGantiDenganDataBaru = new javax.swing.JCheckBox();
        jPanel92 = new javax.swing.JPanel();
        checkBackupAndRestoreBackupTabelTabel = new javax.swing.JCheckBox();
        checkBackupRestoreBackupFileMaster = new javax.swing.JCheckBox();
        btnBackupAndRestoreBackupPath = new javax.swing.JButton();
        textBackupAndRestoreBackupPath = new javax.swing.JTextField();
        btnBackupAndRestoreBackupStartBackup = new javax.swing.JButton();
        radioBackupAndRestoreBackupTabDelimeted = new javax.swing.JRadioButton();
        radioBackupAndRestoreBackupCommaDelimeted = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        textPathInputMaster = new javax.swing.JTextField();
        textPathInputStock = new javax.swing.JTextField();
        textPathInputOutlet = new javax.swing.JTextField();
        textPathInputCvOutlet = new javax.swing.JTextField();
        textPathInputSalesman = new javax.swing.JTextField();
        textPathInputJHeader = new javax.swing.JTextField();
        textPathInputJPcode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textPathInputJTprb = new javax.swing.JTextField();
        textPathInputJTpru = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnPathInputMaster = new javax.swing.JButton();
        btnPathInputStock = new javax.swing.JButton();
        btnPathInputOutlet = new javax.swing.JButton();
        btnPathInputCvOutlet = new javax.swing.JButton();
        btnPathInputSalesman = new javax.swing.JButton();
        btnPathInputJHeader = new javax.swing.JButton();
        btnPathInputJPcode = new javax.swing.JButton();
        btnPathInputJTprb = new javax.swing.JButton();
        btnPathInputJTpru = new javax.swing.JButton();
        btnRetrieveInputMaster = new javax.swing.JButton();
        btnRetrieveInputStock = new javax.swing.JButton();
        btnRetrieveInputOutlet = new javax.swing.JButton();
        btnRetrieveInputSalesman = new javax.swing.JButton();
        btnRetrieveInputCvOutlet = new javax.swing.JButton();
        btnRetrieveInputJHeader = new javax.swing.JButton();
        btnRetrieveInputJPcode = new javax.swing.JButton();
        btnRetrieveInputJTprb = new javax.swing.JButton();
        btnRetrieveInputJTpru = new javax.swing.JButton();
        jDateChooseTanggalStock = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/####",'_');
        textPathInputBarangDatang = new javax.swing.JTextField();
        textPathInputReturKePabrik = new javax.swing.JTextField();
        textPathInputStokAdjustment = new javax.swing.JTextField();
        btnPathInputBarangDatang = new javax.swing.JButton();
        btnPathInputReturKePabrik = new javax.swing.JButton();
        btnPathInputStokAdjustment = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btnRetrieveInputBarangDatang = new javax.swing.JButton();
        btnRetrieveInputReturKePabrik = new javax.swing.JButton();
        btnRetrieveInputStokAdjustment = new javax.swing.JButton();
        jDateChooseTanggalStokAdjustment = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/####",'_');
        jPanel20 = new javax.swing.JPanel();
        textPathOutput = new javax.swing.JTextField();
        btnPathOutput = new javax.swing.JButton();
        btnExtractMSlsOut = new javax.swing.JButton();
        btnExtractTAdjStk = new javax.swing.JButton();
        btnExtractTDatdpr = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnExtractAll = new javax.swing.JButton();
        jDateChooserExtract = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/####",'_');
        btnKirimByEmail = new javax.swing.JButton();
        btnExtractTDatdsl = new javax.swing.JButton();
        btnExtractTDatdsr = new javax.swing.JButton();
        btnExtractTDatsri = new javax.swing.JButton();
        btnExtractTStok = new javax.swing.JButton();
        btnExtractMSalesman = new javax.swing.JButton();
        jPanel58 = new javax.swing.JPanel();
        btnPathInputReloadAll = new javax.swing.JButton();
        btnPathInputAuto = new javax.swing.JButton();
        btnPathInputClearAll = new javax.swing.JButton();
        btnRetrieveInputAll = new javax.swing.JButton();
        checkModeDatabase = new javax.swing.JCheckBox();
        jPanel59 = new javax.swing.JPanel();
        jTabbedPaneMapping = new javax.swing.JTabbedPane();
        jPanel61 = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        tableMapProduct = new javax.swing.JTable();
        btnMapProductSave = new javax.swing.JButton();
        btnMapProductDelete = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jPanel87 = new javax.swing.JPanel();
        textMapProductAreaId = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        textMapProductDistributorId = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        textMapProductIdBrgScylla = new javax.swing.JTextField();
        textMapProductIdSap = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        textMapProductNamaBarangSAP = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        comboMapProductDivisi = new javax.swing.JComboBox();
        comboMapProductBrand = new javax.swing.JComboBox();
        comboMapProductSubBrand = new javax.swing.JComboBox();
        comboMapProductCategory = new javax.swing.JComboBox();
        jLabel52 = new javax.swing.JLabel();
        comboMapProductSubCategory = new javax.swing.JComboBox();
        jLabel53 = new javax.swing.JLabel();
        comboMapProductVariance = new javax.swing.JComboBox();
        comboMapProductSize = new javax.swing.JComboBox();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        checkMapProductBaru = new javax.swing.JCheckBox();
        checkMapProductDikirim = new javax.swing.JCheckBox();
        checkMapProductBonus = new javax.swing.JCheckBox();
        checkMapProductAktif = new javax.swing.JCheckBox();
        textMapProductSearchIdBrgScylla = new javax.swing.JTextField();
        textMapProductSearchIdSap = new javax.swing.JTextField();
        textMapProductSearchNamaBarangSAP = new javax.swing.JTextField();
        btnMapProductSearch = new javax.swing.JButton();
        checkMapProductSearchBaruSaja = new javax.swing.JCheckBox();
        btnMapProductReload = new javax.swing.JButton();
        checkMapProductSearchDikirimSaja = new javax.swing.JCheckBox();
        checkMapProductSearchBonusSaja = new javax.swing.JCheckBox();
        checkMapProductSearchAktifSaja = new javax.swing.JCheckBox();
        checkMapProductSearchSemua = new javax.swing.JCheckBox();
        jPanel63 = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        tableMapOutlet = new javax.swing.JTable();
        btnMapOutletSave = new javax.swing.JButton();
        btnMapOutletDelete = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jPanel88 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        textMapOutletMSLOutletCode = new javax.swing.JTextField();
        textMapOutletMSLOutletName = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        comboMapOutletOutletType = new javax.swing.JComboBox();
        comboMapOutletGroupId = new javax.swing.JComboBox();
        jLabel68 = new javax.swing.JLabel();
        comboMapOutletSubGroupId = new javax.swing.JComboBox();
        jLabel69 = new javax.swing.JLabel();
        comboMapOutletClassId = new javax.swing.JComboBox();
        jLabel70 = new javax.swing.JLabel();
        comboMapOutletBSizeId = new javax.swing.JComboBox();
        jLabel71 = new javax.swing.JLabel();
        comboMapOutletLocationId = new javax.swing.JComboBox();
        jLabel72 = new javax.swing.JLabel();
        textMapOutletDistiId = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        comboMapOutletAreaId = new javax.swing.JComboBox();
        jLabel74 = new javax.swing.JLabel();
        comboMapOutletSalesmanCode = new javax.swing.JComboBox();
        jLabel75 = new javax.swing.JLabel();
        comboMapOutletNasionalSalesmanCode = new javax.swing.JComboBox();
        jLabel76 = new javax.swing.JLabel();
        comboMapOutletKeyAccountId = new javax.swing.JComboBox();
        jLabel77 = new javax.swing.JLabel();
        textMapOutletScyOutletCode = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        checkMapOutletBaru = new javax.swing.JCheckBox();
        checkMapOutletDikirim = new javax.swing.JCheckBox();
        checkMapOutletAktif = new javax.swing.JCheckBox();
        textMapOutletSearchMSLOutletCode = new javax.swing.JTextField();
        textMapOutletSearchMSLOutletName = new javax.swing.JTextField();
        btnMapOutletSearch = new javax.swing.JButton();
        checkMapOutletSearchBaruSaja = new javax.swing.JCheckBox();
        btnMapOutletReload = new javax.swing.JButton();
        textMapOutletSearchScyOutletCode = new javax.swing.JTextField();
        checkMapOutletSearchDikirimSaja = new javax.swing.JCheckBox();
        checkMapOutletSearchAktifSaja = new javax.swing.JCheckBox();
        checkMapOutletSearchSemua = new javax.swing.JCheckBox();
        jPanel64 = new javax.swing.JPanel();
        btnMapSalesmanSave = new javax.swing.JButton();
        btnMapSalesmanDelete = new javax.swing.JButton();
        jScrollPane32 = new javax.swing.JScrollPane();
        tableMapSalesman = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jPanel89 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        textMapSalesmanDistributorId = new javax.swing.JTextField();
        textMapSalesmanSalesmanId = new javax.swing.JTextField();
        textMapSalesmanSalesmanName = new javax.swing.JTextField();
        textMapSalesmanCAlamat1 = new javax.swing.JTextField();
        textMapSalesmanCAlamat2 = new javax.swing.JTextField();
        textMapSalesmanCKota = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        textMapSalesmanCTelpon = new javax.swing.JTextField();
        textMapSalesmanKodeLevel = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        textMapSalesmanRTTPCode = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        textMapSalesmanSalesmanIdScylla = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        btnMapSalesmanReload = new javax.swing.JButton();
        jPanel60 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel65 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tableTabelKeyAccount = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        textTabelKeyAccountKodeKa = new javax.swing.JTextField();
        textTabelKeyAccountNama = new javax.swing.JTextField();
        btnTabelKeyAccountSave = new javax.swing.JButton();
        btnTabelKeyAccountDelete = new javax.swing.JButton();
        textTabelKeyAccountKeterangan = new javax.swing.JTextField();
        jPanel90 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        tableTabelOutletGroup = new javax.swing.JTable();
        jScrollPane38 = new javax.swing.JScrollPane();
        tableTabelOutletSubGroup = new javax.swing.JTable();
        textTabelOutletGroupOutletGroupId = new javax.swing.JTextField();
        textTabelOutletGroupOutletGroupNm = new javax.swing.JTextField();
        textTabelOutletSubGroupOutletSubGroupId = new javax.swing.JTextField();
        textTabelOutletSubGroupOutletSubGroupNm = new javax.swing.JTextField();
        btnTabelOutletGroupSave = new javax.swing.JButton();
        btnTabelOutletGroupDelete = new javax.swing.JButton();
        jScrollPane39 = new javax.swing.JScrollPane();
        tableTabelOutletClass = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        textTabelOutletClassOutletClassId = new javax.swing.JTextField();
        textTabelOutletClassOutletClassNm = new javax.swing.JTextField();
        btnTabelOutletClassSave = new javax.swing.JButton();
        btnTabelOutletClassDelete = new javax.swing.JButton();
        btnTabelOutletSubGroupSave = new javax.swing.JButton();
        btnTabelOutletSubGroupDelete = new javax.swing.JButton();
        jPanel66 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tableTabelOutletChain = new javax.swing.JTable();
        textTabelOutletChainKodeChain = new javax.swing.JTextField();
        textTabelOutletChainNamaChain = new javax.swing.JTextField();
        btnTabelOutletChainSave = new javax.swing.JButton();
        btnTabelOutletChainDelete = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tableTabelOutletLocation = new javax.swing.JTable();
        textTabelOutletLocationKodeLokasi = new javax.swing.JTextField();
        textTabelOutletLocationNamaLokasi = new javax.swing.JTextField();
        btnTabelOutletLocationSave = new javax.swing.JButton();
        btnTabelOutletLocationDelete = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tableTabelOutletType = new javax.swing.JTable();
        textTabelOutletTypeKodeType = new javax.swing.JTextField();
        textTabelOutletTypeNamaType = new javax.swing.JTextField();
        btnTabelOutletTypeSave = new javax.swing.JButton();
        btnTabelOutletTypeDelete = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        tableTabelOutletSize = new javax.swing.JTable();
        btnTabelOutletSizeSave = new javax.swing.JButton();
        btnTabelOutletSizeDelete = new javax.swing.JButton();
        textTabelOutletSizeKodeSize = new javax.swing.JTextField();
        textTabelOutletSizelNamaSize = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tableTabelProdBrand = new javax.swing.JTable();
        jScrollPane21 = new javax.swing.JScrollPane();
        tableTabelProdSubBrand = new javax.swing.JTable();
        textTabelProdBrandBrandId = new javax.swing.JTextField();
        textTabelProdBrandBrandNm = new javax.swing.JTextField();
        textTabelProdSubBrandSubBrandId = new javax.swing.JTextField();
        textTabelProdSubBrandSubBrandNm = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        btnTabelProdBrandSave = new javax.swing.JButton();
        btnTabelProdBrandDelete = new javax.swing.JButton();
        btnTabelProdSubBrandSave = new javax.swing.JButton();
        btnTabelProdSubBrandDelete = new javax.swing.JButton();
        jPanel62 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tableTabelProdCateg = new javax.swing.JTable();
        jScrollPane23 = new javax.swing.JScrollPane();
        tableTabelProdSubCateg = new javax.swing.JTable();
        textTabelProdCategCatedId = new javax.swing.JTextField();
        textTabelProdCategCategNm = new javax.swing.JTextField();
        textTabelProdSubCategSubCategId = new javax.swing.JTextField();
        textTabelProdSubCategSubCategNm = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        btnTabelProdCategSave = new javax.swing.JButton();
        btnTabelProdCategDelete = new javax.swing.JButton();
        btnTabelProdSubCategSave = new javax.swing.JButton();
        btnTabelProdSubCategDelete = new javax.swing.JButton();
        jPanel70 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tableTabelProdDivisi = new javax.swing.JTable();
        textTabelProdDivisiDivisiId = new javax.swing.JTextField();
        textTabelProdDivisiDivisiNm = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        btnTabelProdDivisiSave = new javax.swing.JButton();
        btnTabelProdDivisiDelete = new javax.swing.JButton();
        jPanel71 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        tableTabelProdVariance = new javax.swing.JTable();
        textTabelProdVarianceVarianceId = new javax.swing.JTextField();
        textTabelProdVarianceVarianceNm = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        btnTabelProdVarianceSave = new javax.swing.JButton();
        btnTabelProdVarianceDelete = new javax.swing.JButton();
        jPanel72 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tableTabelProdSize = new javax.swing.JTable();
        textTabelProdSizeSizeId = new javax.swing.JTextField();
        textTabelProdSizeSizeNm = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        btnTabelProdSizeSave = new javax.swing.JButton();
        btnTabelProdSizeDelete = new javax.swing.JButton();
        jPanel73 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tableInputBarangDatang = new javax.swing.JTable();
        jPanel76 = new javax.swing.JPanel();
        btnInputBarangDatangReload = new javax.swing.JButton();
        jPanel74 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        btnInputReturKePabrikReload = new javax.swing.JButton();
        jScrollPane28 = new javax.swing.JScrollPane();
        tableInputReturKePabrik = new javax.swing.JTable();
        jPanel75 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        btnInputStockAdjustmentReload = new javax.swing.JButton();
        jScrollPane29 = new javax.swing.JScrollPane();
        tableInputStockAdjustment = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        btnOutputTSalesmanReload = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableOutputTSalesman = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        btnOutputTStokReload = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tableOutputTStok = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        btnOutputTOutletReload = new javax.swing.JButton();
        jPanel49 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tableOutputTOutlet = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        btnOutputTDatdslReload = new javax.swing.JButton();
        lblOutputTDatdslFooterInfo = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tableOutputTDatdsl = new javax.swing.JTable();
        jPanel79 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        btnOutputTDatdsrReload = new javax.swing.JButton();
        lblOutputTDatdsrFooterInfo = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        tableOutputTDatdsr = new javax.swing.JTable();
        jPanel80 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        btnOutputTDatdprReload = new javax.swing.JButton();
        lblOutputTDatdprFooterInfo = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        tableOutputTDatdpr = new javax.swing.JTable();
        jPanel81 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        btnOutputTDatsriReload = new javax.swing.JButton();
        lblOutputTDatsriFooterInfo = new javax.swing.JLabel();
        jScrollPane35 = new javax.swing.JScrollPane();
        tableOutputTDatsri = new javax.swing.JTable();
        jPanel82 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        btnOutputTAdjstkReload = new javax.swing.JButton();
        lblOutputTAdjstkFooterInfo = new javax.swing.JLabel();
        jScrollPane36 = new javax.swing.JScrollPane();
        tableOutputTAdjstk = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputMaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableInputMaster.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tableInputMaster);

        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputMasterReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputMasterReload.setText("Reload");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputMasterReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputMasterReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelTabMasterProductLayout = new javax.swing.GroupLayout(jPanelTabMasterProduct);
        jPanelTabMasterProduct.setLayout(jPanelTabMasterProductLayout);
        jPanelTabMasterProductLayout.setHorizontalGroup(
            jPanelTabMasterProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabMasterProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanelTabMasterProductLayout.setVerticalGroup(
            jPanelTabMasterProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabMasterProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Product", jPanelTabMasterProduct);

        jPanel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputStockReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputStockReload.setText("Reload");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputStockReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputStockReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableInputStock);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Stock", jPanel3);

        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputOutletReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputOutletReload.setText("Reload");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputOutletReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputOutletReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputOutlet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tableInputOutlet);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Outlet", jPanel4);

        jPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputCvOutletReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputCvOutletReload.setText("Reload");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputCvOutletReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputCvOutletReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputCvOutlet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tableInputCvOutlet);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CvOutlet", jPanel5);

        jPanel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputSalesmanReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputSalesmanReload.setText("Reload");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputSalesmanReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(806, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputSalesmanReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputSalesman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tableInputSalesman);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Salesman", jPanel6);

        jPanel33.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputJheaderReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputJheaderReload.setMnemonic('R');
        btnInputJheaderReload.setText("Reload");

        btnInputJheaderUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Modify.png"))); // NOI18N
        btnInputJheaderUbah.setMnemonic('U');
        btnInputJheaderUbah.setText("Ubah");

        btnInputJheaderBaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Create.png"))); // NOI18N
        btnInputJheaderBaru.setMnemonic('B');
        btnInputJheaderBaru.setText("Baru");

        lblInputJHeaderFooterInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInputJHeaderFooterInfo.setText("lblInputJHeaderFooterInfo");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJheaderReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnInputJheaderBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInputJheaderUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addGap(504, 504, 504)
                    .addComponent(lblInputJHeaderFooterInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputJheaderReload)
                    .addComponent(btnInputJheaderUbah)
                    .addComponent(btnInputJheaderBaru))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblInputJHeaderFooterInfo)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputJheader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tableInputJheader);

        textInputJHeaderSearchSalesman.setText("jTextField1");

        textInputJHeaderSearchIdOrder.setText("jTextField1");

        btnInputJheaderSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/search_16x16.png"))); // NOI18N
        btnInputJheaderSearch.setMnemonic('U');
        btnInputJheaderSearch.setText("Saring");

        jLabel84.setText("Id Salesman");

        jLabel85.setText("No Nota/Id Order");

        textInputJHeaderSearchIdOutlet.setText("jTextField1");

        jLabel86.setText("Id Outlet");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textInputJHeaderSearchSalesman, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textInputJHeaderSearchIdOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(textInputJHeaderSearchIdOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(btnInputJheaderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jLabel85)
                    .addComponent(jLabel86))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textInputJHeaderSearchSalesman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textInputJHeaderSearchIdOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInputJheaderSearch)
                    .addComponent(textInputJHeaderSearchIdOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("JHeader", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/List.png")), jPanel7); // NOI18N

        jPanel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputJpcodeReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputJpcodeReload.setText("Reload");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJpcodeReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(813, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJpcodeReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel36.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputJpcode.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tableInputJpcode);

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("JPcode", jPanel14);

        jPanel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputJtprbReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputJtprbReload.setText("Reload");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJtprbReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(794, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJtprbReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel38.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputJtprb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tableInputJtprb);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("JTprb", jPanel15);

        jPanel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputJtpruReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputJtpruReload.setText("Reload");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJtpruReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(800, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJtpruReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputJtpru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(tableInputJtpru);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("JTpru", jPanel16);

        jPanel17.setForeground(new java.awt.Color(255, 0, 0));
        jPanel17.setToolTipText("");
        jPanel17.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel21.setForeground(new java.awt.Color(255, 0, 0));
        jPanel21.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N

        textDistributorCode.setText("jTextField11");

        jLabel11.setText("Distributor Code - Name");

        jPanel52.setBorder(javax.swing.BorderFactory.createTitledBorder("Record Type"));

        textRecordTypeSales.setText("jTextField15");

        jLabel12.setText("Sales");

        jLabel13.setText("Stock");

        textRecordTypeStock.setText("jTextField15");

        jLabel14.setText("Client");

        textRecordTypeClient.setText("jTextField15");

        jLabel15.setText("SO");

        textRecordTypeSo.setText("jTextField15");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textRecordTypeSales, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textRecordTypeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textRecordTypeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textRecordTypeSo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRecordTypeSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRecordTypeStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRecordTypeClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRecordTypeSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel53.setBorder(javax.swing.BorderFactory.createTitledBorder("Warehouse"));

        jLabel16.setText("Warehouse Code");

        textWarehouseWarehouseCode.setText("jTextField15");

        jLabel17.setText("Warehouse Description");

        textWarehouseWarehouseDescription.setText("jTextField15");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textWarehouseWarehouseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textWarehouseWarehouseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textWarehouseWarehouseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textWarehouseWarehouseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGeneralSettingSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnGeneralSettingSimpan.setMnemonic('S');
        btnGeneralSettingSimpan.setText("Simpan");

        btnGeneralSettingReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnGeneralSettingReload.setMnemonic('R');
        btnGeneralSettingReload.setText("Reload");

        jPanel54.setBorder(javax.swing.BorderFactory.createTitledBorder("Email untuk Kirim"));

        jLabel18.setText("From");

        textEmailFrom.setText("jTextField1");

        jLabel19.setText("To");

        textEmailTo.setText("jTextField2");

        jLabel20.setForeground(new java.awt.Color(212, 30, 30));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("EMAIL TO lebih dari 1 addresss gunakan tanda ( ; )");

        jLabel21.setForeground(new java.awt.Color(212, 30, 30));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("contoh: bari@gmail.com; alif@yahoo.com");

        textEmailSubject.setText("jTextField1");

        jLabel22.setText("Subject");

        jLabel28.setText("Password");

        textEmailPassword.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(textEmailSubject))
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textEmailTo))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textEmailFrom)
                            .addComponent(textEmailPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(textEmailFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(textEmailPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmailTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmailSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap())
        );

        jPanel56.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        checkTprbDiluarBarang.setText("Diskon TPRB diluar barang spread satu nota");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(checkTprbDiluarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkTprbDiluarBarang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textDistributorName.setText("jTextField1");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(74, 74, 74)
                            .addComponent(textDistributorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(btnGeneralSettingSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGeneralSettingReload, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textDistributorName))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textDistributorCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDistributorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGeneralSettingSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeneralSettingReload, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("General Setting", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Home.png")), jPanel21); // NOI18N

        jPanel41.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableMappingTipeOutlet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(tableMappingTipeOutlet);

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel42.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMapTipeOutletSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnMapTipeOutletSimpan.setMnemonic('S');
        btnMapTipeOutletSimpan.setText("Simpan");

        btnMapTipeOutletHapus.setMnemonic('H');
        btnMapTipeOutletHapus.setText("Hapus");

        btnMapTipeOutletReload.setMnemonic('R');
        btnMapTipeOutletReload.setText("Reload");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMapTipeOutletSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnMapTipeOutletHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMapTipeOutletReload, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMapTipeOutletSimpan)
                    .addComponent(btnMapTipeOutletHapus)
                    .addComponent(btnMapTipeOutletReload))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel43.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textMapTipeOutletIdTypeOutletScy.setText("jTextField12");

        textMapTipeOutletIdTipeOutlet.setText("jTextField13");

        textMapTipeOutletDeskripsi.setText("jTextField14");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textMapTipeOutletIdTypeOutletScy, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textMapTipeOutletIdTipeOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textMapTipeOutletDeskripsi)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMapTipeOutletIdTypeOutletScy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapTipeOutletIdTipeOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapTipeOutletDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel57.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setForeground(java.awt.Color.red);
        jLabel23.setText("Outlet yang TIPE nya tidak terdaftar disini");

        jLabel24.setForeground(java.awt.Color.red);
        jLabel24.setText("TIDAK AKAN DIPROSES");

        jLabel25.setForeground(java.awt.Color.red);
        jLabel25.setText("JADI:");

        jLabel26.setForeground(java.awt.Color.red);
        jLabel26.setText("PASTIKAN SEMUA TIPE SUDAH CATAT DISINI");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane4.addTab("Map  Tipe Outlet", jPanel22);

        jPanel2.setForeground(new java.awt.Color(255, 200, 0));

        jPanel91.setBorder(javax.swing.BorderFactory.createTitledBorder("Restore"));

        checkBackupAndRestoreRestoreTabelTabel.setSelected(true);
        checkBackupAndRestoreRestoreTabelTabel.setText("Tabel-tabel");

        checkBackupAndRestoreRestoreFileMaster.setSelected(true);
        checkBackupAndRestoreRestoreFileMaster.setText("File Master");

        textBackupAndRestoreRestorePath.setText("jTextField2");

        btnBackupAndRestoreRestorePath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnBackupAndRestoreRestoreStartRestore.setText("Start Restore");

        checkBackupAndRestoreRestoreOverwrite.setBackground(new java.awt.Color(255, 0, 0));
        checkBackupAndRestoreRestoreOverwrite.setText("Overwrite/Timpa data yang sudah ada");

        checkBackupAndRestoreRestoreGantiDenganDataBaru.setText("Ganti dengan data baru");

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel91Layout.createSequentialGroup()
                        .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBackupAndRestoreRestoreTabelTabel)
                            .addComponent(checkBackupAndRestoreRestoreFileMaster))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel91Layout.createSequentialGroup()
                        .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel91Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBackupAndRestoreRestoreStartRestore))
                            .addGroup(jPanel91Layout.createSequentialGroup()
                                .addComponent(textBackupAndRestoreRestorePath)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBackupAndRestoreRestorePath)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel91Layout.createSequentialGroup()
                        .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBackupAndRestoreRestoreGantiDenganDataBaru)
                            .addComponent(checkBackupAndRestoreRestoreOverwrite))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBackupAndRestoreRestoreTabelTabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBackupAndRestoreRestoreFileMaster)
                .addGap(18, 18, 18)
                .addComponent(checkBackupAndRestoreRestoreOverwrite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(checkBackupAndRestoreRestoreGantiDenganDataBaru)
                .addGap(18, 18, 18)
                .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBackupAndRestoreRestorePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackupAndRestoreRestorePath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBackupAndRestoreRestoreStartRestore))
        );

        jPanel92.setBorder(javax.swing.BorderFactory.createTitledBorder("Backup"));

        checkBackupAndRestoreBackupTabelTabel.setSelected(true);
        checkBackupAndRestoreBackupTabelTabel.setText("Tabel-tabel");

        checkBackupRestoreBackupFileMaster.setSelected(true);
        checkBackupRestoreBackupFileMaster.setText("File Master (Product, Outlet, Salesman)");

        btnBackupAndRestoreBackupPath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        textBackupAndRestoreBackupPath.setText("jTextField1");

        btnBackupAndRestoreBackupStartBackup.setText("Start Backup");

        radioBackupAndRestoreBackupTabDelimeted.setText("Tab Delimeted");

        radioBackupAndRestoreBackupCommaDelimeted.setText("( , ) Comma Delimeted");

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel92Layout.createSequentialGroup()
                        .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBackupAndRestoreBackupTabelTabel)
                            .addComponent(checkBackupRestoreBackupFileMaster))
                        .addGap(0, 248, Short.MAX_VALUE))
                    .addGroup(jPanel92Layout.createSequentialGroup()
                        .addComponent(textBackupAndRestoreBackupPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBackupAndRestoreBackupPath))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                        .addComponent(radioBackupAndRestoreBackupTabDelimeted)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBackupAndRestoreBackupCommaDelimeted)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackupAndRestoreBackupStartBackup)))
                .addContainerGap())
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBackupAndRestoreBackupTabelTabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBackupRestoreBackupFileMaster)
                .addGap(18, 18, 18)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackupAndRestoreBackupPath)
                    .addComponent(textBackupAndRestoreBackupPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackupAndRestoreBackupStartBackup)
                    .addComponent(radioBackupAndRestoreBackupTabDelimeted)
                    .addComponent(radioBackupAndRestoreBackupCommaDelimeted)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(540, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Backup and Restore", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png")), jPanel2); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Konfigurasi  & Utilities", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Equipment.png")), jPanel17, ""); // NOI18N

        jPanel18.setForeground(new java.awt.Color(0, 255, 0));
        jPanel18.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Input dari Scylla"));

        textPathInputMaster.setText("jTextField1");

        textPathInputStock.setText("jTextField2");

        textPathInputOutlet.setText("jTextField3");

        textPathInputCvOutlet.setText("jTextField4");

        textPathInputSalesman.setText("Salesman");

        textPathInputJHeader.setText("jTextField6");

        textPathInputJPcode.setText("jTextField7");

        jLabel1.setText("1. Produk (MSPCODE.TXT)");

        jLabel2.setText("9. Stock (STOCK.TXT)");

        jLabel3.setText("2. Salesman (SALESMAN.TXT)");

        jLabel4.setText("3. Outlet (MSOUTLET.TXT)");

        jLabel5.setText("4. CvOutlet");

        jLabel6.setText("5. JHeader (JHEADER.TXT)");

        jLabel7.setText("6. JPcode (JPCODE.TXT)");

        textPathInputJTprb.setText("jTextField8");

        textPathInputJTpru.setText("jTextField9");

        jLabel8.setText("7. JTprb (JTPRB.TXT)");

        jLabel9.setText("8. JTpru (JTPRU.TXT)");

        btnPathInputMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N
        btnPathInputMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathInputMasterActionPerformed(evt);
            }
        });

        btnPathInputStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputOutlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputCvOutlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputSalesman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputJHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputJPcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputJTprb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputJTpru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnRetrieveInputMaster.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputMaster.setText("1. Retrieve");
        btnRetrieveInputMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveInputMasterActionPerformed(evt);
            }
        });

        btnRetrieveInputStock.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputStock.setText("9. Retrieve");

        btnRetrieveInputOutlet.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputOutlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputOutlet.setText("3. Retrieve");

        btnRetrieveInputSalesman.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputSalesman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputSalesman.setText("2. Retrieve");

        btnRetrieveInputCvOutlet.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputCvOutlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputCvOutlet.setText("4. Retrieve");

        btnRetrieveInputJHeader.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputJHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputJHeader.setText("5. Retrieve");

        btnRetrieveInputJPcode.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputJPcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputJPcode.setText("6. Retrieve");

        btnRetrieveInputJTprb.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputJTprb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputJTprb.setText("7. Retrieve");

        btnRetrieveInputJTpru.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputJTpru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputJTpru.setText("8. Retrieve");
        btnRetrieveInputJTpru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveInputJTpruActionPerformed(evt);
            }
        });

        jDateChooseTanggalStock.setDateFormatString("dd/MM/yyyy");

        textPathInputBarangDatang.setText("jTextField1");

        textPathInputReturKePabrik.setText("jTextField2");

        textPathInputStokAdjustment.setText("jTextField3");

        btnPathInputBarangDatang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputReturKePabrik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputStokAdjustment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        jLabel27.setText("10. Brg Datang (BD.TXT)");

        jLabel34.setText("11. Retur Ke Pabrik(RTR.TXT)");

        jLabel35.setText("12. Stok Adjustmen(ADJ.TXT)");

        btnRetrieveInputBarangDatang.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputBarangDatang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputBarangDatang.setText("10. Retrieve");

        btnRetrieveInputReturKePabrik.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputReturKePabrik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputReturKePabrik.setText("11. Retrieve");

        btnRetrieveInputStokAdjustment.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetrieveInputStokAdjustment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputStokAdjustment.setText("12. Retrieve");

        jDateChooseTanggalStokAdjustment.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel27)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addComponent(textPathInputStock, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooseTanggalStock, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textPathInputJTprb)
                            .addComponent(textPathInputJPcode)
                            .addComponent(textPathInputJHeader)
                            .addComponent(textPathInputCvOutlet)
                            .addComponent(textPathInputOutlet)
                            .addComponent(textPathInputSalesman)
                            .addComponent(textPathInputMaster)
                            .addComponent(textPathInputJTpru, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPathInputMaster)
                            .addComponent(btnPathInputOutlet)
                            .addComponent(btnPathInputCvOutlet)
                            .addComponent(btnPathInputSalesman)
                            .addComponent(btnPathInputJHeader)
                            .addComponent(btnPathInputJPcode)
                            .addComponent(btnPathInputJTprb)
                            .addComponent(btnPathInputJTpru)
                            .addComponent(btnPathInputStock, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetrieveInputStock)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRetrieveInputMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetrieveInputJHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetrieveInputJPcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetrieveInputJTprb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetrieveInputJTpru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetrieveInputSalesman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetrieveInputOutlet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetrieveInputCvOutlet))))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addComponent(textPathInputStokAdjustment, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooseTanggalStokAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textPathInputBarangDatang)
                            .addComponent(textPathInputReturKePabrik))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(btnPathInputStokAdjustment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRetrieveInputStokAdjustment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(btnPathInputReturKePabrik)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRetrieveInputReturKePabrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(btnPathInputBarangDatang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRetrieveInputBarangDatang)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPathInputMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPathInputSalesman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPathInputOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPathInputCvOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textPathInputJHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textPathInputJPcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textPathInputJTprb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textPathInputJTpru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textPathInputStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jDateChooseTanggalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPathInputMaster)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnRetrieveInputMaster)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPathInputOutlet)
                            .addComponent(btnRetrieveInputSalesman))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(btnPathInputCvOutlet)
                                .addGap(7, 7, 7)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRetrieveInputCvOutlet)
                                    .addComponent(btnPathInputSalesman))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPathInputJHeader)
                                    .addComponent(btnRetrieveInputJHeader))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(btnPathInputJPcode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPathInputJTprb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPathInputJTpru))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(btnRetrieveInputJPcode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRetrieveInputJTprb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRetrieveInputJTpru))))
                            .addComponent(btnRetrieveInputOutlet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPathInputStock)
                            .addComponent(btnRetrieveInputStock))
                        .addGap(5, 5, 5)))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPathInputBarangDatang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27))
                    .addComponent(btnPathInputBarangDatang)
                    .addComponent(btnRetrieveInputBarangDatang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPathInputReturKePabrik)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPathInputReturKePabrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34))
                    .addComponent(btnRetrieveInputReturKePabrik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPathInputStokAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPathInputStokAdjustment)
                            .addComponent(btnRetrieveInputStokAdjustment)
                            .addComponent(jDateChooseTanggalStokAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textPathOutput.setText("jTextField10");

        btnPathOutput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download_16x16.png"))); // NOI18N

        btnExtractMSlsOut.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractMSlsOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractMSlsOut.setText("Mslout");

        btnExtractTAdjStk.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTAdjStk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTAdjStk.setText("TAdjstk");

        btnExtractTDatdpr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTDatdpr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTDatdpr.setText("TDatdpr");

        jLabel10.setText("Path");

        btnExtractAll.setText("Extract All");

        jDateChooserExtract.setDateFormatString("dd/MM/yyyy");

        btnKirimByEmail.setText("Kirim By Email");
        btnKirimByEmail.setEnabled(false);

        btnExtractTDatdsl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTDatdsl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTDatdsl.setText("TDatdsl");

        btnExtractTDatdsr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTDatdsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTDatdsr.setText("TDatdsr");

        btnExtractTDatsri.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTDatsri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTDatsri.setText("TDatsri");

        btnExtractTStok.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractTStok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractTStok.setText("TStok");

        btnExtractMSalesman.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExtractMSalesman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractMSalesman.setText("Msalesman");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExtractMSalesman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractMSlsOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPathOutput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPathOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(btnExtractTAdjStk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTDatdpr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jDateChooserExtract, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(btnExtractTDatdsl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTDatdsr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTDatsri, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTStok, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(btnExtractAll, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKirimByEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPathOutput)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExtractAll)
                            .addComponent(btnKirimByEmail))
                        .addComponent(jDateChooserExtract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPathOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExtractMSlsOut)
                    .addComponent(btnExtractTAdjStk)
                    .addComponent(btnExtractTDatdpr)
                    .addComponent(btnExtractTDatdsl)
                    .addComponent(btnExtractTDatdsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExtractTDatsri)
                    .addComponent(btnExtractTStok)
                    .addComponent(btnExtractMSalesman)))
        );

        jPanel58.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPathInputReloadAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnPathInputReloadAll.setText("Reload All");

        btnPathInputAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N
        btnPathInputAuto.setText("Auto Path");

        btnPathInputClearAll.setFont(new java.awt.Font("Lucida Grande", 3, 10)); // NOI18N
        btnPathInputClearAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnPathInputClearAll.setText("Clear All");

        btnRetrieveInputAll.setFont(new java.awt.Font("Lucida Grande", 3, 10)); // NOI18N
        btnRetrieveInputAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputAll.setText("Retrieve All");
        btnRetrieveInputAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveInputAllActionPerformed(evt);
            }
        });

        checkModeDatabase.setText("MODE DB");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addComponent(checkModeDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnPathInputReloadAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetrieveInputAll, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(btnPathInputClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPathInputAuto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPathInputReloadAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPathInputClearAll)
                .addGap(55, 55, 55)
                .addComponent(btnPathInputAuto)
                .addGap(56, 56, 56)
                .addComponent(btnRetrieveInputAll)
                .addGap(32, 32, 32)
                .addComponent(checkModeDatabase)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        jTabbedPane1.addTab("Retrieve And Extract KEK", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Load.png")), jPanel18); // NOI18N

        jPanel59.setForeground(new java.awt.Color(0, 0, 255));

        jTabbedPaneMapping.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        tableMapProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane30.setViewportView(tableMapProduct);

        btnMapProductSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnMapProductSave.setMnemonic('S');
        btnMapProductSave.setText("Save");

        btnMapProductDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnMapProductDelete.setMnemonic('D');
        btnMapProductDelete.setText("Delete");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("MAP PRODUCT");

        jPanel87.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textMapProductAreaId.setText("jTextField14");

        jLabel44.setText("Area ID");

        textMapProductDistributorId.setText("jTextField15");

        jLabel45.setText("Distributor ID");

        textMapProductIdBrgScylla.setBackground(new java.awt.Color(0, 255, 51));
        textMapProductIdBrgScylla.setText("jTextField16");

        textMapProductIdSap.setText("jTextField17");

        jLabel46.setText("Divisi");

        jLabel47.setText("Brand");

        jLabel48.setText("Sub Brand");

        textMapProductNamaBarangSAP.setText("jTextField18");

        jLabel49.setText("ID Brg Scylla");

        jLabel50.setText("ID SAP");

        jLabel51.setText("Nama Barang SAP");

        comboMapProductDivisi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboMapProductBrand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboMapProductSubBrand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboMapProductCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel52.setText("Category");

        comboMapProductSubCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel53.setText("Sub Category");

        comboMapProductVariance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboMapProductSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel54.setText("Variance");

        jLabel55.setText("Size");

        checkMapProductBaru.setText("Baru");

        checkMapProductDikirim.setText("Di Kirim");

        checkMapProductBonus.setText("Bonus");

        checkMapProductAktif.setText("Aktif");

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMapProductSubBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMapProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMapProductSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboMapProductVariance, javax.swing.GroupLayout.Alignment.LEADING, 0, 121, Short.MAX_VALUE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55)
                                    .addGroup(jPanel87Layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(101, 101, 101)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addComponent(comboMapProductSize, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkMapProductBaru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkMapProductDikirim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkMapProductBonus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkMapProductAktif))))
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(textMapProductAreaId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textMapProductDistributorId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(textMapProductIdBrgScylla, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addComponent(textMapProductIdSap, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(textMapProductNamaBarangSAP, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboMapProductDivisi, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboMapProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel87Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textMapProductAreaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMapProductDistributorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMapProductIdBrgScylla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMapProductIdSap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMapProductNamaBarangSAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboMapProductDivisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMapProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMapProductSubBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMapProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMapProductSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMapProductVariance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMapProductSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMapProductBaru)
                    .addComponent(checkMapProductDikirim)
                    .addComponent(checkMapProductBonus)
                    .addComponent(checkMapProductAktif))
                .addGap(16, 16, 16))
        );

        textMapProductSearchIdBrgScylla.setBackground(new java.awt.Color(51, 255, 51));
        textMapProductSearchIdBrgScylla.setText("jTextField21");

        textMapProductSearchIdSap.setText("jTextField22");

        textMapProductSearchNamaBarangSAP.setText("jTextField23");

        btnMapProductSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/search_16x16.png"))); // NOI18N
        btnMapProductSearch.setMnemonic('F');
        btnMapProductSearch.setText("Filter");

        checkMapProductSearchBaruSaja.setText("Baru");
        checkMapProductSearchBaruSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMapProductSearchBaruSajaActionPerformed(evt);
            }
        });

        btnMapProductReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnMapProductReload.setMnemonic('R');
        btnMapProductReload.setText("Reload");

        checkMapProductSearchDikirimSaja.setText("Di Kirim");
        checkMapProductSearchDikirimSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMapProductSearchDikirimSajaActionPerformed(evt);
            }
        });

        checkMapProductSearchBonusSaja.setText("Bonus");
        checkMapProductSearchBonusSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMapProductSearchBonusSajaActionPerformed(evt);
            }
        });

        checkMapProductSearchAktifSaja.setText("Aktif");
        checkMapProductSearchAktifSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMapProductSearchAktifSajaActionPerformed(evt);
            }
        });

        checkMapProductSearchSemua.setText("Semua");
        checkMapProductSearchSemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMapProductSearchSemuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(btnMapProductSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMapProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(615, 615, 615)
                        .addComponent(btnMapProductReload, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(textMapProductSearchIdBrgScylla, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMapProductSearchIdSap, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMapProductSearchNamaBarangSAP, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(checkMapProductSearchSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMapProductSearchBaruSaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMapProductSearchDikirimSaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkMapProductSearchBonusSaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMapProductSearchAktifSaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMapProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane30)
                    .addComponent(jPanel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapProductSearchIdBrgScylla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapProductSearchIdSap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapProductSearchNamaBarangSAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMapProductSearch)
                    .addComponent(checkMapProductSearchBaruSaja)
                    .addComponent(checkMapProductSearchDikirimSaja)
                    .addComponent(checkMapProductSearchBonusSaja)
                    .addComponent(checkMapProductSearchAktifSaja)
                    .addComponent(checkMapProductSearchSemua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMapProductDelete)
                        .addComponent(btnMapProductReload))
                    .addComponent(btnMapProductSave))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPaneMapping.addTab("Map Product", jPanel61);

        tableMapOutlet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane31.setViewportView(tableMapOutlet);

        btnMapOutletSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnMapOutletSave.setMnemonic('S');
        btnMapOutletSave.setText("Save");

        btnMapOutletDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnMapOutletDelete.setMnemonic('D');
        btnMapOutletDelete.setText("Delete");

        jLabel42.setBackground(new java.awt.Color(0, 0, 255));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("MAP OUTLET");

        jPanel88.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel65.setText("MSLOutlet Code");

        textMapOutletMSLOutletCode.setText("jTextField24");

        textMapOutletMSLOutletName.setText("jTextField25");

        jLabel66.setText("MSLOutlet Name");

        jLabel67.setText("Outlet Type");

        comboMapOutletOutletType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboMapOutletGroupId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel68.setText("Group ID");

        comboMapOutletSubGroupId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel69.setText("Sub Group ID");

        comboMapOutletClassId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel70.setText("Class ID");

        comboMapOutletBSizeId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel71.setText("BSize ID");

        comboMapOutletLocationId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel72.setText("Location ID");

        textMapOutletDistiId.setText("jTextField26");

        jLabel73.setText("Distributor ID");

        comboMapOutletAreaId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel74.setText("Area ID");

        comboMapOutletSalesmanCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel75.setText("Salesman Code");

        comboMapOutletNasionalSalesmanCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel76.setText("Nas Salesman Code");

        comboMapOutletKeyAccountId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel77.setText("Key Account ID");

        textMapOutletScyOutletCode.setBackground(java.awt.Color.green);
        textMapOutletScyOutletCode.setText("jTextField24");

        jLabel82.setText("Scy Outlet Code");

        checkMapOutletBaru.setText("Baru");

        checkMapOutletDikirim.setText("Dikirim");

        checkMapOutletAktif.setText("Aktif");

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel88Layout.createSequentialGroup()
                        .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(comboMapOutletClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textMapOutletDistiId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel88Layout.createSequentialGroup()
                                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboMapOutletBSizeId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel71))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboMapOutletLocationId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel72))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboMapOutletAreaId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel74))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboMapOutletSalesmanCode, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel75))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel76)
                                    .addComponent(comboMapOutletNasionalSalesmanCode, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel77)
                                    .addComponent(comboMapOutletKeyAccountId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel88Layout.createSequentialGroup()
                                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMapOutletScyOutletCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel88Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel65)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel66))
                                    .addGroup(jPanel88Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(textMapOutletMSLOutletCode, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textMapOutletMSLOutletName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboMapOutletOutletType, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel67))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboMapOutletGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel68))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboMapOutletSubGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69)))))
                    .addGroup(jPanel88Layout.createSequentialGroup()
                        .addComponent(checkMapOutletBaru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkMapOutletDikirim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMapOutletAktif)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel73)
                    .addComponent(jLabel82))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMapOutletMSLOutletCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapOutletMSLOutletName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMapOutletOutletType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMapOutletGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMapOutletSubGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapOutletDistiId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapOutletScyOutletCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel88Layout.createSequentialGroup()
                        .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72)
                            .addComponent(jLabel74)
                            .addComponent(jLabel75)
                            .addComponent(jLabel76)
                            .addComponent(jLabel77))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboMapOutletBSizeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMapOutletLocationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMapOutletAreaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMapOutletSalesmanCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMapOutletNasionalSalesmanCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMapOutletKeyAccountId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel88Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboMapOutletClassId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkMapOutletBaru)
                    .addComponent(checkMapOutletDikirim)
                    .addComponent(checkMapOutletAktif))
                .addContainerGap())
        );

        textMapOutletSearchMSLOutletCode.setText("jTextField19");

        textMapOutletSearchMSLOutletName.setText("jTextField20");

        btnMapOutletSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/search_16x16.png"))); // NOI18N
        btnMapOutletSearch.setMnemonic('F');
        btnMapOutletSearch.setText("Filter");

        checkMapOutletSearchBaruSaja.setText("Baru");
        checkMapOutletSearchBaruSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMapOutletSearchBaruSajaActionPerformed(evt);
            }
        });

        btnMapOutletReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnMapOutletReload.setMnemonic('R');
        btnMapOutletReload.setText("Reload");

        textMapOutletSearchScyOutletCode.setBackground(java.awt.Color.green);
        textMapOutletSearchScyOutletCode.setText("jTextField19");

        checkMapOutletSearchDikirimSaja.setText("Dikirim");
        checkMapOutletSearchDikirimSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMapOutletSearchDikirimSajaActionPerformed(evt);
            }
        });

        checkMapOutletSearchAktifSaja.setText("Aktif");
        checkMapOutletSearchAktifSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMapOutletSearchAktifSajaActionPerformed(evt);
            }
        });

        checkMapOutletSearchSemua.setText("Semua");
        checkMapOutletSearchSemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMapOutletSearchSemuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addComponent(btnMapOutletSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMapOutletDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMapOutletReload, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(textMapOutletSearchScyOutletCode, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMapOutletSearchMSLOutletCode, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMapOutletSearchMSLOutletName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkMapOutletSearchSemua)
                        .addGap(27, 27, 27)
                        .addComponent(checkMapOutletSearchBaruSaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMapOutletSearchDikirimSaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMapOutletSearchAktifSaja)
                        .addGap(18, 18, 18)
                        .addComponent(btnMapOutletSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapOutletSearchMSLOutletCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapOutletSearchMSLOutletName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMapOutletSearch)
                    .addComponent(checkMapOutletSearchBaruSaja)
                    .addComponent(textMapOutletSearchScyOutletCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMapOutletSearchDikirimSaja)
                    .addComponent(checkMapOutletSearchAktifSaja)
                    .addComponent(checkMapOutletSearchSemua))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMapOutletDelete)
                        .addComponent(btnMapOutletReload))
                    .addComponent(btnMapOutletSave))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPaneMapping.addTab("Map Outlet", jPanel63);

        btnMapSalesmanSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnMapSalesmanSave.setMnemonic('S');
        btnMapSalesmanSave.setText("Save");

        btnMapSalesmanDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnMapSalesmanDelete.setMnemonic('D');
        btnMapSalesmanDelete.setText("Delete");

        tableMapSalesman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane32.setViewportView(tableMapSalesman);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("MAP SALESMAN");

        jPanel89.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel56.setText("Dist Code");

        jLabel57.setText("Sales ID SAP");

        jLabel58.setText("Sales Name SAP");

        textMapSalesmanDistributorId.setText("jTextField4");

        textMapSalesmanSalesmanId.setText("jTextField5");

        textMapSalesmanSalesmanName.setText("jTextField6");

        textMapSalesmanCAlamat1.setText("jTextField7");

        textMapSalesmanCAlamat2.setText("jTextField8");

        textMapSalesmanCKota.setText("jTextField9");

        jLabel59.setText("CAlamat1");

        jLabel60.setText("CAlamat2");

        jLabel61.setText("CKota");

        textMapSalesmanCTelpon.setText("jTextField10");

        textMapSalesmanKodeLevel.setText("jTextField11");

        jLabel62.setText("CTelpon");

        textMapSalesmanRTTPCode.setText("jTextField12");

        jLabel63.setText("Kode Level");

        jLabel64.setText("RTTP");

        textMapSalesmanSalesmanIdScylla.setBackground(java.awt.Color.green);
        textMapSalesmanSalesmanIdScylla.setText("jTextField5");

        jLabel83.setText("Sls ID Scylla");

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(textMapSalesmanDistributorId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textMapSalesmanSalesmanIdScylla, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMapSalesmanSalesmanId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapSalesmanSalesmanName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(textMapSalesmanCAlamat1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addComponent(textMapSalesmanCAlamat2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMapSalesmanCKota, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMapSalesmanCTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addComponent(textMapSalesmanKodeLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addComponent(textMapSalesmanRTTPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64)
                    .addComponent(jLabel83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMapSalesmanDistributorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapSalesmanSalesmanId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapSalesmanSalesmanName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapSalesmanCAlamat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapSalesmanCAlamat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapSalesmanCKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapSalesmanCTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapSalesmanKodeLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapSalesmanRTTPCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapSalesmanSalesmanIdScylla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnMapSalesmanReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnMapSalesmanReload.setMnemonic('R');
        btnMapSalesmanReload.setText("Reload");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel64Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane32)
                            .addGroup(jPanel64Layout.createSequentialGroup()
                                .addComponent(btnMapSalesmanSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMapSalesmanDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMapSalesmanReload, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel64Layout.createSequentialGroup()
                        .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMapSalesmanDelete)
                        .addComponent(btnMapSalesmanReload))
                    .addComponent(btnMapSalesmanSave))
                .addGap(35, 35, 35))
        );

        jTabbedPaneMapping.addTab("Map Salesman", jPanel64);

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneMapping, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jTabbedPaneMapping, javax.swing.GroupLayout.PREFERRED_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Mapping Master", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Database.png")), jPanel59); // NOI18N

        jPanel60.setForeground(new java.awt.Color(0, 0, 255));

        jTabbedPane5.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        tableTabelKeyAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane15.setViewportView(tableTabelKeyAccount);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("KEY ACCOUNT");

        textTabelKeyAccountKodeKa.setText("jTextField1");

        textTabelKeyAccountNama.setText("jTextField2");

        btnTabelKeyAccountSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelKeyAccountSave.setMnemonic('S');
        btnTabelKeyAccountSave.setText("Save");

        btnTabelKeyAccountDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelKeyAccountDelete.setMnemonic('D');
        btnTabelKeyAccountDelete.setText("Delete");

        textTabelKeyAccountKeterangan.setText("jTextField3");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addComponent(jScrollPane15)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addComponent(textTabelKeyAccountKodeKa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelKeyAccountNama, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelKeyAccountKeterangan, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTabelKeyAccountSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTabelKeyAccountDelete)))
                .addContainerGap())
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelKeyAccountKodeKa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelKeyAccountNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelKeyAccountDelete)
                    .addComponent(btnTabelKeyAccountSave)
                    .addComponent(textTabelKeyAccountKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Key Account", jPanel65);

        jLabel78.setBackground(new java.awt.Color(255, 51, 0));
        jLabel78.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("OUTLET CLASS, GROUP & SUB GROUP");

        tableTabelOutletGroup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane37.setViewportView(tableTabelOutletGroup);

        tableTabelOutletSubGroup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane38.setViewportView(tableTabelOutletSubGroup);

        textTabelOutletGroupOutletGroupId.setText("jTextField4");

        textTabelOutletGroupOutletGroupNm.setText("jTextField5");

        textTabelOutletSubGroupOutletSubGroupId.setText("jTextField6");

        textTabelOutletSubGroupOutletSubGroupNm.setText("jTextField7");

        btnTabelOutletGroupSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelOutletGroupSave.setText("Save");

        btnTabelOutletGroupDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelOutletGroupDelete.setText("Delete");

        tableTabelOutletClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane39.setViewportView(tableTabelOutletClass);

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("OUTLET CLASS");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("GROUP");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("SUB GROUP");

        textTabelOutletClassOutletClassId.setText("jTextField4");

        textTabelOutletClassOutletClassNm.setText("jTextField5");

        btnTabelOutletClassSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelOutletClassSave.setText("Save");

        btnTabelOutletClassDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelOutletClassDelete.setText("Delete");

        btnTabelOutletSubGroupSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelOutletSubGroupSave.setText("Save");

        btnTabelOutletSubGroupDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelOutletSubGroupDelete.setText("Delete");

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel90Layout.createSequentialGroup()
                                .addComponent(textTabelOutletClassOutletClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTabelOutletClassOutletClassNm, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel90Layout.createSequentialGroup()
                                .addComponent(textTabelOutletGroupOutletGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTabelOutletGroupOutletGroupNm, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel90Layout.createSequentialGroup()
                                .addComponent(btnTabelOutletGroupSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTabelOutletGroupDelete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel90Layout.createSequentialGroup()
                                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTabelOutletSubGroupSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textTabelOutletSubGroupOutletSubGroupId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textTabelOutletSubGroupOutletSubGroupNm, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTabelOutletSubGroupDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addComponent(btnTabelOutletClassSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTabelOutletClassDelete)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTabelOutletClassOutletClassId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTabelOutletClassOutletClassNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTabelOutletClassSave)
                            .addComponent(btnTabelOutletClassDelete))
                        .addGap(12, 12, 12)))
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelOutletGroupOutletGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelOutletGroupOutletGroupNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelOutletSubGroupOutletSubGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelOutletSubGroupOutletSubGroupNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTabelOutletGroupSave)
                    .addComponent(btnTabelOutletGroupDelete)
                    .addComponent(btnTabelOutletSubGroupSave)
                    .addComponent(btnTabelOutletSubGroupDelete))
                .addGap(39, 39, 39))
        );

        jTabbedPane5.addTab("Outlet Class Group & Sub", jPanel90);

        tableTabelOutletChain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane16.setViewportView(tableTabelOutletChain);

        textTabelOutletChainKodeChain.setText("jTextField1");

        textTabelOutletChainNamaChain.setText("jTextField2");

        btnTabelOutletChainSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelOutletChainSave.setMnemonic('S');
        btnTabelOutletChainSave.setText("Save");

        btnTabelOutletChainDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelOutletChainDelete.setMnemonic('D');
        btnTabelOutletChainDelete.setText("Delete");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("OUTLET CHAIN");

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addComponent(textTabelOutletChainKodeChain, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelOutletChainNamaChain, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addComponent(btnTabelOutletChainSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTabelOutletChainDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelOutletChainKodeChain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelOutletChainNamaChain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelOutletChainDelete)
                    .addComponent(btnTabelOutletChainSave))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Outlet Chain", jPanel66);

        tableTabelOutletLocation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane17.setViewportView(tableTabelOutletLocation);

        textTabelOutletLocationKodeLokasi.setText("jTextField1");

        textTabelOutletLocationNamaLokasi.setText("jTextField2");

        btnTabelOutletLocationSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelOutletLocationSave.setMnemonic('S');
        btnTabelOutletLocationSave.setText("Save");

        btnTabelOutletLocationDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelOutletLocationDelete.setMnemonic('D');
        btnTabelOutletLocationDelete.setText("Delete");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("OUTLET LOCATION");

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel67Layout.createSequentialGroup()
                        .addComponent(textTabelOutletLocationKodeLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelOutletLocationNamaLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addComponent(btnTabelOutletLocationSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTabelOutletLocationDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTabelOutletLocationDelete)
                        .addComponent(btnTabelOutletLocationSave))
                    .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textTabelOutletLocationKodeLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textTabelOutletLocationNamaLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Outlet Location", jPanel67);

        tableTabelOutletType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane18.setViewportView(tableTabelOutletType);

        textTabelOutletTypeKodeType.setText("jTextField1");

        textTabelOutletTypeNamaType.setText("jTextField2");

        btnTabelOutletTypeSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelOutletTypeSave.setMnemonic('S');
        btnTabelOutletTypeSave.setText("Save");

        btnTabelOutletTypeDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelOutletTypeDelete.setMnemonic('D');
        btnTabelOutletTypeDelete.setText("Delete");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("OUTLET TYPE");

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addComponent(textTabelOutletTypeKodeType, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelOutletTypeNamaType, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                        .addComponent(btnTabelOutletTypeSave, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTabelOutletTypeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelOutletTypeKodeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelOutletTypeNamaType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelOutletTypeDelete)
                    .addComponent(btnTabelOutletTypeSave))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Outlet Type", jPanel68);

        tableTabelOutletSize.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane19.setViewportView(tableTabelOutletSize);

        btnTabelOutletSizeSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelOutletSizeSave.setMnemonic('S');
        btnTabelOutletSizeSave.setText("Save");

        btnTabelOutletSizeDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelOutletSizeDelete.setMnemonic('D');
        btnTabelOutletSizeDelete.setText("Delete");

        textTabelOutletSizeKodeSize.setText("jTextField1");

        textTabelOutletSizelNamaSize.setText("jTextField2");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("OUTLET SIZE");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19)
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addComponent(textTabelOutletSizeKodeSize, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelOutletSizelNamaSize, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(btnTabelOutletSizeSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTabelOutletSizeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelOutletSizeKodeSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelOutletSizelNamaSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelOutletSizeSave)
                    .addComponent(btnTabelOutletSizeDelete))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Outlet Size", jPanel69);

        tableTabelProdBrand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane20.setViewportView(tableTabelProdBrand);

        tableTabelProdSubBrand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane21.setViewportView(tableTabelProdSubBrand);

        textTabelProdBrandBrandId.setText("jTextField4");

        textTabelProdBrandBrandNm.setText("jTextField5");

        textTabelProdSubBrandSubBrandId.setText("jTextField6");

        textTabelProdSubBrandSubBrandNm.setText("jTextField7");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("PRODUCT BRAND & SUB BRAND");

        btnTabelProdBrandSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelProdBrandSave.setText("Save");

        btnTabelProdBrandDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelProdBrandDelete.setText("Delete");

        btnTabelProdSubBrandSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelProdSubBrandSave.setText("Save");

        btnTabelProdSubBrandDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelProdSubBrandDelete.setText("Delete");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel55Layout.createSequentialGroup()
                                .addComponent(textTabelProdBrandBrandId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTabelProdBrandBrandNm, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel55Layout.createSequentialGroup()
                                .addComponent(btnTabelProdBrandSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTabelProdBrandDelete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel55Layout.createSequentialGroup()
                                    .addComponent(textTabelProdSubBrandSubBrandId)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textTabelProdSubBrandSubBrandNm, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel55Layout.createSequentialGroup()
                                .addComponent(btnTabelProdSubBrandSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTabelProdSubBrandDelete)))
                        .addGap(44, 44, 44))))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTabelProdSubBrandSubBrandId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTabelProdSubBrandSubBrandNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTabelProdBrandBrandId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTabelProdBrandBrandNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTabelProdSubBrandSave)
                        .addComponent(btnTabelProdSubBrandDelete))
                    .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTabelProdBrandSave)
                        .addComponent(btnTabelProdBrandDelete)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Prod Brand & Sub", jPanel55);

        tableTabelProdCateg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane22.setViewportView(tableTabelProdCateg);

        tableTabelProdSubCateg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane23.setViewportView(tableTabelProdSubCateg);

        textTabelProdCategCatedId.setText("jTextField8");

        textTabelProdCategCategNm.setText("jTextField9");

        textTabelProdSubCategSubCategId.setText("jTextField10");

        textTabelProdSubCategSubCategNm.setText("jTextField11");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("PRODUCT CATEGORY & SUB-CATEGORY");

        btnTabelProdCategSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelProdCategSave.setText("Save");

        btnTabelProdCategDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelProdCategDelete.setText("Delete");

        btnTabelProdSubCategSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelProdSubCategSave.setText("Save");

        btnTabelProdSubCategDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelProdSubCategDelete.setText("Delete");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel62Layout.createSequentialGroup()
                                .addComponent(textTabelProdCategCatedId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTabelProdCategCategNm, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel62Layout.createSequentialGroup()
                                .addComponent(btnTabelProdCategSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTabelProdCategDelete)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel62Layout.createSequentialGroup()
                                .addComponent(textTabelProdSubCategSubCategId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTabelProdSubCategSubCategNm, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel62Layout.createSequentialGroup()
                                .addComponent(btnTabelProdSubCategSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTabelProdSubCategDelete)))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textTabelProdCategCatedId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textTabelProdCategCategNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textTabelProdSubCategSubCategId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textTabelProdSubCategSubCategNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTabelProdCategSave)
                        .addComponent(btnTabelProdCategDelete))
                    .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTabelProdSubCategSave)
                        .addComponent(btnTabelProdSubCategDelete)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Prod Categ & Sub", jPanel62);

        tableTabelProdDivisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane24.setViewportView(tableTabelProdDivisi);

        textTabelProdDivisiDivisiId.setText("jTextField12");

        textTabelProdDivisiDivisiNm.setText("jTextField13");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("PRODUCT DIVISI");

        btnTabelProdDivisiSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelProdDivisiSave.setMnemonic('S');
        btnTabelProdDivisiSave.setText("Save");

        btnTabelProdDivisiDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelProdDivisiDelete.setMnemonic('D');
        btnTabelProdDivisiDelete.setText("Delete");

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addComponent(textTabelProdDivisiDivisiId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textTabelProdDivisiDivisiNm, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addComponent(btnTabelProdDivisiSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTabelProdDivisiDelete)))
                        .addGap(0, 478, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelProdDivisiDivisiId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelProdDivisiDivisiNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTabelProdDivisiSave)
                    .addComponent(btnTabelProdDivisiDelete))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Prod Divisi", jPanel70);

        tableTabelProdVariance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane25.setViewportView(tableTabelProdVariance);

        textTabelProdVarianceVarianceId.setText("jTextField14");

        textTabelProdVarianceVarianceNm.setText("jTextField15");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("PRODUCT VARIANCE");

        btnTabelProdVarianceSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelProdVarianceSave.setMnemonic('S');
        btnTabelProdVarianceSave.setText("Save");

        btnTabelProdVarianceDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelProdVarianceDelete.setMnemonic('D');
        btnTabelProdVarianceDelete.setText("Delete");

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel71Layout.createSequentialGroup()
                                .addComponent(textTabelProdVarianceVarianceId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTabelProdVarianceVarianceNm, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel71Layout.createSequentialGroup()
                                .addComponent(btnTabelProdVarianceSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTabelProdVarianceDelete)))
                        .addGap(0, 478, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelProdVarianceVarianceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelProdVarianceVarianceNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTabelProdVarianceSave)
                    .addComponent(btnTabelProdVarianceDelete))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Prod Variance", jPanel71);

        tableTabelProdSize.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane26.setViewportView(tableTabelProdSize);

        textTabelProdSizeSizeId.setText("jTextField16");

        textTabelProdSizeSizeNm.setText("jTextField17");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("PRODUCT SIZE");

        btnTabelProdSizeSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelProdSizeSave.setMnemonic('S');
        btnTabelProdSizeSave.setText("Save");

        btnTabelProdSizeDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelProdSizeDelete.setMnemonic('D');
        btnTabelProdSizeDelete.setText("Delete");

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel72Layout.createSequentialGroup()
                                .addComponent(textTabelProdSizeSizeId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTabelProdSizeSizeNm, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel72Layout.createSequentialGroup()
                                .addComponent(btnTabelProdSizeSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTabelProdSizeDelete)))
                        .addGap(0, 478, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelProdSizeSizeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelProdSizeSizeNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTabelProdSizeSave)
                    .addComponent(btnTabelProdSizeDelete))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Prod Size", jPanel72);

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabel-Tabel", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Database.png")), jPanel60); // NOI18N

        tableInputBarangDatang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane27.setViewportView(tableInputBarangDatang);

        jPanel76.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputBarangDatangReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputBarangDatangReload.setText("Reload");

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputBarangDatangReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputBarangDatangReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Barang Datang", jPanel73);

        jPanel77.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputReturKePabrikReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputReturKePabrikReload.setText("Reload");

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputReturKePabrikReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputReturKePabrikReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableInputReturKePabrik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane28.setViewportView(tableInputReturKePabrik);

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel74Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Retur ke Pabrik", jPanel74);

        jPanel78.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputStockAdjustmentReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputStockAdjustmentReload.setText("Reload");

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputStockAdjustmentReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputStockAdjustmentReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableInputStockAdjustment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane29.setViewportView(tableInputStockAdjustment);

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel75Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("Stok Adjustment", jPanel75);

        jTabbedPane1.setSelectedIndex(10);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Input Scylla", jPanel8);

        jPanel44.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputTSalesmanReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputTSalesmanReload.setText("Reload");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTSalesmanReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(918, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTSalesmanReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableOutputTSalesman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(tableOutputTSalesman);

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("MSalesman", jPanel10);

        jPanel46.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputTStokReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputTStokReload.setText("Reload");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTStokReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(918, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTStokReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel47.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableOutputTStok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(tableOutputTStok);

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("TStok", jPanel11);

        jPanel48.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputTOutletReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputTOutletReload.setText("Reload");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTOutletReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(918, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTOutletReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel49.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableOutputTOutlet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane13.setViewportView(tableOutputTOutlet);

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("MSlout", jPanel12);

        jPanel50.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputTDatdslReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputTDatdslReload.setText("Reload");

        lblOutputTDatdslFooterInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOutputTDatdslFooterInfo.setText("lblOutputTDatdslFooterInfo");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTDatdslReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(lblOutputTDatdslFooterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOutputTDatdslReload)
                    .addComponent(lblOutputTDatdslFooterInfo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel51.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableOutputTDatdsl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane14.setViewportView(tableOutputTDatdsl);

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("TDATDSL (Sales)", jPanel13);

        jPanel83.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputTDatdsrReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputTDatdsrReload.setText("Reload");

        lblOutputTDatdsrFooterInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOutputTDatdsrFooterInfo.setText("lblOutputTDatdsrFooterInfo");

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTDatdsrReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel83Layout.createSequentialGroup()
                    .addContainerGap(222, Short.MAX_VALUE)
                    .addComponent(lblOutputTDatdsrFooterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)))
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTDatdsrReload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel83Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblOutputTDatdsrFooterInfo)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        tableOutputTDatdsr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane33.setViewportView(tableOutputTDatdsr);

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane33, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane33, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane3.addTab("TDATDSR (Retur)", jPanel79);

        jPanel84.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputTDatdprReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputTDatdprReload.setText("Reload");

        lblOutputTDatdprFooterInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOutputTDatdprFooterInfo.setText("lblOutputTDatdprFooterInfo");

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTDatdprReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOutputTDatdprFooterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOutputTDatdprReload)
                    .addComponent(lblOutputTDatdprFooterInfo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableOutputTDatdpr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane34.setViewportView(tableOutputTDatdpr);

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
                    .addComponent(jPanel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jTabbedPane3.addTab("TDATDPR (Barang Datang)", jPanel80);

        jPanel85.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputTDatsriReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputTDatsriReload.setText("Reload");

        lblOutputTDatsriFooterInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOutputTDatsriFooterInfo.setText("lblOutputTDatsriFooterInfo");

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTDatsriReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOutputTDatsriFooterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOutputTDatsriReload)
                    .addComponent(lblOutputTDatsriFooterInfo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableOutputTDatsri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane35.setViewportView(tableOutputTDatsri);

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
                    .addComponent(jPanel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane35, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane3.addTab("TDATSRI (Retur ke Principal)", jPanel81);

        jPanel86.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputTAdjstkReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputTAdjstkReload.setText("Reload");

        lblOutputTAdjstkFooterInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOutputTAdjstkFooterInfo.setText("lblOutputTAdjstkFooterInfo");

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputTAdjstkReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOutputTAdjstkFooterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOutputTAdjstkReload)
                    .addComponent(lblOutputTAdjstkFooterInfo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableOutputTAdjstk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane36.setViewportView(tableOutputTAdjstk);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
                    .addComponent(jPanel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane36, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane3.addTab("TADJSTK", jPanel82);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Output KEK", jPanel9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrieveInputAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveInputAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrieveInputAllActionPerformed

    private void btnRetrieveInputJTpruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveInputJTpruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrieveInputJTpruActionPerformed

    private void btnRetrieveInputMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveInputMasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrieveInputMasterActionPerformed

    private void btnPathInputMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPathInputMasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPathInputMasterActionPerformed

    private void checkMapOutletSearchBaruSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMapOutletSearchBaruSajaActionPerformed
        // TODO add your handling code here:
        getCheckMapOutletSearchSemua().setSelected(false);
    }//GEN-LAST:event_checkMapOutletSearchBaruSajaActionPerformed

    private void checkMapOutletSearchDikirimSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMapOutletSearchDikirimSajaActionPerformed
        // TODO add your handling code here:
        getCheckMapOutletSearchSemua().setSelected(false);
        
    }//GEN-LAST:event_checkMapOutletSearchDikirimSajaActionPerformed

    private void checkMapOutletSearchAktifSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMapOutletSearchAktifSajaActionPerformed
        // TODO add your handling code here:
        getCheckMapOutletSearchSemua().setSelected(false);
        
    }//GEN-LAST:event_checkMapOutletSearchAktifSajaActionPerformed

    private void checkMapProductSearchBaruSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMapProductSearchBaruSajaActionPerformed
        // TODO add your handling code here:
        getCheckMapProductSearchSemua().setSelected(false);
    }//GEN-LAST:event_checkMapProductSearchBaruSajaActionPerformed

    private void checkMapProductSearchDikirimSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMapProductSearchDikirimSajaActionPerformed
        // TODO add your handling code here:
        getCheckMapProductSearchSemua().setSelected(false);
        
    }//GEN-LAST:event_checkMapProductSearchDikirimSajaActionPerformed

    private void checkMapProductSearchBonusSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMapProductSearchBonusSajaActionPerformed
        // TODO add your handling code here:
        getCheckMapProductSearchSemua().setSelected(false);
        
    }//GEN-LAST:event_checkMapProductSearchBonusSajaActionPerformed

    private void checkMapProductSearchAktifSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMapProductSearchAktifSajaActionPerformed
        // TODO add your handling code here:
        getCheckMapProductSearchSemua().setSelected(false);
        
    }//GEN-LAST:event_checkMapProductSearchAktifSajaActionPerformed

    private void checkMapProductSearchSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMapProductSearchSemuaActionPerformed
        // TODO add your handling code here:
        resetSearchMapProduct();
    }//GEN-LAST:event_checkMapProductSearchSemuaActionPerformed

    private void checkMapOutletSearchSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMapOutletSearchSemuaActionPerformed
        // TODO add your handling code here:
        resetSearchMapOutlet();
    }//GEN-LAST:event_checkMapOutletSearchSemuaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BridgingUI().setVisible(true);
            }
        });
    }

    
    
    public JButton getBtnPathInputAuto() {
        return btnPathInputAuto;
    }

    public void setBtnPathInputAuto(JButton btnPathInputAuto) {
        this.btnPathInputAuto = btnPathInputAuto;
    }

    public JButton getBtnExtractClient() {
        return btnExtractTAdjStk;
    }

    public void setBtnExtractClient(JButton btnExtractClient) {
        this.btnExtractTAdjStk = btnExtractClient;
    }

    public JButton getBtnExtractSales() {
        return btnExtractMSalesman;
    }

    public void setBtnExtractSales(JButton btnExtractSales) {
        this.btnExtractMSalesman = btnExtractSales;
    }

    public JButton getBtnExtractSo() {
        return btnExtractTDatdpr;
    }

    public void setBtnExtractSo(JButton btnExtractSo) {
        this.btnExtractTDatdpr = btnExtractSo;
    }

    public JButton getBtnExtractStock() {
        return btnExtractMSlsOut;
    }

    public void setBtnExtractStock(JButton btnExtractStock) {
        this.btnExtractMSlsOut = btnExtractStock;
    }

    public JButton getBtnGeneralSettingReload() {
        return btnGeneralSettingReload;
    }

    public void setBtnGeneralSettingReload(JButton btnGeneralSettingReload) {
        this.btnGeneralSettingReload = btnGeneralSettingReload;
    }

    public JButton getBtnGeneralSettingSimpan() {
        return btnGeneralSettingSimpan;
    }

    public void setBtnGeneralSettingSimpan(JButton btnGeneralSettingSimpan) {
        this.btnGeneralSettingSimpan = btnGeneralSettingSimpan;
    }

    public JButton getBtnInputCvOutletReload() {
        return btnInputCvOutletReload;
    }

    public void setBtnInputCvOutletReload(JButton btnInputCvOutletReload) {
        this.btnInputCvOutletReload = btnInputCvOutletReload;
    }

    public JButton getBtnInputJheaderReload() {
        return btnInputJheaderReload;
    }

    public void setBtnInputJheaderReload(JButton btnInputJheaderReload) {
        this.btnInputJheaderReload = btnInputJheaderReload;
    }

    public JButton getBtnInputJpcodeReload() {
        return btnInputJpcodeReload;
    }

    public void setBtnInputJpcodeReload(JButton btnInputJpcodeReload) {
        this.btnInputJpcodeReload = btnInputJpcodeReload;
    }

    public JButton getBtnInputJtprbReload() {
        return btnInputJtprbReload;
    }

    public void setBtnInputJtprbReload(JButton btnInputJtprbReload) {
        this.btnInputJtprbReload = btnInputJtprbReload;
    }

    public JButton getBtnInputJtpruReload() {
        return btnInputJtpruReload;
    }

    public void setBtnInputJtpruReload(JButton btnInputJtpruReload) {
        this.btnInputJtpruReload = btnInputJtpruReload;
    }

    public JButton getBtnInputMasterReload() {
        return btnInputMasterReload;
    }

    public void setBtnInputMasterReload(JButton btnInputMasterReload) {
        this.btnInputMasterReload = btnInputMasterReload;
    }

    public JButton getBtnInputOutletReload() {
        return btnInputOutletReload;
    }

    public void setBtnInputOutletReload(JButton btnInputOutletReload) {
        this.btnInputOutletReload = btnInputOutletReload;
    }

    public JButton getBtnInputSalesmanReload() {
        return btnInputSalesmanReload;
    }

    public void setBtnInputSalesmanReload(JButton btnInputSalesmanReload) {
        this.btnInputSalesmanReload = btnInputSalesmanReload;
    }

    public JButton getBtnInputStockReload() {
        return btnInputStockReload;
    }

    public void setBtnInputStockReload(JButton btnInputStockReload) {
        this.btnInputStockReload = btnInputStockReload;
    }

    public JButton getBtnMapTipeOutletHapus() {
        return btnMapTipeOutletHapus;
    }

    public void setBtnMapTipeOutletHapus(JButton btnMapTipeOutletHapus) {
        this.btnMapTipeOutletHapus = btnMapTipeOutletHapus;
    }

    public JButton getBtnMapTipeOutletSimpan() {
        return btnMapTipeOutletSimpan;
    }

    public void setBtnMapTipeOutletSimpan(JButton btnMapTipeOutletSimpan) {
        this.btnMapTipeOutletSimpan = btnMapTipeOutletSimpan;
    }

    public JButton getBtnMapTipeOutletReload() {
        return btnMapTipeOutletReload;
    }

    public void setBtnMapTipeOutletReload(JButton btnMapTipeOutletReload) {
        this.btnMapTipeOutletReload = btnMapTipeOutletReload;
    }

    
    public JButton getBtnOutputClientReload() {
        return btnOutputTOutletReload;
    }

    public void setBtnOutputClientReload(JButton btnOutputClientReload) {
        this.btnOutputTOutletReload = btnOutputClientReload;
    }

    public JButton getBtnOutputSalesOrderReload() {
        return btnOutputTDatdslReload;
    }

    public void setBtnOutputSalesOrderReload(JButton btnOutputSalesOrderReload) {
        this.btnOutputTDatdslReload = btnOutputSalesOrderReload;
    }

    public JButton getBtnOutputSalesReload() {
        return btnOutputTSalesmanReload;
    }

    public void setBtnOutputSalesReload(JButton btnOutputSalesReload) {
        this.btnOutputTSalesmanReload = btnOutputSalesReload;
    }

    public JButton getBtnOutputStockReload() {
        return btnOutputTStokReload;
    }

    public void setBtnOutputStockReload(JButton btnOutputStockReload) {
        this.btnOutputTStokReload = btnOutputStockReload;
    }

    public JButton getBtnPathInputCvOutlet() {
        return btnPathInputCvOutlet;
    }

    public void setBtnPathInputCvOutlet(JButton btnPathInputCvOutlet) {
        this.btnPathInputCvOutlet = btnPathInputCvOutlet;
    }

    public JButton getBtnPathInputJHeader() {
        return btnPathInputJHeader;
    }

    public void setBtnPathInputJHeader(JButton btnPathInputJHeader) {
        this.btnPathInputJHeader = btnPathInputJHeader;
    }

    public JButton getBtnPathInputJPcode() {
        return btnPathInputJPcode;
    }

    public void setBtnPathInputJPcode(JButton btnPathInputJPcode) {
        this.btnPathInputJPcode = btnPathInputJPcode;
    }

    public JButton getBtnPathInputJTprb() {
        return btnPathInputJTprb;
    }

    public void setBtnPathInputJTprb(JButton btnPathInputJTprb) {
        this.btnPathInputJTprb = btnPathInputJTprb;
    }

    public JButton getBtnPathInputJTpru() {
        return btnPathInputJTpru;
    }

    public void setBtnPathInputJTpru(JButton btnPathInputJTpru) {
        this.btnPathInputJTpru = btnPathInputJTpru;
    }

    public JButton getBtnPathInputMaster() {
        return btnPathInputMaster;
    }

    public void setBtnPathInputMaster(JButton btnPathInputMaster) {
        this.btnPathInputMaster = btnPathInputMaster;
    }

    public JButton getBtnPathInputOutlet() {
        return btnPathInputOutlet;
    }

    public void setBtnPathInputOutlet(JButton btnPathInputOutlet) {
        this.btnPathInputOutlet = btnPathInputOutlet;
    }

    public JButton getBtnPathInputSalesman() {
        return btnPathInputSalesman;
    }

    public void setBtnPathInputSalesman(JButton btnPathInputSalesman) {
        this.btnPathInputSalesman = btnPathInputSalesman;
    }

    public JButton getBtnPathInputStock() {
        return btnPathInputStock;
    }

    public void setBtnPathInputStock(JButton btnPathInputStock) {
        this.btnPathInputStock = btnPathInputStock;
    }

    public JButton getBtnPathOutput() {
        return btnPathOutput;
    }

    public void setBtnPathOutput(JButton btnPathOutput) {
        this.btnPathOutput = btnPathOutput;
    }

    public JButton getBtnRetrieveInputCvOutlet() {
        return btnRetrieveInputCvOutlet;
    }

    public void setBtnRetrieveInputCvOutlet(JButton btnRetrieveInputCvOutlet) {
        this.btnRetrieveInputCvOutlet = btnRetrieveInputCvOutlet;
    }

    public JButton getBtnRetrieveInputJHeader() {
        return btnRetrieveInputJHeader;
    }

    public void setBtnRetrieveInputJHeader(JButton btnRetrieveInputJHeader) {
        this.btnRetrieveInputJHeader = btnRetrieveInputJHeader;
    }

    public JButton getBtnRetrieveInputJPcode() {
        return btnRetrieveInputJPcode;
    }

    public void setBtnRetrieveInputJPcode(JButton btnRetrieveInputJPcode) {
        this.btnRetrieveInputJPcode = btnRetrieveInputJPcode;
    }

    public JButton getBtnRetrieveInputJTprb() {
        return btnRetrieveInputJTprb;
    }

    public void setBtnRetrieveInputJTprb(JButton btnRetrieveInputJTprb) {
        this.btnRetrieveInputJTprb = btnRetrieveInputJTprb;
    }

    public JButton getBtnRetrieveInputJTpru() {
        return btnRetrieveInputJTpru;
    }

    public void setBtnRetrieveInputJTpru(JButton btnRetrieveInputJTpru) {
        this.btnRetrieveInputJTpru = btnRetrieveInputJTpru;
    }

    public JButton getBtnRetrieveInputMaster() {
        return btnRetrieveInputMaster;
    }

    public void setBtnRetrieveInputMaster(JButton btnRetrieveInputMaster) {
        this.btnRetrieveInputMaster = btnRetrieveInputMaster;
    }

    public JButton getBtnRetrieveInputSalesman() {
        return btnRetrieveInputSalesman;
    }

    public void setBtnRetrieveInputSalesman(JButton btnRetrieveInputSalesman) {
        this.btnRetrieveInputSalesman = btnRetrieveInputSalesman;
    }

    public JButton getBtnRetrieveInputStock() {
        return btnRetrieveInputStock;
    }

    public void setBtnRetrieveInputStock(JButton btnRetrieveInputStock) {
        this.btnRetrieveInputStock = btnRetrieveInputStock;
    }

    public JButton getBtnRetrieveInputOutlet() {
        return btnRetrieveInputOutlet;
    }

    public void setBtnRetrieveInputOutlet(JButton btnRetrieveInputOutlet) {
        this.btnRetrieveInputOutlet = btnRetrieveInputOutlet;
    }

    public JButton getBtnPathInputClearAll() {
        return btnPathInputClearAll;
    }

    public void setBtnPathInputClearAll(JButton btnPathInputClearAll) {
        this.btnPathInputClearAll = btnPathInputClearAll;
    }

    public JButton getBtnPathInputReloadAll() {
        return btnPathInputReloadAll;
    }

    public void setBtnPathInputReloadAll(JButton btnPathInputReloadAll) {
        this.btnPathInputReloadAll = btnPathInputReloadAll;
    }

    public JButton getBtnRetrieveInputAll() {
        return btnRetrieveInputAll;
    }

    public void setBtnRetrieveInputAll(JButton btnRetrieveInputAll) {
        this.btnRetrieveInputAll = btnRetrieveInputAll;
    }

    
    
    public JTable getTableInputCvOutlet() {
        return tableInputCvOutlet;
    }

    public void setTableInputCvOutlet(JTable tableInputCvOutlet) {
        this.tableInputCvOutlet = tableInputCvOutlet;
    }

    public JTable getTableInputJheader() {
        return tableInputJheader;
    }

    public void setTableInputJheader(JTable tableInputJheader) {
        this.tableInputJheader = tableInputJheader;
    }

    public JTable getTableInputJpcode() {
        return tableInputJpcode;
    }

    public void setTableInputJpcode(JTable tableInputJpcode) {
        this.tableInputJpcode = tableInputJpcode;
    }

    public JTable getTableInputJtprb() {
        return tableInputJtprb;
    }

    public void setTableInputJtprb(JTable tableInputJtprb) {
        this.tableInputJtprb = tableInputJtprb;
    }

    public JTable getTableInputJtpru() {
        return tableInputJtpru;
    }

    public void setTableInputJtpru(JTable tableInputJtpru) {
        this.tableInputJtpru = tableInputJtpru;
    }

    public JTable getTableInputMaster() {
        return tableInputMaster;
    }

    public void setTableInputMaster(JTable tableInputMaster) {
        this.tableInputMaster = tableInputMaster;
    }

    public JTable getTableInputOutlet() {
        return tableInputOutlet;
    }

    public void setTableInputOutlet(JTable tableInputOutlet) {
        this.tableInputOutlet = tableInputOutlet;
    }

    public JTable getTableInputSalesman() {
        return tableInputSalesman;
    }

    public void setTableInputSalesman(JTable tableInputSalesman) {
        this.tableInputSalesman = tableInputSalesman;
    }

    public JTable getTableInputStock() {
        return tableInputStock;
    }

    public void setTableInputStock(JTable tableInputStock) {
        this.tableInputStock = tableInputStock;
    }

    public JTable getTableMappingTipeOutlet() {
        return tableMappingTipeOutlet;
    }

    public void setTableMappingTipeOutlet(JTable tableMappingTipeOutlet) {
        this.tableMappingTipeOutlet = tableMappingTipeOutlet;
    }

    /*
    public JTable getTableOutputClient() {
    return tableOutputClient;
    }
    public void setTableOutputClient(JTable tableOutputClient) {
    this.tableOutputClient = tableOutputClient;
    }
    public JTable getTableOutputSales() {
    return tableOutputSales;
    }
    public void setTableOutputSales(JTable tableOutputSales) {
    this.tableOutputSales = tableOutputSales;
    }
    public JTable getTableOutputSalesOrder() {
    return tableOutputSalesOrder;
    }
    public void setTableOutputSalesOrder(JTable tableOutputSalesOrder) {
    this.tableOutputSalesOrder = tableOutputSalesOrder;
    }
    public JTable getTableOutputStock() {
    return tableOutputStock;
    }    
    public void setTableOutputStock(JTable tableOutputStock) {
    this.tableOutputTStok = tableOutputStock;
    }
     */
    public JTable getTableOutputTAdjstk() {
        return tableOutputTAdjstk;
    }

    public void setTableOutputTAdjstk(JTable tableOutputTAdjstk) {
        this.tableOutputTAdjstk = tableOutputTAdjstk;
    }

    public JTable getTableOutputTDatdpr() {
        return tableOutputTDatdpr;
    }

    public void setTableOutputTDatdpr(JTable tableOutputTDatdpr) {
        this.tableOutputTDatdpr = tableOutputTDatdpr;
    }

    public JTable getTableOutputTDatdsl() {
        return tableOutputTDatdsl;
    }

    public void setTableOutputTDatdsl(JTable tableOutputTDatdsl) {
        this.tableOutputTDatdsl = tableOutputTDatdsl;
    }

    public JTable getTableOutputTDatdsr() {
        return tableOutputTDatdsr;
    }

    public void setTableOutputTDatdsr(JTable tableOutputTDatdsr) {
        this.tableOutputTDatdsr = tableOutputTDatdsr;
    }

    public JTable getTableOutputTDatsri() {
        return tableOutputTDatsri;
    }

    public void setTableOutputTDatsri(JTable tableOutputTDatsri) {
        this.tableOutputTDatsri = tableOutputTDatsri;
    }

    public JTable getTableOutputTOutlet() {
        return tableOutputTOutlet;
    }

    public void setTableOutputTOutlet(JTable tableOutputTOutlet) {
        this.tableOutputTOutlet = tableOutputTOutlet;
    }

    public JTable getTableOutputTSalesman() {
        return tableOutputTSalesman;
    }

    public void setTableOutputTSalesman(JTable tableOutputTSalesman) {
        this.tableOutputTSalesman = tableOutputTSalesman;
    }

    public JTable getTableOutputTStok() {
        return tableOutputTStok;
    }

    public void setTableOutputTStok(JTable tableOutputTStok) {
        this.tableOutputTStok = tableOutputTStok;
    }

    
    
    public JTextField getTextDistributorCode() {
        return textDistributorCode;
    }

    public void setTextDistributorCode(JTextField textDistributorCode) {
        this.textDistributorCode = textDistributorCode;
    }

    public JTextField getTextMapTipeOutletDeskripsi() {
        return textMapTipeOutletDeskripsi;
    }

    public void setTextMapTipeOutletDeskripsi(JTextField textMapTipeOutletDeskripsi) {
        this.textMapTipeOutletDeskripsi = textMapTipeOutletDeskripsi;
    }

    public JTextField getTextMapTipeOutletIdTipeOutlet() {
        return textMapTipeOutletIdTipeOutlet;
    }

    public void setTextMapTipeOutletIdTipeOutlet(JTextField textMapTipeOutletIdTipeOutlet) {
        this.textMapTipeOutletIdTipeOutlet = textMapTipeOutletIdTipeOutlet;
    }

    public JTextField getTextMapTipeOutletIdTypeOutletScy() {
        return textMapTipeOutletIdTypeOutletScy;
    }

    public void setTextMapTipeOutletIdTypeOutletScy(JTextField textMapTipeOutletIdTypeOutletScy) {
        this.textMapTipeOutletIdTypeOutletScy = textMapTipeOutletIdTypeOutletScy;
    }

    public JTextField getTextPathInputCvOutlet() {
        return textPathInputCvOutlet;
    }

    public void setTextPathInputCvOutlet(JTextField textPathInputCvOutlet) {
        this.textPathInputCvOutlet = textPathInputCvOutlet;
    }

    public JTextField getTextPathInputJHeader() {
        return textPathInputJHeader;
    }

    public void setTextPathInputJHeader(JTextField textPathInputJHeader) {
        this.textPathInputJHeader = textPathInputJHeader;
    }

    public JTextField getTextPathInputJPcode() {
        return textPathInputJPcode;
    }

    public void setTextPathInputJPcode(JTextField textPathInputJPcode) {
        this.textPathInputJPcode = textPathInputJPcode;
    }

    public JTextField getTextPathInputJTprb() {
        return textPathInputJTprb;
    }

    public void setTextPathInputJTprb(JTextField textPathInputJTprb) {
        this.textPathInputJTprb = textPathInputJTprb;
    }

    public JTextField getTextPathInputJTpru() {
        return textPathInputJTpru;
    }

    public void setTextPathInputJTpru(JTextField textPathInputJTpru) {
        this.textPathInputJTpru = textPathInputJTpru;
    }

    public JTextField getTextPathInputMaster() {
        return textPathInputMaster;
    }

    public void setTextPathInputMaster(JTextField textPathInputMaster) {
        this.textPathInputMaster = textPathInputMaster;
    }

    public JTextField getTextPathInputOutlet() {
        return textPathInputOutlet;
    }

    public void setTextPathInputOutlet(JTextField textPathInputOutlet) {
        this.textPathInputOutlet = textPathInputOutlet;
    }

    public JTextField getTextPathInputSalesman() {
        return textPathInputSalesman;
    }

    public void setTextPathInputSalesman(JTextField textPathInputSalesman) {
        this.textPathInputSalesman = textPathInputSalesman;
    }

    public JTextField getTextPathInputStock() {
        return textPathInputStock;
    }

    public void setTextPathInputStock(JTextField textPathInputStock) {
        this.textPathInputStock = textPathInputStock;
    }

    public JTextField getTextPathOutput() {
        return textPathOutput;
    }

    public void setTextPathOutput(JTextField textPathOutput) {
        this.textPathOutput = textPathOutput;
    }

    public JTextField getTextRecordTypeClient() {
        return textRecordTypeClient;
    }

    public void setTextRecordTypeClient(JTextField textRecordTypeClient) {
        this.textRecordTypeClient = textRecordTypeClient;
    }

    public JTextField getTextRecordTypeSales() {
        return textRecordTypeSales;
    }

    public void setTextRecordTypeSales(JTextField textRecordTypeSales) {
        this.textRecordTypeSales = textRecordTypeSales;
    }

    public JTextField getTextRecordTypeSo() {
        return textRecordTypeSo;
    }

    public void setTextRecordTypeSo(JTextField textRecordTypeSo) {
        this.textRecordTypeSo = textRecordTypeSo;
    }

    public JTextField getTextRecordTypeStock() {
        return textRecordTypeStock;
    }

    public void setTextRecordTypeStock(JTextField textRecordTypeStock) {
        this.textRecordTypeStock = textRecordTypeStock;
    }

    public JTextField getTextWarehouseWarehouseCode() {
        return textWarehouseWarehouseCode;
    }

    public void setTextWarehouseWarehouseCode(JTextField textWarehouseWarehouseCode) {
        this.textWarehouseWarehouseCode = textWarehouseWarehouseCode;
    }

    public JTextField getTextWarehouseWarehouseDescription() {
        return textWarehouseWarehouseDescription;
    }

    public void setTextWarehouseWarehouseDescription(JTextField textWarehouseWarehouseDescription) {
        this.textWarehouseWarehouseDescription = textWarehouseWarehouseDescription;
    }

    public JButton getBtnExtractAll() {
        return btnExtractAll;
    }

    public void setBtnExtractAll(JButton btnExtractAll) {
        this.btnExtractAll = btnExtractAll;
    }

    public JDateChooser getjDateChooserExtract() {
        return jDateChooserExtract;
    }

    public void setjDateChooserExtract(JDateChooser jDateChooserExtract) {
        this.jDateChooserExtract = jDateChooserExtract;
    }

    public JTextField getTextEmailFrom() {
        return textEmailFrom;
    }

    public void setTextEmailFrom(JTextField textEmailFrom) {
        this.textEmailFrom = textEmailFrom;
    }

    public JTextField getTextEmailSubject() {
        return textEmailSubject;
    }

    public void setTextEmailSubject(JTextField textEmailSubject) {
        this.textEmailSubject = textEmailSubject;
    }

    public JTextField getTextEmailTo() {
        return textEmailTo;
    }

    public void setTextEmailTo(JTextField textEmailTo) {
        this.textEmailTo = textEmailTo;
    }

    public JCheckBox getCheckModeDatabase() {
        return checkModeDatabase;
    }

    public void setCheckModeDatabase(JCheckBox checkModeDatabase) {
        this.checkModeDatabase = checkModeDatabase;
    }

    public JCheckBox getCheckTprbDiluarBarang() {
        return checkTprbDiluarBarang;
    }

    public void setCheckTprbDiluarBarang(JCheckBox checkTprbDiluarBarang) {
        this.checkTprbDiluarBarang = checkTprbDiluarBarang;
    }

    public JDateChooser getjDateChooseTanggalStock() {
        return jDateChooseTanggalStock;
    }

    public void setjDateChooseTanggalStock(JDateChooser jDateChooseTanggalStock) {
        this.jDateChooseTanggalStock = jDateChooseTanggalStock;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JTabbedPane getjTabbedPane2() {
        return jTabbedPane2;
    }

    public void setjTabbedPane2(JTabbedPane jTabbedPane2) {
        this.jTabbedPane2 = jTabbedPane2;
    }

    public JTabbedPane getjTabbedPane3() {
        return jTabbedPane3;
    }

    public void setjTabbedPane3(JTabbedPane jTabbedPane3) {
        this.jTabbedPane3 = jTabbedPane3;
    }

    public JTabbedPane getjTabbedPane4() {
        return jTabbedPane4;
    }

    public void setjTabbedPane4(JTabbedPane jTabbedPane4) {
        this.jTabbedPane4 = jTabbedPane4;
    }

    public JPasswordField getTextEmailPassword() {
        return textEmailPassword;
    }

    public void setTextEmailPassword(JPasswordField textEmailPassword) {
        this.textEmailPassword = textEmailPassword;
    }

    public JButton getBtnKirimByEmail() {
        return btnKirimByEmail;
    }

    public void setBtnKirimByEmail(JButton btnKirimByEmail) {
        this.btnKirimByEmail = btnKirimByEmail;
    }

    public JButton getBtnTabelDeleteChain() {
        return btnTabelOutletChainDelete;
    }

    public void setBtnTabelDeleteChain(JButton btnTabelDeleteChain) {
        this.btnTabelOutletChainDelete = btnTabelDeleteChain;
    }

    public JButton getBtnTabelDeleteKa() {
        return btnTabelKeyAccountDelete;
    }

    public void setBtnTabelDeleteKa(JButton btnTabelDeleteKa) {
        this.btnTabelKeyAccountDelete = btnTabelDeleteKa;
    }

    public JButton getBtnTabelDeleteLokasi() {
        return btnTabelOutletLocationDelete;
    }

    public void setBtnTabelDeleteLokasi(JButton btnTabelDeleteLokasi) {
        this.btnTabelOutletLocationDelete = btnTabelDeleteLokasi;
    }

    public JButton getBtnTabelDeleteSize() {
        return btnTabelOutletSizeDelete;
    }

    public void setBtnTabelDeleteSize(JButton btnTabelDeleteSize) {
        this.btnTabelOutletSizeDelete = btnTabelDeleteSize;
    }

    public JButton getBtnTabelDeleteType() {
        return btnTabelOutletTypeDelete;
    }

    public void setBtnTabelDeleteType(JButton btnTabelDeleteType) {
        this.btnTabelOutletTypeDelete = btnTabelDeleteType;
    }

    public JButton getBtnTabelSimpanChain() {
        return btnTabelOutletChainSave;
    }

    public void setBtnTabelSimpanChain(JButton btnTabelSimpanChain) {
        this.btnTabelOutletChainSave = btnTabelSimpanChain;
    }

    public JButton getBtnTabelSimpanKa() {
        return btnTabelKeyAccountSave;
    }

    public void setBtnTabelSimpanKa(JButton btnTabelSimpanKa) {
        this.btnTabelKeyAccountSave = btnTabelSimpanKa;
    }

    public JButton getBtnTabelSimpanLokasi() {
        return btnTabelOutletLocationSave;
    }

    public void setBtnTabelSimpanLokasi(JButton btnTabelSimpanLokasi) {
        this.btnTabelOutletLocationSave = btnTabelSimpanLokasi;
    }

    public JButton getBtnTabelSimpanSize() {
        return btnTabelOutletSizeSave;
    }

    public void setBtnTabelSimpanSize(JButton btnTabelSimpanSize) {
        this.btnTabelOutletSizeSave = btnTabelSimpanSize;
    }

    public JButton getBtnTabelSimpanType() {
        return btnTabelOutletTypeSave;
    }

    public void setBtnTabelSimpanType(JButton btnTabelSimpanType) {
        this.btnTabelOutletTypeSave = btnTabelSimpanType;
    }


    public JButton getBtnInputBarangDatangReload() {
        return btnInputBarangDatangReload;
    }

    public void setBtnInputBarangDatangReload(JButton btnInputBarangDatangReload) {
        this.btnInputBarangDatangReload = btnInputBarangDatangReload;
    }

    public JButton getBtnInputReturKePabrikReload() {
        return btnInputReturKePabrikReload;
    }

    public void setBtnInputReturKePabrikReload(JButton btnInputReturKePabrikReload) {
        this.btnInputReturKePabrikReload = btnInputReturKePabrikReload;
    }

    public JButton getBtnInputStockAdjustmentReload() {
        return btnInputStockAdjustmentReload;
    }

    public void setBtnInputStockAdjustmentReload(JButton btnInputStockAdjustmentReload) {
        this.btnInputStockAdjustmentReload = btnInputStockAdjustmentReload;
    }

    public JButton getBtnMapOutletDelete() {
        return btnMapOutletDelete;
    }

    public void setBtnMapOutletDelete(JButton btnMapOutletDelete) {
        this.btnMapOutletDelete = btnMapOutletDelete;
    }

    public JButton getBtnMapOutletSave() {
        return btnMapOutletSave;
    }

    public void setBtnMapOutletSave(JButton btnMapOutletSave) {
        this.btnMapOutletSave = btnMapOutletSave;
    }

    public JButton getBtnMapOutletSearch() {
        return btnMapOutletSearch;
    }

    public void setBtnMapOutletSearch(JButton btnMapOutletSearch) {
        this.btnMapOutletSearch = btnMapOutletSearch;
    }

    public JButton getBtnMapProductDelete() {
        return btnMapProductDelete;
    }

    public void setBtnMapProductDelete(JButton btnMapProductDelete) {
        this.btnMapProductDelete = btnMapProductDelete;
    }

    public JButton getBtnMapProductSave() {
        return btnMapProductSave;
    }

    public void setBtnMapProductSave(JButton btnMapProductSave) {
        this.btnMapProductSave = btnMapProductSave;
    }

    public JButton getBtnMapProductSearch() {
        return btnMapProductSearch;
    }

    public void setBtnMapProductSearch(JButton btnMapProductSearch) {
        this.btnMapProductSearch = btnMapProductSearch;
    }

    public JButton getBtnMapSalesmanDelete() {
        return btnMapSalesmanDelete;
    }

    public void setBtnMapSalesmanDelete(JButton btnMapSalesmanDelete) {
        this.btnMapSalesmanDelete = btnMapSalesmanDelete;
    }

    public JButton getBtnMapSalesmanSave() {
        return btnMapSalesmanSave;
    }

    public void setBtnMapSalesmanSave(JButton btnMapSalesmanSave) {
        this.btnMapSalesmanSave = btnMapSalesmanSave;
    }

    public JButton getBtnOutputSalesOrderReload1() {
        return btnOutputTDatdsrReload;
    }

    public void setBtnOutputSalesOrderReload1(JButton btnOutputSalesOrderReload1) {
        this.btnOutputTDatdsrReload = btnOutputSalesOrderReload1;
    }

    public JButton getBtnOutputSalesOrderReload2() {
        return btnOutputTDatdprReload;
    }

    public void setBtnOutputSalesOrderReload2(JButton btnOutputSalesOrderReload2) {
        this.btnOutputTDatdprReload = btnOutputSalesOrderReload2;
    }

    public JButton getBtnOutputSalesOrderReload3() {
        return btnOutputTDatsriReload;
    }

    public void setBtnOutputSalesOrderReload3(JButton btnOutputSalesOrderReload3) {
        this.btnOutputTDatsriReload = btnOutputSalesOrderReload3;
    }

    public JButton getBtnOutputSalesOrderReload4() {
        return btnOutputTAdjstkReload;
    }

    public void setBtnOutputSalesOrderReload4(JButton btnOutputSalesOrderReload4) {
        this.btnOutputTAdjstkReload = btnOutputSalesOrderReload4;
    }

    public JButton getBtnTabelOutletGroupDelete() {
        return btnTabelOutletGroupDelete;
    }

    public void setBtnTabelOutletGroupDelete(JButton btnTabelOutletGroupDelete) {
        this.btnTabelOutletGroupDelete = btnTabelOutletGroupDelete;
    }

    public JButton getBtnTabelOutletGroupSave() {
        return btnTabelOutletGroupSave;
    }

    public void setBtnTabelOutletGroupSave(JButton btnTabelOutletGroupSave) {
        this.btnTabelOutletGroupSave = btnTabelOutletGroupSave;
    }



    public JButton getBtnTabelKeyAccountDelete() {
        return btnTabelKeyAccountDelete;
    }

    public void setBtnTabelKeyAccountDelete(JButton btnTabelKeyAccountDelete) {
        this.btnTabelKeyAccountDelete = btnTabelKeyAccountDelete;
    }

    public JButton getBtnTabelKeyAccountSave() {
        return btnTabelKeyAccountSave;
    }

    public void setBtnTabelKeyAccountSave(JButton btnTabelKeyAccountSave) {
        this.btnTabelKeyAccountSave = btnTabelKeyAccountSave;
    }

    public JButton getBtnTabelOutletChainDelete() {
        return btnTabelOutletChainDelete;
    }

    public void setBtnTabelOutletChainDelete(JButton btnTabelOutletChainDelete) {
        this.btnTabelOutletChainDelete = btnTabelOutletChainDelete;
    }

    public JButton getBtnTabelOutletChainSave() {
        return btnTabelOutletChainSave;
    }

    public void setBtnTabelOutletChainSave(JButton btnTabelOutletChainSave) {
        this.btnTabelOutletChainSave = btnTabelOutletChainSave;
    }

    public JButton getBtnTabelOutletLocationDelete() {
        return btnTabelOutletLocationDelete;
    }

    public void setBtnTabelOutletLocationDelete(JButton btnTabelOutletLocationDelete) {
        this.btnTabelOutletLocationDelete = btnTabelOutletLocationDelete;
    }

    public JButton getBtnTabelOutletLocationSave() {
        return btnTabelOutletLocationSave;
    }

    public void setBtnTabelOutletLocationSave(JButton btnTabelOutletLocationSave) {
        this.btnTabelOutletLocationSave = btnTabelOutletLocationSave;
    }

    public JButton getBtnTabelOutletSizeDelete() {
        return btnTabelOutletSizeDelete;
    }

    public void setBtnTabelOutletSizeDelete(JButton btnTabelOutletSizeDelete) {
        this.btnTabelOutletSizeDelete = btnTabelOutletSizeDelete;
    }

    public JButton getBtnTabelOutletSizeSave() {
        return btnTabelOutletSizeSave;
    }

    public void setBtnTabelOutletSizeSave(JButton btnTabelOutletSizeSave) {
        this.btnTabelOutletSizeSave = btnTabelOutletSizeSave;
    }

    public JButton getBtnTabelOutletTypeDelete() {
        return btnTabelOutletTypeDelete;
    }

    public void setBtnTabelOutletTypeDelete(JButton btnTabelOutletTypeDelete) {
        this.btnTabelOutletTypeDelete = btnTabelOutletTypeDelete;
    }

    public JButton getBtnTabelOutletTypeSave() {
        return btnTabelOutletTypeSave;
    }

    public void setBtnTabelOutletTypeSave(JButton btnTabelOutletTypeSave) {
        this.btnTabelOutletTypeSave = btnTabelOutletTypeSave;
    }

    public JButton getBtnTabelProdBrandDelete() {
        return btnTabelProdBrandDelete;
    }

    public void setBtnTabelProdBrandDelete(JButton btnTabelProdBrandDelete) {
        this.btnTabelProdBrandDelete = btnTabelProdBrandDelete;
    }

    public JButton getBtnTabelProdBrandSave() {
        return btnTabelProdBrandSave;
    }

    public void setBtnTabelProdBrandSave(JButton btnTabelProdBrandSave) {
        this.btnTabelProdBrandSave = btnTabelProdBrandSave;
    }

    public JButton getBtnTabelProdCategDelete() {
        return btnTabelProdCategDelete;
    }

    public void setBtnTabelProdCategDelete(JButton btnTabelProdCategDelete) {
        this.btnTabelProdCategDelete = btnTabelProdCategDelete;
    }

    public JButton getBtnTabelProdCategSave() {
        return btnTabelProdCategSave;
    }

    public void setBtnTabelProdCategSave(JButton btnTabelProdCategSave) {
        this.btnTabelProdCategSave = btnTabelProdCategSave;
    }

    public JButton getBtnTabelProdSubCategDelete() {
        return btnTabelProdSubCategDelete;
    }

    public void setBtnTabelProdSubCategDelete(JButton btnTabelProdSubCategDelete) {
        this.btnTabelProdSubCategDelete = btnTabelProdSubCategDelete;
    }

    public JButton getBtnTabelProdSubCategSave() {
        return btnTabelProdSubCategSave;
    }

    public void setBtnTabelProdSubCategSave(JButton btnTabelProdSubCategSave) {
        this.btnTabelProdSubCategSave = btnTabelProdSubCategSave;
    }



    public JButton getBtnTabelProdDivisiDelete() {
        return btnTabelProdDivisiDelete;
    }

    public void setBtnTabelProdDivisiDelete(JButton btnTabelProdDivisiDelete) {
        this.btnTabelProdDivisiDelete = btnTabelProdDivisiDelete;
    }

    public JButton getBtnTabelProdDivisiSave() {
        return btnTabelProdDivisiSave;
    }

    public void setBtnTabelProdDivisiSave(JButton btnTabelProdDivisiSave) {
        this.btnTabelProdDivisiSave = btnTabelProdDivisiSave;
    }

    public JButton getBtnTabelProdSizeDelete() {
        return btnTabelProdSizeDelete;
    }

    public void setBtnTabelProdSizeDelete(JButton btnTabelProdSizeDelete) {
        this.btnTabelProdSizeDelete = btnTabelProdSizeDelete;
    }

    public JButton getBtnTabelProdSizeSave() {
        return btnTabelProdSizeSave;
    }

    public void setBtnTabelProdSizeSave(JButton btnTabelProdSizeSave) {
        this.btnTabelProdSizeSave = btnTabelProdSizeSave;
    }

    public JButton getBtnTabelProdVarianceDelete() {
        return btnTabelProdVarianceDelete;
    }

    public void setBtnTabelProdVarianceDelete(JButton btnTabelProdVarianceDelete) {
        this.btnTabelProdVarianceDelete = btnTabelProdVarianceDelete;
    }

    public JButton getBtnTabelProdVarianceSave() {
        return btnTabelProdVarianceSave;
    }

    public void setBtnTabelProdVarianceSave(JButton btnTabelProdVarianceSave) {
        this.btnTabelProdVarianceSave = btnTabelProdVarianceSave;
    }

    public JButton getBtnTableProdBrandSubDelete() {
        return btnTabelProdBrandDelete;
    }

    public void setBtnTableProdBrandSubDelete(JButton btnTableProdBrandSubDelete) {
        this.btnTabelProdBrandDelete = btnTableProdBrandSubDelete;
    }

    public JComboBox getComboMapOutletAreaId() {
        return comboMapOutletAreaId;
    }

    public void setComboMapOutletAreaId(JComboBox comboMapOutletAreaId) {
        this.comboMapOutletAreaId = comboMapOutletAreaId;
    }

    public JComboBox getComboMapOutletBSizeId() {
        return comboMapOutletBSizeId;
    }

    public void setComboMapOutletBSizeId(JComboBox comboMapOutletBSizeId) {
        this.comboMapOutletBSizeId = comboMapOutletBSizeId;
    }

    public JComboBox getComboMapOutletClassId() {
        return comboMapOutletClassId;
    }

    public void setComboMapOutletClassId(JComboBox comboMapOutletClassId) {
        this.comboMapOutletClassId = comboMapOutletClassId;
    }

    public JComboBox getComboMapOutletGroupId() {
        return comboMapOutletGroupId;
    }

    public void setComboMapOutletGroupId(JComboBox comboMapOutletGroupId) {
        this.comboMapOutletGroupId = comboMapOutletGroupId;
    }

    public JComboBox getComboMapOutletKeyAccountId() {
        return comboMapOutletKeyAccountId;
    }

    public void setComboMapOutletKeyAccountId(JComboBox comboMapOutletKeyAccountId) {
        this.comboMapOutletKeyAccountId = comboMapOutletKeyAccountId;
    }

    public JComboBox getComboMapOutletLocationId() {
        return comboMapOutletLocationId;
    }

    public void setComboMapOutletLocationId(JComboBox comboMapOutletLocationId) {
        this.comboMapOutletLocationId = comboMapOutletLocationId;
    }

    public JTextField getTextMapOutletSearchMSLOutletName() {
        return textMapOutletSearchMSLOutletName;
    }

    public void setTextMapOutletSearchMSLOutletName(JTextField textMapOutletSearchMSLOutletName) {
        this.textMapOutletSearchMSLOutletName = textMapOutletSearchMSLOutletName;
    }


    public JComboBox getComboMapOutletNasionalSalesmanCode() {
        return comboMapOutletNasionalSalesmanCode;
    }

    public void setComboMapOutletNasionalSalesmanCode(JComboBox comboMapOutletNasionalSalesmanCode) {
        this.comboMapOutletNasionalSalesmanCode = comboMapOutletNasionalSalesmanCode;
    }

    public JComboBox getComboMapOutletOutletType() {
        return comboMapOutletOutletType;
    }

    public void setComboMapOutletOutletType(JComboBox comboMapOutletOutletType) {
        this.comboMapOutletOutletType = comboMapOutletOutletType;
    }

    public JComboBox getComboMapOutletSalesmanCode() {
        return comboMapOutletSalesmanCode;
    }

    public void setComboMapOutletSalesmanCode(JComboBox comboMapOutletSalesmanCode) {
        this.comboMapOutletSalesmanCode = comboMapOutletSalesmanCode;
    }

    public JComboBox getComboMapOutletSubGroupId() {
        return comboMapOutletSubGroupId;
    }

    public void setComboMapOutletSubGroupId(JComboBox comboMapOutletSubGroupId) {
        this.comboMapOutletSubGroupId = comboMapOutletSubGroupId;
    }

    public JComboBox getComboMapProductBrand() {
        return comboMapProductBrand;
    }

    public void setComboMapProductBrand(JComboBox comboMapProductBrand) {
        this.comboMapProductBrand = comboMapProductBrand;
    }

    public JComboBox getComboMapProductCategory() {
        return comboMapProductCategory;
    }

    public void setComboMapProductCategory(JComboBox comboMapProductCategory) {
        this.comboMapProductCategory = comboMapProductCategory;
    }

    public JComboBox getComboMapProductDivisi() {
        return comboMapProductDivisi;
    }

    public void setComboMapProductDivisi(JComboBox comboMapProductDivisi) {
        this.comboMapProductDivisi = comboMapProductDivisi;
    }

    public JComboBox getComboMapProductSize() {
        return comboMapProductSize;
    }

    public void setComboMapProductSize(JComboBox comboMapProductSize) {
        this.comboMapProductSize = comboMapProductSize;
    }

    public JComboBox getComboMapProductSubBrand() {
        return comboMapProductSubBrand;
    }

    public void setComboMapProductSubBrand(JComboBox comboMapProductSubBrand) {
        this.comboMapProductSubBrand = comboMapProductSubBrand;
    }

    public JComboBox getComboMapProductSubCategory() {
        return comboMapProductSubCategory;
    }

    public void setComboMapProductSubCategory(JComboBox comboMapProductSubCategory) {
        this.comboMapProductSubCategory = comboMapProductSubCategory;
    }

    public JComboBox getComboMapProductVariance() {
        return comboMapProductVariance;
    }

    public void setComboMapProductVariance(JComboBox comboMapProductVariance) {
        this.comboMapProductVariance = comboMapProductVariance;
    }

    public JTable getTableMapOutlet() {
        return tableMapOutlet;
    }

    public void setTableMapOutlet(JTable tableMapOutlet) {
        this.tableMapOutlet = tableMapOutlet;
    }

    public JTable getTableMapProduct() {
        return tableMapProduct;
    }

    public void setTableMapProduct(JTable tableMapProduct) {
        this.tableMapProduct = tableMapProduct;
    }

    public JTable getTableMapSalesman() {
        return tableMapSalesman;
    }

    public void setTableMapSalesman(JTable tableMapSalesman) {
        this.tableMapSalesman = tableMapSalesman;
    }

    public JTable getTableTabelKeyAccount() {
        return tableTabelKeyAccount;
    }

    public void setTableTabelKeyAccount(JTable tableTabelKeyAccount) {
        this.tableTabelKeyAccount = tableTabelKeyAccount;
    }

    public JTable getTableTabelOutletChain() {
        return tableTabelOutletChain;
    }

    public void setTableTabelOutletChain(JTable tableTabelOutletChain) {
        this.tableTabelOutletChain = tableTabelOutletChain;
    }

    public JTable getTableTabelOutletClass() {
        return tableTabelOutletClass;
    }

    public void setTableTabelOutletClass(JTable tableTabelOutletClass) {
        this.tableTabelOutletClass = tableTabelOutletClass;
    }

    public JTable getTableTabelOutletGroup() {
        return tableTabelOutletGroup;
    }

    public void setTableTabelOutletGroup(JTable tableTabelOutletGroup) {
        this.tableTabelOutletGroup = tableTabelOutletGroup;
    }

    public JTable getTableTabelOutletLocation() {
        return tableTabelOutletLocation;
    }

    public void setTableTabelOutletLocation(JTable tableTabelOutletLocation) {
        this.tableTabelOutletLocation = tableTabelOutletLocation;
    }

    public JTable getTableTabelOutletSize() {
        return tableTabelOutletSize;
    }

    public void setTableTabelOutletSize(JTable tableTabelOutletSize) {
        this.tableTabelOutletSize = tableTabelOutletSize;
    }

    public JTable getTableTabelOutletSubGroup() {
        return tableTabelOutletSubGroup;
    }

    public void setTableTabelOutletSubGroup(JTable tableTabelOutletSubGroup) {
        this.tableTabelOutletSubGroup = tableTabelOutletSubGroup;
    }

    public JTable getTableTabelOutletType() {
        return tableTabelOutletType;
    }

    public void setTableTabelOutletType(JTable tableTabelOutletType) {
        this.tableTabelOutletType = tableTabelOutletType;
    }

    public JTable getTableTabelProdBrand() {
        return tableTabelProdBrand;
    }

    public void setTableTabelProdBrand(JTable tableTabelProdBrand) {
        this.tableTabelProdBrand = tableTabelProdBrand;
    }

    public JTable getTableTabelProdCateg() {
        return tableTabelProdCateg;
    }

    public void setTableTabelProdCateg(JTable tableTabelProdCateg) {
        this.tableTabelProdCateg = tableTabelProdCateg;
    }

    public JTable getTableTabelProdDivisi() {
        return tableTabelProdDivisi;
    }

    public void setTableTabelProdDivisi(JTable tableTabelProdDivisi) {
        this.tableTabelProdDivisi = tableTabelProdDivisi;
    }

    public JTable getTableTabelProdSize() {
        return tableTabelProdSize;
    }

    public void setTableTabelProdSize(JTable tableTabelProdSize) {
        this.tableTabelProdSize = tableTabelProdSize;
    }

    public JTable getTableTabelProdSubBrand() {
        return tableTabelProdSubBrand;
    }

    public void setTableTabelProdSubBrand(JTable tableTabelProdSubBrand) {
        this.tableTabelProdSubBrand = tableTabelProdSubBrand;
    }

    public JTable getTableTabelProdSubCateg() {
        return tableTabelProdSubCateg;
    }

    public void setTableTabelProdSubCateg(JTable tableTabelProdSubCateg) {
        this.tableTabelProdSubCateg = tableTabelProdSubCateg;
    }

    public JTable getTableTabelProdVariance() {
        return tableTabelProdVariance;
    }

    public void setTableTabelProdVariance(JTable tableTabelProdVariance) {
        this.tableTabelProdVariance = tableTabelProdVariance;
    }

    public JTextField getTextMapOutletDistiId() {
        return textMapOutletDistiId;
    }

    public void setTextMapOutletDistiId(JTextField textMapOutletDistiId) {
        this.textMapOutletDistiId = textMapOutletDistiId;
    }

    public JTextField getTextMapOutletMSLOutletCode() {
        return textMapOutletMSLOutletCode;
    }

    public void setTextMapOutletMSLOutletCode(JTextField textMapOutletMSLOutletCode) {
        this.textMapOutletMSLOutletCode = textMapOutletMSLOutletCode;
    }

    public JTextField getTextMapOutletMSLOutletName() {
        return textMapOutletMSLOutletName;
    }

    public void setTextMapOutletMSLOutletName(JTextField textMapOutletMSLOutletName) {
        this.textMapOutletMSLOutletName = textMapOutletMSLOutletName;
    }

    public JTextField getTextMapOutletSearchMSLOutletCode() {
        return textMapOutletSearchMSLOutletCode;
    }

    public void setTextMapOutletSearchMSLOutletCode(JTextField textMapOutletSearchMSLOutletCode) {
        this.textMapOutletSearchMSLOutletCode = textMapOutletSearchMSLOutletCode;
    }

    public JTextField getTextMapProductAreaId() {
        return textMapProductAreaId;
    }

    public void setTextMapProductAreaId(JTextField textMapProductAreaId) {
        this.textMapProductAreaId = textMapProductAreaId;
    }

    public JTextField getTextMapProductDistributorId() {
        return textMapProductDistributorId;
    }

    public void setTextMapProductDistributorId(JTextField textMapProductDistributorId) {
        this.textMapProductDistributorId = textMapProductDistributorId;
    }

    public JTextField getTextMapProductIdBrgScylla() {
        return textMapProductIdBrgScylla;
    }

    public void setTextMapProductIdBrgScylla(JTextField textMapProductIdBrgScylla) {
        this.textMapProductIdBrgScylla = textMapProductIdBrgScylla;
    }

    public JTextField getTextMapProductIdSap() {
        return textMapProductIdSap;
    }

    public void setTextMapProductIdSap(JTextField textMapProductIdSap) {
        this.textMapProductIdSap = textMapProductIdSap;
    }

    public JTextField getTextMapProductNamaBarangSAP() {
        return textMapProductNamaBarangSAP;
    }

    public void setTextMapProductNamaBarangSAP(JTextField textMapProductNamaBarangSAP) {
        this.textMapProductNamaBarangSAP = textMapProductNamaBarangSAP;
    }

    public JTextField getTextMapProductSearchIdBrgScylla() {
        return textMapProductSearchIdBrgScylla;
    }

    public void setTextMapProductSearchIdBrgScylla(JTextField textMapProductSearchIdBrgScylla) {
        this.textMapProductSearchIdBrgScylla = textMapProductSearchIdBrgScylla;
    }

    public JTextField getTextMapProductSearchIdSap() {
        return textMapProductSearchIdSap;
    }

    public void setTextMapProductSearchIdSap(JTextField textMapProductSearchIdSap) {
        this.textMapProductSearchIdSap = textMapProductSearchIdSap;
    }

    public JTextField getTextMapProductSearchNamaBarangSAP() {
        return textMapProductSearchNamaBarangSAP;
    }

    public void setTextMapProductSearchNamaBarangSAP(JTextField textMapProductSearchNamaBarangSAP) {
        this.textMapProductSearchNamaBarangSAP = textMapProductSearchNamaBarangSAP;
    }

    public JTextField getTextMapSalesmanCAlamat1() {
        return textMapSalesmanCAlamat1;
    }

    public void setTextMapSalesmanCAlamat1(JTextField textMapSalesmanCAlamat1) {
        this.textMapSalesmanCAlamat1 = textMapSalesmanCAlamat1;
    }

    public JTextField getTextMapSalesmanCAlamat2() {
        return textMapSalesmanCAlamat2;
    }

    public void setTextMapSalesmanCAlamat2(JTextField textMapSalesmanCAlamat2) {
        this.textMapSalesmanCAlamat2 = textMapSalesmanCAlamat2;
    }

    public JTextField getTextMapSalesmanCKota() {
        return textMapSalesmanCKota;
    }

    public void setTextMapSalesmanCKota(JTextField textMapSalesmanCKota) {
        this.textMapSalesmanCKota = textMapSalesmanCKota;
    }

    public JTextField getTextMapSalesmanCTelpon() {
        return textMapSalesmanCTelpon;
    }

    public void setTextMapSalesmanCTelpon(JTextField textMapSalesmanCTelpon) {
        this.textMapSalesmanCTelpon = textMapSalesmanCTelpon;
    }

    public JTextField getTextMapSalesmanDistributorId() {
        return textMapSalesmanDistributorId;
    }

    public void setTextMapSalesmanDistributorId(JTextField textMapSalesmanDistributorId) {
        this.textMapSalesmanDistributorId = textMapSalesmanDistributorId;
    }

    public JTextField getTextMapSalesmanKodeLevel() {
        return textMapSalesmanKodeLevel;
    }

    public JDateChooser getjDateChooseTanggalStokAdjustment() {
        return jDateChooseTanggalStokAdjustment;
    }

    public void setjDateChooseTanggalStokAdjustment(JDateChooser jDateChooseTanggalStokAdjustment) {
        this.jDateChooseTanggalStokAdjustment = jDateChooseTanggalStokAdjustment;
    }

    public void setTextMapSalesmanKodeLevel(JTextField textMapSalesmanKodeLevel) {
        this.textMapSalesmanKodeLevel = textMapSalesmanKodeLevel;
    }

    public JTextField getTextMapSalesmanRTTPCode() {
        return textMapSalesmanRTTPCode;
    }

    public void setTextMapSalesmanRTTPCode(JTextField textMapSalesmanRTTPCode) {
        this.textMapSalesmanRTTPCode = textMapSalesmanRTTPCode;
    }

    public JTextField getTextMapSalesmanSalesmanId() {
        return textMapSalesmanSalesmanId;
    }

    public void setTextMapSalesmanSalesmanId(JTextField textMapSalesmanSalesmanId) {
        this.textMapSalesmanSalesmanId = textMapSalesmanSalesmanId;
    }

    public JTextField getTextMapSalesmanSalesmanName() {
        return textMapSalesmanSalesmanName;
    }

    public void setTextMapSalesmanSalesmanName(JTextField textMapSalesmanSalesmanName) {
        this.textMapSalesmanSalesmanName = textMapSalesmanSalesmanName;
    }


    public JTextField getTextTabelKeyAccountKeterangan() {
        return textTabelKeyAccountKeterangan;
    }

    public void setTextTabelKeyAccountKeterangan(JTextField textTabelKeyAccountKeterangan) {
        this.textTabelKeyAccountKeterangan = textTabelKeyAccountKeterangan;
    }

    public JTextField getTextTabelKeyAccountKodeKa() {
        return textTabelKeyAccountKodeKa;
    }

    public void setTextTabelKeyAccountKodeKa(JTextField textTabelKeyAccountKodeKa) {
        this.textTabelKeyAccountKodeKa = textTabelKeyAccountKodeKa;
    }

    public JTextField getTextTabelKeyAccountNama() {
        return textTabelKeyAccountNama;
    }

    public void setTextTabelKeyAccountNama(JTextField textTabelKeyAccountNama) {
        this.textTabelKeyAccountNama = textTabelKeyAccountNama;
    }

    public JTextField getTextTabelOutletChainKodeChain() {
        return textTabelOutletChainKodeChain;
    }

    public void setTextTabelOutletChainKodeChain(JTextField textTabelOutletChainKodeChain) {
        this.textTabelOutletChainKodeChain = textTabelOutletChainKodeChain;
    }

    public JTextField getTextTabelOutletChainNamaChain() {
        return textTabelOutletChainNamaChain;
    }

    public void setTextTabelOutletChainNamaChain(JTextField textTabelOutletChainNamaChain) {
        this.textTabelOutletChainNamaChain = textTabelOutletChainNamaChain;
    }

    public JTextField getTextTabelOutletClassOutletClassId() {
        return textTabelOutletClassOutletClassId;
    }

    public void setTextTabelOutletClassOutletClassId(JTextField textTabelOutletClassOutletClassId) {
        this.textTabelOutletClassOutletClassId = textTabelOutletClassOutletClassId;
    }

    public JTextField getTextTabelOutletClassOutletClassNm() {
        return textTabelOutletClassOutletClassNm;
    }

    public void setTextTabelOutletClassOutletClassNm(JTextField textTabelOutletClassOutletClassNm) {
        this.textTabelOutletClassOutletClassNm = textTabelOutletClassOutletClassNm;
    }

    public JTextField getTextTabelOutletGroupOutletGroupId() {
        return textTabelOutletGroupOutletGroupId;
    }

    public void setTextTabelOutletGroupOutletGroupId(JTextField textTabelOutletGroupOutletGroupId) {
        this.textTabelOutletGroupOutletGroupId = textTabelOutletGroupOutletGroupId;
    }

    public JTextField getTextTabelOutletGroupOutletGroupNm() {
        return textTabelOutletGroupOutletGroupNm;
    }

    public void setTextTabelOutletGroupOutletGroupNm(JTextField textTabelOutletGroupOutletGroupNm) {
        this.textTabelOutletGroupOutletGroupNm = textTabelOutletGroupOutletGroupNm;
    }

    public JTextField getTextTabelOutletLocationKodeLokasi() {
        return textTabelOutletLocationKodeLokasi;
    }

    public void setTextTabelOutletLocationKodeLokasi(JTextField textTabelOutletLocationKodeLokasi) {
        this.textTabelOutletLocationKodeLokasi = textTabelOutletLocationKodeLokasi;
    }

    public JTextField getTextTabelOutletLocationNamaLokasi() {
        return textTabelOutletLocationNamaLokasi;
    }

    public void setTextTabelOutletLocationNamaLokasi(JTextField textTabelOutletLocationNamaLokasi) {
        this.textTabelOutletLocationNamaLokasi = textTabelOutletLocationNamaLokasi;
    }

    public JTextField getTextTabelOutletSizeKodeSize() {
        return textTabelOutletSizeKodeSize;
    }

    public JTextField getTextTabelOutletSizelNamaSize() {
        return textTabelOutletSizelNamaSize;
    }

    public void setTextTabelOutletSizelNamaSize(JTextField textTabelOutletSizelNamaSize) {
        this.textTabelOutletSizelNamaSize = textTabelOutletSizelNamaSize;
    }

    public void setTextTabelOutletSizeKodeSize(JTextField textTabelOutletSizeKodeSize) {
        this.textTabelOutletSizeKodeSize = textTabelOutletSizeKodeSize;
    }

    public JTextField getTextTabelOutletSubGroupOutletSubGroupId() {
        return textTabelOutletSubGroupOutletSubGroupId;
    }

    public void setTextTabelOutletSubGroupOutletSubGroupId(JTextField textTabelOutletSubGroupOutletSubGroupId) {
        this.textTabelOutletSubGroupOutletSubGroupId = textTabelOutletSubGroupOutletSubGroupId;
    }

    public JTextField getTextTabelOutletSubGroupOutletSubGroupNm() {
        return textTabelOutletSubGroupOutletSubGroupNm;
    }

    public void setTextTabelOutletSubGroupOutletSubGroupNm(JTextField textTabelOutletSubGroupOutletSubGroupNm) {
        this.textTabelOutletSubGroupOutletSubGroupNm = textTabelOutletSubGroupOutletSubGroupNm;
    }

    public JTextField getTextTabelOutletTypeKodeType() {
        return textTabelOutletTypeKodeType;
    }

    public void setTextTabelOutletTypeKodeType(JTextField textTabelOutletTypeKodeType) {
        this.textTabelOutletTypeKodeType = textTabelOutletTypeKodeType;
    }

    public JTextField getTextTabelOutletTypeNamaType() {
        return textTabelOutletTypeNamaType;
    }

    public void setTextTabelOutletTypeNamaType(JTextField textTabelOutletTypeNamaType) {
        this.textTabelOutletTypeNamaType = textTabelOutletTypeNamaType;
    }

    public JTextField getTextTabelProdBrandBrandId() {
        return textTabelProdBrandBrandId;
    }

    public void setTextTabelProdBrandBrandId(JTextField textTabelProdBrandBrandId) {
        this.textTabelProdBrandBrandId = textTabelProdBrandBrandId;
    }

    public JTextField getTextTabelProdBrandBrandNm() {
        return textTabelProdBrandBrandNm;
    }

    public void setTextTabelProdBrandBrandNm(JTextField textTabelProdBrandBrandNm) {
        this.textTabelProdBrandBrandNm = textTabelProdBrandBrandNm;
    }

    public JTextField getTextTabelProdCategCatedId() {
        return textTabelProdCategCatedId;
    }

    public void setTextTabelProdCategCatedId(JTextField textTabelProdCategCatedId) {
        this.textTabelProdCategCatedId = textTabelProdCategCatedId;
    }

    public JTextField getTextTabelProdCategCategNm() {
        return textTabelProdCategCategNm;
    }

    public void setTextTabelProdCategCategNm(JTextField textTabelProdCategCategNm) {
        this.textTabelProdCategCategNm = textTabelProdCategCategNm;
    }


    public JTextField getTextTabelProdSubBrandSubBrandId() {
        return textTabelProdSubBrandSubBrandId;
    }

    public void setTextTabelProdSubBrandSubBrandId(JTextField textTabelProdSubBrandSubBrandId) {
        this.textTabelProdSubBrandSubBrandId = textTabelProdSubBrandSubBrandId;
    }

    public JTextField getTextTabelProdSubBrandSubBrandNm() {
        return textTabelProdSubBrandSubBrandNm;
    }

    public void setTextTabelProdSubBrandSubBrandNm(JTextField textTabelProdSubBrandSubBrandNm) {
        this.textTabelProdSubBrandSubBrandNm = textTabelProdSubBrandSubBrandNm;
    }

    public JTextField getTextTabelProdSubCategSubCategId() {
        return textTabelProdSubCategSubCategId;
    }

    public void setTextTabelProdSubCategSubCategId(JTextField textTabelProdSubCategSubCategId) {
        this.textTabelProdSubCategSubCategId = textTabelProdSubCategSubCategId;
    }

    public JTextField getTextTabelProdSubCategSubCategNm() {
        return textTabelProdSubCategSubCategNm;
    }

    public void setTextTabelProdSubCategSubCategNm(JTextField textTabelProdSubCategSubCategNm) {
        this.textTabelProdSubCategSubCategNm = textTabelProdSubCategSubCategNm;
    }

    public JTextField getTextTabelProdDivisiDivisiId() {
        return textTabelProdDivisiDivisiId;
    }

    public void setTextTabelProdDivisiDivisiId(JTextField textTabelProdDivisiDivisiId) {
        this.textTabelProdDivisiDivisiId = textTabelProdDivisiDivisiId;
    }

    public JTextField getTextTabelProdDivisiDivisiNm() {
        return textTabelProdDivisiDivisiNm;
    }

    public void setTextTabelProdDivisiDivisiNm(JTextField textTabelProdDivisiDivisiNm) {
        this.textTabelProdDivisiDivisiNm = textTabelProdDivisiDivisiNm;
    }

    public JTextField getTextTabelProdSizeSizeId() {
        return textTabelProdSizeSizeId;
    }

    public void setTextTabelProdSizeSizeId(JTextField textTabelProdSizeSizeId) {
        this.textTabelProdSizeSizeId = textTabelProdSizeSizeId;
    }

    public JTextField getTextTabelProdSizeSizeNm() {
        return textTabelProdSizeSizeNm;
    }

    public void setTextTabelProdSizeSizeNm(JTextField textTabelProdSizeSizeNm) {
        this.textTabelProdSizeSizeNm = textTabelProdSizeSizeNm;
    }

    public JTextField getTextTabelProdVarianceVarianceId() {
        return textTabelProdVarianceVarianceId;
    }

    public void setTextTabelProdVarianceVarianceId(JTextField textTabelProdVarianceVarianceId) {
        this.textTabelProdVarianceVarianceId = textTabelProdVarianceVarianceId;
    }

    public JTextField getTextMapSalesmanSalesmanIdScylla() {
        return textMapSalesmanSalesmanIdScylla;
    }

    public void setTextMapSalesmanSalesmanIdScylla(JTextField textMapSalesmanSalesmanIdScylla) {
        this.textMapSalesmanSalesmanIdScylla = textMapSalesmanSalesmanIdScylla;
    }

    public JTextField getTextTabelProdVarianceVarianceNm() {
        return textTabelProdVarianceVarianceNm;
    }

    public void setTextTabelProdVarianceVarianceNm(JTextField textTabelProdVarianceVarianceNm) {
        this.textTabelProdVarianceVarianceNm = textTabelProdVarianceVarianceNm;
    }


    public JButton getBtnExtractMSalesman() {
        return btnExtractMSalesman;
    }

    public void setBtnExtractMSalesman(JButton btnExtractMSalesman) {
        this.btnExtractMSalesman = btnExtractMSalesman;
    }

    public JButton getBtnExtractMSlsOut() {
        return btnExtractMSlsOut;
    }

    public void setBtnExtractMSlsOut(JButton btnExtractMSlsOut) {
        this.btnExtractMSlsOut = btnExtractMSlsOut;
    }

    public JButton getBtnExtractTAdjStk() {
        return btnExtractTAdjStk;
    }

    public void setBtnExtractTAdjStk(JButton btnExtractTAdjStk) {
        this.btnExtractTAdjStk = btnExtractTAdjStk;
    }

    public JButton getBtnExtractTDatdpr() {
        return btnExtractTDatdpr;
    }

    public void setBtnExtractTDatdpr(JButton btnExtractTDatdpr) {
        this.btnExtractTDatdpr = btnExtractTDatdpr;
    }

    public JButton getBtnExtractTDatdsl() {
        return btnExtractTDatdsl;
    }

    public void setBtnExtractTDatdsl(JButton btnExtractTDatdsl) {
        this.btnExtractTDatdsl = btnExtractTDatdsl;
    }

    public JButton getBtnExtractTDatdsr() {
        return btnExtractTDatdsr;
    }

    public void setBtnExtractTDatdsr(JButton btnExtractTDatdsr) {
        this.btnExtractTDatdsr = btnExtractTDatdsr;
    }

    public JButton getBtnExtractTDatsri() {
        return btnExtractTDatsri;
    }

    public void setBtnExtractTDatsri(JButton btnExtractTDatsri) {
        this.btnExtractTDatsri = btnExtractTDatsri;
    }

    public JButton getBtnExtractTStok() {
        return btnExtractTStok;
    }

    public void setBtnExtractTStok(JButton btnExtractTStok) {
        this.btnExtractTStok = btnExtractTStok;
    }

    public JButton getBtnPathInputBarangDatang() {
        return btnPathInputBarangDatang;
    }

    public void setBtnPathInputBarangDatang(JButton btnPathInputBarangDatang) {
        this.btnPathInputBarangDatang = btnPathInputBarangDatang;
    }

    public JButton getBtnPathInputReturKePabrik() {
        return btnPathInputReturKePabrik;
    }

    public void setBtnPathInputReturKePabrik(JButton btnPathInputReturKePabrik) {
        this.btnPathInputReturKePabrik = btnPathInputReturKePabrik;
    }

    public JButton getBtnPathInputStokAdjustment() {
        return btnPathInputStokAdjustment;
    }

    public void setBtnPathInputStokAdjustment(JButton btnPathInputStokAdjustment) {
        this.btnPathInputStokAdjustment = btnPathInputStokAdjustment;
    }

    public JButton getBtnRetrieveInputBarangDatang() {
        return btnRetrieveInputBarangDatang;
    }

    public void setBtnRetrieveInputBarangDatang(JButton btnRetrieveInputBarangDatang) {
        this.btnRetrieveInputBarangDatang = btnRetrieveInputBarangDatang;
    }

    public JButton getBtnRetrieveInputReturKePabrik() {
        return btnRetrieveInputReturKePabrik;
    }

    public void setBtnRetrieveInputReturKePabrik(JButton btnRetrieveInputReturKePabrik) {
        this.btnRetrieveInputReturKePabrik = btnRetrieveInputReturKePabrik;
    }

    public JButton getBtnRetrieveInputStokAdjustment() {
        return btnRetrieveInputStokAdjustment;
    }

    public void setBtnRetrieveInputStokAdjustment(JButton btnRetrieveInputStokAdjustment) {
        this.btnRetrieveInputStokAdjustment = btnRetrieveInputStokAdjustment;
    }

    public JTextField getTextPathInputBarangDatang() {
        return textPathInputBarangDatang;
    }

    public void setTextPathInputBarangDatang(JTextField textPathInputBarangDatang) {
        this.textPathInputBarangDatang = textPathInputBarangDatang;
    }

    public JTextField getTextPathInputReturKePabrik() {
        return textPathInputReturKePabrik;
    }

    public void setTextPathInputReturKePabrik(JTextField textPathInputReturKePabrik) {
        this.textPathInputReturKePabrik = textPathInputReturKePabrik;
    }

    public JTextField getTextPathInputStokAdjustment() {
        return textPathInputStokAdjustment;
    }

    public void setTextPathInputStokAdjustment(JTextField textPathInputStokAdjustment) {
        this.textPathInputStokAdjustment = textPathInputStokAdjustment;
    }

    public JPanel getjPanelTabMasterProduct() {
        return jPanelTabMasterProduct;
    }

    public void setjPanelTabMasterProduct(JPanel jPanelTabMasterProduct) {
        this.jPanelTabMasterProduct = jPanelTabMasterProduct;
    }

    public JButton getBtnMapOutletReload() {
        return btnMapOutletReload;
    }

    public void setBtnMapOutletReload(JButton btnMapOutletReload) {
        this.btnMapOutletReload = btnMapOutletReload;
    }

    public JButton getBtnMapProductReload() {
        return btnMapProductReload;
    }

    public void setBtnMapProductReload(JButton btnMapProductReload) {
        this.btnMapProductReload = btnMapProductReload;
    }

    public JButton getBtnMapSalesmanReload() {
        return btnMapSalesmanReload;
    }

    public void setBtnMapSalesmanReload(JButton btnMapSalesmanReload) {
        this.btnMapSalesmanReload = btnMapSalesmanReload;
    }

    public JCheckBox getCheckMapOutletSearchBaruSaja() {
        return checkMapOutletSearchBaruSaja;
    }

    public void setCheckMapOutletSearchBaruSaja(JCheckBox checkMapOutletSearchBaruSaja) {
        this.checkMapOutletSearchBaruSaja = checkMapOutletSearchBaruSaja;
    }

    public JCheckBox getCheckMapProductSearchBaruSaja() {
        return checkMapProductSearchBaruSaja;
    }

    public void setCheckMapProductSearchBaruSaja(JCheckBox checkMapProductSearchBaruSaja) {
        this.checkMapProductSearchBaruSaja = checkMapProductSearchBaruSaja;
    }

    public JButton getBtnBackupAndRestoreBackupPath() {
        return btnBackupAndRestoreBackupPath;
    }

    public void setBtnBackupAndRestoreBackupPath(JButton btnBackupAndRestoreBackupPath) {
        this.btnBackupAndRestoreBackupPath = btnBackupAndRestoreBackupPath;
    }

    public JButton getBtnBackupAndRestoreBackupStartBackup() {
        return btnBackupAndRestoreBackupStartBackup;
    }

    public void setBtnBackupAndRestoreBackupStartBackup(JButton btnBackupAndRestoreBackupStartBackup) {
        this.btnBackupAndRestoreBackupStartBackup = btnBackupAndRestoreBackupStartBackup;
    }

    public JButton getBtnBackupAndRestoreRestorePath() {
        return btnBackupAndRestoreRestorePath;
    }

    public void setBtnBackupAndRestoreRestorePath(JButton btnBackupAndRestoreRestorePath) {
        this.btnBackupAndRestoreRestorePath = btnBackupAndRestoreRestorePath;
    }

    public JButton getBtnBackupAndRestoreRestoreStartRestore() {
        return btnBackupAndRestoreRestoreStartRestore;
    }

    public void setBtnBackupAndRestoreRestoreStartRestore(JButton btnBackupAndRestoreRestoreStartRestore) {
        this.btnBackupAndRestoreRestoreStartRestore = btnBackupAndRestoreRestoreStartRestore;
    }

    public JCheckBox getCheckBackupAndRestoreBackupTabelTabel() {
        return checkBackupAndRestoreBackupTabelTabel;
    }

    public void setCheckBackupAndRestoreBackupTabelTabel(JCheckBox checkBackupAndRestoreBackupTabelTabel) {
        this.checkBackupAndRestoreBackupTabelTabel = checkBackupAndRestoreBackupTabelTabel;
    }

    public JCheckBox getCheckBackupAndRestoreRestoreFileMaster() {
        return checkBackupAndRestoreRestoreFileMaster;
    }

    public void setCheckBackupAndRestoreRestoreFileMaster(JCheckBox checkBackupAndRestoreRestoreFileMaster) {
        this.checkBackupAndRestoreRestoreFileMaster = checkBackupAndRestoreRestoreFileMaster;
    }

    public JCheckBox getCheckBackupAndRestoreRestoreOverwrite() {
        return checkBackupAndRestoreRestoreOverwrite;
    }

    public void setCheckBackupAndRestoreRestoreOverwrite(JCheckBox checkBackupAndRestoreRestoreOverwrite) {
        this.checkBackupAndRestoreRestoreOverwrite = checkBackupAndRestoreRestoreOverwrite;
    }

    public JCheckBox getCheckBackupAndRestoreRestoreTabelTabel() {
        return checkBackupAndRestoreRestoreTabelTabel;
    }

    public void setCheckBackupAndRestoreRestoreTabelTabel(JCheckBox checkBackupAndRestoreRestoreTabelTabel) {
        this.checkBackupAndRestoreRestoreTabelTabel = checkBackupAndRestoreRestoreTabelTabel;
    }

    public JCheckBox getCheckBackupRestoreBackupFileMaster() {
        return checkBackupRestoreBackupFileMaster;
    }

    public void setCheckBackupRestoreBackupFileMaster(JCheckBox checkBackupRestoreBackupFileMaster) {
        this.checkBackupRestoreBackupFileMaster = checkBackupRestoreBackupFileMaster;
    }

    public JTextField getTextBackupAndRestoreBackupPath() {
        return textBackupAndRestoreBackupPath;
    }

    public void setTextBackupAndRestoreBackupPath(JTextField textBackupAndRestoreBackupPath) {
        this.textBackupAndRestoreBackupPath = textBackupAndRestoreBackupPath;
    }

    public JTextField getTextBackupAndRestoreRestorePath() {
        return textBackupAndRestoreRestorePath;
    }

    public void setTextBackupAndRestoreRestorePath(JTextField textBackupAndRestoreRestorePath) {
        this.textBackupAndRestoreRestorePath = textBackupAndRestoreRestorePath;
    }

    public JTable getTableInputBarangDatang() {
        return tableInputBarangDatang;
    }

    public void setTableInputBarangDatang(JTable tableInputBarangDatang) {
        this.tableInputBarangDatang = tableInputBarangDatang;
    }

    public JTable getTableInputReturKePabrik() {
        return tableInputReturKePabrik;
    }

    public void setTableInputReturKePabrik(JTable tableInputReturKePabrik) {
        this.tableInputReturKePabrik = tableInputReturKePabrik;
    }

    public JTable getTableInputStockAdjustment() {
        return tableInputStockAdjustment;
    }

    public void setTableInputStockAdjustment(JTable tableInputStockAdjustment) {
        this.tableInputStockAdjustment = tableInputStockAdjustment;
    }

    public JButton getBtnTabelOutletClassDelete() {
        return btnTabelOutletClassDelete;
    }

    public void setBtnTabelOutletClassDelete(JButton btnTabelOutletClassDelete) {
        this.btnTabelOutletClassDelete = btnTabelOutletClassDelete;
    }

    public JButton getBtnTabelOutletClassSave() {
        return btnTabelOutletClassSave;
    }

    public void setBtnTabelOutletClassSave(JButton btnTabelOutletClassSave) {
        this.btnTabelOutletClassSave = btnTabelOutletClassSave;
    }

    public JButton getBtnTabelOutletSubGroupDelete() {
        return btnTabelOutletSubGroupDelete;
    }

    public void setBtnTabelOutletSubGroupDelete(JButton btnTabelOutletSubGroupDelete) {
        this.btnTabelOutletSubGroupDelete = btnTabelOutletSubGroupDelete;
    }

    public JButton getBtnTabelOutletSubGroupSave() {
        return btnTabelOutletSubGroupSave;
    }

    public void setBtnTabelOutletSubGroupSave(JButton btnTabelOutletSubGroupSave) {
        this.btnTabelOutletSubGroupSave = btnTabelOutletSubGroupSave;
    }

    public JButton getBtnTabelProdSubBrandDelete() {
        return btnTabelProdSubBrandDelete;
    }

    public void setBtnTabelProdSubBrandDelete(JButton btnTabelProdSubBrandDelete) {
        this.btnTabelProdSubBrandDelete = btnTabelProdSubBrandDelete;
    }

    public JButton getBtnTabelProdSubBrandSave() {
        return btnTabelProdSubBrandSave;
    }

    public void setBtnTabelProdSubBrandSave(JButton btnTabelProdSubBrandSave) {
        this.btnTabelProdSubBrandSave = btnTabelProdSubBrandSave;
    }

    public JCheckBox getCheckBackupAndRestoreRestoreGantiDenganDataBaru() {
        return checkBackupAndRestoreRestoreGantiDenganDataBaru;
    }

    public void setCheckBackupAndRestoreRestoreGantiDenganDataBaru(JCheckBox checkBackupAndRestoreRestoreGantiDenganDataBaru) {
        this.checkBackupAndRestoreRestoreGantiDenganDataBaru = checkBackupAndRestoreRestoreGantiDenganDataBaru;
    }

    public JTextField getTextMapOutletScyOutletCode() {
        return textMapOutletScyOutletCode;
    }

    public void setTextMapOutletScyOutletCode(JTextField textMapOutletScyOutletCode) {
        this.textMapOutletScyOutletCode = textMapOutletScyOutletCode;
    }

    public JTextField getTextMapOutletSearchScyOutletCode() {
        return textMapOutletSearchScyOutletCode;
    }

    public void setTextMapOutletSearchScyOutletCode(JTextField textMapOutletSearchScyOutletCode) {
        this.textMapOutletSearchScyOutletCode = textMapOutletSearchScyOutletCode;
    }

    public JButton getBtnOutputTAdjstkReload() {
        return btnOutputTAdjstkReload;
    }

    public void setBtnOutputTAdjstkReload(JButton btnOutputTAdjstkReload) {
        this.btnOutputTAdjstkReload = btnOutputTAdjstkReload;
    }

    public JButton getBtnOutputTDatdprReload() {
        return btnOutputTDatdprReload;
    }

    public void setBtnOutputTDatdprReload(JButton btnOutputTDatdprReload) {
        this.btnOutputTDatdprReload = btnOutputTDatdprReload;
    }

    public JButton getBtnOutputTDatdslReload() {
        return btnOutputTDatdslReload;
    }

    public void setBtnOutputTDatdslReload(JButton btnOutputTDatdslReload) {
        this.btnOutputTDatdslReload = btnOutputTDatdslReload;
    }

    public JButton getBtnOutputTDatdsrReload() {
        return btnOutputTDatdsrReload;
    }

    public void setBtnOutputTDatdsrReload(JButton btnOutputTDatdsrReload) {
        this.btnOutputTDatdsrReload = btnOutputTDatdsrReload;
    }

    public JButton getBtnOutputTDatsriReload() {
        return btnOutputTDatsriReload;
    }

    public void setBtnOutputTDatsriReload(JButton btnOutputTDatsriReload) {
        this.btnOutputTDatsriReload = btnOutputTDatsriReload;
    }

    public JButton getBtnOutputTOutletReload() {
        return btnOutputTOutletReload;
    }

    public JTextField getTextDistributorName() {
        return textDistributorName;
    }

    public void setTextDistributorName(JTextField textDistributorName) {
        this.textDistributorName = textDistributorName;
    }

    public void setBtnOutputTOutletReload(JButton btnOutputTOutletReload) {
        this.btnOutputTOutletReload = btnOutputTOutletReload;
    }

    public JButton getBtnOutputTSalesmanReload() {
        return btnOutputTSalesmanReload;
    }

    public void setBtnOutputTSalesmanReload(JButton btnOutputTSalesmanReload) {
        this.btnOutputTSalesmanReload = btnOutputTSalesmanReload;
    }

    public JButton getBtnOutputTStokReload() {
        return btnOutputTStokReload;
    }

    public void setBtnOutputTStokReload(JButton btnOutputTStokReload) {
        this.btnOutputTStokReload = btnOutputTStokReload;
    }

    public JRadioButton getRadioBackupAndRestoreBackupCommaDelimeted() {
        return radioBackupAndRestoreBackupCommaDelimeted;
    }

    public void setRadioBackupAndRestoreBackupCommaDelimeted(JRadioButton radioBackupAndRestoreBackupCommaDelimeted) {
        this.radioBackupAndRestoreBackupCommaDelimeted = radioBackupAndRestoreBackupCommaDelimeted;
    }

    public JRadioButton getRadioBackupAndRestoreBackupTabDelimeted() {
        return radioBackupAndRestoreBackupTabDelimeted;
    }

    public void setRadioBackupAndRestoreBackupTabDelimeted(JRadioButton radioBackupAndRestoreBackupTabDelimeted) {
        this.radioBackupAndRestoreBackupTabDelimeted = radioBackupAndRestoreBackupTabDelimeted;
    }

    public JCheckBox getCheckMapOutletAktif() {
        return checkMapOutletAktif;
    }

    public void setCheckMapOutletAktif(JCheckBox checkMapOutletAktif) {
        this.checkMapOutletAktif = checkMapOutletAktif;
    }

    public JCheckBox getCheckMapOutletBaru() {
        return checkMapOutletBaru;
    }

    public void setCheckMapOutletBaru(JCheckBox checkMapOutletBaru) {
        this.checkMapOutletBaru = checkMapOutletBaru;
    }

    public JCheckBox getCheckMapOutletDikirim() {
        return checkMapOutletDikirim;
    }

    public void setCheckMapOutletDikirim(JCheckBox checkMapOutletDikirim) {
        this.checkMapOutletDikirim = checkMapOutletDikirim;
    }

    public JCheckBox getCheckMapOutletSearchAktifSaja() {
        return checkMapOutletSearchAktifSaja;
    }

    public void setCheckMapOutletSearchAktifSaja(JCheckBox checkMapOutletSearchAktifSaja) {
        this.checkMapOutletSearchAktifSaja = checkMapOutletSearchAktifSaja;
    }

    public JCheckBox getCheckMapOutletSearchDikirimSaja() {
        return checkMapOutletSearchDikirimSaja;
    }

    public void setCheckMapOutletSearchDikirimSaja(JCheckBox checkMapOutletSearchDikirimSaja) {
        this.checkMapOutletSearchDikirimSaja = checkMapOutletSearchDikirimSaja;
    }

    public JCheckBox getCheckMapProductBaru() {
        return checkMapProductBaru;
    }

    public void setCheckMapProductBaru(JCheckBox checkMapProductBaru) {
        this.checkMapProductBaru = checkMapProductBaru;
    }

    public JCheckBox getCheckMapProductAktif() {
        return checkMapProductAktif;
    }

    public void setCheckMapProductAktif(JCheckBox checkMapProductAktif) {
        this.checkMapProductAktif = checkMapProductAktif;
    }

    public JCheckBox getCheckMapProductBonus() {
        return checkMapProductBonus;
    }

    public void setCheckMapProductBonus(JCheckBox checkMapProductBonus) {
        this.checkMapProductBonus = checkMapProductBonus;
    }

    public JCheckBox getCheckMapProductDikirim() {
        return checkMapProductDikirim;
    }

    public void setCheckMapProductDikirim(JCheckBox checkMapProductDikirim) {
        this.checkMapProductDikirim = checkMapProductDikirim;
    }


    public JCheckBox getCheckMapProductSearchAktifSaja() {
        return checkMapProductSearchAktifSaja;
    }

    public void setCheckMapProductSearchAktifSaja(JCheckBox checkMapProductSearchAktifSaja) {
        this.checkMapProductSearchAktifSaja = checkMapProductSearchAktifSaja;
    }

    public JCheckBox getCheckMapProductSearchBonusSaja() {
        return checkMapProductSearchBonusSaja;
    }

    public void setCheckMapProductSearchBonusSaja(JCheckBox checkMapProductSearchBonusSaja) {
        this.checkMapProductSearchBonusSaja = checkMapProductSearchBonusSaja;
    }

    public JCheckBox getCheckMapProductSearchDikirimSaja() {
        return checkMapProductSearchDikirimSaja;
    }

    public void setCheckMapProductSearchDikirimSaja(JCheckBox checkMapProductSearchDikirimSaja) {
        this.checkMapProductSearchDikirimSaja = checkMapProductSearchDikirimSaja;
    }

    public JCheckBox getCheckMapOutletSearchSemua() {
        return checkMapOutletSearchSemua;
    }

    public void setCheckMapOutletSearchSemua(JCheckBox checkMapOutletSearchSemua) {
        this.checkMapOutletSearchSemua = checkMapOutletSearchSemua;
    }

    public JCheckBox getCheckMapProductSearchSemua() {
        return checkMapProductSearchSemua;
    }

    public void setCheckMapProductSearchSemua(JCheckBox checkMapProductSearchSemua) {
        this.checkMapProductSearchSemua = checkMapProductSearchSemua;
    }

    public JButton getBtnInputJheaderBaru() {
        return btnInputJheaderBaru;
    }

    public void setBtnInputJheaderBaru(JButton btnInputJheaderBaru) {
        this.btnInputJheaderBaru = btnInputJheaderBaru;
    }

    public JButton getBtnInputJheaderSearch() {
        return btnInputJheaderSearch;
    }

    public void setBtnInputJheaderSearch(JButton btnInputJheaderSearch) {
        this.btnInputJheaderSearch = btnInputJheaderSearch;
    }

    public JButton getBtnInputJheaderUbah() {
        return btnInputJheaderUbah;
    }

    public void setBtnInputJheaderUbah(JButton btnInputJheaderUbah) {
        this.btnInputJheaderUbah = btnInputJheaderUbah;
    }

    public JTextField getTextInputJHeaderSearchIdOrder() {
        return textInputJHeaderSearchIdOrder;
    }

    public void setTextInputJHeaderSearchIdOrder(JTextField textInputJHeaderSearchIdOrder) {
        this.textInputJHeaderSearchIdOrder = textInputJHeaderSearchIdOrder;
    }

    public JTextField getTextInputJHeaderSearchIdOutlet() {
        return textInputJHeaderSearchIdOutlet;
    }

    public void setTextInputJHeaderSearchIdOutlet(JTextField textInputJHeaderSearchIdOutlet) {
        this.textInputJHeaderSearchIdOutlet = textInputJHeaderSearchIdOutlet;
    }

    public JTextField getTextInputJHeaderSearchSalesman() {
        return textInputJHeaderSearchSalesman;
    }

    public void setTextInputJHeaderSearchSalesman(JTextField textInputJHeaderSearchSalesman) {
        this.textInputJHeaderSearchSalesman = textInputJHeaderSearchSalesman;
    }

    public JLabel getLblInputJHeaderFooterInfo() {
        return lblInputJHeaderFooterInfo;
    }

    public void setLblInputJHeaderFooterInfo(JLabel lblInputJHeaderFooterInfo) {
        this.lblInputJHeaderFooterInfo = lblInputJHeaderFooterInfo;
    }

    public JLabel getLblOutputTAdjstkFooterInfo() {
        return lblOutputTAdjstkFooterInfo;
    }

    public void setLblOutputTAdjstkFooterInfo(JLabel lblOutputTAdjstkFooterInfo) {
        this.lblOutputTAdjstkFooterInfo = lblOutputTAdjstkFooterInfo;
    }

    public JLabel getLblOutputTDatdprFooterInfo() {
        return lblOutputTDatdprFooterInfo;
    }

    public void setLblOutputTDatdprFooterInfo(JLabel lblOutputTDatdprFooterInfo) {
        this.lblOutputTDatdprFooterInfo = lblOutputTDatdprFooterInfo;
    }

    public JLabel getLblOutputTDatdslFooterInfo() {
        return lblOutputTDatdslFooterInfo;
    }

    public void setLblOutputTDatdslFooterInfo(JLabel lblOutputTDatdslFooterInfo) {
        this.lblOutputTDatdslFooterInfo = lblOutputTDatdslFooterInfo;
    }

    public JLabel getLblOutputTDatdsrFooterInfo() {
        return lblOutputTDatdsrFooterInfo;
    }

    public void setLblOutputTDatdsrFooterInfo(JLabel lblOutputTDatdsrFooterInfo) {
        this.lblOutputTDatdsrFooterInfo = lblOutputTDatdsrFooterInfo;
    }

    public JLabel getLblOutputTDatsriFooterInfo() {
        return lblOutputTDatsriFooterInfo;
    }

    public void setLblOutputTDatsriFooterInfo(JLabel lblOutputTDatsriFooterInfo) {
        this.lblOutputTDatsriFooterInfo = lblOutputTDatsriFooterInfo;
    }

 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackupAndRestoreBackupPath;
    private javax.swing.JButton btnBackupAndRestoreBackupStartBackup;
    private javax.swing.JButton btnBackupAndRestoreRestorePath;
    private javax.swing.JButton btnBackupAndRestoreRestoreStartRestore;
    private javax.swing.JButton btnExtractAll;
    private javax.swing.JButton btnExtractMSalesman;
    private javax.swing.JButton btnExtractMSlsOut;
    private javax.swing.JButton btnExtractTAdjStk;
    private javax.swing.JButton btnExtractTDatdpr;
    private javax.swing.JButton btnExtractTDatdsl;
    private javax.swing.JButton btnExtractTDatdsr;
    private javax.swing.JButton btnExtractTDatsri;
    private javax.swing.JButton btnExtractTStok;
    private javax.swing.JButton btnGeneralSettingReload;
    private javax.swing.JButton btnGeneralSettingSimpan;
    private javax.swing.JButton btnInputBarangDatangReload;
    private javax.swing.JButton btnInputCvOutletReload;
    private javax.swing.JButton btnInputJheaderBaru;
    private javax.swing.JButton btnInputJheaderReload;
    private javax.swing.JButton btnInputJheaderSearch;
    private javax.swing.JButton btnInputJheaderUbah;
    private javax.swing.JButton btnInputJpcodeReload;
    private javax.swing.JButton btnInputJtprbReload;
    private javax.swing.JButton btnInputJtpruReload;
    private javax.swing.JButton btnInputMasterReload;
    private javax.swing.JButton btnInputOutletReload;
    private javax.swing.JButton btnInputReturKePabrikReload;
    private javax.swing.JButton btnInputSalesmanReload;
    private javax.swing.JButton btnInputStockAdjustmentReload;
    private javax.swing.JButton btnInputStockReload;
    private javax.swing.JButton btnKirimByEmail;
    private javax.swing.JButton btnMapOutletDelete;
    private javax.swing.JButton btnMapOutletReload;
    private javax.swing.JButton btnMapOutletSave;
    private javax.swing.JButton btnMapOutletSearch;
    private javax.swing.JButton btnMapProductDelete;
    private javax.swing.JButton btnMapProductReload;
    private javax.swing.JButton btnMapProductSave;
    private javax.swing.JButton btnMapProductSearch;
    private javax.swing.JButton btnMapSalesmanDelete;
    private javax.swing.JButton btnMapSalesmanReload;
    private javax.swing.JButton btnMapSalesmanSave;
    private javax.swing.JButton btnMapTipeOutletHapus;
    private javax.swing.JButton btnMapTipeOutletReload;
    private javax.swing.JButton btnMapTipeOutletSimpan;
    private javax.swing.JButton btnOutputTAdjstkReload;
    private javax.swing.JButton btnOutputTDatdprReload;
    private javax.swing.JButton btnOutputTDatdslReload;
    private javax.swing.JButton btnOutputTDatdsrReload;
    private javax.swing.JButton btnOutputTDatsriReload;
    private javax.swing.JButton btnOutputTOutletReload;
    private javax.swing.JButton btnOutputTSalesmanReload;
    private javax.swing.JButton btnOutputTStokReload;
    private javax.swing.JButton btnPathInputAuto;
    private javax.swing.JButton btnPathInputBarangDatang;
    private javax.swing.JButton btnPathInputClearAll;
    private javax.swing.JButton btnPathInputCvOutlet;
    private javax.swing.JButton btnPathInputJHeader;
    private javax.swing.JButton btnPathInputJPcode;
    private javax.swing.JButton btnPathInputJTprb;
    private javax.swing.JButton btnPathInputJTpru;
    private javax.swing.JButton btnPathInputMaster;
    private javax.swing.JButton btnPathInputOutlet;
    private javax.swing.JButton btnPathInputReloadAll;
    private javax.swing.JButton btnPathInputReturKePabrik;
    private javax.swing.JButton btnPathInputSalesman;
    private javax.swing.JButton btnPathInputStock;
    private javax.swing.JButton btnPathInputStokAdjustment;
    private javax.swing.JButton btnPathOutput;
    private javax.swing.JButton btnRetrieveInputAll;
    private javax.swing.JButton btnRetrieveInputBarangDatang;
    private javax.swing.JButton btnRetrieveInputCvOutlet;
    private javax.swing.JButton btnRetrieveInputJHeader;
    private javax.swing.JButton btnRetrieveInputJPcode;
    private javax.swing.JButton btnRetrieveInputJTprb;
    private javax.swing.JButton btnRetrieveInputJTpru;
    public javax.swing.JButton btnRetrieveInputMaster;
    private javax.swing.JButton btnRetrieveInputOutlet;
    private javax.swing.JButton btnRetrieveInputReturKePabrik;
    private javax.swing.JButton btnRetrieveInputSalesman;
    private javax.swing.JButton btnRetrieveInputStock;
    private javax.swing.JButton btnRetrieveInputStokAdjustment;
    private javax.swing.JButton btnTabelKeyAccountDelete;
    private javax.swing.JButton btnTabelKeyAccountSave;
    private javax.swing.JButton btnTabelOutletChainDelete;
    private javax.swing.JButton btnTabelOutletChainSave;
    private javax.swing.JButton btnTabelOutletClassDelete;
    private javax.swing.JButton btnTabelOutletClassSave;
    private javax.swing.JButton btnTabelOutletGroupDelete;
    private javax.swing.JButton btnTabelOutletGroupSave;
    private javax.swing.JButton btnTabelOutletLocationDelete;
    private javax.swing.JButton btnTabelOutletLocationSave;
    private javax.swing.JButton btnTabelOutletSizeDelete;
    private javax.swing.JButton btnTabelOutletSizeSave;
    private javax.swing.JButton btnTabelOutletSubGroupDelete;
    private javax.swing.JButton btnTabelOutletSubGroupSave;
    private javax.swing.JButton btnTabelOutletTypeDelete;
    private javax.swing.JButton btnTabelOutletTypeSave;
    private javax.swing.JButton btnTabelProdBrandDelete;
    private javax.swing.JButton btnTabelProdBrandSave;
    private javax.swing.JButton btnTabelProdCategDelete;
    private javax.swing.JButton btnTabelProdCategSave;
    private javax.swing.JButton btnTabelProdDivisiDelete;
    private javax.swing.JButton btnTabelProdDivisiSave;
    private javax.swing.JButton btnTabelProdSizeDelete;
    private javax.swing.JButton btnTabelProdSizeSave;
    private javax.swing.JButton btnTabelProdSubBrandDelete;
    private javax.swing.JButton btnTabelProdSubBrandSave;
    private javax.swing.JButton btnTabelProdSubCategDelete;
    private javax.swing.JButton btnTabelProdSubCategSave;
    private javax.swing.JButton btnTabelProdVarianceDelete;
    private javax.swing.JButton btnTabelProdVarianceSave;
    private javax.swing.JCheckBox checkBackupAndRestoreBackupTabelTabel;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreFileMaster;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreGantiDenganDataBaru;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreOverwrite;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreTabelTabel;
    private javax.swing.JCheckBox checkBackupRestoreBackupFileMaster;
    private javax.swing.JCheckBox checkMapOutletAktif;
    private javax.swing.JCheckBox checkMapOutletBaru;
    private javax.swing.JCheckBox checkMapOutletDikirim;
    private javax.swing.JCheckBox checkMapOutletSearchAktifSaja;
    private javax.swing.JCheckBox checkMapOutletSearchBaruSaja;
    private javax.swing.JCheckBox checkMapOutletSearchDikirimSaja;
    private javax.swing.JCheckBox checkMapOutletSearchSemua;
    private javax.swing.JCheckBox checkMapProductAktif;
    private javax.swing.JCheckBox checkMapProductBaru;
    private javax.swing.JCheckBox checkMapProductBonus;
    private javax.swing.JCheckBox checkMapProductDikirim;
    private javax.swing.JCheckBox checkMapProductSearchAktifSaja;
    private javax.swing.JCheckBox checkMapProductSearchBaruSaja;
    private javax.swing.JCheckBox checkMapProductSearchBonusSaja;
    private javax.swing.JCheckBox checkMapProductSearchDikirimSaja;
    private javax.swing.JCheckBox checkMapProductSearchSemua;
    private javax.swing.JCheckBox checkModeDatabase;
    private javax.swing.JCheckBox checkTprbDiluarBarang;
    private javax.swing.JComboBox comboMapOutletAreaId;
    private javax.swing.JComboBox comboMapOutletBSizeId;
    private javax.swing.JComboBox comboMapOutletClassId;
    private javax.swing.JComboBox comboMapOutletGroupId;
    private javax.swing.JComboBox comboMapOutletKeyAccountId;
    private javax.swing.JComboBox comboMapOutletLocationId;
    private javax.swing.JComboBox comboMapOutletNasionalSalesmanCode;
    private javax.swing.JComboBox comboMapOutletOutletType;
    private javax.swing.JComboBox comboMapOutletSalesmanCode;
    private javax.swing.JComboBox comboMapOutletSubGroupId;
    private javax.swing.JComboBox comboMapProductBrand;
    private javax.swing.JComboBox comboMapProductCategory;
    private javax.swing.JComboBox comboMapProductDivisi;
    private javax.swing.JComboBox comboMapProductSize;
    private javax.swing.JComboBox comboMapProductSubBrand;
    private javax.swing.JComboBox comboMapProductSubCategory;
    private javax.swing.JComboBox comboMapProductVariance;
    private com.toedter.calendar.JDateChooser jDateChooseTanggalStock;
    private com.toedter.calendar.JDateChooser jDateChooseTanggalStokAdjustment;
    private com.toedter.calendar.JDateChooser jDateChooserExtract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanelTabMasterProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPaneMapping;
    private javax.swing.JLabel lblInputJHeaderFooterInfo;
    private javax.swing.JLabel lblOutputTAdjstkFooterInfo;
    private javax.swing.JLabel lblOutputTDatdprFooterInfo;
    private javax.swing.JLabel lblOutputTDatdslFooterInfo;
    private javax.swing.JLabel lblOutputTDatdsrFooterInfo;
    private javax.swing.JLabel lblOutputTDatsriFooterInfo;
    private javax.swing.JRadioButton radioBackupAndRestoreBackupCommaDelimeted;
    private javax.swing.JRadioButton radioBackupAndRestoreBackupTabDelimeted;
    private javax.swing.JTable tableInputBarangDatang;
    private javax.swing.JTable tableInputCvOutlet;
    private javax.swing.JTable tableInputJheader;
    private javax.swing.JTable tableInputJpcode;
    private javax.swing.JTable tableInputJtprb;
    private javax.swing.JTable tableInputJtpru;
    private javax.swing.JTable tableInputMaster;
    private javax.swing.JTable tableInputOutlet;
    private javax.swing.JTable tableInputReturKePabrik;
    private javax.swing.JTable tableInputSalesman;
    private javax.swing.JTable tableInputStock;
    private javax.swing.JTable tableInputStockAdjustment;
    private javax.swing.JTable tableMapOutlet;
    private javax.swing.JTable tableMapProduct;
    private javax.swing.JTable tableMapSalesman;
    private javax.swing.JTable tableMappingTipeOutlet;
    private javax.swing.JTable tableOutputTAdjstk;
    private javax.swing.JTable tableOutputTDatdpr;
    private javax.swing.JTable tableOutputTDatdsl;
    private javax.swing.JTable tableOutputTDatdsr;
    private javax.swing.JTable tableOutputTDatsri;
    private javax.swing.JTable tableOutputTOutlet;
    private javax.swing.JTable tableOutputTSalesman;
    private javax.swing.JTable tableOutputTStok;
    private javax.swing.JTable tableTabelKeyAccount;
    private javax.swing.JTable tableTabelOutletChain;
    private javax.swing.JTable tableTabelOutletClass;
    private javax.swing.JTable tableTabelOutletGroup;
    private javax.swing.JTable tableTabelOutletLocation;
    private javax.swing.JTable tableTabelOutletSize;
    private javax.swing.JTable tableTabelOutletSubGroup;
    private javax.swing.JTable tableTabelOutletType;
    private javax.swing.JTable tableTabelProdBrand;
    private javax.swing.JTable tableTabelProdCateg;
    private javax.swing.JTable tableTabelProdDivisi;
    private javax.swing.JTable tableTabelProdSize;
    private javax.swing.JTable tableTabelProdSubBrand;
    private javax.swing.JTable tableTabelProdSubCateg;
    private javax.swing.JTable tableTabelProdVariance;
    private javax.swing.JTextField textBackupAndRestoreBackupPath;
    private javax.swing.JTextField textBackupAndRestoreRestorePath;
    private javax.swing.JTextField textDistributorCode;
    private javax.swing.JTextField textDistributorName;
    private javax.swing.JTextField textEmailFrom;
    private javax.swing.JPasswordField textEmailPassword;
    private javax.swing.JTextField textEmailSubject;
    private javax.swing.JTextField textEmailTo;
    private javax.swing.JTextField textInputJHeaderSearchIdOrder;
    private javax.swing.JTextField textInputJHeaderSearchIdOutlet;
    private javax.swing.JTextField textInputJHeaderSearchSalesman;
    private javax.swing.JTextField textMapOutletDistiId;
    private javax.swing.JTextField textMapOutletMSLOutletCode;
    private javax.swing.JTextField textMapOutletMSLOutletName;
    private javax.swing.JTextField textMapOutletScyOutletCode;
    private javax.swing.JTextField textMapOutletSearchMSLOutletCode;
    private javax.swing.JTextField textMapOutletSearchMSLOutletName;
    private javax.swing.JTextField textMapOutletSearchScyOutletCode;
    private javax.swing.JTextField textMapProductAreaId;
    private javax.swing.JTextField textMapProductDistributorId;
    private javax.swing.JTextField textMapProductIdBrgScylla;
    private javax.swing.JTextField textMapProductIdSap;
    private javax.swing.JTextField textMapProductNamaBarangSAP;
    private javax.swing.JTextField textMapProductSearchIdBrgScylla;
    private javax.swing.JTextField textMapProductSearchIdSap;
    private javax.swing.JTextField textMapProductSearchNamaBarangSAP;
    private javax.swing.JTextField textMapSalesmanCAlamat1;
    private javax.swing.JTextField textMapSalesmanCAlamat2;
    private javax.swing.JTextField textMapSalesmanCKota;
    private javax.swing.JTextField textMapSalesmanCTelpon;
    private javax.swing.JTextField textMapSalesmanDistributorId;
    private javax.swing.JTextField textMapSalesmanKodeLevel;
    private javax.swing.JTextField textMapSalesmanRTTPCode;
    private javax.swing.JTextField textMapSalesmanSalesmanId;
    private javax.swing.JTextField textMapSalesmanSalesmanIdScylla;
    private javax.swing.JTextField textMapSalesmanSalesmanName;
    private javax.swing.JTextField textMapTipeOutletDeskripsi;
    private javax.swing.JTextField textMapTipeOutletIdTipeOutlet;
    private javax.swing.JTextField textMapTipeOutletIdTypeOutletScy;
    private javax.swing.JTextField textPathInputBarangDatang;
    private javax.swing.JTextField textPathInputCvOutlet;
    private javax.swing.JTextField textPathInputJHeader;
    private javax.swing.JTextField textPathInputJPcode;
    private javax.swing.JTextField textPathInputJTprb;
    private javax.swing.JTextField textPathInputJTpru;
    private javax.swing.JTextField textPathInputMaster;
    private javax.swing.JTextField textPathInputOutlet;
    private javax.swing.JTextField textPathInputReturKePabrik;
    private javax.swing.JTextField textPathInputSalesman;
    private javax.swing.JTextField textPathInputStock;
    private javax.swing.JTextField textPathInputStokAdjustment;
    private javax.swing.JTextField textPathOutput;
    private javax.swing.JTextField textRecordTypeClient;
    private javax.swing.JTextField textRecordTypeSales;
    private javax.swing.JTextField textRecordTypeSo;
    private javax.swing.JTextField textRecordTypeStock;
    private javax.swing.JTextField textTabelKeyAccountKeterangan;
    private javax.swing.JTextField textTabelKeyAccountKodeKa;
    private javax.swing.JTextField textTabelKeyAccountNama;
    private javax.swing.JTextField textTabelOutletChainKodeChain;
    private javax.swing.JTextField textTabelOutletChainNamaChain;
    private javax.swing.JTextField textTabelOutletClassOutletClassId;
    private javax.swing.JTextField textTabelOutletClassOutletClassNm;
    private javax.swing.JTextField textTabelOutletGroupOutletGroupId;
    private javax.swing.JTextField textTabelOutletGroupOutletGroupNm;
    private javax.swing.JTextField textTabelOutletLocationKodeLokasi;
    private javax.swing.JTextField textTabelOutletLocationNamaLokasi;
    private javax.swing.JTextField textTabelOutletSizeKodeSize;
    private javax.swing.JTextField textTabelOutletSizelNamaSize;
    private javax.swing.JTextField textTabelOutletSubGroupOutletSubGroupId;
    private javax.swing.JTextField textTabelOutletSubGroupOutletSubGroupNm;
    private javax.swing.JTextField textTabelOutletTypeKodeType;
    private javax.swing.JTextField textTabelOutletTypeNamaType;
    private javax.swing.JTextField textTabelProdBrandBrandId;
    private javax.swing.JTextField textTabelProdBrandBrandNm;
    private javax.swing.JTextField textTabelProdCategCatedId;
    private javax.swing.JTextField textTabelProdCategCategNm;
    private javax.swing.JTextField textTabelProdDivisiDivisiId;
    private javax.swing.JTextField textTabelProdDivisiDivisiNm;
    private javax.swing.JTextField textTabelProdSizeSizeId;
    private javax.swing.JTextField textTabelProdSizeSizeNm;
    private javax.swing.JTextField textTabelProdSubBrandSubBrandId;
    private javax.swing.JTextField textTabelProdSubBrandSubBrandNm;
    private javax.swing.JTextField textTabelProdSubCategSubCategId;
    private javax.swing.JTextField textTabelProdSubCategSubCategNm;
    private javax.swing.JTextField textTabelProdVarianceVarianceId;
    private javax.swing.JTextField textTabelProdVarianceVarianceNm;
    private javax.swing.JTextField textWarehouseWarehouseCode;
    private javax.swing.JTextField textWarehouseWarehouseDescription;
    // End of variables declaration//GEN-END:variables




}
