package org.dimas.bridging.retrieve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.enumgeneral.EnumPrincipal;
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */

public class ParseJHeader {
    private static final Logger logger = LoggerFactory.getLogger(ParseJHeader.class);
    BridgingController controller;
    
    public ParseJHeader(BridgingController controller){
        this.controller = controller;
    }
    
    public List<JHeader> parseJHeader(String strFilePath, String principal){
        //System.out.println("Parsing JHeader >> Starting");
        logger.info("Parsing JHeader >> Starting");
        
        Reader readerFile = null;
        List<JHeader> lst = new ArrayList<>();
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
                //Karena jumlah record benar adalah 28 (25 toleransi)
                if (data.length > 25) {
                    /*
                    int i = 0;                
                    for (String itm: data) {
                        System.out.print(i++ + "." + itm +"::");
                    }
                    */
                    
                    //Format tanggal
                    SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");

                    JHeader item = new JHeader();
                    item.setSalesman(data[0]); 
                    item.setIdOrder(data[1]);

                    if (! data[2].equals("")) {
                        Date tanggal = null;
                        try {
                            tanggal = format.parse(data[2].toString());
                        } catch (ParseException ex) {
                            logger.error("Error Format Tanggal1 untuk No Order" + item.getIdOrder() + " " + item.getSalesman() , ex);
                            //Logger.getLogger(ParseJHeader.class.getName()).log(Level.SEVERE, null, ex);
                        }                 
                        item.setTanggal(tanggal);
                        //System.out.println(item.getTanggal());
                    }
                    item.setOutlet(data[3]);
                    
                    if (! data[4].equals(""))
                        item.setGross(Integer.parseInt(data[4]));
                    if (! data[5].equals(""))
                        item.setPromoBrg(Integer.parseInt(data[5]));
                    if (! data[6].equals(""))
                        item.setPromoUang(Integer.parseInt(data[6]));
                    if (! data[7].equals(""))
                        item.setPpn(Integer.parseInt(data[7]));
                    if (! data[8].equals(""))
                        item.setNetPpn(Integer.parseInt(data[8]));
                    if (! data[9].equals(""))
                        item.setKredit(Integer.parseInt(data[9]));
                    if (! data[10].equals(""))
                        item.setTerbayar(Integer.parseInt(data[10]));
                    if (! data[11].equals(""))
                        item.setSaldo(Integer.parseInt(data[11]));

                    item.setNoFakturRetur(data[13]);
                    if (! data[15].equals(""))
                        item.setDisAtasFaktur(Integer.parseInt(data[15]));
                    item.setTipeBayar(data[18]);

                    if ( ! data[19].equals("")) {
                        Date tanggal2 = null;
                        try {
                            tanggal2 = format.parse(data[19].toString());
                        } catch (ParseException ex) {
                            logger.error("Error Format Tanggal2 untuk No Order" + item.getIdOrder() + " " + item.getSalesman() , ex);
                        }                 
                        item.setTrans_date2(tanggal2);
                    }

                    item.setSalesId2(data[20]);

                    item.setNpwp(data[23]);
                    if (! data[27].equals(""))
                        item.setTerRetur(Integer.parseInt(data[27]));
                    item.setTypeOutlet(data[28]);

                    if (item !=null) 
                            lst.add(item);  

                    //if (pencacah>2) break;
                    //System.out.println();
                    
                    /**
                     * MENCOBA MEMASUKKAN KE MASTER OUTLET POKARI
                     */
                    
//                            ArCustomer arCustomer = new ArCustomer();
//                            arCustomer.setScyCustomerId(item.getOutlet().trim());
//                            arCustomer.setSzCustomerId(item.getOutlet().trim());
//                            arCustomer.setScyName(item.gettMasterOutlet().);
//                            arCustomer.setSzName(item.getNama().trim());
//                            
//                            Double doubleLimitKredit = 0.0;
//                            try {
//                                doubleLimitKredit = Double.parseDouble(String.valueOf(item.getLimitK()));
//                            } catch(Exception ex){}
//                            arCustomer.setDecLimitCredit(doubleLimitKredit);
//                            arCustomer.setDtmRegisterDate(null);                            
//                            
//                            arCustomer.setSzAddress(item.getAlm1Toko().trim() + " " + item.getAlm2Toko().trim());
//                            arCustomer.setSzCity(item.getKotaToko());
//                            arCustomer.setSzContact(item.getContactPr());
//                            
//                            arCustomer.setSzCustomerGroupId("");
//                            arCustomer.setSzDistrChannelId("");
//                            arCustomer.setSzDistrict("");
//                            
//                            arCustomer.setSzEmail("");
//                            arCustomer.setSzEmployeeId("");
//                            arCustomer.setSzFax(item.getNoFax());
//                            arCustomer.setSzHirarchyId("");
//                            arCustomer.setSzNPWP("");
//                            arCustomer.setSzPaymentTermId("");
//                            arCustomer.setSzPhone1(item.getTlpToko());
//                            arCustomer.setSzPhone2("");
//                            arCustomer.setSzSalesTerritoryId("");
//                            arCustomer.setSzState("");
//                            arCustomer.setSzStatus("");
//                            arCustomer.setSzWorkplaceId("");
//                            arCustomer.setSzZipCode("");
//                            
//                                    
//                            arCustomer.setBaru(true);
//                            arCustomer.setAllowTransfer(false);
//                            arCustomer.setAktif(true);
                            
//                    if (principal.equalsIgnoreCase(EnumPrincipal.KEK.getStrCode())){                    
//                        try {
//
//                            controller.getModel().tMasterOutletDao.save(tMasterOutlet);
//                            /**
//                             * DUMMY FOR POKARI AND BAYGON >> TO MEMORY : KARENA KITA MASIH BELUM TAHU RELASI HIBERNATE-NYA
//                             */
//                            controller.getModel().arCustomerDaoMem.saveOrUpdate(arCustomer);
//
//                        } catch (Exception ex) {
//                             logger.error(item.getOutlet() + " " + item.getNama() +  " KEK sudah ada");
//                        }
//                    }else if (principal.equalsIgnoreCase(EnumPrincipal.POKARI.getStrCode())){
//                        try {
//                            
//                            controller.getModel().arCustomerDao.save(arCustomer);
//                            /**
//                             * DUMMY FOR KEK AND BAYGON >> TO MEMORY : KARENA KITA MASIH BELUM TAHU RELASI HIBERNATENYA
//                             */
//                            controller.getModel().tMasterOutletDaoMem.saveOrUpdate(tMasterOutlet);
//                        }catch(Exception ex){
//                             logger.error(item.getOutlet() + " " + item.getNama() +  " POKARI sudah ada");
//                        }
//                    
//                    }else if (principal.equalsIgnoreCase(EnumPrincipal.BAYGON.getStrCode())){
//                    }
                    
                    
                }
            }    
            
        } catch (FileNotFoundException ex) {
            logger.error("Error method parseJHeader" , ex);
        } catch (IOException ex) {
            logger.error("Error method parseJHeader" , ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                logger.error("Error method parseJHeader" , ex);
            }
        }
        
        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
    }
    
}
