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
import org.config.spring.hibernate.model.Salesman;
import org.config.spring.hibernate.model.TMasterSalesman;
import org.config.spring.hibernate.model.enumgeneral.EnumPrincipal;
import org.config.spring.hibernate.model.pokari.SpEmployee;
import org.dimas.bridging.app.controller.BridgingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yhawin
 */
public class ParseSalesman {
    private static final Logger logger = LoggerFactory.getLogger(ParseSalesman.class);
    BridgingController controller;
//    ApplicationContext appContext;
//    TMasterSalesmanDaoInter tMasterSalesmanDao;
//    SysvarDaoInter sysvarDao;

    public ParseSalesman(BridgingController controller){
        this.controller = controller;
//        appContext = ApplicationContextProvider.getInstance().getApplicationContext();
//        sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
//        tMasterSalesmanDao = (TMasterSalesmanDaoInter) appContext.getBean("TMasterSalesmanDaoBean");
    }
    public List<Salesman> parseSalesman(String strFilePath, String principal){    
        //System.out.println("Parsing Salesman >> Starting");
        logger.info("Parsing Salesman >> Starting");
        //Seragam Distributor Code Pake Parameter Sistem
        //Seragam Distributor Code Pake Parameter Sistem
        
        String distCode = controller.getModel().sysvarDao.findById("_DIST_CODE").getNilaiString1();
        String distName = controller.getModel().sysvarDao.findById("_DIST_NAME").getNilaiString1();
        
        Reader readerFile = null;
        List<Salesman> lst = new ArrayList<>();
         
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
               if (data.length()==141) {
                    //System.out.println(data);
                    Salesman item = new Salesman();
                    item.setSalesman(data.substring(0, 3).trim());
                    item.setNamaSls(data.substring(3, 23).trim());
                    item.setAlamat1(data.substring(23, 48).trim());
                    item.setAlamat2(data.substring(48, 73).trim());
                    item.setKota(data.substring(73, 93).trim());
                    item.setTeam(data.substring(124, 128).trim());
                    item.setGudang(data.substring(129, 131).trim());
      
                    
                    //item.setSalesman(data.substring(6, 9).trim());
                    if (item !=null) 
                            lst.add(item);
                    
                    /**
                     * MENCOBA MEMASUKKAN KE MASTER SALESMAN KEK
                     */
                    
                            TMasterSalesman tMasterSalesman = new TMasterSalesman();
                            //Sebagai patokan bahwa ini masih baru apa tidak
                            tMasterSalesman.setDistiCode(distCode);
                            tMasterSalesman.setDistiName(distName);

                            tMasterSalesman.setSalesIdScy(item.getSalesman());
                            tMasterSalesman.setSalesIdSap(item.getSalesman());
                            tMasterSalesman.setSalesNm(item.getNamaSls());
                            tMasterSalesman.setSalesNmSap(item.getNamaSls());

                            tMasterSalesman.setCalamat1(item.getAlamat1());
                            tMasterSalesman.setCalamat2(item.getAlamat2());
                            tMasterSalesman.setCkota(item.getKota());

                            tMasterSalesman.setCtelp("");
                            tMasterSalesman.setCpos("");

                            tMasterSalesman.setBaru(true);
                            tMasterSalesman.setAllowTransfer(false);
                            tMasterSalesman.setAktif(true);
                    
                    
                    /**
                     * MENCOBA MEMASUKKAN KE MASTER SALESMAN POKARI
                     */
                        SpEmployee spEmployee = new SpEmployee();
                        spEmployee.setScyEmployeeId(item.getSalesman().trim());
                        spEmployee.setSzEmployeeId(item.getSalesman().trim());
                        spEmployee.setSzName(item.getNamaSls().trim());
                        spEmployee.setScyName(item.getNamaSls().trim());
                        
                        spEmployee.setSzPoliceNo("");
                        spEmployee.setSzSalesGroup("");
                        spEmployee.setSzSalesType("");
                        spEmployee.setSzTeamId("");
                        spEmployee.setSzVehicleId("");
                        spEmployee.setSzVehicleName("");
                        spEmployee.setSzWorkplaceId("");
                        
                        spEmployee.setBaru(true);
                        spEmployee.setAllowTransfer(false);
                        spEmployee.setAktif(true);
                    
                    if (principal.equalsIgnoreCase(EnumPrincipal.KEK.getStrCode())){                    
                    
                        try {

                            controller.getModel().tMasterSalesmanDao.save(tMasterSalesman);
                            /**
                             * SAVE POKARI AND BAYGON FOR DUMMY >> TO MEMRORY : KARENA KITA MASIH BELUM TAHU RELASI HIBERNATENYA
                             */
                            controller.getModel().spEmployeeDaoMem.saveOrUpdate(spEmployee);
                            
                        } catch (Exception ex) {
                            logger.error(item.getSalesman() +  " sudah ada");
                        }
                    }else if (principal.equalsIgnoreCase(EnumPrincipal.POKARI.getStrCode())){
                        try {
                        
                        controller.getModel().spEmployeeDao.save(spEmployee);
                        /**
                         * SAVE KEK AND BAYGON FOR DUMMY >> TO MEMORY >> KARENA KITA MASIH BELUM TAHU RELASI HIBERNATE NYA
                         */
                        controller.getModel().tMasterSalesmanDaoMem.saveOrUpdate(tMasterSalesman);
                        
                        } catch(Exception ex){
                            logger.error(item.getNamaSls() + " sudah ada");
                        }
                    }else if (principal.equalsIgnoreCase(EnumPrincipal.BAYGON.getStrCode())){
                    }
                    
                    
               }         

                    //if (pencacah>2) break;
                    //System.out.println();
                
            }            
            
        } catch (FileNotFoundException ex) {
            logger.error("error pada method parseSalesman", ex);
        } catch (IOException ex) {
            logger.error("error pada method parseSalesman", ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                logger.error("error pada method parseSalesman", ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
        
    }
    
}
