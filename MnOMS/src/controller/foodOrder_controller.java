
package controller;

import entity.FoodItemOrder;
import entity.Kot;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import org.hibernate.Query;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;


public class foodOrder_controller {
  public static void addNewOrder(FoodItemOrder order) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            
            String qry = "Insert into food_item_order(kot_Ticket_no,Item_no, Qty ) values('" + order.getKot().getTicketNo() + "','" + order.getMenuItem().getItemNo() + "','" + order.getQty() + "')";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
   public static void addNewOrder2(int kot_Ticket_no,String Item_no, int Qty) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry = "Insert into food_order(kot_Ticket_no,Item_no, Qty ) values('" + kot_Ticket_no + "','" + Item_no + "','" + Qty+ "')";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
  public static void addNewOrdertoKot(Kot order) {
    try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry="Insert into kot(Ticket_no,Cust_no,Venue,Date,Time) values('" + order.getTicketNo()+"','" + order.getCustNo()+"','" + order.getVenue()+"','" + order.getDate() +"','" + order.getTime() +"')";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
            
  }
  
  public static int maxTicketno(){
       
        int nextid=0;
       
        
        try {
          Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String sql = "select max(Ticket_no) from kot" ;
            ResultSet result = statement.executeQuery(sql);
            result.next();
            String MaxItno=result.getString(1);
            int maxit= Integer.parseInt(MaxItno);
             nextid=maxit+1;
             con.close();
            } 
        catch (Exception ex) { 
            System.out.println(ex.getMessage());
        }
        int it=Integer.valueOf(nextid);
        return  it;
   }
  
  public static void LoadOrderTable(DefaultTableModel dtm,int ticketno) {
        try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT Item_no, Qty FROM food_item_order WHERE kot_Ticket_no='"+ticketno+"'";
        
        ResultSet rs = st.executeQuery(sql);
    
        dtm.getDataVector().clear();
        
        while (rs.next()) {
            Vector v=new Vector();

                v.add(rs.getString("Item_no"));
                v.add(rs.getString("Qty"));
                
                dtm.addRow(v);
                
            }
        }
       catch (Exception ex) { 
            System.out.println(ex.getMessage());
       }
}
  public static void LoadOrderTable2(DefaultTableModel dtm,int ticketno) {
      
      try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT Item_no, Qty FROM food_order WHERE kot_Ticket_no='"+ticketno+"'";
        
        ResultSet rs = st.executeQuery(sql);
    
        dtm.getDataVector().clear();
        
        while (rs.next()) {
            Vector v=new Vector();

                v.add(rs.getString("Item_no"));
                v.add(rs.getString("Qty"));
                
                dtm.addRow(v);
                
            }
        }
       catch (Exception ex) { 
            System.out.println(ex.getMessage());
       }
}
  public static void cancelNewOrder(FoodItemOrder order,int ticketno) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry = "Delete from food_order where kot_Ticket_no='"+ticketno+"'";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
  public static void LoadKOTTable(DefaultTableModel dtm) {


      try { Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT Ticket_no,Date,Time,Status FROM corel_bay.kot k";
        
        ResultSet rs = st.executeQuery(sql);
    
        dtm.getDataVector().clear();
        
        while (rs.next()) {
            Vector v=new Vector();

                v.add(rs.getString("Ticket_no"));
                v.add(rs.getString("Date"));
                v.add(rs.getString("Time"));
                v.add(rs.getString("Status"));
                dtm.addRow(v);
                
            }
        }
       catch (Exception ex) { 
            System.out.println(ex.getMessage());
       }}
//  public static void LoadKOTTableH(DefaultTableModel dtm) {
//        List<Kot> menut = null;
//        Session session = NewHibernateUtil.getSessionFactory().openSession();
//        Transaction transaction = null;
//        try {
//            transaction = session.beginTransaction();
//            String hql = "from kot";
//            Query query = session.createQuery(hql);
//            menut = (List<Kot>) query.list();
//            transaction.commit();
//        } catch (Exception e) {
//            transaction.rollback();
//        } finally {
//            session.close();
//        }
//        for (Kot menu : menut) {
//            Vector v = new Vector();
//            v.add(menu.getTicketNo());
//            v.add(menu.getDate());
//            v.add(menu.getTime());
//            v.add(menu.getStatus());
//            dtm.addRow(v);
//        }
//    }
  public static void LoadKOTTable2(DefaultTableModel dtm) {


      try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT Ticket_no,Cust_no,Venue,Date ,Time, Status FROM kot ";
        
        ResultSet rs = st.executeQuery(sql);
    
        dtm.getDataVector().clear();
        
        while (rs.next()) {
            Vector v=new Vector();

                v.add(rs.getString("Ticket_no"));
                v.add(rs.getString("Cust_no"));
                v.add(rs.getString("Venue"));
                v.add(rs.getString("Date"));
                v.add(rs.getString("Time"));
                v.add(rs.getString("Status"));
                dtm.addRow(v);
                
            }
        }
       catch (Exception ex) { 
            System.out.println(ex.getMessage());
       }
  
  
}
public static void LoadKOTItems(DefaultTableModel dtm,int ticket) {


      try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT f.Item_no, m.`Description`,f.Qty FROM corel_bay.menu_item m, corel_bay.food_order f where f.kot_Ticket_no='"+ticket+"' and f.`Item_no` = m.`Item_no`";
        ResultSet rs = st.executeQuery(sql);
        
        dtm.getDataVector().clear();
        
        while (rs.next()) {
            Vector v=new Vector();

                v.add(rs.getString("Item_no"));
                v.add(rs.getString("Description"));
                v.add(rs.getString("Qty"));
                
                dtm.addRow(v);
                
            }
        }
       catch (Exception ex) { 
            System.out.println(ex.getMessage());
       }}
public static String Roomno(String cust){
        String roomno = null ;
        try {
          Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String sql = "select Room_no from Rooms where Cust_no='"+cust+"'" ;
            ResultSet result = statement.executeQuery(sql);
            result.next();
            roomno = result.getString(1);
            con.close();
            } 
        catch (Exception ex) { 
            System.out.println(ex.getMessage());
        }
        
        return  roomno;
   }

public static void updateStatus(String status,String tickno) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry = "UPDATE `corel_bay`.`kot` SET `Status` = '" + status+ "'WHERE `kot`.`Ticket_no` = '" +tickno+ "'";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
  
}
