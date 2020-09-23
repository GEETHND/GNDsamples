package ui;

import other.*;
import com.sun.awt.AWTUtilities;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import java.awt.Color;
import java.net.URL;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ui.Menu_UI;
import ui.loginUI;



public class View_UI extends javax.swing.JFrame {

    public View_UI() throws ParseException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
        
        initComponents();
        setIconImage(loadImageIcon("logo1 copy22.png").getImage());//sets page icon
        SyntheticaBlackStarLookAndFeel.setWindowsDecorated(false);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);//to remove toolbar
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 101; i++) {
                    try {
                        if (i >= 20) {
                            jLabel3.setText("");
                            jLabel3.setText("Loading Database");
                            jProgressBar1.setForeground(Color.red);
                        }
                        if (i <= 20) {
                            jLabel3.setText("Loading Module");
                        }
                        if(i>=70){
                            jLabel3.setText("Loading GUI Components");
                        }
                        if(i==50){
                            i=70;
                        }
                        jProgressBar1.setValue(i);
                        Thread.sleep(50);
                        if (i == 100) {
                           new loginUI().setVisible(true);
                           dispose();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(View_UI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                }
            }
        }).start();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1 copy2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 133));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 320, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static ImageIcon loadImageIcon(String path) {
        URL imgURL = Menu_UI.class.getResource(path);
        
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } 
        else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    try {
                        try {
                            UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
                        } 
                        catch (ParseException ex) {
                            util.ErrorLog.errorLog("Error in View_UI");
                            Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                    catch (UnsupportedLookAndFeelException ex) {
                        util.ErrorLog.errorLog("Error in View_UI");
                        Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    new View_UI().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(View_UI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(View_UI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
