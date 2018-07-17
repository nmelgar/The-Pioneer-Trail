/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import byui.cit260.PioneerTrail.model.Game;
import byui.cit260.PioneerTrail.model.Resource;
import byui.cit260.PioneerTrail.model.Map;
import java.util.ArrayList;
import java.util.Scanner;
import pioneertrail.PioneerTrail;

/**
 * the objective of this menu is to display a location and resources needed for that 
 * location.
 *
 * @author 
 */
public class ResumeMenuView extends View{

    public void displayResumeMenuView(){
        
        boolean endOfView = false;
        
        do {
           
            String inputs = this.getInputs();

            if (inputs == null) {
                return;
                /*
            } else if ("E".equals(inputs[0].toUpperCase())) {
                return;
            }

            endOfView = doAction(input
                    */
            
        } while (endOfView == false);
        return;
        
    }
    
    public void String[] getInputs(){
        
        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (valid == false) {
            
        System.out.println("\nRESUME MENU" +
                    "\n  C: Continue game" +
                    "\n  R: Restart game" +
                    "\n  H: Help" +
                    "\n  Q: Back to Main Manu");
            
            inputs[0] = reader.nextLine().trim();

            if (inputs[0].length() < 1) {
                System.out.println("You must specify a value");
                continue;
            }
            
            valid = true;
            
        }
        
        return inputs;
    }
    
    private void getItemString(){
        
         promptMessage="";
         int count = 0;
                Game game = PioneerTrail.currentGame();
                ArrayList<Resource> items = game.getResources();
                promptMessage += "Select the resource that you want more information about by entering the number:";
                for(Resource resource:items){
                    
                    promptMessage+= count + resource.getType();
                    count++;
                    
                    promptMessage+="\n";
                }
    
    
    }
    
    @Override
    public boolean doAction(String inputs) {
        int item = Integer.parseInt(inputs);
         Game game = PioneerTrail.currentGame();
                ArrayList<Resource> items = game.getResources();
                Resource resource = items.get(item);
     
        
        
        /*
        switch(inputs[0].toUpperCase()) {
        case "C":
            continueGame();
            break;
        case "R":
            restartGame();
            break;
        case "H":
            help();
            break;
        case "Q":
            return true;
        default:
            System.out.println("Invalid input");
        }
*/
        
        return false;
    }
    

    private void continueGame() {
        
        System.out.println("continuing a saved game");
        
    }
    
    private void restartGame() {
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
        
    }

    private void help() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView(); 
        
    }

    
}