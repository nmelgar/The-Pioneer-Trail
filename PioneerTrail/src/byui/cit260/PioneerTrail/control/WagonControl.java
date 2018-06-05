/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.Resource;
import byui.cit260.PioneerTrail.model.Wagon;

/**
 *
 * @author MMG
 */
public class WagonControl {
       
    public static double newWeight(Wagon wagon, Resource resource) {
        
        
        /**if (totalResourceWeight > 350 || < 0) {
         return -1;   
    }
        double totalResourceWeight = resourceWeight * resourceCount;
        double newTotalWeight = totalResouceWeight + WAGON_WEIGHT;
    
        return newWeight;
        */

       double totalResourceWeight = resource.getWeight() * resource.getCount();
       if (totalResourceWeight > 350 || totalResourceWeight < 0) {
        return -1;   
    }
       // recourceCount is for count the number of a specific resource
       // not for the total number of resources at wagon
       double newTotalWeight = totalResourceWeight + wagon.getWeight() ;
    
    return newTotalWeight;
    
    
    
    
    }
    
}
