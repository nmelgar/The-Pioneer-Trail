/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author MMG
 *Wagner Filgueiras
 */
public class Location implements Serializable{
    
    private Scene scene;
    private Boolean visited;
    private int row;
    private int column;
    
    /**
    private Scene scene;
    **/
    public Location() {
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.scene);
        hash = 79 * hash + Objects.hashCode(this.visited);
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "scene=" + scene + ", visited=" + visited + ", row=" + row + ", column=" + column +  '}';
    }
    
    
/**    
    
    public Location(String scene, String visited, String position) {
        this.scene = scene;
        this.visited = visited;
        this.position = position;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.scene);
        hash = 43 * hash + Objects.hashCode(this.visited);
        hash = 43 * hash + Objects.hashCode(this.position);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "scene=" + scene + ", visited=" + visited + ", position=" + position + '}';
    }
    
   
    

    
    
  */  
}
