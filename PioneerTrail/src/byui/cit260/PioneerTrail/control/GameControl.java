/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.Player;
import pioneertrail.PioneerTrail;


/**
 *
 * @author MMG
 */
public class GameControl {
    
    public static Player savePlayer(String name){
        System.out.println("*** savePlayer() called ***");
        Player player = new Player();
        player.setName(name);
        
        PioneerTrail.setPlayer(player);
        
        return player;
    }
    
    public static void createNewGame(Player player) {
    System.out.println("Need to create new game Player = " + player.getName());
    }
}
    

