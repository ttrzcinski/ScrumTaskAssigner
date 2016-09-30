/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner.model;

import com.ttrzcinski.scrumtaskassigner.utils.DateUtils;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests POJO class representing Sprint.
 *
 * @author Tomasz "TomaszT" Trzcinski <trzcinski.tomasz.1988@gmail.com>
 * @see Sprint
 */
public class SprintTest {
    
    public SprintTest() {
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
     * Test of close method, of class Sprint.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        String userName = "user1234";
        DateUtils dateUtils = new DateUtils();
        Date startDate = dateUtils.parseDate("14-02-16", "dd-MM-YY");
        Date endDate = dateUtils.parseDate("28-02-16", "dd-MM-YY");
        Sprint instance = new SprintFactory().produce(1, startDate, endDate);
        Assert.assertNull("Close date is set.", instance.getCloseDate());
        Assert.assertNull("Closed by is set.", instance.getClosedBy());
        boolean expResult = true;
        boolean result = instance.close(userName);
        Assert.assertNotNull("Close date is not set.", instance.getCloseDate());
        Assert.assertNotNull("Closed by is not set.", instance.getClosedBy());
        Assert.assertEquals("Result was not true.", expResult, result);
    }

    /**
     * Test of asOneLine method, of class Sprint.
     */
    @Test
    public void testAsOneLine() {
        System.out.println("asOneLine");
        Sprint instance = null;
        String expResult = "";
        String result = instance.asOneLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Sprint.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sprint instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClassName method, of class Sprint.
     */
    @Test
    public void testGetClassName() {
        System.out.println("getClassName");
        String expResult = "";
        String result = Sprint.getClassName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Sprint.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Sprint instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class Sprint.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Sprint instance = null;
        Date expResult = null;
        Date result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class Sprint.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Sprint instance = null;
        Date expResult = null;
        Date result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCloseDate method, of class Sprint.
     */
    @Test
    public void testGetCloseDate() {
        System.out.println("getCloseDate");
        Sprint instance = null;
        Date expResult = null;
        Date result = instance.getCloseDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClosedBy method, of class Sprint.
     */
    @Test
    public void testGetClosedBy() {
        System.out.println("getClosedBy");
        Sprint instance = null;
        String expResult = "";
        String result = instance.getClosedBy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
