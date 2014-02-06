/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.retrieve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.config.spring.hibernate.model.JTpru;
import org.config.spring.hibernate.model.JTpruPK;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class ParseJTpru {
    private static final Logger logger = LoggerFactory.getLogger(ParseJTpru.class);
    BridgingController controller;
    
    public ParseJTpru(BridgingController controller){
        this.controller = controller;
    }
    
    public List<JTpru> parseJTpru(String strFilePath, String principal){
        //System.out.println("Parsing JTpru >> Starting");
        logger.info("Parsing JTpru >> Starting");
        
         Reader readerFile = null;
         List<JTpru> lst = new ArrayList<>();
         
        try {
            File filePath = new File(strFilePath);
            readerFile = new FileReader(filePath);
            BufferedReader bufReadFile = new BufferedReader(readerFile);
            String readByte;
            int pencacah =0;
            
            while ((readByte = bufReadFile.readLine()) !=null) {
                //System.out.print(pencacah++ + "-->> " );
                
                readByte = readByte.replaceAll("\"", "");
                String [] data = readByte.split("\\,");  
                
                
                //Karena jumlah record benar adalah 5 (8 toleransi)
                if (data.length > 4) {
                    JTpru item = new JTpru();
                    item.setSalesman(data[0]);
                    
                    JTpruPK jtpruPK = new JTpruPK();                    
                    jtpruPK.setIdOrder(data[1]);
                    jtpruPK.setPcode(data[2]);
                    item.setJtpruPK(jtpruPK);
                    
                    if (! data[3].equals(""))
                        item.setHargaNoPpn(Integer.parseInt(data[3]));
                    item.setTipe(data[4]);

                    if (item !=null) 
                            lst.add(item);
                             

                    //if (pencacah>2) break;
                    //System.out.println();
                }
                
            }
            
            
        } catch (FileNotFoundException ex) {
            logger.error("Error pada method parseJTpru", ex);
        } catch (IOException ex) {
            logger.error("Error pada method parseJTpru", ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                logger.error("Error pada method parseJTpru", ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
    }
    
}
