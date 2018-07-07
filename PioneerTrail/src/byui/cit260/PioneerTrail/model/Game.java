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
 */
public class Game implements Serializable {
    
    private Player player;
    private Map map;
    private String resources;
    private String wagon;
    private String attribute;

    public Game(Player player, Map map, String resources, String wagon, String attribute) {
        this.player = player;
        this.map = map;
        this.resources = resources;
        this.wagon = wagon;
        this.attribute = attribute;
    }

    public Game() {
        
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getWagon() {
        return wagon;
    }

    public void setWagon(String wagon) {
        this.wagon = wagon;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.player);
        hash = 13 * hash + Objects.hashCode(this.map);
        hash = 13 * hash + Objects.hashCode(this.resources);
        hash = 13 * hash + Objects.hashCode(this.wagon);
        hash = 13 * hash + Objects.hashCode(this.attribute);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.resources, other.resources)) {
            return false;
        }
        if (!Objects.equals(this.wagon, other.wagon)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", map=" + map + ", resources=" + resources + ", wagon=" + wagon + ", attribute=" + attribute + '}';
    }

    
    
    
}