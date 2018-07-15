/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import java.io.PrintWriter;
import pioneertrail.PioneerTrail;

/**
 *
 * @author MMG
 */
public class ErrorView {
    
    private static PrintWriter console = pioneertrail.PioneerTrail.getOutFile();
    private static PrintWriter log = pioneertrail.PioneerTrail.getLogFile();
    
    public static void display (String className, String errorMessage) {
        
        console.println(""
                + "\n--- ERROR -----------------------------------------------"
                + "\n" + errorMessage
                + "\n---------------------------------------------------------");
        
        log.printf("%n%n%s", className + " - " + errorMessage);
    }

    
    /**
    public static PrintWriter console = pioneertrail.PioneerTrail.getOutput();
    public static PrintWriter log = pioneertrail.PioneerTrail.getLogFile();
    
   Public static void display(String className, String errorMessage){
       
       console.println(
               "\n--ERROR---------------------------------------------------"
               + "\n" + errorMessage
               + "\n--------------------------------------------------------");
       
       log.printf("%n%n%s", className + " - " + errorMessage);
       
   }*/
}
