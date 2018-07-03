/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;


import byui.cit260.PioneerTrail.model.MakesDamage;
import byui.cit260.PioneerTrail.model.Player;
import byui.cit260.PioneerTrail.model.Resource;
import java.util.Arrays;

/**
 *
 * @author MMG
 */
public class PlayerControl {
   public static MakesDamage[] makesDamage(){
        MakesDamage[] harmful = new MakesDamage[5];
                     
        MakesDamage snow = new MakesDamage();
        snow.setName("snow");
        snow.setDamageValue(10);
        snow.setType("Weather Conditions");
        
        MakesDamage illness = new MakesDamage();
        illness.setName("illness");
        illness.setDamageValue(15);
        illness.setType("Body related");
        
        MakesDamage fatigue = new MakesDamage();
        fatigue.setName("Fatigue");
        fatigue.setDamageValue(10);
        fatigue.setType("Body related");
        
        MakesDamage hardrain = new MakesDamage();
        hardrain.setName("Hard rain");
        hardrain.setDamageValue(1);
        hardrain.setType("Weather Conditions");
        
        MakesDamage hot = new MakesDamage();
        hot.setName("Hot Temperature");
        hot.setDamageValue(1);
        hot.setType("Weather Conditions");
        
       System.out.println("\n" + Arrays.toString(harmful));
        return harmful;  
   }
   
   /**
    * 
    * Find the sum of a list
total (list): number
BEGIN
total = 0
FOR index = 0 TO list.length -1
 total = total + list[index]
ENDFOR
RETURN total
END
    */
    
}
