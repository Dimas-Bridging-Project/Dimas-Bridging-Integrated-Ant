/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging;

import org.dimas.bridging.retrieve.ParseTest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class Test {
    
    public static void main(String [] args){
        
        ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
        SysvarDaoInter sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
        
        JFrame f = new JFrame();
        f.setTitle("Hello Bos");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        f.setVisible(true);
         
        
        
    }
    
}
