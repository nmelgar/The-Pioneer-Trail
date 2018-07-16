/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import byui.cit260.PioneerTrail.control.GameControl;
import byui.cit260.PioneerTrail.exceptions.GameControlException;
import byui.cit260.PioneerTrail.exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pioneertrail.PioneerTrail;

        

/**
 displayMainMenuView() {
 endOfView = false
 DO
inputs = getInputs()
IF no inputs were entered OR the first input is Q
 RETURN
ENDIF
endOfView = doAction(inputs)
WHILE endOfView != true
}
*/
public class MainMenuView extends View {
    
    public MainMenuView(){
    super("\nMAIN MENU, please choose and option: " +
                    "\n  N: Start new game" +
                    "\n  C: Continue existing game" +
                    "\n  R: Restart existing game" +
                    "\n  H: Get help on how to play the game" +
                    "\n  G: Games Goal" + 
                    "\n  Q: Exit");}   
    
    @Override
    public boolean doAction(String inputs) {
        
    String menuOptions = inputs.toUpperCase();    
    switch(menuOptions) {
        case "N":
    {
        try {
            startNewGame();
        } catch (GameControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MapControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            break;
        case "C":
            resumeGame();
        case "R":
            restartGame();
            break;
        case "H":
            getHelp();
            break;
        case "G":
            gamesGoal();
            break;
        case "Q":
            return true;
        default:
            System.out.println("Invalid input");
        }
        
        return false;
    }
    
    private void startNewGame() throws GameControlException, MapControlException {
        
        
        GameControl.createNewGame(PioneerTrail.getPlayer());
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
        
    
        }
        
    private void restartGame() {
        System.out.println("Restarting game");
        /**
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();    
        * */
    }
    
    private void gamesGoal(){
        
       GameGoalView gameGoalView = new GameGoalView();
       gameGoalView.display();
    }
    
    private void getHelp() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();        
    }

    private void resumeGame() {
        ResumeMenuView resumeMenuView = new ResumeMenuView();
        resumeMenuView.displayResumeMenuView();
    }
}