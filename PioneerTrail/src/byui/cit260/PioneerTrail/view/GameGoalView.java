/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

/**
 *
 *
 */
public class GameGoalView extends View{
    
    public GameGoalView() {
        
        super(
                "====================================================================\n"
            + "\n  The goal of the game is to help you develop the capacity of a leader."
            + "\n  In this game, you will be the head of pioneer family."
            + "\n  You are intended to lead a wagon train preparing to go west"
            + "\n  You will go through constant presecutions and sufferings."
            + "\n  Problem may arise during the trip but you will have the opportunity"
            + "\n  to hunt if you have weapons and ammunitions when you spot a bison."
            + "\n  The game will be over when end-users are satisfied and have gotten to the last stage."
            + "\n  ================================================================\n"
            + "\n Q To go Back"
                
        );
        }

    @Override
    public boolean doAction(String inputs) {
        
        String menuOptions = inputs.toUpperCase();    
    switch(menuOptions) {
        case "Q":
            return true;
        default:
            System.out.println("Invalid input");
    }
    
        return false;


    }

  
}
