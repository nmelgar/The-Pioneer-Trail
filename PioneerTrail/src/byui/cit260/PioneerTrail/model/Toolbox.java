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
public class Toolbox implements Serializable{
    
    
    private double lenght;
    private double breadth;
    private double height;
    private double volume;

    public Toolbox() {
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.lenght) ^ (Double.doubleToLongBits(this.lenght) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.breadth) ^ (Double.doubleToLongBits(this.breadth) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.volume) ^ (Double.doubleToLongBits(this.volume) >>> 32));
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
        final Toolbox other = (Toolbox) obj;
        if (Double.doubleToLongBits(this.lenght) != Double.doubleToLongBits(other.lenght)) {
            return false;
        }
        if (Double.doubleToLongBits(this.breadth) != Double.doubleToLongBits(other.breadth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.volume) != Double.doubleToLongBits(other.volume)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Toolbox{" + "lenght=" + lenght + ", breadth=" + breadth + ", height=" + height + ", volume=" + volume + '}';
    }

    
    
    
    
}
