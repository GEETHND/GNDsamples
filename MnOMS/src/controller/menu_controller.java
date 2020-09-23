package controller;
//WRITE METHOD TO GET DATA VECTOR OF MENU TABLE

//import java.awt.List;

import entity.Menus;
import entity.Rooms;
import entity.MenuItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

public class menu_controller {

    public static String maxMenuID()  {
        
        int nextid=0;
        try {
          Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String sql = "select max(Menu_ID) from Menus" ;
            ResultSet result = statement.executeQuery(sql);
            result.next();
            String MaxMenuId=result.getObject(1).toString();
            String noPart=MaxMenuId.substring(1,3);
            
            int maxid= Integer.parseInt(noPart);
            nextid=maxid+1;
            con.close();
            } 
        catch (Exception ex) { 
            System.out.println(ex.getMessage());
        }
        String nid=String.valueOf(nextid);
        if(nid.length()==1){
            nid="M0"+nid;
//           nid="M01" ;
            }
        else{
            nid="M"+nid;
        }
        return nid ; 
   
}
    public static void LoadMenuTable(DefaultTableModel dtm) {
        List<Menus> menut = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from Menus";
            Query query = session.createQuery(hql);
            menut = (List<Menus>) query.list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }
        for (Menus menu : menut) {
            Vector v = new Vector();
            v.add(menu.getMenuId());
            v.add(menu.getDescription());
            dtm.addRow(v);
        }
    }
    
    public static void LoadMenuDesc(DefaultTableModel dtm) {
        List<Menus> menut = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from Menus";
            Query query = session.createQuery(hql);
            menut = (List<Menus>) query.list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }
        for (Menus menu : menut) {
            Vector v = new Vector();
            v.add(menu.getDescription());
            dtm.addRow(v);
        }
    }
    
     public static void LoadMenuDesc1(DefaultTableModel dtm) {
        try {
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = con.createStatement();
            String qry = "SELECT m.`Description` FROM corel_bay.menus m where m.`Description` <> 'At our Bar'";
            ResultSet rs = statement.executeQuery(qry);
            while(rs.next()){
            Vector v = new Vector();
            v.add(rs.getString("Description"));
            dtm.addRow(v);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void loadMenutoCombo(DefaultComboBoxModel model) {
        List<Menus> menut = null;

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from Menus";
            Query query = session.createQuery(hql);
            menut = (List<Menus>) query.list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }
        for (Menus menu : menut) {
            model.addElement(menu);
        }
    }

    
    
    public static ArrayList<Menus> loadMenus() {
        ArrayList<Menus> menus = null;

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from Menus";
            Query query = session.createQuery(hql);
            menus = (ArrayList<Menus>) query.list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }
        
        return menus;
    }

    public static void addNewMenu(Menus mn) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry = "Insert into menus(Menu_ID , Description ,Image) values('" + mn.getMenuId() + "','" + mn.getDescription() + "','" + mn.getImage() + "')";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deleteMenu(Menus menu) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry2 = "delete from menu_item where Menu_ID='" + menu.getMenuId() + "'";
            String qry = "delete from menus where Description='" + menu.getDescription() + "'";
            System.out.println(qry);
            statement.executeUpdate(qry2);
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static String getMenuID(Menus mn) {
        String id = null;
        try {
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = con.createStatement();
            String qry = "select Menu_ID from menus where Description='" + mn.getDescription() + "'";
            ResultSet rs = statement.executeQuery(qry);
            if(rs.next()){
            id=rs.getString(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return id;

    }
    
    public static String getCurrentDesc(Menus mn) {
        String des = null;
        try {
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = con.createStatement();
            String qry = "select Description from menus where Menu_ID='" + mn.getMenuId() + "'";
            ResultSet rs = statement.executeQuery(qry);
            if(rs.next()){
            des=rs.getString(2);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return des;

    }


    public static void newDesc(Menus mn) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry = "UPDATE `corel_bay`.`menus` SET `Description` = '" + mn.getDescription()+ "' WHERE `menus`.`Menu_ID` = '" + mn.getMenuId() + "'";
//            Insert into menu.Description values('" + mn.getDescription() + "') where Menu_ID='" + mn.getMenuId() + "'";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void newImg(Menus mn) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry = "UPDATE `corel_bay`.`menus` SET `Image` = '" + mn.getImage()+ "' WHERE `menus`.`Menu_ID` = '" + mn.getMenuId() + "'";
//            Insert into menu.Description values('" + mn.getDescription() + "') where Menu_ID='" + mn.getMenuId() + "'";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void LoadItemTable(DefaultTableModel dtm,String menuId) {

        try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT Description, Price, Availability FROM menu_item  WHERE Menu_ID='" + menuId + "' order by Price";
        ResultSet rs = st.executeQuery(sql);
    
        //mod.getDataVector().clear();
        
        while (rs.next()) {
            Vector v=new Vector();

                v.add(rs.getString("Description"));
                v.add(rs.getString("Availability"));
                v.add(rs.getString("Price"));
                
                dtm.addRow(v);
            }
       }
       catch (Exception ex) { 
            System.out.println(ex.getMessage());
       }
        }
    public static void LoadItemTable2(DefaultTableModel dtm,String menuId) {

        try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT Item_no,Description, Price, Availability FROM menu_item  WHERE Menu_ID='" + menuId + "'";
        ResultSet rs = st.executeQuery(sql);
    
        //mod.getDataVector().clear();
        
        while (rs.next()) {
            Vector v=new Vector();

                v.add(rs.getString("Item_no"));
                v.add(rs.getString("Description"));
                v.add(rs.getString("Availability"));
                v.add(rs.getString("Price"));
                
                dtm.addRow(v);
            }
       }
       catch (Exception ex) { 
            System.out.println(ex.getMessage());
       }
        }
    public static void LoadItemTable3(DefaultTableModel dtm,String menuId) {

        try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT  m.`Price`, m.`Description` FROM corel_bay.menu_item m where m.`Menu_ID`='"+menuId+"' and m.`Availability`='Yes' order by Price";
        ResultSet rs = st.executeQuery(sql);
    
        //mod.getDataVector().clear();
        
        while (rs.next()) {
            Vector v=new Vector();

                v.add(rs.getString("Description"));
                v.add(rs.getString("Price"));
                
                dtm.addRow(v);
            }
       }
       catch (Exception ex) { 
            System.out.println(ex.getMessage());
       }
        }
public static String getImage(String mn) {
        String id = null;
        try {
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = con.createStatement();
            String qry = "select Image from menus where Menu_ID='" +mn+ "'";
            ResultSet rs = statement.executeQuery(qry);
            if(rs.next()){
            id=rs.getString(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return id;

    }
}
