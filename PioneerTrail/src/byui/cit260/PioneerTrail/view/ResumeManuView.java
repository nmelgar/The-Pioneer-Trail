/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import java.util.Scanner;

/**
 *
 * @author po
 */
public class ResumeManuView {

    public void displayResumeManuView(){
        
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
    
    private String[] getInputs(){
        
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
    
    private boolean doAction(String[] inputs) {
        
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
        
        return false;
    }
    

    private void continueGame() {
        
        System.out.println("continuing a saved game");
        
    }
    
    private void restartGame() {
        
        System.out.println("restarting a new Game");
        
    }

    private void help() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView(); 
        
    }
    
}