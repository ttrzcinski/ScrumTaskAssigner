/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner.model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests Sprint Factory class.
 *
 * @author Tomasz "TomaszT" Trzcinski <trzcinski.tomasz.1988@gmail.com>
 * @see SprintFactory
 */
public class SprintFactoryTest {
    
    public SprintFactoryTest() {
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
     * Test of getFactory method, of class SprintFactory.
     */
    @Test
    public void testGetFactory() {
        System.out.println("getFactory");
        //Order two instances of singleton - they must be the same
        SprintFactory expResult = SprintFactory.getFactory();
        SprintFactory result = SprintFactory.getFactory();
        assertEquals(expResult, result);
    }

    /**
     * Test of produce method, of class SprintFactory.
     */
    @Test
    public void testProduce_3args() {
        System.out.println("produce");
        Integer id = null;
        Date startDate = null;
        Date endDate = null;
        SprintFactory instance = new SprintFactory();
        Sprint expResult = null;
        Sprint result = instance.produce(id, startDate, endDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of produce method, of class SprintFactory.
     */
    @Test
    public void testProduce_5args() {
        System.out.println("produce");
        Integer id = null;
        Date startDate = null;
        Date endDate = null;
        Date closeDate = null;
        String closedBy = "";
        SprintFactory instance = new SprintFactory();
        Sprint expResult = null;
        Sprint result = instance.produce(id, startDate, endDate, closeDate, closedBy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
