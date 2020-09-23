
package ui;

import controller.foodOrder_controller;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import entity.Rooms;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.net.URL;
import java.text.ParseException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


public class Waiter_UI extends javax.swing.JFrame {

   public Rooms changeOrder;
    public Waiter_UI() {
        initComponents();
        
        setIconImage(loadImageIcon("logo1 copy22.png").getImage());
                
        DefaultTableModel model = (DefaultTableModel) KOTtable1.getModel();
        foodOrder_controller.LoadKOTTable2(model);
        
        DefaultTableModel model1=(DefaultTableModel) BOTtable.getModel();
        controller.barOrder_controller.LoadBOTTable2(model1);
        BOTtable.setModel(model1);
        
        btnChBOT.setVisible(false);
        btnChKOT.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTChef = new javax.swing.JTabbedPane();
        kots = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblPrKOT = new javax.swing.JLabel();
        newKOT = new javax.swing.JLabel();
        lblPrKOT1 = new javax.swing.JLabel();
        lblRoom = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        KOTtable1 = new javax.swing.JTable();
        btnChKOT = new javax.swing.JButton();
        jPanelvm = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblPrBOT = new javax.swing.JLabel();
        newBOT = new javax.swing.JLabel();
        lblPrKOT2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BOTtable = new javax.swing.JTable();
        lblRoom1 = new javax.swing.JLabel();
        btnChBOT = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("M E N U   A N D   O R D E R   M A N A G E M E N T   S Y S T E M - w a i t e r ' s  p a n e l");
        setBounds(new java.awt.Rectangle(200, 0, 0, 0));
        setResizable(false);
        setUndecorated(true);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Script MT Bold", 0, 14));
        jLabel27.setText("Welcome to");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 73, -1));

        jTChef.setBackground(new java.awt.Color(18, 71, 103));
        jTChef.setForeground(new java.awt.Color(0, 0, 51));
        jTChef.setFont(new java.awt.Font("Times New Roman", 3, 24));

        kots.setBackground(new java.awt.Color(18, 71, 103));
        kots.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(51, 137, 154));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setPreferredSize(new java.awt.Dimension(760, 95));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 100, 70));

        lblPrKOT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrKOT.setForeground(new java.awt.Color(255, 255, 255));
        lblPrKOT.setText("Cancel this order");
        lblPrKOT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPrKOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrKOTMouseClicked(evt);
            }
        });
        jPanel11.add(lblPrKOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        newKOT.setFont(new java.awt.Font("Tahoma", 0, 14));
        newKOT.setForeground(new java.awt.Color(255, 255, 255));
        newKOT.setText("Make New Order");
        newKOT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newKOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newKOTMouseClicked(evt);
            }
        });
        jPanel11.add(newKOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        lblPrKOT1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrKOT1.setForeground(new java.awt.Color(255, 255, 255));
        lblPrKOT1.setText("Print KOT");
        lblPrKOT1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPrKOT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrKOT1MouseClicked(evt);
            }
        });
        jPanel11.add(lblPrKOT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        kots.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 353, 770, 82));

        lblRoom.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblRoom.setForeground(new java.awt.Color(255, 255, 255));
        lblRoom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room no", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        kots.add(lblRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 92, 40));

        KOTtable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        KOTtable1.setForeground(new java.awt.Color(18, 71, 103));
        KOTtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket", "Customer", "Venue", "Date", "Time", "Status"
            }
        ));
        KOTtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KOTtable1MouseClicked(evt);
            }
        });
        KOTtable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KOTtable1KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(KOTtable1);

        kots.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 640, 160));

        btnChKOT.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnChKOT.setText("Change this order");
        btnChKOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChKOTActionPerformed(evt);
            }
        });
        kots.add(btnChKOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jTChef.addTab("KOT's", kots);

        jPanelvm.setBackground(new java.awt.Color(18, 71, 103));
        jPanelvm.setForeground(new java.awt.Color(0, 51, 51));
        jPanelvm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelvm.setPreferredSize(new java.awt.Dimension(793, 95));
        jPanelvm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(51, 137, 154));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setPreferredSize(new java.awt.Dimension(760, 95));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 100, 70));

        lblPrBOT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrBOT.setForeground(new java.awt.Color(255, 255, 255));
        lblPrBOT.setText("Print BOT");
        lblPrBOT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPrBOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrBOTMouseClicked(evt);
            }
        });
        jPanel10.add(lblPrBOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        newBOT.setFont(new java.awt.Font("Tahoma", 0, 14));
        newBOT.setForeground(new java.awt.Color(255, 255, 255));
        newBOT.setText("Make New Order");
        newBOT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newBOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newBOTMouseClicked(evt);
            }
        });
        jPanel10.add(newBOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        lblPrKOT2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrKOT2.setForeground(new java.awt.Color(255, 255, 255));
        lblPrKOT2.setText("Cancel this order");
        lblPrKOT2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPrKOT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrKOT2MouseClicked(evt);
            }
        });
        jPanel10.add(lblPrKOT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jPanelvm.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, 775, 82));

        BOTtable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BOTtable.setForeground(new java.awt.Color(18, 71, 103));
        BOTtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket_no", "Cust_no", "Venue", "Date", "Time", "Status"
            }
        ));
        BOTtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOTtableMouseClicked(evt);
            }
        });
        BOTtable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BOTtableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(BOTtable);

        jPanelvm.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 640, 160));

        lblRoom1.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblRoom1.setForeground(new java.awt.Color(255, 255, 255));
        lblRoom1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room no", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanelvm.add(lblRoom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 92, 40));

        btnChBOT.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnChBOT.setText("Change this order");
        btnChBOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChBOTActionPerformed(evt);
            }
        });
        jPanelvm.add(btnChBOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jTChef.addTab("BOT's", jPanelvm);

        jPanel3.add(jTChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 800, 490));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 3, 14));
        jLabel30.setForeground(new java.awt.Color(153, 0, 0));
        jLabel30.setText("Logout");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("M E N U   A N D   O R D E R   M A N A G E M E N T   S Y S T E M");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 810, -1));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Perpetua Titling MT", 1, 28));
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hotellogo3.png"))); // NOI18N
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 800, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sea_and_beach_1920x12002.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOTtableMouseClicked
        int rowno = BOTtable.getSelectedRow();
        String cust = BOTtable.getModel().getValueAt(rowno, 1).toString();
        String room=controller.foodOrder_controller.Roomno(cust);
        lblRoom1.setText(room);
    }//GEN-LAST:event_BOTtableMouseClicked

    private void KOTtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KOTtable1MouseClicked
        int rowno=KOTtable1.getSelectedRow();
        String cust = KOTtable1.getModel().getValueAt(rowno, 1).toString();
        String room=controller.foodOrder_controller.Roomno(cust);
        lblRoom.setText(room);
                
}//GEN-LAST:event_KOTtable1MouseClicked

    private void lblPrKOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrKOTMouseClicked
        int rowno = KOTtable1.getSelectedRow();
        String ticket = KOTtable1.getModel().getValueAt(rowno, 0).toString();
        
        foodOrder_controller.updateStatus("Cancelled", ticket);
        DefaultTableModel model = (DefaultTableModel) KOTtable1.getModel();
        foodOrder_controller.LoadKOTTable2(model);
}//GEN-LAST:event_lblPrKOTMouseClicked

    private void lblPrBOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrBOTMouseClicked
        int rowno=BOTtable.getSelectedRow();
        String name = BOTtable.getModel().getValueAt(rowno, 0).toString();
        int tick=Integer.parseInt(name);
        System.out.println("tick"+tick);
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            HashMap<String, Object> t = new HashMap<String ,Object>();
            t.put("parameter1", tick);
            new reportForm("E:\\MnOMS\\src\\ireports\\BOT_print.jasper", t, this).setVisible(true);

            util.EventLog.eventLog("BOT printed for"+tick);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_lblPrBOTMouseClicked

    private void btnChKOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChKOTActionPerformed
        String roomno=lblRoom.getText();
        Rooms nr=new Rooms();
        nr.setRoomNo(roomno);
        this.changeOrder=nr;
        
        //CustOrder2_UI custUI=new CustOrder2_UI(this);
        //custUI.setVisible(true);
        //custUI.setEnabled(true);
        this.setEnabled(false);
}//GEN-LAST:event_btnChKOTActionPerformed

    private void newKOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newKOTMouseClicked
        CustOrder2_UI custUI=new CustOrder2_UI();
        custUI.setVisible(true);
        custUI.setEnabled(true);
        //this.dispose();
    }//GEN-LAST:event_newKOTMouseClicked

    private void newBOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newBOTMouseClicked
        CustOrder2_UI custUI=new CustOrder2_UI();
        custUI.setVisible(true);
        custUI.setEnabled(true);
        this.setEnabled(false);
    }//GEN-LAST:event_newBOTMouseClicked

    private void btnChBOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChBOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChBOTActionPerformed

    private void KOTtable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KOTtable1KeyPressed
        int rowno=KOTtable1.getSelectedRow();
        String cust = KOTtable1.getModel().getValueAt(rowno, 1).toString();
        String room=controller.foodOrder_controller.Roomno(cust);
        lblRoom.setText(room);
    }//GEN-LAST:event_KOTtable1KeyPressed

    private void BOTtableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BOTtableKeyPressed
        int rowno=BOTtable.getSelectedRow();
        String cust = BOTtable.getModel().getValueAt(rowno, 1).toString();
        String room=controller.foodOrder_controller.Roomno(cust);
        lblRoom1.setText(room);        
    }//GEN-LAST:event_BOTtableKeyPressed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        this.dispose();
        loginUI log = new loginUI();
        log.setVisible(true);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void lblPrKOT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrKOT1MouseClicked
        int rowno=KOTtable1.getSelectedRow();
        String name = KOTtable1.getModel().getValueAt(rowno, 0).toString();
        int tick=Integer.parseInt(name);
        System.out.println("tick"+tick);
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            HashMap<String, Object> t = new HashMap<String ,Object>();
            t.put("parameter1", tick);
            new reportForm("E:\\NetBeans2\\MnOMS\\src\\ireports\\KOT_print.jasper", t, this).setVisible(true);

            util.EventLog.eventLog("KOT printed for"+tick);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            setCursor(Cursor.getDefaultCursor());
        }

    }//GEN-LAST:event_lblPrKOT1MouseClicked

    private void lblPrKOT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrKOT2MouseClicked
        int rowno = BOTtable.getSelectedRow();
        String ticket = BOTtable.getModel().getValueAt(rowno, 0).toString();
        
        foodOrder_controller.updateStatus("Cancelled", ticket);
        DefaultTableModel model = (DefaultTableModel) BOTtable.getModel();
        controller.barOrder_controller.LoadBOTTable2(model);
    }//GEN-LAST:event_lblPrKOT2MouseClicked

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
                    util.ErrorLog.errorLog("Error Waiter_UI");
                    Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Waiter_UI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BOTtable;
    private javax.swing.JTable KOTtable1;
    private javax.swing.JButton btnChBOT;
    private javax.swing.JButton btnChKOT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelvm;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTChef;
    private javax.swing.JPanel kots;
    private javax.swing.JLabel lblPrBOT;
    private javax.swing.JLabel lblPrKOT;
    private javax.swing.JLabel lblPrKOT1;
    private javax.swing.JLabel lblPrKOT2;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblRoom1;
    private javax.swing.JLabel newBOT;
    private javax.swing.JLabel newKOT;
    // End of variables declaration//GEN-END:variables
}
