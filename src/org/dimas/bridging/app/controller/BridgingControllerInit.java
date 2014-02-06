/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.app.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.config.spring.hibernate.model.Sysvar;
import org.dimas.bridging.app.model.BridgingModel;
import org.dimas.bridging.app.view.BridgingView;
import org.dimas.bridging.utils.KonfigurasiUtils;

/**
 *
 * @author yhawin
 */
public class BridgingControllerInit {
    protected BridgingView view;
    protected BridgingModel model;
    
    public BridgingControllerInit(BridgingView bridgingView, BridgingModel bridgingModel){
        this.view = bridgingView;
        this.model = bridgingModel;
        //initActionAdditionalDefa();        
        initFormDefa();
        initActionAdditionalDefa();

    }
    
    private void initActionAdditionalDefa(){
        getView().getRadioBackupAndRestoreBackupCommaDelimeted().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getView().getRadioBackupAndRestoreBackupTabDelimeted().setSelected(false);
            }
        });
        getView().getRadioBackupAndRestoreBackupTabDelimeted().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getView().getRadioBackupAndRestoreBackupCommaDelimeted().setSelected(false);
            }
        });
        getView().getRadioBackupAndRestoreBackupCommaDelimetedPokari().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getView().getRadioBackupAndRestoreBackupTabDelimetedPokari().setSelected(false);
            }
        });
        getView().getRadioBackupAndRestoreBackupTabDelimetedPokari().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getView().getRadioBackupAndRestoreBackupCommaDelimetedPokari().setSelected(false);                
            }
        });
         view.getTableMappingTipeOutlet().getSelectionModel().addListSelectionListener(new ListSelectionListener() {

             @Override
             public void valueChanged(ListSelectionEvent e) {
                 
                 //model.aksiListMapTipeOutletSeleksi();
                 
             }
         });
         
         view.getCheckModeDatabase().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                if (view.getCheckModeDatabase().isSelected()) {
                    //databaseMode=true;
                    model.setDatabaseMode(true);
                } else {
                    //databaseMode=false;
                    model.setDatabaseMode(false);
                } 
                //model.aksiBtnPathInputReloadAll();
                
             }
         });
         
         view.getCheckTprbDiluarBarang().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                Sysvar localSysvar = new Sysvar();
                 
                localSysvar = model.getSysvarDao().findById("_TPR_NOB");
                 
                if (localSysvar==null) {
                    localSysvar = new Sysvar();
                    localSysvar.setIdSysvar("_TPR_NOB");
                    localSysvar.setDeskripsi("TPR Barang yang tidak termasuk pada item nota akan di spread");
                    localSysvar.setTipeData("BOL1");
                    localSysvar.setNilaiBol1(false);
                    
                 }
                
                 if (view.getCheckTprbDiluarBarang().isSelected()) {
                    localSysvar.setNilaiBol1(true);
                 }else {
                     localSysvar.setNilaiBol1(false);
                 }
                  
                 model.getSysvarDao().saveOrUpdate(localSysvar);     
                 
             }
         });
         
     }
    private void initFormDefa(){
        getView().setScreenCenter();
        
        //1.Reset Teks
        getView().resetTeksAll();
       
        
        //CheckBox untuk mode database atau memory
        getView().getCheckModeDatabase().setSelected(true);        
        
        //Owner: Model
        //databaseMode = true;
        getModel().setDatabaseMode(true);
        
        //Form Konfigurasi
        KonfigurasiUtils defaultKonfigurasi = new KonfigurasiUtils();
        defaultKonfigurasi.setFirstKonfigurasiIfEmpty();        
        
        //Button JPcode, JTpru, dan JTprb di hidden karena Di handle oleh JHeader
        getView().getBtnRetrieveInputJPcode().setVisible(false);
        getView().getBtnRetrieveInputJTprb().setVisible(false);
        getView().getBtnRetrieveInputJTpru().setVisible(false);
        
        //Jika Mapp masih kosong maka berbahaya --> harus dipaksa untuk input
        
        //MapTipeOutlet mto = new MapTipeOutlet();
        /*
        List<MapTipeOutlet> listMapTipeOutlet = mapTipeOutletDao.findAll();
        if (listMapTipeOutlet.size()==0) {
            JOptionPane.showMessageDialog(this, "Mapping Tipe Outlet Masih Kosong\n Setiap Tipe Scylla Harus di Mapping,"
                    + "\n\n Jika tidak maka......\n TIDAK ADA OUTLET YANG AKAN DI PROSES", "Warning..", JOptionPane.WARNING_MESSAGE);
            getjTabbedPane4().setSelectedIndex(1);
            getjTabbedPane1().setSelectedIndex(9);
            
        }
        */
        //Diganti dengan ini
        
        //MODE UTAMA BUKAN DATABASE
        getView().getCheckModeDatabase().setSelected(false);
        //Owner: Model
        //databaseMode=false;
        getModel().setDatabaseMode(false);
        
        
    }

    public BridgingView getView() {
        return view;
    }

    public void setView(BridgingView view) {
        this.view = view;
    }

    public BridgingModel getModel() {
        return model;
    }

    public void setModel(BridgingModel model) {
        this.model = model;
    }
    
    
}
