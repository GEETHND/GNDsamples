package util;

import org.apache.log4j.Logger;

public class ErrorLog {
    static Logger errortLogger = Logger.getLogger("ErrorLogging");
 
   
  public static void errorLog(String error)
  {
      errortLogger.error(error);
  }
}

    

