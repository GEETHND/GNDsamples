package ui;

import other.View_UI;
import controller.hash;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import java.net.URL;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class loginUI extends javax.swing.JFrame {

    public loginUI() {
        initComponents();
        
        setIconImage(loadImageIcon("logo1 copy22.png").getImage());//sets page icon
        SyntheticaBlackStarLookAndFeel.setWindowsDecorated(false);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);//to remove toolbar
        getRootPane().setDefaultButton(btnLogin);//sets enter key to the button
        lblError.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPW = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        txtUN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 222, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 183, 75, -1));
        jPanel1.add(txtPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 222, 66, -1));

        btnLogin.setBackground(new java.awt.Color(204, 204, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnLogin.setForeground(new java.awt.Color(204, 204, 204));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 179, 73, 25));
        jPanel1.add(txtUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 183, 66, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1 copy2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 392, 137));

        lblError.setText("jLabel4");
        jPanel1.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String uName = txtUN.getText();
        String password = txtPW.getText();
        String pWord=password.toString();
    //username validation
    if (uName.equals("")) {
        lblError.setText("Plese enter a valid user name");
        lblError.setVisible(true);
    }
    else //password validation
    {
        if (password.length() == 0) {
            lblError.setText("Plese enter a password");    
            lblError.setVisible(true);
        } 
        else //encryption
        {
            hash md5 = new hash();
            String pwd = hash.GetEncryptedPssword(password);
            pWord = String.valueOf(password);
            String pass=controller.hash.GetEncryptedPssword(pWord);
            boolean status = controller.login_controller.getUser(uName, pass, lblError);
                    
                    if (status) //creates log for authentication
                    {
                        util.AuthenticationLog.AuthenticatetLog(uName+ " authenticated");
                        this.dispose();
                    }
        }    
        }  
    }//GEN-LAST:event_btnLoginActionPerformed
    
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
                        util.ErrorLog.errorLog("This is loginUI error");
                        Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
                catch (UnsupportedLookAndFeelException ex) {
                    util.ErrorLog.errorLog("This is loginUI error");
                    Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                new loginUI().setVisible(true);
            }
            
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblError;
    private javax.swing.JPasswordField txtPW;
    private javax.swing.JTextField txtUN;
    // End of variables declaration//GEN-END:variables
}
