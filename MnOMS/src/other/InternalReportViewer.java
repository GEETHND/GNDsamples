/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import javax.swing.JInternalFrame;

public class InternalReportViewer extends JFrame {
    Connection connection = null;

    public InternalReportViewer() {
        //super("Internal View : ", true, true, true, true);
        initComponents();
        //setBounds(0, 0, 600, 500);
        //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public InternalReportViewer(String filename) {
        this(filename, null);
    }

    public InternalReportViewer(String filename, HashMap hashMap) {
        this();
        initConnection();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(filename);

        try {
            //Fill the report with parameter, connection and the stream reader
            JasperPrint jasperPrint = JasperFillManager.fillReport(is, hashMap, connection);
            //Viewer for JasperReport
            JRViewer jRViewer = new JRViewer(jasperPrint);
            //Insert viewer to a JInternalFrame to make it showable

            Container container = getContentPane();
            this.setContentPane(container); 
            container.setLayout(new BorderLayout());
            container.add(jRViewer);


        } catch (JRException ex) {
            System.out.println("Error : " + ex.getMessage());

        }



    }

    private void initConnection() {
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
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }

}
