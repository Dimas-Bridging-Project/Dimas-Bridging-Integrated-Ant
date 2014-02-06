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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.model.TMasterSalesman;
import org.config.spring.hibernate.model.TSalesman;
import org.config.spring.provider.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ExportTSalesman {
    private static final Logger logger = LoggerFactory.getLogger(ExportTSalesman.class);
    
    ApplicationContext appContext;
    SysvarDaoInter sysvarDao;
    
    public ExportTSalesman(){
        initiates();
    }
    public void initiates(){
            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
           
    }
    public List<TSalesman> exportToCsvFromListToFile(String filePathDestination, Date tglTransaksi, List<TMasterSalesman> lst){
        List<TSalesman> list = new ArrayList<>();
        FileWriter fileWriter = null;
        logger.info("Starting ExportTSalesman");
        
        try {
            File filePath = new File(filePathDestination);
            fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            //Seragam Distributor Code Pake Parameter Sistem
            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();

            //Header
            printWriter.println("disticode,salesid,salesnm,calamat1,calamat2,ckota,cpos,ctelp,kodelevel,rpttocode"); 
            //logger.info(String.valueOf(lst.size()));
            
            for (TMasterSalesman itm: lst) {
                
                //1. disticode,
                printWriter.print("\"" + (distCode!=null?distCode:"") + "\",");
                //2. salesid,
                printWriter.print("\"" + (itm.getSalesIdSap()!=null?itm.getSalesIdSap():"") + "\",");                
                //3. salesnm,
                printWriter.print("\"" + (itm.getSalesNmSap()!=null?itm.getSalesNmSap():"") + "\",");
                //4. calamat1,
                printWriter.print("\"" + (itm.getCalamat1()!=null?itm.getCalamat1():"") + "\",");
                //5. calamat2,
                printWriter.print("\"" + (itm.getCalamat2()!=null?itm.getCalamat2():"") + "\",");
                //6. ckota,
                printWriter.print("\"" + (itm.getCkota()!=null?itm.getCkota():"") + "\",");
                //7. cpos,
                printWriter.print("\"" + (itm.getCpos()!=null?itm.getCpos():"") + "\",");
                //8. ctelp,
                printWriter.print("\"" + (itm.getCtelp()!=null?itm.getCtelp():"") + "\",");
                //9. kodelevel,
                printWriter.print("\"" + (itm.getKodeLevel()!=null?itm.getKodeLevel():"") + "\",");
                //10.rpttocode                
                printWriter.print("\"" + (itm.getRpttoCode()!=null?itm.getRpttoCode():"") + "\"");
                //TurunBaris
                printWriter.println();
                
                //Untuk Isi List
                TSalesman item = new TSalesman();
                item.setSalesIdScy(itm.getSalesIdScy());
                item.setSalesIdSap(itm.getSalesIdSap());                
                item.setDistiCode(item.getDistiCode());
                item.setDistiName(itm.getDistiName());
                item.setSalesNm(itm.getSalesNm());
                item.setSalesNmSap(itm.getSalesNmSap());
                item.setCalamat1(itm.getCalamat1());
                item.setCalamat2(itm.getCalamat2());
                item.setCkota(itm.getCkota());
                item.setCpos(itm.getCpos());
                item.setCtelp(itm.getCtelp());
                item.setKodeLevel(itm.getKodeLevel());
                item.setRpttoCode(itm.getRpttoCode());
                item.setNasSalesmanCode(itm.getNasSalesmanCode());
                item.setNasSalesmanNm(itm.getNasSalesmanNm());                

                list.add(item);
                
            }
            printWriter.close();
            
        } catch (IOException ex) {
            logger.error("FileWriter pada method exportToCsvFromListToFile", ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                logger.error(" Finally FileWriter pada method exportToCsvFromListToFile", ex);
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
        ExportTSalesman f = new ExportTSalesman();
    
    }
    
}
