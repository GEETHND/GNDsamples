
package ui;

import controller.foodOrder_controller;
import controller.menu_controller;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import entity.Menus;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import java.awt.GraphicsEnvironment;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ImageIcon;


public class Chef_view extends javax.swing.JFrame {

    
    public Chef_view() {
        initComponents();
        setIconImage(loadImageIcon("logo1 copy22.png").getImage());//sets page icon
//        SyntheticaBlackStarLookAndFeel.setWindowsDecorated(false);
//        getRootPane().setWindowDecorationStyle(JRootPane.NONE);//to remove toolbar
//        
//        Dimension scrnSize = Toolkit.getDefaultToolkit().getScreenSize();
//        Rectangle winSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
//
//        int taskBarHeight = scrnSize.height - winSize.height;
//        this.setSize(scrnSize.width, scrnSize.height - taskBarHeight);
        
        DefaultTableModel model=(DefaultTableModel) KOTtable.getModel();
        foodOrder_controller.LoadKOTTable(model);
        KOTtable.setModel(model);
        
        
        DefaultTableModel model1=(DefaultTableModel) menuTable1.getModel();
        menu_controller.LoadMenuTable(model1);
        menuTable1.setModel(model1);
        
        DefaultComboBoxModel dcbm1 = (DefaultComboBoxModel) menuCombo1.getModel();
        menu_controller.loadMenutoCombo(dcbm1);
        
        itemViewPanel.setVisible(false);
        lblVKOT.setVisible(false);
        
        
        
//        try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
//        Statement st = con.createStatement();
//        String sql = "SELECT Ticket_no,Date,Time,Status FROM corel_bay.kot k";
//        
//        ResultSet rs = st.executeQuery(sql);
//    DefaultTableModel dtm= new DefaultTableModel();
//        dtm.getDataVector().clear();
//        
//        while (rs.next()) {
//            Vector v=new Vector();
//
//                v.add(rs.getString("Ticket_no"));
//                v.add(rs.getString("Date"));
//                v.add(rs.getString("Time"));
//                v.add(rs.getString("Status"));
//                dtm.addRow(v);
//                  KOTtable.setModel(dtm);
//            }
//        }
//       catch (Exception ex) { 
//            System.out.println(ex.getMessage());
//       }
  
    
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTChef = new javax.swing.JTabbedPane();
        kots = new javax.swing.JPanel();
        itemViewPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableKOTitems = new javax.swing.JTable();
        lblVKOT = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbBeingProcessed = new javax.swing.JLabel();
        lblProcessed = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        KOTtable = new javax.swing.JTable();
        jPanelvm = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblViewMenu1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuTable1 = new javax.swing.JTable();
        jPanelVI = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        menuCombo1 = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        itemTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        lblAddMenu2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("M E N U   A N D   O R D E R   M A N A G E M E N T   S Y S T E M -  c h e f  ' s  p a n e l");
        setBounds(new java.awt.Rectangle(200, 0, 0, 0));
        setResizable(false);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Perpetua Titling MT", 1, 28));
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hotellogo3.png"))); // NOI18N
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 800, 100));

        jTChef.setBackground(new java.awt.Color(18, 71, 103));
        jTChef.setForeground(new java.awt.Color(0, 0, 51));
        jTChef.setFont(new java.awt.Font("Times New Roman", 3, 24));

        kots.setBackground(new java.awt.Color(18, 71, 103));
        kots.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemViewPanel.setBackground(new java.awt.Color(51, 137, 154));
        itemViewPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableKOTitems.setBackground(new java.awt.Color(18, 71, 103));
        jTableKOTitems.setForeground(new java.awt.Color(255, 255, 255));
        jTableKOTitems.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTableKOTitems);

        javax.swing.GroupLayout itemViewPanelLayout = new javax.swing.GroupLayout(itemViewPanel);
        itemViewPanel.setLayout(itemViewPanelLayout);
        itemViewPanelLayout.setHorizontalGroup(
            itemViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemViewPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        itemViewPanelLayout.setVerticalGroup(
            itemViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemViewPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        kots.add(itemViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 290, 180));

        lblVKOT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVKOT.setForeground(new java.awt.Color(255, 255, 255));
        lblVKOT.setText("Click here to view Ordered Items");
        lblVKOT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVKOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVKOTMouseClicked(evt);
            }
        });
        kots.add(lblVKOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

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

        KOTtable.setBackground(new java.awt.Color(18, 71, 103));
        KOTtable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        KOTtable.setForeground(new java.awt.Color(255, 255, 255));
        KOTtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket_no", "Date", "Time", "Status"
            }
        ));
        KOTtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KOTtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(KOTtable);

        kots.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 280));

        jTChef.addTab("KOT's", kots);

        jPanelvm.setBackground(new java.awt.Color(18, 71, 103));
        jPanelvm.setForeground(new java.awt.Color(0, 51, 51));
        jPanelvm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelvm.setPreferredSize(new java.awt.Dimension(793, 95));

        jPanel10.setBackground(new java.awt.Color(51, 137, 154));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setPreferredSize(new java.awt.Dimension(760, 95));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 100, 70));

        lblViewMenu1.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblViewMenu1.setForeground(new java.awt.Color(255, 255, 255));
        lblViewMenu1.setText("View Menu Items");
        lblViewMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblViewMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewMenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViewMenu1MouseEntered(evt);
            }
        });
        jPanel10.add(lblViewMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        menuTable1.setBackground(new java.awt.Color(18, 71, 103));
        menuTable1.setFont(new java.awt.Font("Tahoma", 1, 11));
        menuTable1.setForeground(new java.awt.Color(255, 255, 255));
        menuTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Description"
            }
        ));
        menuTable1.setRowHeight(24);
        jScrollPane2.setViewportView(menuTable1);

        javax.swing.GroupLayout jPanelvmLayout = new javax.swing.GroupLayout(jPanelvm);
        jPanelvm.setLayout(jPanelvmLayout);
        jPanelvmLayout.setHorizontalGroup(
            jPanelvmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelvmLayout.createSequentialGroup()
                .addGroup(jPanelvmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelvmLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE))
                    .addGroup(jPanelvmLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelvmLayout.setVerticalGroup(
            jPanelvmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelvmLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTChef.addTab("View Menu", jPanelvm);

        jPanelVI.setBackground(new java.awt.Color(18, 71, 103));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Menu");

        menuCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombo1ActionPerformed(evt);
            }
        });

        jScrollPane4.setBackground(new java.awt.Color(18, 71, 103));
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setFont(new java.awt.Font("Tahoma", 1, 11));

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

        jPanel8.setBackground(new java.awt.Color(51, 137, 154));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setPreferredSize(new java.awt.Dimension(760, 95));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddMenu2.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblAddMenu2.setForeground(new java.awt.Color(255, 255, 255));
        lblAddMenu2.setText("Go to Menu");
        lblAddMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMenu2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddMenu2MouseEntered(evt);
            }
        });
        jPanel8.add(lblAddMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 100, 70));

        javax.swing.GroupLayout jPanelVILayout = new javax.swing.GroupLayout(jPanelVI);
        jPanelVI.setLayout(jPanelVILayout);
        jPanelVILayout.setHorizontalGroup(
            jPanelVILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVILayout.createSequentialGroup()
                .addGroup(jPanelVILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVILayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanelVILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelVILayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(80, 80, 80)
                                .addComponent(menuCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelVILayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelVILayout.setVerticalGroup(
            jPanelVILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVILayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanelVILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(menuCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTChef.addTab("View Items", jPanelVI);

        jPanel2.add(jTChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 800, 490));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("M E N U   A N D   O R D E R   M A N A G E M E N T   S Y S T E M");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 810, -1));

        jLabel27.setFont(new java.awt.Font("Script MT Bold", 0, 14));
        jLabel27.setText("Welcome to");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 73, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 3, 14));
        jLabel31.setForeground(new java.awt.Color(153, 0, 0));
        jLabel31.setText("Logout");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sea_and_beach_1920x12002.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVKOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVKOTMouseClicked
        itemViewPanel.setVisible(true);
        jTableKOTitems.setVisible(true);
        int rowno=KOTtable.getSelectedRow();
        String name = KOTtable.getModel().getValueAt(rowno, 0).toString();
        int ticket_no=Integer.parseInt(name);System.out.println("kot" + ticket_no);
        
        DefaultTableModel model= (DefaultTableModel) jTableKOTitems.getModel();
        foodOrder_controller.LoadKOTItems(model,ticket_no);
        jTableKOTitems.setModel(model);
}//GEN-LAST:event_lblVKOTMouseClicked

    private void lbBeingProcessedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBeingProcessedMouseClicked
        int rowno = KOTtable.getSelectedRow();
        String ticket = KOTtable.getModel().getValueAt(rowno, 0).toString();
        
        foodOrder_controller.updateStatus("Being processed", ticket);
        DefaultTableModel model=(DefaultTableModel) KOTtable.getModel();
        foodOrder_controller.LoadKOTTable(model);
        KOTtable.setModel(model);
}//GEN-LAST:event_lbBeingProcessedMouseClicked

    private void lblProcessedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProcessedMouseClicked
        int rowno = KOTtable.getSelectedRow();
        String ticket = KOTtable.getModel().getValueAt(rowno, 0).toString();
        
        foodOrder_controller.updateStatus("Processed", ticket);
        DefaultTableModel model=(DefaultTableModel) KOTtable.getModel();
        foodOrder_controller.LoadKOTTable(model);
        KOTtable.setModel(model);
}//GEN-LAST:event_lblProcessedMouseClicked

    private void lblViewMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewMenu1MouseClicked
        int rowno = menuTable1.getSelectedRow();
        String name = menuTable1.getModel().getValueAt(rowno, 1).toString();
        System.out.println(name);
        Menus menu = new Menus();
        menu.setDescription(name);
        String id = menuTable1.getValueAt(rowno, 0).toString();
        menu.setMenuId(id);
        DefaultTableModel dtm = (DefaultTableModel) itemTable1.getModel();
        dtm.setRowCount(0);
        controller.menu_controller.LoadItemTable(dtm, id);
        itemTable1.setModel(dtm);
        jTChef.setSelectedComponent(jPanelVI);
        menuCombo1.setSelectedItem(menu);
}//GEN-LAST:event_lblViewMenu1MouseClicked

    private void lblViewMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewMenu1MouseEntered
        this.setForeground(Color.red);       // TODO add your handling code here:
}//GEN-LAST:event_lblViewMenu1MouseEntered

    private void menuCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCombo1ActionPerformed
        Menus menu=(Menus) menuCombo1.getSelectedItem();
        String id=menu.getMenuId();
        DefaultTableModel dtm = (DefaultTableModel) itemTable1.getModel();
        dtm.setRowCount(0);
        controller.menu_controller.LoadItemTable2(dtm, id);
        itemTable1.setModel(dtm);
}//GEN-LAST:event_menuCombo1ActionPerformed

    private void lblAddMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMenu2MouseClicked
        jTChef.setSelectedComponent(jPanelvm);
    }//GEN-LAST:event_lblAddMenu2MouseClicked

    private void lblAddMenu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMenu2MouseEntered
        
}//GEN-LAST:event_lblAddMenu2MouseEntered

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        this.dispose();
        loginUI log = new loginUI();
        log.setVisible(true);
    }//GEN-LAST:event_jLabel31MouseClicked

    private void KOTtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KOTtableMouseClicked
        lblVKOT.setVisible(true);
        itemViewPanel.setVisible(false);
    }//GEN-LAST:event_KOTtableMouseClicked
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
                new Chef_view().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable KOTtable;
    private javax.swing.JTable itemTable1;
    private javax.swing.JPanel itemViewPanel;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelVI;
    private javax.swing.JPanel jPanelvm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTChef;
    private javax.swing.JTable jTableKOTitems;
    private javax.swing.JPanel kots;
    private javax.swing.JLabel lbBeingProcessed;
    private javax.swing.JLabel lblAddMenu2;
    private javax.swing.JLabel lblProcessed;
    private javax.swing.JLabel lblVKOT;
    private javax.swing.JLabel lblViewMenu1;
    private javax.swing.JComboBox menuCombo1;
    private javax.swing.JTable menuTable1;
    // End of variables declaration//GEN-END:variables
}
