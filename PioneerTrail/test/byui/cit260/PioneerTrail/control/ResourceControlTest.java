/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.Player;
import byui.cit260.PioneerTrail.model.Resource;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MMG
 */
public class ResourceControlTest {
    
    public ResourceControlTest() {
    }

    /**
     * Test of energyProvided method, of class ResourceControl.
     */
    @Test
    public void testEnergyProvided() {
        System.out.println("energyProvided");
        Resource resource = new Resource();
        Player player = new Player();
        System.out.println("case 1");
        resource.setEnergyValue(20);
        resource.setResourceTotalEnergy(60);
        resource.setCount(3);
        player.setHealth(20);
        double expResult = 80;
        double result = ResourceControl.energyProvided(resource, player);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 2");
        resource.setEnergyValue(15);
        resource.setResourceTotalEnergy(75);
        resource.setCount(5);
        player.setHealth(10);
        expResult = 85;
        result = ResourceControl.energyProvided(resource, player);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("case 3");
        resource.setEnergyValue(50);
        resource.setResourceTotalEnergy(50);
        resource.setCount(1);
        player.setHealth(50);
        expResult = 100;
        result = ResourceControl.energyProvided(resource, player);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("case 4");
        resource.setEnergyValue(35);
        resource.setResourceTotalEnergy(70);
        resource.setCount(2);
        player.setHealth(18);
        expResult = 88;
        result = ResourceControl.energyProvided(resource, player);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("case 5");
        resource.setEnergyValue(5);
        resource.setResourceTotalEnergy(25);
        resource.setCount(5);
        player.setHealth(35);
        expResult = 60;
        result = ResourceControl.energyProvided(resource, player);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("case 6");
        resource.setEnergyValue(40);
        resource.setResourceTotalEnergy(80);
        resource.setCount(2);
        player.setHealth(5);
        expResult = 85;
        result = ResourceControl.energyProvided(resource, player);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("case 7");
        resource.setEnergyValue(1);
        resource.setResourceTotalEnergy(20);
        resource.setCount(20);
        player.setHealth(20);
        expResult = 40;
        result = ResourceControl.energyProvided(resource, player);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
         
    }
    
}
