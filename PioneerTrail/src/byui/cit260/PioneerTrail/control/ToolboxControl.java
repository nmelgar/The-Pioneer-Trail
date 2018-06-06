/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.Resource;
import byui.cit260.PioneerTrail.model.Toolbox;

/**
 *
 * @author po
 */
public class ToolboxControl {


    
    public static int CalcMaxWeight(Resource resource, Toolbox toolbox) {
      /*  int height = 70;
        int lenght = 80;
        int bredth = 40;
        */
                
        int toolboxVolume = toolbox.getLenght() * toolbox.getBredth() * toolbox.getHeight();
        
        if (toolboxVolume > 350 || toolboxVolume < 0) {
            return -1;
        }
        
        int maxWeight = resource.getWeight() + toolboxVolume;
        
        return maxWeight;
        
    }

    
}
