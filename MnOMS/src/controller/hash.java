
package controller;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class hash {
    
    public static String GetEncryptedPssword(String password)
    {
        System.out.println(" password encrypt");
        try {            
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
     
            byte byteData[] = md.digest();
     
            //convert the byte to hex format method 1
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
             sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
               // sb.append(Integer.toString((byteData[i])));
            }
          
            password = sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(hash.class.getName()).log(Level.SEVERE, null, ex);
        }
        return password;
    }  
}

    

