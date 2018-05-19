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
 *Wagner Filgueiras
 */
public class Location implements Serializable {
    
    private String scene;
    private String visited;
    private String positionName;
    private Double positionReference;

    public Location() {
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

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Double getPositionReference() {
        return positionReference;
    }

    public void setPositionReference(Double positionReference) {
        this.positionReference = positionReference;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.scene);
        hash = 37 * hash + Objects.hashCode(this.visited);
        hash = 37 * hash + Objects.hashCode(this.positionName);
        hash = 37 * hash + Objects.hashCode(this.positionReference);
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
        if (!Objects.equals(this.positionName, other.positionName)) {
            return false;
        }
        if (!Objects.equals(this.positionReference, other.positionReference)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "scene=" + scene + ", visited=" + visited + ", positionName=" + positionName + ", positionReference=" + positionReference + '}';
    }
        
    
}
