package org.dimas.bridging.app.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import org.config.spring.hibernate.model.enumgeneral.EnumPrincipal;
import org.dimas.bridging.app.model.BridgingModel;
import org.dimas.bridging.app.view.BridgingView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  YHAWIN
 */
public class BridgingController extends BridgingControllerInit {
        private static final  Logger logger = LoggerFactory.getLogger(BridgingController.class);
    
        BridgingControllerActionRetrieve bridgingContollerActionRetrieve;
        BridgingControllerActionExtract bridgingControllerActionExtract;
        BridgingControllerActionParameterSystem bridgingControllerActionParameterSystem;
        BridgingControllerActionTabelInput bridgingControllerActionTabelInput;
        BridgingControllerActionTabelOutput bridgingControllerActionTabelOutput;
        BridgingControllerActionTabelTabel bridgingControllerActionTabelTabel;
        BridgingControllerActionMappingMaster bridgingControllerActionMappingMaster;

    public String retrieveLogPath;
    public File retrieveFilePath;
    public FileWriter fileWriter;                        
    public BufferedWriter bufferedWriter;
    public PrintWriter printWriter;
        
	/**
	 * bridgingView 
	 * bridgingModel
	 */
        
    public BridgingController(BridgingView view, BridgingModel model) {
            super(view, model);
            //TEST PRINCIPAL
            getModel().setPrincipal(EnumPrincipal.POKARI.getStrCode());
            this.getView().setTitle("Dimas Kediri >> Bridging All >> " + getModel().getPrincipal() + " >>  update: 13 Mar 2014" );
            
            bridgingContollerActionRetrieve = new BridgingControllerActionRetrieve(this);
            bridgingControllerActionExtract = new BridgingControllerActionExtract(this);
            bridgingControllerActionParameterSystem = new BridgingControllerActionParameterSystem(this);
            bridgingControllerActionTabelInput = new BridgingControllerActionTabelInput(this);
            bridgingControllerActionTabelOutput = new BridgingControllerActionTabelOutput(this);            
            bridgingControllerActionTabelTabel = new BridgingControllerActionTabelTabel(this);
            bridgingControllerActionMappingMaster = new BridgingControllerActionMappingMaster(this);

            aksiReloadAll();
            
            if (getModel().getPrincipal().equalsIgnoreCase("BAYGON")) {
                initBaygon();
            }else if(getModel().getPrincipal().equalsIgnoreCase("KEK")) {
                initKEK();
            } else if(getModel().getPrincipal().equalsIgnoreCase("POKARI")) {
                initPokari();
            } else {
                System.err.println("Sementara cuma ada 3");
                
            }    
            initLocalLogger();
       
    }
    private void initLocalLogger(){
             //Inisilaisasi file untuk log
            retrieveLogPath = System.getProperty("user.home");
            retrieveFilePath = new File(retrieveLogPath + "/bridging-integrated-log.txt");            
        
    }
    
    private void initBaygon(){
        view.getViewVisibility().removeAllPanelUtama();
        view.getViewVisibility().setVisibilitiDefaultBaygon();
    }   
    private void initKEK(){
        view.getViewVisibility().removeAllPanelUtama();
        view.getViewVisibility().setVisibilityDefaultKEK();
    }    
    private void initPokari(){
        view.getViewVisibility().removeAllPanelUtama();
        view.getViewVisibility().setVisibilityDefaultPokari();                
    }  
   
    public void aksiReloadAll(){
        bridgingControllerActionTabelInput.aksiReloadInput();        
        bridgingControllerActionParameterSystem.aksiReloadKonfig();
        bridgingControllerActionTabelOutput.aksiReloadOutput();
        
        bridgingControllerActionTabelTabel.aksiReloadTabelTabel();
        bridgingControllerActionMappingMaster.aksiReloadMaster();
    }
 
}