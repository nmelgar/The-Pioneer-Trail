/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.Toolbox;
import byui.cit260.PioneerTrail.model.Resource;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author po
 */
public class ToolboxControlTest {
    
    public ToolboxControlTest() {
    }
    
    /**
     * Test of CalcMaxWeight method, of class ToolboxControl.
     */
    @Test
    public void testCalcMaxWeight() {
        System.out.println("CalcMaxWeight");
        Toolbox toolbox = new Toolbox();
        Resource resource = new Resource();
        System.out.println("case 1");
        resource.setWeight(2);
        toolbox.setBreadth(2);
        toolbox.setHeight(2);
        toolbox.setLenght(2);
        toolbox.setVolume(8);
        double expResult = 10;
        double result = ToolboxControl.calcMaxWeight(resource, toolbox);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 2");
        resource.setWeight(24);
        toolbox.setBreadth(5);
        toolbox.setHeight(5);
        toolbox.setLenght(10);
        toolbox.setVolume(250);
        expResult = 274;
        result = ToolboxControl.calcMaxWeight(resource, toolbox);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 3");
        resource.setWeight(4);
        toolbox.setBreadth(3);
        toolbox.setHeight(3);
        toolbox.setLenght(3);
        toolbox.setVolume(27);
        expResult = 31;
        result = ToolboxControl.calcMaxWeight(resource, toolbox);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 4");
        resource.setWeight(15);
        toolbox.setBreadth(5);
        toolbox.setHeight(8);
        toolbox.setLenght(2);
        toolbox.setVolume(80);
        expResult = 95;
        result = ToolboxControl.calcMaxWeight(resource, toolbox);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 5");
        resource.setWeight(73);
        toolbox.setBreadth(9);
        toolbox.setHeight(6);
        toolbox.setLenght(5);
        toolbox.setVolume(270);
        expResult = 343;
        result = ToolboxControl.calcMaxWeight(resource, toolbox);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 6");
        resource.setWeight(8);
        toolbox.setBreadth(3);
        toolbox.setHeight(5);
        toolbox.setLenght(6);
        toolbox.setVolume(90);
        expResult = 98;
        result = ToolboxControl.calcMaxWeight(resource, toolbox);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("case 7");
        resource.setWeight(65);
        toolbox.setBreadth(15);
        toolbox.setHeight(2);
        toolbox.setLenght(3);
        toolbox.setVolume(90);
        expResult = 155;
        result = ToolboxControl.calcMaxWeight(resource, toolbox);
        System.out.println("Results = " + result);
        assertEquals(expResult, result, 0.0);
        
               
    }
    
}
