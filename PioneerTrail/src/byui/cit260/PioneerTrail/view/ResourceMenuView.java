/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import byui.cit260.PioneerTrail.model.Game;
import java.util.ArrayList;
import java.util.Scanner;
import pioneertrail.PioneerTrail;
import byui.cit260.PioneerTrail.model.Resource;

/**
 *
 * @author po
 */
public class ResourceMenuView extends View{

    public ResourceMenuView() {
         getMenuString();
         
         
    }
    
    /**
    public void displayResourceMenuView() {
    
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
    **/
    
    /*
    private String[] getInputs() {
    
        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (valid == false) {
            
        System.out.println("\nINVENTORY LIST" +
                    "\n  F: Food" +
                    "\n  A: Axe" +
                    "\n  M: Hammer" +
                    "\n  S: Spare Wheels" +
                    "\n  B: Bullets" +
                    "\n  W: Wood" +
                    "\n  R: Reset" +
                    "\n  D: Drinking Water" +
                    "\n  H: Help" +
                    "\n  Q: Back to Main Menu");
            
            inputs[0] = reader.nextLine().trim();

            if (inputs[0].length() < 1) {
                System.out.println("You must specify a value");
                continue;
            }
            
            valid = true;
            
        }
        
        return inputs;
    }
    **/
     private void getMenuString(){
         
         promptMessage="";
         int count = 0;
                Game game = PioneerTrail.currentGame();
                ArrayList<Resource> items = game.getResources();
                for(Resource resource:items){
                    
                    promptMessage+= count + resource.getName();
                    
                }

         
         
     }
    
    @Override 
    public boolean doAction(String inputs) {
    /*
        switch(inputs[0].toUpperCase()) {
        case "F":
            food();
            break;
        case "A":
            axe();
            break;
        case "M":
            hammer();
            break;
        case "S":
            spareWheels();
            break;
        case "B":
            bullets();
            break;
        case "W":
            wood();
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
    
    
    private static void food() {
        
        System.out.println("Selecting food as a necessity");
        
    }
    
    private void axe() {
        
        System.out.println("Adding axe to the toolbox");
        
    }
    
    private void hammer() {
        
        System.out.println("Adding hammer to the toolbox");
        
    }
    
    private void spareWheels() {
        
        System.out.println("Taking spare wheels on your journey");
        
    }
    private void bullets() {
        
        System.out.println("keeping more bullets for hunting");
        
    }
    
    private void wood() {
        
        System.out.println("Going along with woods on the journey");
        
    }

    private void help() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView(); 
        
    }
    
}
