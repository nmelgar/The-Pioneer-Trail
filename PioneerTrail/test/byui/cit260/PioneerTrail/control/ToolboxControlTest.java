/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.control;

import byui.cit260.PioneerTrail.model.ResourceItem;
import byui.cit260.PioneerTrail.model.Toolbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author po
 */
public class ToolboxControlTest {
    
    public ToolboxControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CalcMaxWeight method, of class ToolboxControl.
     */
    @Test
    public void testCalcMaxWeight() {
        System.out.println("CalcMaxWeight");
        ResourceItem resourceItem = null;
        Toolbox toolboxVolume = null;
        int expResult = 0;
        int result = ToolboxControl.CalcMaxWeight(resourceItem, toolboxVolume);
        assertEquals(expResult, result);
        
    }
    
}
