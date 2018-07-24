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
        scene1.setDescription("Nauvoo 'City Beautiful' (1839-46)"
                + "\n Search these commandments, for they are "
                + "\n true and faithful, and the prophecies and promises "
                + "\n which are in them shall all be..."
                + "\nA) fulfilled."
                + "\nB) forbidden"
                + "\nC) forgotten");
        scene1.setQuestion("Search these commandments, for they are "
                + "\n true and faithful, and the prophecies and promises "
                + "\n which are in them shall all be..."
                + "\nA) fulfilled."
                + "\nB) forbidden"
                + "\nC) forgotten");
        scenes[0] = scene1;
        
        Scene scene2 = new Scene();
        scene2.setMapSymbol("SC");
        scene2.setSceneName("Sugar Creek");
        scene2.setDescription("Sugar Creek, 7 miles from Nauvoo"
                + "\n And he shall plant in the hearts of "
                + "\n the children the promises made to the fathers, "
                + "\n and the hearts of the children shall turn to "
                + "\n their..."
                + "\nA) brothers."
                + "\nB) fathers"
                + "\nC) uncles");
        scene2.setQuestion("And he shall plant in the hearts of "
                + "\n the children the promises made to the fathers, "
                + "\n and the hearts of the children shall turn to "
                + "\n their..."
                + "\nA) brothers."
                + "\nB) fathers"
                + "\nC) uncles");
        scenes[1] = scene2;
        
        
        Scene scene3 = new Scene();
        scene3.setMapSymbol("RP");
        scene3.setSceneName("Richardson's Point");
        scene3.setDescription("Richardson's Point, 35 miles from Nauvoo" 
                + "\n Suffering through 10 days of downpour, the Camp"
                + "\n of Israel stalled here while awaiting improved weather.");
        scene3.setQuestion("");
        scenes[2] = scene3;
        
        Scene scene4 = new Scene();
        scene4.setMapSymbol("CR");
        scene4.setSceneName("Chariton River Crossing");
        scene4.setDescription("Chariton River Crossing, 80 miles from Nauvoo"
                + "\n The main body of the pioneers chose to remain at Chariton"
                + "\n to wait out some of the worst weather of the Iowa crossing");
        scene4.setQuestion("");
        scenes[3] = scene4;
        
        Scene scene5 = new Scene();
        scene5.setMapSymbol("LC");
        scene5.setSceneName("Locust Creek");
        scene5.setDescription("Locust Creek, 103 miles from Nauvoo"
                + "\n At or near this campsite, William Clayton "
                + "\n reportedly penned the words to the song “All "
                + "\n Is Well” after receiving word that his wife Diantha, "
                + "\n still in Nauvoo, had given birth to a healthy baby boy.");
        scene5.setQuestion("");
        scenes[4] = scene5;
        
        Scene scene6 = new Scene();
        scene6.setMapSymbol("GG");
        scene6.setSceneName("Garden Grove");
        scene6.setDescription("Garden Grove, 128 miles from Nauvoo"
                + "\n Church leaders decided to create a substantial "
                + "\n camp at this site, a sort of temporary settlement "
                + "\n to serve the thousands of weary and destitute pioneers "
                + "\n who would yet come this way. ");
        scene6.setQuestion("");
        scenes[5] = scene6;
        
        Scene scene7 = new Scene();
        scene7.setMapSymbol("NR");
        scene7.setSceneName("Nishnabotna River");
        scene7.setDescription("Nishnabotna River, 232 miles from Nauvo"
                + "\n The crossing of the Nishnabotna marks the meeting "
                + "\n of two refugee peoples, the Latter-day Saints and "
                + "\n the Potawatomi Indians.");
        scene7.setQuestion("");
        scenes[6] = scene7;
        
        Scene scene8 = new Scene();
        scene8.setMapSymbol("GE");
        scene8.setSceneName("Grand Encampment");
        scene8.setDescription("Grand Encampment, 225 miles from Nauvoo"
                + "\n This broad, open area became the stopping place for"
                + "\n pioneer companies as they approached the Missouri"
                + "\n River. At this site, the current location of the "
                + "\n Iowa School for the Deaf, more than 500 volunteers "
                + "\n of the Mormon Battalion officially mustered into the"
                + "\n U.S. Army for service in the war with Mexico.");
        scene8.setQuestion("");
        scenes[7] = scene8;
        
        Scene scene9 = new Scene();
        scene9.setMapSymbol("CB");
        scene9.setSceneName("Council Bluffs");
        scene9.setDescription("Council Bluffs, 265 miles from Nauvoo "
                + "\n Council Bluffs was a major outfitting point for "
                + "\n Latter-day Saints and countless others heading west "
                + "\n during most of the overland emigration period. Located "
                + "\n across the Missouri River from Winter Quarters, Council "
                + "\n Bluffs was one of the most significant Latter-day "
                + "\n Saint settlements during the late 1840s and early 1850s.");
        scene9.setQuestion("");
        scenes[8] = scene9;
        
        Scene scene10 = new Scene();
        scene10.setMapSymbol("WQ");
        scene10.setSceneName("Winter Quarters");
        scene10.setDescription("Winter Quarters, 266 miles from Nauvoo"
                + "\n An instant city on the plains, Winter Quarters served"
                + "\n as Church headquarters for less than a year, until "
                + "\n the leadership moved west in 1847");
        scene10.setQuestion("");
        scenes[9] = scene10;
        
        Scene scene11 = new Scene();
        scene11.setMapSymbol("ER");
        scene11.setSceneName("Elkhorn River Crossing");
        scene11.setDescription("Elkhorn River Crossing, 293 miles from Nauvoo"
                + "\n This was one of the major river crossings faced "
                + "\n by westbound emigrants coming from Winter Quarters.");
        scene11.setQuestion("");
        scenes[10] = scene11;
        
        Scene scene12 = new Scene();
        scene12.setMapSymbol("PR");
        scene12.setSceneName("Platte River");
        scene12.setDescription("Platte River, 305 miles from Nauvoo"
                + "\n All emigrants who left the Missouri River "
                + "\n traveled along the Platte River for hundreds of miles");
        scene12.setQuestion("");
        scenes[11] = scene2;
        
        Scene scene13 = new Scene();
        scene13.setMapSymbol("FK");
        scene13.setSceneName("Fort Kearny");
        scene13.setDescription("Fort Kearny, 469 miles from Nauvoo"
                + "\n Established in June 1848 near Grand Island, "
                + "\n Fort Kearny was the second fort named after Stephen "
                + "\n Watts Kearny, the U.S. general of Mexican War fame. "
                + "\n The first Fort Kearny, established in May 1846, was "
                + "\n located on the Missouri River, some 50 miles south of"
                + "\n Council Bluffs. It was abandoned in May 1848.");
        scene13.setQuestion("");
        scenes[12] = scene13;
        
        Scene scene14 = new Scene();
        scene14.setMapSymbol("CP");
        scene14.setSceneName("Confluence Point");
        scene14.setDescription("Confluence Point, 563 miles from Nauvoo"
                + "\n On May 11, 1847, at a location three-fourths of a mile"
                + "\n north of the confluence of the North and South Platte "
                + "\n Rivers, members of Brigham Young’s vanguard company "
                + "\n attached an odometer (or roadometer) to the wheel of "
                + "\n a wagon owned by Heber C. Kimball and driven by Philo "
                + "\n Johnson. ");
        scene14.setQuestion("");
        scenes[13] = scene14;
        
        Scene scene15 = new Scene();
        scene15.setMapSymbol("AH");
        scene15.setSceneName("Ash Hollow");
        scene15.setDescription("Ash Hallow, 646 miles from Nauvoo"
                + "\n Ash Hollow, its original beauty ruined by thousands"
                + "\n of passing emigrants, was noted by countless diarists.");
        scene15.setQuestion("");
        scenes[14] = scene15;
        
        Scene scene16 = new Scene();
        scene16.setMapSymbol("CR");
        scene16.setSceneName("Chimney Rock");
        scene16.setDescription("Chimney Rock 718 miles from Nauvoo"
                + "\n The Latter-day Saints, like hundreds of thousands "
                + "\n of other Americans and emigrants in the mid- to late "
                + "\n 1800s, crossed the Great American Plains and the Rocky"
                + "\n Mountains in their quest for a better life in the West.");
        scene16.setQuestion("");
        scenes[15] = scene16;
        
        Scene scene17 = new Scene();
        scene17.setMapSymbol("SB");
        scene17.setSceneName("Scotts Bluff");
        scene17.setDescription("Scotts Bluff, 738 miles from Nauvoo"
                + "\n Scotts Bluff is named for Hiram Scott, a Rocky "
                + "\n Mountain Fur Company trapper abandoned here by "
                + "\n his companions when he became ill. ");
        scene17.setQuestion("");
        scenes[16] = scene17;
        
        Scene scene18 = new Scene();
        scene18.setMapSymbol("FL");
        scene18.setSceneName("Fort Laramie");
        scene18.setDescription("Fort Laramie, 788 miles from Nauvoo"
                + "\n The site was originally known as Fort William, then "
                + "\n Fort John. The original site was abandoned and Fort "
                + "\n Laramie constructed nearby, taking its name from a "
                + "\n French trapper, Jacques LaRamie.");
        scene18.setQuestion("");
        scenes[17] = scene18;
        
        Scene scene19 = new Scene();
        scene19.setMapSymbol("SR");
        scene19.setSceneName("Sweetwater River");
        scene19.setDescription("Sweetwater River, 293 miles from Nauvoo"
                + "\n It was a high, dry, and difficult 50-mile overland "
                + "\n journey from the North Platte to the Sweetwater. "
                + "\n Immigrants traveling to Salt Lake followed the "
                + "\n Sweetwater for some distance toward South Pass.");
        scene19.setQuestion("");
        scenes[18] = scene19;
        
        Scene scene20 = new Scene();
        scene20.setMapSymbol("IR");
        scene20.setSceneName("Independence Rock");
        scene20.setDescription("Independence Rock, 965 miles from Nauvoo"
                + "\n This site is noted by most overland journalists due to "
                + "\n the countless names carved on it. Its use as a name registry "
                + "\n was already well established by the time Brigham Young and "
                + "\n the vanguard company passed it in June 1847.");
        scene20.setQuestion("");
        scenes[19] = scene20;
        
        Scene scene21 = new Scene();
        scene21.setMapSymbol("FB");
        scene21.setSceneName("Fort Bridger");
        scene21.setDescription("Fort Brigder, 1,183 miles from Nauvoo"
                + "\n At this famous fort, the Oregon Trail swung north from "
                + "\n Fort Bridger, while the Mormon Trail continued another "
                + "\n 100 miles west to the Salt Lake Valley. ");
        scene21.setQuestion("");
        scenes[20] = scene21;
        
        Scene scene22 = new Scene();
        scene22.setMapSymbol("EC");
        scene22.setSceneName("Echo Canyon");
        scene22.setDescription("Echo Canyon, 1,246 miles from Nauvoo"
                + "\n This was one of the last canyons the immigrants descended "
                + "\n through before entering the Salt Lake Valley. Its high "
                + "\n rock walls and narrow profile made it a veritable—and "
                + "\n frequently noted—echo chamber.");
        scene22.setQuestion("");
        scenes[21] = scene22;
        
        Scene scene23 = new Scene();
        scene23.setMapSymbol("GP");
        scene23.setSceneName("Golden Pass Road");
        scene23.setDescription("Golden Pass Road, 1,281 miles from Nauvoo"
                + "\n In 1848 Parley P. Pratt unsuccessfully petitioned Salt "
                + "\n Lake City for $800 to construct a road through Big Canyon "
                + "\n Creek in the Wasatch Mountains, just south of Emigration "
                + "\n Canyon. ");
        scene23.setQuestion("");
        scenes[22] = scene23;
        
        Scene scene24 = new Scene();
        scene24.setMapSymbol("EC");
        scene24.setSceneName("Emigration Canyon");
        scene24.setDescription("Emigration Canyon, 1283 miles from Nauvoo"
                + "\n Nearly one year to the day before the Latter-day Saints "
                + "\n entered this canyon, the final geographic obstacle between "
                + "\n Big Mountain and the Salt Lake Valley, members of the "
                + "\n Reed-Donner wagon train heading to California blazed "
                + "\n its length and carved its first rough road.");
        scene24.setQuestion("");
        scenes[23] = scene24;
        
        Scene scene25 = new Scene();
        scene25.setMapSymbol("ZI");
        scene25.setSceneName("Zion");
        scene25.setDescription("SLC, UT, ZION, 1297 miles from Nauvoo"
                + "\n Arrival in the Salt Lake Valley had a special meaning"
                + "\n to each emigrant. For many it signified the end of their"
                + "\n arduous journey. They had endured to the end of the Mormon"
                + "\n Trail, and their participation in that memorable "
                + "\n trek gave metaphor and meaning to life itself. ");
        scene25.setQuestion("");
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