/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomaszt
 */
public class TaskFactoryTest {
    
    public TaskFactoryTest() {
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
     * Test of getFactory method, of class TaskFactory.
     */
    @Test
    public void testGetFactory() {
        System.out.println("getFactory");
        TaskFactory expResult = null;
        TaskFactory result = TaskFactory.getFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of produce method, of class TaskFactory.
     */
    @Test
    public void testProduce_0args() {
        System.out.println("produce");
        TaskFactory instance = null;
        Task expResult = null;
        Task result = instance.produce();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of produce method, of class TaskFactory.
     */
    @Test
    public void testProduce_5args() {
        System.out.println("produce");
        Integer id = null;
        boolean lawBased = false;
        String title = "";
        String description = "";
        List<Integer> realizedInSprints = null;
        TaskFactory instance = null;
        Task expResult = null;
        Task result = instance.produce(id, lawBased, title, description, realizedInSprints);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
