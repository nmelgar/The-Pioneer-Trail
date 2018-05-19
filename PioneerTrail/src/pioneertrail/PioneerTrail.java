/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import byui.cit260.PioneerTrail.model.Actors;
import byui.cit260.PioneerTrail.model.Player;

/**
 *
 * @author MMG
 */
public class PioneerTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Player playerOne = new Player();
      
      playerOne.setName("Peter Parker");
      playerOne.setAge(25);
      playerOne.setGender("Male");
      playerOne.setHealth(100);
      
      String playerOneName = playerOne.getName();
      double playerOneAge = playerOne.getAge();
      String playerOneGender = playerOne.getGender();
      float playerOneHealth = playerOne.getHealth();
      
     System.out.println(playerOne.toString());  
     
     Actors.JohnSmith.getName();
     Actors.JohnSmith.getDescription();
     
     System.out.println(playerOne.toString());
     System.out.println(Actors.JohnSmith);
     
    }
    
}
