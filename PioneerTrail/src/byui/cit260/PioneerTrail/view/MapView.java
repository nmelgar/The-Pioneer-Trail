/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.PioneerTrail.view;

import byui.cit260.PioneerTrail.model.Game;
import byui.cit260.PioneerTrail.model.Location;
import byui.cit260.PioneerTrail.model.Map;
import byui.cit260.PioneerTrail.model.Scene;
import java.util.Scanner;
import pioneertrail.PioneerTrail;
/**
 *
 * @author MMG
 */
public class MapView {
   
    public void displayMapView() {
        String leftIndicator;
        String rightIndicator;
        Game game = PioneerTrail.currentGame();
        Map map = game.getMap();
        Location[][] locations = game.getMap().getLocations();
        System.out.println("Map");

        System.out.println();
        for (int row = 0; row < locations.length; row++) {
            System.out.print(row + " ");
            for (int column = 0; column < locations[row].length; column++) {
                
                leftIndicator = " ";
                rightIndicator = " ";
                if (locations[row][column] == map.getCurrentLocation()) {
                    
                    leftIndicator = "*";
                    rightIndicator = "*";
                } else if (locations[row][column].getVisited()) {
                    
                    leftIndicator = "<<"; 
                    rightIndicator = ">>";
                }
                else if(locations[row][column].getVisited()){
           
                    leftIndicator = "<<"; 
                    rightIndicator = ">>"; 
                }
                System.out.print("||");
                if (locations[row][column].getScene() == null) {
                    
                    System.out.print(leftIndicator + "**" + rightIndicator);
                } else {
                    System.out.print(leftIndicator
                            + locations[row][column].getScene().setSceneName()
                            + rightIndicator);
                }
            }
            System.out.println("||");
            }
        }
    }


  
    
    
    
    /**
    public void displayMapView(){
        
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
            
    System.out.println("MAP GOES HERE");
            
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
        
 }
  */  

