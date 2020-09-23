package ui;

import other.View_UI;
import controller.barOrder_controller;
import controller.foodOrder_controller;
import controller.hash;
import controller.login_controller;
import controller.menu_controller;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import entity.Login;
import entity.Menus;
import entity.MenuItem;
import entity.Rooms;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.net.URL;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import org.codehaus.groovy.control.messages.Message;
import validation.val;

public class Menu_UI extends javax.swing.JFrame {

    public Menus newMenu;

    public Menu_UI() {
        initComponents();
        
        setIconImage(loadImageIcon("logo1 copy22.png").getImage());//sets page icon
        SyntheticaBlackStarLookAndFeel.setWindowsDecorated(false);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);//to remove toolbar
        
        Dimension scrnSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle winSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();

        int taskBarHeight = scrnSize.height - winSize.height;
        this.setSize(scrnSize.width, scrnSize.height - taskBarHeight);
        
        DefaultTableModel modelUser= (DefaultTableModel) userTable.getModel();
        login_controller.LoadUserTable(modelUser);
        
        DefaultTableModel model = (DefaultTableModel) menuTable1.getModel();
        menu_controller.LoadMenuTable(model);
        menuTable1.setModel(model);
        menuTable1.setModel(model);
        String id=lblMenuID4.getText();
        
        DefaultTableModel model1 = (DefaultTableModel) KOTtable.getModel();
        foodOrder_controller.LoadKOTTable2(model1);
        
        DefaultTableModel model2 = (DefaultTableModel) BOTtable.getModel();
        barOrder_controller.LoadBOTTable2(model2);
        
        
        
        DefaultComboBoxModel dcbm1 = (DefaultComboBoxModel) menuCombo1.getModel();
        DefaultComboBoxModel dcbm3 = (DefaultComboBoxModel) menuCombo2.getModel();

        
        
        menu_controller.loadMenutoCombo(dcbm1);
        menu_controller.loadMenutoCombo(dcbm3);

        

        lblMenuID.setText(controller.menu_controller.maxMenuID());
        jPanelKOT.setVisible(false);
        jPanelBOT.setVisible(false);
        btnVKOT.setVisible(false);
        btnVBOT.setVisible(false);
        userPanel.setVisible(false);
        lblUpdateItem.setVisible(false);  
        lblRoomNo1.setVisible(false); 
        btnRmvUser.setVisible(false);
        
        lblError.setVisible(true);
        lblError1.setVisible(true);
        lblError4.setVisible(false);
        lblError5.setVisible(false);
        lblError6.setVisible(false);
        lblError8.setVisible(false);
        lblError9.setVisible(true);
        lblError10.setVisible(true);
        lblItemNo2.setVisible(false);
        lblDltMenu.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        fnbms = new javax.swing.JTabbedPane();
        jPanelMenu = new javax.swing.JPanel();
        jTabbedPaneMenu = new javax.swing.JTabbedPane();
        jPanelvm = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblDltMenu = new javax.swing.JLabel();
        lblViewMenu = new javax.swing.JLabel();
        lblUpdateMenu = new javax.swing.JLabel();
        lblAddMenu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPrintMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblIMG2 = new javax.swing.JLabel();
        jPanelAM = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblCancel2 = new javax.swing.JLabel();
        lblClr = new javax.swing.JLabel();
        lblAddNewMenu = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblMenuID = new javax.swing.JLabel();
        lblError1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMenuDesc1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        browseImg = new javax.swing.JButton();
        lblIMG = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        dfltImg = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        txtpath = new javax.swing.JTextField();
        jPanelUM = new javax.swing.JPanel();
        lblChImg = new javax.swing.JLabel();
        txtpath1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        lblCanChImg1 = new javax.swing.JLabel();
        lblCanChImg2 = new javax.swing.JLabel();
        menuCombo2 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        lblSaveImg = new javax.swing.JLabel();
        lblCanChImg = new javax.swing.JLabel();
        lblAddMenu3 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblIMG1 = new javax.swing.JLabel();
        jPanelMenuItems = new javax.swing.JPanel();
        jTabbedPaneMenuItems = new javax.swing.JTabbedPane();
        jPanelVI = new javax.swing.JPanel();
        menuCombo1 = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        itemTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblAddMenu2 = new javax.swing.JLabel();
        lblRemoveItem = new javax.swing.JLabel();
        lblUpdateItem = new javax.swing.JLabel();
        lblAddItem = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanelAI = new javax.swing.JPanel();
        lblItemNo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblMenuID3 = new javax.swing.JLabel();
        txtNewItemDesc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNewPrice = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        comboAvail1 = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblAddNewItm = new javax.swing.JLabel();
        lblClr1 = new javax.swing.JLabel();
        lblCancel3 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lblError4 = new javax.swing.JLabel();
        lblError5 = new javax.swing.JLabel();
        jPanelUI = new javax.swing.JPanel();
        lblMenuID4 = new javax.swing.JLabel();
        txtitDesc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboAvail = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtItPrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblItemNo1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblCancel = new javax.swing.JLabel();
        lblSaveUpdate = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lblError6 = new javax.swing.JLabel();
        lblError8 = new javax.swing.JLabel();
        lblItemNo2 = new javax.swing.JLabel();
        jPanelOrders = new javax.swing.JPanel();
        jTabbedPaneOrders = new javax.swing.JTabbedPane();
        jPanelKOTs = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        KOTtable = new javax.swing.JTable();
        btnViewKOTitems = new javax.swing.JButton();
        btnVKOT = new javax.swing.JButton();
        jPanelKOT = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableKOTitems = new javax.swing.JTable();
        lblRoomNo1 = new javax.swing.JLabel();
        jPanelBot = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btnVBOT = new javax.swing.JButton();
        jPanelBOT = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableBOTitems = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        BOTtable = new javax.swing.JTable();
        lblRoomNo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        btnRmvUser = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRemoveUser = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblCanclAddUser1 = new javax.swing.JLabel();
        lblCanclAddUser = new javax.swing.JLabel();
        lblAddUser = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        lblError9 = new javax.swing.JLabel();
        lblError10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("You are logged as F&B Manager");
        setBackground(new java.awt.Color(102, 153, 255));
        setBounds(new java.awt.Rectangle(0, 0, 600, 400));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogout.setFont(new java.awt.Font("Times New Roman", 3, 14));
        lblLogout.setForeground(new java.awt.Color(153, 0, 0));
        lblLogout.setText("Logout");
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        jPanel2.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, 20));

        jLabel27.setFont(new java.awt.Font("Script MT Bold", 0, 14));
        jLabel27.setText("Welcome to");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 73, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 26));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("M E N U   A N D   O R D E R   M A N A G E M E N T   S Y S T E M");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 900, 30));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Perpetua Titling MT", 1, 28));
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hotellogo2.png"))); // NOI18N
        jLabel29.setText("MENU AND ORDER MANAGEMENT SYSTEM");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 1190, 130));

        fnbms.setBackground(new java.awt.Color(153, 153, 255));
        fnbms.setForeground(new java.awt.Color(0, 0, 51));
        fnbms.setFont(new java.awt.Font("Times New Roman", 3, 28));

        jPanelMenu.setBackground(new java.awt.Color(18, 71, 103));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPaneMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 137, 154)));
        jTabbedPaneMenu.setForeground(new java.awt.Color(0, 0, 51));
        jTabbedPaneMenu.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jTabbedPaneMenu.setPreferredSize(new java.awt.Dimension(1000, 586));

        jPanelvm.setBackground(new java.awt.Color(18, 71, 103));
        jPanelvm.setForeground(new java.awt.Color(0, 51, 51));
        jPanelvm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelvm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        menuTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTable1MouseClicked(evt);
            }
        });
        menuTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(menuTable1);
        menuTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        menuTable1.getColumnModel().getColumn(1).setPreferredWidth(180);

        jPanelvm.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 615, 283));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanelvm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1316, 728, -1, 76));

        jPanel7.setBackground(new java.awt.Color(51, 137, 154));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDltMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDltMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblDltMenu.setText("Remove Menu");
        lblDltMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDltMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDltMenuMouseClicked(evt);
            }
        });
        jPanel7.add(lblDltMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 34, -1, -1));

        lblViewMenu.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblViewMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblViewMenu.setText("View Menu Items");
        lblViewMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblViewMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewMenuMouseClicked(evt);
            }
        });
        jPanel7.add(lblViewMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 34, -1, -1));

        lblUpdateMenu.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblUpdateMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateMenu.setText("Update Menu");
        lblUpdateMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUpdateMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateMenuMouseClicked(evt);
            }
        });
        jPanel7.add(lblUpdateMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 34, -1, -1));

        lblAddMenu.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblAddMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblAddMenu.setText("Add New Menu");
        lblAddMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMenuMouseClicked(evt);
            }
        });
        jPanel7.add(lblAddMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 34, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, 78));

        jPanelvm.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 362, 1140, 80));

        btnPrintMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Pictures\\menu img\\print.png")); // NOI18N
        btnPrintMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintMenuActionPerformed(evt);
            }
        });
        jPanelvm.add(btnPrintMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Click here to print today's menu.");
        jPanelvm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, -1, -1));

        lblIMG2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelvm.add(lblIMG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 220, 200));

        jTabbedPaneMenu.addTab("View Menu", jPanelvm);

        jPanelAM.setBackground(new java.awt.Color(18, 71, 103));
        jPanelAM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 137, 154));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setPreferredSize(new java.awt.Dimension(1134, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCancel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblCancel2.setForeground(new java.awt.Color(255, 255, 255));
        lblCancel2.setText("Cancel");
        lblCancel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancel2MouseClicked(evt);
            }
        });
        jPanel5.add(lblCancel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 37, -1, -1));

        lblClr.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblClr.setForeground(new java.awt.Color(255, 255, 255));
        lblClr.setText("Clear");
        lblClr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClrMouseClicked(evt);
            }
        });
        jPanel5.add(lblClr, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 37, -1, -1));

        lblAddNewMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAddNewMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblAddNewMenu.setText("Add");
        lblAddNewMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddNewMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddNewMenuMouseClicked(evt);
            }
        });
        jPanel5.add(lblAddNewMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 37, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, 78));

        jPanelAM.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1140, 90));

        lblMenuID.setBackground(new java.awt.Color(204, 204, 204));
        lblMenuID.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblMenuID.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanelAM.add(lblMenuID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 78, -1));

        lblError1.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblError1.setForeground(new java.awt.Color(204, 0, 0));
        lblError1.setText("*");
        jPanelAM.add(lblError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 30, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Description");
        jPanelAM.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 108, -1, -1));

        txtMenuDesc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMenuDesc1KeyTyped(evt);
            }
        });
        jPanelAM.add(txtMenuDesc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 110, 450, 20));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        browseImg.setFont(new java.awt.Font("Tahoma", 1, 11));
        browseImg.setForeground(new java.awt.Color(255, 255, 255));
        browseImg.setText("Browse");
        browseImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browseImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseImgActionPerformed(evt);
            }
        });
        jPanel4.add(browseImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 20));

        lblIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        lblIMG.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.add(lblIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, 140));
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 170));
        jPanel4.add(jFileChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, -20, 480, 380));

        dfltImg.setFont(new java.awt.Font("Times New Roman", 1, 12));
        dfltImg.setForeground(new java.awt.Color(255, 255, 255));
        dfltImg.setText("Use default");
        dfltImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dfltImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfltImgActionPerformed(evt);
            }
        });
        jPanel4.add(dfltImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 100, 20));

        jPanelAM.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 58, 220, 226));

        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("* Should not be longer than 50 characters");
        jPanelAM.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 176, 287, -1));

        lblError.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblError.setForeground(new java.awt.Color(204, 0, 0));
        lblError.setText("*");
        jPanelAM.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 20, 20));

        txtpath.setBackground(new java.awt.Color(153, 153, 153));
        txtpath.setEditable(false);
        txtpath.setText("Image not added");
        txtpath.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtpathComponentAdded(evt);
            }
        });
        jPanelAM.add(txtpath, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 20, 210, -1));

        jTabbedPaneMenu.addTab("Add menu", jPanelAM);

        jPanelUM.setBackground(new java.awt.Color(18, 71, 103));
        jPanelUM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblChImg.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblChImg.setForeground(new java.awt.Color(0, 0, 153));
        lblChImg.setText("Change this image");
        lblChImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChImgMouseClicked(evt);
            }
        });
        jPanelUM.add(lblChImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, 160, 21));
        jPanelUM.add(txtpath1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, 219, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Select a menu");
        jPanelUM.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 160, -1));

        lblCanChImg1.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblCanChImg1.setForeground(new java.awt.Color(255, 255, 255));
        lblCanChImg1.setText("Edit Items");
        lblCanChImg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCanChImg1.setFocusable(false);
        lblCanChImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCanChImg1MouseClicked(evt);
            }
        });
        jPanelUM.add(lblCanChImg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 234, 130, -1));

        lblCanChImg2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCanChImg2.setForeground(new java.awt.Color(255, 255, 255));
        lblCanChImg2.setText("Edit Description");
        lblCanChImg2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCanChImg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCanChImg2MouseClicked(evt);
            }
        });
        jPanelUM.add(lblCanChImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 160, 140, -1));

        menuCombo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        menuCombo2.setForeground(new java.awt.Color(204, 255, 255));
        menuCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombo2ActionPerformed(evt);
            }
        });
        jPanelUM.add(menuCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 312, -1));

        jPanel3.setBackground(new java.awt.Color(51, 137, 154));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(1134, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSaveImg.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblSaveImg.setForeground(new java.awt.Color(255, 255, 255));
        lblSaveImg.setText("Save Image");
        lblSaveImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSaveImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveImgMouseClicked(evt);
            }
        });
        jPanel3.add(lblSaveImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 37, -1, -1));

        lblCanChImg.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblCanChImg.setForeground(new java.awt.Color(255, 255, 255));
        lblCanChImg.setText("Cancel");
        lblCanChImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCanChImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCanChImgMouseClicked(evt);
            }
        });
        jPanel3.add(lblCanChImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 38, -1, 14));

        lblAddMenu3.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblAddMenu3.setForeground(new java.awt.Color(255, 255, 255));
        lblAddMenu3.setText("Go to Menu");
        lblAddMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMenu3MouseClicked(evt);
            }
        });
        jPanel3.add(lblAddMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 38, -1, 14));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, 78));

        jPanelUM.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1140, 90));

        lblIMG1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelUM.add(lblIMG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 144, 141));

        jTabbedPaneMenu.addTab("Update Menu", jPanelUM);

        jPanelMenu.add(jTabbedPaneMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 1140, 480));

        fnbms.addTab("Menu", new javax.swing.ImageIcon(getClass().getResource("/img/home (2).png")), jPanelMenu); // NOI18N

        jPanelMenuItems.setBackground(new java.awt.Color(18, 71, 103));

        jTabbedPaneMenuItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 137, 154)));
        jTabbedPaneMenuItems.setFont(new java.awt.Font("Times New Roman", 3, 20));

        jPanelVI.setBackground(new java.awt.Color(18, 71, 103));
        jPanelVI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuCombo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        menuCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombo1ActionPerformed(evt);
            }
        });
        jPanelVI.add(menuCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 61, 282, -1));

        itemTable1.setBackground(new java.awt.Color(0, 0, 0));
        itemTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        itemTable1.setForeground(new java.awt.Color(255, 255, 255));
        itemTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Availability", "Price"
            }
        ));
        itemTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTable1MouseClicked(evt);
            }
        });
        itemTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemTable1KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(itemTable1);
        itemTable1.getColumnModel().getColumn(0).setPreferredWidth(180);
        itemTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        itemTable1.getColumnModel().getColumn(2).setPreferredWidth(80);

        jPanelVI.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 128, 582, 163));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanelVI.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1722, 326, -1, 79));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Select a menu");
        jPanelVI.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 62, -1, -1));

        jPanel8.setBackground(new java.awt.Color(51, 137, 154));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setPreferredSize(new java.awt.Dimension(1134, 89));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddMenu2.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblAddMenu2.setForeground(new java.awt.Color(255, 255, 255));
        lblAddMenu2.setText("Go to Menu");
        lblAddMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMenu2MouseClicked(evt);
            }
        });
        jPanel8.add(lblAddMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 25, -1, -1));

        lblRemoveItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRemoveItem.setForeground(new java.awt.Color(255, 255, 255));
        lblRemoveItem.setText("Remove Item");
        lblRemoveItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRemoveItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoveItemMouseClicked(evt);
            }
        });
        jPanel8.add(lblRemoveItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 25, -1, -1));

        lblUpdateItem.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblUpdateItem.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateItem.setText("Update Item");
        lblUpdateItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUpdateItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateItemMouseClicked(evt);
            }
        });
        jPanel8.add(lblUpdateItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 25, -1, -1));

        lblAddItem.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblAddItem.setForeground(new java.awt.Color(255, 255, 255));
        lblAddItem.setText("Add New Item");
        lblAddItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddItemMouseClicked(evt);
            }
        });
        jPanel8.add(lblAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 25, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, 78));

        jPanelVI.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1139, 90));

        jTabbedPaneMenuItems.addTab("View Items", jPanelVI);

        jPanelAI.setBackground(new java.awt.Color(18, 71, 103));
        jPanelAI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuID.setText(maxMenuID( ));
        lblItemNo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item No", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanelAI.add(lblItemNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 56, 72, 34));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Description");
        jPanelAI.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        lblMenuID.setText(maxMenuID( ));
        lblMenuID3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        lblMenuID3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanelAI.add(lblMenuID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 11, 688, -1));
        jPanelAI.add(txtNewItemDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 471, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Price");
        jPanelAI.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel17.setText("Rs");
        jPanelAI.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 20));
        jPanelAI.add(txtNewPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 39, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Availability");
        jPanelAI.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        comboAvail1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        jPanelAI.add(comboAvail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("* Should not be longer than 100 characters");
        jPanelAI.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 191, 287, -1));

        jPanel9.setBackground(new java.awt.Color(51, 137, 154));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setPreferredSize(new java.awt.Dimension(1134, 89));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddNewItm.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblAddNewItm.setForeground(new java.awt.Color(255, 255, 255));
        lblAddNewItm.setText("Add Item");
        lblAddNewItm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddNewItm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddNewItmMouseClicked(evt);
            }
        });
        jPanel9.add(lblAddNewItm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, 30));

        lblClr1.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblClr1.setForeground(new java.awt.Color(255, 255, 255));
        lblClr1.setText("Clear");
        lblClr1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClr1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClr1MouseClicked(evt);
            }
        });
        jPanel9.add(lblClr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, 30));

        lblCancel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblCancel3.setForeground(new java.awt.Color(255, 255, 255));
        lblCancel3.setText("Cancel");
        lblCancel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancel3MouseClicked(evt);
            }
        });
        jPanel9.add(lblCancel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, 30));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, 78));

        jPanelAI.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1140, 90));

        lblError4.setForeground(new java.awt.Color(255, 102, 102));
        jPanelAI.add(lblError4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 20, 30));

        lblError5.setForeground(new java.awt.Color(255, 102, 102));
        jPanelAI.add(lblError5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 20, 30));

        jTabbedPaneMenuItems.addTab("Add Item", jPanelAI);

        jPanelUI.setBackground(new java.awt.Color(18, 71, 103));
        jPanelUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuID.setText(maxMenuID( ));
        lblMenuID4.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblMenuID4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanelUI.add(lblMenuID4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 573, -1));
        jPanelUI.add(txtitDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 63, 405, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Availability");
        jPanelUI.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        comboAvail.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        jPanelUI.add(comboAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Price");
        jPanelUI.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 145, 41, -1));
        jPanelUI.add(txtItPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 144, 77, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Rs");
        jPanelUI.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 147, -1, -1));

        lblItemNo1.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblItemNo1.setForeground(new java.awt.Color(255, 255, 255));
        lblItemNo1.setText("Item");
        jPanelUI.add(lblItemNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 64, -1, -1));

        jPanel10.setBackground(new java.awt.Color(51, 137, 154));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setPreferredSize(new java.awt.Dimension(1134, 89));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCancel.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblCancel.setForeground(new java.awt.Color(255, 255, 255));
        lblCancel.setText("Cancel");
        lblCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelMouseClicked(evt);
            }
        });
        jPanel10.add(lblCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 34, -1, 20));

        lblSaveUpdate.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblSaveUpdate.setForeground(new java.awt.Color(255, 255, 255));
        lblSaveUpdate.setText("Save Changes");
        lblSaveUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSaveUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveUpdateMouseClicked(evt);
            }
        });
        jPanel10.add(lblSaveUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 30));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-grey copy.png"))); // NOI18N
        jPanel10.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, 78));

        jPanelUI.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1140, 90));

        lblError6.setForeground(new java.awt.Color(255, 102, 102));
        jPanelUI.add(lblError6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 20, 30));

        lblError8.setForeground(new java.awt.Color(255, 102, 102));
        jPanelUI.add(lblError8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 20, 30));

        lblItemNo2.setBackground(new java.awt.Color(204, 204, 204));
        lblItemNo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelUI.add(lblItemNo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 60, 30));

        jTabbedPaneMenuItems.addTab("Update Item", jPanelUI);

        javax.swing.GroupLayout jPanelMenuItemsLayout = new javax.swing.GroupLayout(jPanelMenuItems);
        jPanelMenuItems.setLayout(jPanelMenuItemsLayout);
        jPanelMenuItemsLayout.setHorizontalGroup(
            jPanelMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuItemsLayout.setVerticalGroup(
            jPanelMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        fnbms.addTab("Menu Items", new javax.swing.ImageIcon(getClass().getResource("/img/item.jpg")), jPanelMenuItems); // NOI18N

        jPanelOrders.setBackground(new java.awt.Color(18, 71, 103));

        jTabbedPaneOrders.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 137, 154)));
        jTabbedPaneOrders.setFont(new java.awt.Font("Times New Roman", 3, 20));

        jPanelKOTs.setBackground(new java.awt.Color(18, 71, 103));
        jPanelKOTs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Food item orders");
        jPanelKOTs.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 149, 27));

        KOTtable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        KOTtable.setForeground(new java.awt.Color(18, 71, 103));
        KOTtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ticket_no", "Cust_no", "Venue", "Date", "Time"
            }
        ));
        KOTtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KOTtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(KOTtable);
        KOTtable.getColumnModel().getColumn(0).setPreferredWidth(15);
        KOTtable.getColumnModel().getColumn(1).setPreferredWidth(25);
        KOTtable.getColumnModel().getColumn(2).setPreferredWidth(30);
        KOTtable.getColumnModel().getColumn(3).setPreferredWidth(100);
        KOTtable.getColumnModel().getColumn(4).setPreferredWidth(20);

        jPanelKOTs.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 53, 576, 170));

        btnViewKOTitems.setText("View Items");
        jPanelKOTs.add(btnViewKOTitems, new org.netbeans.lib.awtextra.AbsoluteConstraints(1249, 75, -1, -1));

        btnVKOT.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnVKOT.setText("View Ordered Items");
        btnVKOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVKOTActionPerformed(evt);
            }
        });
        jPanelKOTs.add(btnVKOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jPanelKOT.setBackground(new java.awt.Color(51, 137, 154));

        jTableKOTitems.setBackground(new java.awt.Color(18, 71, 103));
        jTableKOTitems.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTableKOTitems.setForeground(new java.awt.Color(255, 255, 255));
        jTableKOTitems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item_no", "Description", "	Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableKOTitems);
        jTableKOTitems.getColumnModel().getColumn(0).setResizable(false);
        jTableKOTitems.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTableKOTitems.getColumnModel().getColumn(1).setResizable(false);
        jTableKOTitems.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableKOTitems.getColumnModel().getColumn(2).setResizable(false);
        jTableKOTitems.getColumnModel().getColumn(2).setPreferredWidth(20);

        javax.swing.GroupLayout jPanelKOTLayout = new javax.swing.GroupLayout(jPanelKOT);
        jPanelKOT.setLayout(jPanelKOTLayout);
        jPanelKOTLayout.setHorizontalGroup(
            jPanelKOTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKOTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelKOTLayout.setVerticalGroup(
            jPanelKOTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKOTLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelKOTs.add(jPanelKOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 273, -1, -1));

        lblRoomNo1.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblRoomNo1.setForeground(new java.awt.Color(255, 255, 255));
        lblRoomNo1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room No", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanelKOTs.add(lblRoomNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 236, 58, -1));

        jTabbedPaneOrders.addTab("KOTs", jPanelKOTs);

        jPanelBot.setBackground(new java.awt.Color(18, 71, 103));
        jPanelBot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Bar item orders");
        jPanelBot.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 145, 27));

        btnVBOT.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnVBOT.setText("View Ordered Items");
        btnVBOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVBOTActionPerformed(evt);
            }
        });
        jPanelBot.add(btnVBOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jPanelBOT.setBackground(new java.awt.Color(51, 137, 154));

        jTableBOTitems.setBackground(new java.awt.Color(18, 71, 103));
        jTableBOTitems.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTableBOTitems.setForeground(new java.awt.Color(255, 255, 255));
        jTableBOTitems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item_no", "Description", "	Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTableBOTitems);
        jTableBOTitems.getColumnModel().getColumn(0).setResizable(false);
        jTableBOTitems.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTableBOTitems.getColumnModel().getColumn(1).setResizable(false);
        jTableBOTitems.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableBOTitems.getColumnModel().getColumn(2).setResizable(false);
        jTableBOTitems.getColumnModel().getColumn(2).setPreferredWidth(20);

        javax.swing.GroupLayout jPanelBOTLayout = new javax.swing.GroupLayout(jPanelBOT);
        jPanelBOT.setLayout(jPanelBOTLayout);
        jPanelBOTLayout.setHorizontalGroup(
            jPanelBOTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBOTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBOTLayout.setVerticalGroup(
            jPanelBOTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBOTLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelBot.add(jPanelBOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 273, -1, 100));

        BOTtable.setFont(new java.awt.Font("Tahoma", 0, 12));
        BOTtable.setForeground(new java.awt.Color(18, 71, 103));
        BOTtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ticket_no", "Cust_no", "Venue", "Date", "Time"
            }
        ));
        BOTtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOTtableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BOTtable);
        BOTtable.getColumnModel().getColumn(0).setPreferredWidth(15);
        BOTtable.getColumnModel().getColumn(1).setPreferredWidth(25);
        BOTtable.getColumnModel().getColumn(2).setPreferredWidth(30);
        BOTtable.getColumnModel().getColumn(3).setPreferredWidth(100);
        BOTtable.getColumnModel().getColumn(4).setPreferredWidth(20);

        jPanelBot.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 53, 576, 170));

        lblRoomNo.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblRoomNo.setForeground(new java.awt.Color(255, 255, 255));
        lblRoomNo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room No", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanelBot.add(lblRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 236, 58, -1));

        jTabbedPaneOrders.addTab("BOTs", jPanelBot);

        javax.swing.GroupLayout jPanelOrdersLayout = new javax.swing.GroupLayout(jPanelOrders);
        jPanelOrders.setLayout(jPanelOrdersLayout);
        jPanelOrdersLayout.setHorizontalGroup(
            jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelOrdersLayout.setVerticalGroup(
            jPanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );

        fnbms.addTab("Orders", new javax.swing.ImageIcon("E:\\MnOMS\\src\\img\\notepad.png"), jPanelOrders); // NOI18N

        jPanel1.setBackground(new java.awt.Color(18, 71, 103));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Please enter a username and a password.");

        userPanel.setBackground(new java.awt.Color(51, 137, 154));
        userPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        userPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTable.setBackground(new java.awt.Color(18, 71, 103));
        userTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userTable.setForeground(new java.awt.Color(255, 255, 255));
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(userTable);

        userPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 209, 90));

        btnRmvUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRmvUser.setForeground(new java.awt.Color(204, 204, 204));
        btnRmvUser.setText("Remove user");
        btnRmvUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRmvUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRmvUserMouseClicked(evt);
            }
        });
        userPanel.add(btnRmvUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_2_remove.png"))); // NOI18N
        userPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        lblRemoveUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRemoveUser.setForeground(new java.awt.Color(255, 255, 255));
        lblRemoveUser.setText("Click here to remove a user.");
        lblRemoveUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRemoveUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoveUserMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Username should not be longer than 32 characters.");

        jPanel11.setBackground(new java.awt.Color(51, 137, 154));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCanclAddUser1.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblCanclAddUser1.setForeground(new java.awt.Color(255, 255, 255));
        lblCanclAddUser1.setText("Go to menu");
        lblCanclAddUser1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCanclAddUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCanclAddUser1MouseClicked(evt);
            }
        });

        lblCanclAddUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCanclAddUser.setForeground(new java.awt.Color(255, 255, 255));
        lblCanclAddUser.setText("Cancel");
        lblCanclAddUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCanclAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCanclAddUserMouseClicked(evt);
            }
        });

        lblAddUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAddUser.setForeground(new java.awt.Color(255, 255, 255));
        lblAddUser.setText("Add new user");
        lblAddUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(lblAddUser)
                .addGap(354, 354, 354)
                .addComponent(lblCanclAddUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                .addComponent(lblCanclAddUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCanclAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCanclAddUser1)
                    .addComponent(lblAddUser))
                .addGap(36, 36, 36))
        );

        jPanel13.setBackground(new java.awt.Color(51, 137, 154));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("User Name");
        jPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Password");
        jPanel13.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusernameKeyTyped(evt);
            }
        });
        jPanel13.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 140, -1));

        pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwKeyTyped(evt);
            }
        });
        jPanel13.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, -1));

        lblError9.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblError9.setForeground(new java.awt.Color(255, 0, 0));
        lblError9.setText("*");
        jPanel13.add(lblError9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 20, 20));

        lblError10.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblError10.setForeground(new java.awt.Color(204, 0, 0));
        lblError10.setText("*");
        jPanel13.add(lblError10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 20, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel24)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(318, 318, 318)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRemoveUser)
                    .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(307, 307, 307))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRemoveUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fnbms.addTab("User registration", new javax.swing.ImageIcon("E:\\MnOMS\\src\\img\\add_user copy.png"), jPanel1); // NOI18N

        jPanel2.add(fnbms, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 1170, 550));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sea_and_beach_1920x12002.jpg"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 750));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Perpetua Titling MT", 1, 28));
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("MENU AND ORDER MANAGEMENT SYSTEM");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 650, 30));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(2163, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(691, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addGap(2178, 2178, 2178)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblViewMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewMenuMouseClicked
        int rowno = menuTable1.getSelectedRow();
        String name = menuTable1.getModel().getValueAt(rowno, 1).toString();
        Menus menu = new Menus();
        menu.setDescription(name); 
        String id = menuTable1.getValueAt(rowno, 0).toString();
        menu.setMenuId(id);
        DefaultTableModel dtm = (DefaultTableModel) itemTable1.getModel();
        dtm.setRowCount(0);
        controller.menu_controller.LoadItemTable(dtm, id);
        itemTable1.setModel(dtm);
        fnbms.setSelectedComponent(jPanelMenuItems);
        jTabbedPaneMenuItems.setSelectedComponent(jPanelVI);
        menuCombo1.setSelectedItem(menu);
        util.EventLog.eventLog("This is lblViewMenuMouseClicked event");
    }//GEN-LAST:event_lblViewMenuMouseClicked

    private void lblUpdateMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMenuMouseClicked
        int rowno  = menuTable1.getSelectedRow();
        if (rowno==-1){
        JOptionPane.showMessageDialog(null,"Please select a menu");
        }
        else{
        String name = menuTable1.getModel().getValueAt(rowno, 1).toString();
        String id = menuTable1.getValueAt(rowno, 0).toString();
        Menus menu=new Menus();
        menu.setMenuId(id);
        menu.setDescription(name);
        menuCombo2.setSelectedItem(menu);
        jTabbedPaneMenu.setSelectedComponent(jPanelUM); 
        util.EventLog.eventLog("This is lblUpdateMenuMouseClicked event");
        }
    }//GEN-LAST:event_lblUpdateMenuMouseClicked

    private void lblAddMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMenu2MouseClicked
       fnbms.setSelectedComponent(jPanelMenu);
       jTabbedPaneMenu.setSelectedComponent(jPanelvm);
    }//GEN-LAST:event_lblAddMenu2MouseClicked

    private void lblUpdateItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateItemMouseClicked
        jTabbedPaneMenuItems.setSelectedComponent(jPanelUI);
        String menu=menuCombo1.getSelectedItem().toString();
        lblMenuID4.setText(menu);
        
        int rowno=itemTable1.getSelectedRow();
        String name = itemTable1.getModel().getValueAt(rowno, 0).toString();
        MenuItem mi=new MenuItem();
        mi.setDescription(name);
        String ino=controller.menuItem_controller.getItemNo(mi);
        
        lblItemNo2.setText(ino);
        
        String curDesc=itemTable1.getModel().getValueAt(rowno, 0).toString();
        txtitDesc.setText(curDesc);
        
        String curAvail=itemTable1.getModel().getValueAt(rowno, 1).toString();
        comboAvail.setSelectedItem(curAvail);
        
        String curPrice=itemTable1.getModel().getValueAt(rowno, 2).toString();
        txtItPrice.setText(curPrice);
        
        util.EventLog.eventLog("This is lblUpdateItemMouseClicked event");
    }//GEN-LAST:event_lblUpdateItemMouseClicked

    private void menuCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCombo1ActionPerformed
        Menus menu=(Menus) menuCombo1.getSelectedItem();
        String id=menu.getMenuId();
        DefaultTableModel dtm = (DefaultTableModel) itemTable1.getModel();
        dtm.setRowCount(0);
        controller.menu_controller.LoadItemTable(dtm, id);
        itemTable1.setModel(dtm);       
    }//GEN-LAST:event_menuCombo1ActionPerformed

    private void lblAddItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddItemMouseClicked
        Menus desc= (Menus)menuCombo1.getSelectedItem();
        lblMenuID3.setText(desc.getDescription());
        String itemNo=controller.menuItem_controller.maxItemNo(desc);
        lblItemNo.setText(itemNo);
        jTabbedPaneMenuItems.setSelectedComponent(jPanelAI);
}//GEN-LAST:event_lblAddItemMouseClicked

    private void lblCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelMouseClicked
        jTabbedPaneMenuItems.setSelectedComponent(jPanelVI);    
    }//GEN-LAST:event_lblCancelMouseClicked

    private void lblSaveUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveUpdateMouseClicked
        String menuid=lblMenuID4.getText();
        
        Menus menu=new Menus();
        menu.setDescription(menuid);
        String id=controller.menu_controller.getMenuID(menu);
        
        String itemno=lblItemNo2.getText();
        String desc=txtitDesc.getText();
        String avail=comboAvail.getSelectedItem().toString();
        String price=txtItPrice.getText();
        
        if(validateForm3()){
            int con=JOptionPane.showConfirmDialog(txtusername, "Update "+desc+"?");
            if(con==0){
                MenuItem mi=new MenuItem();
                mi.setMenus(menu);
                mi.setDescription(desc);
                mi.setItemNo(itemno);
                mi.setPrice(price);
                mi.setAvailability(avail);

                controller.menuItem_controller.updateItem(mi);
                util.EventLog.eventLog("This is lblSaveUpdateMouseClicked event");
                DefaultTableModel dtm = (DefaultTableModel) itemTable1.getModel();
                dtm.setRowCount(0);
                controller.menu_controller.LoadItemTable(dtm, id);
                itemTable1.setModel(dtm);
                jTabbedPaneMenuItems.setSelectedComponent(jPanelVI);
            }
            else
            { 
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Not validated");
        }    
    }//GEN-LAST:event_lblSaveUpdateMouseClicked

    private void lblAddNewMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddNewMenuMouseClicked
        String id = lblMenuID.getText();
        String des = txtMenuDesc1.getText();
        String img = txtpath.getText();
        if(validateForm1()){
        int con=JOptionPane.showConfirmDialog(txtusername, "Add "+des+"?");
        if(con==0){
            Menus newmenu = new Menus();
            newmenu.setMenuId(id);
            newmenu.setDescription(des);
            newmenu.setImage(img);
            controller.menu_controller.addNewMenu(newmenu);
            util.EventLog.eventLog("This is lblAddNewMenuMouseClicked event");
            DefaultTableModel model = (DefaultTableModel) menuTable1.getModel();
            menu_controller.LoadMenuTable(model);
            DefaultComboBoxModel dcbm1 = (DefaultComboBoxModel) menuCombo1.getModel();
            menu_controller.loadMenutoCombo(dcbm1);
            DefaultComboBoxModel dcbm2 = (DefaultComboBoxModel) menuCombo2.getModel();
            menu_controller.loadMenutoCombo(dcbm2);

            txtMenuDesc1.setText(null);
            String img1="E:/NetBeans2/MnOMS/src/img/food-grey copy.png";
            File f = new File(img1);
            Image image = null;
            try {
                image = ImageIO.read(f);
            } 
            catch (IOException ex) {
                Logger.getLogger(Menu_UI.class.getName()).log(Level.SEVERE, null, ex);
            }
            image = image.getScaledInstance(lblIMG.getWidth(), lblIMG.getHeight(), Image.SCALE_SMOOTH);
            if(image.equals(null)){
               lblIMG.setText("No image to display");             
            }
            else
                lblIMG.setIcon(new ImageIcon(image));

            jTabbedPaneMenu.setSelectedComponent(jPanelvm);         
            
        }
        }
        else{
            lblError.setVisible(true);
            lblError1.setVisible(true);
            JOptionPane.showMessageDialog(null, "Not validated");
            
        }  
    }//GEN-LAST:event_lblAddNewMenuMouseClicked

    private void lblClrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClrMouseClicked
        txtMenuDesc1.setText(null);           
    }//GEN-LAST:event_lblClrMouseClicked

    private void lblCancel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancel2MouseClicked
        String img="E:/NetBeans2/MnOMS/src/img/food-grey copy.png";
        File f = new File(img);
        Image image = null;
        try {
            image = ImageIO.read(f);
        } 
        catch (IOException ex) {
            Logger.getLogger(Menu_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        image = image.getScaledInstance(lblIMG.getWidth(), lblIMG.getHeight(), Image.SCALE_SMOOTH);
        if(image.equals(null)){
           lblIMG.setText("No image to display");             
        }
        else
            lblIMG.setIcon(new ImageIcon(image));

        jTabbedPaneMenu.setSelectedComponent(jPanelvm);         
    }//GEN-LAST:event_lblCancel2MouseClicked

    private void lblRemoveItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveItemMouseClicked
        int rowno=itemTable1.getSelectedRow();
        String name = itemTable1.getModel().getValueAt(rowno, 0).toString();
        int con=JOptionPane.showConfirmDialog(itemTable1, "Delete "+name+"?");
        if(con==0){
            MenuItem mi=new MenuItem();
            mi.setDescription(name);
            controller.menuItem_controller.deleteItem(mi);
            util.EventLog.eventLog("This is lblRemoveItemMouseClicked event");
        Menus menu=(Menus) menuCombo1.getSelectedItem();
        String id=menu.getMenuId();
        DefaultTableModel dtm = (DefaultTableModel) itemTable1.getModel();
        dtm.setRowCount(0);
        controller.menu_controller.LoadItemTable(dtm, id);
        itemTable1.setModel(dtm);       
        }
        else
        { 
        } 
        
}//GEN-LAST:event_lblRemoveItemMouseClicked

    private void lblDltMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDltMenuMouseClicked
        int rowno  = menuTable1.getSelectedRow();
        if (rowno==-1){
        JOptionPane.showMessageDialog(null,"Please select a menu");
        }
        else{
        String name = menuTable1.getModel().getValueAt(rowno, 1).toString();
        String id = menuTable1.getValueAt(rowno, 0).toString();
        Menus menu=new Menus();
        menu.setMenuId(id);
        menu.setDescription(name);

        }
    }//GEN-LAST:event_lblDltMenuMouseClicked

    private void lblClr1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClr1MouseClicked
     txtNewItemDesc.setText(null);  
    }//GEN-LAST:event_lblClr1MouseClicked

    private void lblCancel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancel3MouseClicked
       fnbms.setSelectedComponent(jPanelMenuItems);
       jTabbedPaneMenuItems.setSelectedComponent(jPanelVI);
    }//GEN-LAST:event_lblCancel3MouseClicked

    private void lblAddNewItmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddNewItmMouseClicked
        String itemDesc=txtNewItemDesc.getText();
        String itemNo=lblItemNo.getText();
        String menu=lblMenuID3.getText(); System.out.println("menu" + menu);
        String price=txtNewPrice.getText();
        String avail=comboAvail1.getSelectedItem().toString();

        if(validateForm2()){
        int con=JOptionPane.showConfirmDialog(txtNewItemDesc, "Add "+itemDesc+"?");
            if(con==0){
                Menus desc=new Menus();
                desc.setDescription(menu);
                String id=controller.menu_controller.getMenuID(desc);

                Menus mn=new Menus();
                mn.setMenuId(id);

                MenuItem mi=new MenuItem();
                mi.setDescription(itemDesc);
                mi.setItemNo(itemNo);
                mi.setMenus(mn);
                mi.setPrice(price);
                mi.setAvailability(avail);

                controller.menuItem_controller.addItem(mi);
                util.EventLog.eventLog("This is lblAddNewItmMouseClicked event");
                DefaultTableModel dtm = (DefaultTableModel) itemTable1.getModel();
                dtm.setRowCount(0);
                controller.menu_controller.LoadItemTable(dtm, id);
                itemTable1.setModel(dtm);
                jTabbedPaneMenuItems.setSelectedComponent(jPanelVI);
            }
            else{ 
            } 
        }
        else{
                JOptionPane.showMessageDialog(null, "Not validated");
        }
    }//GEN-LAST:event_lblAddNewItmMouseClicked

    private void KOTtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KOTtableMouseClicked
        jPanelKOT.setVisible(false); 
        jTableKOTitems.setVisible(false);
        btnVKOT.setVisible(true);

        int rowno=KOTtable.getSelectedRow();
        String name = KOTtable.getModel().getValueAt(rowno, 1).toString();

        Rooms rm=new Rooms();
        rm.setCustNo(name);

        String rn=controller.room_Controller.getRoomNo(rm);lblRoomNo1.setVisible(true);
        lblRoomNo1.setText(rn);
   
    }//GEN-LAST:event_KOTtableMouseClicked

    private void btnVKOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVKOTActionPerformed
        jPanelKOT.setVisible(true); 
        jTableKOTitems.setVisible(true);
        int rowno=KOTtable.getSelectedRow();
        String name = KOTtable.getModel().getValueAt(rowno, 0).toString();
        int ticket_no=Integer.parseInt(name);
      
        DefaultTableModel model= (DefaultTableModel) jTableKOTitems.getModel();
        foodOrder_controller.LoadKOTItems(model,ticket_no);
    }//GEN-LAST:event_btnVKOTActionPerformed

    private void btnVBOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVBOTActionPerformed
        jPanelBOT.setVisible(true);  
        jTableBOTitems.setVisible(true);
        int rowno=BOTtable.getSelectedRow();
        String name = BOTtable.getModel().getValueAt(rowno, 0).toString();
        int ticket_no=Integer.parseInt(name);
        DefaultTableModel model= (DefaultTableModel) jTableBOTitems.getModel();
        barOrder_controller.LoadBOTItems(model,ticket_no);
     
    }//GEN-LAST:event_btnVBOTActionPerformed

    private void browseImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseImgActionPerformed
        try {
            jFileChooser1.showOpenDialog(this);
            File f = jFileChooser1.getSelectedFile();
            String path = f.getAbsolutePath();
            path = path.replace("\\", "/");
            File f1 = new File(path);
            txtpath.setText(path);
            Image image = ImageIO.read(f1);
            image = image.getScaledInstance(lblIMG.getWidth(), lblIMG.getHeight(), image.SCALE_SMOOTH);
            lblIMG.setIcon(new ImageIcon(image));
        } 
        catch (IOException ex) {
            Logger.getLogger(Menu_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_browseImgActionPerformed

    private void lblChImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChImgMouseClicked
        try {
            jFileChooser1.showOpenDialog(this);
            File f = jFileChooser1.getSelectedFile();
            String path = f.getAbsolutePath();
            path = path.replace("\\", "/");
            File f1 = new File(path);
            txtpath1.setText(path);
            Image image = ImageIO.read(f1);
            image = image.getScaledInstance(lblIMG1.getWidth(), lblIMG1.getHeight(), image.SCALE_SMOOTH);
            lblIMG1.setIcon(new ImageIcon(image));
            lblIMG2.setIcon(new ImageIcon(image));
        } 
        catch (IOException ex) {
            Logger.getLogger(Menu_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblChImgMouseClicked

    private void lblRemoveUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveUserMouseClicked
        userPanel.setVisible(true);
    }//GEN-LAST:event_lblRemoveUserMouseClicked

    private void lblSaveImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveImgMouseClicked
    String path=txtpath1.getText();
    String des=menuCombo2.getSelectedItem().toString();
    int con=JOptionPane.showConfirmDialog(txtusername, "Save image for "+des+"?");
        if(con==0){
            Menus mn=new Menus();
            mn.setDescription(des);
            String id=controller.menu_controller.getMenuID(mn);
            mn.setMenuId(id);
            mn.setImage(path);
    
            controller.menu_controller.newImg(mn);
            txtpath1.setText(null);
            util.EventLog.eventLog("This is lblSaveImgMouseClicked event");
            this.dispose();
            new Menu_UI().setVisible(true);
            
            
        }
        else
        { jTabbedPaneMenu.setSelectedComponent(jPanelvm);
        }    
    }//GEN-LAST:event_lblSaveImgMouseClicked

    private void dfltImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfltImgActionPerformed
        txtpath.setText("E:/NetBeans2/MnOMS/src/img/defaultmenuimg.png");  
    }//GEN-LAST:event_dfltImgActionPerformed

    private void lblAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddUserMouseClicked
        userPanel.setVisible(false);
        String un=txtusername.getText();
        String pass=pw.getText();
        if(validateForm4()){
            int con=JOptionPane.showConfirmDialog(txtusername, "Add "+un+"?");
            if(con==0){
            Login log=new Login();
                   log.setUsername(un);
                    hash md5 = new hash();
                    String pwd = hash.GetEncryptedPssword(pass);
                    log.setPassword(pwd);
                    controller.login_controller.addNewUser(log);
                    util.EventLog.eventLog("This is lblAddUserMouseClicked event");
                    DefaultTableModel modelUser= (DefaultTableModel) userTable.getModel();
                    login_controller.LoadUserTable(modelUser);
                    txtusername.setText(null);
                    pw.setText(null);
                    lblError9.setVisible(true);
                    lblError10.setVisible(true);
            }
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Not validated");
           txtusername.setText(null);
           pw.setText(null);
        }
    }//GEN-LAST:event_lblAddUserMouseClicked

    private void lblCanclAddUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanclAddUser1MouseClicked
        fnbms.setSelectedComponent(jPanelMenu);
    }//GEN-LAST:event_lblCanclAddUser1MouseClicked

    private void lblCanChImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanChImg1MouseClicked
        Menus curDesc = (Menus) menuCombo2.getSelectedItem();
        fnbms.setSelectedComponent(jPanelMenuItems); 
        jTabbedPaneMenuItems.setSelectedComponent(jPanelVI); 
        menuCombo1.setSelectedItem(curDesc);
    }//GEN-LAST:event_lblCanChImg1MouseClicked

    private void lblCanChImg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanChImg2MouseClicked
        Menus curDesc = (Menus) menuCombo2.getSelectedItem();
        this.newMenu = curDesc;
        EditMenuDesc edit = new EditMenuDesc(this);
        edit.setEnabled(true);
        edit.setVisible(true);
        //this.setEnabled(false);         
    }//GEN-LAST:event_lblCanChImg2MouseClicked

    private void lblCanChImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanChImgMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCanChImgMouseClicked

    private void lblAddMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMenu3MouseClicked
        fnbms.setSelectedComponent(jPanelMenu);
       jTabbedPaneMenu.setSelectedComponent(jPanelvm);
    }//GEN-LAST:event_lblAddMenu3MouseClicked

    private void itemTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTable1MouseClicked
        lblUpdateItem.setVisible(true);        
    }//GEN-LAST:event_itemTable1MouseClicked

    private void lblCanclAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanclAddUserMouseClicked
        txtusername.setText(null);
        pw.setText(null);
    }//GEN-LAST:event_lblCanclAddUserMouseClicked

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        btnRmvUser.setVisible(true);
    }//GEN-LAST:event_userTableMouseClicked

    private void btnRmvUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRmvUserMouseClicked
        int rowno=userTable.getSelectedRow();
        String user=userTable.getModel().getValueAt(rowno, 0).toString();
        int con=JOptionPane.showConfirmDialog(userTable,"Remove"+user+"?");
        if(con==0){
            controller.login_controller.removeUser(user);
            util.EventLog.eventLog("This is btnRmvUserMouseClicked event");
        DefaultTableModel modelUser= (DefaultTableModel) userTable.getModel();
        login_controller.LoadUserTable(modelUser);
            userPanel.setVisible(false);
        }
        else{
            if(con==2){
            userPanel.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnRmvUserMouseClicked

    private void menuCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCombo2ActionPerformed
        String des=menuCombo2.getSelectedItem().toString();
        Menus mn=new Menus();
        mn.setDescription(des);
        String id=controller.menu_controller.getMenuID(mn);
        String img=controller.menu_controller.getImage(id); 
        File f = new File(img);
        Image image = null;
        try {
            image = ImageIO.read(f);
        } 
        catch (IOException ex) {
            Logger.getLogger(Menu_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        image = image.getScaledInstance(lblIMG1.getWidth(), lblIMG1.getHeight(), Image.SCALE_SMOOTH);
        if(image.equals(null)){
           lblIMG1.setText("No image to display");             
        }
        else
            lblIMG1.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_menuCombo2ActionPerformed

    private void btnPrintMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintMenuActionPerformed
       setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));  
       try {
            new rep4().setVisible(true);
            this.setEnabled(true);
       }
       catch(Exception e){
            System.out.println(e.getMessage());
       }
       finally {
            setCursor(Cursor.getDefaultCursor());
       }
    }//GEN-LAST:event_btnPrintMenuActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        this.dispose();
        loginUI log = new loginUI();
        log.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblAddMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMenuMouseClicked
        fnbms.setSelectedComponent(jPanelMenu);
        jTabbedPaneMenu.setSelectedComponent(jPanelAM);
    }//GEN-LAST:event_lblAddMenuMouseClicked

    private void BOTtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOTtableMouseClicked
        jPanelBOT.setVisible(false); 
        jTableBOTitems.setVisible(false);
        btnVBOT.setVisible(true);

        int rowno=BOTtable.getSelectedRow();
        String name = BOTtable.getModel().getValueAt(rowno, 1).toString();

        Rooms rm=new Rooms();
        rm.setCustNo(name);

        String rn=controller.room_Controller.getRoomNo(rm);lblRoomNo.setVisible(true);
        lblRoomNo.setText(rn);

    }//GEN-LAST:event_BOTtableMouseClicked

    private void menuTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTable1MouseClicked
        int row=menuTable1.getSelectedRow();
        String id=menuTable1.getModel().getValueAt(row, 0).toString();
        String img=controller.menu_controller.getImage(id); 
        File f = new File(img);
        Image image = null;
        try {
            image = ImageIO.read(f);
        } 
        catch (IOException ex) {
            Logger.getLogger(Menu_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        image = image.getScaledInstance(lblIMG2.getWidth(), lblIMG2.getHeight(), Image.SCALE_SMOOTH);
        if(image.equals(null)){
           lblIMG2.setText("No image to display");             
        }
        else
            lblIMG2.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_menuTable1MouseClicked

    private void menuTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuTable1KeyPressed
        int row=menuTable1.getSelectedRow();
        String id=menuTable1.getModel().getValueAt(row, 0).toString();
        String img=controller.menu_controller.getImage(id); 
        File f = new File(img);
        Image image = null;
        try {
            image = ImageIO.read(f);
        } 
        catch (IOException ex) {
            Logger.getLogger(Menu_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        image = image.getScaledInstance(lblIMG2.getWidth(), lblIMG2.getHeight(), Image.SCALE_SMOOTH);
        if(image.equals(null)){
           lblIMG2.setText("No image to display");             
        }
        else
            lblIMG2.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_menuTable1KeyPressed

    private void itemTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemTable1KeyPressed
            lblUpdateItem.setVisible(true);        
    }//GEN-LAST:event_itemTable1KeyPressed

    private void txtMenuDesc1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMenuDesc1KeyTyped
        lblError1.setVisible(false);
    }//GEN-LAST:event_txtMenuDesc1KeyTyped

    private void txtpathComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtpathComponentAdded
        lblError.setVisible(false);
    }//GEN-LAST:event_txtpathComponentAdded

    private void txtusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyTyped
        lblError9.setVisible(false);
    }//GEN-LAST:event_txtusernameKeyTyped

    private void pwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyTyped
        lblError10.setVisible(false);
    }//GEN-LAST:event_pwKeyTyped
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
    
    private String maxMenuID()  {
    return null;
    }
    
    public boolean  validateForm1(){
        val v = new val();    
        Vector<JTextField> txt = new Vector<JTextField>();{
        txt.add(txtMenuDesc1);
        txt.add(txtpath);
        
        Vector<JLabel> lblTxt = new Vector<JLabel>();
        lblTxt.add(lblError);
        lblTxt.add(lblError1);
        
        boolean txtResult = false;
        boolean result;
        
        if (v.isEmptyRequiredField(txt, lblTxt)) {
                txtResult = true;
        }
        if (txtResult) {
            JOptionPane.showMessageDialog(null, "Please fill mandatory fields.");
            result = false;
        }
        else{
            result = true;
        }
        return result;
    }
    }
    
    public boolean  validateForm2(){
        val v = new val();    
        Vector<JTextField> txt = new Vector<JTextField>();{
        txt.add(txtNewItemDesc);
        txt.add(txtNewPrice);
        
        Vector<JLabel> lblTxt = new Vector<JLabel>();
        lblTxt.add(lblError4);
        lblTxt.add(lblError5);
        
        boolean txtResult = false;
        boolean result;
        
        if (v.isEmptyRequiredField(txt, lblTxt)) {
                txtResult = true;
        }
        if (txtResult) {
            JOptionPane.showMessageDialog(null, "Please fill mandatory fields.");
            result = false;
        }
        else{
            result = true;
        }
        return result;
    }
    }
    
    public boolean  validateForm3(){
        val v = new val();    
        Vector<JTextField> txt = new Vector<JTextField>();{
        txt.add(txtitDesc);
        txt.add(txtItPrice);
        
        Vector<JLabel> lblTxt = new Vector<JLabel>();
        lblTxt.add(lblError6);
        lblTxt.add(lblError8);
        
        boolean txtResult = false;
        boolean result;
        
        if (v.isEmptyRequiredField(txt, lblTxt)) {
                txtResult = true;
        }
        if (txtResult) {
            JOptionPane.showMessageDialog(null, "Please fill mandatory fields.");
            result = false;
        }
        else{
            result = true;
        }
        return result;
    }
    }
    
    public boolean  validateForm4(){
        val v = new val();    
        Vector<JTextField> txt = new Vector<JTextField>();{
        txt.add(txtusername);
        txt.add(pw);
        
        Vector<JLabel> lblTxt = new Vector<JLabel>();
        lblTxt.add(lblError9);
        lblTxt.add(lblError10);
        
        boolean txtResult = false;
        boolean result;
        
        if (v.isEmptyRequiredField(txt, lblTxt)) {
                txtResult = true;
        }
        if (txtResult) {
            JOptionPane.showMessageDialog(null, "Please fill mandatory fields.");
            result = false;
        }
        else{
            result = true;
        }
        return result;
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
                    Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
                    util.ErrorLog.errorLog("Error Menu_UI");
                }
                new Menu_UI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BOTtable;
    private javax.swing.JTable KOTtable;
    private javax.swing.JButton browseImg;
    private javax.swing.JButton btnPrintMenu;
    private javax.swing.JLabel btnRmvUser;
    private javax.swing.JButton btnVBOT;
    private javax.swing.JButton btnVKOT;
    private javax.swing.JButton btnViewKOTitems;
    private javax.swing.JComboBox comboAvail;
    private javax.swing.JComboBox comboAvail1;
    private javax.swing.JButton dfltImg;
    private javax.swing.JTabbedPane fnbms;
    private javax.swing.JTable itemTable1;
    private javax.swing.JFileChooser jFileChooser1;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAI;
    private javax.swing.JPanel jPanelAM;
    private javax.swing.JPanel jPanelBOT;
    private javax.swing.JPanel jPanelBot;
    private javax.swing.JPanel jPanelKOT;
    private javax.swing.JPanel jPanelKOTs;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelMenuItems;
    private javax.swing.JPanel jPanelOrders;
    private javax.swing.JPanel jPanelUI;
    private javax.swing.JPanel jPanelUM;
    private javax.swing.JPanel jPanelVI;
    private javax.swing.JPanel jPanelvm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPaneMenu;
    private javax.swing.JTabbedPane jTabbedPaneMenuItems;
    private javax.swing.JTabbedPane jTabbedPaneOrders;
    private javax.swing.JTable jTableBOTitems;
    private javax.swing.JTable jTableKOTitems;
    private javax.swing.JLabel lblAddItem;
    private javax.swing.JLabel lblAddMenu;
    private javax.swing.JLabel lblAddMenu2;
    private javax.swing.JLabel lblAddMenu3;
    private javax.swing.JLabel lblAddNewItm;
    private javax.swing.JLabel lblAddNewMenu;
    private javax.swing.JLabel lblAddUser;
    private javax.swing.JLabel lblCanChImg;
    private javax.swing.JLabel lblCanChImg1;
    private javax.swing.JLabel lblCanChImg2;
    private javax.swing.JLabel lblCancel;
    private javax.swing.JLabel lblCancel2;
    private javax.swing.JLabel lblCancel3;
    private javax.swing.JLabel lblCanclAddUser;
    private javax.swing.JLabel lblCanclAddUser1;
    private javax.swing.JLabel lblChImg;
    private javax.swing.JLabel lblClr;
    private javax.swing.JLabel lblClr1;
    private javax.swing.JLabel lblDltMenu;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblError10;
    private javax.swing.JLabel lblError4;
    private javax.swing.JLabel lblError5;
    private javax.swing.JLabel lblError6;
    private javax.swing.JLabel lblError8;
    private javax.swing.JLabel lblError9;
    private javax.swing.JLabel lblIMG;
    private javax.swing.JLabel lblIMG1;
    private javax.swing.JLabel lblIMG2;
    private javax.swing.JLabel lblItemNo;
    private javax.swing.JLabel lblItemNo1;
    private javax.swing.JLabel lblItemNo2;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMenuID;
    private javax.swing.JLabel lblMenuID3;
    private javax.swing.JLabel lblMenuID4;
    private javax.swing.JLabel lblRemoveItem;
    private javax.swing.JLabel lblRemoveUser;
    private javax.swing.JLabel lblRoomNo;
    private javax.swing.JLabel lblRoomNo1;
    private javax.swing.JLabel lblSaveImg;
    private javax.swing.JLabel lblSaveUpdate;
    private javax.swing.JLabel lblUpdateItem;
    private javax.swing.JLabel lblUpdateMenu;
    private javax.swing.JLabel lblViewMenu;
    private javax.swing.JComboBox menuCombo1;
    private javax.swing.JComboBox menuCombo2;
    private javax.swing.JTable menuTable1;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField txtItPrice;
    private javax.swing.JTextField txtMenuDesc1;
    private javax.swing.JTextField txtNewItemDesc;
    private javax.swing.JTextField txtNewPrice;
    private javax.swing.JTextField txtitDesc;
    private javax.swing.JTextField txtpath;
    private javax.swing.JTextField txtpath1;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPanel userPanel;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
