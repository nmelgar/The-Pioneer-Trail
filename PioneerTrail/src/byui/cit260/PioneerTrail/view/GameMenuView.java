/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import byui.cit260.PioneerTrail.model.Map;
import java.util.Scanner;
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

public class GameMenuView {
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
            if (moveNewLocation())
                viewMap();
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
            this.saveGame();
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
        MapView mapView = new MapView();
        mapView.displayMapView();
    }
    
   
    private void viewInventoryItems() {
        ResourceMenuView resourceMenuView = new ResourceMenuView();
        resourceMenuView.display(); 
        
    }
    
   
    private void purchaseNewSupplies() {
        System.out.println("Purchase Supplies :)");         
    }
    
    private void exploreNewLocation () {
        System.out.println("What location do you want to visit?");         
    }
    
    private boolean moveNewLocation() {
        /**System.out.println("What location do you want to move to?");*/   
        Map map = PioneerTrail.currentGame().getMap();
        int currentRow = map.getCurrentRow();
        int currentColumn = map.getCurrentColumn();
        if (currentColumn + 1 >= map.getColumnCount()){
            if (currentRow +1 >= map.getRowCount()){
                System.out.println("You arrived to Zion!");
                return false;
            }
            else{
                map.getCurrentLocation().setVisited(Boolean.TRUE);
                map.setCurrentColumn(0);
                map.setCurrentRow(currentRow + 1);
            }
        }
        else{
        map.getCurrentLocation().setVisited(Boolean.TRUE);
        map.setCurrentColumn(currentColumn + 1);
        }
       return true;  
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
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
       
    }
    private void help() {
        System.out.println("show help");
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }
    
    
    
}
