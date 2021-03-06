package org.dimas.bridging.export;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.spring.hibernate.dao.JHeaderDaoInter;
import org.config.spring.hibernate.dao.JPcodeDaoInter;
import org.config.spring.hibernate.dao.JTprbDaoInter;
import org.config.spring.hibernate.dao.JTpruDaoInter;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.dao.TblSalesIdDaoInter;
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.JTpru;
import org.config.spring.hibernate.model.TblSalesId;
import org.config.spring.hibernate.model.TblSalesIdPK;
import org.config.spring.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

public class ExportSales {
    ApplicationContext appContext;
    JHeaderDaoInter jheaderDao;
    JPcodeDaoInter jpcodeDao;
    JTprbDaoInter jtprbDao;
    JTpruDaoInter jtpruDao;
    
    TblSalesIdDaoInter tblSalesIdDao;
    
    SysvarDaoInter sysvarDao;
    
    public ExportSales() {
        initialisasi();
    }
  
    void initialisasi(){
            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            jheaderDao = (JHeaderDaoInter) appContext.getBean("JHeaderDaoBean");
            jpcodeDao = (JPcodeDaoInter) appContext.getBean("JPcodeDaoBean");
            jtprbDao = (JTprbDaoInter) appContext.getBean("JTprbDaoBean");
            jtpruDao = (JTpruDaoInter) appContext.getBean("JTpruDaoBean");

            tblSalesIdDao = (TblSalesIdDaoInter) appContext.getBean("TblSalesIdDaoBean");
            
            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    }
    
    public List<TblSalesId> ExportToCsvFromListToFile(String filePathDestination, List<JHeader> lst) {
        List<TblSalesId> list = new ArrayList<>();
        FileWriter fileWriter = null;
        try {
            File filePath = new File(filePathDestination);
            fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            //Header
            printWriter.println("RecordType;DistributorCode;InvoiceNumber;Date;SCJProductCode;DistributorProductCode;"
                    + "ProductDescription;SalesmanCode;SalesmanName;WarehouseCode;WarehouseName;OutletTypeCode;"
                    + "OutletTypeDesc;Clientcode;Clientname;City;DeliveryAddress;Qty;NetValue;GrossValue;Fraction;"
                    + "EANCode;ZipCode;ReservedField2;ReservedField3");
            String recordType=sysvarDao.findById("_REC_SLS").getNilaiString1();
            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();
            String whCode = sysvarDao.findById("_WH_CODE").getNilaiString1();
            String whDesc = sysvarDao.findById("_WH_DESC").getNilaiString1();
            
            //List<Outlet> lst = outletDao.findAll();

            for (JHeader itm: lst) {
                List<JPcode> listJPcode = new ArrayList<>(itm.getJpcodeSet());
                for (JPcode itmJPcode:listJPcode) {
                    TblSalesId item = new TblSalesId();
                    TblSalesIdPK itemPK = new TblSalesIdPK();
                    //1. RecordType;
                    printWriter.print(recordType + ";");
                    item.setRecordType(recordType);
                    //2. DistributorCode;
                    printWriter.print(distCode + ";");
                    item.setDistributorCode(distCode);                    
                    //3.InvoiceNumber; //COMPOSITE KEY
                    printWriter.print(itmJPcode.getJheader().getIdOrder() + ";");
                    itemPK.setInvoiceNumber(itmJPcode.getJheader().getIdOrder());
                    //4. Date;
                    printWriter.print(itmJPcode.getJheader().getTanggal() + ";");
                    item.setTanggal(itmJPcode.getJheader().getTanggal());
                    //5. SCJProductCode; //COMPOSITE KEY
                    printWriter.print(itmJPcode.getJpcodePK().getPcode() + ";");
                    item.setScjProductCode(itmJPcode.getJpcodePK().getPcode());
                    //6. DistributorProductCode;
                    printWriter.print(itmJPcode.getJpcodePK().getPcode() + ";");
                    itemPK.setDistributorProductCode(itmJPcode.getJpcodePK().getPcode());                    
                    //7. ProductDescription;
                    printWriter.print(itmJPcode.getProduk().getNamaBrg() + ";");
                    item.setProductDescription(itmJPcode.getProduk().getNamaBrg());
                    
                    /*
                    //8. SalesmanCode;
                    printWriter.print(itmJPcode.getJheader().getSalesman2().getSalesman() + ";");
                    item.setSalesmanCode(itmJPcode.getJheader().getSalesman2().getSalesman());
                    //9. SalesmanName;
                    printWriter.print(itmJPcode.getJheader().getSalesman2().getNamaSls() + ";");
                    item.setSalesmanName(itmJPcode.getJheader().getSalesman2().getNamaSls());
                    */ 
                    
                    //10. WarehouseCode;
                    printWriter.print(whCode + ";");
                    item.setWarehouseCode(whCode);
                    //11. WarehouseName;
                    printWriter.print(whDesc + ";");
                    item.setWarehouseName(whDesc);

                    //12. OutletTypeCode;
                    /*
                    printWriter.print(itmJPcode.getJheader().getMapTipeOutlet().getTipeOutlet() + ";");
                    item.setOutletTypeCode(itmJPcode.getJheader().getMapTipeOutlet().getTipeOutlet());
                    //13. OutletTypeDesc;
                    printWriter.print(itmJPcode.getJheader().getMapTipeOutlet().getDeskripsi() + ";");
                    item.setOutletTypeDesc(itmJPcode.getJheader().getMapTipeOutlet().getDeskripsi());
 
                    //14. Clientcode;
                    printWriter.print(itmJPcode.getJheader().getOutlet2().getOutlet() + ";");
                    item.setClientCode(itmJPcode.getJheader().getOutlet2().getOutlet());
                    //15. Clientname;
                    printWriter.print(itmJPcode.getJheader().getOutlet2().getNama() + ";");
                    item.setClientName(itmJPcode.getJheader().getOutlet2().getNama().replaceAll(";", " "));
                    //16. City;
                    printWriter.print(itmJPcode.getJheader().getOutlet2().getKotaToko() + ";");
                    item.setCity(itmJPcode.getJheader().getOutlet2().getKotaToko());
                    //17. DeliveryAddress;
                    printWriter.print(itmJPcode.getJheader().getOutlet2().getAlm1Toko() + ";");
                    item.setDeliveryAddress(itmJPcode.getJheader().getOutlet2().getAlm1Toko().replace(";", " "));
                    */
                    //18. Qty;
                    //Revisi tanggal 4 juli 2013 tidak kelebihan (;)
                    printWriter.print(itmJPcode.getQtyInSat() + ";");
                    item.setQty(itmJPcode.getQtyInSat());
                    
                    //19. NetValue; 
                    //Harga Net = Gross -PPN -DiskonUang -DiskonBarang
                    //Actual : Gross -PPN -DiskonUang -DiskonBarang
                    int diskonBarang =0;                    
                    List<JTprb> listJTprb = jtprbDao.findAllByIdOrderAndPcode(itmJPcode.getJpcodePK().getIdOrder(), itmJPcode.getJpcodePK().getPcode());;
                    for (JTprb itemJTprb: listJTprb) {
                        diskonBarang += itemJTprb.getHargaNoPpn();
                    }                     
                    int diskonUang = 0;
                    
                    List<JTpru> listJTpru = jtpruDao.findAllByIdOrderAndPcode(itmJPcode.getJpcodePK().getIdOrder(), itmJPcode.getJpcodePK().getPcode());
                    for (JTpru itemJTpru: listJTpru) {
                        diskonUang += itemJTpru.getHargaNoPpn();
                    }
                           
                    int netSales = itmJPcode.getHargaNoPpn() - diskonBarang - diskonUang;
                    Double doubleNetsales = Double.valueOf(String.valueOf(netSales));
                    
                    printWriter.print(doubleNetsales + ";");
                    //printWriter.print("Net Value;");
                    item.setNetValue(doubleNetsales);
                    
                    //20. GrossValue;   
                    //Qty * Harga = Gross -PPN ?
                    //Actual = Harga + PPn
                    Double doubleHargaNoPpn = Double.valueOf(String.valueOf(itmJPcode.getHargaNoPpn()));
                    Double grossValueFromNoPpn =  doubleHargaNoPpn + (doubleHargaNoPpn * 0.1) ;
                    String strGrossValueFromNoPpn = String.valueOf(grossValueFromNoPpn);
                    
                    printWriter.print(strGrossValueFromNoPpn + ";");
                    //printWriter.print("Gross Value;");
                    item.setGrossValue(grossValueFromNoPpn);                
                    
                    //21. Fraction;
                    //int isiPerKarton = (itm.getConvfact1() *12) + item.getConvfact2(); 
                    int isiPerKarton = itmJPcode.getProduk().getConvFact1() * 12 + itmJPcode.getProduk().getConvFact2();                    
                    printWriter.print(isiPerKarton + ";");
                    item.setFraction(isiPerKarton);
                    //22. EANCode;
                    printWriter.print(";");
                    item.setEanCode("");
                    //23. ZipCode;
                    printWriter.print(";");
                    item.setZipCode("");
                    //24. ReservedField2;
                    printWriter.print(";");
                    item.setReserverdField2("");
                    //25. ReservedField3
                    //Terakihr tidak usah titik koma (;) revisi tanggal 4 Juli 2013
                    printWriter.print("");
                    item.setReserverdField3("");
                    
                    item.setTblSalesIdPK(itemPK);
                    printWriter.println();
                    list.add(item);
                    
                }
            }
            printWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportSales.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(ExportSales.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    
    public int ExportToCsvFromDBToFile(String filePathDestination) {
        try {
            List<JHeader> lst = new ArrayList<>();
            
            ExportToCsvFromListToFile(filePathDestination, lst);
        } catch (Exception ex) {
        }        
        return 0;        
    }
    
    public int ExportToCsvFromFileToDB(String filePathSource, String filePathDestination) throws FileNotFoundException{
        File filePath = new File(filePathSource);
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        return 0;
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException{
        ExportSales test = new ExportSales();
        //test.ExportToCsvFromDBToFile("E:/Client_ID.csv");
        test.ExportToCsvFromDBToFile("/home/yhawin/Dimas/Sales_ID.CSV" );                
    }

    
}
