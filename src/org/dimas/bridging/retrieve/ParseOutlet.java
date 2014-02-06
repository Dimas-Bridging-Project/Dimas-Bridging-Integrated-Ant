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
import org.config.spring.hibernate.model.Outlet;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.config.spring.hibernate.model.enumgeneral.EnumPrincipal;
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class ParseOutlet {
    private static final Logger logger = LoggerFactory.getLogger(ParseOutlet.class);
    BridgingController controller;
    
    
    public ParseOutlet(BridgingController controller){
        this.controller = controller;        
    }
    
    public List<Outlet> parseOutlet(String strFilePath, String principal){
        logger.info("Parsing Outlet >> Starting");
        

        //Seragam Distributor Code Pake Parameter Sistem
        String distCode = controller.getModel().sysvarDao.findById("_DIST_CODE").getNilaiString1();
        String distName = controller.getModel().sysvarDao.findById("_DIST_NAME").getNilaiString1();

        
        Reader readerFile = null;
        List<Outlet> lst = new ArrayList<>();
        
         
        try {
            File filePath = new File(strFilePath);
            readerFile = new FileReader(filePath);
            BufferedReader bufReadFile = new BufferedReader(readerFile);
            String readByte;
            int pencacah =0;
            
            while ((readByte = bufReadFile.readLine()) !=null) {
                //System.out.print(pencacah++ + "-->> " );
                
                //readByte = readByte.replaceAll("\"", "");
                //String [] data = readByte.split("\\,");  
                String data = readByte;
                                     
                //Karena jumlah record benar adalah 5 (8 toleransi)
               if (data.length()==595) {
                    //System.out.println(data);
                    Outlet item = new Outlet();
                    item.setOutlet(data.substring(0, 6).trim());
                    item.setNama(data.substring(6,36).trim());
                    
                    item.setAlm1Toko(data.substring(36,61).trim());
                    item.setAlm2Toko(data.substring(61,86).trim());
                    item.setKotaToko(data.substring(86,106).trim());
                    
                    item.setContactPr(data.substring(106,131).trim());                    
                    item.setTlpToko(data.substring(131,151).trim());
                    item.setNoFax(data.substring(151,171).trim());                    
                    item.setAlm1Rmh(data.substring(171,196).trim());
                    item.setAlm2Rmh(data.substring(196,221).trim());                    
                    item.setKotaRmh(data.substring(221,241).trim());
                    
                    //GANTI DENGAN YANG ADA DI MAPPING
                    item.setTy(data.substring(279, 281).trim());
                    
                    item.setVd(data.substring(284, 286).trim());
                    item.setFlPjk(data.substring(448, 449).trim());
                    item.setUserDef1(data.substring(449, 479).trim());
                    item.setUserDef2(data.substring(479, 509).trim());
                    item.setM(data.substring(521, 522).trim());
                    item.setFlagKab(data.substring(594, 595).trim());
                    item.setPk(data.substring(286, 288).trim());
                    //item.(data.substring(,).trim());
                            
                    
                    if (item !=null) 
                            lst.add(item);
                    
                    /**
                     * MENCOBA MEMASUKKAN KE MASTER OUTLET KEK
                     */
                                                        
                            TMasterOutlet tMasterOutlet = new TMasterOutlet();

                            tMasterOutlet.setDistiId(distCode);
                            tMasterOutlet.setDistiNm(distName);

                            tMasterOutlet.setScyOutCode(item.getOutlet().trim());
                            tMasterOutlet.setMslsoutCode(item.getOutlet().trim());
                            tMasterOutlet.setMslsoutDesc(item.getNama().trim());

                            tMasterOutlet.setBaru(true);
                            tMasterOutlet.setAllowTransfer(false);
                            tMasterOutlet.setAktif(true);
                    
                    
                    
                    /**
                     * MENCOBA MEMASUKKAN KE MASTER OUTLET POKARI
                     */
                            
                            ArCustomer arCustomer = new ArCustomer();
                            arCustomer.setScyCustomerId(item.getOutlet().trim());
                            arCustomer.setSzCustomerId(item.getOutlet().trim());
                            arCustomer.setScyName(item.getNama().trim());
                            arCustomer.setSzName(item.getNama().trim());
                            
                            Double doubleLimitKredit = 0.0;
                            try {
                                doubleLimitKredit = Double.parseDouble(String.valueOf(item.getLimitK()));
                            } catch(Exception ex){}
                            arCustomer.setDecLimitCredit(doubleLimitKredit);
                            arCustomer.setDtmRegisterDate(null);                            
                            
                            arCustomer.setSzAddress(item.getAlm1Toko().trim() + " " + item.getAlm2Toko().trim());
                            arCustomer.setSzCity(item.getKotaToko());
                            arCustomer.setSzContact(item.getContactPr());
                            
                            arCustomer.setSzCustomerGroupId("");
                            arCustomer.setSzDistrChannelId("");
                            arCustomer.setSzDistrict("");
                            
                            arCustomer.setSzEmail("");
                            arCustomer.setSzEmployeeId("");
                            arCustomer.setSzFax(item.getNoFax());
                            arCustomer.setSzHirarchyId("");
                            arCustomer.setSzNPWP("");
                            arCustomer.setSzPaymentTermId("");
                            arCustomer.setSzPhone1(item.getTlpToko());
                            arCustomer.setSzPhone2("");
                            arCustomer.setSzSalesTerritoryId("");
                            arCustomer.setSzState("");
                            arCustomer.setSzStatus("");
                            arCustomer.setSzWorkplaceId("");
                            arCustomer.setSzZipCode("");
                            
                                    
                            arCustomer.setBaru(true);
                            arCustomer.setAllowTransfer(false);
                            arCustomer.setAktif(true);
                    
                    if (principal.equalsIgnoreCase(EnumPrincipal.KEK.getStrCode())){                    
                        try {

                            controller.getModel().tMasterOutletDao.save(tMasterOutlet);
                            /**
                             * DUMMY FOR POKARI AND BAYGON >> TO MEMORY : KARENA KITA MASIH BELUM TAHU RELASI HIBERNATE-NYA
                             */
                            controller.getModel().arCustomerDaoMem.saveOrUpdate(arCustomer);

                        } catch (Exception ex) {
                             logger.error(item.getOutlet() + " " + item.getNama() +  " KEK sudah ada");
                        }
                    }else if (principal.equalsIgnoreCase(EnumPrincipal.POKARI.getStrCode())){
                        try {
                            
                            controller.getModel().arCustomerDao.save(arCustomer);
                            /**
                             * DUMMY FOR KEK AND BAYGON >> TO MEMORY : KARENA KITA MASIH BELUM TAHU RELASI HIBERNATENYA
                             */
                            controller.getModel().tMasterOutletDaoMem.saveOrUpdate(tMasterOutlet);
                        }catch(Exception ex){
                             logger.error(item.getOutlet() + " " + item.getNama() +  " POKARI sudah ada");
                        }
                    
                    }else if (principal.equalsIgnoreCase(EnumPrincipal.BAYGON.getStrCode())){
                    }
               }         

                    //if (pencacah>2) break;
                    //System.out.println();
                
            }
            
            
        } catch (FileNotFoundException ex) {
            logger.error("error Method parseOutlet", ex);
        } catch (IOException ex) {
            logger.error("error Method parseOutlet", ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                logger.error("error Method parseOutlet", ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
    }
    
}
