package org.dimas.bridging.app.controller;

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
        
	/**
	 * bridgingView 
	 * bridgingModel
	 */
        
    public BridgingController(BridgingView view, BridgingModel model) {
            super(view, model);
            //TEST PRINCIPAL
            getModel().setPrincipal(EnumPrincipal.POKARI.getStrCode());
            
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