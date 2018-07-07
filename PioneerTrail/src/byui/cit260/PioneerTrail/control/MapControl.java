/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.Location;
import byui.cit260.PioneerTrail.model.Map;
import byui.cit260.PioneerTrail.model.ResourceItem;
import byui.cit260.PioneerTrail.model.Scene;
import java.util.ArrayList;

/**
 *
 * @author MMG
 */
public class MapControl {
    
 public static Map createMap(int noOfRows, int noOfColumns, ArrayList<ResourceItem> items) {

        if (noOfRows < 0 || noOfColumns < 0) {
            return null;
        }
        if (items == null || items.size() < 1) {
            return null;
        }
        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);
 
       
        Location[][] location = createLocations(noOfRows, noOfColumns);
        map.setLocation(location);
        
        Scene[] scenes = createScenes();

        

        System.out.println("CreateMap Method Called");
        return map;

    }

    private static Location[][] createLocations(int noOfRows, int noOfColumns) {
        System.out.println("Create Locations");

        Location[][] locations = new Location[noOfRows][noOfColumns];
        for (int row = 0; row < (locations.length); row++) {
            for (int column = 0; column < (locations[row].length); column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                locations[row][column] = location;
            }

        }

        return locations;
    }

    private static Scene[] createScenes() {
        System.out.println("Create Regular Scene");

        Scene[] scenes = new Scene[25];
        Scene scene1 = new Scene();
        scene1.setMapSymbol("NV");
        scene1.setSceneName("Nauvoo");
        scene1.setDescription("");
        
        Scene scene2 = new Scene();
        scene2.setMapSymbol("SC");
        scene2.setSceneName("Sugar Creek");
        scene2.setDescription("");
        
        Scene scene3 = new Scene();
        scene3.setMapSymbol("RP");
        scene3.setSceneName("Richardson's Point");
        scene3.setDescription("");
        
        Scene scene4 = new Scene();
        scene4.setMapSymbol("CRC");
        scene4.setSceneName("Chariton River Crossing");
        scene4.setDescription("");
        
        Scene scene5 = new Scene();
        scene5.setMapSymbol("LC");
        scene5.setSceneName("Locust Creek");
        scene5.setDescription("");
        
        Scene scene6 = new Scene();
        scene6.setMapSymbol("GG");
        scene6.setSceneName("Garden Grove");
        scene6.setDescription("");
        
        Scene scene7 = new Scene();
        scene7.setMapSymbol("NR");
        scene7.setSceneName("Nishnabotna River");
        scene7.setDescription("");
        
        Scene scene8 = new Scene();
        scene8.setMapSymbol("GE");
        scene8.setSceneName("Grand Encampment");
        scene8.setDescription("");
        
        Scene scene9 = new Scene();
        scene9.setMapSymbol("CB");
        scene9.setSceneName("Council Bluffs");
        scene9.setDescription("");
        
        Scene scene10 = new Scene();
        scene10.setMapSymbol("WQ");
        scene10.setSceneName("Winter Quarters");
        scene10.setDescription("");
        
        Scene scene11 = new Scene();
        scene11.setMapSymbol("ERC");
        scene11.setSceneName("Elkhorn River Crossing");
        scene11.setDescription("");
        
        Scene scene12 = new Scene();
        scene12.setMapSymbol("PR");
        scene12.setSceneName("Plate River");
        scene12.setDescription("");
        
        Scene scene13 = new Scene();
        scene13.setMapSymbol("FK");
        scene13.setSceneName("Fort Kearny");
        scene13.setDescription("");
        
        Scene scene14 = new Scene();
        scene14.setMapSymbol("CP");
        scene14.setSceneName("Confluence Point");
        scene14.setDescription("");
        
        Scene scene15 = new Scene();
        scene15.setMapSymbol("AH");
        scene15.setSceneName("Ash Hollow");
        scene15.setDescription("");
        
        Scene scene16 = new Scene();
        scene16.setMapSymbol("CR");
        scene16.setSceneName("Chimney Rock");
        scene16.setDescription("");
        
        Scene scene17 = new Scene();
        scene17.setMapSymbol("SB");
        scene17.setSceneName("Scotts Bluff");
        scene17.setDescription("");
        
        Scene scene18 = new Scene();
        scene18.setMapSymbol("FL");
        scene18.setSceneName("Fort Laramie");
        scene18.setDescription("");
        
        Scene scene19 = new Scene();
        scene19.setMapSymbol("SR");
        scene19.setSceneName("Sweetwater River");
        scene19.setDescription("");
        
        Scene scene20 = new Scene();
        scene20.setMapSymbol("IR");
        scene20.setSceneName("Independence Rock");
        scene20.setDescription("");
        
        Scene scene21 = new Scene();
        scene21.setMapSymbol("FB");
        scene21.setSceneName("Fort Bridger");
        scene21.setDescription("");
        
        Scene scene22 = new Scene();
        scene22.setMapSymbol("EC");
        scene22.setSceneName("Echo Canyon");
        scene22.setDescription("");
        
        Scene scene23 = new Scene();
        scene23.setMapSymbol("GPR");
        scene23.setSceneName("Golden Pass Road");
        scene23.setDescription("");
        
        Scene scene24 = new Scene();
        scene24.setMapSymbol("EC");
        scene24.setSceneName("Emigration Canyon");
        scene24.setDescription("");
        
        Scene scene25 = new Scene();
        scene25.setMapSymbol("Z");
        scene25.setSceneName("Zion");
        scene25.setDescription("");
       
        
        return scenes;
    }

    

    private static void assignScenesToLocations() {
        Location[][] locations = map.getLocations();

       
    }
}