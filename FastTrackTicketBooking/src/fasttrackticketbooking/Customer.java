package fasttrackticketbooking;
/**
 *
 * @author swathi
 */
public class Customer {

    public Customer(String name, Long phoneNumber, String email, String membership) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.membership = membership;
    }

    private String name;
    private Long phoneNumber;
    private String email;
    private String membership;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemebership() {
        return membership;
    }

    public void setMembership(String memebership) {
        this.membership = memebership;
    }

    public void getCustomerDetails(String name, Long phoneNumber, String email, String membership ) {
        System.out.println("name : "+ getName()+" email: "+getEmail()+" phone number: "+getPhoneNumber());
    }

}
