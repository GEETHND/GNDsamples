package fasttrackticketbooking;

/**
 *
 * @author swathi, Geethmi, Yang
 */
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FastTrackTicketBooking {

    public static void main(String[] args) throws IOException {
        FastTrackTicketBooking booking = new FastTrackTicketBooking();

        Ticket ticket = new Ticket("swathi", 2323L, "sdsd", "dsds");
       // System.out.println(ticket.generateTicketID());
        //double total;
        //total = 62.0;
        
       // double price = total / quantity;
        
//        double a = 8.50;
//double b = 3.40;
//double result5 = a + b;       // result5 = 11.9
//double result6 = a - b;       // result6 = 5.1
//double result7= a * b;        // result7 = 28.9
//double result8 = a / b;       // result8 = 2.5
//
//        System.out.println(result7);
int limit = 0;
   int x; int y;
    
for (int i = 10; i >= limit; i -= 2) {
    for (int j = i; j <= 1; j++) {
        System.out.println("In inner for loop "+i+"=i "+j+"=j");
    }
    System.out.println("In outer for loop "+i+"=i ");
}

        System.out.println(limit+=4);
        System.out.println(limit=limit+4);
        
//        int var1 = 5; 
//            int var2 = 6;
//            if ((var2 = 1) == var1)
//                System.out.print(var2);
//            else 
//                System.out.print(++var2);

       // booking.bookATicket();
       
       

    }

    public void bookATicket() throws IOException {
         /*try {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter below customer information: ");
            System.out.print("FullName: ");
            if (!sc.hasNext()) {
                System.out.println("Please enter a valid name");
            }
            String name = sc.next();       
            System.out.print("PhoneNumber: ");
            Long phno = sc.nextLong(); 
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("membership: ");
            String membership = sc.next();
            System.out.println("Enter the number you would like to purchase: ");
            int numOFTickets = sc.nextInt();
            Customer cus = new Customer(name, phno, email, membership);
            cus.getCustomerDetails(name, phno, email, membership);

            System.out.println("Please enter the corresponding number for the requested service");
            System.out.println("1. Book a ticket 2. purchase memebership  3. Glance at your ticket 4. exit");
            int choice = sc.nextInt();
           while (choice < 4) {
                switch (choice) {
                    case 1:
                        System.out.println("Please enter your enter boarding station code: \nCH : Chicago\nBL: Bloomington\nIN: Indianapolis\nMN: Mattoon\nNY: NewYork");
                        String boarding = sc.next();
                        System.out.println("Please enter your enter destination station code: \nCH : Chicago\nBL: Bloomington\nIN: Indianapolis\nMN: Mattoon");
                        String destination = sc.next();
                        System.out.println("Please enter the day you want to travel: \nM: Monday\nT: Tuesday\nW : Wednesday\nR: Thursday\nF: Friday\nS: Saturday\nU: Sunday");
                        String day = sc.next();
                        while (boarding.equalsIgnoreCase(destination)) {
                            System.out.println("Please enter a different city other than boarding city");
                            destination = sc.next();
                        }
                        Schedule scheduleObject = new Schedule(destination, boarding, day, numOFTickets);
                        scheduleObject.getSchedule();
                        System.out.println("1. Book a ticket 2. purchase memebership  3. Glance at your ticket 4. exit");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        Membership member = new Membership();
                        member.getMembership();
                        System.out.println("1. Book a ticket 2. purchase memebership  3. Glance at your ticket 4. exit");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        Ticket ticket = new Ticket(name, phno, email, membership);
                        ticket.getTicketDetails();
                        System.out.println("1. Book a ticket 2. purchase memebership  3. Glance at your ticket 4. exit");
                        choice = sc.nextInt();
                        break;

                }
            }

        } catch (InputMismatchException e) {
            System.out.println(e.toString());
        }*/
    }
}
