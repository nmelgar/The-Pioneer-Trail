/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.Resource;
import byui.cit260.PioneerTrail.model.Wagon;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MMG
 */
public class WagonControlTest {
    
    public WagonControlTest() {
    }

    /**
     * Test of newWeight method, of class WagonControl.
     */
    @Test
    public void testNewWeight() {
        System.out.println("newWeight");
        Wagon wagon = new Wagon();
        Resource resource = new Resource();
        System.out.println("case 1");
        wagon.setWeight(150);
        wagon.setTotalResourceWeight(300);
        resource.setWeight(150);
        resource.setCount(2);
        double expResult = 450.0;
        double result = WagonControl.newWeight(wagon, resource);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
     
        
        System.out.println("case 2");
        wagon.setWeight(150);
        wagon.setTotalResourceWeight(150);
        resource.setWeight(50);
        resource.setCount(3);
        expResult = 300.0;
        result = WagonControl.newWeight(wagon, resource);
        System.out.println("Results = " + result);            
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 3");
        wagon.setWeight(150);
        wagon.setTotalResourceWeight(100);
        resource.setWeight(20);
        resource.setCount(5);
        expResult = 250.0;
        result = WagonControl.newWeight(wagon, resource);
        System.out.println("Results = " + result);            
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 4");
        wagon.setWeight(150);
        wagon.setTotalResourceWeight(50);
        resource.setWeight(10);
        resource.setCount(5);
        expResult = 200.0;
        result = WagonControl.newWeight(wagon, resource);
        System.out.println("Results = " + result);            
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 5");
        wagon.setWeight(150);
        wagon.setTotalResourceWeight(350);
        resource.setWeight(350);
        resource.setCount(1);
        expResult = 500.0;
        result = WagonControl.newWeight(wagon, resource);
        System.out.println("Results = " + result);            
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 6");
        wagon.setWeight(150);
        wagon.setTotalResourceWeight(120);
        resource.setWeight(60);
        resource.setCount(2);
        expResult = 270.0;
        result = WagonControl.newWeight(wagon, resource);
        System.out.println("Results = " + result);            
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 7");
        wagon.setWeight(150);
        wagon.setTotalResourceWeight(180);
        resource.setWeight(60);
        resource.setCount(3);
        expResult = 330.0;
        result = WagonControl.newWeight(wagon, resource);
        System.out.println("Results = " + result);            
        assertEquals(expResult, result, 0.0);
    }

      
    
}
