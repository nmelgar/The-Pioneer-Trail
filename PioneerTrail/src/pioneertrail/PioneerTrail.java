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
    
    public static void main(String[] args) {
      
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        //Comment about weeks 11 
        //try{ 
        //    int result = createNewGame(player);
        //}
        //catch(GameControlException ex){
        //    System.out.println(ex.getMessage());
        //}
    }   
     
    
}