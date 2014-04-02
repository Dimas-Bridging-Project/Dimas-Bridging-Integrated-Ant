package org.dimas.bridging.retrieve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JPcodePK;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * @author yhawin
 */
public class ParseJPcode {    
    private static final Logger logger = LoggerFactory.getLogger(ParseJPcode.class);
    BridgingController controller;
    
    public ParseJPcode(BridgingController controller){
        this.controller = controller;
    }
    
    public List<JPcode> parseJPcode(String strFilePath, String principal){
        //System.out.println("Parsing JPcode >> Starting");
        logger.info("Parsing JPcode >> Starting");
        
         Reader readerFile = null;
         List<JPcode> lst = new ArrayList<>();
         
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
                
                //Karena jumlah record benar adalah 10 (8 toleransi)
                if (data.length > 8) {
                    JPcode item = new JPcode();
                    JPcodePK jpcodePK = new JPcodePK();
                    //KITA MEMINDAH SALESMAN CODE SEBAGAI PRIMARY KEY
//                    item.setSalesman(data[0]);
                    jpcodePK.setSalesman(data[0]);
                    
                    jpcodePK.setIdOrder(data[1]);
                    jpcodePK.setPcode(data[2]);
                    item.setJpcodePK(jpcodePK);
                  
                    item.setQtyInFib(data[3]);
                    
                    //karena dipake dibawahnya
                    item.setTipeFakturRetur(data[9]);                    
                    
                    if (! data[4].equals("")){
                        item.setQtyInSat(Integer.parseInt(data[4]));
                        try {
                            if (item.getTipeFakturRetur().trim().equalsIgnoreCase("R")){
                                item.setQtyInSat(-Integer.parseInt(data[4]));                            
                            }   
                        }catch(Exception ex){
                            logger.error("JPCode Gagal Set Minus pada Qty");
                        }                        
                    }
                    if(! data[5].equals("")) {
                        item.setHrgJualKartonNoPpn(Integer.parseInt(data[5]));
                        try {
                            if (item.getTipeFakturRetur().trim().equalsIgnoreCase("R")){
                                item.setHrgJualKartonNoPpn(-Integer.parseInt(data[5]));
                            }   
                        }catch(Exception ex){
                            logger.error("JPCode Gagal Set Minus pada HargaJual Per karton");
                        }   
                    }    
                    if (! data[6].equals("")){
                        item.setHrgJualLsnNoPpn(Integer.parseInt(data[6]));
                        try {
                            if (item.getTipeFakturRetur().trim().equalsIgnoreCase("R")){
                                item.setHrgJualLsnNoPpn(-Integer.parseInt(data[6]));
                            }   
                        }catch(Exception ex){
                            logger.error("JPCode Gagal Set Minus pada HargaJual Per Lusin");
                        }                       
                    }    
                    if (! data[7].equals("")){
                        item.setHargaNoPpn(Integer.parseInt(data[7]));                        
                        try {
                            if (item.getTipeFakturRetur().trim().equalsIgnoreCase("R")){
                                item.setHargaNoPpn(-Integer.parseInt(data[7]));                            
                            }   
                        }catch(Exception ex){
                            logger.error("JPCode Gagal Set Minus pada HargaNoPpn");
                        }
                    }    
                    
                    
                    item.setJenis(data[8]);
                    //item.setTipeFakturRetur(data[9]); ditaruh diatas bos karena kepakenya diatas

                    if (item !=null) 
                            lst.add(item);

                    //if (pencacah>2) break;
                    //System.out.println("abc");
                }                
            }
                        
        } catch (FileNotFoundException ex) {
            logger.error("Error pada method parseJPCode", ex);
        } catch (IOException ex) {
            logger.error("Error pada method parseJPCode", ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                logger.error("Error pada method parseJPCode", ex);
            }
        }

        return lst;        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
    }
    
}
