package controller;

import entity.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ui.Barman_view;
import ui.Chef_view;
import ui.Menu_UI;
import ui.Waiter_UI;
import util.NewHibernateUtil;
import entity.Login;

public class login_controller {

    public static boolean Login1(Login log) {
        boolean status = false;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = (Transaction) session.beginTransaction();
            session.save(log);
            transaction.commit();
            status = true;
        } catch (Exception E) {
            transaction.rollback();
            status = false;
        }
        return status;
    }

    public static boolean getUser(String userName, String password, JLabel lbl){
       Session session = NewHibernateUtil.getSessionFactory().openSession();
       Transaction transaction = null;
       boolean result = false;
       
       try{
           transaction = session.beginTransaction();
           String hql = "from Login where username = '"+userName+"'";//data imported for the given username
           Query query = session.createQuery(hql);
           List listEmp = query.list();
           
           if(listEmp.size() > 0){   
             Login emp = (Login) query.list().get(0);
             
             if(password.equals(emp.getPassword())){
                 result=true; 
                            
               if(emp.getUsername().equals("Manager")){
                    Menu_UI af = new Menu_UI();
                    af.setVisible(true);   //admin view is displayed if the manager is logged                
               }
               else{
                    if(emp.getUsername().equals("Chef")){
                        Chef_view cv = new Chef_view();
                        cv.setVisible(true); //Chef_view is displayed if the Chef is logged
                    }
                    else{
                        if(emp.getUsername().equals("Waiter")) {
                            Waiter_UI wu = new Waiter_UI();
                            wu.setVisible(true);//Waiter_view is displayed if the Waiter is logged
                        } 
                        else {
                            if(emp.getUsername().equals("Barman")) {
                            Barman_view bv = new Barman_view();
                            bv.setVisible(true);//Barman_view is displayed if the Barman is logged
                        }      
                        }    
                    }
               }
            }
            
            else{
                result = false;//if incorrect password is inserted
                lbl.setText("Password is incorrect");
                lbl.setVisible(true);
            }
           transaction.commit();
            }
           else{
                transaction.commit();
                result=false;//if incorrect username is inserted
                lbl.setText("User name is incorrect");
                lbl.setVisible(true);
            } 
        }
       catch(Exception e){
           transaction.rollback();
           JOptionPane.showMessageDialog(null, e.getMessage());
           System.out.println(e.getMessage());
       }
       finally{
           session.close();
       }
       return result;
   } 
   
    
   public static boolean authenticateCustomer(String userName, String password, JLabel lbl) {
     boolean status= true;
     try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
        //connected to database
        Statement st = con.createStatement();
        String qry = "select password from login where username='" + userName+ "'";//data selected
        ResultSet rslt = st.executeQuery(qry);
        if (rslt.next()) {
             String pwd = rslt.getString(1);
           if(pwd.length() > 0){
             Login emp = new Login();//new login entity created
             emp.setPassword(pwd);
             if(password.equals(emp.getPassword())){//passwords compared
                status=true; 
            }
           }
        }
     }
     catch (Exception E) {
        }
     return status;
    }
    
    public static void addNewUser(Login mn) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement =  con.createStatement();
            String qry = "Insert into login(Username , Password ) values('" + mn.getUsername() + "','" + mn.getPassword() + "')";
            statement.executeUpdate(qry);//database updated
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
     public static DefaultTableModel LoadUserTable(DefaultTableModel dtm) {
        Connection con;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay","root" ,"earth");
            Statement st  = (Statement) con.createStatement();
            ResultSet result = st.executeQuery("select Username from login ");//data selected
            while(result.next()){
                Vector v=new Vector();//new vector created
                v.add(result.getString("Username"));
               dtm.addRow(v);//data loaded to the vector
            }
        } 
        catch (SQLException ex) {
        }
        return dtm;
    }
     
    public static void removeUser(String user) {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/corel_bay", "root", "earth");
            Statement statement = (Statement) con.createStatement();
            String qry = "delete from login where username='" +user+ "'";
            statement.executeUpdate(qry);//database updated
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
        public static void loadUsertoCombo(DefaultComboBoxModel model) {
        List<Login> menut = null;

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from login";
            Query query = session.createQuery(hql);
            menut = (List<Login>) query.list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }
        for (Login log : menut) {
            model.addElement(log);
        }
    }
      public static ArrayList<Login> loadUsers() {
        ArrayList<Login> menus = null;

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from login";
            Query query = session.createQuery(hql);
            menus = (ArrayList<Login>) query.list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }
        
        return menus;
    }
      //DefaultComboBoxModel dcbm = (DefaultComboBoxModel) userCombo.getModel();
      //login_controller.loadUsertoCombo(dcbm);
}
