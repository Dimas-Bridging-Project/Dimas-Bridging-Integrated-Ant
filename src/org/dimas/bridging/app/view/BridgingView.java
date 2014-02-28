/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.app.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTable;
import org.config.spring.hibernate.model.enumpokari.EnumSzStatus;
import org.dimas.bridging.app.model.BridgingModel;

/**
 *
 * @author yhawin
 */
public class BridgingView  extends BridgingViewJFrame{
    //Owner: Model
    Boolean databaseMode = false;
    
    private BridgingModel bridgingModel;
    private BridgingViewVisibility viewVisibility;
    
    public BridgingView(BridgingModel bridgingModel) {
        this.bridgingModel = bridgingModel;
        viewVisibility = new BridgingViewVisibility(this);
        
        init();
    }
    
    public void init(){
        this.setTitle("DIMAS KEDIRI >> BRIDGING ALL >> BAYGON, KEK, POKARI"); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initUserActions();
        initComponentAppearanceDefa();    
        
        //Owner: Controller
        //initActionAdditionalDefa();

    }
     public void initUserActions(){
        
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
        
        this.getCheckMapProductSearchSemua().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 resetSearchMapProduct();
            }
        });
        this.getCheckMapOutletSearchSemua().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetSearchMapOutlet();                
            }
        });
     }
    
    
    private void initComponentAppearanceDefa(){
       /**
        * PAKE SCROLL BAR SEMUA
        */ 
        
        /**
         * TABLE INPUT
         */
        getTableInputCvOutlet().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputCvOutlet().setAutoCreateRowSorter(true);
        getTableInputJheader().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJheader().setAutoCreateRowSorter(true);
        getTableInputJpcode().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJpcode().setAutoCreateRowSorter(true);
        getTableInputJtprb().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJtprb().setAutoCreateRowSorter(true);
        getTableInputJtpru().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJtpru().setAutoCreateRowSorter(true);        
        getTableInputMaster().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputMaster().setAutoCreateRowSorter(true);
        
        getTableInputOutlet().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputOutlet().setAutoCreateRowSorter(true);
        getTableInputSalesman().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputSalesman().setAutoCreateRowSorter(true);
        getTableInputStock().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputStock().setAutoCreateRowSorter(true);
        //Input Tambahan Untuk KEK masih Belum?
        getTableInputBarangDatang().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputBarangDatang().setAutoCreateRowSorter(true);
        getTableInputReturKePabrik().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputReturKePabrik().setAutoCreateRowSorter(true);
        getTableInputStockAdjustment().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputStockAdjustment().setAutoCreateRowSorter(true);
        //Setup Tabel-tabel Tidak Perlu ya?
        //Map Master SAP
        getTableMapProduct().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableMapProduct().setAutoCreateRowSorter(true);
        getTableMapOutlet().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableMapOutlet().setAutoCreateRowSorter(true);
        getTableMapSalesman().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableMapSalesman().setAutoCreateRowSorter(true);

        /**
         * BAYGON : TABLE OUTPUT
         */
        getjPanelSubOutputBaygon1().getTableOutputClient().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputBaygon1().getTableOutputClient().setAutoCreateRowSorter(true);
        getjPanelSubOutputBaygon1().getTableOutputSales().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputBaygon1().getTableOutputSales().setAutoCreateRowSorter(true);
        getjPanelSubOutputBaygon1().getTableOutputSalesOrder().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputBaygon1().getTableOutputSalesOrder().setAutoCreateRowSorter(true);
        getjPanelSubOutputBaygon1().getTableOutputStock().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputBaygon1().getTableOutputStock().setAutoCreateRowSorter(true);
        
        /**
         * KEK : TABLE OUTPUT
         */
        getjPanelSubOutputKek1().getTableOutputTAdjstk().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputKek1().getTableOutputTAdjstk().setAutoCreateRowSorter(true);
        getjPanelSubOutputKek1().getTableOutputTDatdpr().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputKek1().getTableOutputTDatdpr().setAutoCreateRowSorter(true);
        getjPanelSubOutputKek1().getTableOutputTDatdsl().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputKek1().getTableOutputTDatdsl().setAutoCreateRowSorter(true);
        getjPanelSubOutputKek1().getTableOutputTDatdsr().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputKek1().getTableOutputTDatdsr().setAutoCreateRowSorter(true);
        getjPanelSubOutputKek1().getTableOutputTDatsri().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputKek1().getTableOutputTDatsri().setAutoCreateRowSorter(true);
        getjPanelSubOutputKek1().getTableOutputTOutlet().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputKek1().getTableOutputTOutlet().setAutoCreateRowSorter(true);
        getjPanelSubOutputKek1().getTableOutputTSalesman().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputKek1().getTableOutputTSalesman().setAutoCreateRowSorter(true);
        getjPanelSubOutputKek1().getTableOutputTStok().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputKek1().getTableOutputTStok().setAutoCreateRowSorter(true);
        
        getRadioBackupAndRestoreBackupCommaDelimeted().setSelected(true);
        
        /**
         * POKARI : TABLE MAPPING MASTER AND PRODUCT
         */
//        getTableTabelTabelPokariCustomerGroup().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        getTableTabelTabelPokariCustomerHirarchy().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        getTableTabelTabelPokariGroupSales().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        getTableTabelTabelPokariProductBrand().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        getTableTabelTabelPokariSalesTerritory().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        getTableTabelTabelPokariTeamSales().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        getTableTabelTabelPokariTypeSales().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        getTableTabelTabelPokariWorkplace().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        getTableMappingMasterPokariCustomer().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableMappingMasterPokariCustomer().setAutoCreateRowSorter(true);
        getTableMappingMasterPokariEmployee().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableMappingMasterPokariEmployee().setAutoCreateRowSorter(true);
        getTableMappingMasterPokariProduct().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);        
        getTableMappingMasterPokariProduct().setAutoCreateRowSorter(true);
        
        /**
         * POKARI : TABLE OUTPUT
         */
        getjPanelSubOutputPokari1().getTableOutputPokariArCustomer().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputPokari1().getTableOutputPokariArCustomer().setAutoCreateRowSorter(true);
        getjPanelSubOutputPokari1().getTableOutputPokariCanDDeliveryOrder().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputPokari1().getTableOutputPokariCanDDeliveryOrder().setAutoCreateRowSorter(true);
        getjPanelSubOutputPokari1().getTableOutputPokariCanDDeliveryOrderDetail().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputPokari1().getTableOutputPokariCanDDeliveryOrderDetail().setAutoCreateRowSorter(true);
        getjPanelSubOutputPokari1().getTableOutputPokariCanDDeliveryOrderDisc().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputPokari1().getTableOutputPokariCanDDeliveryOrderDisc().setAutoCreateRowSorter(true);
        getjPanelSubOutputPokari1().getTableOutputPokariEmployeeTarget().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputPokari1().getTableOutputPokariEmployeeTarget().setAutoCreateRowSorter(true);
        getjPanelSubOutputPokari1().getTableOutputPokariEmployeeTargetDetail().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputPokari1().getTableOutputPokariEmployeeTargetDetail().setAutoCreateRowSorter(true);
        getjPanelSubOutputPokari1().getTableOutputPokariSpEmployee().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getjPanelSubOutputPokari1().getTableOutputPokariSpEmployee().setAutoCreateRowSorter(true);
       
       
    }
     
    public void resetTeksInputBackground(){
       getTextPathInputCvOutlet().setBackground(Color.WHITE);
       
       getTextPathInputJHeader().setBackground(Color.WHITE);
       getTextPathInputJPcode().setBackground(Color.WHITE);
       getTextPathInputJTprb().setBackground(Color.WHITE);
       getTextPathInputJTpru().setBackground(Color.WHITE);
       getTextPathInputMaster().setBackground(Color.WHITE);
       getTextPathInputOutlet().setBackground(Color.WHITE);
       getTextPathInputSalesman().setBackground(Color.WHITE);
       getTextPathInputStock().setBackground(Color.WHITE);
       
       getTextPathInputBarangDatang().setBackground(Color.WHITE);
       getTextPathInputReturKePabrik().setBackground(Color.WHITE);
       getTextPathInputStokAdjustment().setBackground(Color.WHITE);
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
        
        
        /*
         * KEK
         */ 
        resetTeksTabel();        
        resetTeksMapping();
        resetTeksBackupRestoreKek();
        resetTeksBackupRestorePokari();
        
        resetSearchInputJHeader();
        
        /**
         * POKARI
         */ 
        initComboManualMappingMasterPokari();
        resetTeksTabelTabelPokari();
        resetTeksMappingMasterPokari();
        resetSearchInputHeaderPokari();
        
        /**
         * RESET TEKS OUTPUT
         */ 
        getjPanelGenerateExtractBaygon1().resetTeks();
        getjPanelGenerateExtractKek1().resetTeks();
        getjPanelGenerateExtractPokari1().resetTeks();
    }
    public void resetTeksTabelTabelPokari(){
        getTextTabelTabelPokariCustomerGroupDescription().setText("");
        getTextTabelTabelPokariCustomerGroupIdGroup().setText("");
        getTextTabelTabelPokariCustomerHirarchyDescription().setText("");
        getTextTabelTabelPokariCustomerHirarchyIdHirarchy().setText("");
        getTextTabelTabelPokariGroupSalesName().setText("");
        getTextTabelTabelPokariGroupSalesTypeGroup().setText("");
        getTextTabelTabelPokariProductBrandBrandId().setText("");
        getTextTabelTabelPokariProductBrandName().setText("");
        getTextTabelTabelPokariProductBrandHirarchy().setText("");
        getTextTabelTabelPokariSalesTerritoryDescription().setText("");
        getTextTabelTabelPokariSalesTerritoryIdTerritory().setText("");
        getTextTabelTabelPokariTeamSalesName().setText("");
        getTextTabelTabelPokariTeamSalesTeamId().setText("");
        getTextTabelTabelPokariTypeSalesName().setText("");
        getTextTabelTabelPokariTypeSalesTypeSales().setText("");
        getTextTabelTabelPokariWorkplaceArea().setText("");
        getTextTabelTabelPokariWorkplaceWorkplaceId().setText("");
    }
    
    public void initComboManualMappingMasterPokari(){
        List<String> szStatuses = new ArrayList<>();
        
    }
    public void resetTeksMappingMasterPokari(){
        /**
         * ArCustomer
         */
        getTextMappingMasterPokariCustomerIdPokari().setText("");
        getTextMappingMasterPokariCustomerIdScylla().setText("");
        getTextMappingMasterPokariCustomerName().setText("");
        getTextMappingMasterPokariEmployeeName().setText("");
        getTextMappingMasterPokariEmployeePoliceNo().setText("");
        getTextMappingMasterPokariEmployeeVehicleId().setText("");
        getTextMappingMasterPokariEmployeeVehicleName().setText("");
        
        getTextMappingMasterPokariCustomerAddress().setText("");
        getTextMappingMasterPokariCustomerState().setText("");
        getTextMappingMasterPokariCustomerCity().setText("");
        getTextMappingMasterPokariCustomerDistrict().setText("");
        getTextMappingMasterPokariCustomerZipCode().setText("");
        getTextMappingMasterPokariCustomerPhone().setText("");
        getTextMappingMasterPokariCustomerFax().setText("");
        getTextMappingMasterPokariCustomerContact().setText("");
        getTextMappingMasterPokariCustomerEmail().setText("");
        getTextMappingMasterPokariCustomerLimitCredit().setText("");
        getTextMappingMasterPokariCustomerNPWP().setText("");
        
        /**
         * MappingProduct
         */
        getTextMappingMasterPokariProductIdBrgScylla().setText("");
        getTextMappingMasterPokariProductIdPokari().setText("");
        getTextMappingMasterPokariProductNamaBarang().setText("");
        /**
         * SpEmployee
         */
        getTextMappingMasterPokariEmployeeIdPokari().setText("");
        getTextMappingMasterPokariEmployeeIdScylla().setText("");
    }
    public void resetSearchInputHeaderPokari(){
        getTextMappingMasterPokariCustomerSearchIdPokari().setText("");
        getTextMappingMasterPokariCustomerSearchIdScylla().setText("");
        getTextMappingMasterPokariProductSearchIdBrgScylla().setText("");
        getTextMappingMasterPokariProductSearchIdPokari().setText("");
        getTextMappingMasterPokariCustomerSearchName().setText("");
        getTextMappingMasterPokariProductSearchNamaBarangPokari().setText("");
       
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
       getTextPathInputCvOutlet().setText("");
       getTextPathInputCvOutlet().setText("<< BOLEH KOSONG >>");
       
       getTextPathInputJHeader().setText("");
       getTextPathInputJPcode().setText("");
       getTextPathInputJTprb().setText("");
       getTextPathInputJTpru().setText("");
       getTextPathInputMaster().setText("");
       getTextPathInputOutlet().setText("");
       getTextPathInputSalesman().setText("");
       getTextPathInputStock().setText("");
       
       getTextPathInputBarangDatang().setText("");
       getTextPathInputReturKePabrik().setText("");
       getTextPathInputStokAdjustment().setText("");
       
       getTextPathOutput().setText("");
       
    }
    
    
    public void resetTeksGeneralSetting(){
        getTextDistributorCode().setText("");
        getTextDistributorName().setText("");
        
        getTextRecordTypeClient().setText("");
        getTextRecordTypeSales().setText("");
        getTextRecordTypeSo().setText("");
        getTextRecordTypeStock().setText("");
        
        getTextWarehouseWarehouseCode().setText("");
        getTextWarehouseWarehouseDescription().setText("");
        
        getTextEmailFrom().setText("");
        getTextEmailPassword().setText("");
        getTextEmailTo().setText("");
        getTextEmailSubject().setText("");       
    }
    
    public void resetTeksMappingTipeOutlet(){
        getTextMapTipeOutletDeskripsi().setText("");
        getTextMapTipeOutletIdTipeOutlet().setText("");
        getTextMapTipeOutletIdTypeOutletScy().setText("");
    }
    
    public void resetTeksBackupRestoreKek(){
        getTextBackupAndRestoreBackupPath().setText("");
        getTextBackupAndRestoreRestorePath().setText("");
    }
    public void resetTeksBackupRestorePokari(){
        getTextBackupAndRestoreBackupPathPokari().setText("");
        getTextBackupAndRestoreRestorePathPokari().setText("");
    }

    public BridgingViewVisibility getViewVisibility() {
        return viewVisibility;
    }

    public void setViewVisibility(BridgingViewVisibility viewVisibility) {
        this.viewVisibility = viewVisibility;
    }

    public void renderTableModelPokariMappingMasterArCustomer(){
        getTableMappingMasterPokariCustomer().getColumnModel().getColumn(2).setPreferredWidth(150);
        getTableMappingMasterPokariCustomer().getColumnModel().getColumn(3).setPreferredWidth(210);
        getTableMappingMasterPokariCustomer().getColumnModel().getColumn(4).setPreferredWidth(280);
        getTableMappingMasterPokariCustomer().getColumnModel().getColumn(5).setPreferredWidth(0);
        getTableMappingMasterPokariCustomer().getColumnModel().getColumn(6).setPreferredWidth(0);
        }     
    public void renderTableModelPokariMappingMasterProduct(){
        getTableMappingMasterPokariProduct().getColumnModel().getColumn(2).setPreferredWidth(150);
        getTableMappingMasterPokariProduct().getColumnModel().getColumn(3).setPreferredWidth(250);
    }     
    public void renderTableModelPokariMappingMasterSpEmployee(){
        getTableMappingMasterPokariEmployee().getColumnModel().getColumn(2).setPreferredWidth(150);
        getTableMappingMasterPokariEmployee().getColumnModel().getColumn(3).setPreferredWidth(250);
    }     
    
}
