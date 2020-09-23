package other;

import com.sun.awt.AWTUtilities;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
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

    public View_UI() {
        initComponents();
        setIconImage(loadImageIcon("logo1 copy22.png").getImage());//sets page icon
        SyntheticaBlackStarLookAndFeel.setWindowsDecorated(false);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);//to remove toolbar
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStaffLog = new javax.swing.JButton();
        btnCustLog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStaffLog.setText("Staff");
        btnStaffLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffLogActionPerformed(evt);
            }
        });
        getContentPane().add(btnStaffLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 79, -1));

        btnCustLog.setText("Customer");
        btnCustLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustLogActionPerformed(evt);
            }
        });
        getContentPane().add(btnCustLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1 copy2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 133));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStaffLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffLogActionPerformed
    this.dispose();
    new loginUI().setVisible(true);
    util.EventLog.eventLog("This is btnStaffLogActionevent log");
    }//GEN-LAST:event_btnStaffLogActionPerformed

    private void btnCustLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustLogActionPerformed
    this.dispose();
    new CustOrder1_UI().setVisible(true);  
    util.EventLog.eventLog("This is btnCustLogActionevent log");
    }//GEN-LAST:event_btnCustLogActionPerformed
    
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
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustLog;
    private javax.swing.JButton btnStaffLog;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
