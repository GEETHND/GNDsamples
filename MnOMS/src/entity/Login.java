package entity;
// Generated Jul 25, 2013 8:25:49 PM by Hibernate Tools 3.2.1.GA



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer userId;
     private String username;
     private String password;

    public Login() {
    }

    public Login(String username, String password) {
       this.username = username;
       this.password = password;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }


@Override
    public String toString() {
        return username;
    }

    @Override
    public boolean equals(Object obj) {
       return this.username.equals(obj.toString());
    }

}

