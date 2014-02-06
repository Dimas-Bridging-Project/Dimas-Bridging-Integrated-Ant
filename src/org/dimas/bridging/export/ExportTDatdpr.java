/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.export;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.model.ScyBDItem;
import org.config.spring.hibernate.model.TDatdpr;
import org.config.spring.hibernate.model.TDatdprPK;
import org.config.spring.provider.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ExportTDatdpr {
    private static final Logger logger = LoggerFactory.getLogger(ExportTDatdpr.class);
    
    ApplicationContext appContext;
    SysvarDaoInter sysvarDao;

    public ExportTDatdpr() {
        initiates();
    }
    public void initiates(){
            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    }

    
    public List<TDatdpr> exportToCsvFromListToFile(String filePathDestination, Date tglTransaksi, List<ScyBDItem> lst){
        List<TDatdpr> list = new ArrayList<>();
        FileWriter fileWriter = null;
        logger.info("Starting exportTDatdpr");
        try {
            File filePath = new File(filePathDestination);
            fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            //Seragam Distributor Code Pake Parameter Sistem
            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();
            String distName = sysvarDao.findById("_DIST_NAME").getNilaiString1();

            //Header
            printWriter.println("disticode,transdate,transno,dono,dodate,itemcode,quantity,uom,unitprice,fbonus,skuqty"); 
            //System.out.print(lst.size());
            Locale localeId = new Locale("in", "ID"); //Localization Indonesian
            //String pattern = "EEEE, dd MMM yyyy"; // Jumat, 10 Sep 2013            
            String pattern = "dd-MM-yyyy"; // 10-09-2013            
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, localeId);
            
            for (ScyBDItem itm: lst) {
                //System.out.println(sdf.format(tglTransaksi) + " == " + sdf.format(itm.getStockPK().getTangalStock()));                
                if (sdf.format(tglTransaksi).equalsIgnoreCase(sdf.format(itm.getTglFaktur()))) {

                    //1. disticode,
                    printWriter.print("\"" + distCode + "\",");
                    //2. transdate,
                    Date tglFaktur = itm.getTglFaktur();
                    String strTglFaktur =sdf.format(tglFaktur);                
                    printWriter.print("" + strTglFaktur + ",");
                    //3. transno,
                    printWriter.print("\"" + itm.getNoFaktur() + "\",");
                    //4. dono,
                    printWriter.print("\"" + itm.getNoFaktur() + "\",");
                    //5. dodate,
                    printWriter.print("" + strTglFaktur + ",");
                    //6. itemcode,
                    printWriter.print("\"" + itm.gettMasterProduct().getPcodeSap() + "\",");
                    //7. quantity,
                    printWriter.print("" + itm.getJmlBarang() + ","); //Asumsi Dalam Karton
                    //8. uom,
                    printWriter.print("\"" + "KRT" + "\","); //Asumsi Dalam Karton
                    //9. unitprice,
                    printWriter.print("" + itm.getHrgBeli() + ",");
                    //10. fbonus,
                    //Bonus jika total rupiah di Scylla adalah 0
                    Boolean bolBonus = itm.gettMasterProduct().getBonus()!=null?itm.gettMasterProduct().getBonus():false;
                    Integer intBonus = bolBonus==true?1:0;
                    printWriter.print("" + intBonus + ","); 
                    ///11. skuqty                
                    printWriter.print("" + itm.getJmlBarangPcs() + "");

                    //TurunBaris
                    printWriter.println();

                    //Untuk Isi List
                    TDatdpr item = new TDatdpr();    
                    TDatdprPK tDatdprPK = new TDatdprPK();
                    tDatdprPK.setItemCode(itm.gettMasterProduct().getPcodeSap());
                    tDatdprPK.setTransNo(itm.getNoFaktur());
                    item.setTdatdprPK(tDatdprPK);
                    
                    item.setTransDate(itm.getTglFaktur());
                    item.setDistiCode(distCode);
                    item.setDono(itm.getNoFaktur());
                    item.setDoDate(itm.getTglFaktur());
                    
                    item.setQuantity(itm.getJmlBarang());
                    item.setSkuQty(itm.getJmlBarangPcs());
                    
                    item.setUnitPrice(itm.getHrgBeli());
                    
                    Boolean isBonus= intBonus==0? false:true;
                    item.setFbonus(isBonus);
                            
                    list.add(item);
                }
                
            }
            printWriter.close();
        } catch (IOException ex) {
            logger.error("FileWriter pada method exportToCsvFromListToFile", ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                logger.error("Finally FileWriter pada method exportToCsvFromListToFile", ex);
            }
        }
        return list;        
    }
    public int exportToCsvFromDbToFile(String filePathDestination){
    
        return 0;
    }
    public int exportToCsvFromFileToDb(String filePathSource, String filePathDestination){
        return 0;
    }
    
    
    public static void main(String [] args){
        ExportTDatdpr f = new ExportTDatdpr();
    
    }
    
}
