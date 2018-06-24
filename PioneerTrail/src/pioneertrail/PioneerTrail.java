/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

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
    private static Player player;
    private static Game game;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PioneerTrail.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        PioneerTrail.game = game;
    }
    
    public static void main(String[] args) {
      
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
    }   
      
    
}