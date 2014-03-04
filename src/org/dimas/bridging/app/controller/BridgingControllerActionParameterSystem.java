package org.dimas.bridging.app.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import org.bagus.common.filefilter.ExtensionFileFilter;
import org.config.spring.hibernate.model.MapTipeOutlet;
import org.config.spring.hibernate.model.Sysvar;
import org.config.spring.hibernate.model.tablemodel.GenericTableModel;
import org.dimas.bridging.utils.KonfigurasiUtils;

/**
 * @author yhawin
 */
public class BridgingControllerActionParameterSystem {

	private BridgingController controller;

	/**
	 * 
	 * @param controller
	 */
	public BridgingControllerActionParameterSystem(BridgingController controller) {
            this.controller = controller;
            initActionForParameterSystem();
        }

    private void initActionForParameterSystem() {
         controller.getView().getBtnGeneralSettingReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnGeneralSettingReload();
             }

         });
         controller.getView().getBtnGeneralSettingSimpan().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnGeneralSettingSimpan();
             }

         });  
         controller.getView().getBtnGeneralSettingKonfigurasiEmaiSimpan().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnGeneralSettingKonfigurasiEmaiSimpan();
             }
         });
         controller.getView().getBtnMapTipeOutletHapus().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapTipeOutletHapus();
             }
         });
         controller.getView().getBtnMapTipeOutletSimpan().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapTipeOutletSimpan();
             }
         });
         controller.getView().getBtnMapTipeOutletReload().addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnMapTipeOutletReload();
              }

          });
         
         //POKARI
         controller.getView().getBtnGeneralSettingPokariSimpan().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnGeneralSettingPokariSimpan();
             }
         });
         controller.getView().getBtnGeneralSettingPokariReload().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnGeneralSettingPokariReload();
             }
         });
         controller.getView().getBtnPathKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnPathKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation();
             }
         });            
    }
    
    //KONFIGURASI POKARI
        public void aksiBtnGeneralSettingPokariSimpan(){
                KonfigurasiUtils konfigUtils = new KonfigurasiUtils();
                konfigUtils.simpanKonfigurasiPokari(controller.getView().getTextKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation().getText().trim());
                    
        }
        public void aksiBtnGeneralSettingPokariReload(){
                    Sysvar sysvar;                    
                    sysvar = controller.getModel().sysvarDao.findById("_PO_LOC");
                    if (sysvar !=null) 
                       controller.getView().getTextKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation().setText(sysvar.getNilaiString1());            
            
        }
                
        public void aksiBtnPathKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation(){
            FileFilter filter1 = new ExtensionFileFilter("XLSX", new String[] { "XLSX"});
            JFileChooser fileChooser1 = new JFileChooser(controller.getModel().getCurrentPath());
            //SUPAYA YANG DI HASILKAN HANYA DIREKTORY SAJA
            fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("LOKASI TEMPLATE OUTPUT IDOS");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath();
                    controller.getModel().setCurrentPath(theFilePath);
                    
                    //JIKA FILE YANG DIBUTUHKAN ADA MAKA AKAN DISET LOKASI YANG BENAR : JIKA TIDAK ADA MAKA TAMPIL PESAN
                    boolean templateKurang = false;
                    List<String> listMessageFilePathKurang = new ArrayList<>();
                    
                    File file1 = new File(theFilePath + File.separator + "Ar_Customer (Master Otlet).xlsx");
                    if (! file1.exists()){
                        templateKurang = true;
                        listMessageFilePathKurang.add("Ar_Customer (Master Otlet).xlsx");
                        //messageFilePathKurang[0] = "Ar_Customer (Master Otlet).xlsx";
                    }
                    File file2 = new File(theFilePath + File.separator + "Can_DDeliveryOrder (Transaksi DO-Return).xlsx");
                    if (! file2.exists()){
                        templateKurang = true;
                        listMessageFilePathKurang.add("Can_DDeliveryOrder (Transaksi DO-Return).xlsx");
                    }
                    File file3 = new File(theFilePath + File.separator + "Sp_Employee (Master Salesman).xlsx");
                    if (! file3.exists()){
                        templateKurang = true;
                        listMessageFilePathKurang.add("Sp_Employee (Master Salesman).xlsx");
                    }
                    File file4 = new File(theFilePath + File.separator + "Sp_EmployeeTarget (Target Salesman).xlsx");
                    if (! file4.exists()){
                        templateKurang = true;
                        listMessageFilePathKurang.add("Sp_EmployeeTarget (Target Salesman).xlsx");
                    }
                    
                    if (templateKurang){
                        String message = "";
                        int pencacah = 1;
                        for (String item: listMessageFilePathKurang) {
                            message += pencacah++ + ". " + item.trim() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, "File Template Berikut Tidak Ada: \n"
                                + message, "Warning", JOptionPane.ERROR_MESSAGE);                        
                    }
                    controller.getView().getTextKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation().setText(theFilePath);                                        
                    
                }               
            }              
        }

            //SORRY: KITA MENARUHNYA DISINI --> KESALAHAN AWAL KITA TIDAK MENARUH PADA MODEL
             //General Setting / Parameter Sistem
             public void aksiBtnGeneralSettingReload() {
                    //Konfigurasi
                    Sysvar sysvar;
                    
                    sysvar = controller.getModel().sysvarDao.findById("_DIST_CODE");
                    if (sysvar !=null) 
                       controller.getView().getTextDistributorCode().setText(sysvar.getNilaiString1());
                    sysvar =controller.getModel().sysvarDao.findById("_DIST_NAME");
                    
                    if (sysvar !=null) 
                       controller.getView().getTextDistributorName().setText(sysvar.getNilaiString1());

                    sysvar =controller.getModel().sysvarDao.findById("_REC_SLS");
                    
                    if (sysvar !=null) 
                       controller.getView().getTextRecordTypeSales().setText(sysvar.getNilaiString1());
                    sysvar =controller.getModel().sysvarDao.findById("_REC_STK");
                    
                    if (sysvar !=null) 
                       controller.getView().getTextRecordTypeStock().setText(sysvar.getNilaiString1());
                    sysvar =controller.getModel().sysvarDao.findById("_REC_CLN");
                    
                    if (sysvar !=null) 
                       controller.getView().getTextRecordTypeClient().setText(sysvar.getNilaiString1());
                    sysvar =controller.getModel().sysvarDao.findById("_REC_SO");
                    
                    if (sysvar !=null) 
                       controller.getView().getTextRecordTypeSo().setText(sysvar.getNilaiString1());
                    sysvar =controller.getModel().sysvarDao.findById("_WH_CODE");
                    
                    if (sysvar !=null) 
                       controller.getView().getTextWarehouseWarehouseCode().setText(sysvar.getNilaiString1());
                    sysvar =controller.getModel().sysvarDao.findById("_WH_DESC");
                    
                    if (sysvar !=null) 
                       controller.getView().getTextWarehouseWarehouseDescription().setText(sysvar.getNilaiString1());

                    sysvar =controller.getModel().sysvarDao.findById("_EM_FROM");
                    
                    if (sysvar !=null) 
                       controller.getView().getTextEmailFrom().setText(sysvar.getNilaiString1());

                    sysvar =controller.getModel().sysvarDao.findById("_EM_PASS");
                    
                    if (sysvar !=null) 
                       controller.getView().getTextEmailPassword().setText(sysvar.getNilaiString1());

                    sysvar =controller.getModel().sysvarDao.findById("_EM_TO");
                    
                    if (sysvar !=null) 
                       controller.getView().getTextEmailTo().setText(sysvar.getNilaiString1());
                    sysvar =controller.getModel().sysvarDao.findById("_EM_SUB");
                    
                    if (sysvar !=null) 
                       controller.getView().getTextEmailSubject().setText(sysvar.getNilaiString1());

                    sysvar =controller.getModel().sysvarDao.findById("_TPR_NoB");                    
                    if (sysvar !=null) 
                        controller.getView().getCheckTprbDiluarBarang().setSelected(sysvar.getNilaiBol1());
                    
                    //POKARI
                    sysvar = controller.getModel().sysvarDao.findById("");
                    if (sysvar != null)
                        controller.getView().getTextKonfigurasiAndUtilitiesPokariTemplateOutputIdosLocation().setText(sysvar.getNilaiString1());
                    
             }
             
             public void aksiBtnGeneralSettingSimpan() {
                KonfigurasiUtils konfigUtils = new KonfigurasiUtils();
                String passEmail = new String(controller.getView().getTextEmailPassword().getPassword());

                konfigUtils.simpanKonfigurasi(controller.getView().getTextDistributorCode().getText(),controller.getView().getTextDistributorName().getText(),controller.getView().getTextRecordTypeSales().getText(), 
                       controller.getView().getTextRecordTypeStock().getText(),controller.getView().getTextRecordTypeClient().getText(),controller.getView().getTextRecordTypeSo().getText(), 
                       controller.getView().getTextWarehouseWarehouseCode().getText(),controller.getView().getTextWarehouseWarehouseDescription().getText(), 
                       controller.getView().getTextEmailFrom().getText(),controller.getView().getTextEmailTo().getText(),controller.getView().getTextEmailSubject().getText(), 
                        passEmail);
                
             }
             public void aksiBtnGeneralSettingKonfigurasiEmaiSimpan(){
                 /**
                  * HAHAHA PAKE SAMA AJA
                  */
                 aksiBtnGeneralSettingSimpan();
             }
             
    
    public void aksiBtnMapTipeOutletHapus() {
        MapTipeOutlet item = new MapTipeOutlet();
        item.setIdTipeOutlet(controller.getView().getTextMapTipeOutletIdTypeOutletScy().getText().trim().toUpperCase());
        item.setTipeOutlet(controller.getView().getTextMapTipeOutletIdTipeOutlet().getText().trim().toUpperCase());
        item.setDeskripsi(controller.getView().getTextMapTipeOutletDeskripsi().getText().trim().toUpperCase());
        if ((! item.getIdTipeOutlet().equals("")) || (! item.getTipeOutlet().equals(""))) {
            controller.getModel().mapTipeOutletDao.delete(item);
            controller.getView().resetTeksMappingTipeOutlet();
            aksiBtnMapTipeOutletReload();
        } else {
            JOptionPane.showMessageDialog(null, "ID Outlet Kosong", "Pesan Error", JOptionPane.WARNING_MESSAGE);        
        }    
    }
    
    
//             public void aksiBtnMapTipeOutletHapus() {}
//             public void aksiBtnMapTipeOutletSimpan() {}
//             public void aksiBtnMapTipeOutletReload() {}
    
    public void aksiBtnMapTipeOutletSimpan() {
        MapTipeOutlet item = new MapTipeOutlet();
        item.setIdTipeOutlet(controller.getView().getTextMapTipeOutletIdTypeOutletScy().getText().trim().toUpperCase());
        item.setTipeOutlet(controller.getView().getTextMapTipeOutletIdTipeOutlet().getText().trim().toUpperCase());
        item.setDeskripsi(controller.getView().getTextMapTipeOutletDeskripsi().getText().trim().toUpperCase());
        if ((! item.getIdTipeOutlet().equals("")) || (! item.getTipeOutlet().equals(""))) {
            controller.getModel().mapTipeOutletDao.saveOrUpdate(item);
            controller.getModel().tmMaptipeOutlet.add(item);
            aksiBtnMapTipeOutletReload();
        } else {
            JOptionPane.showMessageDialog(null, "ID Outlet Kosong", "Pesan Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void aksiListMapTipeOutletSeleksi() {        
        int rowIndex = controller.getView().getTableMappingTipeOutlet().getSelectedRow();
        if (rowIndex >= 0) {
            MapTipeOutlet item = new MapTipeOutlet();
            item = controller.getModel().tmMaptipeOutlet.get(rowIndex);

           controller.getView().getTextMapTipeOutletIdTypeOutletScy().setText(item.getIdTipeOutlet());
           controller.getView().getTextMapTipeOutletIdTipeOutlet().setText(item.getTipeOutlet());
           controller.getView().getTextMapTipeOutletDeskripsi().setText(item.getDeskripsi());
        }
       
    }
    
    
    public void aksiBtnMapTipeOutletReload() {
        List<MapTipeOutlet> lst = controller.getModel().mapTipeOutletDao.findAll();
        controller.getModel().tmMaptipeOutlet = new GenericTableModel<>(lst, MapTipeOutlet.class);
        controller.getView().getTableMappingTipeOutlet().setModel(controller.getModel().tmMaptipeOutlet);
    }
             
             
             
    
    public void aksiReloadKonfig() {
        aksiBtnGeneralSettingReload();
        aksiBtnMapTipeOutletReload();
        aksiBtnGeneralSettingPokariReload();
    }



}