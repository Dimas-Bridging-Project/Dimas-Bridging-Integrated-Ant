/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.app.view;

import java.awt.Dimension;
import org.bagus.common.images.ScaleImage;

/**
 *
 * @author yhawin
 */
public class BridgingViewVisibility {
    private BridgingView view;
    public BridgingViewVisibility(BridgingView view){
        this.view = view;
        
    }
    /**
     * 
     * @param bridgingView 
     * @param bridgingModel
     */
    public void removeAllPanelUtama(){
        view.getjTabbedPaneUtama().remove(view.getjPanelUtamaBackupAndRestore());
        view.getjTabbedPaneUtama().remove(view.getjPanelUtamaConfigAndUtils());
        view.getjTabbedPaneUtama().remove(view.getjPanelUtamaInputScylla());
        view.getjTabbedPaneUtama().remove(view.getjPanelUtamaKonfigAndUtils());
        view.getjTabbedPaneUtama().remove(view.getjPanelUtamaGenerate());
        view.getjTabbedPaneUtama().remove(view.getjPanelUtamaOutputBaygon());
        view.getjTabbedPaneUtama().remove(view.getjPanelUtamaOutputKEK());
        view.getjTabbedPaneUtama().remove(view.getjPanelUtamaOutputPokari());
        view.getjTabbedPaneUtama().remove(view.getjPanelUtamaSettingKek());
        view.getjTabbedPaneUtama().remove(view.getjPanelUtamaSettingPokari());
        view.getjTabbedPaneUtama().remove(view.getjPanelUtamaTemplates1());
       
    }
    public void addAllPanelUtama(){
        view.getjTabbedPaneUtama().add("Backup and Restore", view.getjPanelUtamaBackupAndRestore());
        view.getjTabbedPaneUtama().add("Config and Utils", view.getjPanelUtamaConfigAndUtils());
        view.getjTabbedPaneUtama().add("Input Scylla", view.getjPanelUtamaInputScylla());
        view.getjTabbedPaneUtama().add("Generate", view.getjPanelUtamaGenerate());
        view.getjTabbedPaneUtama().add("Output Baygon", view.getjPanelUtamaOutputBaygon());
            view.getjPanelSubOutputBaygon1().setSize(new Dimension(view.getjPanelUtamaOutputBaygon().getSize()));
            view.getjPanelUtamaOutputBaygon().add(view.getjPanelSubOutputBaygon1());
        
        view.getjTabbedPaneUtama().add("Output KEK", view.getjPanelUtamaOutputKEK());        
            view.getjPanelSubOutputKek1().setSize(new Dimension(view.getjPanelUtamaOutputKEK().getSize()));
            view.getjPanelUtamaOutputKEK().add(view.getjPanelSubOutputKek1());
            
        view.getjTabbedPaneUtama().add("Output Pokari", view.getjPanelUtamaOutputPokari());
            view.getjPanelSubOutputPokari1().setSize(new Dimension(view.getjPanelUtamaOutputPokari().getSize()));
            view.getjPanelUtamaOutputPokari().add(view.getjPanelSubOutputPokari1());
            
        view.getjTabbedPaneUtama().add("Setting KEK", view.getjPanelUtamaSettingKek());
        view.getjTabbedPaneUtama().add("Setting Pokari", view.getjPanelUtamaSettingPokari());
        view.getjTabbedPaneUtama().add("Templates1", view.getjPanelUtamaTemplates1());       
    }
    public void setVisibilityAllPanelUtama(boolean bol) {
        if (bol == true) {         
            addAllPanelUtama();
        }else {
            removeAllPanelUtama();
        }
    }
    public void setVisibilitiDefaultBaygon(){
        addAllPanelUtama();
        
    }
    public void setVisibilityDefaultKEK(){
        /**
         * MENGGANTI jPanel untuk Extract dengan miliknya POKARI
         */
        /**
         * MENGGANTI jPanel untuk Extract dengan miliknya POKARI
         */
        //1. Ganti Gambar Sesuai dengan Principal yang aktif
        ScaleImage scaleImage = new ScaleImage("/org/dimas/bridging/images/logo/kino1.jpg");
        scaleImage.setSize(new Dimension(view.getjPanelSubGeneratePicture().getSize()));
        //scaleImage.setSize(new Dimension(100, 128));
        view.getjPanelSubGeneratePicture().add(scaleImage);
        
        Dimension dimension = new Dimension(view.getjPanelSubGenerateExtract().getPreferredSize());        
        try{
            view.getjPanelSubGenerateExtract().remove(view.getjPanelSubGenerateExtractKek());        
        } catch(Exception ex){}
        
        view.getjPanelSubGenerateExtract().add(view.getjPanelGenerateExtractKek1());        
        view.getjPanelSubGenerateExtract().setPreferredSize(dimension);
        view.getjPanelGenerateExtractKek1().setPreferredSize(dimension);
        view.getjPanelGenerateExtractKek1().setLocation(0, 0);
        
        view.getjTabbedPaneUtamaBackupAndRestore().remove(view.getjPanelSubBackupAndRestoreBackupAndRestorePokari());

        
        
        view.getjTabbedPaneUtama().add("Generate", view.getjPanelUtamaGenerate());
        view.getjTabbedPaneUtama().add("Input Scylla", view.getjPanelUtamaInputScylla());

        view.getjTabbedPaneUtama().add("Output KEK", view.getjPanelUtamaOutputKEK());
            view.getjPanelSubOutputKek1().setSize(new Dimension(view.getjPanelUtamaOutputKEK().getSize()));
            view.getjPanelUtamaOutputKEK().add(view.getjPanelSubOutputKek1());
        
        view.getjTabbedPaneUtama().add("Setting KEK", view.getjPanelUtamaSettingKek());
        view.getjTabbedPaneUtama().add("Backup and Restore", view.getjPanelUtamaBackupAndRestore());
        view.getjTabbedPaneUtama().add("Config and Utils", view.getjPanelUtamaConfigAndUtils());
        view.getjTabbedPaneUtama().setSelectedIndex(0);
    }
    public void setVisibilityDefaultPokari(){
        /**
         * MENGGANTI jPanel untuk Extract dengan miliknya POKARI
         */
        //1. Ganti Gambar Sesuai dengan Principal yang aktif
        ScaleImage scaleImage = new ScaleImage("/org/dimas/bridging/images/logo/pokari3.jpg");
        //scaleImage.setSize(new Dimension(view.getjPanelSubGeneratePicture().getSize()));
        scaleImage.setSize(new Dimension(90, 80));
        view.getjPanelSubGeneratePicture().add(scaleImage);
        
        //GENERAL SETTING
        view.getjTabbedPaneUtamaConfigAndUtils().remove(view.getjPanelSubKonfigAndUtilBaygon());
        
        //Ganti Panel Extract Bawah dengan miliknya POKARI
        Dimension dimension = new Dimension(view.getjPanelSubGenerateExtract().getPreferredSize());    
        
        try{
            view.getjPanelSubGenerateExtract().remove(view.getjPanelSubGenerateExtractKek());        
        } catch(Exception ex){}
        view.getjPanelSubGenerateExtract().add(view.getjPanelGenerateExtractPokari1());
        
        view.getjPanelSubGenerateExtract().setPreferredSize(dimension);
        view.getjPanelGenerateExtractPokari1().setPreferredSize(dimension);
        view.getjPanelGenerateExtractPokari1().setLocation(0, 0);
        
 
        view.getjTabbedPaneUtamaBackupAndRestore().remove(view.getjPanelSubBackupAndRestoreBackupAndRestoreKek());
        /**
         * PANEL RETRIEVE SCYLLA AND IT'S CONTENT
         */
        view.getTextPathInputCvOutlet().setEnabled(false);
        view.getBtnPathInputCvOutlet().setEnabled(false);
        view.getBtnRetrieveInputCvOutlet().setEnabled(false);
        
        view.getTextPathInputStock().setEnabled(false);
        view.getBtnPathInputStock().setEnabled(false);
        view.getBtnRetrieveInputStock().setEnabled(false);
        view.getjDateChooseTanggalStock().setEnabled(false);
        
        view.getTextPathInputBarangDatang().setEnabled(false);
        view.getBtnPathInputBarangDatang().setEnabled(false);
        view.getBtnRetrieveInputBarangDatang().setEnabled(false);
        
        view.getTextPathInputReturKePabrik().setEnabled(false);
        view.getBtnPathInputReturKePabrik().setEnabled(false);
        view.getBtnRetrieveInputReturKePabrik().setEnabled(false);
        
        view.getTextPathInputStokAdjustment().setEnabled(false);
        view.getBtnPathInputStokAdjustment().setEnabled(false);
        view.getBtnRetrieveInputStokAdjustment().setEnabled(false);
        view.getjDateChooseTanggalStokAdjustment().setEnabled(false);
        
        view.getjTabbedPaneUtama().add("Generate", view.getjPanelUtamaGenerate());
        view.getjTabbedPaneUtama().add("Input Scylla", view.getjPanelUtamaInputScylla());        
        view.getjTabbedPaneUtama().add("Output Pokari", view.getjPanelUtamaOutputPokari());
            view.getjPanelSubOutputPokari1().setSize(new Dimension(view.getjPanelUtamaOutputPokari().getSize()));
            view.getjPanelUtamaOutputPokari().add(view.getjPanelSubOutputPokari1());
        
        view.getjTabbedPaneUtama().add("Setting Pokari", view.getjPanelUtamaSettingPokari());
        view.getjTabbedPaneUtama().add("Backup and Restore", view.getjPanelUtamaBackupAndRestore());
        view.getjTabbedPaneUtama().add("Config and Utils", view.getjPanelUtamaConfigAndUtils());
        view.getjTabbedPaneUtama().setSelectedIndex(0);
    }
    
    
}
