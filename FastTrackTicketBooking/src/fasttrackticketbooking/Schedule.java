package fasttrackticketbooking;

import java.util.Scanner;

public class Schedule {
/**
 *
 * @author swathi
 */
    public Schedule(String destination, String boarding, String day, int numOFTickets) {
        this.destination = destination;
        this.boarding = boarding;
        this.day = day;
        this.numOFTickets = numOFTickets;
    }

    private String destination;
    private String boarding;
    private String day;
    private String trainNumber;
    private String time;
    private double price;
    private int numOFTickets;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getBoarding() {
        return boarding;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
      public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }

    public void getSchedule() {
        Scanner sc = new Scanner(System.in);
        String choice = getBoarding();
        String[][] stations = {{"NY", "BL"}, {"BL", "CH"}, {"CH", "IN"}, {"IN", "MN"}, {"MN", "NY"}};
        
        for (int i = 0; i < stations.length; i++) {
            for (int j = 0; j < stations[i].length; j++) {
                //System.out.println(stations[i][j]);
                if (getBoarding().equals(stations[i][j])) {
                    switch (getDestination()) {
                        case "NY":
                            setPrice(3.5);
                            
                            weekday1();
                            break;
                        case "BL":
                            setPrice(1.5);
                            
                            weekday2();
                            break;
                        case "CH":
                            setPrice(2.5);
                            
                            weekday3();
                            break;
                        case "IN":
                            setPrice(4.5);
                            
                            weekday4();
                            break;
                        case "MN":
                            setPrice(5.5);
                            
                            weekend();
                            break;
                        default:
                            System.out.println("That is invalid station code");
                            break;
                    }
                    calculateprice();
                }
                break;
            }
        }
    }

    public void weekday1() {
        if (getDay().equalsIgnoreCase("M") || getDay().equalsIgnoreCase("W") || getDay().equalsIgnoreCase("F")) {
            setTime("6PM");
            System.out.println("The train is available at " + getTime() + " from " + getBoarding());
        } else if (getDay().equalsIgnoreCase("T") || getDay().equalsIgnoreCase("R")) {
            setTime("8PM");
            System.out.println("The train is available at " + getTime() + " from " + getBoarding());
        } else {
            System.out.println("The train doesn't run on weekends. Please try another day.");

        }
    }

    public void weekday2() {
        if (getDay().equalsIgnoreCase("M") || getDay().equalsIgnoreCase("W") || getDay().equalsIgnoreCase("F")) {
            setTime("2PM");
            System.out.println("The train is available at " + getTime() + " from " + getBoarding());
        } else if (getDay().equalsIgnoreCase("T") || getDay().equalsIgnoreCase("R")) {
            setTime("9AM");
            System.out.println("The train is available at " + getTime() + " from " + getBoarding());
        } else {
            System.out.println("The train doesn't run on weekends. Please try another day.");

        }
    }

    public void weekday3() {
        if (getDay().equalsIgnoreCase("M") || getDay().equalsIgnoreCase("W") || getDay().equalsIgnoreCase("F")) {
            setTime("1PM");
            System.out.println("The train is available at " + getTime() + " from " + getBoarding());
        } else if (getDay().equalsIgnoreCase("T") || getDay().equalsIgnoreCase("R")) {
            setTime("11AM");
            System.out.println("The train is available at " + getTime() + " from " + getBoarding());
        } else {
            System.out.println("The train doesn't run on weekends. Please try another day.");

        }
    }

    public void weekday4() {
        if (getDay().equalsIgnoreCase("M") || getDay().equalsIgnoreCase("W") || getDay().equalsIgnoreCase("F")) {
            setTime("10PM");
            System.out.println("The train is available at " + getTime() + " from " + getBoarding());
        } else if (getDay().equalsIgnoreCase("T") || getDay().equalsIgnoreCase("R")) {
            setTime("12AM");
            System.out.println("The train is available at " + getTime() + " from " + getBoarding());
        } else {
            System.out.println("The train doesn't run on weekends. Please try another day.");

        }
    }

    public void weekend() {
        if (getDay().equalsIgnoreCase("S")) {
            setTime("5PM");
            System.out.println("The train is available at " + getTime() + " from " + getBoarding());
        } else if (getDay().equalsIgnoreCase("U")) {
            setTime("6AM");
            System.out.println("The train is available at " + getTime() + " from " + getBoarding());
        } else {
            System.out.println("The train doesn't run on weekdays. Please try a weekend.");

        }
    }
    public double calculateprice(){
        double totalPrice = getPrice()*numOFTickets;
        System.out.println("ticketPrice is : "+getPrice()+" number of tickets: "+numOFTickets+"\n"+"Estimated Total Price is: "+totalPrice);
        return totalPrice;
    }

    /**
     * @return the numOFTickets
     */
    public int getNumOFTickets() {
        return numOFTickets;
    }

    /**
     * @param numOFTickets the numOFTickets to set
     */
    public void setNumOFTickets(int numOFTickets) {
        this.numOFTickets = numOFTickets;
    }

}
