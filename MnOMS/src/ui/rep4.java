
package ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;


public class rep4 extends javax.swing.JFrame {

   Connection connection = null;
    public rep4() {

    initComponents();
    setIconImage(loadImageIcon("logo1 copy22.png").getImage());//sets page icon
    setLocationRelativeTo(null);
        
        String HOST = "jdbc:mysql://localhost:3306/corel_bay";
        String USERNAME = "root";
        String PASSWORD = "earth";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error : " + e.getMessage());
        }

        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
            
            Statement sql = connection.createStatement();
            ResultSet set = sql.executeQuery("select * from menus");
            set.next();
            
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
        
        Map<String, Object> t = new HashMap<String, Object>();
     
        try {
            //Fill the report with parameter, connection and the stream reader
            JasperPrint jasperPrint = JasperFillManager.fillReport("E:\\NetBeans2\\MnOMS\\src\\ireports\\OurMenu.jasper", t, connection);
            //Viewer for JasperReport
            JRViewer viewer = new JRViewer(jasperPrint);
            //Insert viewer to a JInternalFrame to make it showable
           viewer.locate(50, 50);
           viewer.setSize(1000 , 1000);
           Container c=getContentPane();
           c.setLayout(new BorderLayout());
           c.add(viewer);

            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            container.add(viewer);


        } catch (JRException ex) {
            System.out.println("Error : " + ex.getMessage());

        }}
    
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new rep4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
