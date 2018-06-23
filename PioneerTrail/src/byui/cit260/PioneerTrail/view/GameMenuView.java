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

public class GameMenuView extends View {
    public void displayGameMenuView(){
    
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

            System.out.println("\nGame Menu" +
                    "\n  V: View Map" +
                    "\n  I: View inventory items" +
                    "\n  P: Purchase new supplies" +
                    "\n  L: Explore new location" +
                    "\n  M: Move to new location" +
                    "\n  E: Estimate the resources needed" +
                    "\n  B: Repair wagon" +
                    "\n  C: Use tools" +
                    "\n  D: Deal with sickness" +
                    "\n  N: Navigate terrain" +
                    "\n  HR: Hunt for resource" +
                    "\n  S: Save Game" +
                    "\n  H: Help" +
                    "\n  Q: Quit");
            
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
        case "V":
            viewMap();
            break;
        case "I":
            viewInventoryItems();
            break;
        case "P":
            purchaseNewSupplies();
            break;
        case "L":
            exploreNewLocation();
            break;
        case "M":
            moveNewLocation();
            break;
        case "E":
            estimateResourcesNeeded();
            break;
        case "B":
            repairWagon();
            break;
        case "C":
            useTools();
            break;
        case "D":
            dealWithSickness();
            break;
        case "N":
            navigateTerrain();
            break;
        case "HR":
            huntForResource();
            break;
        case "S":
            saveGame();
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
    
    private void viewMap() {
        System.out.println("This is the map");
    }
        
    private void viewInventoryItems() {
        System.out.println("Item 1"
                + "\n Item 2 \n"
                + "\n Item 3 \n"
                + "\n Item 4 \n");
        
    }
    private void purchaseNewSupplies() {
        System.out.println("Purchase Supplies :)");         
    }
    
    private void exploreNewLocation () {
        System.out.println("What location do you want to visit?");         
    }
    
    private void moveNewLocation() {
        System.out.println("What location do you want to move to?");         
    }
    
    private void estimateResourcesNeeded() {
        System.out.println("Calculate Resources needed");         
    }
    
    private void repairWagon() {
        System.out.println("What's wrong with your wagon?");         
    }
    
    private void useTools() {
        System.out.println("what tools do you want to use?");         
    }
    
    private void dealWithSickness() {
        System.out.println("What do you have?");
    }
    
    private void navigateTerrain() {
        System.out.println("How the terrain is?");         
    }
    
    private void huntForResource() {
        System.out.println("What can you see for hunting?");         
    }
    
    private void saveGame() {
        System.out.println("Saving....");
       
    }
    private void help() {
        System.out.println("show help");
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }
    
    
    
}
