/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.BarItemOrder;
import entity.BarOrder;
import entity.Bot;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class barOrder_controller {
    
  public static void addNewOrder(BarItemOrder order) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
             String qry = "Insert into bar_item_order(bot_Ticket_no,Item_no, Qty ) values('" + order.getBot().getTicketNo() + "','" + order.getMenuItem().getItemNo() + "','" + order.getQty() + "')";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    } 
  public static void addNewOrder2(int bot_Ticket_no,String Item_no, int Qty) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry = "Insert into bar_order(bot_Ticket_no,Item_no, Qty ) values('" + bot_Ticket_no + "','" + Item_no + "','" + Qty+ "')";
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
            String sql = "select max(Ticket_no) from bot" ;
            ResultSet result = statement.executeQuery(sql);
            result.next();
            String MaxItno=result.getString(1);
            int maxit= Integer.parseInt(MaxItno);
             nextid=maxit+1;
             System.out.println("nid"+nextid);
            con.close();
            } 
        catch (Exception ex) { 
            System.out.println(ex.getMessage());
        }
        int it=Integer.valueOf(nextid);
        return  it;
   }
  public static void addNewOrdertoBot(Bot order) {
    try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry="Insert into bot(Ticket_no,Cust_no,Venue,Date,Time) values('" + order.getTicketNo()+"','" + order.getCustNo()+"','" + order.getVenue()+"','" + order.getDate() +"','" + order.getTime() +"')";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
            
  }
  public static void LoadOrderTable(DefaultTableModel dtm,int ticketno) {


      try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT Item_no, Qty FROM bar_item_order WHERE Ticket_no='"+ticketno+"'";
        
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
  
  public static void LoadBOTTable(DefaultTableModel dtm) {


      try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT Ticket_no,Date ,Time, Status FROM bot";
        
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
       }
  
  }
  public static void LoadBOTTable2(DefaultTableModel dtm) {


      try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT Ticket_no,Cust_no,Venue,Date ,Time, Status FROM bot";
        
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
  public static void LoadBOTItems(DefaultTableModel dtm,int ticket) {


      try { Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/corel_bay", "root", "earth");
        Statement st = con.createStatement();
        String sql = "SELECT f.Item_no, m.`Description`,f.Qty FROM corel_bay.menu_item m, corel_bay.bar_order f where f.bot_Ticket_no='"+ticket+"' and f.`Item_no` = m.`Item_no`";
        
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
  
  public static void updateStatus(String status,String tickno) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry = "UPDATE `corel_bay`.`bot` SET `Status` = '" + status+ "'WHERE `bot`.`Ticket_no` = '" +tickno+ "'";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
  public static void cancelNewOrder(BarItemOrder order,int ticketno) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry = "Delete from bar_order where bot_Ticket_no='"+ticketno+"'";
            statement.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
