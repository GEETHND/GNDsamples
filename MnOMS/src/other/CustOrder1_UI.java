package other;

import other.View_UI;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import entity.Rooms;
import java.net.URL;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JRootPane;
import ui.Menu_UI;

public class CustOrder1_UI extends javax.swing.JFrame {

    public Rooms newOrder;
    public CustOrder1_UI() {
        initComponents();
        setIconImage(loadImageIcon("logo1 copy22.png").getImage());//sets page icon
        SyntheticaBlackStarLookAndFeel.setWindowsDecorated(false);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);//to remove toolbar
        getRootPane().setDefaultButton(btnWait);//sets enter key to the button
        
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmbRn.getModel();
        controller.room_Controller.loadRoomtoCombo(dcbm);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbRn = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnWait = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(cmbRn, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 110, 50, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Room no");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 88, -1));

        btnWait.setIcon(new javax.swing.ImageIcon("E:\\MnOMS\\src\\img\\nextblue.png")); // NOI18N
        btnWait.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "See what is awaiting you", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        btnWait.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWaitActionPerformed(evt);
            }
        });
        jPanel1.add(btnWait, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 190, 60));

        lblBack.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setIcon(new javax.swing.ImageIcon("E:\\MnOMS\\src\\img\\back.png")); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 60, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lastlogo2.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 470, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWaitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWaitActionPerformed
        //        String cust=custNo.getText();
        String roomno=cmbRn.getSelectedItem().toString();
        //Login log=new Login();
        Rooms room=new Rooms();
        room.setRoomNo(roomno);
        //log.setUsername(cust);
        
        this.newOrder=room;
        
       // Cust_UI custUI=new Cust_UI(this);
        //custUI.setVisible(true);
        //custUI.setEnabled(true);
        //this.setEnabled(false);
}//GEN-LAST:event_btnWaitActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.dispose();
        new View_UI().setVisible(true);
}//GEN-LAST:event_lblBackMouseClicked
    public static ImageIcon loadImageIcon(String path) {
        URL imgURL = Menu_UI.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CustOrder1_UI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnWait;
    private javax.swing.JComboBox cmbRn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    // End of variables declaration//GEN-END:variables
}
