/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.Actors;
import byui.cit260.PioneerTrail.model.Game;
import byui.cit260.PioneerTrail.model.Map;
import byui.cit260.PioneerTrail.model.Player;
import byui.cit260.PioneerTrail.model.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import pioneertrail.PioneerTrail;


/**
 *
 * @author MMG
 * 
 * public static int createNewGame(Player player) {
if (player == null)
return -1
* 
game = create a new Game object
Save a reference to the Player object in the game
Save a reference to the game in the main class
* 
actors = createActors()
Save the list of actors in the Game object
Assign an actor to the player
* 
items = createItems()
Save the list of items in the game
* 
map = createMap(noOfRows, noOfColumns, items)
IF map == null THEN
 RETURN -1
ENDIF
* 
Assign the map to the game
RETURN 1 // indicates success
}
 * 
 * 
 */
public class GameControl {
    
    
   
public static Player savePlayer(String playerName) {
        Player player = new Player();
        player.setName(playerName);
        PioneerTrail.setPlayer(player);
        
        return player;
    }   
    public static int createNewGame(Player player){
        Map map = createMap(5,5);  
        
        if (player == null){
                return -1;
            }
            
         Game game = new Game(); 
         game.setPlayer(player);
         PioneerTrail.setGame(game);
         Resource[] items = createItems();
         
            if (map == null){
            } else {
                return -2;
        }
         game.setMap(map);
         return 1;
    }
    
    public static Resource[] createItems(){
        Resource[] items = new Resource[6];
                     
        Resource hammer = new Resource();
        hammer.setName("Hammer");
        hammer.setCount(1);
        hammer.setWeight(50);
        
        Resource water = new Resource();
        water.setName("Water");
        water.setCount(2);
        water.setWeight(15);
        
        Resource food = new Resource();
        food.setName("Food");
        food.setCount(10);
        food.setWeight(10);
        
        Resource wood = new Resource();
        wood.setName("Wood");
        wood.setCount(3);
        wood.setWeight(30);
        
        Resource clothes = new Resource();
        clothes.setName("Clothes");
        clothes.setCount(10);
        clothes.setWeight(5);
        
       
        
      
        
        System.out.println("\n" + Arrays.toString(items));
        return items;     
    }

   
    
    
    /**
    public static Actors[] createActors(){
       Actors[] actors = new Actors[6];
       
       Actors johnsmith = new Actors();
       johnsmith.setName("john_Smith");
       johnsmith.setDescription("");
        
       return actors;
    }
    */
    
    
   /*
    public static Actor[] createActors() {
    
actors = create an array Actor objects
    
actor1 = new Actor object
Assign values to each attribute in the Actor object
Assign actor1 to the next position in the actors array
    
actor2 = new Actor object
Assign values to each attribute in the Actor object
Assign actor2 to the next position in the actors array
…
…
RETURN items
    
    */
    
    
    }
    
    
    