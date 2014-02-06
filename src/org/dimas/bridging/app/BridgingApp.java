package org.dimas.bridging.app;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import org.dimas.bridging.BridgingUI;
import org.dimas.bridging.app.controller.BridgingController;
import org.dimas.bridging.app.model.BridgingModel;
import org.dimas.bridging.app.view.BridgingView;

/**
 *
 * @author yhawin
 */

public class BridgingApp {
    public static void main(String [] args){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new BridgingUI().setVisible(true);
                //BridgingUI f = new BridgingUI();
                //f.setVisible(true);
                //new BridgingApp().setVisible(true);
                BridgingModel model= new BridgingModel();
                BridgingView view = new BridgingView(model);
                BridgingController controller = new BridgingController(view, model);
                
                view.setLocationRelativeTo(null);
                view.setVisible(true);
                
            }
        });
        
    }
}
