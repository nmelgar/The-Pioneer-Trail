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
        for (int i = 0; i < (locations.length); i++) {
            for (int z = 0; z < (locations[i].length); z++) {
                Location location = new Location();
                location.setColumn(z);
                location.setRow(i);
                locations[i][z] = location;
            }

        }

        return locations;
    }

    private static Scene[] createScenes() {
        System.out.println("Create Regular Scene");

        Scene[] scenes = new Scene[25];
        Scene scene1 = new Scene();
        scene1.setMapSymbol("NV");
        scene1.setNameScene("Nauvoo");
        scene1.setDescription("");
        
        Scene scene2 = new Scene();
        scene2.setMapSymbol("SC");
        scene2.setNameScene("Sugar Creek");
        scene2.setDescription("");
        
        Scene scene3 = new Scene();
        scene3.setMapSymbol("RP");
        scene3.setNameScene("Richardson's Point");
        scene3.setDescription("");
        
        Scene scene4 = new Scene();
        scene4.setMapSymbol("CRC");
        scene4.setNameScene("Chariton River Crossing");
        scene4.setDescription("");
        
        Scene scene5 = new Scene();
        scene5.setMapSymbol("LC");
        scene5.setNameScene("Locust Creek");
        scene5.setDescription("");
        
        Scene scene6 = new Scene();
        scene6.setMapSymbol("GG");
        scene6.setNameScene("Garden Grove");
        scene6.setDescription("");
        
        Scene scene7 = new Scene();
        scene7.setMapSymbol("NR");
        scene7.setNameScene("Nishnabotna River");
        scene7.setDescription("");
        
        Scene scene8 = new Scene();
        scene8.setMapSymbol("GE");
        scene8.setNameScene("Grand Encampment");
        scene8.setDescription("");
        
        Scene scene9 = new Scene();
        scene9.setMapSymbol("CB");
        scene9.setNameScene("Council Bluffs");
        scene9.setDescription("");
        
        Scene scene10 = new Scene();
        scene10.setMapSymbol("WQ");
        scene10.setNameScene("Winter Quarters");
        scene10.setDescription("");
        
        Scene scene11 = new Scene();
        scene11.setMapSymbol("ERC");
        scene11.setNameScene("Elkhorn River Crossing");
        scene11.setDescription("");
        
        Scene scene12 = new Scene();
        scene12.setMapSymbol("PR");
        scene12.setNameScene("Plate River");
        scene12.setDescription("");
        
        Scene scene13 = new Scene();
        scene13.setMapSymbol("FK");
        scene13.setNameScene("Fort Kearny");
        scene13.setDescription("");
        
        Scene scene14 = new Scene();
        scene14.setMapSymbol("CP");
        scene14.setNameScene("Confluence Point");
        scene14.setDescription("");
        
        Scene scene15 = new Scene();
        scene15.setMapSymbol("AH");
        scene15.setNameScene("Ash Hollow");
        scene15.setDescription("");
        
        Scene scene16 = new Scene();
        scene16.setMapSymbol("CR");
        scene16.setNameScene("Chimney Rock");
        scene16.setDescription("");
        
        Scene scene17 = new Scene();
        scene17.setMapSymbol("SB");
        scene17.setNameScene("Scotts Bluff");
        scene17.setDescription("");
        
        Scene scene18 = new Scene();
        scene18.setMapSymbol("FL");
        scene18.setNameScene("Fort Laramie");
        scene18.setDescription("");
        
        Scene scene19 = new Scene();
        scene19.setMapSymbol("SR");
        scene19.setNameScene("Sweetwater River");
        scene19.setDescription("");
        
        Scene scene20 = new Scene();
        scene20.setMapSymbol("IR");
        scene20.setNameScene("Independence Rock");
        scene20.setDescription("");
        
        Scene scene21 = new Scene();
        scene21.setMapSymbol("FB");
        scene21.setNameScene("Fort Bridger");
        scene21.setDescription("");
        
        Scene scene22 = new Scene();
        scene22.setMapSymbol("EC");
        scene22.setNameScene("Echo Canyon");
        scene22.setDescription("");
        
        Scene scene23 = new Scene();
        scene23.setMapSymbol("GPR");
        scene23.setNameScene("Golden Pass Road");
        scene23.setDescription("");
        
        Scene scene24 = new Scene();
        scene24.setMapSymbol("EC");
        scene24.setNameScene("Emigration Canyon");
        scene24.setDescription("");
        
        Scene scene25 = new Scene();
        scene25.setMapSymbol("Z");
        scene25.setNameScene("Zion");
        scene25.setDescription("");
       
        
        return scenes;
    }

    

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

       
        locations[0][0].setScene(scenes[TypeOfScene.scene1.ordinal()]);
        locations[0][1].setScene(scenes[TypeOfScene.scene2.ordinal()]);
        locations[0][2].setScene(scenes[TypeOfScene.scene3.ordinal()]);
        locations[0][3].setScene(scenes[TypeOfScene.scene4.ordinal()]);
        locations[0][4].setScene(scenes[TypeOfScene.scene5.ordinal()]);
        locations[1][0].setScene(scenes[TypeOfScene.scene6.ordinal()]);
        locations[1][1].setScene(scenes[TypeOfScene.scene7.ordinal()]);
        locations[1][2].setScene(scenes[TypeOfScene.scene8.ordinal()]);
        locations[1][3].setScene(scenes[TypeOfScene.scene9.ordinal()]);
        locations[1][4].setScene(scenes[TypeOfScene.scene10.ordinal()]);
        locations[2][0].setScene(scenes[TypeOfScene.scene11.ordinal()]);
        locations[2][1].setScene(scenes[TypeOfScene.scene12.ordinal()]);
        locations[2][2].setScene(scenes[TypeOfScene.scene13.ordinal()]);
        locations[2][3].setScene(scenes[TypeOfScene.scene14.ordinal()]);
        locations[2][4].setScene(scenes[TypeOfScene.scene15.ordinal()]);
        locations[3][0].setScene(scenes[TypeOfScene.scene16.ordinal()]);
        locations[3][1].setScene(scenes[TypeOfScene.scene17.ordinal()]);
        locations[3][2].setScene(scenes[TypeOfScene.scene18.ordinal()]);
        locations[3][3].setScene(scenes[TypeOfScene.scene19.ordinal()]);
        locations[3][4].setScene(scenes[TypeOfScene.scene20.ordinal()]);
        locations[4][0].setScene(scenes[TypeOfScene.scene21.ordinal()]);
        locations[4][1].setScene(scenes[TypeOfScene.scene22.ordinal()]);
        locations[4][2].setScene(scenes[TypeOfScene.scene23.ordinal()]);
        locations[4][3].setScene(scenes[TypeOfScene.scene24.ordinal()]);
        locations[4][4].setScene(scenes[TypeOfScene.scene25.ordinal()]);
    }
}