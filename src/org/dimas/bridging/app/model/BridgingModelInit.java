/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.app.model;

import java.awt.event.ActionEvent;
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
import org.config.spring.hibernate.dao.TMasterOutletDaoInter;
import org.config.spring.hibernate.dao.TMasterProductDaoInter;
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
import org.config.spring.hibernate.dao.pokari.ArCustomerDao;
import org.config.spring.hibernate.dao.pokari.CanDDeliveryOrderDao;
import org.config.spring.hibernate.dao.pokari.CanDDeliveryOrderItemDetailDao;
import org.config.spring.hibernate.dao.pokari.CanDDeliveryOrderItemDiscDao;
import org.config.spring.hibernate.dao.pokari.CustomerGroupDao;
import org.config.spring.hibernate.dao.pokari.CustomerHirarchyDao;
import org.config.spring.hibernate.dao.pokari.GroupSalesDao;
import org.config.spring.hibernate.dao.pokari.MappingProductDao;
import org.config.spring.hibernate.dao.pokari.OutputArCustomerDao;
import org.config.spring.hibernate.dao.pokari.OutputCanDDeliveryOrderDao;
import org.config.spring.hibernate.dao.pokari.OutputCanDDeliveryOrderItemDetailDao;
import org.config.spring.hibernate.dao.pokari.OutputCanDDeliveryOrderItemDiscDao;
import org.config.spring.hibernate.dao.pokari.OutputSpEmployeeDao;
import org.config.spring.hibernate.dao.pokari.OutputSpEmployeeTargetDao;
import org.config.spring.hibernate.dao.pokari.OutputSpEmployeeTargetItemDetailDao;
import org.config.spring.hibernate.dao.pokari.PokariProductDao;
import org.config.spring.hibernate.dao.pokari.ProductBrandDao;
import org.config.spring.hibernate.dao.pokari.SalesTerritoryDao;
import org.config.spring.hibernate.dao.pokari.SpEmployeeDao;
import org.config.spring.hibernate.dao.pokari.SpEmployeeTargetDao;
import org.config.spring.hibernate.dao.pokari.SpEmployeeTargetItemDetailDao;
import org.config.spring.hibernate.dao.pokari.TMasterProductPokariDao;
import org.config.spring.hibernate.dao.pokari.TeamSalesDao;
import org.config.spring.hibernate.dao.pokari.TypeSalesDao;
import org.config.spring.hibernate.dao.pokari.WorkplaceDao;
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
import org.config.spring.hibernate.model.TAdjstk;
import org.config.spring.hibernate.model.TDatdpr;
import org.config.spring.hibernate.model.TDatdsl;
import org.config.spring.hibernate.model.TDatdsr;
import org.config.spring.hibernate.model.TDatsri;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.config.spring.hibernate.model.TMasterProduct;
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
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.config.spring.hibernate.model.pokari.CanDDeliveryOrder;
import org.config.spring.hibernate.model.pokari.CanDDeliveryOrderItemDetail;
import org.config.spring.hibernate.model.pokari.CanDDeliveryOrderItemDetailPK;
import org.config.spring.hibernate.model.pokari.CanDDeliveryOrderItemDisc;
import org.config.spring.hibernate.model.pokari.CanDDeliveryOrderItemDiscPK;
import org.config.spring.hibernate.model.pokari.CustomerGroup;
import org.config.spring.hibernate.model.pokari.CustomerHirarchy;
import org.config.spring.hibernate.model.pokari.GroupSales;
import org.config.spring.hibernate.model.pokari.MappingProduct;
import org.config.spring.hibernate.model.pokari.OutputArCustomer;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrder;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDetail;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDetailPK;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDisc;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDiscPK;
import org.config.spring.hibernate.model.pokari.OutputSpEmployee;
import org.config.spring.hibernate.model.pokari.OutputSpEmployeeTarget;
import org.config.spring.hibernate.model.pokari.OutputSpEmployeeTargetItemDetail;
import org.config.spring.hibernate.model.pokari.OutputSpEmployeeTargetItemDetailPK;
import org.config.spring.hibernate.model.pokari.OutputSpEmployeeTargetPK;
import org.config.spring.hibernate.model.pokari.PokariProduct;
import org.config.spring.hibernate.model.pokari.ProductBrand;
import org.config.spring.hibernate.model.pokari.SalesTerritory;
import org.config.spring.hibernate.model.pokari.SpEmployee;
import org.config.spring.hibernate.model.pokari.SpEmployeeTarget;
import org.config.spring.hibernate.model.pokari.SpEmployeeTargetItemDetail;
import org.config.spring.hibernate.model.pokari.SpEmployeeTargetItemDetailPK;
import org.config.spring.hibernate.model.pokari.SpEmployeeTargetPK;
import org.config.spring.hibernate.model.pokari.TMasterProductPokari;
import org.config.spring.hibernate.model.pokari.TeamSales;
import org.config.spring.hibernate.model.pokari.TypeSales;
import org.config.spring.hibernate.model.pokari.Vehicle;
import org.config.spring.hibernate.model.pokari.WorkPlace;
import org.config.spring.hibernate.model.tablemodel.GenericTableModel;
import org.config.spring.hibernate.model.tablemodel.OutputSpEmployeeTargetTableModel;
import org.config.spring.hibernate.model.tablemodel.SpEmployeeTargetTableModel;
import org.config.spring.provider.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */

public class BridgingModelInit {
    protected static final Logger logger = LoggerFactory.getLogger(BridgingModelInit.class);
    
    //MODEL POKARI
    public ArCustomer arCustomerSelected =  new ArCustomer();
    public CanDDeliveryOrder canDDeliveryOrderSelected = new CanDDeliveryOrder();
    public CanDDeliveryOrderItemDetail canDDeliveryOrderItemDetailSelected = new CanDDeliveryOrderItemDetail();
    public CanDDeliveryOrderItemDetailPK canDDeliveryOrderItemDetailPKSelected = new CanDDeliveryOrderItemDetailPK();
    public CanDDeliveryOrderItemDisc canDDeliveryOrderItemDiscSelected = new CanDDeliveryOrderItemDisc();
    public CanDDeliveryOrderItemDiscPK canDDeliveryOrderItemDiscPKSelected = new CanDDeliveryOrderItemDiscPK();
    public CustomerGroup customerGroupSelected = new CustomerGroup();
    public CustomerHirarchy customerHirarchySelected = new CustomerHirarchy();
    public GroupSales groupSalesSelected = new GroupSales();
    public MappingProduct mappingProductSelected = new MappingProduct();
    public OutputArCustomer outputArCustomerSelected = new OutputArCustomer();
    public OutputCanDDeliveryOrder outputCanDDeliveryOrderSelected = new OutputCanDDeliveryOrder();
    public OutputCanDDeliveryOrderItemDetail outputCanDDeliveryOrderItemDetailSelected = new OutputCanDDeliveryOrderItemDetail();
    public OutputCanDDeliveryOrderItemDetailPK outputCanDDeliveryOrderItemDetailPKSelected = new OutputCanDDeliveryOrderItemDetailPK();
    public OutputCanDDeliveryOrderItemDisc outputCanDDeliveryOrderItemDiscSelected = new OutputCanDDeliveryOrderItemDisc();
    public OutputCanDDeliveryOrderItemDiscPK outputCanDDeliveryOrderItemDiscPKSelected = new OutputCanDDeliveryOrderItemDiscPK();
    public OutputSpEmployee outputSpEmployeeSelected = new OutputSpEmployee();
    public OutputSpEmployeeTarget outputSpEmployeeTargetSelected = new OutputSpEmployeeTarget();
    public OutputSpEmployeeTargetItemDetail outpustSpEmployeeTargetItemDetailSelected = new OutputSpEmployeeTargetItemDetail();
    public OutputSpEmployeeTargetItemDetailPK outpustSpEmployeeTargetItemDetailPKSelected = new OutputSpEmployeeTargetItemDetailPK();
    public OutputSpEmployeeTargetPK outputSpEmployeeTargetPKSelected = new OutputSpEmployeeTargetPK();
    public PokariProduct pokariProductSelected = new PokariProduct();
    public ProductBrand productBrandSelected = new ProductBrand();
    public SalesTerritory salesTerryTorySelected = new SalesTerritory();
    public SpEmployee spEmployeeSelected = new SpEmployee();
    public SpEmployeeTarget spEmployeeTargetSelected = new SpEmployeeTarget();
    public SpEmployeeTargetPK spEmployeeTargetPKSelected = new SpEmployeeTargetPK();
    public SpEmployeeTargetItemDetail spEmployeeTargetItemDetailSelected = new SpEmployeeTargetItemDetail();
    public SpEmployeeTargetItemDetailPK spEmployeeTargetItemDetailPKSelected = new SpEmployeeTargetItemDetailPK();
    public TMasterProductPokari tMasterProductPokariSelected = new TMasterProductPokari();    
    public TeamSales teamSalesSelected = new TeamSales();
    public TypeSales typeSalesSelected = new TypeSales();
    public Vehicle vehicleSelected = new Vehicle();
    public WorkPlace workplaceSelected = new WorkPlace();
    
    protected String principal = "";
    
    
    
    /**
     * KEK
     * UNTUK EFISIENSI: APAKAH SUDAH PERNAH MAPPING MASTER KE MEMORY APA BELUM
     */
    protected Boolean isLoadTMasterProductToMem=false;
    protected Boolean isLoadTMasterProductPokariToMem=false;
    protected Boolean isLoadTMasterOutletToMem=false;
    protected Boolean isLoadTMasterSalesmanToMem=false;
    /**
     * POKARI
     * UNTUK EFISIENSI: APAKAH SUDAH PERNAH MAPPING MASTER KE MEMORY APA BELUM
     */
    protected Boolean isLoadMappingProductToMem=false;
    protected Boolean isLoadMappingArCustomerToMem=false;
    protected Boolean isLoadMappingSpEmployeeToMem=false;
    
    
    ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
    ApplicationContext appContextMem = ApplicationContextProvider.getInstance().getApplicationContextMem();
    
    Boolean databaseMode = false;
    
    public SysvarDaoInter sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    
    public ProdukDaoInter produkDao =  (ProdukDaoInter) appContext.getBean("ProdukDaoBean");
    public StockDaoInter stockDao = (StockDaoInter) appContext.getBean("StockDaoBean");
    public OutletDaoInter outletDao = (OutletDaoInter) appContext.getBean("OutletDaoBean");
    public CvOutletDaoInter cvOutletDao = (CvOutletDaoInter) appContext.getBean("CvOutletDaoBean");
    public SalesmanDaoInter salesmanDao = (SalesmanDaoInter) appContext.getBean("SalesmanDaoBean");
    public JHeaderDaoInter  jheaderDao = (JHeaderDaoInter) appContext.getBean("JHeaderDaoBean");
    public JPcodeDaoInter jpcodeDao = (JPcodeDaoInter) appContext.getBean("JPcodeDaoBean");
    public JTprbDaoInter jtprbDao = (JTprbDaoInter) appContext.getBean("JTprbDaoBean");
    public JTpruDaoInter jtpruDao = (JTpruDaoInter) appContext.getBean("JTpruDaoBean");
    public MapTipeOutletDaoInter mapTipeOutletDao = (MapTipeOutletDaoInter) appContext.getBean("MapTipeOutletDaoBean");
    //Tambahan Input untuk KEK
    public ScyBDItemDaoInter scyBDItemDao = (ScyBDItemDaoInter) appContext.getBean("ScyBDItemDaoBean");
    public ScyPenyesuaianItemDaoInter scyPenyesuaianItemDao = (ScyPenyesuaianItemDaoInter) appContext.getBean("ScyPenyesuaianItemDaoBean");
    public ScyReturPabrikItemDaoInter scyReturPabriItemkDao = (ScyReturPabrikItemDaoInter) appContext.getBean("ScyReturPabrikDaoBean");
    //Output Baygon
    public TblSalesIdDaoInter tblSalesIdDao = (TblSalesIdDaoInter) appContext.getBean("TblSalesIdDaoBean");
    public TblStockIdDaoInter tblStockIdDao = (TblStockIdDaoInter) appContext.getBean("TblStockIdDaoBean");
    public TblClientIdDaoInter tblClientIdDao = (TblClientIdDaoInter) appContext.getBean("TblClientIdDaoBean");
    public TblSoIdDaoInter tblSoIdDao = (TblSoIdDaoInter) appContext.getBean("TblSoIdDaoBean");
   //Memory HSQL
    public ProdukDaoInter produkDaoMem =  (ProdukDaoInter) appContextMem.getBean("ProdukDaoBean");
    public StockDaoInter stockDaoMem = (StockDaoInter) appContextMem.getBean("StockDaoBean");
    public OutletDaoInter outletDaoMem = (OutletDaoInter) appContextMem.getBean("OutletDaoBean");
    public CvOutletDaoInter cvOutletDaoMem = (CvOutletDaoInter) appContextMem.getBean("CvOutletDaoBean");
    public SalesmanDaoInter salesmanDaoMem = (SalesmanDaoInter) appContextMem.getBean("SalesmanDaoBean");
    
    public JHeaderDaoInter  jheaderDaoMem = (JHeaderDaoInter) appContextMem.getBean("JHeaderDaoBean");
    public JPcodeDaoInter jpcodeDaoMem = (JPcodeDaoInter) appContextMem.getBean("JPcodeDaoBean");
    public JTprbDaoInter jtprbDaoMem = (JTprbDaoInter) appContextMem.getBean("JTprbDaoBean");
    public JTpruDaoInter jtpruDaoMem = (JTpruDaoInter) appContextMem.getBean("JTpruDaoBean");
    public MapTipeOutletDaoInter mapTipeOutletDaoMem = (MapTipeOutletDaoInter) appContextMem.getBean("MapTipeOutletDaoBean");
    //Tambahan Input untuk KEK
    public ScyBDItemDaoInter scyBDItemDaoMem = (ScyBDItemDaoInter) appContextMem.getBean("ScyBDItemDaoBean");
    public ScyPenyesuaianItemDaoInter scyPenyesuaianItemDaoMem = (ScyPenyesuaianItemDaoInter) appContextMem.getBean("ScyPenyesuaianItemDaoBean");
    public ScyReturPabrikItemDaoInter scyReturPabriItemkDaoMem = (ScyReturPabrikItemDaoInter) appContextMem.getBean("ScyReturPabrikDaoBean");
    //Output Baygon
    public TblSalesIdDaoInter tblSalesIdDaoMem = (TblSalesIdDaoInter) appContextMem.getBean("TblSalesIdDaoBean");
    public TblStockIdDaoInter tblStockIdDaoMem = (TblStockIdDaoInter) appContextMem.getBean("TblStockIdDaoBean");
    public TblClientIdDaoInter tblClientIdDaoMem = (TblClientIdDaoInter) appContextMem.getBean("TblClientIdDaoBean");
    public TblSoIdDaoInter tblSoIdDaoMem = (TblSoIdDaoInter) appContextMem.getBean("TblSoIdDaoBean");
    //Tambahan File Input
    
    //Inisialisasi DaoTambahan
    //Tabel-Tabel
    public TabelKeyAccountDaoInter tabelKeyAccountDao = (TabelKeyAccountDaoInter) appContext.getBean("TabelKeyAccountDaoBean");
    public TabelOutletChainDaoInter tabelOutletChainDao = (TabelOutletChainDaoInter) appContext.getBean("TabelOutletChainDaoBean");
    public TabelOutletClassDaoInter tabelOutletClassDao = (TabelOutletClassDaoInter) appContext.getBean("TabelOutletClassDaoBean");
    public TabelOutletGroupDaoInter tabelOutletGroupDao = (TabelOutletGroupDaoInter) appContext.getBean("TabelOutletGroupDaoBean");
    public TabelOutletLocationDaoInter tabelOutletLocationDao = (TabelOutletLocationDaoInter) appContext.getBean("TabelOutletLocationDaoBean");
    public TabelOutletSizeDaoInter tabelOutletSizeDao = (TabelOutletSizeDaoInter) appContext.getBean("TabelOutletSizeDaoBean");
    public TabelOutletSubGroupDaoInter tabelOutletSubGroupDao = (TabelOutletSubGroupDaoInter) appContext.getBean("TabelOutletSubGroupDaoBean");
    public TabelOutletTypeDaoInter tabelOutletTypeDao = (TabelOutletTypeDaoInter) appContext.getBean("TabelOutletTypeDaoBean");
    public TabelOutletAreaDaoInter tabelOutletAreaDao = (TabelOutletAreaDaoInter) appContext.getBean("TabelOutletAreaDaoBean");
    
    public TabelProdBrandDaoInter tabelProdBrandDao = (TabelProdBrandDaoInter) appContext.getBean("TabelProdBrandDaoBean");
    public TabelProdCategoryDaoInter tabelProdCategoryDao = (TabelProdCategoryDaoInter) appContext.getBean("TabelProdCategoryDaoBean");
    public TabelProdDivisiDaoInter tabelProdDivisiDao = (TabelProdDivisiDaoInter) appContext.getBean("TabelProdDivisiDaoBean");
    public TabelProdSizeDaoInter tabelProdSizeDao = (TabelProdSizeDaoInter) appContext.getBean("TabelProdSizeDaoBean");
    public TabelProdSubBrandDaoInter tabelProdSubBrandDao = (TabelProdSubBrandDaoInter) appContext.getBean("TabelProdSubBrandDaoBean");
    public TabelProdSubCategoryDaoInter tabelProdSubCategoryDao = (TabelProdSubCategoryDaoInter) appContext.getBean("TabelProdSubCategoryDaoBean");
    public TabelProdVarianceDaoInter tabelProdVarianceDao = (TabelProdVarianceDaoInter) appContext.getBean("TabelProdVarianceDaoBean");    
    //Master Product, Outlet, Salesman
    public TMasterProductDaoInter tMasterProductDao = (TMasterProductDaoInter) appContext.getBean("TMasterProductDaoBean");
    public TMasterProductPokariDao tMasterProductPokariDao = (TMasterProductPokariDao) appContext.getBean("TMasterProductPokariDaoBean");

    public TMasterOutletDaoInter tMasterOutletDao = (TMasterOutletDaoInter) appContext.getBean("TMasterOutletDaoBean");
    public TMasterSalesmanDaoInter tMasterSalesmanDao = (TMasterSalesmanDaoInter) appContext.getBean("TMasterSalesmanDaoBean");

    //Tabel-Tabel KEK
    public TabelKeyAccountDaoInter tabelKeyAccountDaoMem = (TabelKeyAccountDaoInter) appContextMem.getBean("TabelKeyAccountDaoBean");
    public TabelOutletChainDaoInter tabelOutletChainDaoMem = (TabelOutletChainDaoInter) appContextMem.getBean("TabelOutletChainDaoBean");
    public TabelOutletClassDaoInter tabelOutletClassDaoMem = (TabelOutletClassDaoInter) appContextMem.getBean("TabelOutletClassDaoBean");
    public TabelOutletGroupDaoInter tabelOutletGroupDaoMem = (TabelOutletGroupDaoInter) appContextMem.getBean("TabelOutletGroupDaoBean");
    public TabelOutletLocationDaoInter tabelOutletLocationDaoMem = (TabelOutletLocationDaoInter) appContextMem.getBean("TabelOutletLocationDaoBean");
    public TabelOutletSizeDaoInter tabelOutletSizeDaoMem = (TabelOutletSizeDaoInter) appContextMem.getBean("TabelOutletSizeDaoBean");
    public TabelOutletSubGroupDaoInter tabelOutletSubGroupDaoMem = (TabelOutletSubGroupDaoInter) appContextMem.getBean("TabelOutletSubGroupDaoBean");
    public TabelOutletTypeDaoInter tabelOutletTypeDaoMem = (TabelOutletTypeDaoInter) appContextMem.getBean("TabelOutletTypeDaoBean");
    public TabelOutletAreaDaoInter tabelOutletAreaDaoMem = (TabelOutletAreaDaoInter) appContextMem.getBean("TabelOutletAreaDaoBean");
    
    public TabelProdBrandDaoInter tabelProdBrandDaoMem = (TabelProdBrandDaoInter) appContextMem.getBean("TabelProdBrandDaoBean");
    public TabelProdCategoryDaoInter tabelProdCategoryDaoMem = (TabelProdCategoryDaoInter) appContextMem.getBean("TabelProdCategoryDaoBean");
    public TabelProdDivisiDaoInter tabelProdDivisiDaoMem = (TabelProdDivisiDaoInter) appContextMem.getBean("TabelProdDivisiDaoBean");
    public TabelProdSizeDaoInter tabelProdSizeDaoMem = (TabelProdSizeDaoInter) appContextMem.getBean("TabelProdSizeDaoBean");
    public TabelProdSubBrandDaoInter tabelProdSubBrandDaoMem = (TabelProdSubBrandDaoInter) appContextMem.getBean("TabelProdSubBrandDaoBean");
    public TabelProdSubCategoryDaoInter tabelProdSubCategoryDaoMem = (TabelProdSubCategoryDaoInter) appContextMem.getBean("TabelProdSubCategoryDaoBean");
    TabelProdVarianceDaoInter tabelProdVarianceDaoMem = (TabelProdVarianceDaoInter) appContextMem.getBean("TabelProdVarianceDaoBean");    
    //Master Product, Outlet, Salesman Mapping KEK
   public TMasterProductDaoInter tMasterProductDaoMem = (TMasterProductDaoInter) appContextMem.getBean("TMasterProductDaoBean");
   public TMasterProductPokariDao tMasterProductPokariDaoMem = (TMasterProductPokariDao) appContextMem.getBean("TMasterProductPokariDaoBean");
   
   public TMasterOutletDaoInter tMasterOutletDaoMem = (TMasterOutletDaoInter) appContextMem.getBean("TMasterOutletDaoBean");
   public TMasterSalesmanDaoInter tMasterSalesmanDaoMem = (TMasterSalesmanDaoInter) appContextMem.getBean("TMasterSalesmanDaoBean");
    
    //DAO untuk Output KEK  
   public TAdjstkDaoInter tAdjstkDao = (TAdjstkDaoInter) appContext.getBean("TAdjstkDaoBean");
   public TDatdprDaoInter tDatdprDao = (TDatdprDaoInter) appContext.getBean("TDatdprDaoBean");
   public TDatdslDaoInter tDatdslDao = (TDatdslDaoInter) appContext.getBean("TDatdslDaoBean");
   public TDatdsrDaoInter tDatdsrDao = (TDatdsrDaoInter) appContext.getBean("TDatdsrDaoBean");
   public TDatsriDaoInter tDatsriDao = (TDatsriDaoInter) appContext.getBean("TDatsriDaoBean");
   public TStokDaoInter tStokDao = (TStokDaoInter) appContext.getBean("TStokDaoBean");
    
   public TOutletDaoInter tOutletDao = (TOutletDaoInter) appContext.getBean("TOutletDaoBean");
   public TSalesmanDaoInter tSalesmanDao = (TSalesmanDaoInter) appContext.getBean("TSalesmanDaoBean");
            
            
            
    //DAO untuk Output KEK  Memori
   public TAdjstkDaoInter tAdjstkDaoMem = (TAdjstkDaoInter) appContextMem.getBean("TAdjstkDaoBean");
   public TDatdprDaoInter tDatdprDaoMem = (TDatdprDaoInter) appContextMem.getBean("TDatdprDaoBean");
   public TDatdslDaoInter tDatdslDaoMem = (TDatdslDaoInter) appContextMem.getBean("TDatdslDaoBean");
   public TDatdsrDaoInter tDatdsrDaoMem = (TDatdsrDaoInter) appContextMem.getBean("TDatdsrDaoBean");
   public TDatsriDaoInter tDatsriDaoMem = (TDatsriDaoInter) appContextMem.getBean("TDatsriDaoBean");
   public TStokDaoInter tStokDaoMem = (TStokDaoInter) appContextMem.getBean("TStokDaoBean");
    
   public TOutletDaoInter tOutletDaoMem = (TOutletDaoInter) appContextMem.getBean("TOutletDaoBean");
   public TSalesmanDaoInter tSalesmanDaoMem = (TSalesmanDaoInter) appContextMem.getBean("TSalesmanDaoBean");

    
   public GenericTableModel<Produk> tmProduk = null;
   public GenericTableModel<Stock> tmStock = null;
   public GenericTableModel<Outlet> tmOutlet = null;
   public GenericTableModel<CvOutlet> tmCvOutlet = null;
   public GenericTableModel<Salesman> tmSalesman = null;
   public GenericTableModel<JHeader> tmJHeader = null;
   public GenericTableModel<JPcode> tmJPcode = null;
   public GenericTableModel<JTprb> tmJTprb = null;
   public GenericTableModel<JTpru> tmJTpru = null;
   public GenericTableModel<MapTipeOutlet> tmMaptipeOutlet = null;
    //Tambahan Input untuk KEK
   public GenericTableModel<ScyBDItem> tmScyBDItem =null;
   public GenericTableModel<ScyPenyesuaianItem> tmScyPenyesuaianItem = null;
   public GenericTableModel<ScyReturPabrikItem> tmScyReturPabrikItem = null;
    //Output Untuk Baygon   
   public GenericTableModel<TblSalesId> tmTblSalesId = null;
   public GenericTableModel<TblClientId> tmTblClientId = null;
   public GenericTableModel<TblStockId> tmTblStockId = null;
   public GenericTableModel<TblSoId> tmTblSoId = null;

    //DynamicTableModel Tabel-tabel KEK
   public GenericTableModel<TabelKeyAccount> tmTabelKeyAccount = null;
   public GenericTableModel<TabelOutletChain> tmTabelOutletChain = null;
   public GenericTableModel<TabelOutletClass> tmTabelOutletClass = null;
   public GenericTableModel<TabelOutletGroup> tmTabelOutletGroup = null;
   public GenericTableModel<TabelOutletLocation> tmTabelOutletLocation = null;
   public GenericTableModel<TabelOutletSize> tmTabelOutletSize = null;
   public GenericTableModel<TabelOutletSubGroup> tmTabelOutletSubGroup = null;
   public GenericTableModel<TabelOutletType> tmTabelOutletType = null;
   public GenericTableModel<TabelProdBrand> tmTabelProdBrand = null;
   public GenericTableModel<TabelProdCategory> tmTabelProdCatetory = null;
   public GenericTableModel<TabelProdDivisi> tmTabelProdDivisi = null;
   public GenericTableModel<TabelProdSize> tmTabelProdSize = null;
   public GenericTableModel<TabelProdSubBrand> tmTabelProdSubBrand = null;
   public GenericTableModel<TabelProdSubCategory> tmTabelProdSubCategory = null;
   public GenericTableModel<TabelProdVariance> tmTabelProdVariance = null;
    //DynamicTableModel Master Product, Outlet,Salesman
   public GenericTableModel<TMasterProduct> tmTMasterProduct = null;
   public GenericTableModel<TMasterOutlet> tmTMasterOutlet = null;
   public GenericTableModel<TMasterSalesman> tmTMasterSalesman = null;
    //Tabel Model untuk Output >> Beda dengan Input Lho
   public GenericTableModel<TStok> tmOutputTStok=null;
   public GenericTableModel<TDatdsr> tmOutputTDatdsr=null;
   public GenericTableModel<TDatdsl> tmOutputTDatdsl=null;
   public GenericTableModel<TDatdpr> tmOutputTDatdpr=null;
   public GenericTableModel<TDatsri> tmOutputTDatsri=null;
   public GenericTableModel<TAdjstk> tmOutputTAdjstk=null;

   public GenericTableModel<TSalesman> tmOutputTSalesman=null;
   public GenericTableModel<TOutlet> tmOutputTOutlet=null;
    
   
   //DAO FOR POKARI
   public ArCustomerDao  arCustomerDao = (ArCustomerDao) appContext.getBean("ArCustomerDao");
   public CanDDeliveryOrderDao canDDeliveryOrderDao = (CanDDeliveryOrderDao) appContext.getBean("CanDDeliveryOrderDao");
   public CanDDeliveryOrderItemDetailDao  canDDeliveryOrderItemDetailDao = (CanDDeliveryOrderItemDetailDao) appContext.getBean("CanDDeliveryOrderItemDetailDao");
   public CanDDeliveryOrderItemDiscDao  canDDeliveryOrderItemDiscDao = (CanDDeliveryOrderItemDiscDao) appContext.getBean("CanDDeliveryOrderItemDiscDao");
   public MappingProductDao mappingProductDao = (MappingProductDao) appContext.getBean("MappingProductDao");
   public PokariProductDao pokariProductDao = (PokariProductDao) appContext.getBean("PokariProductDao");
   public SpEmployeeDao spEmployeeDao = (SpEmployeeDao) appContext.getBean("SpEmployeeDao");
   public SpEmployeeTargetDao  spEmployeeTargetDao = (SpEmployeeTargetDao) appContext.getBean("SpEmployeeTargetDao");
   public SpEmployeeTargetItemDetailDao  spEmployeeTargetItemDetailDao= (SpEmployeeTargetItemDetailDao) appContext.getBean("SpEmployeeTargetItemDetailDao");

   public CustomerGroupDao customerGroupDao = (CustomerGroupDao) appContext.getBean("CustomerGroupDao");
   public CustomerHirarchyDao customerHirarchyDao =  (CustomerHirarchyDao) appContext.getBean("CustomerHirarchyDao");
   public GroupSalesDao groupSalesDao = (GroupSalesDao) appContext.getBean("GroupSalesDao");
   public ProductBrandDao productBrandDao = (ProductBrandDao) appContext.getBean("ProductBrandDao");
   public SalesTerritoryDao salesTerritoryDao= (SalesTerritoryDao) appContext.getBean("SalesTerritoryDao");
   public TeamSalesDao teamSalesDao = (TeamSalesDao) appContext.getBean("TeamSalesDao");
   public TypeSalesDao typeSalesDao = (TypeSalesDao) appContext.getBean("TypeSalesDao");
   public WorkplaceDao workplaceDao = (WorkplaceDao) appContext.getBean("WorkplaceDao");
  
   //POKARI : OUTPUT
   public OutputArCustomerDao  outputArCustomerDao = (OutputArCustomerDao) appContext.getBean("OutputArCustomerDao");
   public OutputCanDDeliveryOrderDao outputCanDDeliveryOrderDao = (OutputCanDDeliveryOrderDao) appContext.getBean("OutputCanDDeliveryOrderDao");
   public OutputCanDDeliveryOrderItemDetailDao  outputCanDDeliveryOrderItemDetailDao = (OutputCanDDeliveryOrderItemDetailDao) appContext.getBean("OutputCanDDeliveryOrderItemDetailDao");
   public OutputCanDDeliveryOrderItemDiscDao  outputCanDDeliveryOrderItemDiscDao = (OutputCanDDeliveryOrderItemDiscDao) appContext.getBean("OutputCanDDeliveryOrderItemDiscDao");
   public OutputSpEmployeeDao outputSpEmployeeDao = (OutputSpEmployeeDao) appContext.getBean("OutputSpEmployeeDao");
   public OutputSpEmployeeTargetDao  outputSpEmployeeTargetDao = (OutputSpEmployeeTargetDao) appContext.getBean("OutputSpEmployeeTargetDao");
   public OutputSpEmployeeTargetItemDetailDao  outputSpEmployeeTargetItemDetailDao= (OutputSpEmployeeTargetItemDetailDao) appContext.getBean("OutputSpEmployeeTargetItemDetailDao");
   
   
//   //FOR MEMORY TRANSIENT
   public ArCustomerDao  arCustomerDaoMem = (ArCustomerDao) appContextMem.getBean("ArCustomerDao");
   public CanDDeliveryOrderDao canDDeliveryOrderDaoMem = (CanDDeliveryOrderDao) appContextMem.getBean("CanDDeliveryOrderDao");
   public CanDDeliveryOrderItemDetailDao  canDDeliveryOrderItemDetailDaoMem = (CanDDeliveryOrderItemDetailDao) appContextMem.getBean("CanDDeliveryOrderItemDetailDao");
   public CanDDeliveryOrderItemDiscDao  canDDeliveryOrderItemDiscDaoMem = (CanDDeliveryOrderItemDiscDao) appContextMem.getBean("CanDDeliveryOrderItemDiscDao");
   public MappingProductDao mappingProductDaoMem = (MappingProductDao) appContextMem.getBean("MappingProductDao");
   public PokariProductDao pokariProductDaoMem = (PokariProductDao) appContextMem.getBean("PokariProductDao");
   public SpEmployeeDao spEmployeeDaoMem = (SpEmployeeDao) appContextMem.getBean("SpEmployeeDao");
   public SpEmployeeTargetDao  spEmployeeTargetDaoMem = (SpEmployeeTargetDao) appContextMem.getBean("SpEmployeeTargetDao");
   public SpEmployeeTargetItemDetailDao  spEmployeeTargetItemDetailDaoMem = (SpEmployeeTargetItemDetailDao) appContextMem.getBean("SpEmployeeTargetItemDetailDao");

   public CustomerGroupDao customerGroupDaoMem = (CustomerGroupDao) appContextMem.getBean("CustomerGroupDao");
   public CustomerHirarchyDao customerHirarchyDaoMem =  (CustomerHirarchyDao) appContextMem.getBean("CustomerHirarchyDao");
   public GroupSalesDao groupSalesDaoMem = (GroupSalesDao) appContextMem.getBean("GroupSalesDao");
   public ProductBrandDao productBrandDaoMem = (ProductBrandDao) appContextMem.getBean("ProductBrandDao");
   public SalesTerritoryDao salesTerritoryDaoMem = (SalesTerritoryDao) appContextMem.getBean("SalesTerritoryDao");
   public TeamSalesDao teamSalesDaoMem = (TeamSalesDao) appContextMem.getBean("TeamSalesDao");
   public TypeSalesDao typeSalesDaoMem = (TypeSalesDao) appContextMem.getBean("TypeSalesDao");
   public WorkplaceDao workplaceDaoMem = (WorkplaceDao) appContextMem.getBean("WorkplaceDao");
   
   //POKARI : OUTPUT
   public OutputArCustomerDao  outputArCustomerDaoMem = (OutputArCustomerDao) appContextMem.getBean("OutputArCustomerDao");
   public OutputCanDDeliveryOrderDao outputCanDDeliveryOrderDaoMem = (OutputCanDDeliveryOrderDao) appContextMem.getBean("OutputCanDDeliveryOrderDao");
   public OutputCanDDeliveryOrderItemDetailDao  outputCanDDeliveryOrderItemDetailDaoMem = (OutputCanDDeliveryOrderItemDetailDao) appContextMem.getBean("OutputCanDDeliveryOrderItemDetailDao");
   public OutputCanDDeliveryOrderItemDiscDao  outputCanDDeliveryOrderItemDiscDaoMem = (OutputCanDDeliveryOrderItemDiscDao) appContextMem.getBean("OutputCanDDeliveryOrderItemDiscDao");
   public OutputSpEmployeeDao outputSpEmployeeDaoMem = (OutputSpEmployeeDao) appContextMem.getBean("OutputSpEmployeeDao");
   public OutputSpEmployeeTargetDao  outputSpEmployeeTargetDaoMem = (OutputSpEmployeeTargetDao) appContextMem.getBean("OutputSpEmployeeTargetDao");
   public OutputSpEmployeeTargetItemDetailDao  outputSpEmployeeTargetItemDetailDaoMem = (OutputSpEmployeeTargetItemDetailDao) appContextMem.getBean("OutputSpEmployeeTargetItemDetailDao");
   
   //Dynamic Table Model For Pokari
   public GenericTableModel<ArCustomer> tmArCustomer = null;
   public GenericTableModel<SpEmployee> tmSpEmployee = null;
   public GenericTableModel<SpEmployeeTarget> tmSpEmployeeTarget = null;
   public GenericTableModel<SpEmployeeTargetItemDetail> tmSpEmployeeTargetItemDetail = null;
   public GenericTableModel<CanDDeliveryOrder> tmCanDDeliveryOrder = null;
   public GenericTableModel<CanDDeliveryOrderItemDetail> tmCanDDeliveryOrderItemDetail = null;
   public GenericTableModel<CanDDeliveryOrderItemDisc> tmCanDDeliveryOrderItemDisc = null;
    //DynamicTableModel Master dan Tabel Tabel
   public GenericTableModel<ProductBrand> tmProductBrand = null;
   public GenericTableModel<CustomerHirarchy> tmCustomerHirarchy = null;
   public GenericTableModel<CustomerGroup> tmCustomerGroup = null;
   public GenericTableModel<SalesTerritory> tmSalesTerritory = null;
   public GenericTableModel<WorkPlace> tmWorkPlace = null;
   public GenericTableModel<TeamSales> tmTeamSales = null;
   public GenericTableModel<GroupSales> tmGroupSales = null;
   public GenericTableModel<TypeSales> tmTypeSales = null;
   
   public GenericTableModel<MappingProduct> tmMappingProduct = null;
   public GenericTableModel<PokariProduct> tmPokariProduct = null;
   /**
    * POKARI : OUTPUT TABLE MODEL
    */
   public GenericTableModel<OutputArCustomer> tmOutputArCustomer = null;
   public GenericTableModel<OutputSpEmployee> tmOutputSpEmployee = null;
   public GenericTableModel<OutputSpEmployeeTarget> tmOutputSpEmployeeTarget = null;
   public GenericTableModel<OutputSpEmployeeTargetItemDetail> tmOutputSpEmployeeTargetItemDetail = null;
   public GenericTableModel<OutputCanDDeliveryOrder> tmOutputCanDDeliveryOrder = null;
   public GenericTableModel<OutputCanDDeliveryOrderItemDetail> tmOutputCanDDeliveryOrderItemDetail = null;
   public GenericTableModel<OutputCanDDeliveryOrderItemDisc> tmOutputCanDDeliveryOrderItemDisc = null;
   
   public SpEmployeeTargetTableModel tmSpEmployeeTargetTableModel = null;
   public OutputSpEmployeeTargetTableModel tmOutputSpEmployeeTargetTableModel = null;
   
    //Nanti diganti
    public String currentPath = "/home/yhawin/Dimas/Input-File/";

    public void actionPerformed(ActionEvent e) {
    }
   
    
    public Boolean getDatabaseMode() {
        return databaseMode;
    }

    public void setDatabaseMode(Boolean databaseMode) {
        this.databaseMode = databaseMode;
    }

    public String getCurrentPath() {
        return currentPath;
    }

    public void setCurrentPath(String currentPath) {
        this.currentPath = currentPath;
    }

    public SysvarDaoInter getSysvarDao() {
        return sysvarDao;
    }

    public void setSysvarDao(SysvarDaoInter sysvarDao) {
        this.sysvarDao = sysvarDao;
    }

    public Boolean getIsLoadTMasterProductToMem() {
        return isLoadTMasterProductToMem;
    }

    public void setIsLoadTMasterProductToMem(Boolean isLoadTMasterProductToMem) {
        this.isLoadTMasterProductToMem = isLoadTMasterProductToMem;
    }

    public Boolean getIsLoadTMasterOutletToMem() {
        return isLoadTMasterOutletToMem;
    }

    public void setIsLoadTMasterOutletToMem(Boolean isLoadTMasterOutletToMem) {
        this.isLoadTMasterOutletToMem = isLoadTMasterOutletToMem;
    }

    public Boolean getIsLoadTMasterSalesmanToMem() {
        return isLoadTMasterSalesmanToMem;
    }

    public void setIsLoadTMasterSalesmanToMem(Boolean isLoadTMasterSalesmanToMem) {
        this.isLoadTMasterSalesmanToMem = isLoadTMasterSalesmanToMem;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public Boolean getIsLoadMappingProductToMem() {
        return isLoadMappingProductToMem;
    }

    public void setIsLoadMappingProductToMem(Boolean isLoadMappingProductToMem) {
        this.isLoadMappingProductToMem = isLoadMappingProductToMem;
    }

    public Boolean getIsLoadMappingArCustomerToMem() {
        return isLoadMappingArCustomerToMem;
    }

    public void setIsLoadMappingArCustomerToMem(Boolean isLoadMappingArCustomerToMem) {
        this.isLoadMappingArCustomerToMem = isLoadMappingArCustomerToMem;
    }

    public Boolean getIsLoadMappingSpEmployeeToMem() {
        return isLoadMappingSpEmployeeToMem;
    }

    public void setIsLoadMappingSpEmployeeToMem(Boolean isLoadMappingSpEmployeeToMem) {
        this.isLoadMappingSpEmployeeToMem = isLoadMappingSpEmployeeToMem;
    }
    
    
}
