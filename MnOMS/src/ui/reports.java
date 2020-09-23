
package ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class reports extends javax.swing.JFrame {

    public reports() {
    initComponents();
    }

    
    
  public reports(String fileName){
//          ,HashMap parameter,JFrame form) {
      this();  
      initComponents();
        
         setLocationRelativeTo(null);
         try{
            // String filem="C://Users//Hp//Documents//NetBeansProjects//MnOMS//src//ireports//Menus.jasper";
             System.out.println("PROP"+JRPropertiesMap.class.getPackage().getImplementationVersion());
  Class.forName("com.mysql.jdbc.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay","root","earth");
   Map<String, Object> t = new HashMap<String, Object>();
            t.put("ID","M01");
   JasperPrint print=JasperFillManager.fillReport(fileName,t,con);
   
//,parameter,con);
   JRViewer viewer=new JRViewer(print);
   viewer.locate(50, 50);
   viewer.setSize(1000 , 1000);
   Container c=getContentPane();
   c.setLayout(new BorderLayout());
   c.add(viewer);
   
   
  }
 catch(Exception cnfe){
     cnfe.printStackTrace();
 }
 }

//    public reports() {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("rep");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new reports("C://Users//Hp//Documents//NetBeansProjects//MnOMS//src//ireports//Menus.jasper").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
