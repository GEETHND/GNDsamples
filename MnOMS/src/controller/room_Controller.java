/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Rooms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;


public class room_Controller {
 public static String getRoomNo(Rooms r) {
        String id = null;
        try {
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = con.createStatement();
            String qry = "select Room_no from rooms where Cust_no='" + r.getCustNo() + "'";
            ResultSet rs = statement.executeQuery(qry);
            if(rs.next()){
            id=rs.getString(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return id;

    }   
 
 public static String custNo(String r) {
        String id = null;
        try {
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = con.createStatement();
            String qry = "select Cust_no from rooms where Room_no='" + r + "'";
            ResultSet rs = statement.executeQuery(qry);
            if(rs.next()){
            id=rs.getString(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return id;

    }   

public static void loadRoomtoCombo(DefaultComboBoxModel model) {
        List<Rooms> menut = null;

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from Rooms";
            Query query = session.createQuery(hql);
            menut = (List<Rooms>) query.list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }
        for (Rooms menu : menut) {
            model.addElement(menu);
        }
    }
}
