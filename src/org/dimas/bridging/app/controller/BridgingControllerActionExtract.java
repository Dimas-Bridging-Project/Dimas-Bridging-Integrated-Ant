package org.dimas.bridging.app.controller;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.bagus.common.parser.csv.FileManager;
import org.config.spring.hibernate.dao.pokari.OutputArCustomerDao;
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.ScyBDItem;
import org.config.spring.hibernate.model.ScyPenyesuaianItem;
import org.config.spring.hibernate.model.ScyReturPabrikItem;
import org.config.spring.hibernate.model.Stock;
import org.config.spring.hibernate.model.Sysvar;
import org.config.spring.hibernate.model.TAdjstk;
import org.config.spring.hibernate.model.TDatdpr;
import org.config.spring.hibernate.model.TDatdsl;
import org.config.spring.hibernate.model.TDatdsr;
import org.config.spring.hibernate.model.TDatsri;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.config.spring.hibernate.model.TMasterSalesman;
import org.config.spring.hibernate.model.TOutlet;
import org.config.spring.hibernate.model.TSalesman;
import org.config.spring.hibernate.model.TStok;
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.config.spring.hibernate.model.pokari.OutputArCustomer;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrder;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDetail;
import org.config.spring.hibernate.model.pokari.OutputCanDDeliveryOrderItemDisc;
import org.config.spring.hibernate.model.pokari.OutputSpEmployee;
import org.config.spring.hibernate.model.pokari.OutputSpEmployeeTarget;
import org.config.spring.hibernate.model.pokari.OutputSpEmployeeTargetItemDetail;
import org.config.spring.hibernate.model.pokari.SpEmployee;
import org.config.spring.hibernate.model.pokari.SpEmployeeTarget;
import org.config.spring.hibernate.model.pokari.SpEmployeeTargetItemDetail;
import org.dimas.bridging.email.SendEmailAttachment;
import org.dimas.bridging.export.ExportTAdjstk;
import org.dimas.bridging.export.ExportTDatdpr;
import org.dimas.bridging.export.ExportTDatdsl;
import org.dimas.bridging.export.ExportTDatdsr;
import org.dimas.bridging.export.ExportTDatsri;
import org.dimas.bridging.export.ExportTOutlet;
import org.dimas.bridging.export.ExportTSalesman;
import org.dimas.bridging.export.ExportTStok;
import org.dimas.bridging.export.pokari.ExportArCustomer;
import org.dimas.bridging.export.pokari.ExportCanDDeliveryOrder;
import org.dimas.bridging.export.pokari.ExportCanDDeliveryOrderItemDetail;
import org.dimas.bridging.export.pokari.ExportCanDDeliveryOrderItemDisc;
import org.dimas.bridging.export.pokari.ExportSpEmployee;
import org.dimas.bridging.export.pokari.ExportSpEmployeeTarget;
import org.dimas.bridging.export.pokari.ExportSpEmployeeTargetItemDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yhawin
 */
public class BridgingControllerActionExtract {
    private static final Logger logger = LoggerFactory.getLogger(BridgingControllerActionExtract.class);
    private BridgingController controller;

    BridgingControllerActionExtract(BridgingController controller) {
        this.controller = controller;
        initAction();
        
    }
    public void initAction(){
         initActionExtractKekDefault();
         initActionExtractKek1();
         initActionExtractPokari1();
    
    }
    void initActionExtractKekDefault(){
         controller.getView().getBtnPathOutput().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnPathOutput();
             }

         });
         controller.getView().getBtnExtractAll().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractAll();
             }

         });
         //Button Extract Dibawah ini tidak dipakai kecuali All
          controller.getView().getBtnExtractClient().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractClient();
             }
         });
         controller.getView().getBtnExtractSales().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractSales();
             }
         });
         controller.getView().getBtnExtractSo().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractSo();
             }
         });
         controller.getView().getBtnExtractStock().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractStock();
             }
         });
         
         //Ekstract diatas tidak dipakai 
         controller.getView().getBtnExtractMSalesman().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractMSalesman();
             }
         });
         controller.getView().getBtnExtractMSlsOut().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractMSlsOut();
             }
         });
         controller.getView().getBtnExtractTAdjStk().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTAdjStk();
             }
         });
         controller.getView().getBtnExtractTDatdpr().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatdpr();
             }
         });
         controller.getView().getBtnExtractTDatdsl().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatdsl();
             }
         });
         controller.getView().getBtnExtractTDatdsr().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatdsr();
             }
         });
         controller.getView().getBtnExtractTDatsri().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatsri();
             }
         });
         controller.getView().getBtnExtractTStok().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTStok();
             }
         });
         controller.getView().getBtnKirimByEmail().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnKirimByEmail();
             }
         });
    }
    void initActionExtractPokari1(){
        controller.getView().getjPanelGenerateExtractPokari1().getBtnExtractAll().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aksiBtnExtractAllPokari();
            }
        });
        controller.getView().getjPanelGenerateExtractPokari1().getBtnExtractArCustomer().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aksiBtnExtractArCustomerPokari();
            }
        });
        controller.getView().getjPanelGenerateExtractPokari1().getBtnExtractCanDDeliveryOrder().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aksiBtnExtractCanDDeliveryOrderPokari();
            }
        });
        controller.getView().getjPanelGenerateExtractPokari1().getBtnExtractCanDDeliveryOrderItemDetail().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aksiBtnExtractCanDDeliveryOrderItemDetailPokari();
            }
        });
        controller.getView().getjPanelGenerateExtractPokari1().getBtnExtractCanDDeliveryOrderItemDisc().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aksiBtnExtractCanDDeliveryOrderItemDiscPokari();
            }
        });
        controller.getView().getjPanelGenerateExtractPokari1().getBtnExtractSpEmployee().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aksiBtnExtractSpEmployeePokari();
            }
        });
        controller.getView().getjPanelGenerateExtractPokari1().getBtnExtractSpEmployeeTarget().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aksiBtnExtractSpEmployeeTargetPokari();
            }
        });
        controller.getView().getjPanelGenerateExtractPokari1().getBtnExtractSpEmployeeTargetItemDetail().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aksiBtnExtractSpEmployeeTargetItemDetailPokari();
            }
        });
        controller.getView().getjPanelGenerateExtractPokari1().getBtnKirimByEmail().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aksiBtnKirimByEmailPokari();
            }
        });
        controller.getView().getjPanelGenerateExtractPokari1().getBtnPathOutput().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aksiBtnPathOutputPokari();
            }
        });
    }    
    void initActionExtractKek1(){
         controller.getView().getjPanelGenerateExtractKek1().getBtnPathOutput().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnPathOutput();
             }

         });
         controller.getView().getjPanelGenerateExtractKek1().getBtnExtractAll().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractAll();
             }

         });
         
         //Ekstract diatas tidak dipakai 
         controller.getView().getjPanelGenerateExtractKek1().getBtnExtractMSalesman().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractMSalesman();
             }
         });
         controller.getView().getjPanelGenerateExtractKek1().getBtnExtractMSlsOut().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractMSlsOut();
             }
         });
         controller.getView().getjPanelGenerateExtractKek1().getBtnExtractTAdjStk().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTAdjStk();
             }
         });
         controller.getView().getjPanelGenerateExtractKek1().getBtnExtractTDatdpr().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatdpr();
             }
         });
         controller.getView().getjPanelGenerateExtractKek1().getBtnExtractTDatdsl().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatdsl();
             }
         });
         controller.getView().getjPanelGenerateExtractKek1().getBtnExtractTDatdsr().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatdsr();
             }
         });
         controller.getView().getjPanelGenerateExtractKek1().getBtnExtractTDatsri().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTDatsri();
             }
         });
         controller.getView().getjPanelGenerateExtractKek1().getBtnExtractTStok().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractTStok();
             }
         });
         controller.getView().getjPanelGenerateExtractKek1().getBtnKirimByEmail().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnKirimByEmail();
             }
         });
    }
     
    /**
     * WE START TO DECLARE METHOD ACTION
     */    
    public boolean isFileTemplateExits(String path){
        boolean ada = true;
                    
                    String theFilePath = path;
//                    controller.getModel().setCurrentPath(theFilePath);
                    
                    //JIKA FILE YANG DIBUTUHKAN ADA MAKA AKAN DISET LOKASI YANG BENAR : JIKA TIDAK ADA MAKA TAMPIL PESAN
                    boolean templateKurang = false;
                    List<String> listMessageFilePathKurang = new ArrayList<>();
                    
                    File file1 = new File(theFilePath + File.separator + "Ar_Customer (Master Otlet).xls");
                    if (! file1.exists()){
                        templateKurang = true;
                        listMessageFilePathKurang.add("Ar_Customer (Master Otlet).xls");
                        //messageFilePathKurang[0] = "Ar_Customer (Master Otlet).xlsx";
                    }
                    File file2 = new File(theFilePath + File.separator + "Can_DDeliveryOrder (Transaksi DO-Return).xls");
                    if (! file2.exists()){
                        templateKurang = true;
                        listMessageFilePathKurang.add("Can_DDeliveryOrder (Transaksi DO-Return).xls");
                    }
                    File file3 = new File(theFilePath + File.separator + "Sp_Employee (Master Salesman).xls");
                    if (! file3.exists()){
                        templateKurang = true;
                        listMessageFilePathKurang.add("Sp_Employee (Master Salesman).xls");
                    }
                    File file4 = new File(theFilePath + File.separator + "Sp_EmployeeTarget (Target Salesman).xls");
                    if (! file4.exists()){
                        templateKurang = true;
                        listMessageFilePathKurang.add("Sp_EmployeeTarget (Target Salesman).xls");
                    }
                    
                    if (templateKurang){
                        String message = "";
                        int pencacah = 1;
                        for (String item: listMessageFilePathKurang) {
                            message += pencacah++ + ". " + item.trim() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, "File Template Berikut Tidak Ada: \n"
                                + message, "Warning", JOptionPane.ERROR_MESSAGE);          
                        ada = false;
                    }
                    
                    
                
        return ada;
    }
   public void aksiBtnExtractAllPokari(){
       List<String> templateKurang = new ArrayList<String>();
       
       if (JOptionPane.showConfirmDialog(null, "Proses extract akan memakan waktu yang agak lama!.. Lanjutkan Extract?", "Konfirmasi", 
               JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.OK_OPTION){
       
            //1. COPY FILE TEMPLATE IDos: I am using Spring framework
            String inputDirString = controller.getView().getTextKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation().getText().trim();
            String outputDirString = controller.getView().getTextPathOutput().getText().trim();

            //KONFIRMASI KEBERADAAN FILE Template
            isFileTemplateExits(inputDirString);
            
            if (! inputDirString.trim().substring(inputDirString.trim().length()-1, inputDirString.trim().length()).equals(File.separator)) 
                inputDirString += File.separator;

            if (!outputDirString.trim().substring(outputDirString.trim().length()-1,outputDirString.trim().length()).equals(File.separator)) 
                outputDirString += File.separator;
            //1. ArCustomer
            String inputFileString = inputDirString + "Ar_Customer (Master Otlet).xls";
            String outputFileString = outputDirString + "Ar_Customer (Master Otlet).xls";
            FileManager fileManager = new FileManager();
            try {
                 fileManager.copy(inputFileString, outputFileString, true);
            } catch(Exception ex){
                templateKurang.add("Ar_Customer (Master Otlet).xlsx");
                logger.error("Extract: Error Copy ArCustomer template");
            }
            //2. CanDDeliveryOrder
            inputFileString = inputDirString + "Can_DDeliveryOrder (Transaksi DO-Return).xls";
            outputFileString = outputDirString + "Can_DDeliveryOrder (Transaksi DO-Return).xls";
            fileManager = new FileManager();
            try {
                 fileManager.copy(inputFileString, outputFileString, true);
            } catch(Exception ex){
                templateKurang.add("Can_DDeliveryOrder (Transaksi DO-Return).xls");
                logger.error("Extract: Error Copy CanDDeliveryOrder template");
            }
            //3. SpEmployee
            inputFileString = inputDirString + "Sp_Employee (Master Salesman).xls";
            outputFileString = outputDirString + "Sp_Employee (Master Salesman).xls";
            fileManager = new FileManager();
            try {
                 fileManager.copy(inputFileString, outputFileString, true);
            } catch(Exception ex){
                templateKurang.add("Sp_Employee (Master Salesman).xls");
                logger.error("Extract: Error Copy SpEmployee template");
            }
            //4. SpEmployeeTarget>> Tidak Wajib
            inputFileString = inputDirString + "Sp_EmployeeTarget (Target Salesman).xls";
            outputFileString = outputDirString + "Sp_EmployeeTarget (Target Salesman).xls";
            fileManager = new FileManager();
            try {
                 fileManager.copy(inputFileString, outputFileString, true);
            } catch(Exception ex){
                logger.error("Extract: Error Copy SpEmployeeTarget template");
            }

            if (templateKurang.size()>0) {
                String message = "";
                int pencacah = 1;
                for (String item: templateKurang) {
                    message += pencacah++ + ". " + item.trim() + "\n";
                }
                
                JOptionPane.showMessageDialog(null, "Template file berikut tidak bisa tercopy ke folder extract \n" +
                        message + "\n Cek File tersebut pada: \n" + inputDirString, "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
            

                   try {
                        controller.getView().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                        try {
                            aksiBtnExtractArCustomerPokari();
                        } catch(Exception ex){}

                        try {
                            aksiBtnExtractCanDDeliveryOrderItemDetailPokari();
                        }catch(Exception ex){}

                        try {
                            aksiBtnExtractCanDDeliveryOrderItemDiscPokari();            
                        }catch(Exception ex){}

                        try {
                            aksiBtnExtractCanDDeliveryOrderPokari();
                        }catch(Exception ex){}

                        try{
                            aksiBtnExtractSpEmployeePokari();
                        } catch(Exception ex){}

            //            aksiBtnExtractSpEmployeeTargetItemDetailPokari();
            //            aksiBtnExtractSpEmployeeTargetPokari();

                        //JOptionPane.showMessageDialog(this, "Extract Data Suksess..", "Info..", JOptionPane.INFORMATION_MESSAGE);
            //     * SORRY EMAIL IS STILL MANUALLY
                        //controller.getView().getBtnKirimByEmail().setEnabled(true);
                        if (JOptionPane.showConfirmDialog(null, "Extract Data Suksess..\n\n "
                                + "Buka File Explorer Hasil Extract?", "Konfimasi", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
                            //Buka File Exploref
                            File localFilePath = new File(controller.getView().getTextPathOutput().getText());
                            java.awt.Desktop.getDesktop().open(localFilePath);
                        }

                   }catch(Exception ex) {
                       logger.error("method aksiBtnExtractAll", ex);
                   }finally {
                        controller.getView().setCursor(Cursor.getDefaultCursor());          
                   } 
                   
         }       
       }       
    }
   
   public void aksiBtnExtractArCustomerPokari(){
         if ((! controller.getView().getjPanelGenerateExtractPokari1().getTextPathOutput().getText().trim().equals("")) 
                 && (controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate()!=null)) {
             
            String message = "ArCustomer: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate());
            /**
             * KEGIATAN WAJIB
             */
            controller.getModel().loadMappingArCustomerToMem();
            controller.getModel().loadMappingProductToMem();
            controller.getModel().loadMappingSpEmployeeToMem();
            //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            //Sourcenya
/**
 * SOURCE :
 */            
            List<ArCustomer> lst = new ArrayList<>();
            lst =  controller.getModel().arCustomerDaoMem.findAll();

            String outputDirString = controller.getView().getTextPathOutput().getText().trim();            
            if (!outputDirString.trim().substring(outputDirString.trim().length()-1,outputDirString.trim().length()).equals(File.separator)) 
                outputDirString += File.separator;
            String outputFileString = outputDirString + "Ar_Customer (Master Otlet).xls";
            
            ExportArCustomer f = new ExportArCustomer();
            String prefix = "";
            //prefix= controller.getView().getTextDistributorCode().getText();
            List<OutputArCustomer> outputArCustomers = new ArrayList<>();
//            outputArCustomers = f.exportFromListToFileExel(outputFileString, controller.getView().getjDateChooserExtract().getDate(),  lst);
            outputArCustomers = f.exportFromListToFileExelUsingTemplate(outputFileString,  lst);
            
            //HAPUS OUTPUT DULU SEBELUM DITAMBAH
            List<OutputArCustomer> listOutputArCustomer = new ArrayList<OutputArCustomer>();
            listOutputArCustomer = controller.getModel().outputArCustomerDaoMem.findAll();
            for (OutputArCustomer o: listOutputArCustomer){
                controller.getModel().outputArCustomerDaoMem.delete(o);
            }        
            for (OutputArCustomer output: outputArCustomers ) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().outputArCustomerDao.saveOrUpdate(output);
                    } else {
                        controller.getModel().outputArCustomerDaoMem.saveOrUpdate(output);                               
                    }
                    jmlRecordSuccess+=1;
//                    jmlTotal1Success += output.getNetValue();
//                    jmlTotal2Success += output.getGrossValue();
                    
                } catch (Exception ex){
                    jmlRecordFail+=1;
//                    jmlTotal1Fail += output.getNetValue();
//                    jmlTotal2Fail += output.getGrossValue();
                    
                    logger.error("proses DAO saveOrUpdate pada method aksiBtnExtractArCustomerPokari", ex);
                }
            }
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputPokariArCustomerReload();
                
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) 
                        + ",  NET Success: " + String.valueOf(nf.format(jmlTotal1Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail)) 
                        + ",  GROSS Success: " + String.valueOf(nf.format(jmlTotal2Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal2Fail)) 
                        ;          
                    controller.getView().getjPanelSubOutputPokari1().getLabelOutputPokariArCustomerFooter().setText(message); 
            
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
   }
   public void aksiBtnExtractCanDDeliveryOrderPokari(){
         if ((! controller.getView().getjPanelGenerateExtractPokari1().getTextPathOutput().getText().trim().equals("")) 
                 && (controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate()!=null)) {
             
            String message = "CanDDeliveryOrder: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
             
//            Calendar cal = Calendar.getInstance();
//            cal.setTime(controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate());

            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate());
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate());
            
            /**
             * KEGIATAN WAJIB
             */
            controller.getModel().loadMappingArCustomerToMem();
            controller.getModel().loadMappingProductToMem();
            controller.getModel().loadMappingSpEmployeeToMem();
/**
 * SOURCE :
 */                        
            //List<CanDDeliveryOrder> lst = new ArrayList<>();
            List<JHeader> lst = new ArrayList<>();
            //SORTIR TANGGAL PAKE DAO DISINI
            lst = controller.getModel().jheaderDaoMem.findAllByDate(cal1.getTime(), cal2.getTime());
//            lst = controller.getModel().jheaderDaoMem.findAll();
            //PREFIX FAKTUR
            Sysvar sysvar; 
            String prefixFaktur = "0000-";
            sysvar = controller.getModel().sysvarDao.findById("_PO_PRE");
            if (sysvar != null) { 
               prefixFaktur = sysvar.getNilaiString1();
            }
 
            String outputDirString = controller.getView().getTextPathOutput().getText().trim();            
            if (!outputDirString.trim().substring(outputDirString.trim().length()-1,outputDirString.trim().length()).equals(File.separator)) 
                outputDirString += File.separator;
            String outputFileString = outputDirString + "Can_DDeliveryOrder (Transaksi DO-Return).xls";
            
            
            ExportCanDDeliveryOrder f = new ExportCanDDeliveryOrder();
            String prefix = "";
            //prefix= controller.getView().getTextDistributorCode().getText();
//            List<OutputCanDDeliveryOrder> outputs = f.exportFromListToFileExel(outputFileString, controller.getView().getjDateChooserExtract().getDate(),  lst);
            List<OutputCanDDeliveryOrder> outputs = f.exportFromListToFileExelUsingTemplate(outputFileString, lst, prefixFaktur);
            
            //HAPUS OUTPUT DULU SEBELUM DITAMBAH
            List<OutputCanDDeliveryOrder> listOutputOutputCanDDeliveryOrder = new ArrayList<OutputCanDDeliveryOrder>();
            listOutputOutputCanDDeliveryOrder = controller.getModel().outputCanDDeliveryOrderDaoMem.findAll();
            for (OutputCanDDeliveryOrder o: listOutputOutputCanDDeliveryOrder){
                controller.getModel().outputCanDDeliveryOrderDaoMem.delete(o);
            }
            for (OutputCanDDeliveryOrder output:  outputs) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().outputCanDDeliveryOrderDao.saveOrUpdate(output);
                    } else {
                        controller.getModel().outputCanDDeliveryOrderDaoMem.saveOrUpdate(output);                               
                    }
                    jmlRecordSuccess+=1;
//                    jmlTotal1Success += output.getNetValue();
//                    jmlTotal2Success += output.getGrossValue();
                    
                } catch (Exception ex){
                    jmlRecordFail+=1;
//                    jmlTotal1Fail += output.getNetValue();
//                    jmlTotal2Fail += output.getGrossValue();

                    logger.error("proses DAO saveOrUpdate pada method OutputCanDDeliveryOrder", ex);
                }
            }
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputPokariCanDDeliveryOrderReload();
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) 
                        + ",  NET Success: " + String.valueOf(nf.format(jmlTotal1Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail)) 
                        + ",  GROSS Success: " + String.valueOf(nf.format(jmlTotal2Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal2Fail)) 
                        ;          
                    controller.getView().getjPanelSubOutputPokari1().getLabelOutputPokariCanDDeliveryOrderFooter().setText(message); 
                             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
   }
   public void aksiBtnExtractCanDDeliveryOrderItemDetailPokari(){
         if ((! controller.getView().getjPanelGenerateExtractPokari1().getTextPathOutput().getText().trim().equals("")) 
                 && (controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate()!=null)) {
             
            String message = "CanDDeliveryOrderItemDetail: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
             
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate());
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate());
            
            /**
             * KEGIATAN WAJIB
             */
            controller.getModel().loadMappingArCustomerToMem();
            controller.getModel().loadMappingProductToMem();
            controller.getModel().loadMappingSpEmployeeToMem();
/**
 * SOURCE :
 */            
//            List<CanDDeliveryOrderItemDetail> lst = new ArrayList<>();
            List<JHeader> lst = new ArrayList<>();
            lst = controller.getModel().jheaderDaoMem.findAllByDate(cal1.getTime(), cal2.getTime());
            
            //PREFIX FAKTUR
            Sysvar sysvar; 
            String prefixFaktur = "0000-";
            sysvar = controller.getModel().sysvarDao.findById("_PO_PRE");
            if (sysvar != null) { 
               prefixFaktur = sysvar.getNilaiString1();
            }
            
            String outputDirString = controller.getView().getTextPathOutput().getText().trim();            
            if (!outputDirString.trim().substring(outputDirString.trim().length()-1,outputDirString.trim().length()).equals(File.separator)) 
                outputDirString += File.separator;
            String outputFileString = outputDirString + "Can_DDeliveryOrder (Transaksi DO-Return).xls";
            
            ExportCanDDeliveryOrderItemDetail f = new ExportCanDDeliveryOrderItemDetail();
            String prefix = "";
            //prefix= controller.getView().getTextDistributorCode().getText();
//            List<OutputCanDDeliveryOrderItemDetail> outputs = f.exportFromListToFileExel(outputFileString, controller.getView().getjDateChooserExtract().getDate(),  lst);
            List<OutputCanDDeliveryOrderItemDetail> outputs = f.exportFromListToFileExelUsingTemplate(outputFileString, lst, prefixFaktur);

            //HAPUS OUTPUT DULU SEBELUM DITAMBAH
            List<OutputCanDDeliveryOrderItemDetail> listOutputOutputCanDDeliveryOrderItemDetail = new ArrayList<OutputCanDDeliveryOrderItemDetail>();
            listOutputOutputCanDDeliveryOrderItemDetail = controller.getModel().outputCanDDeliveryOrderItemDetailDaoMem.findAll();
            controller.getModel().outputCanDDeliveryOrderItemDetailDaoMem.deleteAll(listOutputOutputCanDDeliveryOrderItemDetail);
            
            for (OutputCanDDeliveryOrderItemDetail output:  outputs) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().outputCanDDeliveryOrderItemDetailDao.saveOrUpdate(output);
                    } else {
                        controller.getModel().outputCanDDeliveryOrderItemDetailDaoMem.saveOrUpdate(output);                               
                    }
                    jmlRecordSuccess+=1;
                    jmlTotal1Success += output.getDecPrice()*output.getDecQty();
//                    jmlTotal2Success += output.getGrossValue();
                    
                } catch (Exception ex){
                    jmlRecordFail+=1;
                    jmlTotal1Fail += output.getDecPrice()*output.getDecQty();
//                    jmlTotal2Fail += output.getGrossValue();

                    logger.error("proses DAO saveOrUpdate pada method CanDDeliveryOrderItemDetail", ex);
                }
            }
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputPokariCanDDeliveryOrderDetailReload();
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) 
                        + ",  NET Success: " + String.valueOf(nf.format(jmlTotal1Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail)) 
                        + ",  GROSS Success: " + String.valueOf(nf.format(jmlTotal2Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal2Fail)) 
                        ;          
                    controller.getView().getjPanelSubOutputPokari1().getLabelOutputPokariCanDDeliveryOrderDetailFooter().setText(message); 
                                    
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
   }

    /**
     *Dokumen
     */
    public void aksiBtnExtractCanDDeliveryOrderItemDiscPokari(){
         if ((! controller.getView().getjPanelGenerateExtractPokari1().getTextPathOutput().getText().trim().equals("")) 
                 && (controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate()!=null)) {
             
            String message = "CanDDeliveryOrderItemDisc: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
             
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate());
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate());
            
            /**
             * KEGIATAN WAJIB
             */
            controller.getModel().loadMappingArCustomerToMem();
            controller.getModel().loadMappingProductToMem();
            controller.getModel().loadMappingSpEmployeeToMem();
            
/**
 * SOURCE :
 */            
//            List<CanDDeliveryOrderItemDisc> lst = new ArrayList<>();
            List<JHeader> lst = new ArrayList<>();
            lst = controller.getModel().jheaderDaoMem.findAllByDate(cal1.getTime(), cal2.getTime());

            //PREFIX FAKTUR
            Sysvar sysvar; 
            String prefixFaktur = "0000-";
            sysvar = controller.getModel().sysvarDao.findById("_PO_PRE");
            if (sysvar != null) { 
               prefixFaktur = sysvar.getNilaiString1();
            }
             
            String outputDirString = controller.getView().getTextPathOutput().getText().trim();            
            if (!outputDirString.trim().substring(outputDirString.trim().length()-1,outputDirString.trim().length()).equals(File.separator)) 
                outputDirString += File.separator;
            String outputFileString = outputDirString + "Can_DDeliveryOrder (Transaksi DO-Return).xls";
            
            ExportCanDDeliveryOrderItemDisc f = new ExportCanDDeliveryOrderItemDisc();
            String prefix = "";
            //prefix= controller.getView().getTextDistributorCode().getText();
            List<OutputCanDDeliveryOrderItemDisc> outputs = f.exportFromListToFileExelUsingTemplate(outputFileString,lst, prefixFaktur);

            //HAPUS OUTPUT DULU SEBELUM DITAMBAH
            List<OutputCanDDeliveryOrderItemDisc> listOutputOutputCanDDeliveryOrderItemDisc = new ArrayList<OutputCanDDeliveryOrderItemDisc>();
            listOutputOutputCanDDeliveryOrderItemDisc = controller.getModel().outputCanDDeliveryOrderItemDiscDaoMem.findAll();
            for (OutputCanDDeliveryOrderItemDisc o: listOutputOutputCanDDeliveryOrderItemDisc){
                controller.getModel().outputCanDDeliveryOrderItemDiscDaoMem.delete(o);
            }
            for (OutputCanDDeliveryOrderItemDisc output: outputs  ) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().outputCanDDeliveryOrderItemDiscDao.saveOrUpdate(output);
                    } else {
                        controller.getModel().outputCanDDeliveryOrderItemDiscDaoMem.saveOrUpdate(output);                               
                    }
                    jmlRecordSuccess+=1;
                    jmlTotal1Success += output.getDecDisc();
//                    jmlTotal2Success += output.getGrossValue();
                    
                } catch (Exception ex){
                    jmlRecordFail+=1;
                    jmlTotal1Fail += output.getDecDisc();
//                    jmlTotal2Fail += output.getGrossValue();

                    logger.error("proses DAO saveOrUpdate pada method ", ex);
                }
            }
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputPokariCanDDeliveryOrderDiscReload();
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) 
                        + ",  NET Success: " + String.valueOf(nf.format(jmlTotal1Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail)) 
                        + ",  GROSS Success: " + String.valueOf(nf.format(jmlTotal2Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal2Fail)) 
                        ;          
                    controller.getView().getjPanelSubOutputPokari1().getLabelOutputPokariCanDDeliveryOrderDiscFooter().setText(message); 
                                                                 
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
   }
   public void aksiBtnExtractSpEmployeePokari(){
         if ((! controller.getView().getjPanelGenerateExtractPokari1().getTextPathOutput().getText().trim().equals("")) 
                 && (controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate()!=null)) {
             
            String message = "SpEmployee: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
             
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate());
            /**
             * KEGIATAN WAJIB
             */
            controller.getModel().loadMappingArCustomerToMem();
            controller.getModel().loadMappingProductToMem();
            controller.getModel().loadMappingSpEmployeeToMem();
/**
 * SOURCE :
 */            
            List<SpEmployee> lst = new ArrayList<>();
            lst = controller.getModel().spEmployeeDaoMem.findAll();

            String outputDirString = controller.getView().getTextPathOutput().getText().trim();            
            if (!outputDirString.trim().substring(outputDirString.trim().length()-1,outputDirString.trim().length()).equals(File.separator)) 
                outputDirString += File.separator;
            String outputFileString = outputDirString + "Sp_Employee (Master Salesman).xls";
            
            ExportSpEmployee f = new ExportSpEmployee();
            String prefix = "";
            //prefix= controller.getView().getTextDistributorCode().getText();
            List<OutputSpEmployee> outputs = f.exportFromListToFileExelUsingTemplate(outputFileString, lst);

            //HAPUS OUTPUT DULU SEBELUM DITAMBAH
            List<OutputSpEmployee> listOutputSpEmployee = new ArrayList<OutputSpEmployee>();
            listOutputSpEmployee = controller.getModel().outputSpEmployeeDaoMem.findAll();
            for (OutputSpEmployee o: listOutputSpEmployee){
                controller.getModel().outputSpEmployeeDaoMem.delete(o);
            }
            for (OutputSpEmployee output: outputs ) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().outputSpEmployeeDao.saveOrUpdate(output);
                    } else {
                        controller.getModel().outputSpEmployeeDaoMem.saveOrUpdate(output);                               
                    }
                    jmlRecordSuccess+=1;
//                    jmlTotal1Success += output.getDecDisc();
//                    jmlTotal2Success += output.getGrossValue();
                    
                } catch (Exception ex){
                    jmlRecordFail+=1;
//                    jmlTotal1Fail += output.getDecDisc();
//                    jmlTotal2Fail += output.getGrossValue();

                    logger.error("proses DAO saveOrUpdate pada method SpEmployee", ex);
                }
            }
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputPokariSpEmployeeReload();
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) 
                        + ",  NET Success: " + String.valueOf(nf.format(jmlTotal1Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail)) 
                        + ",  GROSS Success: " + String.valueOf(nf.format(jmlTotal2Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal2Fail)) 
                        ;          
                    controller.getView().getjPanelSubOutputPokari1().getLabelOutputPokariSpEmployeeFooter().setText(message); 
                             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
   }
   public void aksiBtnExtractSpEmployeeTargetPokari(){
         if ((! controller.getView().getjPanelGenerateExtractPokari1().getTextPathOutput().getText().trim().equals("")) 
                 && (controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate()!=null)) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate());
            /**
             * KEGIATAN WAJIB
             */
            controller.getModel().loadMappingArCustomerToMem();
            controller.getModel().loadMappingProductToMem();
            controller.getModel().loadMappingSpEmployeeToMem();
            //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            //Sourcenya
            List<SpEmployeeTarget> lst = new ArrayList<>();
            
            String outputDirString = controller.getView().getTextPathOutput().getText().trim();            
            if (!outputDirString.trim().substring(outputDirString.trim().length()-1,outputDirString.trim().length()).equals(File.separator)) 
                outputDirString += File.separator;
            String outputFileString = outputDirString + "Sp_EmployeeTarget (Target Salesman).xls";
            
            ExportSpEmployeeTarget f = new ExportSpEmployeeTarget();
            String prefix = "";
            //prefix= controller.getView().getTextDistributorCode().getText();
            List<OutputSpEmployeeTarget> outputs = f.exportFromListToFileExelUsingTemplate(outputFileString, lst);

            //HAPUS OUTPUT DULU SEBELUM DITAMBAH
            List<OutputSpEmployeeTarget> listOutputSpEmployeeTarget = new ArrayList<OutputSpEmployeeTarget>();
            listOutputSpEmployeeTarget = controller.getModel().outputSpEmployeeTargetDaoMem.findAll();
            for (OutputSpEmployeeTarget o: listOutputSpEmployeeTarget){
                controller.getModel().outputSpEmployeeTargetDaoMem.delete(o);
            }
            for (OutputSpEmployeeTarget output:  outputs) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().outputSpEmployeeTargetDao.saveOrUpdate(output);
                    } else {
                        controller.getModel().outputSpEmployeeTargetDaoMem.saveOrUpdate(output);                               
                    }
                } catch (Exception ex){
                    logger.error("proses DAO saveOrUpdate pada method SpEmployeeTarget", ex);
                }
            }
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputPokariEmployeeTargetReload();
                             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
   }
   public void aksiBtnExtractSpEmployeeTargetItemDetailPokari(){
         if ((! controller.getView().getjPanelGenerateExtractPokari1().getTextPathOutput().getText().trim().equals("")) 
                 && (controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate()!=null)) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjPanelGenerateExtractPokari1().getjDateChooserExtract().getDate());
            /**
             * KEGIATAN WAJIB
             */
            controller.getModel().loadMappingArCustomerToMem();
            controller.getModel().loadMappingProductToMem();
            controller.getModel().loadMappingSpEmployeeToMem();
            //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            //Sourcenya
            List<SpEmployeeTargetItemDetail> lst = new ArrayList<>();
            
            String outputDirString = controller.getView().getTextPathOutput().getText().trim();            
            if (!outputDirString.trim().substring(outputDirString.trim().length()-1,outputDirString.trim().length()).equals(File.separator)) 
                outputDirString += File.separator;
            String outputFileString = outputDirString + "Sp_EmployeeTarget (Target Salesman).xls";
            
            ExportSpEmployeeTargetItemDetail f = new ExportSpEmployeeTargetItemDetail();
            String prefix = "";
            //prefix= controller.getView().getTextDistributorCode().getText();
            List<OutputSpEmployeeTargetItemDetail> outputs = f.exportFromListToFileExelUsingTemplate(outputFileString, lst);

            //HAPUS OUTPUT DULU SEBELUM DITAMBAH
            List<OutputSpEmployeeTargetItemDetail> listOutputSpEmployeeTargetItemDetail = new ArrayList<OutputSpEmployeeTargetItemDetail>();
            listOutputSpEmployeeTargetItemDetail = controller.getModel().outputSpEmployeeTargetItemDetailDaoMem.findAll();
            for (OutputSpEmployeeTargetItemDetail o: listOutputSpEmployeeTargetItemDetail){
                controller.getModel().outputSpEmployeeTargetItemDetailDaoMem.delete(o);
            }
            for (OutputSpEmployeeTargetItemDetail output:  outputs) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().outputSpEmployeeTargetItemDetailDao.saveOrUpdate(output);
                    } else {
                        controller.getModel().outputSpEmployeeTargetItemDetailDaoMem.saveOrUpdate(output);                               
                    }
                } catch (Exception ex){
                    logger.error("proses DAO saveOrUpdate pada method SpEmployeeTargetItemDetail", ex);
                }
            }
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputPokariEmployeeTargetDetailReload();
                             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
   } 
   public void aksiBtnKirimByEmailPokari(){
   }
   
   public void aksiBtnPathOutputPokari(){
            JFileChooser fileChooser1 =  new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser1.setDialogTitle("Path Extract File");        

            if (fileChooser1.showOpenDialog(null) ==JFileChooser.APPROVE_OPTION){
                File filePath = fileChooser1.getSelectedFile();
                //currentPath = filePath.toString();            
                controller.getModel().setCurrentPath(filePath.toString());

                if (filePath != null) {
                    String strDirPath = filePath.getAbsolutePath() + File.separator;
                    controller.getView().getTextPathOutput().setText(strDirPath);
                    controller.getView().getjPanelGenerateExtractPokari1().getTextPathOutput().setText(strDirPath);
                }
            }           
   
   }   
   
   //METHOD : EXTRACT KEK
    public void aksiBtnPathOutput() {
            JFileChooser fileChooser1 =  new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser1.setDialogTitle("Path Extract File");        

            if (fileChooser1.showOpenDialog(null) ==JFileChooser.APPROVE_OPTION){
                File filePath = fileChooser1.getSelectedFile();
                //currentPath = filePath.toString();            
                controller.getModel().setCurrentPath(filePath.toString());

                if (filePath != null) {
                    String strDirPath = filePath.getAbsolutePath() + File.separator;
                    controller.getView().getTextPathOutput().setText(strDirPath);
                }
            }           
    }
    public void aksiBtnExtractAll() {
       try {
            controller.getView().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            aksiBtnExtractMSalesman();
            aksiBtnExtractMSlsOut();
            aksiBtnExtractTStok();
            
            aksiBtnExtractTDatdsl();
            aksiBtnExtractTDatdsr();
            
            aksiBtnExtractTDatdpr();
            aksiBtnExtractTDatsri();
            
            aksiBtnExtractTAdjStk();
            
            //JOptionPane.showMessageDialog(this, "Extract Data Suksess..", "Info..", JOptionPane.INFORMATION_MESSAGE);
            
            controller.getView().getBtnKirimByEmail().setEnabled(true);
            if (JOptionPane.showConfirmDialog(null, "Extract Data Suksess..\n\n "
                    + "Buka File Explorer Hasil Extract?", "Konfimasi", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
                //Buka File Exploref
                File localFilePath = new File(controller.getView().getTextPathOutput().getText());
                java.awt.Desktop.getDesktop().open(localFilePath);
            }
                
       }catch(Exception ex) {
           logger.error("method aksiBtnExtractAll", ex);
       }finally {
            controller.getView().setCursor(Cursor.getDefaultCursor());          
       } 
       
       
   }  
    public void aksiBtnExtractMSalesman(){
         if ((! controller.getView().getTextPathOutput().getText().trim().equals("")) && (controller.getView().getjDateChooserExtract().getDate()!=null)) {
            //Tanggal Stock adalah sehari sebelum Tanggal transaksi
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjDateChooserExtract().getDate());
            //cal.add(Calendar.DATE, -1);
            //Date tanggalSebelum =  cal.getTime();

            controller.getModel().loadTMasterProductToMem();
            controller.getModel().loadTMasterOutletToMem();
            controller.getModel().loadTMasterSalesmanToMem();
            //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            //Sourcenya
            List<TMasterSalesman> lst = new ArrayList<>();
            ExportTSalesman f = new ExportTSalesman();
            lst = controller.getModel().tMasterSalesmanDaoMem.findAll();
            //Ambil dari JTeksField Konfigurasi
            String prefix= controller.getView().getTextDistributorCode().getText();
            List<TSalesman> listTSalesman = f.exportToCsvFromListToFile(controller.getView().getTextPathOutput().getText() + prefix +"_MSALESMAN.TXT", 
                    controller.getView().getjDateChooserExtract().getDate(),  lst);
            
            for (TSalesman itm: listTSalesman ) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().tSalesmanDao.saveOrUpdate(itm);
                    } else {
                        controller.getModel().tSalesmanDaoMem.saveOrUpdate(itm);       
                        
                    }
                } catch (Exception ex){
                    logger.error("proses DAO saveOrUpdate pada method aksiBtnExtractMSalesman", ex);
                }
            }
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputTSalesmanReload();
                             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
        
    }        
    public void aksiBtnExtractMSlsOut() {
         if ((! controller.getView().getTextPathOutput().getText().trim().equals("")) && (controller.getView().getjDateChooserExtract().getDate()!=null)) {
            //Tanggal Stock adalah sehari sebelum Tanggal transaksi
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjDateChooserExtract().getDate());
            //cal.add(Calendar.DATE, -1);
            //Date tanggalSebelum =  cal.getTime();
            
            //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            controller.getModel().loadTMasterProductToMem();
            controller.getModel().loadTMasterOutletToMem();
            controller.getModel().loadTMasterSalesmanToMem();
            
            //Source-nya
            List<TMasterOutlet> lst = new ArrayList<>();
            lst = controller.getModel().tMasterOutletDaoMem.findAll();

            //Ambil dari JTeksField Konfigurasi
            String prefix= controller.getView().getTextDistributorCode().getText();
            ExportTOutlet f = new ExportTOutlet();
            List<TOutlet> listTOutlet = f.exportToCsvFromListToFile(controller.getView().getTextPathOutput().getText() + prefix +"_MSLSOUT.TXT", 
                    controller.getView().getjDateChooserExtract().getDate(),lst);
            
            for (TOutlet itm: listTOutlet ) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().tOutletDao.saveOrUpdate(itm);
                    } else {
                        controller.getModel().tOutletDaoMem.saveOrUpdate(itm);                        
                    }
                } catch (Exception ex){
                    logger.error("proses DAO saveOrUpdate pada method aksiBtnExtractMslsOut", ex);
                }
            } 
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputTOutletReload();                           
            
             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }      
    }
    public void aksiBtnExtractTAdjStk(){
         if ((! controller.getView().getTextPathOutput().getText().trim().equals("")) && (controller.getView().getjDateChooserExtract().getDate()!=null)) {
            //Tanggal Stock adalah sehari sebelum Tanggal transaksi
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjDateChooserExtract().getDate());
            //cal.add(Calendar.DATE, -1);
            //Date tanggalSebelum =  cal.getTime();
            
            //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            controller.getModel().loadTMasterProductToMem();
            controller.getModel().loadTMasterOutletToMem();
            controller.getModel().loadTMasterSalesmanToMem();
            
            //Sourcenya
            List<ScyPenyesuaianItem> lst = new ArrayList<>();
            ExportTAdjstk f = new ExportTAdjstk();
            lst=controller.getModel().scyPenyesuaianItemDaoMem.findAll();
            //Ambil dari JTeksField Konfigurasi
            String prefix= controller.getView().getTextDistributorCode().getText();
            
            List<TAdjstk> listTAjdstk = f.exportToCsvFromListToFile(controller.getView().getTextPathOutput().getText() + prefix +"_TADJSTK.TXT",
                    controller.getView().getjDateChooserExtract().getDate(), lst);
            
            //JOptionPane.showMessageDialog(rootPane, listTAjdstk.size());
            
            for (TAdjstk itm: listTAjdstk ) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().tAdjstkDao.saveOrUpdate(itm);
                    } else {
                        controller.getModel().tAdjstkDaoMem.saveOrUpdate(itm);                        
                    }
                } catch (Exception ex){
                    logger.error("proses DAO saveOrUpdate pada method aksiBtnExtractTAdjStk", ex);
                }
            }
          
            //JOptionPane.showMessageDialog(rootPane, tAdjstkDaoMem.countAll());            
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputTAdjstkReload();
                             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }        
    }
    public void aksiBtnExtractTDatdpr(){
         if ((! controller.getView().getTextPathOutput().getText().trim().equals("")) && (controller.getView().getjDateChooserExtract().getDate()!=null)) {
            //Tanggal Stock adalah sehari sebelum Tanggal transaksi
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjDateChooserExtract().getDate());
            //cal.add(Calendar.DATE, -1);
            //Date tanggalSebelum =  cal.getTime();
            
            //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            controller.getModel().loadTMasterProductToMem();
            controller.getModel().loadTMasterOutletToMem();
            controller.getModel().loadTMasterSalesmanToMem();
            
            //Sourcenya
            List<ScyBDItem> lst = new ArrayList<>();
            ExportTDatdpr f = new ExportTDatdpr();
            lst = controller.getModel().scyBDItemDaoMem.findAll();
            //Ambil dari JTeksField Konfigurasi
            String prefix= controller.getView().getTextDistributorCode().getText();
            List<TDatdpr> listTDatdpr = f.exportToCsvFromListToFile(controller.getView().getTextPathOutput().getText() + prefix +"_TDATDPR.TXT",
                   controller.getView().getjDateChooserExtract().getDate(), lst);
            for (TDatdpr itm: listTDatdpr ) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().tDatdprDao.saveOrUpdate(itm);
                    } else {
                        controller.getModel().tDatdprDaoMem.saveOrUpdate(itm);                        
                    }
                } catch (Exception ex){
                    logger.error("proses DAO saveOrUpdate pada method aksiBtnExtractTDatdpr", ex);
                }
            }
          
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputTDatdprReload();
                             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
    }
    public void aksiBtnExtractTDatdsl(){
         if ((! controller.getView().getTextPathOutput().getText().trim().equals("")) && (controller.getView().getjDateChooserExtract().getDate()!=null)) {
            //Tanggal Stock adalah sehari sebelum Tanggal transaksi
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjDateChooserExtract().getDate());
            //cal.add(Calendar.DATE, -1);
            //Date tanggalSebelum =  cal.getTime();
            
            //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            controller.getModel().loadTMasterProductToMem();
            controller.getModel().loadTMasterOutletToMem();
            controller.getModel().loadTMasterSalesmanToMem();
            
            //Sourcenya
            List<JHeader> lst = new ArrayList<>();
             ExportTDatdsl f = new ExportTDatdsl();
             lst = controller.getModel().jheaderDaoMem.findAll();
            //Ambil dari JTeksField Konfigurasi
            
            String prefix= controller.getView().getTextDistributorCode().getText();
            List<TDatdsl> listTDatdsl = f.exportToCsvFromListToFile(controller.getView().getTextPathOutput().getText() + prefix +"_TDATDSL.TXT", 
                   controller.getView().getjDateChooserExtract().getDate() ,lst, controller.getModel().getDatabaseMode());
            
            //JOptionPane.showMessageDialog(rootPane, lst.size());
            
            
            for (TDatdsl itm: listTDatdsl ) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().tDatdslDao.saveOrUpdate(itm);
                    } else {
                        controller.getModel().tDatdslDaoMem.saveOrUpdate(itm);                        
                    }
                } catch (Exception ex){
                    logger.error("proses DAO saveOrUpdate pada method aksiBtnExtractTDatdsl", ex);
                }
            }
            
            
            
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputTDatdslReload();
                             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
    }
    public void aksiBtnExtractTDatdsr(){
         if ((! controller.getView().getTextPathOutput().getText().trim().equals("")) && (controller.getView().getjDateChooserExtract().getDate()!=null)) {
            //Tanggal Stock adalah sehari sebelum Tanggal transaksi
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjDateChooserExtract().getDate());
            //cal.add(Calendar.DATE, -1);
            //Date tanggalSebelum =  cal.getTime();
            
            //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            controller.getModel().loadTMasterProductToMem();
            controller.getModel().loadTMasterOutletToMem();
            controller.getModel().loadTMasterSalesmanToMem();
            
            //Sourcenya
            List<JHeader> lst = new ArrayList<>();
             ExportTDatdsr f = new ExportTDatdsr();
             lst = controller.getModel().jheaderDaoMem.findAll();
            //Ambil dari JTeksField Konfigurasi
            String prefix= controller.getView().getTextDistributorCode().getText();
            List<TDatdsr> listTDatdsr = f.exportToCsvFromListToFile(controller.getView().getTextPathOutput().getText() + prefix +"_TDATDSR.TXT",
                    controller.getView().getjDateChooserExtract().getDate(),lst, controller.getModel().getDatabaseMode());
            for (TDatdsr itm: listTDatdsr ) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().tDatdsrDao.saveOrUpdate(itm);
                    } else {
                        controller.getModel().tDatdsrDaoMem.saveOrUpdate(itm);                        
                    }
                } catch (Exception ex){
                    logger.error("proses DAO saveOrUpdate pada method aksiBtnExtractTDatdsr", ex);
                }
            }
          
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputTDatdsrReload();
                             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
    }
    public void aksiBtnExtractTDatsri() {
         if ((! controller.getView().getTextPathOutput().getText().trim().equals("")) && (controller.getView().getjDateChooserExtract().getDate()!=null)) {
            //Tanggal Stock adalah sehari sebelum Tanggal transaksi
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjDateChooserExtract().getDate());
            //cal.add(Calendar.DATE, -1);
            //Date tanggalSebelum =  cal.getTime();
            
            //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            controller.getModel().loadTMasterProductToMem();
            controller.getModel().loadTMasterOutletToMem();
            controller.getModel().loadTMasterSalesmanToMem();
            
            //Sourcenya
            List<ScyReturPabrikItem> lst = new ArrayList<>();
            ExportTDatsri f = new ExportTDatsri();
            lst=controller.getModel().scyReturPabriItemkDaoMem.findAll();
            //Ambil dari JTeksField Konfigurasi
            String prefix= controller.getView().getTextDistributorCode().getText();
            List<TDatsri> listTDatsri = f.exportToCsvFromListToFile(controller.getView().getTextPathOutput().getText() + prefix +"_TDATSRI.TXT",
                    controller.getView().getjDateChooserExtract().getDate(), lst);
            for (TDatsri itm: listTDatsri ) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().tDatsriDao.saveOrUpdate(itm);
                    } else {
                        controller.getModel().tDatsriDaoMem.saveOrUpdate(itm);                        
                    }
                } catch (Exception ex){
                    logger.error("proses DAO saveOrUpdate pada method aksiBtnExtractTDatsri", ex);
                }
            }
          
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputTDatsriReload();
                             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
    }   
    public void aksiBtnExtractTStok(){
         if ((! controller.getView().getTextPathOutput().getText().trim().equals("")) && (controller.getView().getjDateChooserExtract().getDate()!=null)) {
            //Tanggal Stock adalah sehari sebelum Tanggal transaksi
            Calendar cal = Calendar.getInstance();
            cal.setTime(controller.getView().getjDateChooserExtract().getDate());
            //cal.add(Calendar.DATE, -1);
            //Date tanggalSebelum =  cal.getTime();
            
            //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            controller.getModel().loadTMasterProductToMem();
            controller.getModel().loadTMasterOutletToMem();
            controller.getModel().loadTMasterSalesmanToMem();
            
            //Sourcenya
            List<Stock> lst = new ArrayList<>();
            ExportTStok f = new ExportTStok();            
            lst = controller.getModel().stockDaoMem.findAll();
            
            
            //Ambil dari JTeksField Konfigurasi
            String prefix= controller.getView().getTextDistributorCode().getText();
            List<TStok> listTStok = f.exportToCsvFromListToFile(controller.getView().getTextPathOutput().getText() + prefix +"_TSTOK.TXT",
                    controller.getView().getjDateChooserExtract().getDate(),lst);
            
            //JOptionPane.showMessageDialog(rootPane, listTStok.size());
            
            for (TStok itm: listTStok ) {
                try {
                    if (controller.getModel().getDatabaseMode()==true) {
                        controller.getModel().tStokDao.saveOrUpdate(itm);
                    } else {
                        controller.getModel().tStokDaoMem.saveOrUpdate(itm);                        
                    }
                } catch (Exception ex){
                    logger.error("proses DAO saveOrUpdate pada method aksiBtnExtractTStok", ex);
                }
            }
          
            controller.bridgingControllerActionTabelOutput.aksiBtnOutputTStokReload();
                             
        } else {
            JOptionPane.showMessageDialog(null, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }

    }
   
    public void aksiBtnKirimByEmail() {
           String emailBody = "Data Dimas Tanggal: ";

           String emailFrom = controller.getView().getTextEmailFrom().getText().trim();
          
           String emailPass = new String(controller.getView().getTextEmailPassword().getPassword());
           //String emailPass = "Welcome1#";
           
           String emailTo = controller.getView().getTextEmailTo().getText().trim();
           String emailSubject = controller.getView().getTextEmailSubject().getText().trim();
           String sourceFilePath = controller.getView().getTextPathOutput().getText().trim();
           Date tanggalTransaksi = controller.getView().getjDateChooserExtract().getDate();
           
           //JOptionPane.showMessageDialog(this, emailPass);
           
           if (! (emailFrom.equals("") || emailTo.equals("") || emailPass.equals(""))) {
                SendEmailAttachment f = new SendEmailAttachment();
                try {
                    controller.getView().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    
                    f.sendGmailMessageWithAttachment(emailFrom, emailPass, emailTo, emailSubject, emailBody, sourceFilePath, tanggalTransaksi);
                    JOptionPane.showMessageDialog(null, "Email sukses dikirim....", "Info..", JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Gagal kirim email..\n"
                            + "PERIKSA KONEKSI INTERNET ATAU KONFIGURASI EMAIL ANDA", "Pesan Kesalahan..", JOptionPane.ERROR_MESSAGE);                    
                } finally {
                    controller.getView().setCursor(Cursor.getDefaultCursor());                          
                }
                
           } else {
               JOptionPane.showMessageDialog(null, "Data tidak dapat terkirim by email..\n"
                       + "PERIKSA KONFIGURASI EMAIL ANDA", "Pesan Kesalahan..", JOptionPane.ERROR_MESSAGE);
           }
    }
    //METHOD : EXTRACT BAYGON
    public void aksiBtnExtractClient() {}
    public void aksiBtnExtractSales() {}
    public void aksiBtnExtractSo() {}
    public void aksiBtnExtractStock() {}
     

}