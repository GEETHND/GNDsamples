package entity;
// Generated Jul 25, 2013 8:25:49 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Kot generated by hbm2java
 */
public class Kot  implements java.io.Serializable {


     private int ticketNo;
     private String custNo;
     private String venue;
     private String date;
     private String time;
     private String status;
     private Set foodItemOrders = new HashSet(0);

    public Kot() {
    }

	
    public Kot(int ticketNo, String custNo, String venue, String date, String time, String status) {
        this.ticketNo = ticketNo;
        this.custNo = custNo;
        this.venue = venue;
        this.date = date;
        this.time = time;
        this.status = status;
    }
    public Kot(int ticketNo, String custNo, String venue, String date, String time, String status, Set foodItemOrders) {
       this.ticketNo = ticketNo;
       this.custNo = custNo;
       this.venue = venue;
       this.date = date;
       this.time = time;
       this.status = status;
       this.foodItemOrders = foodItemOrders;
    }
   
    public int getTicketNo() {
        return this.ticketNo;
    }
    
    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }
    public String getCustNo() {
        return this.custNo;
    }
    
    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }
    public String getVenue() {
        return this.venue;
    }
    
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set getFoodItemOrders() {
        return this.foodItemOrders;
    }
    
    public void setFoodItemOrders(Set foodItemOrders) {
        this.foodItemOrders = foodItemOrders;
    }




}


