
package fasttrackticketbooking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;

public class Ticket extends Customer{
    
   private String TicketID;
   public static int numOfTickets;
   private Formatter x;

    public Ticket(String name, Long phoneNumber, String email, String membership) {
        super(name, phoneNumber, email, membership);
        numOfTickets++;
    }

    public String getTicketID() {
        return TicketID;
    }

   
    public void setTicketID(String TicketID) {
        this.TicketID = TicketID;
    }
    
    public String generateTicketID(){
        int min = 10000;
        int max = 99999;
        int randomNumber = min+(int)(Math.random()*((max-min)+1));
        String part2 = "";
        String part1 = getName().substring(0, 1);
        if(getName().length()>1){
           part2 = getName().substring(1, 2);  
        }
        return part1+randomNumber+part2;
    }
    
    public void getTicketDetails() throws IOException{
        String tid = generateTicketID();
       // String dirString = "c:/fasttrack/tickets/";
                    openFile(tid);
                    String tel = getPhoneNumber().toString();
                    addRecords(tid,getName(),tel,getEmail());//destination,boarding station,price
                    closeFile();
         //go to the file location to read the file
                    Path productsPath = Paths.get("c:/fasttrack/"+tid+".txt");
                    File productsFile = productsPath.toFile();

         // open an input stream
                    BufferedReader in = new BufferedReader(
                    new FileReader(productsFile));

         // read data from the stream and print it to the console
                    // read the records of the file
                    String line = in.readLine();
                    while(line != null) {
                        System.out.println(line);
                        line = in.readLine();
                    }

                    // close the input stream
                    in.close();



    }
    
    public void openFile(String ticketNum){
        try{
            x = new Formatter("c:/fasttrack/"+ticketNum+".txt");
        }
        catch(Exception e){
            System.out.println("You have an error");
        }
    }
    public void addRecords(String t,String n,String p,String e){
        x.format("%n---FASTTRACK---%nTicket No.: %s%nName: %s%nMobile: %s%nemail: %s%n---Enjoy a safe track!---%n",  t,n,p,e);
    }
    
    public void closeFile(){
        x.close();
    }
    

   
}
