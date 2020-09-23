
package ui;

import controller.barOrder_controller;
import controller.foodOrder_controller;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import java.net.URL;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


public class Barman_view extends javax.swing.JFrame {

    
    public Barman_view() {
        initComponents();
        setIconImage(loadImageIcon("logo1 copy22.png").getImage());//sets page icon
//        SyntheticaBlackStarLookAndFeel.setWindowsDecorated(false);
//        getRootPane().setWindowDecorationStyle(JRootPane.NONE);//to remove toolbar
        
        DefaultTableModel model=(DefaultTableModel) BOTtable.getModel();
        controller.barOrder_controller.LoadBOTTable(model);
        BOTtable.setModel(model);
        
        DefaultTableModel model1=(DefaultTableModel) itemTable1.getModel();
        controller.menuItem_controller.LoadBarItems2(model1);
        itemTable1.setModel(model1);
        
        lblVBOT.setVisible(false);
        jPanelBOT.setVisible(false);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTChef = new javax.swing.JTabbedPane();
        kots = new javax.swing.JPanel();
        jPanelBOT = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableBOTitems = new javax.swing.JTable();
        lblVBOT = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbBeingProcessed = new javax.swing.JLabel();
        lblProcessed = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BOTtable = new javax.swing.JTable();
        jPanelVI = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        itemTable1 = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("M E N U   A N D   O R D E R   M A N A G E M E N T   S Y S T E M - b a r m a n ' s  p a n e l");
        setBounds(new java.awt.Rectangle(200, 0, 0, 0));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTChef.setBackground(new java.awt.Color(18, 71, 103));
        jTChef.setForeground(new java.awt.Color(0, 0, 51));
        jTChef.setFont(new java.awt.Font("Times New Roman", 3, 24));

        kots.setBackground(new java.awt.Color(18, 71, 103));
        kots.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBOT.setBackground(new java.awt.Color(51, 137, 154));
        jPanelBOT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableBOTitems.setBackground(new java.awt.Color(18, 71, 103));
        jTableBOTitems.setForeground(new java.awt.Color(255, 255, 255));
        jTableBOTitems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item_no", "	Qty"
            }
        ));
        jScrollPane6.setViewportView(jTableBOTitems);

        javax.swing.GroupLayout jPanelBOTLayout = new javax.swing.GroupLayout(jPanelBOT);
        jPanelBOT.setLayout(jPanelBOTLayout);
        jPanelBOTLayout.setHorizontalGroup(
            jPanelBOTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBOTLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanelBOTLayout.setVerticalGroup(
            jPanelBOTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBOTLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        kots.add(jPanelBOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 290, 180));

        lblVBOT.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblVBOT.setForeground(new java.awt.Color(255, 255, 255));
        lblVBOT.setText("Click here to view Ordered Items");
        lblVBOT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVBOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVBOTMouseClicked(evt);
            }
        });
        kots.add(lblVBOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jPanel11.setBackground(new java.awt.Color(51, 137, 154));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setPreferredSize(new java.awt.Dimension(760, 95));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 100, 70));

        lbBeingProcessed.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbBeingProcessed.setForeground(new java.awt.Color(255, 255, 255));
        lbBeingProcessed.setText("This order is being processed now.");
        lbBeingProcessed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBeingProcessed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBeingProcessedMouseClicked(evt);
            }
        });
        jPanel11.add(lbBeingProcessed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lblProcessed.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblProcessed.setForeground(new java.awt.Color(255, 255, 255));
        lblProcessed.setText("This order is processed.");
        lblProcessed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProcessed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProcessedMouseClicked(evt);
            }
        });
        jPanel11.add(lblProcessed, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        kots.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 353, 770, 82));

        BOTtable.setBackground(new java.awt.Color(18, 71, 103));
        BOTtable.setFont(new java.awt.Font("Tahoma", 1, 11));
        BOTtable.setForeground(new java.awt.Color(255, 255, 255));
        BOTtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket_no", "Date", "Time", "Status"
            }
        ));
        BOTtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOTtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BOTtable);

        kots.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 280));

        jTChef.addTab("BOT's", kots);

        jPanelVI.setBackground(new java.awt.Color(18, 71, 103));

        jPanel8.setBackground(new java.awt.Color(51, 137, 154));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setPreferredSize(new java.awt.Dimension(760, 95));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 100, 70));

        itemTable1.setBackground(new java.awt.Color(18, 71, 103));
        itemTable1.setFont(new java.awt.Font("Tahoma", 1, 11));
        itemTable1.setForeground(new java.awt.Color(255, 255, 255));
        itemTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item_no", "Description", "Availability", "Price"
            }
        ));
        jScrollPane4.setViewportView(itemTable1);

        javax.swing.GroupLayout jPanelVILayout = new javax.swing.GroupLayout(jPanelVI);
        jPanelVI.setLayout(jPanelVILayout);
        jPanelVILayout.setHorizontalGroup(
            jPanelVILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVILayout.createSequentialGroup()
                .addGroup(jPanelVILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVILayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE))
                    .addGroup(jPanelVILayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelVILayout.setVerticalGroup(
            jPanelVILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVILayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTChef.addTab("View Bar Items", jPanelVI);

        jPanel1.add(jTChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 800, 490));

        jLabel27.setFont(new java.awt.Font("Script MT Bold", 0, 14));
        jLabel27.setText("Welcome to");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 73, -1));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Perpetua Titling MT", 1, 28));
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hotellogo3.png"))); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 800, 100));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("M E N U   A N D   O R D E R   M A N A G E M E N T   S Y S T E M");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 810, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 3, 14));
        jLabel31.setForeground(new java.awt.Color(153, 0, 0));
        jLabel31.setText("Logout");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sea_and_beach_1920x12002.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOTtableMouseClicked
        lblVBOT.setVisible(true);
        jPanelBOT.setVisible(false);
        
    }//GEN-LAST:event_BOTtableMouseClicked

    private void lblVBOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVBOTMouseClicked
        jPanelBOT.setVisible(true);
        jTableBOTitems.setVisible(true);
        int rowno=BOTtable.getSelectedRow();
        String name = BOTtable.getModel().getValueAt(rowno, 0).toString();
        int ticket_no=Integer.parseInt(name);System.out.println("bot" + ticket_no);
        
        DefaultTableModel model= (DefaultTableModel) jTableBOTitems.getModel();
        barOrder_controller.LoadBOTItems(model,ticket_no);
}//GEN-LAST:event_lblVBOTMouseClicked

    private void lbBeingProcessedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBeingProcessedMouseClicked
        int rowno = BOTtable.getSelectedRow();
        String ticket = BOTtable.getModel().getValueAt(rowno, 0).toString();
        
        barOrder_controller.updateStatus("Being processed", ticket);
        DefaultTableModel model=(DefaultTableModel) BOTtable.getModel();
        controller.barOrder_controller.LoadBOTTable(model);
        BOTtable.setModel(model);
}//GEN-LAST:event_lbBeingProcessedMouseClicked

    private void lblProcessedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProcessedMouseClicked
        int rowno = BOTtable.getSelectedRow();
        String ticket = BOTtable.getModel().getValueAt(rowno, 0).toString();
        
        foodOrder_controller.updateStatus("Processed", ticket);
        DefaultTableModel model=(DefaultTableModel) BOTtable.getModel();
        controller.barOrder_controller.LoadBOTTable(model);
        BOTtable.setModel(model);
}//GEN-LAST:event_lblProcessedMouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        this.dispose();
        loginUI log = new loginUI();
        log.setVisible(true);
    }//GEN-LAST:event_jLabel31MouseClicked

    public static ImageIcon loadImageIcon(String path) {
        URL imgURL = Menu_UI.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }}
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    try {
                        UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
                    } catch (ParseException ex) {
                        Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Barman_view().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BOTtable;
    private javax.swing.JTable itemTable1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelBOT;
    private javax.swing.JPanel jPanelVI;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTChef;
    private javax.swing.JTable jTableBOTitems;
    private javax.swing.JPanel kots;
    private javax.swing.JLabel lbBeingProcessed;
    private javax.swing.JLabel lblProcessed;
    private javax.swing.JLabel lblVBOT;
    // End of variables declaration//GEN-END:variables
}
