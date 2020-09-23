
package ui;

import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import entity.Menus;
import java.net.URL;
import java.text.ParseException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import validation.val;


public class EditMenuDesc extends javax.swing.JFrame {

    Menu_UI ui;
  
    public EditMenuDesc(Menu_UI ui) {
        this.ui = ui;
        initComponents();
        setIconImage(loadImageIcon("logo1 copy22.png").getImage());
        getRootPane().setDefaultButton(btnSaveDesc);
        lblID.setText(ui.newMenu.getMenuId());
        txtMenuDesc.setText(ui.newMenu.getDescription());
        
        lblError1.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtMenuDesc = new javax.swing.JTextField();
        btnSaveDesc = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblError1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 137, 154));
        setBounds(new java.awt.Rectangle(250, 100, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 137, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setBackground(new java.awt.Color(204, 204, 204));
        lblID.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblID.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu ID"));
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 74, -1));

        txtMenuDesc.setFont(new java.awt.Font("Tahoma", 1, 12));
        jPanel1.add(txtMenuDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 350, 60));

        btnSaveDesc.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnSaveDesc.setText("Save");
        btnSaveDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDescActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnClr.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnClr.setText("Clear");
        btnClr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });
        jPanel1.add(btnClr, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnCancel.setText("Cancel");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        lblError1.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(lblError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 20, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDescActionPerformed
     String newDesc=txtMenuDesc.getText(); 
     String id=lblID.getText();
     
     if(validateForm()){
     int con=JOptionPane.showConfirmDialog(txtMenuDesc, "Update "+id+"?");System.out.print("us"+con);
        if(con==0){
            Menus newMenu=new Menus();
             newMenu.setMenuId(id);
             newMenu.setDescription(newDesc);
             this.dispose();
             controller.menu_controller.newDesc(newMenu);
             new Menu_UI().setVisible(true);
        }
        else
        { 
        } 
     }
     else{
            JOptionPane.showMessageDialog(null, "Not validated");
     }
     
     
    }//GEN-LAST:event_btnSaveDescActionPerformed

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
        txtMenuDesc.setText(null);       
    }//GEN-LAST:event_btnClrActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        ui.setEnabled(true);
        ui.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed
    
    public boolean  validateForm(){
        val v = new val();    
        Vector<JTextField> txt = new Vector<JTextField>();
        txt.add(txtMenuDesc);
        
        
        Vector<JLabel> lblTxt = new Vector<JLabel>();
        lblTxt.add(lblError1);
        
        boolean txtResult = false;
        boolean result;
        
        if (v.isEmptyRequiredField(txt, lblTxt)) {
                txtResult = true;
        }
        if (txtResult) {
            JOptionPane.showMessageDialog(null, "Please fill mandatory fields.");
            result = false;
        }
        else{
            result = true;
        }
        return result;
    }
    
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
                        Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
                catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                new EditMenuDesc(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnSaveDesc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTextField txtMenuDesc;
    // End of variables declaration//GEN-END:variables
}
