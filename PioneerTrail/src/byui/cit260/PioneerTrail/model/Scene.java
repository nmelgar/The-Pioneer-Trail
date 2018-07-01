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
 * @author WagnerFilgueiras
 */
public class Scene implements Serializable{
    
    private String nameScene;
    private String sign;
    private String actor;
    private String question;
    private String description;
    private String typeOfScene;
    private Double time;
    private String mapSymbol;
    private Location location;

    public Scene() {
    }
    
     public Location getLocation(){
        return location; 
     }
    public String getMapSymbol(){
        return mapSymbol;
    }
    
    public void setMapSymbol(String mapSymbol){
        this.mapSymbol = mapSymbol;
    }
    
    public String getNameScene() {
        return nameScene;
    }

    public void setNameScene(String nameScene) {
        this.nameScene = nameScene;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeOfScene() {
        return typeOfScene;
    }

    public void setTypeOfScene(String typeOfScene) {
        this.typeOfScene = typeOfScene;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nameScene);
        hash = 79 * hash + Objects.hashCode(this.sign);
        hash = 79 * hash + Objects.hashCode(this.actor);
        hash = 79 * hash + Objects.hashCode(this.question);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.typeOfScene);
        hash = 79 * hash + Objects.hashCode(this.time);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.nameScene, other.nameScene)) {
            return false;
        }
        if (!Objects.equals(this.sign, other.sign)) {
            return false;
        }
        if (!Objects.equals(this.actor, other.actor)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.typeOfScene, other.typeOfScene)) {
            return false;
        }
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "nameScene=" + nameScene + ", sign=" + sign + ", actor=" + actor + ", question=" + question + ", description=" + description + ", typeOfSene=" + typeOfScene + ", time=" + time + '}';
    }
    
    
    
    
    
}
