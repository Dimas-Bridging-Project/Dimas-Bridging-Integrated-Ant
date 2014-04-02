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
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.JTprbPK;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class ParseJTprb {
    private static final Logger logger = LoggerFactory.getLogger(ParseJTprb.class);
    BridgingController controller;
    
    public ParseJTprb(BridgingController controller){
        this.controller = controller;
    }
    
    public List<JTprb> parseJTprb(String strFilePath, String principal){
        //System.out.println("Parsing JTprb >> Starting");
        logger.info("Parsing JTprb >> Starting");
        
         Reader readerFile = null;
         List<JTprb> lst = new ArrayList<>();
         
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
                
                
                //Karena jumlah record benar adalah 9 (8 toleransi)
                if (data.length > 7) {
                    JTprb item = new JTprb();
                    JTprbPK jtprbPK = new JTprbPK();
                    jtprbPK.setSalesman(data[0]);
                    //Kita sudah memindah salesman code sebagai  primary key
                    //item.setSalesman(data[0]);
                    
                    //karena dipake dibawahnya
                    item.setTipeFakturRetur(data[8]);
                    
                    jtprbPK.setIdOrder(data[1]);
                    jtprbPK.setPcode(data[2]);
                    item.setJtprbPK(jtprbPK);
                    
                    item.setQtyInFib(data[3]);
                    item.setQtyInSat(0);
                    if (! data[4].equals("")) {
                        item.setQtyInSat(Integer.parseInt(data[4]));
                        try {
                            if (item.getTipeFakturRetur().trim().equalsIgnoreCase("R")){
                                item.setQtyInSat(-Integer.parseInt(data[4]));                                
                             }
                        } catch(Exception ex){
                                logger.error("JTPrb Gagal Set Minus pada Qty");
                        }
                    }    
                    item.setHrgJualKartonNoPpn(0);
                    
                    if(! data[5].equals("")){
                        item.setHrgJualKartonNoPpn(Integer.parseInt(data[5]));
                        try {
                            if (item.getTipeFakturRetur().trim().equalsIgnoreCase("R")){
                                item.setHrgJualKartonNoPpn(-Integer.parseInt(data[5]));
                             }
                        } catch(Exception ex){
                                logger.error("JTPrb Gagal Set Minus pada Harga PerKarton");
                        }                        
                    }
                    item.setHargaNoPpn(0);
                    if (! data[6].equals("")){
                        item.setHrgJualLsnNoPpn(Integer.parseInt(data[6]));
                        try {
                            if (item.getTipeFakturRetur().trim().equalsIgnoreCase("R")){
                                item.setHrgJualLsnNoPpn(-Integer.parseInt(data[6])); 
                             }
                        } catch(Exception ex){
                                logger.error("JTPrb Gagal Set Minus pada Harga Perlusin");
                        }
                        
                    }    
                    //Harga Jual PcsNoPPn
                    Integer intHargaJualPcsNoPpn = item.getHrgJualLsnNoPpn()/12;
                    Integer intHargaNoPpn = intHargaJualPcsNoPpn * item.getQtyInSat();
                    //Hati hati dengan output
                    try {
                        if (item.getTipeFakturRetur().trim().equalsIgnoreCase("R")){
                            intHargaNoPpn = -intHargaNoPpn;
                        }
                    } catch(Exception ex){
                            logger.error("JTPrb Gagal Set Minus pada HargaNoPPN");
                    }
                    item.setHargaNoPpn(intHargaNoPpn);
                    
                    item.setJenis(data[7]);
                    item.setTipeFakturRetur(data[8]);

                    if (item !=null) 
                            lst.add(item);
                             
                }
                
            }
            
            
        } catch (FileNotFoundException ex) {
            logger.error("Error pada method parseJTprb", ex);
        } catch (IOException ex) {
            logger.error("Error pada method parseJTprb", ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                logger.error("Error pada method parseJTprb", ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
    }
    
}
