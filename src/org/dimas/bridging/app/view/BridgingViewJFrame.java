/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.app.view;

import com.toedter.calendar.JDateChooser;
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
public class BridgingViewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form BridgingUI
     */
   
    JPanelSubOutputPokari jPanelSubOutputPokari1 = new JPanelSubOutputPokari();
    JPanelSubOutputKek jPanelSubOutputKek1 = new JPanelSubOutputKek();
    JPanelSubOutputBaygon jPanelSubOutputBaygon1 = new JPanelSubOutputBaygon();
    
    public BridgingViewJFrame() {
        initComponents();
        ///KITA TARUH DI VIEW
        //initUserActions();
        initManualConfigureNetbeansGoblok();
        //jPanelSubOutputPokari1 = new JPanelSubOutputPokari();
    }

    void initManualConfigureNetbeansGoblok(){  
    }
    
    public JPanelSubOutputPokari getjPanelSubOutputPokari1() {
        return jPanelSubOutputPokari1;
    }

    public JPanelSubOutputKek getjPanelSubOutputKek1() {
        return jPanelSubOutputKek1;
    }

    public JPanelSubOutputBaygon getjPanelSubOutputBaygon1() {
        return jPanelSubOutputBaygon1;
    }
    
    //############################
    public JPanel getJPanelMappingMasterPokariCustomerDetail(){
        return jPanelMappingMasterPokariCustomerDetail;
    }
    
    public JPanel getJPanelMappingMasterPokariEmployeeDetail(){
        return jPanelMappingMasterPokariEmployeeDetail;
    }
    public JPanel getJPanelMappingMasterPokariProdukDetail(){
        return jPanelMappingMasterPokariProdukDetail;
    }
    
   //LABEL RETRIEVE UNTUK INFO
    public JLabel getjLabelInputScyllaCvOutlet() {
        return jLabelInputScyllaCvOutlet;
    }

    public JLabel getjLabelInputScyllaJHeader() {
        return jLabelInputScyllaJHeader;
    }

    public JLabel getjLabelInputScyllaJPCode() {
        return jLabelInputScyllaJPCode;
    }

    public JLabel getjLabelInputScyllaJTprb() {
        return jLabelInputScyllaJTprb;
    }

    public JLabel getjLabelInputScyllaJTpru() {
        return jLabelInputScyllaJTpru;
    }

    public JLabel getjLabelInputScyllaMasterProduk() {
        return jLabelInputScyllaMasterProduk;
    }

    public JLabel getjLabelInputScyllaOutlet() {
        return jLabelInputScyllaOutlet;
    }
    
    public JLabel getjLabelInputScyllaSalesman() {
        return jLabelInputScyllaSalesman;
    }
    public JLabel getjLabelInputScyllaBarangDatang(){
        return jLabelInputScyllaBarangDatang;
    }
    public JLabel getjLabelInputScyllaReturKePabrik(){
        return jLabelInputScyllaReturKePabrik;
    }
    public JLabel getjLabelInputScyllaStokAdjustment(){
        return jLabelInputScyllaStokAdjustment;
    }
    
    public JLabel getjLabelInputScyllaStock() {
        return jLabelInputScyllaStock;
    }
    
    
    //POKARI
    public JTextField getTextKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation(){
        return textKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation;
    }
    
    public JTextField getTextKonfigurasiAndUtilitiesPokariPrefixFaktur(){
        return textKonfigurasiAndUtilitiesPokariPrefixFaktur;
    }
    
    public JButton getBtnPathKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation(){
        return btnPathKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation;
    }
    public JButton getBtnGeneralSettingPokariSimpan(){
        return btnGeneralSettingPokariSimpan;
    }
    public JButton getBtnGeneralSettingPokariReload(){
        return btnGeneralSettingPokariReload;
    }
            
    public JPanel getjPanelSubGenerateExtract() {
        return jPanelSubGenerateExtract;
    }
    public JPanel getjPanelSubGenerateExtractKek() {
        return jPanelSubGenerateExtractKek;
    }

    public JPanel getjPanelUtamaTemplates1() {
        return jPanelUtamaTemplates1;
    }

    public JPanel getjPanelSubBackupAndRestoreBackupAndRestoreKek() {
        return jPanelSubBackupAndRestoreBackupAndRestoreKek;
    }
    public JPanel getjPanelSubBackupAndRestoreBackupAndRestorePokari() {
        return jPanelSubBackupAndRestoreBackupAndRestorePokari;
    }

    public JTabbedPane getjTabbedPaneUtamaBackupAndRestore() {
        return jTabbedPaneUtamaBackupAndRestore;
    }

    public JPanel getjPanelSubGenerateRetrieveScylla() {
        return jPanelSubGenerateRetrieveScylla;
    }

    public JPanel getjPanelSubGenerateButtonRetrieve() {
        return jPanelSubGenerateButtonRetrieve;
    }

    public JPanel getjPanelSubGeneratePicture() {
        return jPanelSubGeneratePicture;
    }
    
    
    public JPanelGenerateExtractBaygon getjPanelGenerateExtractBaygon1() {
        return jPanelGenerateExtractBaygon1;
    }

    public JPanelGenerateExtractKek getjPanelGenerateExtractKek1() {
        return jPanelGenerateExtractKek1;
    }

    public JPanelGenerateExtractPokari getjPanelGenerateExtractPokari1() {
        return jPanelGenerateExtractPokari1;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUtama = new javax.swing.JPanel();
        jTabbedPaneUtama = new javax.swing.JTabbedPane();
        jPanelUtamaInputScylla = new javax.swing.JPanel();
        jTabbedPaneUtamaInputScylla = new javax.swing.JTabbedPane();
        jPanelSubInputScyllaMasterProduct = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInputMaster = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        btnInputMasterReload = new javax.swing.JButton();
        jLabelInputScyllaMasterProduk = new javax.swing.JLabel();
        jPanelSubInputScyllaStock = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        btnInputStockReload = new javax.swing.JButton();
        jLabelInputScyllaStock = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInputStock = new javax.swing.JTable();
        jPanelSubInputScyllaOutlet = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        btnInputOutletReload = new javax.swing.JButton();
        jLabelInputScyllaOutlet = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableInputOutlet = new javax.swing.JTable();
        jPanelSubInputScyllaCvOutlet = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        btnInputCvOutletReload = new javax.swing.JButton();
        jLabelInputScyllaCvOutlet = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableInputCvOutlet = new javax.swing.JTable();
        jPanelSubInputScyllaSalesman = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        btnInputSalesmanReload = new javax.swing.JButton();
        jLabelInputScyllaSalesman = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableInputSalesman = new javax.swing.JTable();
        jPanelSubInputScyllaJHeader = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        btnInputJheaderReload = new javax.swing.JButton();
        btnInputJheaderUbah = new javax.swing.JButton();
        btnInputJheaderBaru = new javax.swing.JButton();
        lblInputJHeaderFooterInfo = new javax.swing.JLabel();
        jLabelInputScyllaJHeader = new javax.swing.JLabel();
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
        jPanelSubInputScyllaJPcode = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        btnInputJpcodeReload = new javax.swing.JButton();
        jLabelInputScyllaJPCode = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableInputJpcode = new javax.swing.JTable();
        jPanelSubInputScyllaJTprb = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        btnInputJtprbReload = new javax.swing.JButton();
        jLabelInputScyllaJTprb = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableInputJtprb = new javax.swing.JTable();
        jPanelSubInputScyllaJTpru = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        btnInputJtpruReload = new javax.swing.JButton();
        jLabelInputScyllaJTpru = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableInputJtpru = new javax.swing.JTable();
        jPanelSubInputScyllaBarangDatang = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tableInputBarangDatang = new javax.swing.JTable();
        jPanel76 = new javax.swing.JPanel();
        btnInputBarangDatangReload = new javax.swing.JButton();
        jLabelInputScyllaBarangDatang = new javax.swing.JLabel();
        jPanelSubInputScyllaReturKePabrik = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        btnInputReturKePabrikReload = new javax.swing.JButton();
        jLabelInputScyllaReturKePabrik = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        tableInputReturKePabrik = new javax.swing.JTable();
        jPanelSubInputScyllaStokAdjustment = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        btnInputStockAdjustmentReload = new javax.swing.JButton();
        jLabelInputScyllaStokAdjustment = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        tableInputStockAdjustment = new javax.swing.JTable();
        jPanelUtamaOutputKEK = new javax.swing.JPanel();
        jPanelUtamaOutputPokari = new javax.swing.JPanel();
        jPanelUtamaOutputBaygon = new javax.swing.JPanel();
        jPanelUtamaGenerate = new javax.swing.JPanel();
        jTabbedPaneUtamaGenerate = new javax.swing.JTabbedPane();
        jPanelSubGenerateRetrieveAndExtract = new javax.swing.JPanel();
        jPanelSubGenerateRetrieveScylla = new javax.swing.JPanel();
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
        btnPathInputSalesman = new javax.swing.JButton();
        btnPathInputOutlet = new javax.swing.JButton();
        btnPathInputCvOutlet = new javax.swing.JButton();
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
        jPanelSubGenerateButtonRetrieve = new javax.swing.JPanel();
        btnPathInputReloadAll = new javax.swing.JButton();
        btnPathInputAuto = new javax.swing.JButton();
        btnPathInputClearAll = new javax.swing.JButton();
        btnRetrieveInputAll = new javax.swing.JButton();
        checkModeDatabase = new javax.swing.JCheckBox();
        jPanelSubGenerateExtract = new javax.swing.JPanel();
        jPanelSubGenerateExtractKek = new javax.swing.JPanel();
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
        jPanelSubGeneratePicture = new javax.swing.JPanel();
        jPanelUtamaConfigAndUtils = new javax.swing.JPanel();
        jTabbedPaneUtamaConfigAndUtils = new javax.swing.JTabbedPane();
        jPanelSubKonfigAndUtilBaygon = new javax.swing.JPanel();
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
        jPanelSubKonfigAndUtilEmail = new javax.swing.JPanel();
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
        btnGeneralSettingKonfigurasiEmaiSimpan = new javax.swing.JButton();
        jPanelSubKonfigAndUtilPokari = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        textKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation = new javax.swing.JTextField();
        btnPathKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation = new javax.swing.JButton();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        textKonfigurasiAndUtilitiesPokariPrefixFaktur = new javax.swing.JTextField();
        btnGeneralSettingPokariSimpan = new javax.swing.JButton();
        btnGeneralSettingPokariReload = new javax.swing.JButton();
        jPanelUtamaBackupAndRestore = new javax.swing.JPanel();
        jTabbedPaneUtamaBackupAndRestore = new javax.swing.JTabbedPane();
        jPanelSubBackupAndRestoreBackupAndRestoreKek = new javax.swing.JPanel();
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
        jPanelSubBackupAndRestoreBackupAndRestorePokari = new javax.swing.JPanel();
        jPanel98 = new javax.swing.JPanel();
        checkBackupAndRestoreRestoreTabelTabelPokari = new javax.swing.JCheckBox();
        checkBackupAndRestoreRestoreFileMasterPokari = new javax.swing.JCheckBox();
        textBackupAndRestoreRestorePathPokari = new javax.swing.JTextField();
        btnBackupAndRestoreRestorePathPokari = new javax.swing.JButton();
        btnBackupAndRestoreRestoreStartRestorePokari = new javax.swing.JButton();
        checkBackupAndRestoreRestoreOverwritePokari = new javax.swing.JCheckBox();
        checkBackupAndRestoreRestoreGantiDenganDataBaruPokari = new javax.swing.JCheckBox();
        jPanel99 = new javax.swing.JPanel();
        checkBackupAndRestoreBackupTabelTabelPokari = new javax.swing.JCheckBox();
        checkBackupRestoreBackupFileMasterPokari = new javax.swing.JCheckBox();
        btnBackupAndRestoreBackupPathPokari = new javax.swing.JButton();
        textBackupAndRestoreBackupPathPokari = new javax.swing.JTextField();
        btnBackupAndRestoreBackupStartBackupPokari = new javax.swing.JButton();
        radioBackupAndRestoreBackupTabDelimetedPokari = new javax.swing.JRadioButton();
        radioBackupAndRestoreBackupCommaDelimetedPokari = new javax.swing.JRadioButton();
        jPanelUtamaSettingPokari = new javax.swing.JPanel();
        jTabbedPaneUtamaSettingPokari = new javax.swing.JTabbedPane();
        jPanelSubSettingPokariMappingMaster = new javax.swing.JPanel();
        jTabbedPaneSubSettingPokariMappingMaster = new javax.swing.JTabbedPane();
        jPanelSubSettingPokariMappingMasterProduct = new javax.swing.JPanel();
        jScrollPane40 = new javax.swing.JScrollPane();
        tableMappingMasterPokariProduct = new javax.swing.JTable();
        btnMappingMasterPokariProductSave = new javax.swing.JButton();
        btnMappingMasterPokariProductDelete = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        jPanelMappingMasterPokariProdukDetail = new javax.swing.JPanel();
        textMappingMasterPokariProductIdBrgScylla = new javax.swing.JTextField();
        textMappingMasterPokariProductIdPokari = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        textMappingMasterPokariProductNamaBarang = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        comboMappingMasterPokariProductBrand = new javax.swing.JComboBox();
        checkMappingMasterPokariProductBaru = new javax.swing.JCheckBox();
        checkMappingMasterPokariProductDikirim = new javax.swing.JCheckBox();
        checkMappingMasterPokariProductAktif = new javax.swing.JCheckBox();
        textMappingMasterPokariProductSearchIdBrgScylla = new javax.swing.JTextField();
        textMappingMasterPokariProductSearchIdPokari = new javax.swing.JTextField();
        textMappingMasterPokariProductSearchNamaBarangPokari = new javax.swing.JTextField();
        btnMappingMasterPokariProductSearch = new javax.swing.JButton();
        checkMappingMasterPokariProductSearchBaruSaja = new javax.swing.JCheckBox();
        btnMappingMasterPokariProductReload = new javax.swing.JButton();
        checkMappingMasterPokariProductSearchDikirimSaja = new javax.swing.JCheckBox();
        checkMappingMasterPokariProductSearchAktifSaja = new javax.swing.JCheckBox();
        checkMappingMasterPokariProductSearchSemua = new javax.swing.JCheckBox();
        jPanelSubSettingPokariMappingMasterCustomer = new javax.swing.JPanel();
        jScrollPane47 = new javax.swing.JScrollPane();
        tableMappingMasterPokariCustomer = new javax.swing.JTable();
        btnMappingMasterPokariCustomerSave = new javax.swing.JButton();
        btnMappingMasterPokariCustomerDelete = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jPanelMappingMasterPokariCustomerDetail = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerIdPokari = new javax.swing.JTextField();
        textMappingMasterPokariCustomerName = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        comboMappingMasterPokariCustomerHirarchy = new javax.swing.JComboBox();
        comboMappingMasterPokariCustomerSalesTerritory = new javax.swing.JComboBox();
        jLabel104 = new javax.swing.JLabel();
        comboMappingMasterPokariCustomerEmployee = new javax.swing.JComboBox();
        jLabel105 = new javax.swing.JLabel();
        comboMappingMasterPokariCustomerCustomerGroup = new javax.swing.JComboBox();
        jLabel107 = new javax.swing.JLabel();
        comboMappingMasterPokariCustomerWorkPlace = new javax.swing.JComboBox();
        jLabel108 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerIdScylla = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        checkMappingMasterPokariCustomerBaru = new javax.swing.JCheckBox();
        checkMappingMasterPokariCustomerDikirim = new javax.swing.JCheckBox();
        checkMappingMasterPokariCustomerAktif = new javax.swing.JCheckBox();
        textMappingMasterPokariCustomerAddress = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerState = new javax.swing.JTextField();
        textMappingMasterPokariCustomerCity = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerDistrict = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerZipCode = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerPhone = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerFax = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerContact = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerEmail = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        comboMappingMasterPokariCustomerStatus = new javax.swing.JComboBox();
        jLabel113 = new javax.swing.JLabel();
        comboMappingMasterPokariCustomerDistrChannelId = new javax.swing.JComboBox();
        jLabel116 = new javax.swing.JLabel();
        comboMappingMasterPokariCustomerAllowToCredit = new javax.swing.JComboBox();
        jLabel119 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerLimitCredit = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        comboMappingMasterPokariCustomerPaymentTermId = new javax.swing.JComboBox();
        jLabel124 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerNPWP = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerRegisteredDate = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/####",'_');
        jLabel128 = new javax.swing.JLabel();
        textMappingMasterPokariCustomerSearchIdPokari = new javax.swing.JTextField();
        textMappingMasterPokariCustomerSearchName = new javax.swing.JTextField();
        btnMappingMasterPokariCustomerSearch = new javax.swing.JButton();
        checkMappingMasterPokariCustomerSearchBaruSaja = new javax.swing.JCheckBox();
        btnMappingMasterPokariCustomerReload = new javax.swing.JButton();
        textMappingMasterPokariCustomerSearchIdScylla = new javax.swing.JTextField();
        checkMapingMasterPokariCustomerSearchDikirimSaja = new javax.swing.JCheckBox();
        checkMappingMasterPokariCustomerSearchAktifSaja = new javax.swing.JCheckBox();
        checkMappingMasterPokariCustomerSearchSemua = new javax.swing.JCheckBox();
        jPanelSubSettingPokariMappingMasterEmployee = new javax.swing.JPanel();
        btnMappingMasterPokariEmployeeSave = new javax.swing.JButton();
        btnMappingMasterPokariEmployeeDelete = new javax.swing.JButton();
        jScrollPane48 = new javax.swing.JScrollPane();
        tableMappingMasterPokariEmployee = new javax.swing.JTable();
        jLabel115 = new javax.swing.JLabel();
        jPanelMappingMasterPokariEmployeeDetail = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        textMappingMasterPokariEmployeeIdPokari = new javax.swing.JTextField();
        textMappingMasterPokariEmployeeName = new javax.swing.JTextField();
        textMappingMasterPokariEmployeeVehicleId = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        textMappingMasterPokariEmployeeVehicleName = new javax.swing.JTextField();
        textMappingMasterPokariEmployeePoliceNo = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        textMappingMasterPokariEmployeeIdScylla = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        comboMappingMasterPokariEmployeeWorkplace = new javax.swing.JComboBox();
        jLabel110 = new javax.swing.JLabel();
        comboMappingMasterPokariEmployeeSalesType = new javax.swing.JComboBox();
        jLabel111 = new javax.swing.JLabel();
        comboMappingMasterPokariEmployeeSalesGroup = new javax.swing.JComboBox();
        jLabel112 = new javax.swing.JLabel();
        comboMappingMasterPokariEmployeeSalesTeam = new javax.swing.JComboBox();
        checkMappingMasterPokariSpEmployeeBaru = new javax.swing.JCheckBox();
        checkMappingMasterPokariSpEmployeeDikirim = new javax.swing.JCheckBox();
        checkMappingMasterPokariSpEmployeeAktif = new javax.swing.JCheckBox();
        btnMappingMasterPokariEmployeeReload = new javax.swing.JButton();
        jPanelSubSettingPokariTabelTabel = new javax.swing.JPanel();
        jTabbedPaneSubSettingPokariTabelTabel = new javax.swing.JTabbedPane();
        jPanelSubSettingPokariTabelTabelCustomerGroup = new javax.swing.JPanel();
        jScrollPane49 = new javax.swing.JScrollPane();
        tableTabelTabelPokariCustomerGroup = new javax.swing.JTable();
        jLabel126 = new javax.swing.JLabel();
        textTabelTabelPokariCustomerGroupIdGroup = new javax.swing.JTextField();
        textTabelTabelPokariCustomerGroupDescription = new javax.swing.JTextField();
        btnTabelTabelPokariCustomerGroupSave = new javax.swing.JButton();
        btnTabelTabelPokariCustomerGroupDelete = new javax.swing.JButton();
        btnTabelTabelPokariCustomerGroupSetDefault = new javax.swing.JButton();
        jPanelSubSettingPokariTabelTabelCustomerHirarchy = new javax.swing.JPanel();
        jScrollPane53 = new javax.swing.JScrollPane();
        tableTabelTabelPokariCustomerHirarchy = new javax.swing.JTable();
        textTabelTabelPokariCustomerHirarchyIdHirarchy = new javax.swing.JTextField();
        textTabelTabelPokariCustomerHirarchyDescription = new javax.swing.JTextField();
        btnTabelTabelPokariCustomerHirarchySave = new javax.swing.JButton();
        btnTabelTabelPokariCustomerHirarchyDelete = new javax.swing.JButton();
        jLabel131 = new javax.swing.JLabel();
        btnTabelTabelPokariCustomerHirarchySetDefault = new javax.swing.JButton();
        jPanelSubSettingPokariTabelTabelSalesTerritory = new javax.swing.JPanel();
        jScrollPane54 = new javax.swing.JScrollPane();
        tableTabelTabelPokariSalesTerritory = new javax.swing.JTable();
        textTabelTabelPokariSalesTerritoryIdTerritory = new javax.swing.JTextField();
        textTabelTabelPokariSalesTerritoryDescription = new javax.swing.JTextField();
        btnTabelTabelPokariSalesTerritorySave = new javax.swing.JButton();
        btnTabelTabelPokariSalesTerritoryDelete = new javax.swing.JButton();
        jLabel132 = new javax.swing.JLabel();
        btnTabelTabelPokariSalesTerritorySetDefault = new javax.swing.JButton();
        jPanelSubSettingPokariTabelTabelWorkplace = new javax.swing.JPanel();
        jScrollPane55 = new javax.swing.JScrollPane();
        tableTabelTabelPokariWorkplace = new javax.swing.JTable();
        textTabelTabelPokariWorkplaceWorkplaceId = new javax.swing.JTextField();
        textTabelTabelPokariWorkplaceArea = new javax.swing.JTextField();
        btnTabelTabelPokariWorkplaceSave = new javax.swing.JButton();
        btnTabelTabelPokariWorkplaceDelete = new javax.swing.JButton();
        jLabel133 = new javax.swing.JLabel();
        btnTabelTabelPokariWorkplaceSetDefault = new javax.swing.JButton();
        jPanelSubSettingPokariTabelTabelTeamSales = new javax.swing.JPanel();
        jScrollPane56 = new javax.swing.JScrollPane();
        tableTabelTabelPokariTeamSales = new javax.swing.JTable();
        btnTabelTabelPokariTeamSalesSave = new javax.swing.JButton();
        btnTabelTabelPokariTeamSalesDelete = new javax.swing.JButton();
        textTabelTabelPokariTeamSalesTeamId = new javax.swing.JTextField();
        textTabelTabelPokariTeamSalesName = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        btnTabelTabelPokariTeamSalesSetDefault = new javax.swing.JButton();
        jPanelSubSettingPokariTabelTabelTypeSales = new javax.swing.JPanel();
        jScrollPane57 = new javax.swing.JScrollPane();
        tableTabelTabelPokariTypeSales = new javax.swing.JTable();
        btnTabelTabelPokariTypeSalesSave = new javax.swing.JButton();
        btnTabelTabelPokariTypeSalesDelete = new javax.swing.JButton();
        textTabelTabelPokariTypeSalesTypeSales = new javax.swing.JTextField();
        textTabelTabelPokariTypeSalesName = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        btnTabelTabelPokariTypeSalesSetDefault = new javax.swing.JButton();
        jPanelSubSettingPokariTabelTabelGroupSales = new javax.swing.JPanel();
        jScrollPane58 = new javax.swing.JScrollPane();
        tableTabelTabelPokariGroupSales = new javax.swing.JTable();
        btnTabelTabelPokariGroupSalesSave = new javax.swing.JButton();
        btnTabelTabelPokariGroupSalesDelete = new javax.swing.JButton();
        textTabelTabelPokariGroupSalesTypeGroup = new javax.swing.JTextField();
        textTabelTabelPokariGroupSalesName = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        btnTabelTabelPokariGroupSalesSetDefault = new javax.swing.JButton();
        jPanelSubSettingPokariTabelTabelProductBrand = new javax.swing.JPanel();
        jScrollPane59 = new javax.swing.JScrollPane();
        tableTabelTabelPokariProductBrand = new javax.swing.JTable();
        btnTabelTabelPokariProductBrandSave = new javax.swing.JButton();
        btnTabelTabelPokariProductBrandDelete = new javax.swing.JButton();
        textTabelTabelPokariProductBrandBrandId = new javax.swing.JTextField();
        textTabelTabelPokariProductBrandName = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        btnTabelTabelPokariProductBrandSetDefault = new javax.swing.JButton();
        textTabelTabelPokariProductBrandHirarchy = new javax.swing.JTextField();
        jPanelUtamaSettingKek = new javax.swing.JPanel();
        jTabbedPaneUtamaSettingKek = new javax.swing.JTabbedPane();
        jPanelSubSettingKekMappingMaster = new javax.swing.JPanel();
        jTabbedPaneMapping = new javax.swing.JTabbedPane();
        jPanelMappingMasterPanelUtama = new javax.swing.JPanel();
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
        jPanelSubSettingKekTabelTabel = new javax.swing.JPanel();
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
        jPanelUtamaTemplates1 = new javax.swing.JPanel();
        jPanelGenerateExtractBaygon1 = new org.dimas.bridging.app.view.JPanelGenerateExtractBaygon();
        jPanelGenerateExtractKek1 = new org.dimas.bridging.app.view.JPanelGenerateExtractKek();
        jPanelGenerateExtractPokari1 = new org.dimas.bridging.app.view.JPanelGenerateExtractPokari();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelUtama.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTabbedPaneUtama.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

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

        jLabelInputScyllaMasterProduk.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaMasterProduk.setText("jLabelInputScyllaMasterProduk");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInputScyllaMasterProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(btnInputMasterReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInputMasterReload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInputScyllaMasterProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSubInputScyllaMasterProductLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaMasterProduct);
        jPanelSubInputScyllaMasterProduct.setLayout(jPanelSubInputScyllaMasterProductLayout);
        jPanelSubInputScyllaMasterProductLayout.setHorizontalGroup(
            jPanelSubInputScyllaMasterProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaMasterProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaMasterProductLayout.setVerticalGroup(
            jPanelSubInputScyllaMasterProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaMasterProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaInputScylla.addTab("Product", jPanelSubInputScyllaMasterProduct);

        jPanel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputStockReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputStockReload.setText("Reload");

        jLabelInputScyllaStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaStock.setText("jLabelInputScyllaStock");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInputScyllaStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(btnInputStockReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInputStockReload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInputScyllaStock, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSubInputScyllaStockLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaStock);
        jPanelSubInputScyllaStock.setLayout(jPanelSubInputScyllaStockLayout);
        jPanelSubInputScyllaStockLayout.setHorizontalGroup(
            jPanelSubInputScyllaStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubInputScyllaStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaStockLayout.setVerticalGroup(
            jPanelSubInputScyllaStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubInputScyllaStockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaInputScylla.addTab("Stock", jPanelSubInputScyllaStock);

        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputOutletReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputOutletReload.setText("Reload");

        jLabelInputScyllaOutlet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaOutlet.setText("jLabelInputScyllaOutlet");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(btnInputOutletReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 785, Short.MAX_VALUE))
                    .addComponent(jLabelInputScyllaOutlet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(btnInputOutletReload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInputScyllaOutlet, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(6, 6, 6))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSubInputScyllaOutletLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaOutlet);
        jPanelSubInputScyllaOutlet.setLayout(jPanelSubInputScyllaOutletLayout);
        jPanelSubInputScyllaOutletLayout.setHorizontalGroup(
            jPanelSubInputScyllaOutletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaOutletLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubInputScyllaOutletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaOutletLayout.setVerticalGroup(
            jPanelSubInputScyllaOutletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubInputScyllaOutletLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaInputScylla.addTab("Outlet", jPanelSubInputScyllaOutlet);

        jPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputCvOutletReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputCvOutletReload.setText("Reload");

        jLabelInputScyllaCvOutlet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaCvOutlet.setText("jLabelInputScyllaCvOutlet");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(btnInputCvOutletReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelInputScyllaCvOutlet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputCvOutletReload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInputScyllaCvOutlet, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSubInputScyllaCvOutletLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaCvOutlet);
        jPanelSubInputScyllaCvOutlet.setLayout(jPanelSubInputScyllaCvOutletLayout);
        jPanelSubInputScyllaCvOutletLayout.setHorizontalGroup(
            jPanelSubInputScyllaCvOutletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaCvOutletLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubInputScyllaCvOutletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaCvOutletLayout.setVerticalGroup(
            jPanelSubInputScyllaCvOutletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubInputScyllaCvOutletLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaInputScylla.addTab("CvOutlet", jPanelSubInputScyllaCvOutlet);

        jPanel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputSalesmanReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputSalesmanReload.setText("Reload");

        jLabelInputScyllaSalesman.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaSalesman.setText("jLabelInputScyllaSalesman");
        jLabelInputScyllaSalesman.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(btnInputSalesmanReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelInputScyllaSalesman, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputSalesmanReload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInputScyllaSalesman, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSubInputScyllaSalesmanLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaSalesman);
        jPanelSubInputScyllaSalesman.setLayout(jPanelSubInputScyllaSalesmanLayout);
        jPanelSubInputScyllaSalesmanLayout.setHorizontalGroup(
            jPanelSubInputScyllaSalesmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaSalesmanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubInputScyllaSalesmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaSalesmanLayout.setVerticalGroup(
            jPanelSubInputScyllaSalesmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubInputScyllaSalesmanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneUtamaInputScylla.addTab("Salesman", jPanelSubInputScyllaSalesman);

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

        jLabelInputScyllaJHeader.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaJHeader.setText("jLabelInputScyllaJHeader");
        jLabelInputScyllaJHeader.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInputScyllaJHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(btnInputJheaderReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnInputJheaderBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInputJheaderUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 448, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInputScyllaJHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblInputJHeaderFooterInfo)
                    .addContainerGap(71, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout jPanelSubInputScyllaJHeaderLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaJHeader);
        jPanelSubInputScyllaJHeader.setLayout(jPanelSubInputScyllaJHeaderLayout);
        jPanelSubInputScyllaJHeaderLayout.setHorizontalGroup(
            jPanelSubInputScyllaJHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaJHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubInputScyllaJHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaJHeaderLayout.setVerticalGroup(
            jPanelSubInputScyllaJHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubInputScyllaJHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77))
        );

        jTabbedPaneUtamaInputScylla.addTab("JHeader", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/List.png")), jPanelSubInputScyllaJHeader); // NOI18N

        jPanel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputJpcodeReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputJpcodeReload.setText("Reload");

        jLabelInputScyllaJPCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaJPCode.setText("jLabelInputScyllaJPCode");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(btnInputJpcodeReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 801, Short.MAX_VALUE))
                    .addComponent(jLabelInputScyllaJPCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJpcodeReload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInputScyllaJPCode, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
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

        javax.swing.GroupLayout jPanelSubInputScyllaJPcodeLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaJPcode);
        jPanelSubInputScyllaJPcode.setLayout(jPanelSubInputScyllaJPcodeLayout);
        jPanelSubInputScyllaJPcodeLayout.setHorizontalGroup(
            jPanelSubInputScyllaJPcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaJPcodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubInputScyllaJPcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaJPcodeLayout.setVerticalGroup(
            jPanelSubInputScyllaJPcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubInputScyllaJPcodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaInputScylla.addTab("JPcode", jPanelSubInputScyllaJPcode);

        jPanel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputJtprbReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputJtprbReload.setText("Reload");

        jLabelInputScyllaJTprb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaJTprb.setText("jLabelInputScyllaJTprb");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(btnInputJtprbReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 782, Short.MAX_VALUE))
                    .addComponent(jLabelInputScyllaJTprb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJtprbReload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInputScyllaJTprb, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanelSubInputScyllaJTprbLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaJTprb);
        jPanelSubInputScyllaJTprb.setLayout(jPanelSubInputScyllaJTprbLayout);
        jPanelSubInputScyllaJTprbLayout.setHorizontalGroup(
            jPanelSubInputScyllaJTprbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaJTprbLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubInputScyllaJTprbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaJTprbLayout.setVerticalGroup(
            jPanelSubInputScyllaJTprbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubInputScyllaJTprbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaInputScylla.addTab("JTprb", jPanelSubInputScyllaJTprb);

        jPanel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputJtpruReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputJtpruReload.setText("Reload");

        jLabelInputScyllaJTpru.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaJTpru.setText("jLabelInputScyllaJTpru");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(btnInputJtpruReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 788, Short.MAX_VALUE))
                    .addComponent(jLabelInputScyllaJTpru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJtpruReload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInputScyllaJTpru, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
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

        javax.swing.GroupLayout jPanelSubInputScyllaJTpruLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaJTpru);
        jPanelSubInputScyllaJTpru.setLayout(jPanelSubInputScyllaJTpruLayout);
        jPanelSubInputScyllaJTpruLayout.setHorizontalGroup(
            jPanelSubInputScyllaJTpruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaJTpruLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubInputScyllaJTpruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaJTpruLayout.setVerticalGroup(
            jPanelSubInputScyllaJTpruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubInputScyllaJTpruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaInputScylla.addTab("JTpru", jPanelSubInputScyllaJTpru);

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

        jLabelInputScyllaBarangDatang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaBarangDatang.setText("jLabelInputScyllaBarangDatang");

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addComponent(btnInputBarangDatangReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelInputScyllaBarangDatang, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputBarangDatangReload)
                .addGap(8, 8, 8)
                .addComponent(jLabelInputScyllaBarangDatang, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSubInputScyllaBarangDatangLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaBarangDatang);
        jPanelSubInputScyllaBarangDatang.setLayout(jPanelSubInputScyllaBarangDatangLayout);
        jPanelSubInputScyllaBarangDatangLayout.setHorizontalGroup(
            jPanelSubInputScyllaBarangDatangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaBarangDatangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubInputScyllaBarangDatangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaBarangDatangLayout.setVerticalGroup(
            jPanelSubInputScyllaBarangDatangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaBarangDatangLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaInputScylla.addTab("Barang Datang", jPanelSubInputScyllaBarangDatang);

        jPanel77.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputReturKePabrikReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputReturKePabrikReload.setText("Reload");

        jLabelInputScyllaReturKePabrik.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaReturKePabrik.setText("jLabelInputScyllaReturKePabrik");

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addComponent(btnInputReturKePabrikReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelInputScyllaReturKePabrik, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputReturKePabrikReload)
                .addGap(4, 4, 4)
                .addComponent(jLabelInputScyllaReturKePabrik, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
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

        javax.swing.GroupLayout jPanelSubInputScyllaReturKePabrikLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaReturKePabrik);
        jPanelSubInputScyllaReturKePabrik.setLayout(jPanelSubInputScyllaReturKePabrikLayout);
        jPanelSubInputScyllaReturKePabrikLayout.setHorizontalGroup(
            jPanelSubInputScyllaReturKePabrikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaReturKePabrikLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubInputScyllaReturKePabrikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaReturKePabrikLayout.setVerticalGroup(
            jPanelSubInputScyllaReturKePabrikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubInputScyllaReturKePabrikLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaInputScylla.addTab("Retur ke Pabrik", jPanelSubInputScyllaReturKePabrik);

        jPanel78.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputStockAdjustmentReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputStockAdjustmentReload.setText("Reload");

        jLabelInputScyllaStokAdjustment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaStokAdjustment.setText("jLabelInputScyllaStokAdjustment");

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel78Layout.createSequentialGroup()
                        .addComponent(btnInputStockAdjustmentReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 787, Short.MAX_VALUE))
                    .addComponent(jLabelInputScyllaStokAdjustment, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputStockAdjustmentReload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInputScyllaStokAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanelSubInputScyllaStokAdjustmentLayout = new javax.swing.GroupLayout(jPanelSubInputScyllaStokAdjustment);
        jPanelSubInputScyllaStokAdjustment.setLayout(jPanelSubInputScyllaStokAdjustmentLayout);
        jPanelSubInputScyllaStokAdjustmentLayout.setHorizontalGroup(
            jPanelSubInputScyllaStokAdjustmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubInputScyllaStokAdjustmentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubInputScyllaStokAdjustmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanelSubInputScyllaStokAdjustmentLayout.setVerticalGroup(
            jPanelSubInputScyllaStokAdjustmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubInputScyllaStokAdjustmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaInputScylla.addTab("Stok Adjustment", jPanelSubInputScyllaStokAdjustment);

        javax.swing.GroupLayout jPanelUtamaInputScyllaLayout = new javax.swing.GroupLayout(jPanelUtamaInputScylla);
        jPanelUtamaInputScylla.setLayout(jPanelUtamaInputScyllaLayout);
        jPanelUtamaInputScyllaLayout.setHorizontalGroup(
            jPanelUtamaInputScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUtamaInputScyllaLayout.createSequentialGroup()
                .addComponent(jTabbedPaneUtamaInputScylla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelUtamaInputScyllaLayout.setVerticalGroup(
            jPanelUtamaInputScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUtamaInputScyllaLayout.createSequentialGroup()
                .addComponent(jTabbedPaneUtamaInputScylla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jTabbedPaneUtama.addTab("Input Scylla", jPanelUtamaInputScylla);

        javax.swing.GroupLayout jPanelUtamaOutputKEKLayout = new javax.swing.GroupLayout(jPanelUtamaOutputKEK);
        jPanelUtamaOutputKEK.setLayout(jPanelUtamaOutputKEKLayout);
        jPanelUtamaOutputKEKLayout.setHorizontalGroup(
            jPanelUtamaOutputKEKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1039, Short.MAX_VALUE)
        );
        jPanelUtamaOutputKEKLayout.setVerticalGroup(
            jPanelUtamaOutputKEKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jTabbedPaneUtama.addTab("Output KEK", jPanelUtamaOutputKEK);

        javax.swing.GroupLayout jPanelUtamaOutputPokariLayout = new javax.swing.GroupLayout(jPanelUtamaOutputPokari);
        jPanelUtamaOutputPokari.setLayout(jPanelUtamaOutputPokariLayout);
        jPanelUtamaOutputPokariLayout.setHorizontalGroup(
            jPanelUtamaOutputPokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1039, Short.MAX_VALUE)
        );
        jPanelUtamaOutputPokariLayout.setVerticalGroup(
            jPanelUtamaOutputPokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jTabbedPaneUtama.addTab("Output Pokari", jPanelUtamaOutputPokari);

        javax.swing.GroupLayout jPanelUtamaOutputBaygonLayout = new javax.swing.GroupLayout(jPanelUtamaOutputBaygon);
        jPanelUtamaOutputBaygon.setLayout(jPanelUtamaOutputBaygonLayout);
        jPanelUtamaOutputBaygonLayout.setHorizontalGroup(
            jPanelUtamaOutputBaygonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1039, Short.MAX_VALUE)
        );
        jPanelUtamaOutputBaygonLayout.setVerticalGroup(
            jPanelUtamaOutputBaygonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jTabbedPaneUtama.addTab("Output Baygon", jPanelUtamaOutputBaygon);

        jPanelSubGenerateRetrieveAndExtract.setForeground(new java.awt.Color(0, 255, 0));
        jPanelSubGenerateRetrieveAndExtract.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jPanelSubGenerateRetrieveScylla.setBorder(javax.swing.BorderFactory.createTitledBorder("Input dari Scylla"));

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

        btnPathInputSalesman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputOutlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputCvOutlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

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

        btnRetrieveInputStock.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
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

        btnRetrieveInputBarangDatang.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnRetrieveInputBarangDatang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputBarangDatang.setText("10. Retrieve");

        btnRetrieveInputReturKePabrik.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnRetrieveInputReturKePabrik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputReturKePabrik.setText("11. Retrieve");

        btnRetrieveInputStokAdjustment.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnRetrieveInputStokAdjustment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputStokAdjustment.setText("12. Retrieve");

        jDateChooseTanggalStokAdjustment.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanelSubGenerateRetrieveScyllaLayout = new javax.swing.GroupLayout(jPanelSubGenerateRetrieveScylla);
        jPanelSubGenerateRetrieveScylla.setLayout(jPanelSubGenerateRetrieveScyllaLayout);
        jPanelSubGenerateRetrieveScyllaLayout.setHorizontalGroup(
            jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textPathInputJHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                            .addComponent(textPathInputJPcode)
                            .addComponent(textPathInputJTprb)
                            .addComponent(textPathInputJTpru, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPathInputJTprb)
                            .addComponent(btnPathInputJPcode)
                            .addComponent(btnPathInputJTpru)
                            .addComponent(btnPathInputJHeader))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetrieveInputJHeader)
                            .addComponent(btnRetrieveInputJTprb)
                            .addComponent(btnRetrieveInputJTpru)
                            .addComponent(btnRetrieveInputJPcode))
                        .addGap(14, 14, 14))
                    .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooseTanggalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPathInputCvOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPathInputOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPathInputSalesman)
                                    .addComponent(textPathInputMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addComponent(btnPathInputStock)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRetrieveInputStock, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPathInputOutlet)
                                    .addComponent(btnPathInputSalesman)
                                    .addComponent(btnPathInputCvOutlet))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRetrieveInputSalesman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRetrieveInputOutlet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRetrieveInputCvOutlet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                                .addComponent(btnPathInputMaster)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRetrieveInputMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textPathInputStock, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                                        .addComponent(jDateChooseTanggalStokAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textPathInputStokAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textPathInputReturKePabrik, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPathInputBarangDatang, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPathInputBarangDatang)
                            .addComponent(btnPathInputReturKePabrik)
                            .addComponent(btnPathInputStokAdjustment, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRetrieveInputBarangDatang, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRetrieveInputReturKePabrik)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRetrieveInputStokAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanelSubGenerateRetrieveScyllaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRetrieveInputBarangDatang, btnRetrieveInputJHeader, btnRetrieveInputJPcode, btnRetrieveInputJTprb, btnRetrieveInputJTpru, btnRetrieveInputReturKePabrik, btnRetrieveInputStock, btnRetrieveInputStokAdjustment});

        jPanelSubGenerateRetrieveScyllaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5});

        jPanelSubGenerateRetrieveScyllaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel27, jLabel34, jLabel35});

        jPanelSubGenerateRetrieveScyllaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {textPathInputCvOutlet, textPathInputMaster, textPathInputOutlet, textPathInputSalesman});

        jPanelSubGenerateRetrieveScyllaLayout.setVerticalGroup(
            jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRetrieveInputMaster)
                    .addComponent(btnPathInputMaster)
                    .addComponent(textPathInputMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRetrieveInputSalesman, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPathInputSalesman)
                    .addComponent(textPathInputSalesman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPathInputOutlet)
                    .addComponent(btnRetrieveInputOutlet)
                    .addComponent(textPathInputOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRetrieveInputCvOutlet)
                    .addComponent(btnPathInputCvOutlet)
                    .addComponent(textPathInputCvOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPathInputJHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPathInputJHeader)
                    .addComponent(btnRetrieveInputJHeader))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                        .addComponent(textPathInputJPcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPathInputJTprb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                        .addComponent(btnPathInputJPcode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPathInputJTprb)))
                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPathInputJTpru)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(textPathInputJTpru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRetrieveInputStock)
                    .addComponent(btnPathInputStock)
                    .addComponent(textPathInputStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooseTanggalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnPathInputBarangDatang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                                .addComponent(btnRetrieveInputBarangDatang)
                                .addGap(7, 7, 7)))
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetrieveInputReturKePabrik)
                            .addComponent(btnPathInputReturKePabrik))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetrieveInputStokAdjustment)
                            .addComponent(btnPathInputStokAdjustment))
                        .addGap(25, 25, 25))
                    .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(textPathInputBarangDatang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(textPathInputReturKePabrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(textPathInputStokAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooseTanggalStokAdjustment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
            .addGroup(jPanelSubGenerateRetrieveScyllaLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(btnRetrieveInputJPcode)
                .addGap(9, 9, 9)
                .addComponent(btnRetrieveInputJTprb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetrieveInputJTpru)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jPanelSubGenerateRetrieveScyllaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel27, jLabel3, jLabel34, jLabel35, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanelSubGenerateButtonRetrieve.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanelSubGenerateButtonRetrieveLayout = new javax.swing.GroupLayout(jPanelSubGenerateButtonRetrieve);
        jPanelSubGenerateButtonRetrieve.setLayout(jPanelSubGenerateButtonRetrieveLayout);
        jPanelSubGenerateButtonRetrieveLayout.setHorizontalGroup(
            jPanelSubGenerateButtonRetrieveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubGenerateButtonRetrieveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubGenerateButtonRetrieveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubGenerateButtonRetrieveLayout.createSequentialGroup()
                        .addComponent(checkModeDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnPathInputReloadAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetrieveInputAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPathInputClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPathInputAuto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSubGenerateButtonRetrieveLayout.setVerticalGroup(
            jPanelSubGenerateButtonRetrieveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubGenerateButtonRetrieveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPathInputReloadAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPathInputClearAll)
                .addGap(93, 93, 93)
                .addComponent(btnPathInputAuto)
                .addGap(18, 18, 18)
                .addComponent(btnRetrieveInputAll)
                .addGap(32, 32, 32)
                .addComponent(checkModeDatabase))
        );

        jPanelSubGenerateExtract.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelSubGenerateExtractKek.setBorder(null);

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

        javax.swing.GroupLayout jPanelSubGenerateExtractKekLayout = new javax.swing.GroupLayout(jPanelSubGenerateExtractKek);
        jPanelSubGenerateExtractKek.setLayout(jPanelSubGenerateExtractKekLayout);
        jPanelSubGenerateExtractKekLayout.setHorizontalGroup(
            jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addGap(0, 214, Short.MAX_VALUE)
                        .addComponent(btnExtractMSalesman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractMSlsOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPathOutput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPathOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addComponent(btnExtractTAdjStk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTDatdpr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addComponent(jDateChooserExtract, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addComponent(btnExtractTDatdsl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTDatdsr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTDatsri, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractTStok, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                        .addComponent(btnExtractAll, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKirimByEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelSubGenerateExtractKekLayout.setVerticalGroup(
            jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubGenerateExtractKekLayout.createSequentialGroup()
                .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPathOutput)
                    .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExtractAll)
                            .addComponent(btnKirimByEmail))
                        .addComponent(jDateChooserExtract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPathOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubGenerateExtractKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExtractMSlsOut)
                    .addComponent(btnExtractTAdjStk)
                    .addComponent(btnExtractTDatdpr)
                    .addComponent(btnExtractTDatdsl)
                    .addComponent(btnExtractTDatdsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExtractTDatsri)
                    .addComponent(btnExtractTStok)
                    .addComponent(btnExtractMSalesman)))
        );

        javax.swing.GroupLayout jPanelSubGenerateExtractLayout = new javax.swing.GroupLayout(jPanelSubGenerateExtract);
        jPanelSubGenerateExtract.setLayout(jPanelSubGenerateExtractLayout);
        jPanelSubGenerateExtractLayout.setHorizontalGroup(
            jPanelSubGenerateExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubGenerateExtractLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSubGenerateExtractKek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelSubGenerateExtractLayout.setVerticalGroup(
            jPanelSubGenerateExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubGenerateExtractLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSubGenerateExtractKek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSubGeneratePicture.setBorder(null);

        javax.swing.GroupLayout jPanelSubGeneratePictureLayout = new javax.swing.GroupLayout(jPanelSubGeneratePicture);
        jPanelSubGeneratePicture.setLayout(jPanelSubGeneratePictureLayout);
        jPanelSubGeneratePictureLayout.setHorizontalGroup(
            jPanelSubGeneratePictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelSubGeneratePictureLayout.setVerticalGroup(
            jPanelSubGeneratePictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelSubGenerateRetrieveAndExtractLayout = new javax.swing.GroupLayout(jPanelSubGenerateRetrieveAndExtract);
        jPanelSubGenerateRetrieveAndExtract.setLayout(jPanelSubGenerateRetrieveAndExtractLayout);
        jPanelSubGenerateRetrieveAndExtractLayout.setHorizontalGroup(
            jPanelSubGenerateRetrieveAndExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubGenerateRetrieveAndExtractLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelSubGenerateRetrieveAndExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSubGenerateExtract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSubGenerateRetrieveAndExtractLayout.createSequentialGroup()
                        .addComponent(jPanelSubGenerateRetrieveScylla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanelSubGenerateRetrieveAndExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelSubGenerateButtonRetrieve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelSubGeneratePicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanelSubGenerateRetrieveAndExtractLayout.setVerticalGroup(
            jPanelSubGenerateRetrieveAndExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubGenerateRetrieveAndExtractLayout.createSequentialGroup()
                .addGroup(jPanelSubGenerateRetrieveAndExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubGenerateRetrieveAndExtractLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelSubGeneratePicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelSubGenerateButtonRetrieve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE))
                    .addGroup(jPanelSubGenerateRetrieveAndExtractLayout.createSequentialGroup()
                        .addComponent(jPanelSubGenerateRetrieveScylla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanelSubGenerateExtract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jTabbedPaneUtamaGenerate.addTab("Retrieve And Extract", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Load.png")), jPanelSubGenerateRetrieveAndExtract); // NOI18N

        javax.swing.GroupLayout jPanelUtamaGenerateLayout = new javax.swing.GroupLayout(jPanelUtamaGenerate);
        jPanelUtamaGenerate.setLayout(jPanelUtamaGenerateLayout);
        jPanelUtamaGenerateLayout.setHorizontalGroup(
            jPanelUtamaGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1039, Short.MAX_VALUE)
            .addGroup(jPanelUtamaGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUtamaGenerateLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPaneUtamaGenerate)
                    .addContainerGap()))
        );
        jPanelUtamaGenerateLayout.setVerticalGroup(
            jPanelUtamaGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(jPanelUtamaGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUtamaGenerateLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPaneUtamaGenerate)
                    .addContainerGap()))
        );

        jTabbedPaneUtama.addTab("GENERATE", jPanelUtamaGenerate);
        jPanelUtamaGenerate.getAccessibleContext().setAccessibleDescription("");

        jPanelSubKonfigAndUtilBaygon.setForeground(new java.awt.Color(255, 0, 0));
        jPanelSubKonfigAndUtilBaygon.setToolTipText("");
        jPanelSubKonfigAndUtilBaygon.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

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
                    .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textDistributorName, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
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
                        .addGap(208, 208, 208)
                        .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGeneralSettingSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeneralSettingReload, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanelSubKonfigAndUtilBaygonLayout = new javax.swing.GroupLayout(jPanelSubKonfigAndUtilBaygon);
        jPanelSubKonfigAndUtilBaygon.setLayout(jPanelSubKonfigAndUtilBaygonLayout);
        jPanelSubKonfigAndUtilBaygonLayout.setHorizontalGroup(
            jPanelSubKonfigAndUtilBaygonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubKonfigAndUtilBaygonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        jPanelSubKonfigAndUtilBaygonLayout.setVerticalGroup(
            jPanelSubKonfigAndUtilBaygonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubKonfigAndUtilBaygonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaConfigAndUtils.addTab("Konfigurasi  & Utilities BAYGON", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Equipment.png")), jPanelSubKonfigAndUtilBaygon, ""); // NOI18N

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
                .addContainerGap(18, Short.MAX_VALUE))
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

        btnGeneralSettingKonfigurasiEmaiSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnGeneralSettingKonfigurasiEmaiSimpan.setText("Simpan");

        javax.swing.GroupLayout jPanelSubKonfigAndUtilEmailLayout = new javax.swing.GroupLayout(jPanelSubKonfigAndUtilEmail);
        jPanelSubKonfigAndUtilEmail.setLayout(jPanelSubKonfigAndUtilEmailLayout);
        jPanelSubKonfigAndUtilEmailLayout.setHorizontalGroup(
            jPanelSubKonfigAndUtilEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubKonfigAndUtilEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubKonfigAndUtilEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubKonfigAndUtilEmailLayout.createSequentialGroup()
                        .addComponent(btnGeneralSettingKonfigurasiEmaiSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelSubKonfigAndUtilEmailLayout.createSequentialGroup()
                        .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(530, 530, 530))))
        );
        jPanelSubKonfigAndUtilEmailLayout.setVerticalGroup(
            jPanelSubKonfigAndUtilEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubKonfigAndUtilEmailLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGeneralSettingKonfigurasiEmaiSimpan)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaConfigAndUtils.addTab("Konfigurasi Email", jPanelSubKonfigAndUtilEmail);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation.setText("jTextField1");
        textKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocationActionPerformed(evt);
            }
        });

        btnPathKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        jLabel129.setText("Template Output IDOS Location");

        jLabel130.setText("Prefix atau Kode Awalan pada Faktur");

        textKonfigurasiAndUtilitiesPokariPrefixFaktur.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPathKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel129)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel130))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textKonfigurasiAndUtilitiesPokariPrefixFaktur, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel129)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPathKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textKonfigurasiAndUtilitiesPokariPrefixFaktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        btnGeneralSettingPokariSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnGeneralSettingPokariSimpan.setMnemonic('S');
        btnGeneralSettingPokariSimpan.setText("Simpan");

        btnGeneralSettingPokariReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnGeneralSettingPokariReload.setMnemonic('R');
        btnGeneralSettingPokariReload.setText("Reload");

        javax.swing.GroupLayout jPanelSubKonfigAndUtilPokariLayout = new javax.swing.GroupLayout(jPanelSubKonfigAndUtilPokari);
        jPanelSubKonfigAndUtilPokari.setLayout(jPanelSubKonfigAndUtilPokariLayout);
        jPanelSubKonfigAndUtilPokariLayout.setHorizontalGroup(
            jPanelSubKonfigAndUtilPokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubKonfigAndUtilPokariLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubKonfigAndUtilPokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSubKonfigAndUtilPokariLayout.createSequentialGroup()
                        .addComponent(btnGeneralSettingPokariSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGeneralSettingPokariReload, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jPanelSubKonfigAndUtilPokariLayout.setVerticalGroup(
            jPanelSubKonfigAndUtilPokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubKonfigAndUtilPokariLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubKonfigAndUtilPokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGeneralSettingPokariSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeneralSettingPokariReload, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaConfigAndUtils.addTab("Konfigurasi & Utilities POKARI", jPanelSubKonfigAndUtilPokari);

        javax.swing.GroupLayout jPanelUtamaConfigAndUtilsLayout = new javax.swing.GroupLayout(jPanelUtamaConfigAndUtils);
        jPanelUtamaConfigAndUtils.setLayout(jPanelUtamaConfigAndUtilsLayout);
        jPanelUtamaConfigAndUtilsLayout.setHorizontalGroup(
            jPanelUtamaConfigAndUtilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUtamaConfigAndUtilsLayout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(jTabbedPaneUtamaConfigAndUtils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanelUtamaConfigAndUtilsLayout.setVerticalGroup(
            jPanelUtamaConfigAndUtilsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUtamaConfigAndUtilsLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jTabbedPaneUtamaConfigAndUtils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jTabbedPaneUtama.addTab("Setting and Utils", jPanelUtamaConfigAndUtils);

        jPanelSubBackupAndRestoreBackupAndRestoreKek.setForeground(new java.awt.Color(255, 200, 0));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
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

        radioBackupAndRestoreBackupTabDelimeted.setSelected(true);
        radioBackupAndRestoreBackupTabDelimeted.setText("Tab Delimeted");
        radioBackupAndRestoreBackupTabDelimeted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBackupAndRestoreBackupTabDelimetedActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackupAndRestoreBackupStartBackup)
                    .addComponent(radioBackupAndRestoreBackupTabDelimeted)
                    .addComponent(radioBackupAndRestoreBackupCommaDelimeted)))
        );

        javax.swing.GroupLayout jPanelSubBackupAndRestoreBackupAndRestoreKekLayout = new javax.swing.GroupLayout(jPanelSubBackupAndRestoreBackupAndRestoreKek);
        jPanelSubBackupAndRestoreBackupAndRestoreKek.setLayout(jPanelSubBackupAndRestoreBackupAndRestoreKekLayout);
        jPanelSubBackupAndRestoreBackupAndRestoreKekLayout.setHorizontalGroup(
            jPanelSubBackupAndRestoreBackupAndRestoreKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubBackupAndRestoreBackupAndRestoreKekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubBackupAndRestoreBackupAndRestoreKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSubBackupAndRestoreBackupAndRestoreKekLayout.setVerticalGroup(
            jPanelSubBackupAndRestoreBackupAndRestoreKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubBackupAndRestoreBackupAndRestoreKekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaBackupAndRestore.addTab("Backup and Restore >> KEK", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png")), jPanelSubBackupAndRestoreBackupAndRestoreKek); // NOI18N

        jPanelSubBackupAndRestoreBackupAndRestorePokari.setForeground(new java.awt.Color(255, 200, 0));

        jPanel98.setBorder(javax.swing.BorderFactory.createTitledBorder("Restore"));

        checkBackupAndRestoreRestoreTabelTabelPokari.setSelected(true);
        checkBackupAndRestoreRestoreTabelTabelPokari.setText("Tabel-tabel");

        checkBackupAndRestoreRestoreFileMasterPokari.setSelected(true);
        checkBackupAndRestoreRestoreFileMasterPokari.setText("File Master");

        textBackupAndRestoreRestorePathPokari.setText("jTextField2");

        btnBackupAndRestoreRestorePathPokari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnBackupAndRestoreRestoreStartRestorePokari.setText("Start Restore");

        checkBackupAndRestoreRestoreOverwritePokari.setBackground(new java.awt.Color(255, 0, 0));
        checkBackupAndRestoreRestoreOverwritePokari.setText("Overwrite/Timpa data yang sudah ada");

        checkBackupAndRestoreRestoreGantiDenganDataBaruPokari.setText("Ganti dengan data baru");

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel98Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel98Layout.createSequentialGroup()
                        .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBackupAndRestoreRestoreTabelTabelPokari)
                            .addComponent(checkBackupAndRestoreRestoreFileMasterPokari))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel98Layout.createSequentialGroup()
                        .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel98Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBackupAndRestoreRestoreStartRestorePokari))
                            .addGroup(jPanel98Layout.createSequentialGroup()
                                .addComponent(textBackupAndRestoreRestorePathPokari)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBackupAndRestoreRestorePathPokari)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel98Layout.createSequentialGroup()
                        .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBackupAndRestoreRestoreGantiDenganDataBaruPokari)
                            .addComponent(checkBackupAndRestoreRestoreOverwritePokari))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel98Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBackupAndRestoreRestoreTabelTabelPokari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBackupAndRestoreRestoreFileMasterPokari)
                .addGap(18, 18, 18)
                .addComponent(checkBackupAndRestoreRestoreOverwritePokari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(checkBackupAndRestoreRestoreGantiDenganDataBaruPokari)
                .addGap(18, 18, 18)
                .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBackupAndRestoreRestorePathPokari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackupAndRestoreRestorePathPokari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBackupAndRestoreRestoreStartRestorePokari))
        );

        jPanel99.setBorder(javax.swing.BorderFactory.createTitledBorder("Backup"));

        checkBackupAndRestoreBackupTabelTabelPokari.setSelected(true);
        checkBackupAndRestoreBackupTabelTabelPokari.setText("Tabel-tabel");

        checkBackupRestoreBackupFileMasterPokari.setSelected(true);
        checkBackupRestoreBackupFileMasterPokari.setText("File Master");

        btnBackupAndRestoreBackupPathPokari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        textBackupAndRestoreBackupPathPokari.setText("jTextField1");

        btnBackupAndRestoreBackupStartBackupPokari.setText("Start Backup");

        radioBackupAndRestoreBackupTabDelimetedPokari.setSelected(true);
        radioBackupAndRestoreBackupTabDelimetedPokari.setText("Tab Delimeted");

        radioBackupAndRestoreBackupCommaDelimetedPokari.setText("( , ) Comma Delimeted");

        javax.swing.GroupLayout jPanel99Layout = new javax.swing.GroupLayout(jPanel99);
        jPanel99.setLayout(jPanel99Layout);
        jPanel99Layout.setHorizontalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel99Layout.createSequentialGroup()
                        .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBackupAndRestoreBackupTabelTabelPokari)
                            .addComponent(checkBackupRestoreBackupFileMasterPokari))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel99Layout.createSequentialGroup()
                        .addComponent(textBackupAndRestoreBackupPathPokari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBackupAndRestoreBackupPathPokari))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel99Layout.createSequentialGroup()
                        .addComponent(radioBackupAndRestoreBackupTabDelimetedPokari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBackupAndRestoreBackupCommaDelimetedPokari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackupAndRestoreBackupStartBackupPokari)))
                .addContainerGap())
        );
        jPanel99Layout.setVerticalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBackupAndRestoreBackupTabelTabelPokari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBackupRestoreBackupFileMasterPokari)
                .addGap(18, 18, 18)
                .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackupAndRestoreBackupPathPokari)
                    .addComponent(textBackupAndRestoreBackupPathPokari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackupAndRestoreBackupStartBackupPokari)
                    .addComponent(radioBackupAndRestoreBackupTabDelimetedPokari)
                    .addComponent(radioBackupAndRestoreBackupCommaDelimetedPokari)))
        );

        javax.swing.GroupLayout jPanelSubBackupAndRestoreBackupAndRestorePokariLayout = new javax.swing.GroupLayout(jPanelSubBackupAndRestoreBackupAndRestorePokari);
        jPanelSubBackupAndRestoreBackupAndRestorePokari.setLayout(jPanelSubBackupAndRestoreBackupAndRestorePokariLayout);
        jPanelSubBackupAndRestoreBackupAndRestorePokariLayout.setHorizontalGroup(
            jPanelSubBackupAndRestoreBackupAndRestorePokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubBackupAndRestoreBackupAndRestorePokariLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubBackupAndRestoreBackupAndRestorePokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanelSubBackupAndRestoreBackupAndRestorePokariLayout.setVerticalGroup(
            jPanelSubBackupAndRestoreBackupAndRestorePokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubBackupAndRestoreBackupAndRestorePokariLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaBackupAndRestore.addTab("Backup and Restore >> POKARI", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png")), jPanelSubBackupAndRestoreBackupAndRestorePokari); // NOI18N

        javax.swing.GroupLayout jPanelUtamaBackupAndRestoreLayout = new javax.swing.GroupLayout(jPanelUtamaBackupAndRestore);
        jPanelUtamaBackupAndRestore.setLayout(jPanelUtamaBackupAndRestoreLayout);
        jPanelUtamaBackupAndRestoreLayout.setHorizontalGroup(
            jPanelUtamaBackupAndRestoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1039, Short.MAX_VALUE)
            .addGroup(jPanelUtamaBackupAndRestoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUtamaBackupAndRestoreLayout.createSequentialGroup()
                    .addGap(0, 225, Short.MAX_VALUE)
                    .addComponent(jTabbedPaneUtamaBackupAndRestore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 225, Short.MAX_VALUE)))
        );
        jPanelUtamaBackupAndRestoreLayout.setVerticalGroup(
            jPanelUtamaBackupAndRestoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(jPanelUtamaBackupAndRestoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUtamaBackupAndRestoreLayout.createSequentialGroup()
                    .addGap(0, 84, Short.MAX_VALUE)
                    .addComponent(jTabbedPaneUtamaBackupAndRestore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 85, Short.MAX_VALUE)))
        );

        jTabbedPaneUtama.addTab("Backup and Restore", jPanelUtamaBackupAndRestore);

        jPanelSubSettingPokariMappingMaster.setForeground(new java.awt.Color(0, 0, 255));

        jTabbedPaneSubSettingPokariMappingMaster.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        tableMappingMasterPokariProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane40.setViewportView(tableMappingMasterPokariProduct);

        btnMappingMasterPokariProductSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnMappingMasterPokariProductSave.setMnemonic('S');
        btnMappingMasterPokariProductSave.setText("Save");

        btnMappingMasterPokariProductDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnMappingMasterPokariProductDelete.setMnemonic('D');
        btnMappingMasterPokariProductDelete.setText("Delete");

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("MAP PRODUCT");

        jPanelMappingMasterPokariProdukDetail.setBorder(javax.swing.BorderFactory.createTitledBorder("0 of 0 records"));

        textMappingMasterPokariProductIdBrgScylla.setBackground(new java.awt.Color(0, 255, 51));
        textMappingMasterPokariProductIdBrgScylla.setText("jTextField16");

        textMappingMasterPokariProductIdPokari.setText("jTextField17");

        jLabel91.setText("Product Brand");

        textMappingMasterPokariProductNamaBarang.setText("jTextField18");

        jLabel93.setText("ID Brg Scylla");

        jLabel94.setText("ID POKARI");

        jLabel95.setText("Nama Barang POKARI");

        comboMappingMasterPokariProductBrand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        checkMappingMasterPokariProductBaru.setText("Baru");

        checkMappingMasterPokariProductDikirim.setText("Di Kirim");

        checkMappingMasterPokariProductAktif.setText("Aktif");

        javax.swing.GroupLayout jPanelMappingMasterPokariProdukDetailLayout = new javax.swing.GroupLayout(jPanelMappingMasterPokariProdukDetail);
        jPanelMappingMasterPokariProdukDetail.setLayout(jPanelMappingMasterPokariProdukDetailLayout);
        jPanelMappingMasterPokariProdukDetailLayout.setHorizontalGroup(
            jPanelMappingMasterPokariProdukDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createSequentialGroup()
                        .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel93)
                            .addComponent(textMappingMasterPokariProductIdBrgScylla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94)
                            .addComponent(textMappingMasterPokariProductIdPokari, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95)
                            .addComponent(textMappingMasterPokariProductNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboMappingMasterPokariProductBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                    .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createSequentialGroup()
                        .addComponent(checkMappingMasterPokariProductBaru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMappingMasterPokariProductDikirim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMappingMasterPokariProductAktif)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMappingMasterPokariProdukDetailLayout.setVerticalGroup(
            jPanelMappingMasterPokariProdukDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createSequentialGroup()
                        .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel94)
                            .addComponent(jLabel95)
                            .addComponent(jLabel91))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textMappingMasterPokariProductIdPokari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMappingMasterPokariProductNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMappingMasterPokariProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMappingMasterPokariProductIdBrgScylla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMappingMasterPokariProdukDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkMappingMasterPokariProductBaru)
                    .addComponent(checkMappingMasterPokariProductDikirim)
                    .addComponent(checkMappingMasterPokariProductAktif))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textMappingMasterPokariProductSearchIdBrgScylla.setBackground(new java.awt.Color(51, 255, 51));
        textMappingMasterPokariProductSearchIdBrgScylla.setText("jTextField21");

        textMappingMasterPokariProductSearchIdPokari.setText("jTextField22");

        textMappingMasterPokariProductSearchNamaBarangPokari.setText("jTextField23");

        btnMappingMasterPokariProductSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/search_16x16.png"))); // NOI18N
        btnMappingMasterPokariProductSearch.setMnemonic('F');
        btnMappingMasterPokariProductSearch.setText("Filter");

        checkMappingMasterPokariProductSearchBaruSaja.setText("Baru");
        checkMappingMasterPokariProductSearchBaruSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMappingMasterPokariProductSearchBaruSajaActionPerformed(evt);
            }
        });

        btnMappingMasterPokariProductReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnMappingMasterPokariProductReload.setMnemonic('R');
        btnMappingMasterPokariProductReload.setText("Reload");

        checkMappingMasterPokariProductSearchDikirimSaja.setText("Di Kirim");
        checkMappingMasterPokariProductSearchDikirimSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMappingMasterPokariProductSearchDikirimSajaActionPerformed(evt);
            }
        });

        checkMappingMasterPokariProductSearchAktifSaja.setText("Aktif");
        checkMappingMasterPokariProductSearchAktifSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMappingMasterPokariProductSearchAktifSajaActionPerformed(evt);
            }
        });

        checkMappingMasterPokariProductSearchSemua.setSelected(true);
        checkMappingMasterPokariProductSearchSemua.setText("Semua");
        checkMappingMasterPokariProductSearchSemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMappingMasterPokariProductSearchSemuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSubSettingPokariMappingMasterProductLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariMappingMasterProduct);
        jPanelSubSettingPokariMappingMasterProduct.setLayout(jPanelSubSettingPokariMappingMasterProductLayout);
        jPanelSubSettingPokariMappingMasterProductLayout.setHorizontalGroup(
            jPanelSubSettingPokariMappingMasterProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariMappingMasterProductLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelSubSettingPokariMappingMasterProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelSubSettingPokariMappingMasterProductLayout.createSequentialGroup()
                        .addComponent(btnMappingMasterPokariProductSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMappingMasterPokariProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(615, 615, 615)
                        .addComponent(btnMappingMasterPokariProductReload, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelMappingMasterPokariProdukDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubSettingPokariMappingMasterProductLayout.createSequentialGroup()
                        .addComponent(textMappingMasterPokariProductSearchIdBrgScylla, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textMappingMasterPokariProductSearchIdPokari, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMappingMasterPokariProductSearchNamaBarangPokari, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkMappingMasterPokariProductSearchSemua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMappingMasterPokariProductSearchBaruSaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMappingMasterPokariProductSearchDikirimSaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMappingMasterPokariProductSearchAktifSaja)
                        .addGap(18, 18, 18)
                        .addComponent(btnMappingMasterPokariProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSubSettingPokariMappingMasterProductLayout.setVerticalGroup(
            jPanelSubSettingPokariMappingMasterProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariMappingMasterProductLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelSubSettingPokariMappingMasterProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariProductSearchIdBrgScylla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariProductSearchIdPokari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariProductSearchNamaBarangPokari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMappingMasterPokariProductSearch)
                    .addComponent(checkMappingMasterPokariProductSearchBaruSaja)
                    .addComponent(checkMappingMasterPokariProductSearchDikirimSaja)
                    .addComponent(checkMappingMasterPokariProductSearchAktifSaja)
                    .addComponent(checkMappingMasterPokariProductSearchSemua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMappingMasterPokariProdukDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubSettingPokariMappingMasterProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubSettingPokariMappingMasterProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMappingMasterPokariProductDelete)
                        .addComponent(btnMappingMasterPokariProductReload))
                    .addComponent(btnMappingMasterPokariProductSave))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPaneSubSettingPokariMappingMaster.addTab("Map Product Pokari", jPanelSubSettingPokariMappingMasterProduct);

        tableMappingMasterPokariCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane47.setViewportView(tableMappingMasterPokariCustomer);

        btnMappingMasterPokariCustomerSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnMappingMasterPokariCustomerSave.setMnemonic('S');
        btnMappingMasterPokariCustomerSave.setText("Save");

        btnMappingMasterPokariCustomerDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnMappingMasterPokariCustomerDelete.setMnemonic('D');
        btnMappingMasterPokariCustomerDelete.setText("Delete");

        jLabel100.setBackground(new java.awt.Color(0, 0, 255));
        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("AR CUSTOMER");

        jPanelMappingMasterPokariCustomerDetail.setBorder(javax.swing.BorderFactory.createTitledBorder("0 of 0 records"));

        jLabel101.setText("POKARI ID");

        textMappingMasterPokariCustomerIdPokari.setText("jTextField24");

        textMappingMasterPokariCustomerName.setText("jTextField25");

        jLabel102.setText("szCustomer Name Pokari");

        jLabel103.setText("HIRARCHY");

        comboMappingMasterPokariCustomerHirarchy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboMappingMasterPokariCustomerSalesTerritory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel104.setText("SALES TERRITORY");

        comboMappingMasterPokariCustomerEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel105.setText("EMPLOYEE ID");

        comboMappingMasterPokariCustomerCustomerGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel107.setText("CUST GROUP");

        comboMappingMasterPokariCustomerWorkPlace.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel108.setText("WORKPLACE");

        textMappingMasterPokariCustomerIdScylla.setBackground(java.awt.Color.green);
        textMappingMasterPokariCustomerIdScylla.setText("jTextField24");

        jLabel114.setText("Scy Customer ID");

        checkMappingMasterPokariCustomerBaru.setText("Baru");

        checkMappingMasterPokariCustomerDikirim.setText("Dikirim");

        checkMappingMasterPokariCustomerAktif.setText("Aktif");

        textMappingMasterPokariCustomerAddress.setText("jTextField1");

        jLabel88.setText("szAddress");

        textMappingMasterPokariCustomerState.setText("jTextField2");

        textMappingMasterPokariCustomerCity.setText("jTextField3");

        jLabel89.setText("szState");

        jLabel90.setText("szCity");

        textMappingMasterPokariCustomerDistrict.setText("jTextField4");

        jLabel92.setText("szDistrict");

        textMappingMasterPokariCustomerZipCode.setText("jTextField5");

        jLabel96.setText("szZipCode");

        textMappingMasterPokariCustomerPhone.setText("jTextField6");

        jLabel97.setText("szPhone1");

        textMappingMasterPokariCustomerFax.setText("jTextField7");

        jLabel98.setText("szFax");

        textMappingMasterPokariCustomerContact.setText("jTextField8");

        jLabel99.setText("szContact");

        textMappingMasterPokariCustomerEmail.setText("jTextField9");

        jLabel106.setText("szEmail");

        comboMappingMasterPokariCustomerStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel113.setText("szStatus");

        comboMappingMasterPokariCustomerDistrChannelId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel116.setText("szDistrChannelId");

        comboMappingMasterPokariCustomerAllowToCredit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel119.setText("bAllowToCredit");

        textMappingMasterPokariCustomerLimitCredit.setText("jTextField10");

        jLabel120.setText("decLimitCredit");

        comboMappingMasterPokariCustomerPaymentTermId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel124.setText("szPaymentTermId");

        textMappingMasterPokariCustomerNPWP.setText("jTextField11");

        jLabel127.setText("szNPWP");

        textMappingMasterPokariCustomerRegisteredDate.setDateFormatString("dd/MM/yyyy");

        jLabel128.setText("dtmRegisteredDate");

        javax.swing.GroupLayout jPanelMappingMasterPokariCustomerDetailLayout = new javax.swing.GroupLayout(jPanelMappingMasterPokariCustomerDetail);
        jPanelMappingMasterPokariCustomerDetail.setLayout(jPanelMappingMasterPokariCustomerDetailLayout);
        jPanelMappingMasterPokariCustomerDetailLayout.setHorizontalGroup(
            jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                        .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textMappingMasterPokariCustomerDistrict, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel114, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textMappingMasterPokariCustomerIdScylla, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(textMappingMasterPokariCustomerIdPokari, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel101))
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel102))
                                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(textMappingMasterPokariCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMappingMasterPokariCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel88))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMappingMasterPokariCustomerState, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel89))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMappingMasterPokariCustomerCity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel90))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                .addComponent(textMappingMasterPokariCustomerZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMappingMasterPokariCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel97))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMappingMasterPokariCustomerFax, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel98))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel99)
                                    .addComponent(textMappingMasterPokariCustomerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel106)
                                    .addComponent(textMappingMasterPokariCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboMappingMasterPokariCustomerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel113))
                                .addGap(123, 123, 123))))
                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                        .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboMappingMasterPokariCustomerDistrChannelId, javax.swing.GroupLayout.Alignment.LEADING, 0, 127, Short.MAX_VALUE)
                                .addComponent(comboMappingMasterPokariCustomerCustomerGroup, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel107, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel116))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel108)
                            .addComponent(comboMappingMasterPokariCustomerAllowToCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel119)
                            .addComponent(comboMappingMasterPokariCustomerWorkPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103)
                            .addComponent(textMappingMasterPokariCustomerLimitCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel120)
                            .addComponent(comboMappingMasterPokariCustomerHirarchy, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104)
                            .addComponent(comboMappingMasterPokariCustomerPaymentTermId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel124)
                            .addComponent(comboMappingMasterPokariCustomerSalesTerritory, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel105)
                                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                        .addComponent(comboMappingMasterPokariCustomerEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkMappingMasterPokariCustomerBaru)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkMappingMasterPokariCustomerDikirim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkMappingMasterPokariCustomerAktif)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel127)
                                    .addComponent(textMappingMasterPokariCustomerNPWP, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                        .addComponent(textMappingMasterPokariCustomerRegisteredDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(32, 32, 32))
                                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                        .addComponent(jLabel128)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel96)
                        .addContainerGap())))
        );
        jPanelMappingMasterPokariCustomerDetailLayout.setVerticalGroup(
            jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(jLabel102)
                    .addComponent(jLabel114)
                    .addComponent(jLabel88)
                    .addComponent(jLabel89)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMappingMasterPokariCustomerIdPokari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerIdScylla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(jLabel96)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98)
                    .addComponent(jLabel99)
                    .addComponent(jLabel106)
                    .addComponent(jLabel113))
                .addGap(5, 5, 5)
                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMappingMasterPokariCustomerDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMappingMasterPokariCustomerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(jLabel119)
                    .addComponent(jLabel120)
                    .addComponent(jLabel124)
                    .addComponent(jLabel127)
                    .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                        .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboMappingMasterPokariCustomerDistrChannelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMappingMasterPokariCustomerAllowToCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMappingMasterPokariCustomerLimitCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMappingMasterPokariCustomerPaymentTermId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMappingMasterPokariCustomerNPWP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel107)
                                        .addComponent(jLabel108))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboMappingMasterPokariCustomerCustomerGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboMappingMasterPokariCustomerWorkPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                    .addComponent(jLabel103)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboMappingMasterPokariCustomerHirarchy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                .addComponent(jLabel104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMappingMasterPokariCustomerSalesTerritory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMappingMasterPokariCustomerDetailLayout.createSequentialGroup()
                                .addComponent(jLabel105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariCustomerDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboMappingMasterPokariCustomerEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkMappingMasterPokariCustomerBaru)
                                    .addComponent(checkMappingMasterPokariCustomerDikirim)
                                    .addComponent(checkMappingMasterPokariCustomerAktif)))))
                    .addComponent(textMappingMasterPokariCustomerRegisteredDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        textMappingMasterPokariCustomerSearchIdPokari.setText("jTextField19");

        textMappingMasterPokariCustomerSearchName.setText("jTextField20");

        btnMappingMasterPokariCustomerSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/search_16x16.png"))); // NOI18N
        btnMappingMasterPokariCustomerSearch.setMnemonic('F');
        btnMappingMasterPokariCustomerSearch.setText("Filter");

        checkMappingMasterPokariCustomerSearchBaruSaja.setText("Baru");
        checkMappingMasterPokariCustomerSearchBaruSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMappingMasterPokariCustomerSearchBaruSajaActionPerformed(evt);
            }
        });

        btnMappingMasterPokariCustomerReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnMappingMasterPokariCustomerReload.setMnemonic('R');
        btnMappingMasterPokariCustomerReload.setText("Reload");

        textMappingMasterPokariCustomerSearchIdScylla.setBackground(java.awt.Color.green);
        textMappingMasterPokariCustomerSearchIdScylla.setText("jTextField19");

        checkMapingMasterPokariCustomerSearchDikirimSaja.setText("Dikirim");
        checkMapingMasterPokariCustomerSearchDikirimSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMapingMasterPokariCustomerSearchDikirimSajaActionPerformed(evt);
            }
        });

        checkMappingMasterPokariCustomerSearchAktifSaja.setText("Aktif");
        checkMappingMasterPokariCustomerSearchAktifSaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMappingMasterPokariCustomerSearchAktifSajaActionPerformed(evt);
            }
        });

        checkMappingMasterPokariCustomerSearchSemua.setSelected(true);
        checkMappingMasterPokariCustomerSearchSemua.setText("Semua");
        checkMappingMasterPokariCustomerSearchSemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMappingMasterPokariCustomerSearchSemuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSubSettingPokariMappingMasterCustomerLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariMappingMasterCustomer);
        jPanelSubSettingPokariMappingMasterCustomer.setLayout(jPanelSubSettingPokariMappingMasterCustomerLayout);
        jPanelSubSettingPokariMappingMasterCustomerLayout.setHorizontalGroup(
            jPanelSubSettingPokariMappingMasterCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariMappingMasterCustomerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelSubSettingPokariMappingMasterCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubSettingPokariMappingMasterCustomerLayout.createSequentialGroup()
                        .addComponent(jPanelMappingMasterPokariCustomerDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelSubSettingPokariMappingMasterCustomerLayout.createSequentialGroup()
                        .addComponent(textMappingMasterPokariCustomerSearchIdScylla, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(textMappingMasterPokariCustomerSearchIdPokari, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMappingMasterPokariCustomerSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(checkMappingMasterPokariCustomerSearchSemua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMappingMasterPokariCustomerSearchBaruSaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMapingMasterPokariCustomerSearchDikirimSaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMappingMasterPokariCustomerSearchAktifSaja)
                        .addGap(18, 18, 18)
                        .addComponent(btnMappingMasterPokariCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel100)
                        .addGap(49, 49, 49))
                    .addGroup(jPanelSubSettingPokariMappingMasterCustomerLayout.createSequentialGroup()
                        .addComponent(btnMappingMasterPokariCustomerSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMappingMasterPokariCustomerDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMappingMasterPokariCustomerReload, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubSettingPokariMappingMasterCustomerLayout.createSequentialGroup()
                        .addComponent(jScrollPane47)
                        .addContainerGap())))
        );
        jPanelSubSettingPokariMappingMasterCustomerLayout.setVerticalGroup(
            jPanelSubSettingPokariMappingMasterCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariMappingMasterCustomerLayout.createSequentialGroup()
                .addGroup(jPanelSubSettingPokariMappingMasterCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerSearchIdPokari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariCustomerSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMappingMasterPokariCustomerSearch)
                    .addComponent(checkMappingMasterPokariCustomerSearchBaruSaja)
                    .addComponent(textMappingMasterPokariCustomerSearchIdScylla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMapingMasterPokariCustomerSearchDikirimSaja)
                    .addComponent(checkMappingMasterPokariCustomerSearchAktifSaja)
                    .addComponent(checkMappingMasterPokariCustomerSearchSemua))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMappingMasterPokariCustomerDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubSettingPokariMappingMasterCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubSettingPokariMappingMasterCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMappingMasterPokariCustomerDelete)
                        .addComponent(btnMappingMasterPokariCustomerReload))
                    .addComponent(btnMappingMasterPokariCustomerSave))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPaneSubSettingPokariMappingMaster.addTab("Map Customer", jPanelSubSettingPokariMappingMasterCustomer);

        btnMappingMasterPokariEmployeeSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnMappingMasterPokariEmployeeSave.setMnemonic('S');
        btnMappingMasterPokariEmployeeSave.setText("Save");

        btnMappingMasterPokariEmployeeDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnMappingMasterPokariEmployeeDelete.setMnemonic('D');
        btnMappingMasterPokariEmployeeDelete.setText("Delete");

        tableMappingMasterPokariEmployee.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane48.setViewportView(tableMappingMasterPokariEmployee);

        jLabel115.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("MAP SALESMAN/EMPLOYEE");

        jPanelMappingMasterPokariEmployeeDetail.setBorder(javax.swing.BorderFactory.createTitledBorder("0 of 0 records"));

        jLabel117.setText("ID POKARI");

        jLabel118.setText("Sales/EMPLOYEE Name ");

        textMappingMasterPokariEmployeeIdPokari.setText("jTextField5");

        textMappingMasterPokariEmployeeName.setText("jTextField6");

        textMappingMasterPokariEmployeeVehicleId.setText("jTextField9");

        jLabel121.setText("Vehicle ID");

        textMappingMasterPokariEmployeeVehicleName.setText("jTextField10");

        textMappingMasterPokariEmployeePoliceNo.setText("jTextField11");

        jLabel122.setText("Vehi Name");

        jLabel123.setText("Police No");

        textMappingMasterPokariEmployeeIdScylla.setBackground(java.awt.Color.green);
        textMappingMasterPokariEmployeeIdScylla.setText("jTextField5");

        jLabel125.setText("Employee ID Scylla");

        jLabel109.setText("WORKPLACE");

        comboMappingMasterPokariEmployeeWorkplace.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel110.setText("SALES TYPE");

        comboMappingMasterPokariEmployeeSalesType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel111.setText("SALES GROUP");

        comboMappingMasterPokariEmployeeSalesGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel112.setText("SALES TEAM");

        comboMappingMasterPokariEmployeeSalesTeam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        checkMappingMasterPokariSpEmployeeBaru.setText("Baru");

        checkMappingMasterPokariSpEmployeeDikirim.setText("Dikirim");

        checkMappingMasterPokariSpEmployeeAktif.setText("Aktif");

        javax.swing.GroupLayout jPanelMappingMasterPokariEmployeeDetailLayout = new javax.swing.GroupLayout(jPanelMappingMasterPokariEmployeeDetail);
        jPanelMappingMasterPokariEmployeeDetail.setLayout(jPanelMappingMasterPokariEmployeeDetailLayout);
        jPanelMappingMasterPokariEmployeeDetailLayout.setHorizontalGroup(
            jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                        .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMappingMasterPokariEmployeeWorkplace, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel109))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMappingMasterPokariEmployeeSalesType, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel110))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMappingMasterPokariEmployeeSalesGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel111))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                                .addComponent(jLabel112)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                                .addComponent(comboMappingMasterPokariEmployeeSalesTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                        .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(checkMappingMasterPokariSpEmployeeBaru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkMappingMasterPokariSpEmployeeDikirim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkMappingMasterPokariSpEmployeeAktif))
                            .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                                .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textMappingMasterPokariEmployeeIdScylla, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel117)
                                    .addComponent(textMappingMasterPokariEmployeeIdPokari, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textMappingMasterPokariEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textMappingMasterPokariEmployeeVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel122)
                                    .addComponent(textMappingMasterPokariEmployeeVehicleName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel123)
                                    .addComponent(textMappingMasterPokariEmployeePoliceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(113, 113, 113))))
        );
        jPanelMappingMasterPokariEmployeeDetailLayout.setVerticalGroup(
            jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(jLabel118)
                    .addComponent(jLabel121)
                    .addComponent(jLabel122)
                    .addComponent(jLabel123)
                    .addComponent(jLabel125))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMappingMasterPokariEmployeeIdPokari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariEmployeeVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariEmployeeVehicleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariEmployeePoliceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMappingMasterPokariEmployeeIdScylla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboMappingMasterPokariEmployeeWorkplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboMappingMasterPokariEmployeeSalesType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboMappingMasterPokariEmployeeSalesGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createSequentialGroup()
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboMappingMasterPokariEmployeeSalesTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMappingMasterPokariEmployeeDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(checkMappingMasterPokariSpEmployeeBaru)
                                .addComponent(checkMappingMasterPokariSpEmployeeDikirim)
                                .addComponent(checkMappingMasterPokariSpEmployeeAktif))))))
        );

        btnMappingMasterPokariEmployeeReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnMappingMasterPokariEmployeeReload.setMnemonic('R');
        btnMappingMasterPokariEmployeeReload.setText("Reload");

        javax.swing.GroupLayout jPanelSubSettingPokariMappingMasterEmployeeLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariMappingMasterEmployee);
        jPanelSubSettingPokariMappingMasterEmployee.setLayout(jPanelSubSettingPokariMappingMasterEmployeeLayout);
        jPanelSubSettingPokariMappingMasterEmployeeLayout.setHorizontalGroup(
            jPanelSubSettingPokariMappingMasterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubSettingPokariMappingMasterEmployeeLayout.createSequentialGroup()
                .addGroup(jPanelSubSettingPokariMappingMasterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSubSettingPokariMappingMasterEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSubSettingPokariMappingMasterEmployeeLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelSubSettingPokariMappingMasterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSubSettingPokariMappingMasterEmployeeLayout.createSequentialGroup()
                                .addComponent(btnMappingMasterPokariEmployeeSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMappingMasterPokariEmployeeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMappingMasterPokariEmployeeReload, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanelSubSettingPokariMappingMasterEmployeeLayout.createSequentialGroup()
                                .addGroup(jPanelSubSettingPokariMappingMasterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelMappingMasterPokariEmployeeDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(41, 41, 41))
        );
        jPanelSubSettingPokariMappingMasterEmployeeLayout.setVerticalGroup(
            jPanelSubSettingPokariMappingMasterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubSettingPokariMappingMasterEmployeeLayout.createSequentialGroup()
                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMappingMasterPokariEmployeeDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelSubSettingPokariMappingMasterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubSettingPokariMappingMasterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMappingMasterPokariEmployeeDelete)
                        .addComponent(btnMappingMasterPokariEmployeeReload))
                    .addComponent(btnMappingMasterPokariEmployeeSave))
                .addGap(35, 35, 35))
        );

        jTabbedPaneSubSettingPokariMappingMaster.addTab("Map Employee", jPanelSubSettingPokariMappingMasterEmployee);

        javax.swing.GroupLayout jPanelSubSettingPokariMappingMasterLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariMappingMaster);
        jPanelSubSettingPokariMappingMaster.setLayout(jPanelSubSettingPokariMappingMasterLayout);
        jPanelSubSettingPokariMappingMasterLayout.setHorizontalGroup(
            jPanelSubSettingPokariMappingMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariMappingMasterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneSubSettingPokariMappingMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSubSettingPokariMappingMasterLayout.setVerticalGroup(
            jPanelSubSettingPokariMappingMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneSubSettingPokariMappingMaster, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 594, Short.MAX_VALUE)
        );

        jTabbedPaneUtamaSettingPokari.addTab("Mapping Master", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Database.png")), jPanelSubSettingPokariMappingMaster); // NOI18N

        jPanelSubSettingPokariTabelTabel.setForeground(new java.awt.Color(0, 0, 255));

        jTabbedPaneSubSettingPokariTabelTabel.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        tableTabelTabelPokariCustomerGroup.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane49.setViewportView(tableTabelTabelPokariCustomerGroup);

        jLabel126.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("ArCustomer  >> Customer Group");

        textTabelTabelPokariCustomerGroupIdGroup.setText("jTextField1");

        textTabelTabelPokariCustomerGroupDescription.setText("jTextField2");

        btnTabelTabelPokariCustomerGroupSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelTabelPokariCustomerGroupSave.setMnemonic('S');
        btnTabelTabelPokariCustomerGroupSave.setText("Save");

        btnTabelTabelPokariCustomerGroupDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelTabelPokariCustomerGroupDelete.setMnemonic('D');
        btnTabelTabelPokariCustomerGroupDelete.setText("Delete");

        btnTabelTabelPokariCustomerGroupSetDefault.setText("Set Default");

        javax.swing.GroupLayout jPanelSubSettingPokariTabelTabelCustomerGroupLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariTabelTabelCustomerGroup);
        jPanelSubSettingPokariTabelTabelCustomerGroup.setLayout(jPanelSubSettingPokariTabelTabelCustomerGroupLayout);
        jPanelSubSettingPokariTabelTabelCustomerGroupLayout.setHorizontalGroup(
            jPanelSubSettingPokariTabelTabelCustomerGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelCustomerGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubSettingPokariTabelTabelCustomerGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel126, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addComponent(jScrollPane49)
                    .addGroup(jPanelSubSettingPokariTabelTabelCustomerGroupLayout.createSequentialGroup()
                        .addComponent(btnTabelTabelPokariCustomerGroupSetDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(textTabelTabelPokariCustomerGroupIdGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelTabelPokariCustomerGroupDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnTabelTabelPokariCustomerGroupSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTabelTabelPokariCustomerGroupDelete)))
                .addContainerGap())
        );
        jPanelSubSettingPokariTabelTabelCustomerGroupLayout.setVerticalGroup(
            jPanelSubSettingPokariTabelTabelCustomerGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelCustomerGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel126)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubSettingPokariTabelTabelCustomerGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelTabelPokariCustomerGroupIdGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelTabelPokariCustomerGroupDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelTabelPokariCustomerGroupDelete)
                    .addComponent(btnTabelTabelPokariCustomerGroupSave)
                    .addComponent(btnTabelTabelPokariCustomerGroupSetDefault))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPaneSubSettingPokariTabelTabel.addTab("Customer Group", jPanelSubSettingPokariTabelTabelCustomerGroup);

        tableTabelTabelPokariCustomerHirarchy.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane53.setViewportView(tableTabelTabelPokariCustomerHirarchy);

        textTabelTabelPokariCustomerHirarchyIdHirarchy.setText("jTextField1");

        textTabelTabelPokariCustomerHirarchyDescription.setText("jTextField2");

        btnTabelTabelPokariCustomerHirarchySave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelTabelPokariCustomerHirarchySave.setMnemonic('S');
        btnTabelTabelPokariCustomerHirarchySave.setText("Save");

        btnTabelTabelPokariCustomerHirarchyDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelTabelPokariCustomerHirarchyDelete.setMnemonic('D');
        btnTabelTabelPokariCustomerHirarchyDelete.setText("Delete");

        jLabel131.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("ArCustomer >> Customer Hirarchy");

        btnTabelTabelPokariCustomerHirarchySetDefault.setText("Set Default");

        javax.swing.GroupLayout jPanelSubSettingPokariTabelTabelCustomerHirarchyLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariTabelTabelCustomerHirarchy);
        jPanelSubSettingPokariTabelTabelCustomerHirarchy.setLayout(jPanelSubSettingPokariTabelTabelCustomerHirarchyLayout);
        jPanelSubSettingPokariTabelTabelCustomerHirarchyLayout.setHorizontalGroup(
            jPanelSubSettingPokariTabelTabelCustomerHirarchyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelCustomerHirarchyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubSettingPokariTabelTabelCustomerHirarchyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane53)
                    .addGroup(jPanelSubSettingPokariTabelTabelCustomerHirarchyLayout.createSequentialGroup()
                        .addComponent(btnTabelTabelPokariCustomerHirarchySetDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textTabelTabelPokariCustomerHirarchyIdHirarchy, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelTabelPokariCustomerHirarchyDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnTabelTabelPokariCustomerHirarchySave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTabelTabelPokariCustomerHirarchyDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSubSettingPokariTabelTabelCustomerHirarchyLayout.setVerticalGroup(
            jPanelSubSettingPokariTabelTabelCustomerHirarchyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelCustomerHirarchyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubSettingPokariTabelTabelCustomerHirarchyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelTabelPokariCustomerHirarchyIdHirarchy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelTabelPokariCustomerHirarchyDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelTabelPokariCustomerHirarchyDelete)
                    .addComponent(btnTabelTabelPokariCustomerHirarchySave)
                    .addComponent(btnTabelTabelPokariCustomerHirarchySetDefault))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPaneSubSettingPokariTabelTabel.addTab("Customer Hirarchy", jPanelSubSettingPokariTabelTabelCustomerHirarchy);

        tableTabelTabelPokariSalesTerritory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane54.setViewportView(tableTabelTabelPokariSalesTerritory);

        textTabelTabelPokariSalesTerritoryIdTerritory.setText("jTextField1");

        textTabelTabelPokariSalesTerritoryDescription.setText("jTextField2");

        btnTabelTabelPokariSalesTerritorySave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelTabelPokariSalesTerritorySave.setMnemonic('S');
        btnTabelTabelPokariSalesTerritorySave.setText("Save");

        btnTabelTabelPokariSalesTerritoryDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelTabelPokariSalesTerritoryDelete.setMnemonic('D');
        btnTabelTabelPokariSalesTerritoryDelete.setText("Delete");

        jLabel132.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setText("ArCustomer >> Sales Territory");

        btnTabelTabelPokariSalesTerritorySetDefault.setText("Set Default");

        javax.swing.GroupLayout jPanelSubSettingPokariTabelTabelSalesTerritoryLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariTabelTabelSalesTerritory);
        jPanelSubSettingPokariTabelTabelSalesTerritory.setLayout(jPanelSubSettingPokariTabelTabelSalesTerritoryLayout);
        jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.setHorizontalGroup(
            jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.createSequentialGroup()
                                .addComponent(textTabelTabelPokariSalesTerritoryDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnTabelTabelPokariSalesTerritorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTabelTabelPokariSalesTerritoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.createSequentialGroup()
                        .addComponent(btnTabelTabelPokariSalesTerritorySetDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(textTabelTabelPokariSalesTerritoryIdTerritory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.setVerticalGroup(
            jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel132)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanelSubSettingPokariTabelTabelSalesTerritoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTabelTabelPokariSalesTerritoryDelete)
                    .addComponent(btnTabelTabelPokariSalesTerritorySave)
                    .addComponent(textTabelTabelPokariSalesTerritoryDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelTabelPokariSalesTerritoryIdTerritory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelTabelPokariSalesTerritorySetDefault))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPaneSubSettingPokariTabelTabel.addTab("Sales Territory", jPanelSubSettingPokariTabelTabelSalesTerritory);

        tableTabelTabelPokariWorkplace.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane55.setViewportView(tableTabelTabelPokariWorkplace);

        textTabelTabelPokariWorkplaceWorkplaceId.setText("jTextField1");

        textTabelTabelPokariWorkplaceArea.setText("jTextField2");

        btnTabelTabelPokariWorkplaceSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelTabelPokariWorkplaceSave.setMnemonic('S');
        btnTabelTabelPokariWorkplaceSave.setText("Save");

        btnTabelTabelPokariWorkplaceDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelTabelPokariWorkplaceDelete.setMnemonic('D');
        btnTabelTabelPokariWorkplaceDelete.setText("Delete");

        jLabel133.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setText("ArCustomer >> Workplace");

        btnTabelTabelPokariWorkplaceSetDefault.setText("Set Default");

        javax.swing.GroupLayout jPanelSubSettingPokariTabelTabelWorkplaceLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariTabelTabelWorkplace);
        jPanelSubSettingPokariTabelTabelWorkplace.setLayout(jPanelSubSettingPokariTabelTabelWorkplaceLayout);
        jPanelSubSettingPokariTabelTabelWorkplaceLayout.setHorizontalGroup(
            jPanelSubSettingPokariTabelTabelWorkplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelWorkplaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubSettingPokariTabelTabelWorkplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane55, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addGroup(jPanelSubSettingPokariTabelTabelWorkplaceLayout.createSequentialGroup()
                        .addComponent(btnTabelTabelPokariWorkplaceSetDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textTabelTabelPokariWorkplaceWorkplaceId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelTabelPokariWorkplaceArea, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnTabelTabelPokariWorkplaceSave, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTabelTabelPokariWorkplaceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel133, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSubSettingPokariTabelTabelWorkplaceLayout.setVerticalGroup(
            jPanelSubSettingPokariTabelTabelWorkplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelWorkplaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel133)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubSettingPokariTabelTabelWorkplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelTabelPokariWorkplaceWorkplaceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelTabelPokariWorkplaceArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelTabelPokariWorkplaceDelete)
                    .addComponent(btnTabelTabelPokariWorkplaceSave)
                    .addComponent(btnTabelTabelPokariWorkplaceSetDefault))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPaneSubSettingPokariTabelTabel.addTab("Work Place", jPanelSubSettingPokariTabelTabelWorkplace);

        tableTabelTabelPokariTeamSales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane56.setViewportView(tableTabelTabelPokariTeamSales);

        btnTabelTabelPokariTeamSalesSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelTabelPokariTeamSalesSave.setMnemonic('S');
        btnTabelTabelPokariTeamSalesSave.setText("Save");

        btnTabelTabelPokariTeamSalesDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelTabelPokariTeamSalesDelete.setMnemonic('D');
        btnTabelTabelPokariTeamSalesDelete.setText("Delete");

        textTabelTabelPokariTeamSalesTeamId.setText("jTextField1");

        textTabelTabelPokariTeamSalesName.setText("jTextField2");

        jLabel134.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel134.setText("SpEmployee >> Team Sales");

        btnTabelTabelPokariTeamSalesSetDefault.setText("Set Default");

        javax.swing.GroupLayout jPanelSubSettingPokariTabelTabelTeamSalesLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariTabelTabelTeamSales);
        jPanelSubSettingPokariTabelTabelTeamSales.setLayout(jPanelSubSettingPokariTabelTabelTeamSalesLayout);
        jPanelSubSettingPokariTabelTabelTeamSalesLayout.setHorizontalGroup(
            jPanelSubSettingPokariTabelTabelTeamSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelTeamSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubSettingPokariTabelTabelTeamSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane56, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addGroup(jPanelSubSettingPokariTabelTabelTeamSalesLayout.createSequentialGroup()
                        .addComponent(btnTabelTabelPokariTeamSalesSetDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textTabelTabelPokariTeamSalesTeamId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelTabelPokariTeamSalesName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnTabelTabelPokariTeamSalesSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTabelTabelPokariTeamSalesDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSubSettingPokariTabelTabelTeamSalesLayout.setVerticalGroup(
            jPanelSubSettingPokariTabelTabelTeamSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelTeamSalesLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubSettingPokariTabelTabelTeamSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelTabelPokariTeamSalesTeamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelTabelPokariTeamSalesName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelTabelPokariTeamSalesSave)
                    .addComponent(btnTabelTabelPokariTeamSalesDelete)
                    .addComponent(btnTabelTabelPokariTeamSalesSetDefault))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPaneSubSettingPokariTabelTabel.addTab("Team Sales", jPanelSubSettingPokariTabelTabelTeamSales);

        tableTabelTabelPokariTypeSales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane57.setViewportView(tableTabelTabelPokariTypeSales);

        btnTabelTabelPokariTypeSalesSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelTabelPokariTypeSalesSave.setMnemonic('S');
        btnTabelTabelPokariTypeSalesSave.setText("Save");

        btnTabelTabelPokariTypeSalesDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelTabelPokariTypeSalesDelete.setMnemonic('D');
        btnTabelTabelPokariTypeSalesDelete.setText("Delete");

        textTabelTabelPokariTypeSalesTypeSales.setText("jTextField1");

        textTabelTabelPokariTypeSalesName.setText("jTextField2");

        jLabel135.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel135.setText("SpEmployee >> Type Sales");

        btnTabelTabelPokariTypeSalesSetDefault.setText("Set Default");

        javax.swing.GroupLayout jPanelSubSettingPokariTabelTabelTypeSalesLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariTabelTabelTypeSales);
        jPanelSubSettingPokariTabelTabelTypeSales.setLayout(jPanelSubSettingPokariTabelTabelTypeSalesLayout);
        jPanelSubSettingPokariTabelTabelTypeSalesLayout.setHorizontalGroup(
            jPanelSubSettingPokariTabelTabelTypeSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelTypeSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubSettingPokariTabelTabelTypeSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane57, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addGroup(jPanelSubSettingPokariTabelTabelTypeSalesLayout.createSequentialGroup()
                        .addComponent(btnTabelTabelPokariTypeSalesSetDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textTabelTabelPokariTypeSalesTypeSales, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelTabelPokariTypeSalesName, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnTabelTabelPokariTypeSalesSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTabelTabelPokariTypeSalesDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel135, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSubSettingPokariTabelTabelTypeSalesLayout.setVerticalGroup(
            jPanelSubSettingPokariTabelTabelTypeSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelTypeSalesLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubSettingPokariTabelTabelTypeSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelTabelPokariTypeSalesTypeSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelTabelPokariTypeSalesName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelTabelPokariTypeSalesSave)
                    .addComponent(btnTabelTabelPokariTypeSalesDelete)
                    .addComponent(btnTabelTabelPokariTypeSalesSetDefault))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPaneSubSettingPokariTabelTabel.addTab("Type Sales", jPanelSubSettingPokariTabelTabelTypeSales);

        tableTabelTabelPokariGroupSales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane58.setViewportView(tableTabelTabelPokariGroupSales);

        btnTabelTabelPokariGroupSalesSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelTabelPokariGroupSalesSave.setMnemonic('S');
        btnTabelTabelPokariGroupSalesSave.setText("Save");

        btnTabelTabelPokariGroupSalesDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelTabelPokariGroupSalesDelete.setMnemonic('D');
        btnTabelTabelPokariGroupSalesDelete.setText("Delete");

        textTabelTabelPokariGroupSalesTypeGroup.setText("jTextField1");

        textTabelTabelPokariGroupSalesName.setText("jTextField2");

        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel136.setText("SpEmployee >> Group Customer");

        btnTabelTabelPokariGroupSalesSetDefault.setText("Set Default");

        javax.swing.GroupLayout jPanelSubSettingPokariTabelTabelGroupSalesLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariTabelTabelGroupSales);
        jPanelSubSettingPokariTabelTabelGroupSales.setLayout(jPanelSubSettingPokariTabelTabelGroupSalesLayout);
        jPanelSubSettingPokariTabelTabelGroupSalesLayout.setHorizontalGroup(
            jPanelSubSettingPokariTabelTabelGroupSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelGroupSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubSettingPokariTabelTabelGroupSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane58, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addGroup(jPanelSubSettingPokariTabelTabelGroupSalesLayout.createSequentialGroup()
                        .addComponent(btnTabelTabelPokariGroupSalesSetDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textTabelTabelPokariGroupSalesTypeGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelTabelPokariGroupSalesName, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(btnTabelTabelPokariGroupSalesSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTabelTabelPokariGroupSalesDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSubSettingPokariTabelTabelGroupSalesLayout.setVerticalGroup(
            jPanelSubSettingPokariTabelTabelGroupSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelGroupSalesLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubSettingPokariTabelTabelGroupSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelTabelPokariGroupSalesTypeGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelTabelPokariGroupSalesName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelTabelPokariGroupSalesSave)
                    .addComponent(btnTabelTabelPokariGroupSalesDelete)
                    .addComponent(btnTabelTabelPokariGroupSalesSetDefault))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPaneSubSettingPokariTabelTabel.addTab("Group Sales", jPanelSubSettingPokariTabelTabelGroupSales);

        tableTabelTabelPokariProductBrand.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane59.setViewportView(tableTabelTabelPokariProductBrand);

        btnTabelTabelPokariProductBrandSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnTabelTabelPokariProductBrandSave.setMnemonic('S');
        btnTabelTabelPokariProductBrandSave.setText("Save");

        btnTabelTabelPokariProductBrandDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnTabelTabelPokariProductBrandDelete.setMnemonic('D');
        btnTabelTabelPokariProductBrandDelete.setText("Delete");

        textTabelTabelPokariProductBrandBrandId.setText("jTextField1");

        textTabelTabelPokariProductBrandName.setText("jTextField2");

        jLabel137.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel137.setText("Product >> Product Brand");

        btnTabelTabelPokariProductBrandSetDefault.setText("Set Default");

        textTabelTabelPokariProductBrandHirarchy.setText("jTextField1");

        javax.swing.GroupLayout jPanelSubSettingPokariTabelTabelProductBrandLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariTabelTabelProductBrand);
        jPanelSubSettingPokariTabelTabelProductBrand.setLayout(jPanelSubSettingPokariTabelTabelProductBrandLayout);
        jPanelSubSettingPokariTabelTabelProductBrandLayout.setHorizontalGroup(
            jPanelSubSettingPokariTabelTabelProductBrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelProductBrandLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubSettingPokariTabelTabelProductBrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane59, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addGroup(jPanelSubSettingPokariTabelTabelProductBrandLayout.createSequentialGroup()
                        .addComponent(btnTabelTabelPokariProductBrandSetDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelTabelPokariProductBrandBrandId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelTabelPokariProductBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTabelTabelPokariProductBrandHirarchy, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTabelTabelPokariProductBrandSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTabelTabelPokariProductBrandDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSubSettingPokariTabelTabelProductBrandLayout.setVerticalGroup(
            jPanelSubSettingPokariTabelTabelProductBrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelProductBrandLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubSettingPokariTabelTabelProductBrandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTabelTabelPokariProductBrandBrandId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTabelTabelPokariProductBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabelTabelPokariProductBrandSave)
                    .addComponent(btnTabelTabelPokariProductBrandDelete)
                    .addComponent(btnTabelTabelPokariProductBrandSetDefault)
                    .addComponent(textTabelTabelPokariProductBrandHirarchy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPaneSubSettingPokariTabelTabel.addTab("Product Brand", jPanelSubSettingPokariTabelTabelProductBrand);

        javax.swing.GroupLayout jPanelSubSettingPokariTabelTabelLayout = new javax.swing.GroupLayout(jPanelSubSettingPokariTabelTabel);
        jPanelSubSettingPokariTabelTabel.setLayout(jPanelSubSettingPokariTabelTabelLayout);
        jPanelSubSettingPokariTabelTabelLayout.setHorizontalGroup(
            jPanelSubSettingPokariTabelTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneSubSettingPokariTabelTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanelSubSettingPokariTabelTabelLayout.setVerticalGroup(
            jPanelSubSettingPokariTabelTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingPokariTabelTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneSubSettingPokariTabelTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaSettingPokari.addTab("Tabel-Tabel", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Database.png")), jPanelSubSettingPokariTabelTabel); // NOI18N

        javax.swing.GroupLayout jPanelUtamaSettingPokariLayout = new javax.swing.GroupLayout(jPanelUtamaSettingPokari);
        jPanelUtamaSettingPokari.setLayout(jPanelUtamaSettingPokariLayout);
        jPanelUtamaSettingPokariLayout.setHorizontalGroup(
            jPanelUtamaSettingPokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
            .addGroup(jPanelUtamaSettingPokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUtamaSettingPokariLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPaneUtamaSettingPokari, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(67, 67, 67)))
        );
        jPanelUtamaSettingPokariLayout.setVerticalGroup(
            jPanelUtamaSettingPokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(jPanelUtamaSettingPokariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUtamaSettingPokariLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jTabbedPaneUtamaSettingPokari, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        jTabbedPaneUtama.addTab("Setting Pokari", jPanelUtamaSettingPokari);

        jPanelSubSettingKekMappingMaster.setForeground(new java.awt.Color(0, 0, 255));

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

        javax.swing.GroupLayout jPanelMappingMasterPanelUtamaLayout = new javax.swing.GroupLayout(jPanelMappingMasterPanelUtama);
        jPanelMappingMasterPanelUtama.setLayout(jPanelMappingMasterPanelUtamaLayout);
        jPanelMappingMasterPanelUtamaLayout.setHorizontalGroup(
            jPanelMappingMasterPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMappingMasterPanelUtamaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelMappingMasterPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMappingMasterPanelUtamaLayout.createSequentialGroup()
                        .addComponent(btnMapProductSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMapProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(615, 615, 615)
                        .addComponent(btnMapProductReload, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMappingMasterPanelUtamaLayout.createSequentialGroup()
                        .addComponent(textMapProductSearchIdBrgScylla, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMapProductSearchIdSap, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMapProductSearchNamaBarangSAP, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(4, 4, 4)
                        .addComponent(jLabel41))
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMappingMasterPanelUtamaLayout.setVerticalGroup(
            jPanelMappingMasterPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMappingMasterPanelUtamaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelMappingMasterPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(jPanelMappingMasterPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMappingMasterPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMapProductDelete)
                        .addComponent(btnMapProductReload))
                    .addComponent(btnMapProductSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneMapping.addTab("Map Product", jPanelMappingMasterPanelUtama);

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanelSubSettingKekMappingMasterLayout = new javax.swing.GroupLayout(jPanelSubSettingKekMappingMaster);
        jPanelSubSettingKekMappingMaster.setLayout(jPanelSubSettingKekMappingMasterLayout);
        jPanelSubSettingKekMappingMasterLayout.setHorizontalGroup(
            jPanelSubSettingKekMappingMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingKekMappingMasterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneMapping, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelSubSettingKekMappingMasterLayout.setVerticalGroup(
            jPanelSubSettingKekMappingMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingKekMappingMasterLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jTabbedPaneMapping, javax.swing.GroupLayout.PREFERRED_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneUtamaSettingKek.addTab("Mapping Master", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Database.png")), jPanelSubSettingKekMappingMaster); // NOI18N

        jPanelSubSettingKekTabelTabel.setForeground(new java.awt.Color(0, 0, 255));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
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
                .addContainerGap(31, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
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
                .addContainerGap(78, Short.MAX_VALUE))
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
                .addContainerGap(95, Short.MAX_VALUE))
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
                .addContainerGap(69, Short.MAX_VALUE))
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
                .addContainerGap(77, Short.MAX_VALUE))
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
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Prod Size", jPanel72);

        javax.swing.GroupLayout jPanelSubSettingKekTabelTabelLayout = new javax.swing.GroupLayout(jPanelSubSettingKekTabelTabel);
        jPanelSubSettingKekTabelTabel.setLayout(jPanelSubSettingKekTabelTabelLayout);
        jPanelSubSettingKekTabelTabelLayout.setHorizontalGroup(
            jPanelSubSettingKekTabelTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingKekTabelTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanelSubSettingKekTabelTabelLayout.setVerticalGroup(
            jPanelSubSettingKekTabelTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubSettingKekTabelTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPaneUtamaSettingKek.addTab("Tabel-Tabel", new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/Database.png")), jPanelSubSettingKekTabelTabel); // NOI18N

        javax.swing.GroupLayout jPanelUtamaSettingKekLayout = new javax.swing.GroupLayout(jPanelUtamaSettingKek);
        jPanelUtamaSettingKek.setLayout(jPanelUtamaSettingKekLayout);
        jPanelUtamaSettingKekLayout.setHorizontalGroup(
            jPanelUtamaSettingKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1082, Short.MAX_VALUE)
            .addGroup(jPanelUtamaSettingKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUtamaSettingKekLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPaneUtamaSettingKek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelUtamaSettingKekLayout.setVerticalGroup(
            jPanelUtamaSettingKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(jPanelUtamaSettingKekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUtamaSettingKekLayout.createSequentialGroup()
                    .addGap(0, 47, Short.MAX_VALUE)
                    .addComponent(jTabbedPaneUtamaSettingKek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 48, Short.MAX_VALUE)))
        );

        jTabbedPaneUtama.addTab("Setting KEK", jPanelUtamaSettingKek);

        javax.swing.GroupLayout jPanelUtamaTemplates1Layout = new javax.swing.GroupLayout(jPanelUtamaTemplates1);
        jPanelUtamaTemplates1.setLayout(jPanelUtamaTemplates1Layout);
        jPanelUtamaTemplates1Layout.setHorizontalGroup(
            jPanelUtamaTemplates1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUtamaTemplates1Layout.createSequentialGroup()
                .addGroup(jPanelUtamaTemplates1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGenerateExtractKek1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelGenerateExtractPokari1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelGenerateExtractBaygon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 131, Short.MAX_VALUE))
        );
        jPanelUtamaTemplates1Layout.setVerticalGroup(
            jPanelUtamaTemplates1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUtamaTemplates1Layout.createSequentialGroup()
                .addComponent(jPanelGenerateExtractKek1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGenerateExtractPokari1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGenerateExtractBaygon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 463, Short.MAX_VALUE))
        );

        jTabbedPaneUtama.addTab("Templates1", jPanelUtamaTemplates1);

        javax.swing.GroupLayout jPanelUtamaLayout = new javax.swing.GroupLayout(jPanelUtama);
        jPanelUtama.setLayout(jPanelUtamaLayout);
        jPanelUtamaLayout.setHorizontalGroup(
            jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUtamaLayout.createSequentialGroup()
                .addComponent(jTabbedPaneUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 1185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanelUtamaLayout.setVerticalGroup(
            jPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneUtama)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        //KITA TARUH DI VIEW SUBCHILD
        //resetSearchMapProduct();
    }//GEN-LAST:event_checkMapProductSearchSemuaActionPerformed

    private void checkMapOutletSearchSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMapOutletSearchSemuaActionPerformed
        // TODO add your handling code here:
        //KITA TARUH DI VIEW SUBCHILD
        //resetSearchMapOutlet();
    }//GEN-LAST:event_checkMapOutletSearchSemuaActionPerformed

    private void checkMappingMasterPokariProductSearchBaruSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMappingMasterPokariProductSearchBaruSajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMappingMasterPokariProductSearchBaruSajaActionPerformed

    private void checkMappingMasterPokariProductSearchDikirimSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMappingMasterPokariProductSearchDikirimSajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMappingMasterPokariProductSearchDikirimSajaActionPerformed

    private void checkMappingMasterPokariProductSearchAktifSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMappingMasterPokariProductSearchAktifSajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMappingMasterPokariProductSearchAktifSajaActionPerformed

    private void checkMappingMasterPokariProductSearchSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMappingMasterPokariProductSearchSemuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMappingMasterPokariProductSearchSemuaActionPerformed

    private void checkMappingMasterPokariCustomerSearchBaruSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMappingMasterPokariCustomerSearchBaruSajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMappingMasterPokariCustomerSearchBaruSajaActionPerformed

    private void checkMapingMasterPokariCustomerSearchDikirimSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMapingMasterPokariCustomerSearchDikirimSajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMapingMasterPokariCustomerSearchDikirimSajaActionPerformed

    private void checkMappingMasterPokariCustomerSearchAktifSajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMappingMasterPokariCustomerSearchAktifSajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMappingMasterPokariCustomerSearchAktifSajaActionPerformed

    private void checkMappingMasterPokariCustomerSearchSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMappingMasterPokariCustomerSearchSemuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMappingMasterPokariCustomerSearchSemuaActionPerformed

    private void radioBackupAndRestoreBackupTabDelimetedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBackupAndRestoreBackupTabDelimetedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBackupAndRestoreBackupTabDelimetedActionPerformed

    private void textKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocationActionPerformed

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
            java.util.logging.Logger.getLogger(BridgingViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BridgingViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BridgingViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BridgingViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BridgingViewJFrame().setVisible(true);
            }
        });
    }

    
    
    public JButton getBtnPathInputAuto() {
        return btnPathInputAuto;
    }
    public JButton getBtnExtractClient() {
        return btnExtractTAdjStk;
    }
    public JButton getBtnExtractSales() {
        return btnExtractMSalesman;
    }
    public JButton getBtnExtractSo() {
        return btnExtractTDatdpr;
    }
    public JButton getBtnExtractStock() {
        return btnExtractMSlsOut;
    }
    public JButton getBtnGeneralSettingReload() {
        return btnGeneralSettingReload;
    }
    public JButton getBtnGeneralSettingSimpan() {
        return btnGeneralSettingSimpan;
    }

    public JPanel getjPanelSubKonfigAndUtilBaygon() {
        return jPanelSubKonfigAndUtilBaygon;
    }
    public JPanel getjPanelSubKonfigAndUtilPokari(){
        return jPanelSubKonfigAndUtilPokari;
    }
    public JPanel getjPanelSubKonfigAndUtilEmail() {
        return jPanelSubKonfigAndUtilEmail;
    }

    public JTabbedPane getjTabbedPaneUtamaConfigAndUtils() {
        return jTabbedPaneUtamaConfigAndUtils;
    }

    public JButton getBtnGeneralSettingKonfigurasiEmaiSimpan() {
        return btnGeneralSettingKonfigurasiEmaiSimpan;
    }
    
    public JButton getBtnInputCvOutletReload() {
        return btnInputCvOutletReload;
    }
    public JButton getBtnInputJheaderReload() {
        return btnInputJheaderReload;
    }

    public JButton getBtnInputJpcodeReload() {
        return btnInputJpcodeReload;
    }
    public JButton getBtnInputJtprbReload() {
        return btnInputJtprbReload;
    }
    public JButton getBtnInputJtpruReload() {
        return btnInputJtpruReload;
    }
    public JButton getBtnInputMasterReload() {
        return btnInputMasterReload;
    }
    public JButton getBtnInputOutletReload() {
        return btnInputOutletReload;
    }
    public JButton getBtnInputSalesmanReload() {
        return btnInputSalesmanReload;
    }
    public JButton getBtnInputStockReload() {
        return btnInputStockReload;
    }
    public JButton getBtnMapTipeOutletHapus() {
        return btnMapTipeOutletHapus;
    }
    public JButton getBtnMapTipeOutletSimpan() {
        return btnMapTipeOutletSimpan;
    }
    public JButton getBtnMapTipeOutletReload() {
        return btnMapTipeOutletReload;
    }

    public JButton getBtnPathInputCvOutlet() {
        return btnPathInputCvOutlet;
    }

    public JButton getBtnPathInputJHeader() {
        return btnPathInputJHeader;
    }

    public JButton getBtnPathInputJPcode() {
        return btnPathInputJPcode;
    }

    public JButton getBtnPathInputJTprb() {
        return btnPathInputJTprb;
    }

    public JButton getBtnPathInputJTpru() {
        return btnPathInputJTpru;
    }

    public JButton getBtnPathInputMaster() {
        return btnPathInputMaster;
    }

    public JButton getBtnPathInputOutlet() {
        return btnPathInputOutlet;
    }

    public JButton getBtnPathInputSalesman() {
        return btnPathInputSalesman;
    }

    public JButton getBtnPathInputStock() {
        return btnPathInputStock;
    }

    public JButton getBtnPathOutput() {
        return btnPathOutput;
    }


    
    public JButton getBtnRetrieveInputCvOutlet() {
        return btnRetrieveInputCvOutlet;
    }
    public JButton getBtnRetrieveInputJHeader() {
        return btnRetrieveInputJHeader;
    }
    public JButton getBtnRetrieveInputJPcode() {
        return btnRetrieveInputJPcode;
    }
    public JButton getBtnRetrieveInputJTprb() {
        return btnRetrieveInputJTprb;
    }
    public JButton getBtnRetrieveInputJTpru() {
        return btnRetrieveInputJTpru;
    }
    public JButton getBtnRetrieveInputMaster() {
        return btnRetrieveInputMaster;
    }
    public JButton getBtnRetrieveInputSalesman() {
        return btnRetrieveInputSalesman;
    }
    public JButton getBtnRetrieveInputStock() {
        return btnRetrieveInputStock;
    }
    public JButton getBtnRetrieveInputOutlet() {
        return btnRetrieveInputOutlet;
    }
    public JButton getBtnPathInputClearAll() {
        return btnPathInputClearAll;
    }
    public JButton getBtnPathInputReloadAll() {
        return btnPathInputReloadAll;
    }
    public JButton getBtnRetrieveInputAll() {
        return btnRetrieveInputAll;
    }
    public JTable getTableInputCvOutlet() {
        return tableInputCvOutlet;
    }
    public JTable getTableInputJheader() {
        return tableInputJheader;
    }
    public JTable getTableInputJpcode() {
        return tableInputJpcode;
    }
    public JTable getTableInputJtprb() {
        return tableInputJtprb;
    }
    public JTable getTableInputJtpru() {
        return tableInputJtpru;
    }
    public JTable getTableInputMaster() {
        return tableInputMaster;
    }
    public JTable getTableInputOutlet() {
        return tableInputOutlet;
    }
    public JTable getTableInputSalesman() {
        return tableInputSalesman;
    }
    public JTable getTableInputStock() {
        return tableInputStock;
    }
    public JTable getTableMappingTipeOutlet() {
        return tableMappingTipeOutlet;
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
    public JTextField getTextDistributorCode() {
        return textDistributorCode;
    }
    public JTextField getTextMapTipeOutletDeskripsi() {
        return textMapTipeOutletDeskripsi;
    }
    public JTextField getTextMapTipeOutletIdTipeOutlet() {
        return textMapTipeOutletIdTipeOutlet;
    }
    public JTextField getTextMapTipeOutletIdTypeOutletScy() {
        return textMapTipeOutletIdTypeOutletScy;
    }
    public JTextField getTextPathInputCvOutlet() {
        return textPathInputCvOutlet;
    }
    public JTextField getTextPathInputJHeader() {
        return textPathInputJHeader;
    }
    public JTextField getTextPathInputJPcode() {
        return textPathInputJPcode;
    }
    public JTextField getTextPathInputJTprb() {
        return textPathInputJTprb;
    }
    public JTextField getTextPathInputJTpru() {
        return textPathInputJTpru;
    }
    public JTextField getTextPathInputMaster() {
        return textPathInputMaster;
    }
    public JTextField getTextPathInputOutlet() {
        return textPathInputOutlet;
    }
    public JTextField getTextPathInputSalesman() {
        return textPathInputSalesman;
    }
    public JTextField getTextPathInputStock() {
        return textPathInputStock;
    }
    public JTextField getTextPathOutput() {
        return textPathOutput;
    }
    public JTextField getTextRecordTypeClient() {
        return textRecordTypeClient;
    }
    public JTextField getTextRecordTypeSales() {
        return textRecordTypeSales;
    }
    public JTextField getTextRecordTypeSo() {
        return textRecordTypeSo;
    }
    public JTextField getTextRecordTypeStock() {
        return textRecordTypeStock;
    }
    public JTextField getTextWarehouseWarehouseCode() {
        return textWarehouseWarehouseCode;
    }
    public JTextField getTextWarehouseWarehouseDescription() {
        return textWarehouseWarehouseDescription;
    }
    public JButton getBtnExtractAll() {
        return btnExtractAll;
    }
    public JDateChooser getjDateChooserExtract() {
        return jDateChooserExtract;
    }

    public JTextField getTextEmailFrom() {
        return textEmailFrom;
    }
    public JTextField getTextEmailSubject() {
        return textEmailSubject;
    }
    public JTextField getTextEmailTo() {
        return textEmailTo;
    }
    public JCheckBox getCheckModeDatabase() {
        return checkModeDatabase;
    }
    public JCheckBox getCheckTprbDiluarBarang() {
        return checkTprbDiluarBarang;
    }
    public JDateChooser getjDateChooseTanggalStock() {
        return jDateChooseTanggalStock;
    }

    public JTabbedPane getjTabbedPaneInputScylla() {
        return jTabbedPaneUtamaInputScylla;
    }

//    public JTabbedPane getjTabbedPane2() {
//        return jTabbedPaneUtama;
//    }
//
//    public void setjTabbedPane2(JTabbedPane jTabbedPane2) {
//        this.jTabbedPaneUtama = jTabbedPane2;
//    }
//
//    public JTabbedPane getjTabbedPane3() {
//        return jTabbedPane3;
//    }
//
//    public void setjTabbedPane3(JTabbedPane jTabbedPane3) {
//        this.jTabbedPane3 = jTabbedPane3;
//    }
//
//    public JTabbedPane getjTabbedPane4() {
//        return jTabbedPane4;
//    }
//
//    public void setjTabbedPane4(JTabbedPane jTabbedPane4) {
//        this.jTabbedPane4 = jTabbedPane4;
//    }
//
    public JPasswordField getTextEmailPassword() {
        return textEmailPassword;
    }
    public JButton getBtnKirimByEmail() {
        return btnKirimByEmail;
    }
    public JButton getBtnTabelDeleteChain() {
        return btnTabelOutletChainDelete;
    }
    public JButton getBtnTabelDeleteKa() {
        return btnTabelKeyAccountDelete;
    }
    public JButton getBtnTabelDeleteLokasi() {
        return btnTabelOutletLocationDelete;
    }
    public JButton getBtnTabelDeleteSize() {
        return btnTabelOutletSizeDelete;
    }
    public JButton getBtnTabelDeleteType() {
        return btnTabelOutletTypeDelete;
    }
    public JButton getBtnTabelSimpanChain() {
        return btnTabelOutletChainSave;
    }
    public JButton getBtnTabelSimpanKa() {
        return btnTabelKeyAccountSave;
    }
    public JButton getBtnTabelSimpanLokasi() {
        return btnTabelOutletLocationSave;
    }
    public JButton getBtnTabelSimpanSize() {
        return btnTabelOutletSizeSave;
    }
    public JButton getBtnTabelSimpanType() {
        return btnTabelOutletTypeSave;
    }
    public JButton getBtnInputBarangDatangReload() {
        return btnInputBarangDatangReload;
    }
    public JButton getBtnInputReturKePabrikReload() {
        return btnInputReturKePabrikReload;
    }
    public JButton getBtnInputStockAdjustmentReload() {
        return btnInputStockAdjustmentReload;
    }
    public JButton getBtnMapOutletDelete() {
        return btnMapOutletDelete;
    }
    public JButton getBtnMapOutletSave() {
        return btnMapOutletSave;
    }
    public JButton getBtnMapOutletSearch() {
        return btnMapOutletSearch;
    }
    public JButton getBtnMapProductDelete() {
        return btnMapProductDelete;
    }
    public JButton getBtnMapProductSave() {
        return btnMapProductSave;
    }
    public JButton getBtnMapProductSearch() {
        return btnMapProductSearch;
    }
    public JButton getBtnMapSalesmanDelete() {
        return btnMapSalesmanDelete;
    }
    public JButton getBtnMapSalesmanSave() {
        return btnMapSalesmanSave;
    }
    public JButton getBtnTabelOutletGroupDelete() {
        return btnTabelOutletGroupDelete;
    }
    public JButton getBtnTabelOutletGroupSave() {
        return btnTabelOutletGroupSave;
    }


    public JButton getBtnTabelKeyAccountDelete() {
        return btnTabelKeyAccountDelete;
    }
    public JButton getBtnTabelKeyAccountSave() {
        return btnTabelKeyAccountSave;
    }
    public JButton getBtnTabelOutletChainDelete() {
        return btnTabelOutletChainDelete;
    }
    public JButton getBtnTabelOutletChainSave() {
        return btnTabelOutletChainSave;
    }
    public JButton getBtnTabelOutletLocationDelete() {
        return btnTabelOutletLocationDelete;
    }
    public JButton getBtnTabelOutletLocationSave() {
        return btnTabelOutletLocationSave;
    }
    public JButton getBtnTabelOutletSizeDelete() {
        return btnTabelOutletSizeDelete;
    }
    public JButton getBtnTabelOutletSizeSave() {
        return btnTabelOutletSizeSave;
    }
    public JButton getBtnTabelOutletTypeDelete() {
        return btnTabelOutletTypeDelete;
    }
    public JButton getBtnTabelOutletTypeSave() {
        return btnTabelOutletTypeSave;
    }
    public JButton getBtnTabelProdBrandDelete() {
        return btnTabelProdBrandDelete;
    }
    public JButton getBtnTabelProdBrandSave() {
        return btnTabelProdBrandSave;
    }
    public JButton getBtnTabelProdCategDelete() {
        return btnTabelProdCategDelete;
    }
    public JButton getBtnTabelProdCategSave() {
        return btnTabelProdCategSave;
    }
    public JButton getBtnTabelProdSubCategDelete() {
        return btnTabelProdSubCategDelete;
    }
    public JButton getBtnTabelProdSubCategSave() {
        return btnTabelProdSubCategSave;
    }

    public JButton getBtnTabelProdDivisiDelete() {
        return btnTabelProdDivisiDelete;
    }
    public JButton getBtnTabelProdDivisiSave() {
        return btnTabelProdDivisiSave;
    }
    public JButton getBtnTabelProdSizeDelete() {
        return btnTabelProdSizeDelete;
    }
    public JButton getBtnTabelProdSizeSave() {
        return btnTabelProdSizeSave;
    }
    public JButton getBtnTabelProdVarianceDelete() {
        return btnTabelProdVarianceDelete;
    }
    public JButton getBtnTabelProdVarianceSave() {
        return btnTabelProdVarianceSave;
    }
    public JButton getBtnTableProdBrandSubDelete() {
        return btnTabelProdBrandDelete;
    }
    public JComboBox getComboMapOutletAreaId() {
        return comboMapOutletAreaId;
    }
    public JComboBox getComboMapOutletBSizeId() {
        return comboMapOutletBSizeId;
    }
    public JComboBox getComboMapOutletClassId() {
        return comboMapOutletClassId;
    }
    public JComboBox getComboMapOutletGroupId() {
        return comboMapOutletGroupId;
    }
    public JComboBox getComboMapOutletKeyAccountId() {
        return comboMapOutletKeyAccountId;
    }
    public JComboBox getComboMapOutletLocationId() {
        return comboMapOutletLocationId;
    }
    public JTextField getTextMapOutletSearchMSLOutletName() {
        return textMapOutletSearchMSLOutletName;
    }

    public JComboBox getComboMapOutletNasionalSalesmanCode() {
        return comboMapOutletNasionalSalesmanCode;
    }
    public JComboBox getComboMapOutletOutletType() {
        return comboMapOutletOutletType;
    }
    public JComboBox getComboMapOutletSalesmanCode() {
        return comboMapOutletSalesmanCode;
    }
    public JComboBox getComboMapOutletSubGroupId() {
        return comboMapOutletSubGroupId;
    }
    public JComboBox getComboMapProductBrand() {
        return comboMapProductBrand;
    }
    public JComboBox getComboMapProductCategory() {
        return comboMapProductCategory;
    }
    public JComboBox getComboMapProductDivisi() {
        return comboMapProductDivisi;
    }
    public JComboBox getComboMapProductSize() {
        return comboMapProductSize;
    }
    public JComboBox getComboMapProductSubBrand() {
        return comboMapProductSubBrand;
    }
    public JComboBox getComboMapProductSubCategory() {
        return comboMapProductSubCategory;
    }
    public JComboBox getComboMapProductVariance() {
        return comboMapProductVariance;
    }
    public JTable getTableMapOutlet() {
        return tableMapOutlet;
    }
    public JTable getTableMapProduct() {
        return tableMapProduct;
    }

    public JTable getTableMapSalesman() {
        return tableMapSalesman;
    }

    public JTable getTableTabelKeyAccount() {
        return tableTabelKeyAccount;
    }

    public JTable getTableTabelOutletChain() {
        return tableTabelOutletChain;
    }
    public JTable getTableTabelOutletClass() {
        return tableTabelOutletClass;
    }

    public JTable getTableTabelOutletGroup() {
        return tableTabelOutletGroup;
    }
    public JTable getTableTabelOutletLocation() {
        return tableTabelOutletLocation;
    }
    public JTable getTableTabelOutletSize() {
        return tableTabelOutletSize;
    }
    public JTable getTableTabelOutletSubGroup() {
        return tableTabelOutletSubGroup;
    }
    public JTable getTableTabelOutletType() {
        return tableTabelOutletType;
    }
    public JTable getTableTabelProdBrand() {
        return tableTabelProdBrand;
    }
    public JTable getTableTabelProdCateg() {
        return tableTabelProdCateg;
    }
    public JTable getTableTabelProdDivisi() {
        return tableTabelProdDivisi;
    }
    public JTable getTableTabelProdSize() {
        return tableTabelProdSize;
    }
    public JTable getTableTabelProdSubBrand() {
        return tableTabelProdSubBrand;
    }
    public JTable getTableTabelProdSubCateg() {
        return tableTabelProdSubCateg;
    }
    public JTable getTableTabelProdVariance() {
        return tableTabelProdVariance;
    }
    public JTextField getTextMapOutletDistiId() {
        return textMapOutletDistiId;
    }
    public JTextField getTextMapOutletMSLOutletCode() {
        return textMapOutletMSLOutletCode;
    }
    public JTextField getTextMapOutletMSLOutletName() {
        return textMapOutletMSLOutletName;
    }
    public JTextField getTextMapOutletSearchMSLOutletCode() {
        return textMapOutletSearchMSLOutletCode;
    }
    public JTextField getTextMapProductAreaId() {
        return textMapProductAreaId;
    }
    public JTextField getTextMapProductDistributorId() {
        return textMapProductDistributorId;
    }
    public JTextField getTextMapProductIdBrgScylla() {
        return textMapProductIdBrgScylla;
    }
    public JTextField getTextMapProductIdSap() {
        return textMapProductIdSap;
    }
    public JTextField getTextMapProductNamaBarangSAP() {
        return textMapProductNamaBarangSAP;
    }
    public JTextField getTextMapProductSearchIdBrgScylla() {
        return textMapProductSearchIdBrgScylla;
    }
    public JTextField getTextMapProductSearchIdSap() {
        return textMapProductSearchIdSap;
    }
    public JTextField getTextMapProductSearchNamaBarangSAP() {
        return textMapProductSearchNamaBarangSAP;
    }
    public JTextField getTextMapSalesmanCAlamat1() {
        return textMapSalesmanCAlamat1;
    }
    public JTextField getTextMapSalesmanCAlamat2() {
        return textMapSalesmanCAlamat2;
    }
    public JTextField getTextMapSalesmanCKota() {
        return textMapSalesmanCKota;
    }
    public JTextField getTextMapSalesmanCTelpon() {
        return textMapSalesmanCTelpon;
    }
    public JTextField getTextMapSalesmanDistributorId() {
        return textMapSalesmanDistributorId;
    }
    public JTextField getTextMapSalesmanKodeLevel() {
        return textMapSalesmanKodeLevel;
    }

    public JDateChooser getjDateChooseTanggalStokAdjustment() {
        return jDateChooseTanggalStokAdjustment;
    }
    public JTextField getTextMapSalesmanRTTPCode() {
        return textMapSalesmanRTTPCode;
    }
    public JTextField getTextMapSalesmanSalesmanId() {
        return textMapSalesmanSalesmanId;
    }
    public JTextField getTextMapSalesmanSalesmanName() {
        return textMapSalesmanSalesmanName;
    }
    public JTextField getTextTabelKeyAccountKeterangan() {
        return textTabelKeyAccountKeterangan;
    }
    public JTextField getTextTabelKeyAccountKodeKa() {
        return textTabelKeyAccountKodeKa;
    }
    public JTextField getTextTabelKeyAccountNama() {
        return textTabelKeyAccountNama;
    }

    public JTextField getTextTabelOutletChainKodeChain() {
        return textTabelOutletChainKodeChain;
    }
    public JTextField getTextTabelOutletChainNamaChain() {
        return textTabelOutletChainNamaChain;
    }
    public JTextField getTextTabelOutletClassOutletClassId() {
        return textTabelOutletClassOutletClassId;
    }
    public JTextField getTextTabelOutletClassOutletClassNm() {
        return textTabelOutletClassOutletClassNm;
    }
    public JTextField getTextTabelOutletGroupOutletGroupId() {
        return textTabelOutletGroupOutletGroupId;
    }
    public JTextField getTextTabelOutletGroupOutletGroupNm() {
        return textTabelOutletGroupOutletGroupNm;
    }
    public JTextField getTextTabelOutletLocationKodeLokasi() {
        return textTabelOutletLocationKodeLokasi;
    }
    public JTextField getTextTabelOutletLocationNamaLokasi() {
        return textTabelOutletLocationNamaLokasi;
    }
    public JTextField getTextTabelOutletSizeKodeSize() {
        return textTabelOutletSizeKodeSize;
    }

    public JTextField getTextTabelOutletSizelNamaSize() {
        return textTabelOutletSizelNamaSize;
    }
    public JTextField getTextTabelOutletSubGroupOutletSubGroupId() {
        return textTabelOutletSubGroupOutletSubGroupId;
    }
    public JTextField getTextTabelOutletSubGroupOutletSubGroupNm() {
        return textTabelOutletSubGroupOutletSubGroupNm;
    }
    public JTextField getTextTabelOutletTypeKodeType() {
        return textTabelOutletTypeKodeType;
    }
    public JTextField getTextTabelOutletTypeNamaType() {
        return textTabelOutletTypeNamaType;
    }
    public JTextField getTextTabelProdBrandBrandId() {
        return textTabelProdBrandBrandId;
    }
    public JTextField getTextTabelProdBrandBrandNm() {
        return textTabelProdBrandBrandNm;
    }
    public JTextField getTextTabelProdCategCatedId() {
        return textTabelProdCategCatedId;
    }
    public JTextField getTextTabelProdCategCategNm() {
        return textTabelProdCategCategNm;
    }
    public JTextField getTextTabelProdSubBrandSubBrandId() {
        return textTabelProdSubBrandSubBrandId;
    }
    public JTextField getTextTabelProdSubBrandSubBrandNm() {
        return textTabelProdSubBrandSubBrandNm;
    }
    public JTextField getTextTabelProdSubCategSubCategId() {
        return textTabelProdSubCategSubCategId;
    }
    public JTextField getTextTabelProdSubCategSubCategNm() {
        return textTabelProdSubCategSubCategNm;
    }
    public JTextField getTextTabelProdDivisiDivisiId() {
        return textTabelProdDivisiDivisiId;
    }
    public JTextField getTextTabelProdDivisiDivisiNm() {
        return textTabelProdDivisiDivisiNm;
    }
    public JTextField getTextTabelProdSizeSizeId() {
        return textTabelProdSizeSizeId;
    }
    public JTextField getTextTabelProdSizeSizeNm() {
        return textTabelProdSizeSizeNm;
    }
    public JTextField getTextTabelProdVarianceVarianceId() {
        return textTabelProdVarianceVarianceId;
    }
    public JTextField getTextMapSalesmanSalesmanIdScylla() {
        return textMapSalesmanSalesmanIdScylla;
    }
    public JTextField getTextTabelProdVarianceVarianceNm() {
        return textTabelProdVarianceVarianceNm;
    }
    public JButton getBtnExtractMSalesman() {
        return btnExtractMSalesman;
    }
    public JButton getBtnExtractMSlsOut() {
        return btnExtractMSlsOut;
    }
    public JButton getBtnExtractTAdjStk() {
        return btnExtractTAdjStk;
    }
    public JButton getBtnExtractTDatdpr() {
        return btnExtractTDatdpr;
    }
    public JButton getBtnExtractTDatdsl() {
        return btnExtractTDatdsl;
    }
    public JButton getBtnExtractTDatdsr() {
        return btnExtractTDatdsr;
    }
    public JButton getBtnExtractTDatsri() {
        return btnExtractTDatsri;
    }
    public JButton getBtnExtractTStok() {
        return btnExtractTStok;
    }
    public JButton getBtnPathInputBarangDatang() {
        return btnPathInputBarangDatang;
    }
    public JButton getBtnPathInputReturKePabrik() {
        return btnPathInputReturKePabrik;
    }
    public JButton getBtnPathInputStokAdjustment() {
        return btnPathInputStokAdjustment;
    }
    public JButton getBtnRetrieveInputBarangDatang() {
        return btnRetrieveInputBarangDatang;
    }
    public JButton getBtnRetrieveInputReturKePabrik() {
        return btnRetrieveInputReturKePabrik;
    }
    public JButton getBtnRetrieveInputStokAdjustment() {
        return btnRetrieveInputStokAdjustment;
    }
    public JTextField getTextPathInputBarangDatang() {
        return textPathInputBarangDatang;
    }
    public JTextField getTextPathInputReturKePabrik() {
        return textPathInputReturKePabrik;
    }
    public JTextField getTextPathInputStokAdjustment() {
        return textPathInputStokAdjustment;
    }
    public JButton getBtnMapOutletReload() {
        return btnMapOutletReload;
    }
    public JButton getBtnMapProductReload() {
        return btnMapProductReload;
    }
    public JButton getBtnMapSalesmanReload() {
        return btnMapSalesmanReload;
    }
    public JCheckBox getCheckMapOutletSearchBaruSaja() {
        return checkMapOutletSearchBaruSaja;
    }
    public JCheckBox getCheckMapProductSearchBaruSaja() {
        return checkMapProductSearchBaruSaja;
    }
    public JButton getBtnBackupAndRestoreBackupPath() {
        return btnBackupAndRestoreBackupPath;
    }
    public JButton getBtnBackupAndRestoreBackupStartBackup() {
        return btnBackupAndRestoreBackupStartBackup;
    }
    public JButton getBtnBackupAndRestoreRestorePath() {
        return btnBackupAndRestoreRestorePath;
    }
    public JButton getBtnBackupAndRestoreRestoreStartRestore() {
        return btnBackupAndRestoreRestoreStartRestore;
    }
    public JCheckBox getCheckBackupAndRestoreBackupTabelTabel() {
        return checkBackupAndRestoreBackupTabelTabel;
    }
    public JCheckBox getCheckBackupAndRestoreRestoreFileMaster() {
        return checkBackupAndRestoreRestoreFileMaster;
    }
    public JCheckBox getCheckBackupAndRestoreRestoreOverwrite() {
        return checkBackupAndRestoreRestoreOverwrite;
    }
    public JCheckBox getCheckBackupAndRestoreRestoreTabelTabel() {
        return checkBackupAndRestoreRestoreTabelTabel;
    }
    public JCheckBox getCheckBackupRestoreBackupFileMaster() {
        return checkBackupRestoreBackupFileMaster;
    }
    public JTextField getTextBackupAndRestoreBackupPath() {
        return textBackupAndRestoreBackupPath;
    }
    public JTextField getTextBackupAndRestoreRestorePath() {
        return textBackupAndRestoreRestorePath;
    }
    public JTable getTableInputBarangDatang() {
        return tableInputBarangDatang;
    }
    public JTable getTableInputReturKePabrik() {
        return tableInputReturKePabrik;
    }
    public JTable getTableInputStockAdjustment() {
        return tableInputStockAdjustment;
    }
    public JButton getBtnTabelOutletClassDelete() {
        return btnTabelOutletClassDelete;
    }
    public JButton getBtnTabelOutletClassSave() {
        return btnTabelOutletClassSave;
    }
    public JButton getBtnTabelOutletSubGroupDelete() {
        return btnTabelOutletSubGroupDelete;
    }
    public JButton getBtnTabelOutletSubGroupSave() {
        return btnTabelOutletSubGroupSave;
    }
    public JButton getBtnTabelProdSubBrandDelete() {
        return btnTabelProdSubBrandDelete;
    }
    public JButton getBtnTabelProdSubBrandSave() {
        return btnTabelProdSubBrandSave;
    }
    public JCheckBox getCheckBackupAndRestoreRestoreGantiDenganDataBaru() {
        return checkBackupAndRestoreRestoreGantiDenganDataBaru;
    }
    public JTextField getTextMapOutletScyOutletCode() {
        return textMapOutletScyOutletCode;
    }
    public JTextField getTextMapOutletSearchScyOutletCode() {
        return textMapOutletSearchScyOutletCode;
    }

    public JTextField getTextDistributorName() {
        return textDistributorName;
    }
    public JRadioButton getRadioBackupAndRestoreBackupCommaDelimeted() {
        return radioBackupAndRestoreBackupCommaDelimeted;
    }
    public JRadioButton getRadioBackupAndRestoreBackupTabDelimeted() {
        return radioBackupAndRestoreBackupTabDelimeted;
    }
    public JCheckBox getCheckMapOutletAktif() {
        return checkMapOutletAktif;
    }
    public JCheckBox getCheckMapOutletBaru() {
        return checkMapOutletBaru;
    }
    public JCheckBox getCheckMapOutletDikirim() {
        return checkMapOutletDikirim;
    }
    public JCheckBox getCheckMapOutletSearchAktifSaja() {
        return checkMapOutletSearchAktifSaja;
    }
    public JCheckBox getCheckMapOutletSearchDikirimSaja() {
        return checkMapOutletSearchDikirimSaja;
    }
    public JCheckBox getCheckMapProductBaru() {
        return checkMapProductBaru;
    }
    public JCheckBox getCheckMapProductAktif() {
        return checkMapProductAktif;
    }
    public JCheckBox getCheckMapProductBonus() {
        return checkMapProductBonus;
    }
    public JCheckBox getCheckMapProductDikirim() {
        return checkMapProductDikirim;
    }
    public JCheckBox getCheckMapProductSearchAktifSaja() {
        return checkMapProductSearchAktifSaja;
    }
    public JCheckBox getCheckMapProductSearchBonusSaja() {
        return checkMapProductSearchBonusSaja;
    }
    public JCheckBox getCheckMapProductSearchDikirimSaja() {
        return checkMapProductSearchDikirimSaja;
    }
    public JCheckBox getCheckMapOutletSearchSemua() {
        return checkMapOutletSearchSemua;
    }
    public JCheckBox getCheckMapProductSearchSemua() {
        return checkMapProductSearchSemua;
    }
    public JButton getBtnInputJheaderBaru() {
        return btnInputJheaderBaru;
    }
    public JButton getBtnInputJheaderSearch() {
        return btnInputJheaderSearch;
    }
    public JButton getBtnInputJheaderUbah() {
        return btnInputJheaderUbah;
    }
    public JTextField getTextInputJHeaderSearchIdOrder() {
        return textInputJHeaderSearchIdOrder;
    }
    public JTextField getTextInputJHeaderSearchIdOutlet() {
        return textInputJHeaderSearchIdOutlet;
    }
    public JTextField getTextInputJHeaderSearchSalesman() {
        return textInputJHeaderSearchSalesman;
    }
    public JLabel getLblInputJHeaderFooterInfo() {
        return lblInputJHeaderFooterInfo;
    }
    public JPanel getjPanelMappingMaster() {
        return jPanelSubSettingKekMappingMaster;
    }
    public JPanel getjPanelTabelTabel() {
        return jPanelSubSettingKekTabelTabel;
    }
    public JPanel getjPanelUtamaInputScylla() {
        return jPanelUtamaInputScylla;
    }

    public JTabbedPane getjTabbedPaneUtama() {
        return jTabbedPaneUtama;
    }
    public JPanel getjPanelUtamaOutputKEK() {
        return jPanelUtamaOutputKEK;
    }
    public JPanel getjPanelUtamaBackupAndRestore() {
        return jPanelUtamaBackupAndRestore;
    }
    public JPanel getjPanelMappingMasterPanelUtama() {
        return jPanelMappingMasterPanelUtama;
    }
    public JPanel getjPanelUtamaGenerate() {
        return jPanelUtamaGenerate;
    }
    public JPanel getjPanelUtamaOutputBaygon() {
        return jPanelUtamaOutputBaygon;
    }
    public JPanel getjPanelUtamaKonfigAndUtils() {
        return jPanelUtamaConfigAndUtils;
    }
    public JPanel getjPanelUtamaSettingKek() {
        return jPanelUtamaSettingKek;
    }
    public JPanel getjPanelUtamaSettingPokari() {
        return jPanelUtamaSettingPokari;
    }
    public JPanel getjPanelUtamaOutputPokari() {
        return jPanelUtamaOutputPokari;
    }
    
    public JPanel getjPanelSubGenerateRetrieveAndExtract() {
        return jPanelSubGenerateRetrieveAndExtract;
    }

    public JPanel getjPanelSubInputScyllaBarangDatang() {
        return jPanelSubInputScyllaBarangDatang;
    }

    public JPanel getjPanelSubInputScyllaCvOutlet() {
        return jPanelSubInputScyllaCvOutlet;
    }

    public JPanel getjPanelSubInputScyllaJHeader() {
        return jPanelSubInputScyllaJHeader;
    }

    public JPanel getjPanelSubInputScyllaJTprb() {
        return jPanelSubInputScyllaJTprb;
    }

    public JPanel getjPanelSubInputScyllaJTpru() {
        return jPanelSubInputScyllaJTpru;
    }

    public JPanel getjPanelSubInputScyllaMasterProduct() {
        return jPanelSubInputScyllaMasterProduct;
    }

    public JPanel getjPanelSubInputScyllaOutlet() {
        return jPanelSubInputScyllaOutlet;
    }

    public JPanel getjPanelSubInputScyllaReturKePabrik() {
        return jPanelSubInputScyllaReturKePabrik;
    }

    public JPanel getjPanelSubInputScyllaSalesman() {
        return jPanelSubInputScyllaSalesman;
    }

    public JPanel getjPanelSubInputScyllaStock() {
        return jPanelSubInputScyllaStock;
    }

    public JPanel getjPanelSubInputScyllaStokAdjustment() {
        return jPanelSubInputScyllaStokAdjustment;
    }

    public JPanel getjPanelSubKonfigAndUtils() {
        return jPanelSubKonfigAndUtilBaygon;
    }


    public JPanel getjPanelSubSettingKekMappingMaster() {
        return jPanelSubSettingKekMappingMaster;
    }

    public JPanel getjPanelSubSettingKekTabelTabel() {
        return jPanelSubSettingKekTabelTabel;
    }

    public JPanel getjPanelUtamaConfigAndUtils() {
        return jPanelUtamaConfigAndUtils;
    }
    public JTable getTableTabelTabelPokariCustomerGroup() {
        return tableTabelTabelPokariCustomerGroup;
    }

    public JTable getTableTabelTabelPokariCustomerHirarchy() {
        return tableTabelTabelPokariCustomerHirarchy;
    }

    public JTable getTableTabelTabelPokariGroupSales() {
        return tableTabelTabelPokariGroupSales;
    }

    public JTable getTableTabelTabelPokariProductBrand() {
        return tableTabelTabelPokariProductBrand;
    }

    public JTable getTableTabelTabelPokariSalesTerritory() {
        return tableTabelTabelPokariSalesTerritory;
    }

    public JTable getTableTabelTabelPokariTeamSales() {
        return tableTabelTabelPokariTeamSales;
    }

    public JTable getTableTabelTabelPokariTypeSales() {
        return tableTabelTabelPokariTypeSales;
    }

    public JTable getTableTabelTabelPokariWorkplace() {
        return tableTabelTabelPokariWorkplace;
    }
    public JButton getBtnTabelTabelPokariCustomerGroupDelete() {
        return btnTabelTabelPokariCustomerGroupDelete;
    }

    public JButton getBtnTabelTabelPokariCustomerGroupSave() {
        return btnTabelTabelPokariCustomerGroupSave;
    }

    public JButton getBtnTabelTabelPokariCustomerHirarchyDelete() {
        return btnTabelTabelPokariCustomerHirarchyDelete;
    }

    public JButton getBtnTabelTabelPokariCustomerHirarchySave() {
        return btnTabelTabelPokariCustomerHirarchySave;
    }

    public JButton getBtnTabelTabelPokariGroupSalesDelete() {
        return btnTabelTabelPokariGroupSalesDelete;
    }

    public JButton getBtnTabelTabelPokariGroupSalesSave() {
        return btnTabelTabelPokariGroupSalesSave;
    }

    public JButton getBtnTabelTabelPokariProductBrandDelete() {
        return btnTabelTabelPokariProductBrandDelete;
    }

    public JButton getBtnTabelTabelPokariProductBrandSave() {
        return btnTabelTabelPokariProductBrandSave;
    }

    public JButton getBtnTabelTabelPokariSalesTerritoryDelete() {
        return btnTabelTabelPokariSalesTerritoryDelete;
    }

    public JButton getBtnTabelTabelPokariSalesTerritorySave() {
        return btnTabelTabelPokariSalesTerritorySave;
    }

    public JButton getBtnTabelTabelPokariTeamSalesDelete() {
        return btnTabelTabelPokariTeamSalesDelete;
    }

    public JButton getBtnTabelTabelPokariTeamSalesSave() {
        return btnTabelTabelPokariTeamSalesSave;
    }

    public JButton getBtnTabelTabelPokariTypeSalesDelete() {
        return btnTabelTabelPokariTypeSalesDelete;
    }

    public JButton getBtnTabelTabelPokariTypeSalesSave() {
        return btnTabelTabelPokariTypeSalesSave;
    }

    public JButton getBtnTabelTabelPokariWorkplaceDelete() {
        return btnTabelTabelPokariWorkplaceDelete;
    }

    public JButton getBtnTabelTabelPokariWorkplaceSave() {
        return btnTabelTabelPokariWorkplaceSave;
    }
    public JTextField getTextTabelTabelPokariCustomerGroupDescription() {
        return textTabelTabelPokariCustomerGroupDescription;
    }
    public JTextField getTextTabelTabelPokariCustomerGroupIdGroup() {
        return textTabelTabelPokariCustomerGroupIdGroup;
    }

    public JTextField getTextTabelTabelPokariCustomerHirarchyDescription() {
        return textTabelTabelPokariCustomerHirarchyDescription;
    }
    public JTextField getTextTabelTabelPokariCustomerHirarchyIdHirarchy() {
        return textTabelTabelPokariCustomerHirarchyIdHirarchy;
    }

    public JTextField getTextTabelTabelPokariGroupSalesName() {
        return textTabelTabelPokariGroupSalesName;
    }
    public JTextField getTextTabelTabelPokariGroupSalesTypeGroup() {
        return textTabelTabelPokariGroupSalesTypeGroup;
    }

    public JTextField getTextTabelTabelPokariProductBrandBrandId() {
        return textTabelTabelPokariProductBrandBrandId;
    }
    public JTextField getTextTabelTabelPokariProductBrandName() {
        return textTabelTabelPokariProductBrandName;
    }
    public JTextField getTextTabelTabelPokariProductBrandHirarchy(){
        return textTabelTabelPokariProductBrandHirarchy;
    }
            
            
    public JTextField getTextTabelTabelPokariSalesTerritoryDescription() {
        return textTabelTabelPokariSalesTerritoryDescription;
    }
    public JTextField getTextTabelTabelPokariSalesTerritoryIdTerritory() {
        return textTabelTabelPokariSalesTerritoryIdTerritory;
    }
    public JTextField getTextTabelTabelPokariTeamSalesName() {
        return textTabelTabelPokariTeamSalesName;
    }

    public JTextField getTextTabelTabelPokariTeamSalesTeamId() {
        return textTabelTabelPokariTeamSalesTeamId;
    }

    public JTextField getTextTabelTabelPokariTypeSalesName() {
        return textTabelTabelPokariTypeSalesName;
    }

    public JTextField getTextTabelTabelPokariTypeSalesTypeSales() {
        return textTabelTabelPokariTypeSalesTypeSales;
    }

    public JTextField getTextTabelTabelPokariWorkplaceArea() {
        return textTabelTabelPokariWorkplaceArea;
    }

    public JTextField getTextTabelTabelPokariWorkplaceWorkplaceId() {
        return textTabelTabelPokariWorkplaceWorkplaceId;
    }
    
    //POKARI : MASTER
    public JButton getBtnMappingMasterPokariCustomerDelete() {
        return btnMappingMasterPokariCustomerDelete;
    }

    public JButton getBtnMappingMasterPokariCustomerSave() {
        return btnMappingMasterPokariCustomerSave;
    }

    public JButton getBtnMappingMasterPokariCustomerSearch() {
        return btnMappingMasterPokariCustomerSearch;
    }

    public JButton getBtnMappingMasterPokariEmployeeDelete() {
        return btnMappingMasterPokariEmployeeDelete;
    }

    public JButton getBtnMappingMasterPokariEmployeeReload() {
        return btnMappingMasterPokariEmployeeReload;
    }

    public JButton getBtnMappingMasterPokariEmployeeSave() {
        return btnMappingMasterPokariEmployeeSave;
    }

    public JButton getBtnMappingMasterPokariProductDelete() {
        return btnMappingMasterPokariProductDelete;
    }

    public JButton getBtnMappingMasterPokariProductReload() {
        return btnMappingMasterPokariProductReload;
    }

    public JButton getBtnMappingMasterPokariProductSave() {
        return btnMappingMasterPokariProductSave;
    }

    public JButton getBtnMappingMasterPokariProductSearch() {
        return btnMappingMasterPokariProductSearch;
    }

    public JCheckBox getCheckMapingMasterPokariCustomerSearchDikirimSaja() {
        return checkMapingMasterPokariCustomerSearchDikirimSaja;
    }

    public JCheckBox getCheckMappingMasterPokariCustomerAktif() {
        return checkMappingMasterPokariCustomerAktif;
    }

    public JCheckBox getCheckMappingMasterPokariCustomerBaru() {
        return checkMappingMasterPokariCustomerBaru;
    }

    public JCheckBox getCheckMappingMasterPokariCustomerDikirim() {
        return checkMappingMasterPokariCustomerDikirim;
    }
    
    public JCheckBox getCheckMappingMasterPokariSpEmployeeAktif() {
        return checkMappingMasterPokariSpEmployeeAktif;
    }
    public JCheckBox getCheckMappingMasterPokariSpEmployeeBaru() {
        return checkMappingMasterPokariSpEmployeeBaru;
    }
    public JCheckBox getCheckMappingMasterPokariSpEmployeeDikirim() {
        return checkMappingMasterPokariSpEmployeeDikirim;
    }
    
    public JCheckBox getCheckMappingMasterPokariCustomerSearchAktifSaja() {
        return checkMappingMasterPokariCustomerSearchAktifSaja;
    }

    public JCheckBox getCheckMappingMasterPokariCustomerSearchBaruSaja() {
        return checkMappingMasterPokariCustomerSearchBaruSaja;
    }

    public JCheckBox getCheckMappingMasterPokariCustomerSearchSemua() {
        return checkMappingMasterPokariCustomerSearchSemua;
    }

    public JCheckBox getCheckMappingMasterPokariProductSearchAktifSaja() {
        return checkMappingMasterPokariProductSearchAktifSaja;
    }

    public JCheckBox getCheckMappingMasterPokariProductSearchBaruSaja() {
        return checkMappingMasterPokariProductSearchBaruSaja;
    }

    public JCheckBox getCheckMappingMasterPokariProductSearchDikirimSaja() {
        return checkMappingMasterPokariProductSearchDikirimSaja;
    }

    public JCheckBox getCheckMappingMasterPokariProductSearchSemua() {
        return checkMappingMasterPokariProductSearchSemua;
    }

    public JComboBox getComboMappingMasterPokariCustomerCustomerGroup() {
        return comboMappingMasterPokariCustomerCustomerGroup;
    }

    public JComboBox getComboMappingMasterPokariCustomerEmployee() {
        return comboMappingMasterPokariCustomerEmployee;
    }

    public JComboBox getComboMappingMasterPokariCustomerHirarchy() {
        return comboMappingMasterPokariCustomerHirarchy;
    }

    public JComboBox getComboMappingMasterPokariCustomerSalesTerritory() {
        return comboMappingMasterPokariCustomerSalesTerritory;
    }

    public JComboBox getComboMappingMasterPokariCustomerWorkPlace() {
        return comboMappingMasterPokariCustomerWorkPlace;
    }

    public JComboBox getComboMappingMasterPokariEmployeeSalesGroup() {
        return comboMappingMasterPokariEmployeeSalesGroup;
    }

    public JComboBox getComboMappingMasterPokariEmployeeSalesTeam() {
        return comboMappingMasterPokariEmployeeSalesTeam;
    }

    public JComboBox getComboMappingMasterPokariEmployeeSalesType() {
        return comboMappingMasterPokariEmployeeSalesType;
    }

    public JComboBox getComboMappingMasterPokariEmployeeWorkplace() {
        return comboMappingMasterPokariEmployeeWorkplace;
    }

    public JComboBox getComboMappingMasterPokariProductBrand() {
        return comboMappingMasterPokariProductBrand;
    }

    public JTable getTableMappingMasterPokariCustomer() {
        return tableMappingMasterPokariCustomer;
    }

    public JTable getTableMappingMasterPokariEmployee() {
        return tableMappingMasterPokariEmployee;
    }

    public JTable getTableMappingMasterPokariProduct() {
        return tableMappingMasterPokariProduct;
    }

    public JTextField getTextMappingMasterPokariCustomerIdPokari() {
        return textMappingMasterPokariCustomerIdPokari;
    }

    public JTextField getTextMappingMasterPokariCustomerIdScylla() {
        return textMappingMasterPokariCustomerIdScylla;
    }

    public JTextField getTextMappingMasterPokariCustomerName() {
        return textMappingMasterPokariCustomerName;
    }

    public JTextField getTextMappingMasterPokariCustomerSearchIdPokari() {
        return textMappingMasterPokariCustomerSearchIdPokari;
    }

    public JTextField getTextMappingMasterPokariCustomerSearchIdScylla() {
        return textMappingMasterPokariCustomerSearchIdScylla;
    }

    public JTextField getTextMappingMasterPokariCustomerSearchName() {
        return textMappingMasterPokariCustomerSearchName;
    }

    public JTextField getTextMappingMasterPokariEmployeeIdPokari() {
        return textMappingMasterPokariEmployeeIdPokari;
    }

    public JTextField getTextMappingMasterPokariEmployeeIdScylla() {
        return textMappingMasterPokariEmployeeIdScylla;
    }

    public JTextField getTextMappingMasterPokariEmployeeName() {
        return textMappingMasterPokariEmployeeName;
    }

    public JTextField getTextMappingMasterPokariEmployeePoliceNo() {
        return textMappingMasterPokariEmployeePoliceNo;
    }

    public JTextField getTextMappingMasterPokariEmployeeVehicleId() {
        return textMappingMasterPokariEmployeeVehicleId;
    }

    public JTextField getTextMappingMasterPokariEmployeeVehicleName() {
        return textMappingMasterPokariEmployeeVehicleName;
    }

    public JTextField getTextMappingMasterPokariProductIdBrgScylla() {
        return textMappingMasterPokariProductIdBrgScylla;
    }

    public JTextField getTextMappingMasterPokariProductIdPokari() {
        return textMappingMasterPokariProductIdPokari;
    }

    public JTextField getTextMappingMasterPokariProductNamaBarang() {
        return textMappingMasterPokariProductNamaBarang;
    }

    public JTextField getTextMappingMasterPokariProductSearchIdBrgScylla() {
        return textMappingMasterPokariProductSearchIdBrgScylla;
    }

    public JTextField getTextMappingMasterPokariProductSearchIdPokari() {
        return textMappingMasterPokariProductSearchIdPokari;
    }

    public JTextField getTextMappingMasterPokariProductSearchNamaBarangPokari() {
        return textMappingMasterPokariProductSearchNamaBarangPokari;
    }

    public JButton getBtnMappingMasterPokariCustomerReload() {
        return btnMappingMasterPokariCustomerReload;
    }

    public JCheckBox getCheckMappingMasterPokariProductAktif() {
        return checkMappingMasterPokariProductAktif;
    }

    public JCheckBox getCheckMappingMasterPokariProductBaru() {
        return checkMappingMasterPokariProductBaru;
    }

    public JCheckBox getCheckMappingMasterPokariProductDikirim() {
        return checkMappingMasterPokariProductDikirim;
    }

    //POKARI : BACKUP AND RESTORE
    public JButton getBtnBackupAndRestoreBackupPathPokari() {
        return btnBackupAndRestoreBackupPathPokari;
    }

    public JButton getBtnBackupAndRestoreBackupStartBackupPokari() {
        return btnBackupAndRestoreBackupStartBackupPokari;
    }

    public JButton getBtnBackupAndRestoreRestorePathPokari() {
        return btnBackupAndRestoreRestorePathPokari;
    }

    public JButton getBtnBackupAndRestoreRestoreStartRestorePokari() {
        return btnBackupAndRestoreRestoreStartRestorePokari;
    }

    public JCheckBox getCheckBackupAndRestoreBackupTabelTabelPokari() {
        return checkBackupAndRestoreBackupTabelTabelPokari;
    }

    public JCheckBox getCheckBackupAndRestoreRestoreFileMasterPokari() {
        return checkBackupAndRestoreRestoreFileMasterPokari;
    }

    public JCheckBox getCheckBackupAndRestoreRestoreGantiDenganDataBaruPokari() {
        return checkBackupAndRestoreRestoreGantiDenganDataBaruPokari;
    }

    public JCheckBox getCheckBackupAndRestoreRestoreOverwritePokari() {
        return checkBackupAndRestoreRestoreOverwritePokari;
    }

    public JCheckBox getCheckBackupAndRestoreRestoreTabelTabelPokari() {
        return checkBackupAndRestoreRestoreTabelTabelPokari;
    }

    public JCheckBox getCheckBackupRestoreBackupFileMasterPokari() {
        return checkBackupRestoreBackupFileMasterPokari;
    }

    public JRadioButton getRadioBackupAndRestoreBackupCommaDelimetedPokari() {
        return radioBackupAndRestoreBackupCommaDelimetedPokari;
    }

    public JRadioButton getRadioBackupAndRestoreBackupTabDelimetedPokari() {
        return radioBackupAndRestoreBackupTabDelimetedPokari;
    }

    public JTextField getTextBackupAndRestoreBackupPathPokari() {
        return textBackupAndRestoreBackupPathPokari;
    }

    public JTextField getTextBackupAndRestoreRestorePathPokari() {
        return textBackupAndRestoreRestorePathPokari;
    }

    public JComboBox getComboMappingMasterPokariCustomerAllowToCredit() {
        return comboMappingMasterPokariCustomerAllowToCredit;
    }

    public JComboBox getComboMappingMasterPokariCustomerDistrChannelId() {
        return comboMappingMasterPokariCustomerDistrChannelId;
    }

    public JComboBox getComboMappingMasterPokariCustomerPaymentTermId() {
        return comboMappingMasterPokariCustomerPaymentTermId;
    }

    public JComboBox getComboMappingMasterPokariCustomerStatus() {
        return comboMappingMasterPokariCustomerStatus;
    }

    public JTextField getTextMappingMasterPokariCustomerAddress() {
        return textMappingMasterPokariCustomerAddress;
    }

    public JTextField getTextMappingMasterPokariCustomerCity() {
        return textMappingMasterPokariCustomerCity;
    }

    public JTextField getTextMappingMasterPokariCustomerContact() {
        return textMappingMasterPokariCustomerContact;
    }

    public JTextField getTextMappingMasterPokariCustomerDistrict() {
        return textMappingMasterPokariCustomerDistrict;
    }

    public JTextField getTextMappingMasterPokariCustomerEmail() {
        return textMappingMasterPokariCustomerEmail;
    }

    public JTextField getTextMappingMasterPokariCustomerFax() {
        return textMappingMasterPokariCustomerFax;
    }

    public JTextField getTextMappingMasterPokariCustomerLimitCredit() {
        return textMappingMasterPokariCustomerLimitCredit;
    }

    public JTextField getTextMappingMasterPokariCustomerNPWP() {
        return textMappingMasterPokariCustomerNPWP;
    }

    public JTextField getTextMappingMasterPokariCustomerPhone() {
        return textMappingMasterPokariCustomerPhone;
    }

    public JDateChooser getTextMappingMasterPokariCustomerRegisteredDate() {
        return textMappingMasterPokariCustomerRegisteredDate;
    }

    public JTextField getTextMappingMasterPokariCustomerState() {
        return textMappingMasterPokariCustomerState;
    }

    public JTextField getTextMappingMasterPokariCustomerZipCode() {
        return textMappingMasterPokariCustomerZipCode;
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackupAndRestoreBackupPath;
    private javax.swing.JButton btnBackupAndRestoreBackupPathPokari;
    private javax.swing.JButton btnBackupAndRestoreBackupStartBackup;
    private javax.swing.JButton btnBackupAndRestoreBackupStartBackupPokari;
    private javax.swing.JButton btnBackupAndRestoreRestorePath;
    private javax.swing.JButton btnBackupAndRestoreRestorePathPokari;
    private javax.swing.JButton btnBackupAndRestoreRestoreStartRestore;
    private javax.swing.JButton btnBackupAndRestoreRestoreStartRestorePokari;
    private javax.swing.JButton btnExtractAll;
    private javax.swing.JButton btnExtractMSalesman;
    private javax.swing.JButton btnExtractMSlsOut;
    private javax.swing.JButton btnExtractTAdjStk;
    private javax.swing.JButton btnExtractTDatdpr;
    private javax.swing.JButton btnExtractTDatdsl;
    private javax.swing.JButton btnExtractTDatdsr;
    private javax.swing.JButton btnExtractTDatsri;
    private javax.swing.JButton btnExtractTStok;
    private javax.swing.JButton btnGeneralSettingKonfigurasiEmaiSimpan;
    private javax.swing.JButton btnGeneralSettingPokariReload;
    private javax.swing.JButton btnGeneralSettingPokariSimpan;
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
    private javax.swing.JButton btnMappingMasterPokariCustomerDelete;
    private javax.swing.JButton btnMappingMasterPokariCustomerReload;
    private javax.swing.JButton btnMappingMasterPokariCustomerSave;
    private javax.swing.JButton btnMappingMasterPokariCustomerSearch;
    private javax.swing.JButton btnMappingMasterPokariEmployeeDelete;
    private javax.swing.JButton btnMappingMasterPokariEmployeeReload;
    private javax.swing.JButton btnMappingMasterPokariEmployeeSave;
    private javax.swing.JButton btnMappingMasterPokariProductDelete;
    private javax.swing.JButton btnMappingMasterPokariProductReload;
    private javax.swing.JButton btnMappingMasterPokariProductSave;
    private javax.swing.JButton btnMappingMasterPokariProductSearch;
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
    private javax.swing.JButton btnPathKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation;
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
    private javax.swing.JButton btnTabelTabelPokariCustomerGroupDelete;
    private javax.swing.JButton btnTabelTabelPokariCustomerGroupSave;
    private javax.swing.JButton btnTabelTabelPokariCustomerGroupSetDefault;
    private javax.swing.JButton btnTabelTabelPokariCustomerHirarchyDelete;
    private javax.swing.JButton btnTabelTabelPokariCustomerHirarchySave;
    private javax.swing.JButton btnTabelTabelPokariCustomerHirarchySetDefault;
    private javax.swing.JButton btnTabelTabelPokariGroupSalesDelete;
    private javax.swing.JButton btnTabelTabelPokariGroupSalesSave;
    private javax.swing.JButton btnTabelTabelPokariGroupSalesSetDefault;
    private javax.swing.JButton btnTabelTabelPokariProductBrandDelete;
    private javax.swing.JButton btnTabelTabelPokariProductBrandSave;
    private javax.swing.JButton btnTabelTabelPokariProductBrandSetDefault;
    private javax.swing.JButton btnTabelTabelPokariSalesTerritoryDelete;
    private javax.swing.JButton btnTabelTabelPokariSalesTerritorySave;
    private javax.swing.JButton btnTabelTabelPokariSalesTerritorySetDefault;
    private javax.swing.JButton btnTabelTabelPokariTeamSalesDelete;
    private javax.swing.JButton btnTabelTabelPokariTeamSalesSave;
    private javax.swing.JButton btnTabelTabelPokariTeamSalesSetDefault;
    private javax.swing.JButton btnTabelTabelPokariTypeSalesDelete;
    private javax.swing.JButton btnTabelTabelPokariTypeSalesSave;
    private javax.swing.JButton btnTabelTabelPokariTypeSalesSetDefault;
    private javax.swing.JButton btnTabelTabelPokariWorkplaceDelete;
    private javax.swing.JButton btnTabelTabelPokariWorkplaceSave;
    private javax.swing.JButton btnTabelTabelPokariWorkplaceSetDefault;
    private javax.swing.JCheckBox checkBackupAndRestoreBackupTabelTabel;
    private javax.swing.JCheckBox checkBackupAndRestoreBackupTabelTabelPokari;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreFileMaster;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreFileMasterPokari;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreGantiDenganDataBaru;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreGantiDenganDataBaruPokari;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreOverwrite;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreOverwritePokari;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreTabelTabel;
    private javax.swing.JCheckBox checkBackupAndRestoreRestoreTabelTabelPokari;
    private javax.swing.JCheckBox checkBackupRestoreBackupFileMaster;
    private javax.swing.JCheckBox checkBackupRestoreBackupFileMasterPokari;
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
    private javax.swing.JCheckBox checkMapingMasterPokariCustomerSearchDikirimSaja;
    private javax.swing.JCheckBox checkMappingMasterPokariCustomerAktif;
    private javax.swing.JCheckBox checkMappingMasterPokariCustomerBaru;
    private javax.swing.JCheckBox checkMappingMasterPokariCustomerDikirim;
    private javax.swing.JCheckBox checkMappingMasterPokariCustomerSearchAktifSaja;
    private javax.swing.JCheckBox checkMappingMasterPokariCustomerSearchBaruSaja;
    private javax.swing.JCheckBox checkMappingMasterPokariCustomerSearchSemua;
    private javax.swing.JCheckBox checkMappingMasterPokariProductAktif;
    private javax.swing.JCheckBox checkMappingMasterPokariProductBaru;
    private javax.swing.JCheckBox checkMappingMasterPokariProductDikirim;
    private javax.swing.JCheckBox checkMappingMasterPokariProductSearchAktifSaja;
    private javax.swing.JCheckBox checkMappingMasterPokariProductSearchBaruSaja;
    private javax.swing.JCheckBox checkMappingMasterPokariProductSearchDikirimSaja;
    private javax.swing.JCheckBox checkMappingMasterPokariProductSearchSemua;
    private javax.swing.JCheckBox checkMappingMasterPokariSpEmployeeAktif;
    private javax.swing.JCheckBox checkMappingMasterPokariSpEmployeeBaru;
    private javax.swing.JCheckBox checkMappingMasterPokariSpEmployeeDikirim;
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
    private javax.swing.JComboBox comboMappingMasterPokariCustomerAllowToCredit;
    private javax.swing.JComboBox comboMappingMasterPokariCustomerCustomerGroup;
    private javax.swing.JComboBox comboMappingMasterPokariCustomerDistrChannelId;
    private javax.swing.JComboBox comboMappingMasterPokariCustomerEmployee;
    private javax.swing.JComboBox comboMappingMasterPokariCustomerHirarchy;
    private javax.swing.JComboBox comboMappingMasterPokariCustomerPaymentTermId;
    private javax.swing.JComboBox comboMappingMasterPokariCustomerSalesTerritory;
    private javax.swing.JComboBox comboMappingMasterPokariCustomerStatus;
    private javax.swing.JComboBox comboMappingMasterPokariCustomerWorkPlace;
    private javax.swing.JComboBox comboMappingMasterPokariEmployeeSalesGroup;
    private javax.swing.JComboBox comboMappingMasterPokariEmployeeSalesTeam;
    private javax.swing.JComboBox comboMappingMasterPokariEmployeeSalesType;
    private javax.swing.JComboBox comboMappingMasterPokariEmployeeWorkplace;
    private javax.swing.JComboBox comboMappingMasterPokariProductBrand;
    private com.toedter.calendar.JDateChooser jDateChooseTanggalStock;
    private com.toedter.calendar.JDateChooser jDateChooseTanggalStokAdjustment;
    private com.toedter.calendar.JDateChooser jDateChooserExtract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
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
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelInputScyllaBarangDatang;
    private javax.swing.JLabel jLabelInputScyllaCvOutlet;
    private javax.swing.JLabel jLabelInputScyllaJHeader;
    private javax.swing.JLabel jLabelInputScyllaJPCode;
    private javax.swing.JLabel jLabelInputScyllaJTprb;
    private javax.swing.JLabel jLabelInputScyllaJTpru;
    private javax.swing.JLabel jLabelInputScyllaMasterProduk;
    private javax.swing.JLabel jLabelInputScyllaOutlet;
    private javax.swing.JLabel jLabelInputScyllaReturKePabrik;
    private javax.swing.JLabel jLabelInputScyllaSalesman;
    private javax.swing.JLabel jLabelInputScyllaStock;
    private javax.swing.JLabel jLabelInputScyllaStokAdjustment;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
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
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private org.dimas.bridging.app.view.JPanelGenerateExtractBaygon jPanelGenerateExtractBaygon1;
    private org.dimas.bridging.app.view.JPanelGenerateExtractKek jPanelGenerateExtractKek1;
    private org.dimas.bridging.app.view.JPanelGenerateExtractPokari jPanelGenerateExtractPokari1;
    private javax.swing.JPanel jPanelMappingMasterPanelUtama;
    private javax.swing.JPanel jPanelMappingMasterPokariCustomerDetail;
    private javax.swing.JPanel jPanelMappingMasterPokariEmployeeDetail;
    private javax.swing.JPanel jPanelMappingMasterPokariProdukDetail;
    private javax.swing.JPanel jPanelSubBackupAndRestoreBackupAndRestoreKek;
    private javax.swing.JPanel jPanelSubBackupAndRestoreBackupAndRestorePokari;
    private javax.swing.JPanel jPanelSubGenerateButtonRetrieve;
    private javax.swing.JPanel jPanelSubGenerateExtract;
    private javax.swing.JPanel jPanelSubGenerateExtractKek;
    private javax.swing.JPanel jPanelSubGeneratePicture;
    private javax.swing.JPanel jPanelSubGenerateRetrieveAndExtract;
    private javax.swing.JPanel jPanelSubGenerateRetrieveScylla;
    private javax.swing.JPanel jPanelSubInputScyllaBarangDatang;
    private javax.swing.JPanel jPanelSubInputScyllaCvOutlet;
    private javax.swing.JPanel jPanelSubInputScyllaJHeader;
    private javax.swing.JPanel jPanelSubInputScyllaJPcode;
    private javax.swing.JPanel jPanelSubInputScyllaJTprb;
    private javax.swing.JPanel jPanelSubInputScyllaJTpru;
    private javax.swing.JPanel jPanelSubInputScyllaMasterProduct;
    private javax.swing.JPanel jPanelSubInputScyllaOutlet;
    private javax.swing.JPanel jPanelSubInputScyllaReturKePabrik;
    private javax.swing.JPanel jPanelSubInputScyllaSalesman;
    private javax.swing.JPanel jPanelSubInputScyllaStock;
    private javax.swing.JPanel jPanelSubInputScyllaStokAdjustment;
    private javax.swing.JPanel jPanelSubKonfigAndUtilBaygon;
    private javax.swing.JPanel jPanelSubKonfigAndUtilEmail;
    private javax.swing.JPanel jPanelSubKonfigAndUtilPokari;
    private javax.swing.JPanel jPanelSubSettingKekMappingMaster;
    private javax.swing.JPanel jPanelSubSettingKekTabelTabel;
    private javax.swing.JPanel jPanelSubSettingPokariMappingMaster;
    private javax.swing.JPanel jPanelSubSettingPokariMappingMasterCustomer;
    private javax.swing.JPanel jPanelSubSettingPokariMappingMasterEmployee;
    private javax.swing.JPanel jPanelSubSettingPokariMappingMasterProduct;
    private javax.swing.JPanel jPanelSubSettingPokariTabelTabel;
    private javax.swing.JPanel jPanelSubSettingPokariTabelTabelCustomerGroup;
    private javax.swing.JPanel jPanelSubSettingPokariTabelTabelCustomerHirarchy;
    private javax.swing.JPanel jPanelSubSettingPokariTabelTabelGroupSales;
    private javax.swing.JPanel jPanelSubSettingPokariTabelTabelProductBrand;
    private javax.swing.JPanel jPanelSubSettingPokariTabelTabelSalesTerritory;
    private javax.swing.JPanel jPanelSubSettingPokariTabelTabelTeamSales;
    private javax.swing.JPanel jPanelSubSettingPokariTabelTabelTypeSales;
    private javax.swing.JPanel jPanelSubSettingPokariTabelTabelWorkplace;
    private javax.swing.JPanel jPanelUtama;
    private javax.swing.JPanel jPanelUtamaBackupAndRestore;
    private javax.swing.JPanel jPanelUtamaConfigAndUtils;
    private javax.swing.JPanel jPanelUtamaGenerate;
    private javax.swing.JPanel jPanelUtamaInputScylla;
    private javax.swing.JPanel jPanelUtamaOutputBaygon;
    private javax.swing.JPanel jPanelUtamaOutputKEK;
    private javax.swing.JPanel jPanelUtamaOutputPokari;
    private javax.swing.JPanel jPanelUtamaSettingKek;
    private javax.swing.JPanel jPanelUtamaSettingPokari;
    private javax.swing.JPanel jPanelUtamaTemplates1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
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
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPaneMapping;
    private javax.swing.JTabbedPane jTabbedPaneSubSettingPokariMappingMaster;
    private javax.swing.JTabbedPane jTabbedPaneSubSettingPokariTabelTabel;
    private javax.swing.JTabbedPane jTabbedPaneUtama;
    private javax.swing.JTabbedPane jTabbedPaneUtamaBackupAndRestore;
    private javax.swing.JTabbedPane jTabbedPaneUtamaConfigAndUtils;
    private javax.swing.JTabbedPane jTabbedPaneUtamaGenerate;
    private javax.swing.JTabbedPane jTabbedPaneUtamaInputScylla;
    private javax.swing.JTabbedPane jTabbedPaneUtamaSettingKek;
    private javax.swing.JTabbedPane jTabbedPaneUtamaSettingPokari;
    private javax.swing.JLabel lblInputJHeaderFooterInfo;
    private javax.swing.JRadioButton radioBackupAndRestoreBackupCommaDelimeted;
    private javax.swing.JRadioButton radioBackupAndRestoreBackupCommaDelimetedPokari;
    private javax.swing.JRadioButton radioBackupAndRestoreBackupTabDelimeted;
    private javax.swing.JRadioButton radioBackupAndRestoreBackupTabDelimetedPokari;
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
    private javax.swing.JTable tableMappingMasterPokariCustomer;
    private javax.swing.JTable tableMappingMasterPokariEmployee;
    private javax.swing.JTable tableMappingMasterPokariProduct;
    private javax.swing.JTable tableMappingTipeOutlet;
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
    private javax.swing.JTable tableTabelTabelPokariCustomerGroup;
    private javax.swing.JTable tableTabelTabelPokariCustomerHirarchy;
    private javax.swing.JTable tableTabelTabelPokariGroupSales;
    private javax.swing.JTable tableTabelTabelPokariProductBrand;
    private javax.swing.JTable tableTabelTabelPokariSalesTerritory;
    private javax.swing.JTable tableTabelTabelPokariTeamSales;
    private javax.swing.JTable tableTabelTabelPokariTypeSales;
    private javax.swing.JTable tableTabelTabelPokariWorkplace;
    private javax.swing.JTextField textBackupAndRestoreBackupPath;
    private javax.swing.JTextField textBackupAndRestoreBackupPathPokari;
    private javax.swing.JTextField textBackupAndRestoreRestorePath;
    private javax.swing.JTextField textBackupAndRestoreRestorePathPokari;
    private javax.swing.JTextField textDistributorCode;
    private javax.swing.JTextField textDistributorName;
    private javax.swing.JTextField textEmailFrom;
    private javax.swing.JPasswordField textEmailPassword;
    private javax.swing.JTextField textEmailSubject;
    private javax.swing.JTextField textEmailTo;
    private javax.swing.JTextField textInputJHeaderSearchIdOrder;
    private javax.swing.JTextField textInputJHeaderSearchIdOutlet;
    private javax.swing.JTextField textInputJHeaderSearchSalesman;
    private javax.swing.JTextField textKonfigurasiAndUtilitiesPokariPrefixFaktur;
    private javax.swing.JTextField textKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation;
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
    private javax.swing.JTextField textMappingMasterPokariCustomerAddress;
    private javax.swing.JTextField textMappingMasterPokariCustomerCity;
    private javax.swing.JTextField textMappingMasterPokariCustomerContact;
    private javax.swing.JTextField textMappingMasterPokariCustomerDistrict;
    private javax.swing.JTextField textMappingMasterPokariCustomerEmail;
    private javax.swing.JTextField textMappingMasterPokariCustomerFax;
    private javax.swing.JTextField textMappingMasterPokariCustomerIdPokari;
    private javax.swing.JTextField textMappingMasterPokariCustomerIdScylla;
    private javax.swing.JTextField textMappingMasterPokariCustomerLimitCredit;
    private javax.swing.JTextField textMappingMasterPokariCustomerNPWP;
    private javax.swing.JTextField textMappingMasterPokariCustomerName;
    private javax.swing.JTextField textMappingMasterPokariCustomerPhone;
    private com.toedter.calendar.JDateChooser textMappingMasterPokariCustomerRegisteredDate;
    private javax.swing.JTextField textMappingMasterPokariCustomerSearchIdPokari;
    private javax.swing.JTextField textMappingMasterPokariCustomerSearchIdScylla;
    private javax.swing.JTextField textMappingMasterPokariCustomerSearchName;
    private javax.swing.JTextField textMappingMasterPokariCustomerState;
    private javax.swing.JTextField textMappingMasterPokariCustomerZipCode;
    private javax.swing.JTextField textMappingMasterPokariEmployeeIdPokari;
    private javax.swing.JTextField textMappingMasterPokariEmployeeIdScylla;
    private javax.swing.JTextField textMappingMasterPokariEmployeeName;
    private javax.swing.JTextField textMappingMasterPokariEmployeePoliceNo;
    private javax.swing.JTextField textMappingMasterPokariEmployeeVehicleId;
    private javax.swing.JTextField textMappingMasterPokariEmployeeVehicleName;
    private javax.swing.JTextField textMappingMasterPokariProductIdBrgScylla;
    private javax.swing.JTextField textMappingMasterPokariProductIdPokari;
    private javax.swing.JTextField textMappingMasterPokariProductNamaBarang;
    private javax.swing.JTextField textMappingMasterPokariProductSearchIdBrgScylla;
    private javax.swing.JTextField textMappingMasterPokariProductSearchIdPokari;
    private javax.swing.JTextField textMappingMasterPokariProductSearchNamaBarangPokari;
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
    private javax.swing.JTextField textTabelTabelPokariCustomerGroupDescription;
    private javax.swing.JTextField textTabelTabelPokariCustomerGroupIdGroup;
    private javax.swing.JTextField textTabelTabelPokariCustomerHirarchyDescription;
    private javax.swing.JTextField textTabelTabelPokariCustomerHirarchyIdHirarchy;
    private javax.swing.JTextField textTabelTabelPokariGroupSalesName;
    private javax.swing.JTextField textTabelTabelPokariGroupSalesTypeGroup;
    private javax.swing.JTextField textTabelTabelPokariProductBrandBrandId;
    private javax.swing.JTextField textTabelTabelPokariProductBrandHirarchy;
    private javax.swing.JTextField textTabelTabelPokariProductBrandName;
    private javax.swing.JTextField textTabelTabelPokariSalesTerritoryDescription;
    private javax.swing.JTextField textTabelTabelPokariSalesTerritoryIdTerritory;
    private javax.swing.JTextField textTabelTabelPokariTeamSalesName;
    private javax.swing.JTextField textTabelTabelPokariTeamSalesTeamId;
    private javax.swing.JTextField textTabelTabelPokariTypeSalesName;
    private javax.swing.JTextField textTabelTabelPokariTypeSalesTypeSales;
    private javax.swing.JTextField textTabelTabelPokariWorkplaceArea;
    private javax.swing.JTextField textTabelTabelPokariWorkplaceWorkplaceId;
    private javax.swing.JTextField textWarehouseWarehouseCode;
    private javax.swing.JTextField textWarehouseWarehouseDescription;
    // End of variables declaration//GEN-END:variables




}
