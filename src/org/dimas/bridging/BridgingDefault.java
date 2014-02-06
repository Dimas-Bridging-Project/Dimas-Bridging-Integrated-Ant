/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging;

import org.dimas.bridging.utils.KonfigurasiUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import org.bagus.common.filefilter.ExtensionFileFilter;
import org.config.spring.hibernate.dao.CvOutletDaoInter;
import org.config.spring.hibernate.dao.JHeaderDaoInter;
import org.config.spring.hibernate.dao.JPcodeDaoInter;
import org.config.spring.hibernate.dao.JTprbDaoInter;
import org.config.spring.hibernate.dao.JTpruDaoInter;
import org.config.spring.hibernate.dao.MapTipeOutletDaoInter;
import org.config.spring.hibernate.dao.OutletDaoInter;
import org.config.spring.hibernate.dao.ProdukDaoInter;
import org.config.spring.hibernate.dao.SalesmanDaoInter;
import org.config.spring.hibernate.dao.ScyBDItemDaoInter;
import org.config.spring.hibernate.dao.ScyPenyesuaianItemDaoInter;
import org.config.spring.hibernate.dao.ScyReturPabrikItemDaoInter;
import org.config.spring.hibernate.dao.StockDaoInter;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.dao.TAdjstkDaoInter;
import org.config.spring.hibernate.dao.TDatdprDaoInter;
import org.config.spring.hibernate.dao.TDatdslDaoInter;
import org.config.spring.hibernate.dao.TDatdsrDaoInter;
import org.config.spring.hibernate.dao.TDatsriDaoInter;
import org.config.spring.hibernate.dao.TMasterProductDaoInter;
import org.config.spring.hibernate.dao.TMasterOutletDaoInter;
import org.config.spring.hibernate.dao.TMasterSalesmanDaoInter;
import org.config.spring.hibernate.dao.TOutletDaoInter;
import org.config.spring.hibernate.dao.TSalesmanDaoInter;
import org.config.spring.hibernate.dao.TStokDaoInter;
import org.config.spring.hibernate.dao.TabelKeyAccountDaoInter;
import org.config.spring.hibernate.dao.TabelOutletAreaDaoInter;
import org.config.spring.hibernate.dao.TabelOutletChainDaoInter;
import org.config.spring.hibernate.dao.TabelOutletClassDaoInter;
import org.config.spring.hibernate.dao.TabelOutletGroupDaoInter;
import org.config.spring.hibernate.dao.TabelOutletLocationDaoInter;
import org.config.spring.hibernate.dao.TabelOutletSizeDaoInter;
import org.config.spring.hibernate.dao.TabelOutletSubGroupDaoInter;
import org.config.spring.hibernate.dao.TabelOutletTypeDaoInter;
import org.config.spring.hibernate.dao.TabelProdBrandDaoInter;
import org.config.spring.hibernate.dao.TabelProdCategoryDaoInter;
import org.config.spring.hibernate.dao.TabelProdDivisiDaoInter;
import org.config.spring.hibernate.dao.TabelProdSizeDaoInter;
import org.config.spring.hibernate.dao.TabelProdSubBrandDaoInter;
import org.config.spring.hibernate.dao.TabelProdSubCategoryDaoInter;
import org.config.spring.hibernate.dao.TabelProdVarianceDaoInter;
import org.config.spring.hibernate.dao.TblClientIdDaoInter;
import org.config.spring.hibernate.dao.TblSalesIdDaoInter;
import org.config.spring.hibernate.dao.TblSoIdDaoInter;
import org.config.spring.hibernate.dao.TblStockIdDaoInter;
import org.config.spring.hibernate.model.CvOutlet;
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.JTpru;
import org.config.spring.hibernate.model.MapTipeOutlet;
import org.config.spring.hibernate.model.Outlet;
import org.config.spring.hibernate.model.Produk;
import org.config.spring.hibernate.model.Salesman;
import org.config.spring.hibernate.model.ScyBDItem;
import org.config.spring.hibernate.model.ScyPenyesuaianItem;
import org.config.spring.hibernate.model.ScyReturPabrikItem;
import org.config.spring.hibernate.model.Stock;
import org.config.spring.hibernate.model.Sysvar;
import org.config.spring.hibernate.model.TAdjstk;
import org.config.spring.hibernate.model.TDatdpr;
import org.config.spring.hibernate.model.TDatdsl;
import org.config.spring.hibernate.model.TDatdsr;
import org.config.spring.hibernate.model.TDatsri;
import org.config.spring.hibernate.model.TMasterProduct;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.config.spring.hibernate.model.TMasterSalesman;
import org.config.spring.hibernate.model.TOutlet;
import org.config.spring.hibernate.model.TSalesman;
import org.config.spring.hibernate.model.TStok;
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
import org.config.spring.hibernate.model.TblClientId;
import org.config.spring.hibernate.model.TblSalesId;
import org.config.spring.hibernate.model.TblSoId;
import org.config.spring.hibernate.model.TblStockId;
import org.config.spring.hibernate.model.tablemodel.GenericTableModel;
import org.config.spring.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class BridgingDefault  extends BridgingUI implements ActionListener {
    ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
    ApplicationContext appContextMem = ApplicationContextProvider.getInstance().getApplicationContextMem();
    
    Boolean databaseMode = false;
    
    SysvarDaoInter sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    
    ProdukDaoInter produkDao =  (ProdukDaoInter) appContext.getBean("ProdukDaoBean");
    StockDaoInter stockDao = (StockDaoInter) appContext.getBean("StockDaoBean");
    OutletDaoInter outletDao = (OutletDaoInter) appContext.getBean("OutletDaoBean");
    CvOutletDaoInter cvOutletDao = (CvOutletDaoInter) appContext.getBean("CvOutletDaoBean");
    SalesmanDaoInter salesmanDao = (SalesmanDaoInter) appContext.getBean("SalesmanDaoBean");
    JHeaderDaoInter  jheaderDao = (JHeaderDaoInter) appContext.getBean("JHeaderDaoBean");
    JPcodeDaoInter jpcodeDao = (JPcodeDaoInter) appContext.getBean("JPcodeDaoBean");
    JTprbDaoInter jtprbDao = (JTprbDaoInter) appContext.getBean("JTprbDaoBean");
    JTpruDaoInter jtpruDao = (JTpruDaoInter) appContext.getBean("JTpruDaoBean");
    MapTipeOutletDaoInter mapTipeOutletDao = (MapTipeOutletDaoInter) appContext.getBean("MapTipeOutletDaoBean");
    //Tambahan Input untuk KEK
    ScyBDItemDaoInter scyBDItemDao = (ScyBDItemDaoInter) appContext.getBean("ScyBDItemDaoBean");
    ScyPenyesuaianItemDaoInter scyPenyesuaianItemDao = (ScyPenyesuaianItemDaoInter) appContext.getBean("ScyPenyesuaianItemDaoBean");
    ScyReturPabrikItemDaoInter scyReturPabriItemkDao = (ScyReturPabrikItemDaoInter) appContext.getBean("ScyReturPabrikDaoBean");
    //Output Baygon
    TblSalesIdDaoInter tblSalesIdDao = (TblSalesIdDaoInter) appContext.getBean("TblSalesIdDaoBean");
    TblStockIdDaoInter tblStockIdDao = (TblStockIdDaoInter) appContext.getBean("TblStockIdDaoBean");
    TblClientIdDaoInter tblClientIdDao = (TblClientIdDaoInter) appContext.getBean("TblClientIdDaoBean");
    TblSoIdDaoInter tblSoIdDao = (TblSoIdDaoInter) appContext.getBean("TblSoIdDaoBean");
   //Memory HSQL
    ProdukDaoInter produkDaoMem =  (ProdukDaoInter) appContextMem.getBean("ProdukDaoBean");
    StockDaoInter stockDaoMem = (StockDaoInter) appContextMem.getBean("StockDaoBean");
    OutletDaoInter outletDaoMem = (OutletDaoInter) appContextMem.getBean("OutletDaoBean");
    CvOutletDaoInter cvOutletDaoMem = (CvOutletDaoInter) appContextMem.getBean("CvOutletDaoBean");
    SalesmanDaoInter salesmanDaoMem = (SalesmanDaoInter) appContextMem.getBean("SalesmanDaoBean");
    
    JHeaderDaoInter  jheaderDaoMem = (JHeaderDaoInter) appContextMem.getBean("JHeaderDaoBean");
    JPcodeDaoInter jpcodeDaoMem = (JPcodeDaoInter) appContextMem.getBean("JPcodeDaoBean");
    JTprbDaoInter jtprbDaoMem = (JTprbDaoInter) appContextMem.getBean("JTprbDaoBean");
    JTpruDaoInter jtpruDaoMem = (JTpruDaoInter) appContextMem.getBean("JTpruDaoBean");
    MapTipeOutletDaoInter mapTipeOutletDaoMem = (MapTipeOutletDaoInter) appContextMem.getBean("MapTipeOutletDaoBean");
    //Tambahan Input untuk KEK
    ScyBDItemDaoInter scyBDItemDaoMem = (ScyBDItemDaoInter) appContextMem.getBean("ScyBDItemDaoBean");
    ScyPenyesuaianItemDaoInter scyPenyesuaianItemDaoMem = (ScyPenyesuaianItemDaoInter) appContextMem.getBean("ScyPenyesuaianItemDaoBean");
    ScyReturPabrikItemDaoInter scyReturPabriItemkDaoMem = (ScyReturPabrikItemDaoInter) appContextMem.getBean("ScyReturPabrikDaoBean");
    //Output Baygon
    TblSalesIdDaoInter tblSalesIdDaoMem = (TblSalesIdDaoInter) appContextMem.getBean("TblSalesIdDaoBean");
    TblStockIdDaoInter tblStockIdDaoMem = (TblStockIdDaoInter) appContextMem.getBean("TblStockIdDaoBean");
    TblClientIdDaoInter tblClientIdDaoMem = (TblClientIdDaoInter) appContextMem.getBean("TblClientIdDaoBean");
    TblSoIdDaoInter tblSoIdDaoMem = (TblSoIdDaoInter) appContextMem.getBean("TblSoIdDaoBean");
    //Tambahan File Input
    
    //Inisialisasi DaoTambahan
    //Tabel-Tabel
    TabelKeyAccountDaoInter tabelKeyAccountDao = (TabelKeyAccountDaoInter) appContext.getBean("TabelKeyAccountDaoBean");
    TabelOutletChainDaoInter tabelOutletChainDao = (TabelOutletChainDaoInter) appContext.getBean("TabelOutletChainDaoBean");
    TabelOutletClassDaoInter tabelOutletClassDao = (TabelOutletClassDaoInter) appContext.getBean("TabelOutletClassDaoBean");
    TabelOutletGroupDaoInter tabelOutletGroupDao = (TabelOutletGroupDaoInter) appContext.getBean("TabelOutletGroupDaoBean");
    TabelOutletLocationDaoInter tabelOutletLocationDao = (TabelOutletLocationDaoInter) appContext.getBean("TabelOutletLocationDaoBean");
    TabelOutletSizeDaoInter tabelOutletSizeDao = (TabelOutletSizeDaoInter) appContext.getBean("TabelOutletSizeDaoBean");
    TabelOutletSubGroupDaoInter tabelOutletSubGroupDao = (TabelOutletSubGroupDaoInter) appContext.getBean("TabelOutletSubGroupDaoBean");
    TabelOutletTypeDaoInter tabelOutletTypeDao = (TabelOutletTypeDaoInter) appContext.getBean("TabelOutletTypeDaoBean");
    TabelOutletAreaDaoInter tabelOutletAreaDao = (TabelOutletAreaDaoInter) appContext.getBean("TabelOutletAreaDaoBean");
    
    TabelProdBrandDaoInter tabelProdBrandDao = (TabelProdBrandDaoInter) appContext.getBean("TabelProdBrandDaoBean");
    TabelProdCategoryDaoInter tabelProdCategoryDao = (TabelProdCategoryDaoInter) appContext.getBean("TabelProdCategoryDaoBean");
    TabelProdDivisiDaoInter tabelProdDivisiDao = (TabelProdDivisiDaoInter) appContext.getBean("TabelProdDivisiDaoBean");
    TabelProdSizeDaoInter tabelProdSizeDao = (TabelProdSizeDaoInter) appContext.getBean("TabelProdSizeDaoBean");
    TabelProdSubBrandDaoInter tabelProdSubBrandDao = (TabelProdSubBrandDaoInter) appContext.getBean("TabelProdSubBrandDaoBean");
    TabelProdSubCategoryDaoInter tabelProdSubCategoryDao = (TabelProdSubCategoryDaoInter) appContext.getBean("TabelProdSubCategoryDaoBean");
    TabelProdVarianceDaoInter tabelProdVarianceDao = (TabelProdVarianceDaoInter) appContext.getBean("TabelProdVarianceDaoBean");    
    //Master Product, Outlet, Salesman
    TMasterProductDaoInter tMasterProductDao = (TMasterProductDaoInter) appContext.getBean("TMasterProductDaoBean");
    TMasterOutletDaoInter tMasterOutletDao = (TMasterOutletDaoInter) appContext.getBean("TMasterOutletDaoBean");
    TMasterSalesmanDaoInter tMasterSalesmanDao = (TMasterSalesmanDaoInter) appContext.getBean("TMasterSalesmanDaoBean");

    //Tabel-Tabel KEK
    TabelKeyAccountDaoInter tabelKeyAccountDaoMem = (TabelKeyAccountDaoInter) appContextMem.getBean("TabelKeyAccountDaoBean");
    TabelOutletChainDaoInter tabelOutletChainDaoMem = (TabelOutletChainDaoInter) appContextMem.getBean("TabelOutletChainDaoBean");
    TabelOutletClassDaoInter tabelOutletClassDaoMem = (TabelOutletClassDaoInter) appContextMem.getBean("TabelOutletClassDaoBean");
    TabelOutletGroupDaoInter tabelOutletGroupDaoMem = (TabelOutletGroupDaoInter) appContextMem.getBean("TabelOutletGroupDaoBean");
    TabelOutletLocationDaoInter tabelOutletLocationDaoMem = (TabelOutletLocationDaoInter) appContextMem.getBean("TabelOutletLocationDaoBean");
    TabelOutletSizeDaoInter tabelOutletSizeDaoMem = (TabelOutletSizeDaoInter) appContextMem.getBean("TabelOutletSizeDaoBean");
    TabelOutletSubGroupDaoInter tabelOutletSubGroupDaoMem = (TabelOutletSubGroupDaoInter) appContextMem.getBean("TabelOutletSubGroupDaoBean");
    TabelOutletTypeDaoInter tabelOutletTypeDaoMem = (TabelOutletTypeDaoInter) appContextMem.getBean("TabelOutletTypeDaoBean");
    TabelOutletAreaDaoInter tabelOutletAreaDaoMem = (TabelOutletAreaDaoInter) appContextMem.getBean("TabelOutletAreaDaoBean");
    
    TabelProdBrandDaoInter tabelProdBrandDaoMem = (TabelProdBrandDaoInter) appContextMem.getBean("TabelProdBrandDaoBean");
    TabelProdCategoryDaoInter tabelProdCategoryDaoMem = (TabelProdCategoryDaoInter) appContextMem.getBean("TabelProdCategoryDaoBean");
    TabelProdDivisiDaoInter tabelProdDivisiDaoMem = (TabelProdDivisiDaoInter) appContextMem.getBean("TabelProdDivisiDaoBean");
    TabelProdSizeDaoInter tabelProdSizeDaoMem = (TabelProdSizeDaoInter) appContextMem.getBean("TabelProdSizeDaoBean");
    TabelProdSubBrandDaoInter tabelProdSubBrandDaoMem = (TabelProdSubBrandDaoInter) appContextMem.getBean("TabelProdSubBrandDaoBean");
    TabelProdSubCategoryDaoInter tabelProdSubCategoryDaoMem = (TabelProdSubCategoryDaoInter) appContextMem.getBean("TabelProdSubCategoryDaoBean");
    TabelProdVarianceDaoInter tabelProdVarianceDaoMem = (TabelProdVarianceDaoInter) appContextMem.getBean("TabelProdVarianceDaoBean");    
    //Master Product, Outlet, Salesman Mapping KEK
    TMasterProductDaoInter tMasterProductDaoMem = (TMasterProductDaoInter) appContextMem.getBean("TMasterProductDaoBean");
    TMasterOutletDaoInter tMasterOutletDaoMem = (TMasterOutletDaoInter) appContextMem.getBean("TMasterOutletDaoBean");
    TMasterSalesmanDaoInter tMasterSalesmanDaoMem = (TMasterSalesmanDaoInter) appContextMem.getBean("TMasterSalesmanDaoBean");
    
    //DAO untuk Output KEK  
    TAdjstkDaoInter tAdjstkDao = (TAdjstkDaoInter) appContext.getBean("TAdjstkDaoBean");
    TDatdprDaoInter tDatdprDao = (TDatdprDaoInter) appContext.getBean("TDatdprDaoBean");
    TDatdslDaoInter tDatdslDao = (TDatdslDaoInter) appContext.getBean("TDatdslDaoBean");
    TDatdsrDaoInter tDatdsrDao = (TDatdsrDaoInter) appContext.getBean("TDatdsrDaoBean");
    TDatsriDaoInter tDatsriDao = (TDatsriDaoInter) appContext.getBean("TDatsriDaoBean");
    TStokDaoInter tStokDao = (TStokDaoInter) appContext.getBean("TStokDaoBean");
    
    TOutletDaoInter tOutletDao = (TOutletDaoInter) appContext.getBean("TOutletDaoBean");
    TSalesmanDaoInter tSalesmanDao = (TSalesmanDaoInter) appContext.getBean("TSalesmanDaoBean");
            
            
            
    //DAO untuk Output KEK  Memori
    TAdjstkDaoInter tAdjstkDaoMem = (TAdjstkDaoInter) appContextMem.getBean("TAdjstkDaoBean");
    TDatdprDaoInter tDatdprDaoMem = (TDatdprDaoInter) appContextMem.getBean("TDatdprDaoBean");
    TDatdslDaoInter tDatdslDaoMem = (TDatdslDaoInter) appContextMem.getBean("TDatdslDaoBean");
    TDatdsrDaoInter tDatdsrDaoMem = (TDatdsrDaoInter) appContextMem.getBean("TDatdsrDaoBean");
    TDatsriDaoInter tDatsriDaoMem = (TDatsriDaoInter) appContextMem.getBean("TDatsriDaoBean");
    TStokDaoInter tStokDaoMem = (TStokDaoInter) appContextMem.getBean("TStokDaoBean");
    
    TOutletDaoInter tOutletDaoMem = (TOutletDaoInter) appContextMem.getBean("TOutletDaoBean");
    TSalesmanDaoInter tSalesmanDaoMem = (TSalesmanDaoInter) appContextMem.getBean("TSalesmanDaoBean");

    
    GenericTableModel<Produk> tmProduk = null;
    GenericTableModel<Stock> tmStock = null;
    GenericTableModel<Outlet> tmOutlet = null;
    GenericTableModel<CvOutlet> tmCvOutlet = null;
    GenericTableModel<Salesman> tmSalesman = null;
    GenericTableModel<JHeader> tmJHeader = null;
    GenericTableModel<JPcode> tmJPcode = null;
    GenericTableModel<JTprb> tmJTprb = null;
    GenericTableModel<JTpru> tmJTpru = null;
    GenericTableModel<MapTipeOutlet> tmMaptipeOutlet = null;
    //Tambahan Input untuk KEK
    GenericTableModel<ScyBDItem> tmScyBDItem =null;
    GenericTableModel<ScyPenyesuaianItem> tmScyPenyesuaianItem = null;
    GenericTableModel<ScyReturPabrikItem> tmScyReturPabrikItem = null;
    //Output Untuk Baygon   
    GenericTableModel<TblSalesId> tmTblSalesId = null;
    GenericTableModel<TblClientId> tmTblClientId = null;
    GenericTableModel<TblStockId> tmTblStockId = null;
    GenericTableModel<TblSoId> tmTblSoId = null;

    //DynamicTableModel Tabel-tabel KEK
    GenericTableModel<TabelKeyAccount> tmTabelKeyAccount = null;
    GenericTableModel<TabelOutletChain> tmTabelOutletChain = null;
    GenericTableModel<TabelOutletClass> tmTabelOutletClass = null;
    GenericTableModel<TabelOutletGroup> tmTabelOutletGroup = null;
    GenericTableModel<TabelOutletLocation> tmTabelOutletLocation = null;
    GenericTableModel<TabelOutletSize> tmTabelOutletSize = null;
    GenericTableModel<TabelOutletSubGroup> tmTabelOutletSubGroup = null;
    GenericTableModel<TabelOutletType> tmTabelOutletType = null;
    GenericTableModel<TabelProdBrand> tmTabelProdBrand = null;
    GenericTableModel<TabelProdCategory> tmTabelProdCatetory = null;
    GenericTableModel<TabelProdDivisi> tmTabelProdDivisi = null;
    GenericTableModel<TabelProdSize> tmTabelProdSize = null;
    GenericTableModel<TabelProdSubBrand> tmTabelProdSubBrand = null;
    GenericTableModel<TabelProdSubCategory> tmTabelProdSubCategory = null;
    GenericTableModel<TabelProdVariance> tmTabelProdVariance = null;
    //DynamicTableModel Master Product, Outlet,Salesman
    GenericTableModel<TMasterProduct> tmTMasterProduct = null;
    GenericTableModel<TMasterOutlet> tmTMasterOutlet = null;
    GenericTableModel<TMasterSalesman> tmTMasterSalesman = null;
    //Tabel Model untuk Output >> Beda dengan Input Lho
    GenericTableModel<TStok> tmOutputTStok=null;
    GenericTableModel<TDatdsr> tmOutputTDatdsr=null;
    GenericTableModel<TDatdsl> tmOutputTDatdsl=null;
    GenericTableModel<TDatdpr> tmOutputTDatdpr=null;
    GenericTableModel<TDatsri> tmOutputTDatsri=null;
    GenericTableModel<TAdjstk> tmOutputTAdjstk=null;

    GenericTableModel<TSalesman> tmOutputTSalesman=null;
    GenericTableModel<TOutlet> tmOutputTOutlet=null;
    
    //Nanti diganti
    public String currentPath = "/home/yhawin/Dimas/Input-File/";
    
    public BridgingDefault() {
        this.setTitle("KEK >> DIMAS KEDIRI"); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initFormDefa();
        initActionAdditionalDefa();
        initComponentAppearanceDefa();
        
    }
    
    private void initFormDefa(){
        setScreenCenter();
        //1.Reset Teks
        resetTeksAll();
        //CheckBox untuk mode database atau memory
        getCheckModeDatabase().setSelected(true);
        databaseMode = true;
        
        //Form Konfigurasi
        KonfigurasiUtils defaultKonfigurasi = new KonfigurasiUtils();
        defaultKonfigurasi.setFirstKonfigurasiIfEmpty();        
        aksiBtnGeneralSettingReload();
        
        //Button JPcode, JTpru, dan JTprb di hidden karena Di handle oleh JHeader
        getBtnRetrieveInputJPcode().setVisible(false);
        getBtnRetrieveInputJTprb().setVisible(false);
        getBtnRetrieveInputJTpru().setVisible(false);
        
        //Jika Mapp masih kosong maka berbahaya --> harus dipaksa untuk input
        
        //MapTipeOutlet mto = new MapTipeOutlet();
        /*
        List<MapTipeOutlet> listMapTipeOutlet = mapTipeOutletDao.findAll();
        if (listMapTipeOutlet.size()==0) {
            JOptionPane.showMessageDialog(this, "Mapping Tipe Outlet Masih Kosong\n Setiap Tipe Scylla Harus di Mapping,"
                    + "\n\n Jika tidak maka......\n TIDAK ADA OUTLET YANG AKAN DI PROSES", "Warning..", JOptionPane.WARNING_MESSAGE);
            getjTabbedPane4().setSelectedIndex(1);
            getjTabbedPane1().setSelectedIndex(9);
            
        }
        */
        //Diganti dengan ini
        
        //MODE UTAMA BUKAN DATABASE
        getCheckModeDatabase().setSelected(false);
        databaseMode=false;
        
        
        
    }
    
    private void initComponentAppearanceDefa(){
        //Isi semua JTable
        aksiBtnPathInputReloadAll();
        
        getTableInputCvOutlet().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJheader().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJpcode().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJtprb().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJtpru().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputMaster().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputOutlet().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputSalesman().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputStock().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //Input Tambahan Untuk KEK masih Belum?
        getTableInputBarangDatang().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputReturKePabrik().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputStockAdjustment().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        //Setup Tabel-tabel Tidak Perlu ya?
        //Map Master SAP
        getTableMapProduct().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableMapOutlet().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableMapSalesman().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        /*
        getTableOutputClient().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputSales().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputSalesOrder().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputStock().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        */
        
        getTableOutputTAdjstk().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputTDatdpr().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputTDatdsl().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputTDatdsr().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputTDatsri().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputTOutlet().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputTSalesman().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputTStok().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        getRadioBackupAndRestoreBackupCommaDelimeted().setSelected(true);
    }
     private void initActionAdditionalDefa(){
         getTableMappingTipeOutlet().getSelectionModel().addListSelectionListener(new ListSelectionListener() {

             @Override
             public void valueChanged(ListSelectionEvent e) {
                 aksiListMapTipeOutletSeleksi();
             }
         });
         
         getCheckModeDatabase().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                if (getCheckModeDatabase().isSelected()) {
                    databaseMode=true;         
                } else {
                    databaseMode=false;
                } 
                aksiBtnPathInputReloadAll();
                
             }
         });
         getCheckTprbDiluarBarang().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 Sysvar localSysvar = new Sysvar();
                localSysvar = sysvarDao.findById("_TPR_NOB");
                 
                if (localSysvar==null) {
                    localSysvar = new Sysvar();
                    localSysvar.setIdSysvar("_TPR_NOB");
                    localSysvar.setDeskripsi("TPR Barang yang tidak termasuk pada item nota akan di spread");
                    localSysvar.setTipeData("BOL1");
                    localSysvar.setNilaiBol1(false);
                    
                 }
                 if (getCheckTprbDiluarBarang().isSelected()) {
                    localSysvar.setNilaiBol1(true);
                 }else {
                     localSysvar.setNilaiBol1(false);
                 }
                  
                 sysvarDao.saveOrUpdate(localSysvar);
             }
         });
     }
     
    public static void main(String [] args){

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
            @Override
            public void run() {
                //new BridgingUI().setVisible(true);
                new BridgingDefault().setVisible(true);
            }
        });
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
   @Override
   public void aksiBtnPathOutput() {
        JFileChooser fileChooser1 =  new JFileChooser(currentPath);
        fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser1.setDialogTitle("Path Extract File");        
        
        if (fileChooser1.showOpenDialog(this) ==JFileChooser.APPROVE_OPTION){
            File filePath = fileChooser1.getSelectedFile();
            currentPath = filePath.toString();            
            if (filePath != null) {
                String strDirPath = filePath.getAbsolutePath() + File.separator;
                getTextPathOutput().setText(strDirPath);
            }
        }    
        
   }
   @Override
   public void aksiBtnExtractAll() {
   }          
    @Override
    public void aksiBtnExtractClient() {
     }
    @Override
    public void aksiBtnExtractSales() {
    }
    @Override
    public void aksiBtnExtractSo() {
    }
    @Override
     public void aksiBtnExtractStock() {
    }
    
    
    @Override
    public void aksiBtnGeneralSettingReload() {
        //Konfigurasi
        Sysvar sysvar;
        
        sysvar = sysvarDao.findById("_DIST_CODE");
        if (sysvar !=null) 
            getTextDistributorCode().setText(sysvar.getNilaiString1());
        
        sysvar = sysvarDao.findById("_DIST_NAME");
        if (sysvar !=null) 
            getTextDistributorName().setText(sysvar.getNilaiString1());
        
        sysvar = sysvarDao.findById("_REC_SLS");
        if (sysvar !=null) 
            getTextRecordTypeSales().setText(sysvar.getNilaiString1());
        sysvar = sysvarDao.findById("_REC_STK");
        if (sysvar !=null) 
            getTextRecordTypeStock().setText(sysvar.getNilaiString1());
        sysvar = sysvarDao.findById("_REC_CLN");
        if (sysvar !=null) 
            getTextRecordTypeClient().setText(sysvar.getNilaiString1());
        sysvar = sysvarDao.findById("_REC_SO");
        if (sysvar !=null) 
            getTextRecordTypeSo().setText(sysvar.getNilaiString1());
 
        sysvar = sysvarDao.findById("_WH_CODE");
        if (sysvar !=null) 
            getTextWarehouseWarehouseCode().setText(sysvar.getNilaiString1());
        sysvar = sysvarDao.findById("_WH_DESC");
        if (sysvar !=null) 
            getTextWarehouseWarehouseDescription().setText(sysvar.getNilaiString1());
        
        sysvar = sysvarDao.findById("_EM_FROM");
        if (sysvar !=null) 
            getTextEmailFrom().setText(sysvar.getNilaiString1());
        
        sysvar = sysvarDao.findById("_EM_PASS");
        if (sysvar !=null) 
            getTextEmailPassword().setText(sysvar.getNilaiString1());

        sysvar = sysvarDao.findById("_EM_TO");
        if (sysvar !=null) 
            getTextEmailTo().setText(sysvar.getNilaiString1());
        sysvar = sysvarDao.findById("_EM_SUB");
        if (sysvar !=null) 
            getTextEmailSubject().setText(sysvar.getNilaiString1());
        
        sysvar = sysvarDao.findById("_TPR_NoB");
        if (sysvar !=null) 
            getCheckTprbDiluarBarang().setSelected(sysvar.getNilaiBol1());
    }
    
    @Override
    public void aksiBtnGeneralSettingSimpan() {
        KonfigurasiUtils konfigUtils = new KonfigurasiUtils();
        String passEmail = new String(getTextEmailPassword().getPassword());
        
        konfigUtils.simpanKonfigurasi(getTextDistributorCode().getText(), getTextDistributorName().getText(), getTextRecordTypeSales().getText(), 
                getTextRecordTypeStock().getText(), getTextRecordTypeClient().getText(), getTextRecordTypeSo().getText(), 
                getTextWarehouseWarehouseCode().getText(), getTextWarehouseWarehouseDescription().getText(), 
                getTextEmailFrom().getText(), getTextEmailTo().getText(), getTextEmailSubject().getText(), 
                passEmail);
    
    }

    @Override
    public void aksiBtnInputCvOutletReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<CvOutlet> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = cvOutletDao.findAll();
        } else {
            lst = cvOutletDaoMem.findAll();        
        }
            tmCvOutlet = new GenericTableModel<>(lst, CvOutlet.class);
            getTableInputCvOutlet().setModel(tmCvOutlet);
    }
    @Override
    public void aksiBtnInputJheaderReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<JHeader> lst = new ArrayList<>();
        if (databaseMode ==true) {
            lst = jheaderDao.findAll();
        } else {
            lst = jheaderDaoMem.findAll();
        }
            tmJHeader = new GenericTableModel<>(lst, JHeader.class);
            getTableInputJheader().setModel(tmJHeader);
    }
    @Override
    public void aksiBtnInputJpcodeReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<JPcode> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = jpcodeDao.findAll();
        } else {
            lst = jpcodeDaoMem.findAll();
        }
            tmJPcode = new GenericTableModel<>(lst, JPcode.class);
            getTableInputJpcode().setModel(tmJPcode);
    }
    @Override
    public void aksiBtnInputJtprbReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<JTprb> lst = new ArrayList<>();
        if (databaseMode ==true) {
            lst = jtprbDao.findAll();
        } else {
            lst = jtprbDaoMem.findAll();
        }
            tmJTprb = new GenericTableModel<>(lst, JTprb.class);
            getTableInputJtprb().setModel(tmJTprb);
    }
    @Override
    public void aksiBtnInputJtpruReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<JTpru> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = jtpruDao.findAll();
        }else {
            lst = jtpruDaoMem.findAll();
        }
            tmJTpru = new GenericTableModel<>(lst, JTpru.class);
            getTableInputJtpru().setModel(tmJTpru);
    }
    @Override
    public void aksiBtnInputMasterReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<Produk> lst = new ArrayList<>();
        if (databaseMode == true) {
            lst=  produkDao.findAll();
        } else {
            lst = produkDaoMem.findAll();
        }
            tmProduk = new GenericTableModel<>(lst, Produk.class);
            getTableInputMaster().setModel(tmProduk);
    }
    @Override
    public void aksiBtnInputOutletReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<Outlet> lst = new ArrayList<>();
        if (databaseMode ==true) {
            lst = outletDao.findAll();
        }else {
            lst = outletDaoMem.findAll();
        }
            tmOutlet = new GenericTableModel<>(lst, Outlet.class);
            getTableInputOutlet().setModel(tmOutlet); 
    }
    @Override
    public void aksiBtnInputSalesmanReload() {
         //Reload Input hanya berlaku pada saat database mode
       List<Salesman> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = salesmanDao.findAll();
        } else {
            lst = salesmanDaoMem.findAll();
        }
            tmSalesman = new GenericTableModel<>(lst, Salesman.class);
            getTableInputSalesman().setModel(tmSalesman);
    }
 
    @Override
    public void aksiBtnInputStockReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<Stock> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = stockDao.findAll();
        } else {
            lst = stockDaoMem.findAll();
        }
            tmStock = new GenericTableModel<>(lst, Stock.class);
            getTableInputStock().setModel(tmStock);
    }
    //Reload Input Tambahan untuk KEK
    @Override
   public void aksiBtnInputReturKePabrikReload() {
       List<ScyReturPabrikItem> lst = new ArrayList<>();
       if (databaseMode==true) {
           lst = scyReturPabriItemkDao.findAll();
       } else {
           lst = scyReturPabriItemkDaoMem.findAll();
       }
       tmScyReturPabrikItem = new GenericTableModel<>(lst, ScyReturPabrikItem.class);
       getTableInputReturKePabrik().setModel(tmScyReturPabrikItem);       
   }
    @Override
   public void aksiBtnInputBarangDatangReload(){
       List<ScyBDItem> lst = new ArrayList<>();
       if (databaseMode==true) {
           lst = scyBDItemDao.findAll();
       } else {
           lst = scyBDItemDaoMem.findAll();
       }
       tmScyBDItem= new GenericTableModel<>(lst, ScyBDItem.class);
       getTableInputBarangDatang().setModel(tmScyBDItem);       
   }
    @Override
   public void aksiBtnInputStockAdjustmentReload(){
       List<ScyPenyesuaianItem> lst = new ArrayList<>();
       if (databaseMode==true) {
           lst = scyPenyesuaianItemDao.findAll();
       } else {
           lst = scyPenyesuaianItemDaoMem.findAll();
       }
       tmScyPenyesuaianItem= new GenericTableModel<>(lst, ScyPenyesuaianItem.class);
       getTableInputStockAdjustment().setModel(tmScyPenyesuaianItem);
   }
    
    
    // **** RELOAD TAMBAHAN KEK
    public void aksiBtnTabelKeyAccountReload(){
        List<TabelKeyAccount> lst = new ArrayList<>();
        lst = tabelKeyAccountDao.findAll();
        tmTabelKeyAccount = new GenericTableModel<>(lst, TabelKeyAccount.class);
        getTableTabelKeyAccount().setModel(tmTabelKeyAccount);
    }
    public void aksiBtnTabelOutletChainReload(){
        List<TabelOutletChain> lst = new ArrayList<>();
        lst = tabelOutletChainDao.findAll();
        tmTabelOutletChain = new GenericTableModel<>(lst, TabelOutletChain.class);
        getTableTabelOutletChain().setModel(tmTabelOutletChain);
    }
    public void aksiBtnTabelOutletClassReload(){
        List<TabelOutletClass> lst = new ArrayList<>();
        lst = tabelOutletClassDao.findAll();
        tmTabelOutletClass = new GenericTableModel<>(lst, TabelOutletClass.class );
        getTableTabelOutletClass().setModel(tmTabelOutletClass);
    }
    public void aksiBtnTabelOutletGroupReload(){
        List<TabelOutletGroup> lst = new ArrayList<>();
        lst = tabelOutletGroupDao.findAll();
        tmTabelOutletGroup = new GenericTableModel<>(lst,TabelOutletGroup.class );
        getTableTabelOutletGroup().setModel(tmTabelOutletGroup);
    }
    public void aksiBtnTabelOutletSubGroupReload(){
        List<TabelOutletSubGroup> lst = new ArrayList<>();
        lst = tabelOutletSubGroupDao.findAll();
        tmTabelOutletSubGroup = new GenericTableModel<>(lst,TabelOutletSubGroup.class );
        getTableTabelOutletSubGroup().setModel(tmTabelOutletSubGroup);    
    }
    public void aksiBtnTabelOutletLocationReload(){
        List<TabelOutletLocation> lst = new ArrayList<>();
        lst = tabelOutletLocationDao.findAll();
        tmTabelOutletLocation = new GenericTableModel<>(lst,TabelOutletLocation.class );
        getTableTabelOutletLocation().setModel(tmTabelOutletLocation);
    }
    public void aksiBtnTabelOutletSizeReload(){
        List<TabelOutletSize> lst = new ArrayList<>();
        lst = tabelOutletSizeDao.findAll();
        tmTabelOutletSize = new GenericTableModel<>(lst, TabelOutletSize.class);
        getTableTabelOutletSize().setModel(tmTabelOutletSize);
    }
    public void aksiBtnTabelOutletTypeReload(){
        List<TabelOutletType> lst = new ArrayList<>();
        lst = tabelOutletTypeDao.findAll();
        tmTabelOutletType = new GenericTableModel<>(lst, TabelOutletType.class);
        getTableTabelOutletType().setModel(tmTabelOutletType);
    }
    
    public void aksiBtnTabelProdBrandReload(){
        List<TabelProdBrand> lst = new ArrayList<>();
        lst = tabelProdBrandDao.findAll();
        tmTabelProdBrand = new GenericTableModel<>(lst, TabelProdBrand.class);
        getTableTabelProdBrand().setModel(tmTabelProdBrand);
    }
    public void aksiBtnTabelProdCategoryReload(){
        List<TabelProdCategory> lst = new ArrayList<>();
        lst = tabelProdCategoryDao.findAll();
        tmTabelProdCatetory = new GenericTableModel<>(lst, TabelProdCategory.class);
        getTableTabelProdCateg().setModel(tmTabelProdCatetory);
    }
    public void aksiBtnTabelProdProdDivisiReload(){
        List<TabelProdDivisi> lst = new ArrayList<>();
        lst = tabelProdDivisiDao.findAll();
        tmTabelProdDivisi = new GenericTableModel<>(lst, TabelProdDivisi.class);
        getTableTabelProdDivisi().setModel(tmTabelProdDivisi);
    }
    public void aksiBtnTabelProdSizeReload(){
        List<TabelProdSize> lst = new ArrayList<>();
        lst = tabelProdSizeDao.findAll();
        tmTabelProdSize = new GenericTableModel<>(lst, TabelProdSize.class);
        getTableTabelProdSize().setModel(tmTabelProdSize);
    }
    public void aksiBtnTabelProdDivisiReload(){
        List<TabelProdDivisi> lst = new ArrayList<>();
        lst = tabelProdDivisiDao.findAll();
        tmTabelProdDivisi = new GenericTableModel<>(lst, TabelProdDivisi.class);
        getTableTabelProdDivisi().setModel(tmTabelProdDivisi);
    }
    public void aksiBtnTabelProdSubBrandReload(){
        List<TabelProdSubBrand> lst = new ArrayList<>();
        lst = tabelProdSubBrandDao.findAll();
        tmTabelProdSubBrand = new GenericTableModel<>(lst, TabelProdSubBrand.class);
        getTableTabelProdSubBrand().setModel(tmTabelProdSubBrand);
    }
    public void aksiBtnTabelProdSubCategoryReload(){
        List<TabelProdSubCategory> lst = new ArrayList<>();
        lst = tabelProdSubCategoryDao.findAll();
        tmTabelProdSubCategory = new GenericTableModel<>(lst, TabelProdSubCategory.class);
        getTableTabelProdSubCateg().setModel(tmTabelProdSubCategory);
    }
    public void aksiBtnTabelProdVarianceReload(){        
        List<TabelProdVariance> lst = new ArrayList<>();
        lst = tabelProdVarianceDao.findAll();
        tmTabelProdVariance = new GenericTableModel<>(lst, TabelProdVariance.class);
        getTableTabelProdVariance().setModel(tmTabelProdVariance);
        
    }
    
    //Reload Kita tidak jadikan satu dengan class BridgingTabelTabelMasterSAP.java karena biar bisa diakses semua 
    public void aksiBtnTMasterProductReload(){
        List<TMasterProduct> lst = new ArrayList<>();
        lst = tMasterProductDao.findAll();
        tmTMasterProduct = new GenericTableModel<>(lst, TMasterProduct.class);
        getTableMapProduct().setModel(tmTMasterProduct);
    }
    public void aksiBtnTMasterOutletReload(){
        List<TMasterOutlet> lst = new ArrayList<>();
        lst = tMasterOutletDao.findAll();
        tmTMasterOutlet = new GenericTableModel<>(lst,TMasterOutlet.class);
        getTableMapOutlet().setModel(tmTMasterOutlet);
    }
    public void aksiBtnTMasterSalesmanReload(){
        List<TMasterSalesman> lst = new ArrayList();
        lst = tMasterSalesmanDao.findAll();
        tmTMasterSalesman = new GenericTableModel<>(lst, TMasterSalesman.class);
        getTableMapSalesman().setModel(tmTMasterSalesman);
    }
    
    
    //********* RELOAD OUTPUT KEK
    @Override
    public void aksiBtnOutputTAdjstkReload(){
        List<TAdjstk> lst = new ArrayList();
       if (databaseMode==true) {
           lst = tAdjstkDao.findAll();
       } else {
           lst = tAdjstkDaoMem.findAll();
       }
       tmOutputTAdjstk= new GenericTableModel<>(lst, TAdjstk.class);
       getTableOutputTAdjstk().setModel(tmOutputTAdjstk);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TAdjstk itm: lst){
           intJumlahRecord++;
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord; 
       getLblOutputTAdjstkFooterInfo().setText(teksFooter);
    }
    
    @Override
    public void aksiBtnOutputTSalesmanReload(){
       List<TSalesman> lst = new ArrayList<>();
       if (databaseMode==true) {
           lst = tSalesmanDao.findAll();
       } else {
           lst = tSalesmanDaoMem.findAll();
       }
       tmOutputTSalesman= new GenericTableModel<>(lst, TSalesman.class);
       getTableOutputTSalesman().setModel(tmOutputTSalesman);
    }
    
    @Override
    public void aksiBtnOutputTOutletReload(){
       List<TOutlet> lst = new ArrayList<>();
       if (databaseMode==true) {
           lst = tOutletDao.findAll();
       } else {
           lst = tOutletDaoMem.findAll();
       }
       tmOutputTOutlet= new GenericTableModel<>(lst, TOutlet.class);
       getTableOutputTOutlet().setModel(tmOutputTOutlet);
    }
    @Override
    public void aksiBtnOutputTStokReload(){
       List<TStok> lst = new ArrayList<>();
       if (databaseMode==true) {
           lst = tStokDao.findAll();
       } else {
           lst = tStokDaoMem.findAll();
       }
       tmOutputTStok= new GenericTableModel<>(lst, TStok.class);
       getTableOutputTStok().setModel(tmOutputTStok);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TStok itm: lst){
           intJumlahRecord++;
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord; 
    }
    @Override
    public void aksiBtnOutputTDatdprReload(){
       List<TDatdpr> lst = new ArrayList<>();
       if (databaseMode==true) {
           lst = tDatdprDao.findAll();
       } else {
           lst = tDatdprDaoMem.findAll();
       }
       tmOutputTDatdpr= new GenericTableModel<>(lst, TDatdpr.class);
       getTableOutputTDatdpr().setModel(tmOutputTDatdpr);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TDatdpr itm: lst){
           intJumlahRecord++;
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord ; 
       getLblOutputTDatdprFooterInfo().setText(teksFooter);
       
    }
    @Override
    public void aksiBtnOutputTDatdslReload(){
       List<TDatdsl> lst = new ArrayList<>();
       if (databaseMode==true) {
           lst = tDatdslDao.findAll();
       } else {
           lst = tDatdslDaoMem.findAll();
       }
       tmOutputTDatdsl= new GenericTableModel<>(lst, TDatdsl.class);
       getTableOutputTDatdsl().setModel(tmOutputTDatdsl);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TDatdsl itm: lst){
           intJumlahRecord++;
           doubleJumlahTotalSales += itm.getTotalSales();
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord + "\t TotalSales: " + doubleJumlahTotalSales; 
       getLblOutputTDatdslFooterInfo().setText(teksFooter);
       
    }
    
    @Override
    public void aksiBtnOutputTDatdsrReload(){
       List<TDatdsr> lst = new ArrayList<>();
       if (databaseMode==true) {
           lst = tDatdsrDao.findAll();
       } else {
           lst = tDatdsrDaoMem.findAll();
       }
       tmOutputTDatdsr= new GenericTableModel<>(lst, TDatdsr.class);
       getTableOutputTDatdsr().setModel(tmOutputTDatdsr);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TDatdsr itm: lst){
           intJumlahRecord++;
           doubleJumlahTotalSales += itm.getTotalSales();
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord + "\t TotalSales: " + doubleJumlahTotalSales; 
       getLblOutputTDatdsrFooterInfo().setText(teksFooter);
       
    }
    @Override
    public void aksiBtnOutputTDatsriReload(){
       List<TDatsri> lst = new ArrayList<>();
       if (databaseMode==true) {
           lst = tDatsriDao.findAll();
       } else {
           lst = tDatsriDaoMem.findAll();
       }
       tmOutputTDatsri= new GenericTableModel<>(lst, TDatsri.class);
       getTableOutputTDatsri().setModel(tmOutputTDatsri);
       //Hitung Info Footer
       Integer intJumlahRecord=0;
       Double doubleJumlahTotalSales=0.00;
       for (TDatsri itm: lst){
           intJumlahRecord++;
           doubleJumlahTotalSales += itm.getTotalSales();
       }
       String teksFooter = "Jumlah Record: " + intJumlahRecord + "\t TotalSales: " + doubleJumlahTotalSales; 
       getLblOutputTDatsriFooterInfo().setText(teksFooter);
    }
    
    
/*   RELOAD BUTTON OUTPUT BAYGON 
    @Override
    public void aksiBtnOutputClientReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblClientId> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = tblClientIdDao.findAll();
        } else  {
            lst = tblClientIdDaoMem.findAll();
        }
            tmTblClientId = new GenericTableModel<>(lst, TblClientId.class);
            getTableOutputClient().setModel(tmTblClientId);
    }
    @Override
    public void aksiBtnOutputSalesOrderReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblSoId> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = tblSoIdDao.findAll();
        }else {
            lst = tblSoIdDaoMem.findAll();
        }
            tmTblSoId = new GenericTableModel<>(lst, TblSoId.class);
            getTableOutputSalesOrder().setModel(tmTblSoId);
        
    }
    @Override
    public void aksiBtnOutputSalesReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblSalesId> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = tblSalesIdDao.findAll();
        }else {
            lst = tblSalesIdDaoMem.findAll();
        }
            tmTblSalesId = new GenericTableModel<>(lst, TblSalesId.class);
            getTableOutputSales().setModel(tmTblSalesId);
    }
    @Override
    public void aksiBtnOutputStockReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblStockId> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = tblStockIdDao.findAll();
        }else {
            lst = tblStockIdDaoMem.findAll();
        }
            tmTblStockId = new GenericTableModel<>(lst, TblStockId.class);
            getTableOutputStock().setModel(tmTblStockId);
    }
*/    
    
    
    @Override
    public void aksiBtnMapTipeOutletHapus() {
        MapTipeOutlet item = new MapTipeOutlet();
        item.setIdTipeOutlet(getTextMapTipeOutletIdTypeOutletScy().getText().trim().toUpperCase());
        item.setTipeOutlet(getTextMapTipeOutletIdTipeOutlet().getText().trim().toUpperCase());
        item.setDeskripsi(getTextMapTipeOutletDeskripsi().getText().trim().toUpperCase());
        if ((! item.getIdTipeOutlet().equals("")) || (! item.getTipeOutlet().equals(""))) {
            mapTipeOutletDao.delete(item);
            resetTeksMappingTipeOutlet();
            aksiBtnMapTipeOutletReload();
        } else {
            JOptionPane.showMessageDialog(this, "ID Outlet Kosong", "Pesan Error", JOptionPane.WARNING_MESSAGE);        
        }    
    }
    @Override
    public void aksiBtnMapTipeOutletSimpan() {
        MapTipeOutlet item = new MapTipeOutlet();
        item.setIdTipeOutlet(getTextMapTipeOutletIdTypeOutletScy().getText().trim().toUpperCase());
        item.setTipeOutlet(getTextMapTipeOutletIdTipeOutlet().getText().trim().toUpperCase());
        item.setDeskripsi(getTextMapTipeOutletDeskripsi().getText().trim().toUpperCase());
        if ((! item.getIdTipeOutlet().equals("")) || (! item.getTipeOutlet().equals(""))) {
            mapTipeOutletDao.saveOrUpdate(item);
            //tmMaptipeOutlet.add(item);
            aksiBtnMapTipeOutletReload();
        } else {
            JOptionPane.showMessageDialog(this, "ID Outlet Kosong", "Pesan Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    public void aksiListMapTipeOutletSeleksi() {
        
        int rowIndex = getTableMappingTipeOutlet().getSelectedRow();
        if (rowIndex >= 0) {
            MapTipeOutlet item = new MapTipeOutlet();
            item = tmMaptipeOutlet.get(rowIndex);

            getTextMapTipeOutletIdTypeOutletScy().setText(item.getIdTipeOutlet());
            getTextMapTipeOutletIdTipeOutlet().setText(item.getTipeOutlet());
            getTextMapTipeOutletDeskripsi().setText(item.getDeskripsi());
        }
       
    }
    
    
    @Override
    public void aksiBtnMapTipeOutletReload() {
        List<MapTipeOutlet> lst = mapTipeOutletDao.findAll();
        tmMaptipeOutlet = new GenericTableModel<>(lst, MapTipeOutlet.class);
        getTableMappingTipeOutlet().setModel(tmMaptipeOutlet);
    }
    
 /**************************/   
   @Override
   public void aksiBtnPathInputStock() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File STOCK.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputStock().setText(theFilePath);
                }               
            }
            
    }
   @Override
    public void aksiBtnPathInputAuto() {
        boolean isFileComplete = true;
        JFileChooser fileChooser1 =  new JFileChooser(currentPath);
        fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        String daftarFile [][] = {{"CVOUTLET.TXT","0"}, {"JHEADER.TXT","0"}, {"JPCODE.TXT","0"}, {"JTPRB","0"},
            {"JTPRU","0"}, {"MSOUTLET","0"}, {"SALES","0"}, {"MSPCODE","0"} }; 
        
        if (fileChooser1.showOpenDialog(this) ==JFileChooser.APPROVE_OPTION){
            resetTeksInputBackground();
            
            File filePath = fileChooser1.getSelectedFile();
            currentPath = filePath.toString();
            if (filePath != null) {
                String strDirPath = filePath.getAbsolutePath() + File.separator;
                //Cek keberadaan setiap file
                File fileStock = new File(strDirPath + "STOCK.TXT");
                if (fileStock.exists())
                    getTextPathInputStock().setText(fileStock.getAbsolutePath());
                fileStock = new File(strDirPath + "stock.txt");
                if (fileStock.exists())
                    getTextPathInputStock().setText(fileStock.getAbsolutePath());
                fileStock = new File(strDirPath + "STGDNG.txt");
                if (fileStock.exists())
                    getTextPathInputStock().setText(fileStock.getAbsolutePath());
                
                File fileCvOutlet =  new File(strDirPath + "CVOUTLET.TXT");
                if (fileCvOutlet.exists())
                    getTextPathInputCvOutlet().setText(fileCvOutlet.getAbsolutePath());
                fileCvOutlet =  new File(strDirPath + "cvoutlet.txt");
                if (fileCvOutlet.exists())
                    getTextPathInputCvOutlet().setText(fileCvOutlet.getAbsolutePath());
                
                File fileJHeader = new File(strDirPath + "JHEADER.TXT");
                if (fileJHeader.exists())
                    getTextPathInputJHeader().setText(fileJHeader.getAbsolutePath());
                fileJHeader = new File(strDirPath + "jheader.txt");
                if (fileJHeader.exists())
                    getTextPathInputJHeader().setText(fileJHeader.getAbsolutePath());
                
                File fileJPcode = new File(strDirPath + "JPCODE.TXT");
                if (fileJPcode.exists())
                    getTextPathInputJPcode().setText(fileJPcode.getAbsolutePath());
                fileJPcode = new File(strDirPath + "jpcode.txt");
                if (fileJPcode.exists())
                    getTextPathInputJPcode().setText(fileJPcode.getAbsolutePath());
                
                File fileJTprb = new File(strDirPath + "JTPRB.TXT");
                if (fileJTprb.exists())
                    getTextPathInputJTprb().setText(fileJTprb.getAbsolutePath());
                fileJTprb = new File(strDirPath + "jtprb.txt");
                if (fileJTprb.exists())
                    getTextPathInputJTprb().setText(fileJTprb.getAbsolutePath());
                
                File fileJTpru = new File(strDirPath + "JTPRU.TXT");
                if (fileJTpru.exists())
                    getTextPathInputJTpru().setText(fileJTpru.getAbsolutePath());
                fileJTpru = new File(strDirPath + "jtpru.txt");
                if (fileJTpru.exists())
                    getTextPathInputJTpru().setText(fileJTpru.getAbsolutePath());
                
                File fileOutlet = new File(strDirPath + "MSOUTLET.TXT");
                if (fileOutlet.exists())
                    getTextPathInputOutlet().setText(fileOutlet.getAbsolutePath());
                fileOutlet = new File(strDirPath + "msoutlet.txt");
                if (fileOutlet.exists())
                    getTextPathInputOutlet().setText(fileOutlet.getAbsolutePath());
                
                File fileSales = new File(strDirPath + "SALESMAN.TXT");
                if (fileSales.exists())
                    getTextPathInputSalesman().setText(fileSales.getAbsolutePath());
                fileSales = new File(strDirPath + "salesman.txt");
                if (fileSales.exists())
                    getTextPathInputSalesman().setText(fileSales.getAbsolutePath());
                
                File fileMsPcode = new File(strDirPath + "MSPCODE.TXT");
                if (fileMsPcode.exists())
                    getTextPathInputMaster().setText(fileMsPcode.getAbsolutePath());                    
                fileMsPcode = new File(strDirPath + "mspcode.txt");
                if (fileMsPcode.exists())
                    getTextPathInputMaster().setText(fileMsPcode.getAbsolutePath());
                
                File fileBarangDatang = new File(strDirPath + "BD.TXT");
                if (fileBarangDatang.exists())
                    getTextPathInputBarangDatang().setText(fileBarangDatang.getAbsolutePath());                    
                fileBarangDatang = new File(strDirPath + "bd.txt");
                if (fileBarangDatang.exists())
                    getTextPathInputBarangDatang().setText(fileBarangDatang.getAbsolutePath());
                
                File fileReturKePabrik = new File(strDirPath + "RTR.TXT");
                if (fileReturKePabrik.exists())
                    getTextPathInputReturKePabrik().setText(fileReturKePabrik.getAbsolutePath());                    
                fileReturKePabrik = new File(strDirPath + "rtr.txt");
                if (fileReturKePabrik.exists())
                    getTextPathInputReturKePabrik().setText(fileReturKePabrik.getAbsolutePath());
                
                File filePenyesuaian = new File(strDirPath + "ADJ.TXT");
                if (filePenyesuaian.exists())
                    getTextPathInputStokAdjustment().setText(filePenyesuaian.getAbsolutePath());                    
                filePenyesuaian = new File(strDirPath + "adj.txt");
                if (filePenyesuaian.exists())
                    getTextPathInputStokAdjustment().setText(filePenyesuaian.getAbsolutePath());
                
                
            }            
            
        }        

        
        
    } 
   @Override
    public void aksiBtnPathInputCvOutlet() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File CVOUTLET.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputCvOutlet().setText(theFilePath);
                }               
            }              
    }
    @Override
    public void aksiBtnPathInputJHeader() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JHEADER.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputJHeader().setText(theFilePath);
                }               
            }              
    }
   
   @Override
    public void aksiPathInputJPcode() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JPCODE.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputJPcode().setText(theFilePath);
                }               
            }              
    }
   @Override
    public void aksiBtnPathInputJTprb() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JTPRB.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputJTprb().setText(theFilePath);
                }               
            }              
    }
   @Override
     public void aksiBtnPathInputJTpru() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JTPRU.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputJTpru().setText(theFilePath);
                }               
            }              
    }
   @Override
     public void aksiBtnPathInputMaster() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File MASTER.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputMaster().setText(theFilePath);
                }               
            }              
    }
   @Override
     public void aksiBtnPathInputOutlet() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File OUTLET.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputOutlet().setText(theFilePath);
                }               
            }              
    }
   @Override
    public void aksiBtnPathInputSalesman() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File SALES.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputSalesman().setText(theFilePath);
                }               
            }              
    }
    //Tambahan Btn Path Input
    @Override
     public void aksiBtnPathInputBarangDatang(){
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File Barang Datang.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputBarangDatang().setText(theFilePath);
                }               
            }              
     }        
    @Override
     public void aksiBtnPathInputReturKePabrik(){
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File SALES.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputReturKePabrik().setText(theFilePath);
                }               
            }              
     }
    @Override
     public void aksiBtnPathInputStokAdjustment(){
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File SALES.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputStokAdjustment().setText(theFilePath);
                }               
            }              
     }
   
    /* ------Retrieve------- */
   @Override
    public void aksiBtnRetrieveInputCvOutlet() {
    }
   @Override
    public void aksiBtnRetrieveInputJHeader() {
    }
   @Override
    public void aksiBtnRetrieveInputJPcode() {
    }
   @Override
     public void aksiBtnRetrieveInputJTprb() {
    }
   @Override
     public void aksiBtnRetrieveInputJTpru() {
    }
   @Override
    public void aksiBtnRetrieveInputMaster() {
    }
   @Override
     public void aksiBtnRetrieveInputOutlet() {
    }
   @Override
    public void aksiBtnRetrieveInputStock() {
    }
    @Override
    public void aksiBtnRetrieveInputSalesman() {
    }
   
    @Override
   public void aksiBtnRetrieveInputAll() {
        
   }
    @Override
   public void aksiBtnPathInputClearAll() {
        if (JOptionPane.showConfirmDialog(this,"Anda Yakin Akan Hapus Semua Data?"
                + "\n\nPERHATIAN!!.. \nDATA YANG PERNAH DI UPLOAD AKAN DI HAPUS SEMUA", 
                "Konfirmasi Hapus", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
            
            resetTeksInputBackground();
            
            //1. Hapus semua data input dan output
                //dimulai dari Child Dulu
                jtprbDao.deleteAll();
                jtpruDao.deleteAll();
                jpcodeDao.deleteAll();
                jheaderDao.deleteAll();

                cvOutletDao.deleteAll();
                outletDao.deleteAll();

                salesmanDao.deleteAll();
                
                stockDao.deleteAll();
                produkDao.deleteAll();
                //TIDAK PERLU -> TERMASUK FILE PARAMETER SYSTEM
                //mapTipeOutletDao.deleteAll();

                tblSalesIdDao.deleteAll();
                tblStockIdDao.deleteAll();
                tblClientIdDao.deleteAll();
                tblSoIdDao.deleteAll();
            
            //2. Reload Semua table
            aksiBtnPathInputReloadAll();
            
            JOptionPane.showMessageDialog(this, "Semua data berhasil dihapus!! \n Kecuali Data Parameter Sistem", 
                    "Info..", JOptionPane.INFORMATION_MESSAGE);
            
        }
   }
    @Override
   public void aksiBtnPathInputReloadAll() {
        aksiReloadAll();
   }
    public void aksiReloadAll(){
        aksiReloadInput();
        aksiReloadOutput();
        aksiReloadKonfig();
        
        aksiReloadTabelTabel();
        aksiReloadMasterSAP();
    }
    
    public void aksiReloadTabelTabel(){
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
    public void aksiReloadMasterSAP(){
        
        aksiBtnTMasterProductReload();
        aksiBtnTMasterOutletReload();
        aksiBtnTMasterSalesmanReload();
    }
        
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
    
    public void aksiReloadOutput(){
        //Reload Output KEK
        aksiBtnOutputTAdjstkReload();
        aksiBtnOutputTDatdprReload();
        aksiBtnOutputTDatdslReload();
        aksiBtnOutputTDatdsrReload();
        aksiBtnOutputTDatsriReload();
        aksiBtnOutputTOutletReload();
        aksiBtnOutputTSalesmanReload();
        aksiBtnOutputTStokReload();
        //Reload Output Baygon
        /*
        aksiBtnOutputClientReload();
        aksiBtnOutputSalesOrderReload();
        aksiBtnOutputSalesReload();
        aksiBtnOutputStockReload();
        */ 
    }
    public void aksiReloadKonfig() {
        aksiBtnGeneralSettingReload();
        aksiBtnMapTipeOutletReload();
    }
 
 
    public void aksiBtnKirimByEmail() {
        
    }

   
}
