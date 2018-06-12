/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import byui.cit260.PioneerTrail.control.GameControl;
import pioneertrail.PioneerTrail;
        

/**
 *
 * @author MMG
 */
public class MainMenuView {
    
    public void displayMainMenuView(){
    
        boolean endOfView = false;
    
        do {
            
            String[] inputs = this.getInputs();

            if (inputs == null) {
                return;
            } else if ("E".equals(inputs[0].toUpperCase())) {
                return;
            }

            endOfView = doAction(inputs);
            
        } while (endOfView == false);
    
   }

    private String[] getInputs() {
        
        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (valid == false) {

            System.out.println("\nMAIN MENU" +
                    "\n  N: Start new game" +
                    "\n  L: Load existing game" +
                    "\n  H: Get help on how to play the game" +
                    "\n  E: Exit");
            
            inputs[0] = reader.nextLine().trim();

            if (inputs[0].length() < 1) {
                System.out.println("You must specify a value");
                continue;
            }
            
            valid = true;
        }
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
        switch(inputs[0].toUpperCase()) {
        case "N":
            startNewGame();
        case "R":
            restartGame();            
        case "H":
            getHelp();
        case "E":
            return true;
        default:
            System.out.println("Invalid input");
        }
        
        return false;
    }
    
    private void startNewGame() {
        GameControl.createNewGame(PioneerTrail.getPlayer());
        
        GameMainView gameMainView = new GameMainView();
        gameMainView.displayGameViewMenu();
    }
        
    private void restartGame() {
        //Start existing game? The method's called "restart" game
        //why not just call it "load"
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();        
    }
    
    private void getHelp() {
        HelpViewMenu helpViewMenu = new HelpViewMenu();
        helpViewMenu.displayHelpMenuView();
    }
}