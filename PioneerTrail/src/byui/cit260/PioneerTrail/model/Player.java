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
 * @author MMG
 */
public class Player implements Serializable {
    
    //class instance variables
    private String gender;
    private String name;
    private double age;
    private float health; 

    //constructor function
    public Player() {
    }
    
    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.gender);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.age) ^ (Double.doubleToLongBits(this.age) >>> 32));
        hash = 89 * hash + Float.floatToIntBits(this.health);
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.age) != Double.doubleToLongBits(other.age)) {
            return false;
        }
        if (Float.floatToIntBits(this.health) != Float.floatToIntBits(other.health)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "gender=" + gender + ", name=" + name + ", age=" + age + ", health=" + health + '}';
    }
    
    
    
    
    
    
}
