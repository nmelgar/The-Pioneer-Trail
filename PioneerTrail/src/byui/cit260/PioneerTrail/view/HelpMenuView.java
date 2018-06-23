/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import java.util.Scanner;

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

public class HelpMenuView extends View {
    public void displayHelpMenuView(){
    
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

            System.out.println("\nHelp Menu" +
                    "\n  G: What's the goal of the game" +
                    "\n  M: How to move" +
                    "\n  E: Estimate the resources" +
                    "\n  R: Using the resources" +
                    "\n  Q: Back To Main Menu");
            
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
        case "G":
            gamesGoals();
            break;
        case "M":
            howToMove();
            break;
        case "E":
            estimateResources();
            break;
        case "R":
            usingResources();
            break;
        case "Q":
            return true;
        default:
            System.out.println("Invalid input");
        }
        
        return false;
    }
    
    private void gamesGoals() {
        System.out.println("The purpose of the game"
                + "\n is to move through the different locations,\n"
                + "\n answering questions, avoiding illness, famine \n"
                + "\n and other problems that can happen in the path. \n"
                + "\n The game could finish in two situations: \n"
                + "\n 1.- You die \n"
                + "\n 2.- You arrive to Zion. \n");
    }
        
    private void howToMove() {
        System.out.println("You need to advance from one location \n"
                + "\n to another by selecting the assigned letter of \n"
                + "\n certain location. It is important to keep moving \n"
                + "\n forward the most that we can, you wouldn't like to \n"
                + "\n go back if you were traveling 1500 miles.");
        
    }
    
    private void estimateResources() {
        System.out.println("You are allowed to take with you a wagon \n"
                + "\n this wagon has a weight of 150 punds, you will only \n"
                + "\n support 350 pounds more over it, making a total of \n"
                + "\n 500 pounds. It will mark an error if you try to carry \n"
                + "\n with you more than 500 pounds of resources. You need \n"
                + "\n to be careful when taking resources with you. It will \n"
                + "\n be a long trip.");
             
    }
    private void usingResources() {
        System.out.println("Each resource that you collect, earn or buy will \n"
                + "\n remain with you in the wagon. You can drop resources \n"
                + "\n if they are not useful for you or you can use them to heal \n"
                + "\n you, to hydrate you or to feed you. It is on you the way \n"
                + "\n you use your resources. Be careful, resources are not \n"
                + "\n forever and you will need them for this trip.");
       
    }
    
}
