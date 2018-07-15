/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import static byui.cit260.PioneerTrail.control.GameControl.createNewGame;
import byui.cit260.PioneerTrail.exceptions.GameControlException;
import byui.cit260.PioneerTrail.model.Actors;
import byui.cit260.PioneerTrail.model.Game;
import byui.cit260.PioneerTrail.model.Location;
import byui.cit260.PioneerTrail.model.Player;
import byui.cit260.PioneerTrail.view.StartProgramView;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MMG
 */
public class PioneerTrail {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    public static Game currentGame(){
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame){
        PioneerTrail.currentGame = currentGame;
    }

    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PioneerTrail.player = player;
    }
    
    public static PrintWriter outFile = null;
    public static BufferedReader inFile = null;
    
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PioneerTrail.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PioneerTrail.inFile = inFile;
    }
    
    public static void main(String[] args) {
      
        try{           
            
           PioneerTrail.inFile = 
                   new BufferedReader(new InputStreamReader(System.in));
           
           PioneerTrail.outFile = new PrintWriter(System.out, true);
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
        
        }catch (Throwable e){
            
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            
            e.printStackTrace();;
        }
        
        finally{
            try {
                if (PioneerTrail.inFile != null)
                PioneerTrail.inFile.close();
                
                if (PioneerTrail.outFile != null)
                PioneerTrail.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
        //Comment about weeks 11 
        //try{ 
        //    int result = createNewGame(player);
        //}
        //catch(GameControlException ex){
        //    System.out.println(ex.getMessage());
        //}
    }   

    public static PrintWriter getLogFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
     
    
}