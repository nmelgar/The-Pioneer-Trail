/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.Game;
import byui.cit260.PioneerTrail.model.Map;
import byui.cit260.PioneerTrail.model.Player;
import pioneertrail.PioneerTrail;


/**
 *
 * @author MMG
 */
public class GameControl {
    
    public static Player savePlayer(String name){
        
        Player player = new Player();
        player.setName(name);
        PioneerTrail.setPlayer(player);
        
        return player;
    }
    
    public static int createNewGame(Player player) {
        Map map = null;  
        
        if (player == null){
                return -1;
    }
        
        Game game = new Game();
        game.setPlayer(player);
        PioneerTrail.setGame(game);
        createItems();
        createMap();
            if (map ==null){
            } else {
                return -1);
            }
            game.setMap(map);
            return 1;
            }
}
    

