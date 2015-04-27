/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.controller;

import com.j3a.sherpawebuser.dbEntityClasses.Avenant;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author J3A-AFRIQUE
 */
public class Flow_XXX_ControlsTest {
    
    public Flow_XXX_ControlsTest() {
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
     * Test of getAvenantAt method, of class Flow_XXX_Controls.
     */
    @Test
    public void testGetAvenantAt() {
        System.out.println("getAvenantAt");
        
        Date d;
        Calendar i = Calendar.getInstance();
        i.set(2012, 02, 01);
        d=i.getTime();
        Flow_XXX_Controls instance = new Flow_XXX_Controls();
        Avenant expResult = null;
        Avenant result = instance.getAvenantAt(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
