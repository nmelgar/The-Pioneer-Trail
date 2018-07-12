/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.exceptions.MapControlException;
import byui.cit260.PioneerTrail.model.Location;
import byui.cit260.PioneerTrail.model.Map;
import byui.cit260.PioneerTrail.model.Resource;
import byui.cit260.PioneerTrail.model.Scene;
import java.util.ArrayList;

/**
 *
 * @author MMG
 */
public class MapControl {
    
 public static Map createMap(int noOfRows, int noOfColumns, ArrayList<Resource> items) throws MapControlException {

        if (noOfRows < 0 || noOfColumns < 0) {
            throw new MapControlException("Columns || Rows can't null");
        }
        if (items == null || items.size() < 1) {
            throw new MapControlException("Items can't be null");
        }
        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);
 
       
        Location[][] locations = createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);
        
        Scene[] scenes = createScenes();

        assignScenesToLocations(scenes, locations);

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
                location.setVisited(false);
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
        scenes[0] = scene1;
        
        Scene scene2 = new Scene();
        scene2.setMapSymbol("SC");
        scene2.setSceneName("Sugar Creek");
        scene2.setDescription("");
        scenes[1] = scene2;
        
        Scene scene3 = new Scene();
        scene3.setMapSymbol("RP");
        scene3.setSceneName("Richardson's Point");
        scene3.setDescription("");
        scenes[2] = scene3;
        
        Scene scene4 = new Scene();
        scene4.setMapSymbol("CR");
        scene4.setSceneName("Chariton River Crossing");
        scene4.setDescription("");
        scenes[3] = scene4;
        
        Scene scene5 = new Scene();
        scene5.setMapSymbol("LC");
        scene5.setSceneName("Locust Creek");
        scene5.setDescription("");
        scenes[4] = scene5;
        
        Scene scene6 = new Scene();
        scene6.setMapSymbol("GG");
        scene6.setSceneName("Garden Grove");
        scene6.setDescription("");
        scenes[5] = scene6;
        
        Scene scene7 = new Scene();
        scene7.setMapSymbol("NR");
        scene7.setSceneName("Nishnabotna River");
        scene7.setDescription("");
        scenes[6] = scene7;
        
        Scene scene8 = new Scene();
        scene8.setMapSymbol("GE");
        scene8.setSceneName("Grand Encampment");
        scene8.setDescription("");
        scenes[7] = scene8;
        
        Scene scene9 = new Scene();
        scene9.setMapSymbol("CB");
        scene9.setSceneName("Council Bluffs");
        scene9.setDescription("");
        scenes[8] = scene9;
        
        Scene scene10 = new Scene();
        scene10.setMapSymbol("WQ");
        scene10.setSceneName("Winter Quarters");
        scene10.setDescription("");
        scenes[9] = scene10;
        
        Scene scene11 = new Scene();
        scene11.setMapSymbol("ER");
        scene11.setSceneName("Elkhorn River Crossing");
        scene11.setDescription("");
        scenes[10] = scene11;
        
        Scene scene12 = new Scene();
        scene12.setMapSymbol("PR");
        scene12.setSceneName("Plate River");
        scene12.setDescription("");
        scenes[11] = scene2;
        
        Scene scene13 = new Scene();
        scene13.setMapSymbol("FK");
        scene13.setSceneName("Fort Kearny");
        scene13.setDescription("");
        scenes[12] = scene13;
        
        Scene scene14 = new Scene();
        scene14.setMapSymbol("CP");
        scene14.setSceneName("Confluence Point");
        scene14.setDescription("");
        scenes[13] = scene14;
        
        Scene scene15 = new Scene();
        scene15.setMapSymbol("AH");
        scene15.setSceneName("Ash Hollow");
        scene15.setDescription("");
        scenes[14] = scene15;
        
        Scene scene16 = new Scene();
        scene16.setMapSymbol("CR");
        scene16.setSceneName("Chimney Rock");
        scene16.setDescription("");
        scenes[15] = scene16;
        
        Scene scene17 = new Scene();
        scene17.setMapSymbol("SB");
        scene17.setSceneName("Scotts Bluff");
        scene17.setDescription("");
        scenes[16] = scene17;
        
        Scene scene18 = new Scene();
        scene18.setMapSymbol("FL");
        scene18.setSceneName("Fort Laramie");
        scene18.setDescription("");
        scenes[17] = scene18;
        
        Scene scene19 = new Scene();
        scene19.setMapSymbol("SR");
        scene19.setSceneName("Sweetwater River");
        scene19.setDescription("");
        scenes[18] = scene19;
        
        Scene scene20 = new Scene();
        scene20.setMapSymbol("IR");
        scene20.setSceneName("Independence Rock");
        scene20.setDescription("");
        scenes[19] = scene20;
        
        Scene scene21 = new Scene();
        scene21.setMapSymbol("FB");
        scene21.setSceneName("Fort Bridger");
        scene21.setDescription("");
        scenes[20] = scene21;
        
        Scene scene22 = new Scene();
        scene22.setMapSymbol("EC");
        scene22.setSceneName("Echo Canyon");
        scene22.setDescription("");
        scenes[21] = scene22;
        
        Scene scene23 = new Scene();
        scene23.setMapSymbol("GP");
        scene23.setSceneName("Golden Pass Road");
        scene23.setDescription("");
        scenes[22] = scene23;
        
        Scene scene24 = new Scene();
        scene24.setMapSymbol("EC");
        scene24.setSceneName("Emigration Canyon");
        scene24.setDescription("");
        scenes[23] = scene24;
        
        Scene scene25 = new Scene();
        scene25.setMapSymbol("ZI");
        scene25.setSceneName("Zion");
        scene25.setDescription("");
        scenes[24] = scene25;
        
        return scenes;
    }

    

    private static void assignScenesToLocations(Scene[] scenes, Location[][] locations) {
        locations[0][0].setScene(scenes[0]);
        locations[0][1].setScene(scenes[1]);
        locations[0][2].setScene(scenes[2]);
        locations[0][3].setScene(scenes[3]);
        locations[0][4].setScene(scenes[4]);
        locations[1][0].setScene(scenes[5]);
        locations[1][1].setScene(scenes[6]);
        locations[1][2].setScene(scenes[7]);
        locations[1][3].setScene(scenes[8]);
        locations[1][4].setScene(scenes[9]);
        locations[2][0].setScene(scenes[10]);
        locations[2][1].setScene(scenes[11]);
        locations[2][2].setScene(scenes[12]);
        locations[2][3].setScene(scenes[13]);
        locations[2][4].setScene(scenes[14]);
        locations[3][0].setScene(scenes[15]);
        locations[3][1].setScene(scenes[16]);
        locations[3][2].setScene(scenes[17]);
        locations[3][3].setScene(scenes[18]);
        locations[3][4].setScene(scenes[19]);
        locations[4][0].setScene(scenes[20]);
        locations[4][1].setScene(scenes[21]);
        locations[4][2].setScene(scenes[22]);
        locations[4][3].setScene(scenes[23]);
        locations[4][4].setScene(scenes[24]);

       
    }
    
}