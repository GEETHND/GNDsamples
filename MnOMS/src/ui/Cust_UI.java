
package ui;

import controller.foodOrder_controller;
import controller.menuItem_controller;
import controller.menu_controller;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import entity.BarItemOrder;
import entity.Bot;
import entity.FoodItemOrder;
import entity.Kot;
import entity.Menus;
import entity.MenuItem;
import entity.Rooms;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import other.InternalReportViewer;
import other.ReportView;


public class Cust_UI extends javax.swing.JFrame implements TreeSelectionListener {
    CustOrder2_UI ui;
    //CustOrder1_UI cui;
    private int ticketno;

   
    public Cust_UI(CustOrder2_UI ui) {
        this.ui=ui;
      //  this.cui=cui;
        initComponents();
        
        setIconImage(loadImageIcon("logo1 copy22.png").getImage());//sets page icon
        SyntheticaBlackStarLookAndFeel.setWindowsDecorated(false);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);//to remove toolbar
        
        Dimension scrnSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle winSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();//sets window to fullscreen

        int taskBarHeight = scrnSize.height - winSize.height;
        this.setSize(scrnSize.width, scrnSize.height - taskBarHeight);
        
        custNo.setText(controller.room_Controller.custNo(ui.newOrder.getRoomNo()));
        //System.out.println(controller.room_Controller.custNo(ui.newOrder.getRoomNo(),cui.newOrder.getRoomNo()));
  
        DefaultTableModel model=(DefaultTableModel) menuTable.getModel();
        menu_controller.LoadMenuDesc1(model);
        
        menuTable.setModel(model);
        
        DefaultTableModel model1=(DefaultTableModel) itemTable1.getModel();
        menuItem_controller.LoadBarItems(model1);
        
        itemTable1.setModel(model1);
        
        int ticketno=controller.foodOrder_controller.maxTicketno();
        Tickno.setText(String.valueOf(ticketno));
                
        int bt=controller.barOrder_controller.maxTicketno();
        Tickno1.setText(String.valueOf(bt));
        int tn=Integer.valueOf(Tickno1.getText());     
        
        //validating calender
        try {
            selecteddate.getJCalendar().setSelectableDateRange(new Date(),new SimpleDateFormat("MM-DD-yyyy").parse("05-05-2015"));
            selecteddate1.getJCalendar().setSelectableDateRange(new Date(),new SimpleDateFormat("MM-DD-yyyy").parse("05-05-2015"));
            selecteddate.getJCalendar().addPropertyChangeListener(selecteddate);
            selecteddate1.getJCalendar().addPropertyChangeListener(selecteddate1);
        } catch (ParseException ex) {
            Logger.getLogger(Cust_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        btnorder.setVisible(false);
        btnorder.setEnabled(false);
        btnorder1.setVisible(false);
        
        OrderPanel.setVisible(false);
        OrderPanel.setEnabled(false);
        
        OrderPanel1.setVisible(false);
        OrderPanel1.setEnabled(false);
        
        orderViewPanel.setVisible(false);
        jScrollPane4.setVisible(false);
        
        selecteddate1.setEnabled(false);
        selectedTime1.setEnabled(false);
        ven1.setEnabled(false);
        saveKOT1.setEnabled(false);
        cancelOrder1.setEnabled(false);
        selecteddate.setEnabled(false);
        selectedTime.setEnabled(false);
        ven.setEnabled(false);
        saveKOT.setEnabled(false);
        cancelOrder.setEnabled(false);
        
    }
    
private void FillMenu()
    {
        List<Menus> menus = controller.menu_controller.loadMenus();
        DefaultMutableTreeNode parent = new DefaultMutableTreeNode("Menu",true);
//        for(Menu menu : menus)
//        {
//            DefaultMutableTreeNode subParent = new DefaultMutableTreeNode(menu.getDescription());
//            parent.add(subParent);
//                    
//            
//            String menuId = menu.getMenuId();
//            List<MenuItem> menuItems = menuItem_controller.LoadMenuItemDesc(menuId);
//            
//            for(MenuItem item : menuItems)
//            {
//                DefaultMutableTreeNode child = new DefaultMutableTreeNode(item.getDescription());
//                subParent.add(child);
//            }
//        
//        }
        
//        DefaultMutableTreeNode sub1 = new DefaultMutableTreeNode("sub1");
//        parent.add(sub1);
//        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("child1");
//        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("child2");
//        
//        sub1.add(child1);
//        sub1.add(child2);
//        
//        DefaultMutableTreeNode sub2 = new DefaultMutableTreeNode("sub2");
//        parent.add(sub2);
//        DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("child3");
//        DefaultMutableTreeNode child4 = new DefaultMutableTreeNode("child4");
//        
//        sub2.add(child3);
//        sub2.add(child4);
//        
//        DefaultTreeModel model = new DefaultTreeModel(parent);
//        jTree1.setModel(model);
        //jTree1.setRootVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPaneCust = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnAtBar = new javax.swing.JButton();
        btnOrd = new javax.swing.JButton();
        btnOurMn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanelMenu = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanelOurMenu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanelBar = new javax.swing.JPanel();
        OrderPanel1 = new javax.swing.JPanel();
        lblOrderedItem2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnSaveOrder1 = new javax.swing.JButton();
        btnCancelOrder1 = new javax.swing.JButton();
        lblOrderedItem3 = new javax.swing.JLabel();
        txtQty1 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        itemTable1 = new javax.swing.JTable();
        btnorder1 = new javax.swing.JButton();
        Tickno1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        selecteddate1 = new com.toedter.calendar.JDateChooser();
        selectedTime1 = new lu.tudor.santec.jtimechooser.JTimeChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ven1 = new javax.swing.JComboBox();
        cancelOrder1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        saveKOT1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanelOrder = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        custNo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        lblIMG1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        btnorder = new javax.swing.JButton();
        OrderPanel = new javax.swing.JPanel();
        lblOrderedItem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSaveOrder = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        txtQty = new javax.swing.JTextField();
        lblOrderedItem1 = new javax.swing.JLabel();
        btnViewOrder = new javax.swing.JButton();
        orderViewPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        selecteddate = new com.toedter.calendar.JDateChooser();
        selectedTime = new lu.tudor.santec.jtimechooser.JTimeChooser();
        jLabel6 = new javax.swing.JLabel();
        ven = new javax.swing.JComboBox();
        cancelOrder = new javax.swing.JButton();
        saveKOT = new javax.swing.JButton();
        Tickno = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 102));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPaneCust.setBackground(new java.awt.Color(0, 0, 102));
        jTabbedPaneCust.setFont(new java.awt.Font("Iskoola Pota", 1, 18));

        jPanel8.setBackground(new java.awt.Color(1, 1, 36));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 130, 100));

        btnAtBar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Pictures\\food img\\ic8.png")); // NOI18N
        btnAtBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "@our Bar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        btnAtBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtBarActionPerformed(evt);
            }
        });
        jPanel5.add(btnAtBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 110, 100));

        btnOrd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Pictures\\food img\\ic12.png")); // NOI18N
        btnOrd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order now!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        btnOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdActionPerformed(evt);
            }
        });
        jPanel5.add(btnOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 110, 100));

        btnOurMn.setFont(new java.awt.Font("Arial", 0, 11));
        btnOurMn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Pictures\\food img\\ic6.png")); // NOI18N
        btnOurMn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Our Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 51))); // NOI18N
        btnOurMn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOurMn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOurMnActionPerformed(evt);
            }
        });
        jPanel5.add(btnOurMn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 110, 100));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Pictures\\fnb\\1-1278141033-bg-blue-white-gradient copy copy.jpg")); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        jPanel8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane4.setBorder(null);
        jScrollPane4.setAlignmentX(0.0F);
        jScrollPane4.setAlignmentY(0.0F);
        jScrollPane4.setEnabled(false);
        jScrollPane4.setFocusable(false);
        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 620));

        jTabbedPaneCust.addTab("HOME", jPanel8);

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 102));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBackground(new java.awt.Color(0, 51, 153));

        jPanelOurMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Pictures\\menu img\\1333092646N5gYCs.jpg")); // NOI18N
        jButton1.setText("Click here to visit our menu today");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelOurMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 120, 110));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Click here to view our full menu.");
        jPanelOurMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Pictures\\fnb\\our menu.jpg")); // NOI18N
        jPanelOurMenu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 620));
        jPanelOurMenu.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, -1));

        jScrollPane5.setViewportView(jPanelOurMenu);

        jPanelMenu.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 990, 640));

        jTabbedPaneCust.addTab("OUR MENU", jPanelMenu);

        jPanelBar.setBackground(new java.awt.Color(1, 1, 36));
        jPanelBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OrderPanel1.setBackground(new java.awt.Color(199, 213, 222));
        OrderPanel1.setForeground(new java.awt.Color(255, 255, 255));
        OrderPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrderedItem2.setBackground(new java.awt.Color(102, 102, 102));
        OrderPanel1.add(lblOrderedItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 270, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel20.setText("You have ordered");
        OrderPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel21.setText("Please enter the quantity you want to order");
        OrderPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 20));

        btnSaveOrder1.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnSaveOrder1.setText("Done");
        btnSaveOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOrder1ActionPerformed(evt);
            }
        });
        OrderPanel1.add(btnSaveOrder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        btnCancelOrder1.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnCancelOrder1.setText("Cancel");
        btnCancelOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrder1ActionPerformed(evt);
            }
        });
        OrderPanel1.add(btnCancelOrder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        lblOrderedItem3.setBackground(new java.awt.Color(204, 204, 204));
        lblOrderedItem3.setForeground(new java.awt.Color(255, 255, 255));
        OrderPanel1.add(lblOrderedItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 160, 20));
        OrderPanel1.add(txtQty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 30, -1));

        jPanelBar.add(OrderPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 390, 110));

        itemTable1.setBackground(new java.awt.Color(17, 88, 132));
        itemTable1.setFont(new java.awt.Font("Tahoma", 1, 11));
        itemTable1.setForeground(new java.awt.Color(255, 255, 255));
        itemTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price(LKR)"
            }
        ));
        itemTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTable1MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(itemTable1);
        itemTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        itemTable1.getColumnModel().getColumn(1).setPreferredWidth(15);

        jPanelBar.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 400, 190));

        btnorder1.setBackground(new java.awt.Color(204, 204, 204));
        btnorder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/OrderNowIcon1.png"))); // NOI18N
        btnorder1.setBorder(null);
        btnorder1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnorder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorder1ActionPerformed(evt);
            }
        });
        jPanelBar.add(btnorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 53, 50));

        Tickno1.setFont(new java.awt.Font("Tahoma", 1, 11));
        Tickno1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ticket", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelBar.add(Tickno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 78, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel15.setText("Please enter the date you want");
        jPanelBar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));
        jPanelBar.add(selecteddate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        selectedTime1.setShowSeconds(false);
        jPanelBar.add(selectedTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 40, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel17.setText("Please enter the time you want");
        jPanelBar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel18.setText("Where do you need it to be delivered?");
        jPanelBar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        ven1.setFont(new java.awt.Font("Tahoma", 1, 11));
        ven1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Room", "Restaurent" }));
        jPanelBar.add(ven1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        cancelOrder1.setFont(new java.awt.Font("Tahoma", 1, 11));
        cancelOrder1.setText("Cancel this order");
        cancelOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrder1ActionPerformed(evt);
            }
        });
        jPanelBar.add(cancelOrder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel19.setText("hr");
        jPanelBar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        saveKOT1.setFont(new java.awt.Font("Tahoma", 1, 11));
        saveKOT1.setText("Process");
        saveKOT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveKOT1ActionPerformed(evt);
            }
        });
        jPanelBar.add(saveKOT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Pictures\\fnb\\bar copy.jpg")); // NOI18N
        jPanelBar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 590));

        jTabbedPaneCust.addTab("AT OUR BAR", jPanelBar);

        jPanelOrder.setBackground(new java.awt.Color(153, 153, 255));
        jPanelOrder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/business-man-blue.png"))); // NOI18N
        jPanelOrder.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 46));

        custNo.setBackground(new java.awt.Color(153, 153, 255));
        custNo.setFont(new java.awt.Font("Tahoma", 2, 12));
        custNo.setForeground(new java.awt.Color(10, 30, 55));
        custNo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Welcome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 11))); // NOI18N
        jPanelOrder.add(custNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 11, 113, 34));

        jPanel2.setBackground(new java.awt.Color(10, 30, 55));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Today's Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTable.setBackground(new java.awt.Color(10, 30, 55));
        menuTable.setFont(new java.awt.Font("Monotype Corsiva", 1, 18));
        menuTable.setForeground(new java.awt.Color(255, 255, 255));
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        menuTable.setCellSelectionEnabled(true);
        menuTable.setIntercellSpacing(new java.awt.Dimension(1, 3));
        menuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuTableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuTableMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(menuTable);
        menuTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, 187));

        lblIMG1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(lblIMG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 260, 240));

        jPanelOrder.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, 280));

        jPanel3.setBackground(new java.awt.Color(10, 30, 55));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Items for you", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemTable.setBackground(new java.awt.Color(17, 88, 132));
        itemTable.setFont(new java.awt.Font("Tahoma", 1, 11));
        itemTable.setForeground(new java.awt.Color(255, 255, 255));
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Price(LKR)"
            }
        ));
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(itemTable);
        itemTable.getColumnModel().getColumn(0).setPreferredWidth(380);
        itemTable.getColumnModel().getColumn(1).setPreferredWidth(15);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 44, 640, 170));

        btnorder.setBackground(new java.awt.Color(204, 204, 204));
        btnorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/OrderNowIcon1.png"))); // NOI18N
        btnorder.setBorder(null);
        btnorder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderActionPerformed(evt);
            }
        });
        jPanel3.add(btnorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 53, 50));

        jPanelOrder.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 670, 280));

        OrderPanel.setBackground(new java.awt.Color(10, 30, 55));
        OrderPanel.setForeground(new java.awt.Color(255, 255, 255));

        lblOrderedItem.setBackground(new java.awt.Color(102, 102, 102));
        lblOrderedItem.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblOrderedItem.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("You have ordered");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Please enter the quantity you want to order");

        btnSaveOrder.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnSaveOrder.setText("Done");
        btnSaveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOrderActionPerformed(evt);
            }
        });

        btnCancelOrder.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnCancelOrder.setText("Cancel");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        txtQty.setFont(new java.awt.Font("Tahoma", 1, 11));

        lblOrderedItem1.setBackground(new java.awt.Color(204, 204, 204));
        lblOrderedItem1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout OrderPanelLayout = new javax.swing.GroupLayout(OrderPanel);
        OrderPanel.setLayout(OrderPanelLayout);
        OrderPanelLayout.setHorizontalGroup(
            OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanelLayout.createSequentialGroup()
                .addGroup(OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrderedItem1)
                    .addGroup(OrderPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOrderedItem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OrderPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(OrderPanelLayout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(OrderPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnSaveOrder)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancelOrder)))
                .addGap(14, 14, 14))
        );
        OrderPanelLayout.setVerticalGroup(
            OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanelLayout.createSequentialGroup()
                .addComponent(lblOrderedItem1)
                .addGap(20, 20, 20)
                .addGroup(OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOrderedItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaveOrder)
                    .addComponent(btnCancelOrder)))
        );

        jPanelOrder.add(OrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 330, 150));

        btnViewOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnViewOrder.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnViewOrder.setText("View my order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });
        jPanelOrder.add(btnViewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 140, -1));

        orderViewPanel.setBackground(new java.awt.Color(10, 30, 55));
        orderViewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        orderViewPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        orderTable.setBackground(new java.awt.Color(10, 30, 55));
        orderTable.setFont(new java.awt.Font("Tahoma", 0, 12));
        orderTable.setForeground(new java.awt.Color(204, 255, 255));
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity"
            }
        ));
        jScrollPane3.setViewportView(orderTable);

        javax.swing.GroupLayout orderViewPanelLayout = new javax.swing.GroupLayout(orderViewPanel);
        orderViewPanel.setLayout(orderViewPanelLayout);
        orderViewPanelLayout.setHorizontalGroup(
            orderViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );
        orderViewPanelLayout.setVerticalGroup(
            orderViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderViewPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelOrder.add(orderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, 140));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Please enter the date you want");
        jPanelOrder.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setText("Where do you need it to be delivered?");
        jPanelOrder.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("Please enter the time you want");
        jPanelOrder.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));
        jPanelOrder.add(selecteddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        selectedTime.setShowSeconds(false);
        jPanelOrder.add(selectedTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 40, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("hr");
        jPanelOrder.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        ven.setFont(new java.awt.Font("Tahoma", 1, 11));
        ven.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Room", "Restaurent" }));
        jPanelOrder.add(ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, 20));

        cancelOrder.setFont(new java.awt.Font("Tahoma", 1, 11));
        cancelOrder.setText("Cancel this order");
        cancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderActionPerformed(evt);
            }
        });
        jPanelOrder.add(cancelOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 150, -1));

        saveKOT.setFont(new java.awt.Font("Tahoma", 1, 11));
        saveKOT.setText("Process");
        saveKOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveKOTActionPerformed(evt);
            }
        });
        jPanelOrder.add(saveKOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 100, -1));

        Tickno.setFont(new java.awt.Font("Tahoma", 1, 11));
        Tickno.setForeground(new java.awt.Color(204, 204, 204));
        Tickno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ticket", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelOrder.add(Tickno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 78, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Pictures\\fnb\\1-1278141033-bg-blue-white-gradient copy2.jpg")); // NOI18N
        jPanelOrder.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 580));

        jTabbedPaneCust.addTab("MAKE YOUR ORDER", jPanelOrder);

        jPanel4.add(jTabbedPaneCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 990, 610));

        jLabel14.setFont(new java.awt.Font("Perpetua Titling MT", 0, 32));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lastlogo.png"))); // NOI18N
        jLabel14.setText("MENU AND ORDER MANAGEMENT SYSTEM- HOTEL COREL BAY, NILAWELI");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1160, 130));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/custPage1Back.jpg"))); // NOI18N
        jLabel22.setText("jLabel22");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 300, 600));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Pictures\\fnb\\66538-1920x1200.jpg")); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1460, 770));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTableMouseClicked
        orderViewPanel.setVisible(false);
        int rowno  = menuTable.getSelectedRow();
        String name = menuTable.getModel().getValueAt(rowno, 0).toString();
        Menus menu=new Menus();
        menu.setDescription(name);
        String id=controller.menu_controller.getMenuID(menu);
        
        DefaultTableModel dtm= (DefaultTableModel) itemTable.getModel();
        dtm.setRowCount(0);
        controller.menu_controller.LoadItemTable3(dtm,id);
        itemTable.setModel(dtm);
       
        String img=controller.menu_controller.getImage(id);
        File f = new File(img);
        Image image = null;
        try {
            image = ImageIO.read(f);
        } catch (IOException ex) {
            Logger.getLogger(Menu_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        image = image.getScaledInstance(lblIMG1.getWidth(), lblIMG1.getHeight(), Image.SCALE_SMOOTH);
        if(image.equals(null)){
           lblIMG1.setText("No image to display");             
        }
        else
            lblIMG1.setIcon(new ImageIcon(image)); 
    
}//GEN-LAST:event_menuTableMouseClicked

    private void menuTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTableMouseEntered
        menuTable.setForeground(new java.awt.Color(0,102,255));
}//GEN-LAST:event_menuTableMouseEntered

    private void menuTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTableMouseExited
        menuTable.setForeground(new java.awt.Color(255,255,255));
}//GEN-LAST:event_menuTableMouseExited

    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
        btnorder.setVisible(true);
        btnorder.setEnabled(true);
        orderViewPanel.setVisible(false);
}//GEN-LAST:event_itemTableMouseClicked

    private void btnorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderActionPerformed
        orderTable.clearSelection();
        OrderPanel.setVisible(true);
        OrderPanel.setEnabled(true);
        int rowno  = itemTable.getSelectedRow();
        String name = itemTable.getModel().getValueAt(rowno, 0).toString();
        lblOrderedItem.setText(name);
        
        selecteddate.setEnabled(true);
        selectedTime.setEnabled(true);
        ven.setEnabled(true);
        saveKOT.setEnabled(true);
        cancelOrder.setEnabled(true);
    }//GEN-LAST:event_btnorderActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        
//        int ticket_no=Integer.parseInt(Tickno.getText());System.out.println("kot" + ticket_no);
//        
//        DefaultTableModel model= (DefaultTableModel) orderTable.getModel();
//        foodOrder_controller.LoadKOTItems(model,ticket_no);
//        orderViewPanel.setVisible(true);
//            orderViewPanel.setEnabled(true);
//        orderTable.setModel(model);
        
        int rowno  = menuTable.getSelectedRow();
        String name = menuTable.getModel().getValueAt(rowno, 0).toString();
        Menus menu=new Menus();
        menu.setDescription(name);
        String Mid=controller.menu_controller.getMenuID(menu);
        if(Mid.equals("M01")){
            int bt=controller.barOrder_controller.maxTicketno();
            bt=bt-1;
            orderViewPanel.setVisible(true);
            orderViewPanel.setEnabled(true);
            DefaultTableModel dtm=(DefaultTableModel) orderTable.getModel();
            
            controller.barOrder_controller.LoadOrderTable(dtm, bt);
            orderTable.setModel(dtm);
        } else{
            int tn=Integer.valueOf(Tickno.getText());
            orderViewPanel.setVisible(true);
            orderViewPanel.setEnabled(true);
            DefaultTableModel dtm1=(DefaultTableModel) orderTable.getModel();
            
            controller.foodOrder_controller.LoadOrderTable2(dtm1,tn);
            
            orderTable.setModel(dtm1);
        }
}//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnOurMnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOurMnActionPerformed
        jTabbedPaneCust.setSelectedComponent(jPanelMenu);
    }//GEN-LAST:event_btnOurMnActionPerformed

    private void btnAtBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtBarActionPerformed
        jTabbedPaneCust.setSelectedComponent(jPanelBar);
    }//GEN-LAST:event_btnAtBarActionPerformed

    private void btnOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdActionPerformed
        jTabbedPaneCust.setSelectedComponent(jPanelOrder);
    }//GEN-LAST:event_btnOrdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new rep4().setVisible(true);
//        String path = "ireports//OurMenu.jasper";
////        ReportView reportView = new ReportView(path); 
//          rep4 rep = new rep4(path); 
        
        
        //         try
//{
//        NewJFrame rep4 = new NewJInternalFrame("C://Users//Hp//Documents//NetBeansProjects//MnOMS//src//ireports//OurMenu.jasper");
//        report2.setBounds(0, 0, jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
//        report2.setVisible(true);
//        jDesktopPane1.add(report2);
//        report2.setSelected(true);
//}
//catch (PropertyVetoException pve)
//{
//pve.printStackTrace();

            
            //            }
//         catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//        finally {
//            setCursor(Cursor.getDefaultCursor());
//        }
   /*  try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            new report2("OurMenu.jasper").setVisible(true);
            System.out.println("rep");
//            
//           // System.out.println(KOTtable.getValueAt(KOTtable.getSelectedRow(), 0).toString());
//           new reports("C://Users//Hp//Documents//NetBeansProjects//MnOMS//src//ireports//OurMenu.jasper").setVisible(true);        // TODO add your handling code here:
//            
//
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            setCursor(Cursor.getDefaultCursor());
        }  */  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSaveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrderActionPerformed
        
        int rowno  = menuTable.getSelectedRow();
        String name = menuTable.getModel().getValueAt(rowno, 0).toString();
        Menus menu=new Menus();
        menu.setDescription(name);
        String Mid=controller.menu_controller.getMenuID(menu);
        String qty=txtQty.getText();
        //        if(qty.equals(0)){
        //             JOptionPane.showMessageDialog(null, "Please insert a quantity");
        //         }
        //         else{
        
        //         String qty=txtQty.getText();
        int quantity=Integer.parseInt(qty);
        
        int rowno1  = itemTable.getSelectedRow();
        String itemname = itemTable.getModel().getValueAt(rowno1, 0).toString();
        
        int tn=Integer.valueOf(Tickno.getText());
        Kot kt=new Kot();
        kt.setTicketNo(ticketno);
        
        MenuItem item=new MenuItem();
        item.setDescription(itemname);
        String id=controller.menuItem_controller.getItemNo(item);
        
        if(Mid.equals("M01")){
            int bt=controller.barOrder_controller.maxTicketno();
            
            Bot bar=new Bot();
            bar.setTicketNo(bt);
            BarItemOrder newOrder=new BarItemOrder();
            newOrder.setMenuItem(item);
            newOrder.setQty(quantity);
            newOrder.setBot(bar);
            controller.barOrder_controller.addNewOrder(newOrder);
        } else{
            controller.foodOrder_controller.addNewOrder2(tn, id, quantity);
            
//            FoodItemOrder newOrder=new FoodItemOrder();
//            newOrder.setMenuItem(item);
//            newOrder.setQty(quantity);
//            newOrder.setKot(kt);
//            
//            controller.foodOrder_controller.addNewOrder(newOrder);
        }
        OrderPanel.setVisible(false);
        OrderPanel.setEnabled(false);
    }//GEN-LAST:event_btnSaveOrderActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        OrderPanel.setVisible(false);
        OrderPanel.setEnabled(false);
}//GEN-LAST:event_btnCancelOrderActionPerformed

    private void itemTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTable1MouseClicked
        btnorder1.setVisible(true);
        OrderPanel1.setVisible(false);
    }//GEN-LAST:event_itemTable1MouseClicked

    private void btnorder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorder1ActionPerformed
        selecteddate1.setEnabled(true);
        selectedTime1.setEnabled(true);
        ven1.setEnabled(true);
        saveKOT1.setEnabled(true);
        cancelOrder1.setEnabled(true);
        
        OrderPanel1.setVisible(true);
        OrderPanel1.setEnabled(true);
        int rowno  = itemTable1.getSelectedRow();
        String name = itemTable1.getModel().getValueAt(rowno, 0).toString();
        lblOrderedItem2.setText(name);
    }//GEN-LAST:event_btnorder1ActionPerformed

    private void cancelOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrder1ActionPerformed
        int tn=Integer.valueOf(Tickno1.getText());
        Kot kt=new Kot();
        kt.setTicketNo(tn);
        
        orderViewPanel.setVisible(false);
        BarItemOrder cancel=new BarItemOrder();
        //cancel.setKot(kt.getTicketNo());
        
        controller.barOrder_controller.cancelNewOrder(cancel, tn);
        this.dispose();
        ui.setEnabled(true);
    }//GEN-LAST:event_cancelOrder1ActionPerformed

    private void saveKOT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveKOT1ActionPerformed
        String cust=custNo.getText();
        
        Date day=selecteddate1.getDate();
        SimpleDateFormat day1=new SimpleDateFormat("yyyy/MM/dd");
        String formateddate=day1.format(day);
        
        String venue=ven1.getSelectedItem().toString();
        String setTime=selectedTime1.getFormatedTime();
        
        
            Bot kt=new Bot();
            kt.setCustNo(cust);
            kt.setVenue(venue);
            kt.setDate(formateddate);
            kt.setTime(setTime);
            kt.setTicketNo(controller.barOrder_controller.maxTicketno());
            controller.barOrder_controller.addNewOrdertoBot(kt);
       
        jTabbedPaneCust.setSelectedComponent(jPanelOrder);
    }//GEN-LAST:event_saveKOT1ActionPerformed

    private void btnSaveOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrder1ActionPerformed
         String qty=txtQty1.getText();
                if(qty.equals(0)){
                     JOptionPane.showMessageDialog(null, "Please insert a quantity");
                 }
                 else{
        
//                 String qty=txtQty.getText();
        int quantity=Integer.parseInt(qty);
          int tn=Integer.parseInt(Tickno1.getText());
        
        int rowno1  = itemTable1.getSelectedRow();
        String itemname = itemTable1.getModel().getValueAt(rowno1, 0).toString();
        int bt=controller.barOrder_controller.maxTicketno();
        
        Kot kt=new Kot();
        kt.setTicketNo(ticketno);
        
        MenuItem item=new MenuItem();
        item.setDescription(itemname);
        String id=controller.menuItem_controller.getItemNo(item);
        
//        if(Mid.equals("M01")){
            
            
            Bot bar=new Bot();
            bar.setTicketNo(bt);
            BarItemOrder newOrder=new BarItemOrder();
            newOrder.setMenuItem(item);
            newOrder.setQty(quantity);
            newOrder.setBot(bar);
            controller.barOrder_controller.addNewOrder2(tn, id, quantity);
//        } else{
//            controller.foodOrder_controller.addNewOrder2(tn, id, quantity);
            
//            FoodItemOrder newOrder=new FoodItemOrder();
//            newOrder.setMenuItem(item);
//            newOrder.setQty(quantity);
//            newOrder.setKot(kt);
//            
//            controller.foodOrder_controller.addNewOrder(newOrder);
        
        OrderPanel1.setVisible(false);
        OrderPanel1.setEnabled(false);
                }
    }//GEN-LAST:event_btnSaveOrder1ActionPerformed

    private void btnCancelOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrder1ActionPerformed
        OrderPanel1.setVisible(false);
        OrderPanel1.setEnabled(false);
    }//GEN-LAST:event_btnCancelOrder1ActionPerformed

    private void cancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderActionPerformed
        int tn=Integer.valueOf(Tickno.getText());
        Kot kt=new Kot();
        kt.setTicketNo(tn);
        
        orderViewPanel.setVisible(false);
        FoodItemOrder cancel=new FoodItemOrder();
        //cancel.setKot(kt.getTicketNo());
        
        controller.foodOrder_controller.cancelNewOrder(cancel, tn);
        this.dispose();
        ui.setEnabled(true);
    }//GEN-LAST:event_cancelOrderActionPerformed

    private void saveKOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveKOTActionPerformed
        String cust=custNo.getText();
        
        Date day=selecteddate.getDate();
        SimpleDateFormat day1=new SimpleDateFormat("yyyy/MM/dd");
        String formateddate=day1.format(day);
        
        String venue=ven.getSelectedItem().toString();
        String setTime=selectedTime.getFormatedTime();
        
        
            Kot kt=new Kot();
            kt.setCustNo(cust);
            kt.setVenue(venue);
            kt.setDate(formateddate);
            kt.setTime(setTime);
            kt.setTicketNo(controller.foodOrder_controller.maxTicketno());
            controller.foodOrder_controller.addNewOrdertoKot(kt);
       
        this.dispose();
        ui.setEnabled(true);
    }//GEN-LAST:event_saveKOTActionPerformed

protected ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Cust_UI.class.getResource(path); 
        if (imgURL != null) {
        return new ImageIcon(imgURL);
        } else {
        System.err.println("Couldn't find file: " + path);
        return null;
        }
}
   
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

                new Cust_UI(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OrderPanel;
    private javax.swing.JPanel OrderPanel1;
    private javax.swing.JLabel Tickno;
    private javax.swing.JLabel Tickno1;
    private javax.swing.JButton btnAtBar;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnCancelOrder1;
    private javax.swing.JButton btnOrd;
    private javax.swing.JButton btnOurMn;
    private javax.swing.JButton btnSaveOrder;
    private javax.swing.JButton btnSaveOrder1;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JButton btnorder;
    private javax.swing.JButton btnorder1;
    private javax.swing.JButton cancelOrder;
    private javax.swing.JButton cancelOrder1;
    private javax.swing.JLabel custNo;
    private javax.swing.JTable itemTable;
    private javax.swing.JTable itemTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelBar;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelOrder;
    private javax.swing.JPanel jPanelOurMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPaneCust;
    private javax.swing.JLabel lblIMG1;
    private javax.swing.JLabel lblOrderedItem;
    private javax.swing.JLabel lblOrderedItem1;
    private javax.swing.JLabel lblOrderedItem2;
    private javax.swing.JLabel lblOrderedItem3;
    private javax.swing.JTable menuTable;
    private javax.swing.JTable orderTable;
    private javax.swing.JPanel orderViewPanel;
    private javax.swing.JButton saveKOT;
    private javax.swing.JButton saveKOT1;
    private lu.tudor.santec.jtimechooser.JTimeChooser selectedTime;
    private lu.tudor.santec.jtimechooser.JTimeChooser selectedTime1;
    private com.toedter.calendar.JDateChooser selecteddate;
    private com.toedter.calendar.JDateChooser selecteddate1;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtQty1;
    private javax.swing.JComboBox ven;
    private javax.swing.JComboBox ven1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
