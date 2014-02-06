/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.retrieve;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.dao.TMasterSalesmanDaoInter;
import org.config.spring.hibernate.model.Salesman;
import org.config.spring.hibernate.model.TMasterSalesman;
import org.config.spring.provider.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ParseAndExportTMasterSalesman {
    private static final Logger logger= LoggerFactory.getLogger(ParseAndExportTMasterSalesman.class);
    
    ApplicationContext appContext;
    SysvarDaoInter sysvarDao;
    TMasterSalesmanDaoInter tMasterSalesmanDao;
    
    public ParseAndExportTMasterSalesman(){
        initiates();
    }
     
    public void initiates(){
            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
            tMasterSalesmanDao = (TMasterSalesmanDaoInter) appContext.getBean("TMasterSalesmanDaoBean");
    }
    
    public List<TMasterSalesman> exportToCsvFromListToFile(List<Salesman> lst, Boolean export){
        List<TMasterSalesman> list = new ArrayList<>();
        FileWriter fileWriter = null;
            for (Salesman itm: lst) {
                
                //Untuk Isi List
                TMasterSalesman item = new TMasterSalesman();
                list.add(item);
                
            }
        return list;        
    }
    
    public static void main(String [] args) {
        ParseAndExportTMasterSalesman f = new ParseAndExportTMasterSalesman();
        //f.parseSalesman("/home/yhawin/Dimas/Input-File/SALESMAN.TXT");//Oke --> "\\,"    
        //f.parseSalesman("E:/Input-File/SALESMAN.TXT");
        
    }
    
}
