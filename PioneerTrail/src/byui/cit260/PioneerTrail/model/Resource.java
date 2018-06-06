/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Pobee
 */
public class Resource implements Serializable{
    
    private String name;
    private int energyValue;
    private int weight;
    private String type;
    private int count;
    private double resourceTotalEnergy;

    
    
    
    /**
     * Get the value of count
     *
     * @return the value of count
     */
    public int getCount() {
        return count;
    }

    /**
     * Set the value of count
     *
     * @param count new value of count
     */
    public void setCount(int count) {
        this.count = count;
    }

    public Resource() {
    }

    
    
    public double getResourceTotalEnergy() {
        return resourceTotalEnergy;
    }

    public void setResourceTotalEnergy(double resourceTotalEnergy) {
        this.resourceTotalEnergy = resourceTotalEnergy;
    }

    
    

    public Resource(String name, int energyValue, 
            int weight, String type, double resourceTotalEnergy) {
        
        this.name = name;
        this.energyValue = energyValue;
        this.weight = weight;
        this.type = type;
        this.resourceTotalEnergy = resourceTotalEnergy;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergyValue() {
        return energyValue;
    }

    public void setEnergyValue(int energyValue) {
        this.energyValue = energyValue;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.energyValue);
        hash = 89 * hash + Objects.hashCode(this.weight);
        hash = 89 * hash + Objects.hashCode(this.type);
       
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Resource other = (Resource) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.energyValue, other.energyValue)) {
            return false;
        }
        if (!Objects.equals(this.weight, other.weight)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resources{" + "name=" + name + ", energyValue=" + energyValue + ", weight=" + weight + ", type=" + type + '}';
    }

    public void getEnergyValue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getEnergyValue(double i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

                
    
    
}
