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
public class TaskTest {
    
    public TaskTest() {
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
     * Test of asOneLine method, of class Task.
     */
    @Test
    public void testAsOneLine() {
        System.out.println("asOneLine");
        Task instance = new Task();
        String expResult = "";
        String result = instance.asOneLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Task.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Task instance = new Task();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClassName method, of class Task.
     */
    @Test
    public void testGetClassName() {
        System.out.println("getClassName");
        String expResult = "";
        String result = Task.getClassName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Task.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLawBased method, of class Task.
     */
    @Test
    public void testSetLawBased() {
        System.out.println("setLawBased");
        boolean lawBased = false;
        Task instance = new Task();
        instance.setLawBased(lawBased);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLawBased method, of class Task.
     */
    @Test
    public void testIsLawBased() {
        System.out.println("isLawBased");
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.isLawBased();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Task.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Task.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Task instance = new Task();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Task.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription_asShortNote method, of class Task.
     */
    @Test
    public void testGetDescription_asShortNote() {
        System.out.println("getDescription_asShortNote");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getDescription_asShortNote();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Task.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Task instance = new Task();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRealizedInSprints method, of class Task.
     */
    @Test
    public void testGetRealizedInSprints() {
        System.out.println("getRealizedInSprints");
        Task instance = new Task();
        List<Integer> expResult = null;
        List<Integer> result = instance.getRealizedInSprints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRealizedInSprints_asString method, of class Task.
     */
    @Test
    public void testGetRealizedInSprints_asString() {
        System.out.println("getRealizedInSprints_asString");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getRealizedInSprints_asString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRealizedInSprints_asArray method, of class Task.
     */
    @Test
    public void testGetRealizedInSprints_asArray() {
        System.out.println("getRealizedInSprints_asArray");
        Task instance = new Task();
        Integer[] expResult = null;
        Integer[] result = instance.getRealizedInSprints_asArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInSprint method, of class Task.
     */
    @Test
    public void testIsInSprint() {
        System.out.println("isInSprint");
        Integer sprint = null;
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.isInSprint(sprint);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRealizedInSprints method, of class Task.
     */
    @Test
    public void testSetRealizedInSprints() {
        System.out.println("setRealizedInSprints");
        List<Integer> realizedInSprints = null;
        Task instance = new Task();
        instance.setRealizedInSprints(realizedInSprints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStoryPoints method, of class Task.
     */
    @Test
    public void testGetStoryPoints() {
        System.out.println("getStoryPoints");
        Task instance = new Task();
        Integer expResult = null;
        Integer result = instance.getStoryPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStoryPoints_asString method, of class Task.
     */
    @Test
    public void testGetStoryPoints_asString() {
        System.out.println("getStoryPoints_asString");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getStoryPoints_asString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStoryPoints method, of class Task.
     */
    @Test
    public void testSetStoryPoints() {
        System.out.println("setStoryPoints");
        Integer storyPoints = null;
        Task instance = new Task();
        instance.setStoryPoints(storyPoints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
