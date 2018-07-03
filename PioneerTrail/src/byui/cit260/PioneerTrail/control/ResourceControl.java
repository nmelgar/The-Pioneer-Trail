/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.Resource;
import byui.cit260.PioneerTrail.model.Player;



/**
 * It provides the amount of energy given through certain resource
 * to player's total health. Considering the EnergyValue of the resource
 * and the number of resources with that energy value.
 * @author Nefi Melgar
 */
public class ResourceControl {
    
    public static double energyProvided(Resource resource, Player player){          
    
        
       double resourceTotalEnergy = resource.getEnergyValue() * resource.getCount();
       if (resourceTotalEnergy > 100 || resourceTotalEnergy < 0) {
        return -1;   
    }
       // recourceCount is for count the number of a specific resource
       // not for the total number of resources at wagon
       double totalEnergy = resourceTotalEnergy + player.getHealth() ;
    
    return totalEnergy;    
    }
    
    /**
     * Find the sum of a list
total (list): number
BEGIN
total = 0
FOR index = 0 TO list.length -1
 total = total + list[index]
ENDFOR
RETURN total
END 
     * @return 
     */
    
    
    
}
