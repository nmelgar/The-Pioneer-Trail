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
    
    
    private int lenght;
    private int bredth;
    private int height;

    public int getLenght() {
        return lenght;
    }

    public int getBredth() {
        return bredth;
    }

    public int getHeight() {
        return height;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setBredth(int bredth) {
        this.bredth = bredth;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
}
