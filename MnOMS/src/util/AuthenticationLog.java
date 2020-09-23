/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.apache.log4j.Logger;

public class AuthenticationLog {
  static Logger errortLogger = Logger.getLogger("AuthenticationLogging");
    
  public static void AuthenticatetLog(String error)
  {
      errortLogger.error(error);
  }     
}
