package org.dimas.bridging.app.controller;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import org.bagus.common.filefilter.ExtensionFileFilter;
import org.config.spring.hibernate.model.CvOutlet;
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.JTpru;
import org.config.spring.hibernate.model.Outlet;
import org.config.spring.hibernate.model.Produk;
import org.config.spring.hibernate.model.Salesman;
import org.config.spring.hibernate.model.ScyBDItem;
import org.config.spring.hibernate.model.ScyPenyesuaianItem;
import org.config.spring.hibernate.model.ScyReturPabrikItem;
import org.config.spring.hibernate.model.Stock;
import org.config.spring.hibernate.model.enumgeneral.EnumPrincipal;
import org.dimas.bridging.retrieve.ParseBarangDatang;
import org.dimas.bridging.retrieve.ParseCvOutlet;
import org.dimas.bridging.retrieve.ParseJHeader;
import org.dimas.bridging.retrieve.ParseJPcode;
import org.dimas.bridging.retrieve.ParseJTprb;
import org.dimas.bridging.retrieve.ParseJTpru;
import org.dimas.bridging.retrieve.ParseMSPCODE;
import org.dimas.bridging.retrieve.ParseOutlet;
import org.dimas.bridging.retrieve.ParsePenyesuaian;
import org.dimas.bridging.retrieve.ParseReturKePabrik;
import org.dimas.bridging.retrieve.ParseSalesman;
import org.dimas.bridging.retrieve.ParseStock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yhawin
 */
public class BridgingControllerActionRetrieve {
    private static final Logger logger = LoggerFactory.getLogger(BridgingControllerActionRetrieve.class);   
    private BridgingController controller;
            
    
    BridgingControllerActionRetrieve(BridgingController controller) {
        this.controller = controller;
        initAction();
        
    }

    public void initAction() {
         
         //Button Path Input
         controller.getView().getBtnPathInputAuto().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputAuto();
              }
          });
         controller.getView().getBtnPathInputCvOutlet().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                    aksiBtnPathInputCvOutlet();                  
              }
          });
         controller.getView().getBtnPathInputJHeader().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputJHeader();
              }
          });
         controller.getView().getBtnPathInputJPcode().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiPathInputJPcode();
              }
          });
         controller.getView().getBtnPathInputJTprb().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputJTprb();
              }
          });
         controller.getView().getBtnPathInputJTpru().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputJTpru();
              }
          });
         controller.getView().getBtnPathInputMaster().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputMaster();
              }
          });
         controller.getView().getBtnPathInputOutlet().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputOutlet();
              }
          });
         controller.getView().getBtnPathInputSalesman().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputSalesman();
              }
          });
         controller.getView().getBtnPathInputStock().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputStock();
              }
          });
    
         controller.getView().getBtnPathInputBarangDatang().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnPathInputBarangDatang();
             }
         });
         controller.getView().getBtnPathInputReturKePabrik().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnPathInputReturKePabrik();
             }
         });
         controller.getView().getBtnPathInputStokAdjustment().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnPathInputStokAdjustment();
             }
         });
         
         controller.getView().getBtnRetrieveInputCvOutlet().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputCvOutlet();
              }
          });
         controller.getView().getBtnRetrieveInputSalesman().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnRetrieveInputSalesman();
             }
         });
         
         controller.getView().getBtnRetrieveInputJHeader().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJHeader();
              }
          });
         controller.getView().getBtnRetrieveInputJPcode().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJPcode();
              }
          });
         controller.getView().getBtnRetrieveInputJTprb().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJTprb();
              }
          });
         controller.getView().getBtnRetrieveInputJTpru().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJTpru();
              }
          });
         controller.getView().getBtnRetrieveInputMaster().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputMaster();
              }
          });
         controller.getView().getBtnRetrieveInputOutlet().addActionListener(new ActionListener() {
           @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputOutlet();
              }
          });
         controller.getView().getBtnRetrieveInputStock().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputStock();
              }
          });
    
         controller.getView().getBtnRetrieveInputAll().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputAll();
              }
          });
         //Tambahan Retrieve
         controller.getView().getBtnRetrieveInputBarangDatang().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnRetrieveInputBarangDatang();
             }
         });
         controller.getView().getBtnRetrieveInputReturKePabrik().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnRetrieveInputReturKePabrik();
             }
         });
         controller.getView().getBtnRetrieveInputStokAdjustment().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnRetrieveInputStokAdjustment();
             }
         });
         
         controller.getView().getBtnPathInputClearAll().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputClearAll();
              }
          });
         controller.getView().getBtnPathInputReloadAll().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputReloadAll();
              }
          });
    }

    /**
     * METHOD FOR ALL
     */
    public void aksiBtnPathInputStock() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File STOCK.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputStock().setText(theFilePath);
                }               
            }            
    }

    public void aksiBtnPathInputAuto() {
        boolean isFileComplete = true;
        JFileChooser fileChooser1 =  new JFileChooser(controller.getModel().getCurrentPath());
        fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        String daftarFile [][] = {{"CVOUTLET.TXT","0"}, {"JHEADER.TXT","0"}, {"JPCODE.TXT","0"}, {"JTPRB","0"},
            {"JTPRU","0"}, {"MSOUTLET","0"}, {"SALES","0"}, {"MSPCODE","0"} }; 
        
        if (fileChooser1.showOpenDialog(null) ==JFileChooser.APPROVE_OPTION){
            controller.getView().resetTeksInputBackground();
            
            File filePath = fileChooser1.getSelectedFile();
            controller.getModel().setCurrentPath(filePath.toString());
            if (filePath != null) {
                String strDirPath = filePath.getAbsolutePath() + File.separator;
                //Cek keberadaan setiap file
                File fileStock = new File(strDirPath + "STOCK.TXT");
                if (fileStock.exists())
                    controller.getView().getTextPathInputStock().setText(fileStock.getAbsolutePath());
                fileStock = new File(strDirPath + "stock.txt");
                if (fileStock.exists())
                    controller.getView().getTextPathInputStock().setText(fileStock.getAbsolutePath());
                fileStock = new File(strDirPath + "STGDNG.txt");
                if (fileStock.exists())
                    controller.getView().getTextPathInputStock().setText(fileStock.getAbsolutePath());
                
                File fileCvOutlet =  new File(strDirPath + "CVOUTLET.TXT");
                if (fileCvOutlet.exists())
                    controller.getView().getTextPathInputCvOutlet().setText(fileCvOutlet.getAbsolutePath());
                fileCvOutlet =  new File(strDirPath + "cvoutlet.txt");
                if (fileCvOutlet.exists())
                    controller.getView().getTextPathInputCvOutlet().setText(fileCvOutlet.getAbsolutePath());
                
                File fileJHeader = new File(strDirPath + "JHEADER.TXT");
                if (fileJHeader.exists())
                    controller.getView().getTextPathInputJHeader().setText(fileJHeader.getAbsolutePath());
                fileJHeader = new File(strDirPath + "jheader.txt");
                if (fileJHeader.exists())
                    controller.getView().getTextPathInputJHeader().setText(fileJHeader.getAbsolutePath());
                
                File fileJPcode = new File(strDirPath + "JPCODE.TXT");
                if (fileJPcode.exists())
                    controller.getView().getTextPathInputJPcode().setText(fileJPcode.getAbsolutePath());
                fileJPcode = new File(strDirPath + "jpcode.txt");
                if (fileJPcode.exists())
                    controller.getView().getTextPathInputJPcode().setText(fileJPcode.getAbsolutePath());
                
                File fileJTprb = new File(strDirPath + "JTPRB.TXT");
                if (fileJTprb.exists())
                    controller.getView().getTextPathInputJTprb().setText(fileJTprb.getAbsolutePath());
                fileJTprb = new File(strDirPath + "jtprb.txt");
                if (fileJTprb.exists())
                    controller.getView().getTextPathInputJTprb().setText(fileJTprb.getAbsolutePath());
                
                File fileJTpru = new File(strDirPath + "JTPRU.TXT");
                if (fileJTpru.exists())
                    controller.getView().getTextPathInputJTpru().setText(fileJTpru.getAbsolutePath());
                fileJTpru = new File(strDirPath + "jtpru.txt");
                if (fileJTpru.exists())
                    controller.getView().getTextPathInputJTpru().setText(fileJTpru.getAbsolutePath());
                
                File fileOutlet = new File(strDirPath + "MSOUTLET.TXT");
                if (fileOutlet.exists())
                    controller.getView().getTextPathInputOutlet().setText(fileOutlet.getAbsolutePath());
                fileOutlet = new File(strDirPath + "msoutlet.txt");
                if (fileOutlet.exists())
                    controller.getView().getTextPathInputOutlet().setText(fileOutlet.getAbsolutePath());
                
                File fileSales = new File(strDirPath + "SALESMAN.TXT");
                if (fileSales.exists())
                    controller.getView().getTextPathInputSalesman().setText(fileSales.getAbsolutePath());
                fileSales = new File(strDirPath + "salesman.txt");
                if (fileSales.exists())
                    controller.getView().getTextPathInputSalesman().setText(fileSales.getAbsolutePath());
                
                File fileMsPcode = new File(strDirPath + "MSPCODE.TXT");
                if (fileMsPcode.exists())
                    controller.getView().getTextPathInputMaster().setText(fileMsPcode.getAbsolutePath());                    
                fileMsPcode = new File(strDirPath + "mspcode.txt");
                if (fileMsPcode.exists())
                    controller.getView().getTextPathInputMaster().setText(fileMsPcode.getAbsolutePath());
                
                File fileBarangDatang = new File(strDirPath + "BD.TXT");
                if (fileBarangDatang.exists())
                    controller.getView().getTextPathInputBarangDatang().setText(fileBarangDatang.getAbsolutePath());                    
                fileBarangDatang = new File(strDirPath + "bd.txt");
                if (fileBarangDatang.exists())
                    controller.getView().getTextPathInputBarangDatang().setText(fileBarangDatang.getAbsolutePath());
                
                File fileReturKePabrik = new File(strDirPath + "RTR.TXT");
                if (fileReturKePabrik.exists())
                    controller.getView().getTextPathInputReturKePabrik().setText(fileReturKePabrik.getAbsolutePath());                    
                fileReturKePabrik = new File(strDirPath + "rtr.txt");
                if (fileReturKePabrik.exists())
                    controller.getView().getTextPathInputReturKePabrik().setText(fileReturKePabrik.getAbsolutePath());
                
                File filePenyesuaian = new File(strDirPath + "ADJ.TXT");
                if (filePenyesuaian.exists())
                    controller.getView().getTextPathInputStokAdjustment().setText(filePenyesuaian.getAbsolutePath());                    
                filePenyesuaian = new File(strDirPath + "adj.txt");
                if (filePenyesuaian.exists())
                    controller.getView().getTextPathInputStokAdjustment().setText(filePenyesuaian.getAbsolutePath());
                
                
            }            
        }        

    }     
    
    public void aksiBtnPathInputCvOutlet() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File CVOUTLET.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputCvOutlet().setText(theFilePath);
                }               
            }              
    }   
    
    public void aksiBtnPathInputJHeader() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JHEADER.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputJHeader().setText(theFilePath);
                }               
            }              
    }    
    public void aksiPathInputJPcode() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JPCODE.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputJPcode().setText(theFilePath);
                }               
            }              
    }
    public void aksiBtnPathInputJTprb() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JTPRB.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputJTprb().setText(theFilePath);
                }               
            }              
    }   
    public void aksiBtnPathInputJTpru() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JTPRU.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputJTpru().setText(theFilePath);
                }               
            }              
    }
    
    public void aksiBtnPathInputMaster() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File MASTER.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputMaster().setText(theFilePath);
                }               
            }              
    }
    public void aksiBtnPathInputOutlet() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File OUTLET.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputOutlet().setText(theFilePath);
                }               
            }              
    }     
    public void aksiBtnPathInputSalesman() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File SALES.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputSalesman().setText(theFilePath);
                }               
            }              
    }
    
    /**
     * KEK : Tambahan Btn Path Input for KEK
     */ 
     public void aksiBtnPathInputBarangDatang(){
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File Barang Datang.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputBarangDatang().setText(theFilePath);
                }               
            }              
     }
     
     public void aksiBtnPathInputReturKePabrik(){
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File SALES.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputReturKePabrik().setText(theFilePath);
                }               
            }              
     }
    
     public void aksiBtnPathInputStokAdjustment(){
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File SALES.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); controller.getModel().setCurrentPath(theFilePath);
                    controller.getView().getTextPathInputStokAdjustment().setText(theFilePath);
                }               
            }              
     }
            
/* Input Retrieve*/    
    public void aksiBtnRetrieveInputCvOutlet() {
       if (! controller.getView().getTextPathInputCvOutlet().getText().trim().equals("")) {
           /*
           if (tmCvOutlet.getRowCount()==0) {
               JOptionPane.showMessageDialog(this, "CvOutlet.CSV Tidak akan diproses karena Outlet.CSV belum di-Upload\n"
                       + "Upload Outlet.CSV dahulu!!..");
           }
           */
            controller.printWriter.println("\n\n");
            controller.printWriter.println("####LOG RETRIEVE CVOUTLET(Salesman, Id Outlet, Nama Outlet)######");
                      
            String message = "CvOutlet: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1 = 0;
            int jmlTotal2 = 0;
           
            controller.getView().getTextPathInputCvOutlet().setBackground(Color.YELLOW);    
            ParseCvOutlet parse = new ParseCvOutlet(this.controller);
            List<CvOutlet> lst = new ArrayList<>();
            lst = parse.parseCvOutlet(controller.getView().getTextPathInputCvOutlet().getText(), controller.getModel().getPrincipal());
            for (CvOutlet itm: lst) {
                try {
                    if (controller.getModel().getDatabaseMode()==true){
                        controller.getModel().cvOutletDao.saveOrUpdate(itm);
                    } else {
//                        controller.getModel().cvOutletDaoMem.saveOrUpdate(itm);
                        controller.getModel().cvOutletDaoMem.save(itm);
                    }
                    jmlRecordSuccess+=1;
                } catch (Exception ex){
                    jmlRecordFail+=1;
                    try {
                        controller.printWriter.println("Salesman: " + itm.getSalesman() + ", " + itm.getOutlet() + ", " + itm.getOutlet2().getNama() + ", GAGAL Retrieve!!");
                    } catch(Exception e){}
                }    
            }
            controller.bridgingControllerActionTabelInput.aksiBtnInputCvOutletReload();
            message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail);            
            controller.getView().getjLabelInputScyllaCvOutlet().setText(message);
            
            //Indikator jika berhasil atau gagal     
            if (controller.getModel().tmCvOutlet.getRowCount() > 0) {
                controller.getView().getTextPathInputCvOutlet().setBackground(Color.GREEN);
            } else {
                controller.getView().getTextPathInputCvOutlet().setText("Error atau Data Kosong >> " + 
                        controller.getView().getTextPathInputCvOutlet().getText());
                controller.getView().getTextPathInputCvOutlet().setBackground(Color.RED);
            }
       }
    }
    public void aksiBtnRetrieveInputJHeader() {
//        
//    controller.bridgingControllerActionTabelInput.aksiBtnInputMasterReload();
//    controller.bridgingControllerActionMappingMaster.aksiBtnMapProductReload();
//    controller.bridgingControllerActionMappingMaster.aksiBtnMappingMasterPokariProductReload();
       
       boolean lanjut =true; //lanjut untuk cek file JHEADER, JTPRB, JTPRU lengkap apa tidak
       if (controller.getView().getTextPathInputJPcode().getText().trim().equals("") || controller.getView().getTextPathInputJTprb().getText().trim().equals("") ||
               controller.getView().getTextPathInputJTpru().getText().trim().equals("")) { 
           if (JOptionPane.showConfirmDialog(null, "Kotak Isian JPCODE atau JTPRB atau JTPRU kosong \n Yakin Lanjut Proses?",
                   "Konfirmasi", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.CANCEL_OPTION) {
               lanjut = false;
           }          
       }

       if (lanjut==true) {       
            if (! controller.getView().getTextPathInputJHeader().getText().trim().equals("")) {
                
                 controller.getView().getTextPathInputJHeader().setBackground(Color.YELLOW);    

                //Untuk mode Database Memory
                /*
                List<MapTipeOutlet> lstMap = mapTipeOutletDao.findAll();
                for (MapTipeOutlet itmMap: lstMap) {
                    //System.out.println("Tipe Outlet : " + itmMap.getTipeOutlet());
                    try {
                        mapTipeOutletDaoMem.saveOrUpdate(itmMap);
                    } catch(Exception ex){}
                }
                */ 
                 
                controller.printWriter.println("\n\n");
                controller.printWriter.println("####LOG RETRIEVE JHEADER(Salesman, ID Order, Tanggal Transaksi, GROSS, Type Outlet)######");
                
                String message = "JHeader: ";
                int jmlRecordSuccess = 0;
                int jmlRecordFail = 0;
                int jmlTotal1Success = 0;
                int jmlTotal1Fail = 0;
                int jmlTotal2Success = 0;
                int jmlTotal2Fail = 0;
                
               //POKARI
                 if (controller.getModel().getPrincipal().equals(EnumPrincipal.POKARI.getStrCode())) {
                    controller.getModel().loadMappingProductToMem();
                    controller.getModel().loadMappingArCustomerToMem();
                    controller.getModel().loadMappingSpEmployeeToMem();
                    
                 } else if (controller.getModel().getPrincipal().equals(EnumPrincipal.KEK.getStrCode())) {
                    //KEK   
                      //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
                    controller.getModel().loadTMasterProductToMem();
                    controller.getModel().loadTMasterOutletToMem();
                    controller.getModel().loadTMasterSalesmanToMem();
                 }
                 
//               System.out.println("POINT PRODUCT:"  + controller.model.mappingProductDao.findAll().size());
//               System.out.println("POINT PRODUCT MEM:"  + controller.model.mappingProductDaoMem.findAll().size());
//               System.out.println("POINT CUSTOMER:"  + controller.model.arCustomerDao.findAll().size());
//               System.out.println("POINT CUSTOMER MEM:"  + controller.model.arCustomerDaoMem.findAll().size());
//               System.out.println("POINT SALESMAN:"  + controller.model.arCustomerDao.findAll().size());
//               System.out.println("POINT SALESMAN MEM:"  + controller.model.arCustomerDaoMem.findAll().size());
                
                ParseJHeader parse = new ParseJHeader(this.controller);
                List<JHeader> lst = new ArrayList<>();
                lst = parse.parseJHeader(controller.getView().getTextPathInputJHeader().getText(), controller.getModel().getPrincipal());
                
//                System.out.println("JHeader Size: " + lst.size());
                
                int hitungJumlah = 0;
                for (JHeader itm: lst) {
                    try {
                        if (controller.getModel().getDatabaseMode()==true) {
                            controller.getModel().jheaderDao.saveOrUpdate(itm);
                        } else {
                            //System.out.println(itm.getIdOrder() + "\t" +  itm.getTypeOutlet() + 
                            //        "\t"+  itm.getTypeOutlet());
                            //File MapOutletTidakBisa Masuk secara otomatis jadi harus di masukkan
//                            controller.getModel().jheaderDaoMem.saveOrUpdate(itm);                            
                            controller.getModel().jheaderDaoMem.save(itm);                            
                            hitungJumlah++;
                        }
                        
                        jmlRecordSuccess+=1;
                        jmlTotal1Success += itm.getNetPpn();
                        jmlTotal2Success += itm.getGross();
                        
                    } catch(Exception ex) {
                        jmlRecordFail+=1;
                        jmlTotal1Fail += itm.getNetPpn();       
                        jmlTotal2Fail += itm.getGross();
                        
                        controller.printWriter.println("Salesman: " + itm.getSalesman() + ", " + itm.getIdOrder() + ", " + itm.getTanggal() + 
                                ", " + itm.getGross() +
                                ", " + itm.getTypeOutlet() +", GAGAL Retrieve!!");    
                        
                    }
                }
                controller.bridgingControllerActionTabelInput.aksiBtnInputJheaderReload();
      
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Rec Db: " + controller.getModel().jheaderDaoMem.findAll().size() + ", Rec: " + Integer.toString(jmlRecordSuccess) + 
                        ", Fail: " + Integer.toString(jmlRecordFail) + 
                        ",  Net+Ppn: " + String.valueOf(nf.format(jmlTotal1Success)) + 
                        " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail) + 
                        " Gross: " + String.valueOf(nf.format(jmlTotal2Success)) + 
                        " and Fail: " + String.valueOf(nf.format(jmlTotal2Fail)));          
                controller.getView().getjLabelInputScyllaJHeader().setText(message);
                
                
                //Indikator jika berhasil atau gagal     
                 if (controller.getModel().tmJHeader.getRowCount() > 0) {
                     controller.getView().getTextPathInputJHeader().setBackground(Color.GREEN);
                 } else {
                     controller.getView().getTextPathInputJHeader().setText("Error atau Data Kosong >> " + 
                             controller.getView().getTextPathInputJHeader().getText());
                     controller.getView().getTextPathInputJHeader().setBackground(Color.RED);
                 }
                 
                 //TRANSAKSI DETAILNYA
                 try {
                    aksiBtnRetrieveInputJPcode();
                 } catch(Exception ex){}
                 try {
                    aksiBtnRetrieveInputJTprb();
                 } catch(Exception ex) {}
                 try {
                    aksiBtnRetrieveInputJTpru();
                 } catch(Exception ex){}
                 
            }
       }
    }  
    public void aksiBtnRetrieveInputJPcode() {
        if (! controller.getView().getTextPathInputJPcode().getText().trim().equals("")) {
             controller.getView().getTextPathInputJPcode().setBackground(Color.YELLOW);    

            controller.printWriter.println("\n\n");
            controller.printWriter.println("####LOG RETRIEVE JPCODE(Salesman, ID Order, Pcode, HargaNoPpn )######");
             
            String message = "JPCode: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
             
             ParseJPcode parse = new ParseJPcode(this.controller);
             List<JPcode> lst = new ArrayList<>();
             lst = parse.parseJPcode(controller.getView().getTextPathInputJPcode().getText(), controller.getModel().getPrincipal());

             int hitungMasuk=0;
             for (JPcode itm: lst) {
                try {
                    if (controller.getModel().getDatabaseMode()==true){
                        controller.getModel().jpcodeDao.saveOrUpdate(itm);
                    } else {
//                        controller.getModel().jpcodeDaoMem.saveOrUpdate(itm);
                        controller.getModel().jpcodeDaoMem.save(itm);
                        hitungMasuk++;
                    }
                    jmlRecordSuccess+=1;
                    jmlTotal1Success += itm.getHargaNoPpn();
                    
                } catch (Exception ex){
                    jmlRecordFail+=1;
                    jmlTotal1Fail += itm.getHargaNoPpn();     
                    controller.printWriter.println("Salesman: " + itm.getJpcodePK().getSalesman() + ", " + itm.getJpcodePK().getIdOrder()  + 
                            ", " + itm.getJpcodePK().getPcode() + ", " + itm.getHargaNoPpn() + ", GAGAL Retrieve!!");
                }
            }
            controller.bridgingControllerActionTabelInput.aksiBtnInputJpcodeReload();
            
            NumberFormat nf = NumberFormat.getNumberInstance();
            nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
            nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
            message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) + 
                    ",  HargaNoPPn Success: " + String.valueOf(nf.format(jmlTotal1Success)) + 
                    " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail) );          
            controller.getView().getjLabelInputScyllaJPCode().setText(message);
            
//            System.out.println("Jumlah ambil dari Dao : " + controller.getModel().jpcodeDaoMem.findAll().size() + " dari : " + hitungMasuk);
            
             //Indikator jika berhasil atau gagal     
             if (controller.getModel().tmJPcode.getRowCount() > 0) {
                 controller.getView().getTextPathInputJPcode().setBackground(Color.GREEN);
             } else {
                 controller.getView().getTextPathInputJPcode().setText("Error atau Data Kosong >> " + 
                         controller.getView().getTextPathInputJPcode().getText());
                 controller.getView().getTextPathInputJPcode().setBackground(Color.RED);
             }
        }       
       
    }
    public void aksiBtnRetrieveInputJTprb() {
      if (! controller.getView().getTextPathInputJTprb().getText().trim().equals("")) {
           controller.getView().getTextPathInputJTprb().setBackground(Color.YELLOW);    
            
            controller.printWriter.println("\n\n");
            controller.printWriter.println("####LOG RETRIEVE JTPRB(Salesman, ID Order, Pcode, HargaNoPpn)######");
  
            String message = "JTprb: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;

           ParseJTprb parse = new ParseJTprb(this.controller);
           List<JTprb> lst = new ArrayList<>();
           lst = parse.parseJTprb(controller.getView().getTextPathInputJTprb().getText(), controller.getModel().getPrincipal());
           for (JTprb itm: lst) {
               try {
                   if (controller.getModel().getDatabaseMode()==true){
                       controller.getModel().jtprbDao.saveOrUpdate(itm);
                   } else {
//                       controller.getModel().jtprbDaoMem.saveOrUpdate(itm);
                       controller.getModel().jtprbDaoMem.save(itm);
                   }
                    jmlRecordSuccess+=1;
                    jmlTotal1Success += itm.getHargaNoPpn();
                    
                } catch (Exception ex){
                    jmlRecordFail+=1;
                    jmlTotal1Fail += itm.getHargaNoPpn(); 
                    controller.printWriter.println("Salesman: " + itm.getJtprbPK().getSalesman() + ", " + itm.getJtprbPK().getIdOrder()  +
                            ", " + itm.getJtprbPK().getPcode() + ", " + itm.getHargaNoPpn() + ", GAGAL Retrieve!!");                    
                   
               }
               
           }
           controller.bridgingControllerActionTabelInput.aksiBtnInputJtprbReload();
           
            NumberFormat nf = NumberFormat.getNumberInstance();
            nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
            nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
            message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) + 
                    ",  HargaNoPPn Success: " + String.valueOf(nf.format(jmlTotal1Success)) + 
                    " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail) );          
            controller.getView().getjLabelInputScyllaJTprb().setText(message);
           
           
           //Indikator jika berhasil atau gagal     
           if (controller.getModel().tmJTprb.getRowCount() > 0) {
               controller.getView().getTextPathInputJTprb().setBackground(Color.GREEN);
           } else {
               controller.getView().getTextPathInputJTprb().setText("Error atau Data Kosong >> " + 
                       controller.getView().getTextPathInputJTprb().getText());
               controller.getView().getTextPathInputJTprb().setBackground(Color.RED);
           }
      }

   }
    public void aksiBtnRetrieveInputJTpru() {
       if (! controller.getView().getTextPathInputJTpru().getText().trim().equals("")) {
           controller.getView().getTextPathInputJTpru().setBackground(Color.YELLOW);    

            controller.printWriter.println("\n\n");
            controller.printWriter.println("####LOG RETRIEVE JTPRU(Salesman, ID Order, Pcode, HargaNoPpn)######");

            String message = "JTpru: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
           
           ParseJTpru parse = new ParseJTpru(this.controller);
           List<JTpru> lst = new ArrayList<>();
           lst = parse.parseJTpru(controller.getView().getTextPathInputJTpru().getText(), controller.getModel().getPrincipal());
           for (JTpru itm: lst) {
               try {
                   if (controller.getModel().getDatabaseMode()==true){
                       controller.getModel().jtpruDao.saveOrUpdate(itm);
                   } else {
//                       controller.getModel().jtpruDaoMem.saveOrUpdate(itm);
                       controller.getModel().jtpruDaoMem.save(itm);
                   }
                } catch (Exception ex){
                    jmlRecordFail+=1;
                    jmlTotal1Fail += itm.getHargaNoPpn();                        
                    
                    controller.printWriter.println("Salesman: " + itm.getJtpruPK().getSalesman() + ", " + itm.getJtpruPK().getIdOrder() + 
                            ", " + itm.getJtpruPK().getPcode() + ", " + itm.getHargaNoPpn() +  ", GAGAL Retrieve!!");
                   
               }
           }
           controller.bridgingControllerActionTabelInput.aksiBtnInputJtpruReload();
           
            NumberFormat nf = NumberFormat.getNumberInstance();
            nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
            nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
            message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) + 
                    ",  HargaNoPPn Success: " + String.valueOf(nf.format(jmlTotal1Success)) + 
                    " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail) );          
            controller.getView().getjLabelInputScyllaJTpru().setText(message);

           //Indikator jika berhasil atau gagal     
           if (controller.getModel().tmJTpru.getRowCount() > 0) {
               controller.getView().getTextPathInputJTpru().setBackground(Color.GREEN);
           } else {
               controller.getView().getTextPathInputJTpru().setText("Error atau Data Kosong >> " + 
                       controller.getView().getTextPathInputJTpru().getText());
               controller.getView().getTextPathInputJTpru().setBackground(Color.RED);
           }
      }
  } 
    
    public void aksiBtnRetrieveInputMaster() {
       if (! controller.getView().getTextPathInputMaster().getText().trim().equals("")) {
        
            controller.getView().getTextPathInputMaster().setBackground(Color.YELLOW);    
        
            controller.printWriter.println("\n\n");
            controller.printWriter.println("####LOG RETRIEVE MASTER PRODUCT(Pcode, Nama, Ukuran, Hrg Beli Krt, Hrg Jual Krt)######");

            String message = "Produk: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;

            /**
             * PARSING TEXT DATA DARI suatu PATH tertentu dan masukkan ke dala
             * variable lst
             */
            ParseMSPCODE parse = new ParseMSPCODE(this.controller);
            List<Produk> lst = new ArrayList<>();
            /**
             * AKAN MENARIK SESUAI DENGAN PRINCIPAL YANG AKTIF
             */
            lst = parse.parseMSPCODE(controller.getView().getTextPathInputMaster().getText(), controller.getModel().getPrincipal());
            /**
             *  LOAD TMASTERPRODUCT ke dalam Memory 
             */
            
            /**
             * FOR KEK
             */
            if (controller.getModel().getPrincipal().equals(EnumPrincipal.KEK.getStrCode()))
                controller.getModel().loadTMasterProductToMem();
            

            /**
             * FOR POKARI
             */
            if (controller.getModel().getPrincipal().equals(EnumPrincipal.POKARI.getStrCode()))
                controller.getModel().loadMappingProductToMem();
            /**
             * SIMPAN lstProduct ke dalam DATABASE ATAU MEMORY
             * Ingat kita butuh data master product dari memory
             * jika menggunakan memory supaya relasi nya bisa jalan
             */
                for (Produk itm: lst) {
                     try {
                         if (controller.getModel().getDatabaseMode()==true){
                             controller.getModel().produkDao.saveOrUpdate(itm);                             
                         }else {
//                             controller.getModel().produkDaoMem.saveOrUpdate(itm);                             
                             controller.getModel().produkDaoMem.save(itm);                             
                         }
                        jmlRecordSuccess+=1;
//                      jmlTotal1Success += itm.getHargaNoPpn();
                    
                      } catch (Exception ex){
                        jmlRecordFail+=1;
                        try {
    //                    jmlTotal1Fail += itm.getHargaNoPpn();        
                          controller.printWriter.println("Product: " + itm.getPcode() + ", " + itm.getNamaBrg() + ", " + itm.getUkuran() + ", " + itm.getBeliKrt() + ", " + itm.getJualKrt() +", GAGAL Retrieve!!");                    
                        } catch(Exception e) {}
                     }
                             
                 }
                
                 controller.bridgingControllerActionTabelInput.aksiBtnInputMasterReload();
                 controller.bridgingControllerActionMappingMaster.aksiBtnMapProductReload();
                 controller.bridgingControllerActionMappingMaster.aksiBtnMappingMasterPokariProductReload();

            try{
            //Indikator jika berhasil atau gagal     
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail);          
                controller.getView().getjLabelInputScyllaMasterProduk().setText(message);
            } catch(Exception ex){}
                 
            //Indikator jika berhasil atau gagal     
            if (controller.getModel().tmProduk.getRowCount() > 0) {
                controller.getView().getTextPathInputMaster().setBackground(Color.GREEN);
            } else {
                controller.getView().getTextPathInputMaster().setText("Error atau Data Kosong >> " + 
                        controller.getView().getTextPathInputMaster().getText());
                controller.getView().getTextPathInputMaster().setBackground(Color.RED);
            }
            
       }
       
       
    }   
    public void aksiBtnRetrieveInputOutlet() {
      if (! controller.getView().getTextPathInputOutlet().getText().trim().equals("")) {
          
           controller.getView().getTextPathInputOutlet().setBackground(Color.YELLOW);    
           
           //FOOTER INDICATOR
            controller.printWriter.println("\n\n");
            controller.printWriter.println("####LOG RETRIEVE OUTLET(Outlet, Nama, AlamatToko1, AlamatToko2, TipeOutlet)######");

            String message = "Produk: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
           
           ParseOutlet parse = new ParseOutlet(this.controller);
           List<Outlet> lst = new ArrayList<>();
           lst = parse.parseOutlet(controller.getView().getTextPathInputOutlet().getText(), controller.getModel().getPrincipal());

          if (controller.getModel().getPrincipal().equals(EnumPrincipal.KEK.getStrCode())) 
            controller.getModel().loadTMasterOutletToMem();
          if (controller.getModel().getPrincipal().equals(EnumPrincipal.POKARI.getStrCode()))
            controller.getModel().loadMappingArCustomerToMem();

           for (Outlet itm: lst) {
               try {
                   if (controller.getModel().getDatabaseMode()==true){
                       controller.getModel().outletDao.saveOrUpdate(itm);
                   } else {
//                       controller.getModel().outletDaoMem.saveOrUpdate(itm);
                       controller.getModel().outletDaoMem.save(itm);
                        jmlRecordSuccess+=1;
                   }
                 } catch (Exception ex){
                    jmlRecordFail+=1;
                    try {
    //                    jmlTotal1Fail += itm.getHargaNoPpn();       
                        controller.printWriter.println("Outlet: " + itm.getOutlet() + ", " + itm.getNama() + ", " + itm.getAlm1Toko() + ", " + itm.getAlm2Toko() + ", " + itm.getTy() +", GAGAL Retrieve!!");                    
                    } catch(Exception e) {}
                }               
           }
           
           controller.bridgingControllerActionTabelInput.aksiBtnInputOutletReload();
           controller.bridgingControllerActionMappingMaster.aksiBtnMapOutletReload();
           controller.bridgingControllerActionMappingMaster.aksiBtnMappingMasterPokariCustomerReload();
            try{
            //Indikator jika berhasil atau gagal     
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail);          
                controller.getView().getjLabelInputScyllaOutlet().setText(message);
            } catch(Exception ex){}
            

           //Indikator jika berhasil atau gagal     

           if (controller.getModel().tmOutlet.getRowCount() > 0) {
               controller.getView().getTextPathInputOutlet().setBackground(Color.GREEN);
           } else {
               controller.getView().getTextPathInputOutlet().setText("Error atau Data Kosong >> " + 
                       controller.getView().getTextPathInputOutlet().getText());
               controller.getView().getTextPathInputOutlet().setBackground(Color.RED);
           }

           //animationProsesHide();
      }
    
   }   
    public void aksiBtnRetrieveInputSalesman() {
       if (! controller.getView().getTextPathInputSalesman() .getText().trim().equals("")) {
           
            controller.getView().getTextPathInputSalesman().setBackground(Color.YELLOW);    

            controller.printWriter.println("\n\n");
            controller.printWriter.println("####LOG RETRIEVE SALESMAN(Kode Salesman, Nama, Opr)######");

            String message = "Salesman: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
            
            
            ParseSalesman parse = new ParseSalesman(this.controller);
            List<Salesman> lst = new ArrayList<>();
            lst = parse.parseSalesman(controller.getView().getTextPathInputSalesman().getText() , controller.getModel().getPrincipal());

//            System.out.println("CHECK POINT LUAR : " + lst.size());
            if (controller.getModel().getPrincipal().equals(EnumPrincipal.KEK.getStrCode()))
                controller.getModel().loadTMasterSalesmanToMem();
            if (controller.getModel().getPrincipal().equals(EnumPrincipal.POKARI.getStrCode()))
                controller.getModel().loadMappingSpEmployeeToMem();
            
            
            for (Salesman itm: lst) {
                try {
                    if (controller.getModel().getDatabaseMode()==true){
                        controller.getModel().salesmanDao.saveOrUpdate(itm);
                    } else {
//                        controller.getModel().salesmanDaoMem.saveOrUpdate(itm);
                        controller.getModel().salesmanDaoMem.save(itm);
                    }
                    jmlRecordSuccess+=1;
//                      jmlTotal1Success += itm.getHargaNoPpn();

                 } catch (Exception ex){
                    jmlRecordFail+=1;
                    try {
    //                    jmlTotal1Fail += itm.getHargaNoPpn();                                                              
                        controller.printWriter.println("Salesman: " + itm.getSalesman() + ", " + itm.getNamaSls() + ", " + itm.getOpr()  +", GAGAL Retrieve!!");                                        
                    } catch(Exception e){}
                }
                
            }
            

            controller.bridgingControllerActionTabelInput.aksiBtnInputSalesmanReload();
            controller.bridgingControllerActionMappingMaster.aksiBtnMapSalesmanReload();
            controller.bridgingControllerActionMappingMaster.aksiBtnMappingMasterPokariEmployeeReload();
            
                try {
                //Indikator jika berhasil atau gagal     
                   NumberFormat nf = NumberFormat.getNumberInstance();
                    nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                    nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                    message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail);          
                    controller.getView().getjLabelInputScyllaSalesman().setText(message);
                } catch(Exception ex){}
            
            //Indikator jika berhasil atau gagal     
            if (controller.getModel().tmSalesman.getRowCount() > 0) {
                controller.getView().getTextPathInputSalesman().setBackground(Color.GREEN);
            } else {
                controller.getView().getTextPathInputSalesman().setText("Error atau Data Kosong >> " + 
                        controller.getView().getTextPathInputSalesman().getText());
                controller.getView().getTextPathInputSalesman().setBackground(Color.RED);
            }
            
       }
        
    }
   
    public void aksiBtnRetrieveInputStock() {
       if (! controller.getView().getTextPathInputStock().getText().trim().equals("")) {
            controller.getView().getTextPathInputStock().setBackground(Color.YELLOW);    
            //Stock Harus hapus dulu karena TanggalStock dijakdikan PrimaryKey
            
            controller.printWriter.println("\n\n");
            controller.printWriter.println("####LOG RETRIEVE STOK(TanggalStok, Pcode, NamaBarang, TotalStok, HargaBeli, HargaJual)######");

            String message = "Produk: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
            
            if (controller.getModel().getDatabaseMode()==true){
                for (Stock itmStock: controller.getModel().stockDao.findAll() ) {
                    controller.getModel().stockDao.delete(itmStock);
                }
            } else {
                for (Stock itmStock: controller.getModel().stockDaoMem.findAll() ) {
                    controller.getModel().stockDaoMem.delete(itmStock);
                }
            }
            
            ParseStock parse = new ParseStock(this.controller);
            List<Stock> lst = new ArrayList<>();
            lst = parse.parseStock(controller.getView().getTextPathInputStock().getText(), controller.getView().getjDateChooseTanggalStock().getDate(), 
                    controller.getModel().getPrincipal());
            for (Stock itm: lst) {
                try {
                    if (controller.getModel().getDatabaseMode()==true){
                        controller.getModel().stockDao.saveOrUpdate(itm);
                    } else {
//                        controller.getModel().stockDaoMem.saveOrUpdate(itm);
                        controller.getModel().stockDaoMem.save(itm);
                    }
                    jmlRecordSuccess+=1;
                    jmlTotal1Success += itm.getHargaBeli();
                 } catch (Exception ex){
                    jmlRecordFail+=1;
                    jmlTotal1Fail += itm.getHargaBeli();  
                    
                    controller.printWriter.println("Stok: " + itm.getStockPK().getTangalStock() + ", " + itm.getStockPK().getPcode() + ", " + itm.getNamaBarang() + ", " + itm.getTotalStock() + ", " + itm.getHargaBeli() + ", " + itm.getHargaJual() +", GAGAL Retrieve!!");                                                        
                }
                
            }
            controller.bridgingControllerActionTabelInput.aksiBtnInputStockReload();
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) + 
                        ",  HargaBeli Success: " + String.valueOf(nf.format(jmlTotal1Success)) + 
                        " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail) );          
                controller.getView().getjLabelInputScyllaStock().setText(message);
            
            //Indikator jika berhasil atau gagal     
            if (controller.getModel().tmStock.getRowCount() > 0) {
                controller.getView().getTextPathInputStock().setBackground(Color.GREEN);
            } else {
                controller.getView().getTextPathInputStock().setText("Error atau Data Kosong >> " + 
                        controller.getView().getTextPathInputStock().getText());
                controller.getView().getTextPathInputStock().setBackground(Color.RED);
            }
       }
    }
    
    public void aksiBtnRetrieveInputBarangDatang(){
      if (! controller.getView().getTextPathInputBarangDatang() .getText().trim().equals("")) {
           controller.getView().getTextPathInputBarangDatang().setBackground(Color.YELLOW);    

                //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
          controller.getModel().loadTMasterProductToMem();
          controller.getModel().loadTMasterOutletToMem();
          controller.getModel().loadTMasterSalesmanToMem();

           ParseBarangDatang parse = new ParseBarangDatang(this.controller);
           List<ScyBDItem> lst = new ArrayList<>();
           lst = parse.parseBarangDatang(controller.getView().getTextPathInputBarangDatang().getText(), controller.getModel().getPrincipal());
           for (ScyBDItem itm: lst) {
               try {
                   if (controller.getModel().getDatabaseMode()==true){
                       controller.getModel().scyBDItemDao.saveOrUpdate(itm);
                   } else {
                       controller.getModel().scyBDItemDaoMem.saveOrUpdate(itm);
                   }
               } catch (Exception ex) {}
           }
           controller.bridgingControllerActionTabelInput.aksiBtnInputBarangDatangReload();

           //Indikator jika berhasil atau gagal     
           if (controller.getModel().tmScyBDItem.getRowCount() > 0) {
               controller.getView().getTextPathInputBarangDatang().setBackground(Color.GREEN);
           } else {
               controller.getView().getTextPathInputBarangDatang().setText("Error atau Data Kosong >> " + 
                       controller.getView().getTextPathInputBarangDatang().getText());
               controller.getView().getTextPathInputBarangDatang().setBackground(Color.RED);
           }
      }

    }
     
    public void aksiBtnRetrieveInputReturKePabrik(){
        if (! controller.getView().getTextPathInputReturKePabrik() .getText().trim().equals("")) {
             controller.getView().getTextPathInputReturKePabrik().setBackground(Color.YELLOW);    

             //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            controller.getModel().loadTMasterProductToMem();
            controller.getModel().loadTMasterOutletToMem();
            controller.getModel().loadTMasterSalesmanToMem();

             ParseReturKePabrik parse = new ParseReturKePabrik(this.controller);
             List<ScyReturPabrikItem> lst = new ArrayList<>();
             lst = parse.parseReturKePabrik(controller.getView().getTextPathInputReturKePabrik().getText(), controller.getModel().getPrincipal());
             for (ScyReturPabrikItem itm: lst) {
                 try {
                     if (controller.getModel().getDatabaseMode()==true){
                         controller.getModel().scyReturPabriItemkDao.saveOrUpdate(itm);
                     } else {
                         controller.getModel().scyReturPabriItemkDaoMem.saveOrUpdate(itm);
                     }
                 } catch (Exception ex) {}
             }
             controller.bridgingControllerActionTabelInput.aksiBtnInputReturKePabrikReload();

             //Indikator jika berhasil atau gagal     
             if (controller.getModel().tmScyReturPabrikItem.getRowCount() > 0) {
                 controller.getView().getTextPathInputReturKePabrik().setBackground(Color.GREEN);
             } else {
                 controller.getView().getTextPathInputReturKePabrik().setText("Error atau Data Kosong >> " + 
                         controller.getView().getTextPathInputReturKePabrik().getText());
                 controller.getView().getTextPathInputReturKePabrik().setBackground(Color.RED);
             }
        }
     }
    public void aksiBtnRetrieveInputStokAdjustment(){
        if (! controller.getView().getTextPathInputStokAdjustment() .getText().trim().equals("")) {
             controller.getView().getTextPathInputStokAdjustment().setBackground(Color.YELLOW);    

             //Jika Menggunakan Mode Memory maka TMasterProduct, TMasterOutlet, TMasterSalesman harus di load ke Memory
            controller.getModel().loadTMasterProductToMem();
            controller.getModel().loadTMasterOutletToMem();
            controller.getModel().loadTMasterSalesmanToMem();

             ParsePenyesuaian parse = new ParsePenyesuaian(this.controller);
             List<ScyPenyesuaianItem> lst = new ArrayList<>();
             Date tanggalPenyesuaian = controller.getView().getjDateChooseTanggalStokAdjustment().getDate();// Jika Kosong maka null aja
             lst = parse.parsePenyesuaian(controller.getView().getTextPathInputStokAdjustment().getText(), tanggalPenyesuaian, controller.
                     getModel().getPrincipal());

             for (ScyPenyesuaianItem itm: lst) {
                 try {
                     if (controller.getModel().getDatabaseMode()==true){
                         controller.getModel().scyPenyesuaianItemDao.saveOrUpdate(itm);
                     } else {
                         controller.getModel().scyPenyesuaianItemDaoMem.saveOrUpdate(itm);
                     }
                 } catch (Exception ex) {}
             }
             controller.bridgingControllerActionTabelInput.aksiBtnInputStockAdjustmentReload();

             //Indikator jika berhasil atau gagal     
             if (controller.getModel().tmScyPenyesuaianItem.getRowCount() > 0) {
                 controller.getView().getTextPathInputStokAdjustment().setBackground(Color.GREEN);
             } else {
                 controller.getView().getTextPathInputStokAdjustment().setText("Error atau Data Kosong >> " + 
                         controller.getView().getTextPathInputStokAdjustment().getText());
                 controller.getView().getTextPathInputStokAdjustment().setBackground(Color.RED);
             }
        }        
    }
    
    public void aksiBtnRetrieveInputAllPokari(){
         if (JOptionPane.showConfirmDialog(null, "Retrieve All akan memerlukan waktu agak lama \n\n "
                 + "Yakin akan melanjutkan?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
                 //Master Duluan

                 controller.getView().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                 
//FILE WRITER >> CREATE A NEW ONE             
                try {
                    controller.fileWriter = new FileWriter(controller.retrieveFilePath);
                } catch (IOException ex) {
                    logger.error(ex.toString());
                }
                controller.bufferedWriter = new BufferedWriter(controller.fileWriter);
                controller.printWriter = new PrintWriter(controller.bufferedWriter);
                controller.printWriter.println("RETRIEVE DATA TANGGAL " + new Date());
//#######
                
                 controller.getModel().setIsLoadMappingArCustomerToMem(false);
                 controller.getModel().setIsLoadMappingProductToMem(false);
                 controller.getModel().setIsLoadMappingSpEmployeeToMem(false);

                 try {
                     aksiBtnRetrieveInputMaster(); //Induk semua
                 } catch(Exception ex){
                     logger.error("aksiBtnRetrieveInputMaster()", ex);
                 }
                 try {
                     aksiBtnRetrieveInputSalesman();//Induk Semua
                 } catch (Exception ex){
                     logger.error("aksiBtnRetrieveInputSalesman()", ex);
                 }

                 try {
                     aksiBtnRetrieveInputOutlet(); //Induk Semua
                 }catch (Exception ex){
                     logger.error("aksiBtnRetrieveInputOutlet()", ex);
                 }

             /* TIDAK DI PAKE DI KEK DAN POKARI
                 try {
                     aksiBtnRetrieveInputCvOutlet();
                 }catch(Exception ex) {
                     logger.error("aksiBtnRetrieveInputCvOutlet()", ex);
                 }
                 */ 

                 try {
                     aksiBtnRetrieveInputJHeader(); //Induk            
                 } catch(Exception ex){
                     logger.error("aksiBtnRetrieveInputJHeader()", ex);
                 }finally {
                     controller.getView().setCursor(Cursor.getDefaultCursor());

                     //Untuk menulis ke file
                    controller.printWriter.close();
                    try {
                        java.awt.Desktop.getDesktop().open(controller.retrieveFilePath);                        
                    } catch (IOException e) {}
                     
                     
                 }  
                 /* Kan sudah tidak perlu kalau udah di jHeader
                 try {
                     aksiBtnRetrieveInputJPcode();
                 } catch(Exception ex){}
                 try {
                     aksiBtnRetrieveInputJTprb();
                 }catch(Exception ex){}
                 try {
                     aksiBtnRetrieveInputJTpru();
                 } catch(Exception ex){}
                 */ 

                 JOptionPane.showMessageDialog(null, "Retrieve dari scylla sudah selesai dilakukan.. \n "
                         + "TAB masing-masing tabel untuk memeriksa detil data","Informasi..", JOptionPane.INFORMATION_MESSAGE);
             }  

    }
    public void aksiBtnRetrieveInputAllKek(){
         if (JOptionPane.showConfirmDialog(null, "Retrieve All akan memerlukan waktu agak lama \n\n "
                 + "Yakin akan melanjutkan?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
                 //Master Duluan

                 controller.getView().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                 //Dikembalikan lagi agar meload ulang TMaster ke Memory Lagi
                 //isLoadTMasterProductToMem=false;                
                 controller.getModel().setIsLoadTMasterProductToMem(false);
                 //isLoadTMasterOutletToMem=false;
                 controller.getModel().setIsLoadTMasterOutletToMem(false);
                 //isLoadTMasterSalesmanToMem=false;
                 controller.getModel().setIsLoadTMasterSalesmanToMem(false);

                 try {
                     aksiBtnRetrieveInputMaster(); //Induk semua
                 } catch(Exception ex){
                     logger.error("aksiBtnRetrieveInputMaster()", ex);
                 }
                 try {
                     aksiBtnRetrieveInputSalesman();//Induk Semua
                 } catch (Exception ex){
                     logger.error("aksiBtnRetrieveInputSalesman()", ex);
                 }

                 try {
                     aksiBtnRetrieveInputOutlet(); //Induk Semua
                 }catch (Exception ex){
                     logger.error("aksiBtnRetrieveInputOutlet()", ex);
                 }

 /* TIDAK DI PAKE DI KEK
                 try {
                     aksiBtnRetrieveInputCvOutlet();
                 }catch(Exception ex) {
                     logger.error("aksiBtnRetrieveInputCvOutlet()", ex);
                 }
                 */ 

                 try {
                     aksiBtnRetrieveInputJHeader(); //Induk            
                 } catch(Exception ex){
                     logger.error("aksiBtnRetrieveInputJHeader()", ex);
                 }
                 /* Kan sudah tidak perlu kalau udah di jHeader
                 try {
                     aksiBtnRetrieveInputJPcode();
                 } catch(Exception ex){}
                 try {
                     aksiBtnRetrieveInputJTprb();
                 }catch(Exception ex){}
                 try {
                     aksiBtnRetrieveInputJTpru();
                 } catch(Exception ex){}
                 */ 

                 //Tambahan

                 //Stock belakangan karena harus ada transaksi dulu
                 try {
                     aksiBtnRetrieveInputStock();
                 } catch (Exception ex){
                     logger.error("aksiBtnRetrieveInputStock()", ex);
                 } finally {
                     controller.getView().setCursor(Cursor.getDefaultCursor());
                 }  

                 //Tambahan
                 try {
                     aksiBtnRetrieveInputBarangDatang();             
                 } catch(Exception ex){
                     logger.error("aksiBtnRetrieveInputBarangDatang()", ex);
                 }
                 try {
                     aksiBtnRetrieveInputReturKePabrik();             
                 } catch(Exception ex){
                     logger.error("aksiBtnRetrieveInputReturKePabrik()", ex);
                 }
                 try {
                     aksiBtnRetrieveInputStokAdjustment();             
                 } catch(Exception ex){
                     logger.error("aksiBtnRetrieveInputStokAdjustment()", ex);
                 }

                 JOptionPane.showMessageDialog(null, "Retrieve dari scylla sudah selesai dilakukan.. \n "
                         + "TAB masing-masing tabel untuk memeriksa detil data","Informasi..", JOptionPane.INFORMATION_MESSAGE);
         }  

    }
    
    public void aksiBtnRetrieveInputAll() {        
         if (controller.getModel().getPrincipal().equalsIgnoreCase("KEK")) {
             aksiBtnRetrieveInputAllKek();
         } else if (controller.getModel().getPrincipal().equalsIgnoreCase("POKARI")){
             aksiBtnRetrieveInputAllPokari();
         } else if (controller.getModel().getPrincipal().equalsIgnoreCase("BAYGON")){
         }else {
         }

    }            
    public void aksiBtnPathInputClearAll() {
         if (JOptionPane.showConfirmDialog(null,"Anda Yakin Akan Hapus Semua Data?"
                 + "\n\nPERHATIAN!!.. \nDATA YANG PERNAH DI UPLOAD AKAN DI HAPUS SEMUA", 
                 "Konfirmasi Hapus", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {

             controller.getView().resetTeksInputBackground();

             //1. Hapus semua data input dan output
                 //dimulai dari Child Dulu
                 controller.getModel().jtprbDao.deleteAll();
                 controller.getModel().jtpruDao.deleteAll();
                 controller.getModel().jpcodeDao.deleteAll();
                 controller.getModel().jheaderDao.deleteAll();

                 controller.getModel().cvOutletDao.deleteAll();
                 controller.getModel().outletDao.deleteAll();

                 controller.getModel().salesmanDao.deleteAll();

                 controller.getModel().stockDao.deleteAll();
                 controller.getModel().produkDao.deleteAll();
                 //TIDAK PERLU -> TERMASUK FILE PARAMETER SYSTEM
                 //mapTipeOutletDao.deleteAll();

                 controller.getModel().tblSalesIdDao.deleteAll();
                 controller.getModel().tblStockIdDao.deleteAll();
                 controller.getModel().tblClientIdDao.deleteAll();
                 controller.getModel().tblSoIdDao.deleteAll();

             //2. Reload Semua table
             aksiBtnPathInputReloadAll();

             JOptionPane.showMessageDialog(null, "Semua data berhasil dihapus!! \n Kecuali Data Parameter Sistem", 
                     "Info..", JOptionPane.INFORMATION_MESSAGE);

         }
    }
    public void aksiBtnPathInputReloadAll() {
 //        aksiReloadAll();
    }

}