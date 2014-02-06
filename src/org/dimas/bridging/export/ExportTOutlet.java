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
import org.config.spring.hibernate.model.TMasterOutlet;
import org.config.spring.hibernate.model.TOutlet;
import org.config.spring.provider.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ExportTOutlet {
    private static final Logger logger = LoggerFactory.getLogger(ExportTOutlet.class);
    
    ApplicationContext appContext;
    SysvarDaoInter sysvarDao;

    public ExportTOutlet() {
        initiates();
    }  
    public void initiates(){
            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    }
    public List<TOutlet> exportToCsvFromListToFile(String filePathDestination, Date tglTransaksi, List<TMasterOutlet> lst){
        List<TOutlet> list = new ArrayList<>();
        FileWriter fileWriter = null;
        logger.info("Starting export TOutlet");
        try {
            File filePath = new File(filePathDestination);
            fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            //Seragam Distributor Code Pake Parameter Sistem
            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();
            String distName = sysvarDao.findById("_DIST_NAME").getNilaiString1();

            //Header
            printWriter.println("mslsout_code,mslsout_desc,typeid,typenm,groupid,groupnm,subgrpid,subgrpnm,classid,classnm,bsizeid,bsizenm,chainid,chainnm,lokid,loknm,distiid,distinm,areaid,areanm,salescode,salesnm,nassalescode,nassalesnm"); 
            System.out.print(lst.size());
            
            
            for (TMasterOutlet itm: lst) {
                
                //1. mslsout_code,
                printWriter.print("\"" + itm.getMslsoutCode().trim() + "\",");
                //2. mslsout_desc,
                printWriter.print("\"" + itm.getMslsoutDesc().trim() + "\",");
                //3. typeid,
                printWriter.print("\"" + (itm.getTypeId()!=null?itm.getTypeId():"") + "\",");
                //4. typenm,
                printWriter.print("\"" + (itm.getTypeNm()!=null?itm.getTypeNm():"") + "\",");
                //5. groupid,
                printWriter.print("\"" + (itm.getGroupId()!=null?itm.getGroupId():"")  + "\",");                
                //6. groupnm,
                printWriter.print("\"" + (itm.getGroupNm()!=null?itm.getGroupNm():"") + "\",");
                //7. subgrpid,
                printWriter.print("\"" + (itm.getSubGrpId()!=null?itm.getSubGrpId():"") + "\",");
                //8. subgrpnm,
                printWriter.print("\"" + (itm.getSubGrpNm()!=null?itm.getSubGrpNm():"") + "\",");
                //9. classid,
                printWriter.print("\"" + (itm.getClassId()!=null?itm.getClassId():"") + "\",");
                //10. classnm,
                printWriter.print("\"" +  (itm.getClassNm()!=null?itm.getClassNm():"") + "\",");
                //11. bsizeid,
                printWriter.print("\"" +  (itm.getBsizeId()!=null?itm.getBsizeId():"") + "\",");
                //12. bsizenm,
                printWriter.print("\"" +  (itm.getBsizeNm()!=null?itm.getBsizeNm():"") + "\",");
                //13. chainid,
                printWriter.print("\"" +  (itm.getChainId()!=null?itm.getChainId():"") + "\",");
                //14. chainnm,
                printWriter.print("\"" + (itm.getChainNm()!=null?itm.getChainNm():"") + "\",");
                //15. lokid,
                printWriter.print("\"" +  (itm.getLokId()!=null?itm.getLokId():"") + "\",");
                //16. loknm,
                printWriter.print("\"" +  (itm.getLokNm()!=null?itm.getLokNm():"") + "\",");                
                //17. distiid,
                printWriter.print("\"" + distCode + "\",");
                //18. distinm,
                printWriter.print("\"" + distName + "\",");
                //19. areaid,
                printWriter.print("\"" + (itm.getAreaId()!=null?itm.getAreaId():"") + "\",");
                //20. areanm,
                printWriter.print("\"" +  (itm.getAreaNm()!=null?itm.getAreaNm():"") + "\",");
                //21. salescode,
                printWriter.print("\"" + (itm.getSalesCode()!=null?itm.getSalesCode():"") + "\",");
                //22. salesnm,
                printWriter.print("\"" + (itm.getSalesNm()!=null?itm.getSalesNm():"")  + "\",");
                //23. nassalescode,
                printWriter.print("\"" + (itm.getNasSalesCode()!=null?itm.getNasSalesCode():"")  + "\",");
                //24. nassalesnm                
                printWriter.print("\"" + (itm.getNasSalesNm()!=null?itm.getNasSalesNm():"") + "\"");
                
                //TurunBaris
                printWriter.println();
               
                
                //Untuk Isi List
                TOutlet item = new TOutlet();
                item.setAreaId(itm.getAreaId());
                item.setAreaNm(itm.getAreaNm());
                item.setBsizeId(itm.getBsizeId());
                item.setBsizeNm(itm.getBsizeNm());
                item.setChainId(itm.getChainId());
                item.setChainNm(itm.getChainNm());
                item.setClassId(itm.getClassId());
                item.setClassNm(itm.getClassNm());
                item.setDistiId(itm.getDistiId());
                item.setDistiNm(itm.getDistiNm());
                item.setGroupId(itm.getGroupId());
                item.setGroupNm(itm.getGroupNm());
                item.setKaccId(itm.getKaccId());
                item.setKaccNm(itm.getKaccNm());
                item.setLokId(itm.getLokId());
                item.setLokNm(itm.getLokNm());
                item.setMslsoutCode(itm.getMslsoutCode());
                item.setMslsoutDesc(itm.getMslsoutDesc());
                item.setNasSalesCode(itm.getNasSalesCode());
                item.setNasSalesNm(itm.getNasSalesNm());
                item.setSalesCode(itm.getSalesCode());
                item.setSalesNm(itm.getSalesNm());

                item.setScyOutCode(itm.getScyOutCode());
                
                item.setSubGrpId(itm.getSubGrpId());
                item.setSubGrpNm(itm.getSubGrpNm());
                item.setTypeId(itm.getTypeId());
                item.setTypeNm(itm.getTypeNm());
                
                list.add(item);                
                
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
        ExportTOutlet f = new ExportTOutlet();
    
    }
    
}
