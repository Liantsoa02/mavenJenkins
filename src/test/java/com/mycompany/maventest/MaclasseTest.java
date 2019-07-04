/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maventest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usager
 */
public class MaclasseTest {
    
    public MaclasseTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addition method, of class Maclasse.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        double a = 2.0;
        double expResult = 4.0;
        double result = Maclasse.addition(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multiplier method, of class Maclasse.
     */
    @Test
    public void testMultiplier() {
        System.out.println("multiplier");
        double a = 3.0;
        double expResult = 9.0;
        double result = Maclasse.multiplier(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
