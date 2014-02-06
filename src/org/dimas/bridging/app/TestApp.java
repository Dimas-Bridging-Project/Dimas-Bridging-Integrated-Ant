/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.app;

import org.dimas.bridging.app.controller.BridgingController;
import org.dimas.bridging.app.model.BridgingModel;
import org.dimas.bridging.app.view.BridgingView;

/**
 *
 * @author yhawin
 */
public class TestApp {
    public static void main(String [] args){
        BridgingModel model = new BridgingModel();
        BridgingView view = new BridgingView(model);
        BridgingController f = new BridgingController(view, model);
        
        System.out.println("Sukses");
    }
    
}
