/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.apache.log4j.Logger;


public class EventLog {
 static Logger errortLogger = Logger.getLogger("EventLogging");
    
  public static void eventLog(String error)
  {
      errortLogger.error(error);
  }   
}
