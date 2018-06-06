/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.ResourceItem;
import byui.cit260.PioneerTrail.model.Toolbox;

/**
 *
 * @author po
 */
public class ToolboxControl {


    
    public static int CalcMaxWeight(ResourceItem resourceItem, Toolbox toolbox) {
        int height = 70;
        int leight = 80;
        int breadth = 40;
        
                
        int Toolbox = leight * breadth * height ;
        if (resourceItem > 350 || resourceItem < 0) {
            return -1;
        }
        
        int maxWeight;
        maxWeight = resourceItem + toolbox;
        
        return maxWeight;
        
    }

    
}
