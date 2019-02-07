/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import javax.swing.JOptionPane;
import modelo.Control_registroRoot;
import vista.Interfaz_RegistroRoot;
import vista.Interfaz_login;

/**
 *
 * @author Ali Guerrero
 */
public class Main {
     
    public static void main(String[] args) {
        Control_registroRoot cr = new Control_registroRoot(null,null,null,null,null,null,0,null);
        
        if (cr.consultaTodo_root() != null ) {
            System.out.println("hola");
            try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Interfaz_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Interfaz_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Interfaz_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Interfaz_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Interfaz_login().setVisible(true);
                }
            });
        }else{
            JOptionPane.showMessageDialog(null, "No existe un Super Usuario registrado\nPor favor precione aceptar y complete el registro.");
            try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Interfaz_RegistroRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Interfaz_RegistroRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Interfaz_RegistroRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Interfaz_RegistroRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            java.awt.EventQueue.invokeLater(new Runnable() {
                
                public void run() {
                    new Interfaz_RegistroRoot().setVisible(true);
                }
            });
        }

    }
}
