/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package other;


import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.io.InputStream;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class ReportView {

    Connection connection = null;
    
     public void initConnection() {

        String HOST = "jdbc:mysql://localhost/corel_bay";
        String USERNAME = "root";
        String PASSWORD = "earth";

        try {
           // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

     // default constructor
    public ReportView() {
    }

    // constructor with String parameter
    public ReportView(String fileName) {
        this(fileName, null);
    }

    // constructor with String & Hashmap parameter
    public ReportView(String fileName , HashMap hashMap) {

        initConnection();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(fileName);
        
          try {
            //Fill the report with parameter, connection and the stream reader
            JasperPrint jp = JasperFillManager.fillReport(is, hashMap, connection);
            //Viewer for JasperReport
            JRViewer jv = new JRViewer(jp);
            //Insert viewer to a JFrame to make it showable
            JFrame jf = new JFrame();
            jf.getContentPane().add(jv);
            jf.validate();
            jf.setVisible(true);
            jf.setSize(new Dimension(800, 600));
            jf.setLocation(300, 100);
            jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (JRException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }




}