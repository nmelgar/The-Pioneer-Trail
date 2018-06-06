/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.model;

import java.io.Serializable;


/**
 *
 * @author po
 */
public class ResourceItem implements Serializable{

        private double weight;
        
    /**
     *
     * @return
     */
    public double getWeight(){
    return weight;
    }
    
    public void ResourceItem(double weight) {
        this.weight = weight;
    }

    
}
