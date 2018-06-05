/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.model;

import java.io.Serializable;

/**
 *
 * @author MMG
 */
public class Wagon implements Serializable {
    
        private double weight;
        private double totalResourceWeight;

    /**
     * Get the value of weight
     *
     * @return the value of weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Set the value of weight
     *
     * @param weight new value of weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

        

    /**
     * Get the value of totalResourceWeight
     *
     * @return the value of totalResourceWeight
     */
    public double getTotalResourceWeight() {
        return totalResourceWeight;
    }

    /**
     * Set the value of totalResourceWeight
     *
     * @param totalResourceWeight new value of totalResourceWeight
     */
    public void setTotalResourceWeight(double totalResourceWeight) {
        this.totalResourceWeight = totalResourceWeight;
    }

}
