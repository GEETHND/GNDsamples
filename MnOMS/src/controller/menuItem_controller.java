
package controller;

import entity.Menus;
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


public class menuItem_controller {
    public static String getItemNo(MenuItem item) {
        String id = null  ;
        try {
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = con.createStatement();
            String qry = "SELECT m.`Item_no` FROM menu_item m WHERE m.`Description`='" + item.getDescription()+ "'";
            ResultSet rs = statement.executeQuery(qry);
            if(rs.next()){
            id=rs.getString(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return id;

    }
    
    public static void updateItem(MenuItem mn) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry = "UPDATE `corel_bay`.`menu_item` SET `Price` = '" + mn.getPrice()+ "',Description='" + mn.getDescription()+ "', Availability='" + mn.getAvailability()+ "' WHERE `menu_item`.`Item_no` = '" + mn.getItemNo() + "'";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void addItem(MenuItem mn) {
        try {
            System.out.println("add item");
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = con.createStatement();
            String qry = "Insert into menu_item (Item_no,Menu_ID,Price,Description,Availability) values (  '" + mn.getItemNo() + "','"+mn.getMenus().getMenuId()+"','" + mn.getPrice()+ "','" + mn.getDescription()+ "','" + mn.getAvailability()+ "')";
            System.out.print(qry);
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void deleteItem(MenuItem mn) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement =  con.createStatement();
            String qry = "delete from menu_item where Description='" + mn.getDescription() + "'";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }


//public static int maxMenuItemNo(Menu id){
//    String no = null ;
//try {
//          Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fnbms", "root", "earth");
//            Statement statement = (Statement) con.createStatement();
//            String sql = "select max(MenuItemNo) from menu_item where Menu_ID='"+id.getMenuId()+"'" ;
//            System.out.println(sql);
//            ResultSet rs = statement.executeQuery(sql);
//            if(rs.next()){
//            no=rs.getString(1);
//            
////            int no=Integer.parseInt(no);
//            
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    System.out.println(no);
//        int item=Integer.valueOf(no);
//        return item;
//    }
//
//public static String maxItemNo(Menu id){
//    
//    String itemNo = null;
//    int nextNo = 0;
//    try {
//          Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fnbms", "root", "earth");
//            Statement statement = (Statement) con.createStatement();
//            int no = controller.menuItem_controller.maxMenuItemNo(id);
//            String sql = "select Item_no from menu_item where MenuItemNo='"+no+"' ";
//            ResultSet rs = statement.executeQuery(sql);
//            if(rs.next()){
//            itemNo=rs.getString(1);
//            String noPart=itemNo.substring(1,3);
//            int maxno= Integer.parseInt(noPart);
//            nextNo=maxno+1;
//            con.close();
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        String item=String.valueOf(nextNo);
//        if(item.length()==1){
//            item="I0"+item;
//        }
//        else{
//            item="I"+item;
//        }
//        return item;
//    }
public static String maxItemNo(Menus id){
    
    String itemNo = null;
    int nextNo = 0;
    try {
          Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String sql = "select max(Item_no) from menu_item";
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
            itemNo=rs.getString(1);
            String noPart=itemNo.substring(1,3);
            int maxno= Integer.parseInt(noPart);
            nextNo=maxno+1;
            con.close();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        String item=String.valueOf(nextNo);
        if(item.length()==1){
            item="I0"+item;
        }
        else{
            item="I"+item;
        }
        return item;
    }

public static void LoadItemDesc(DefaultComboBoxModel model,String id) {
        try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT m.`Description` FROM menu_item m WHERE m.`Menu_ID`='"+id+"'";
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()) {
            String mod=rs.getString(sql);
            model.addElement(mod);
        }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
public static ArrayList<MenuItem> LoadMenuItemDesc(String id) {
    
    ArrayList<MenuItem> items = new ArrayList<MenuItem>();
        try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT m.`Description` FROM menu_item m WHERE m.`Menu_ID`='"+id+"'";
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()) {
            MenuItem item = new MenuItem();
            String mod=rs.getString(1);
            item.setDescription(mod);
            items.add(item);
           
        }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return items;
    }




public static void LoadBarItems(DefaultTableModel dtm) {


      try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql ="SELECT m.`Description`,m.`Price` FROM corel_bay.menu_item m WHERE m.`Menu_ID`='M01' AND m.`Availability`='Yes'";
        
        ResultSet rs = st.executeQuery(sql);
    
        dtm.getDataVector().clear();
        
        while (rs.next()) {
            Vector v=new Vector();

                v.add(rs.getString("Description"));
                v.add(rs.getString("Price"));
                
                dtm.addRow(v);
                
            }
        }
       catch (Exception ex) { 
            System.out.println(ex.getMessage());
       }}

public static void LoadBarItems2(DefaultTableModel dtm) {


      try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql ="SELECT m.`Item_no`,m.`Description`, m.`Availability`, m.`Price` FROM corel_bay.menu_item m WHERE m.`Menu_ID`='M01'";
        
        ResultSet rs = st.executeQuery(sql);
    
        dtm.getDataVector().clear();
        
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
       }}
}

