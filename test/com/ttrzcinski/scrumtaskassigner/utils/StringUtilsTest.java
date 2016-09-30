/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner.utils;

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
public class StringUtilsTest {
    
    public StringUtilsTest() {
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
     * Test of convertStringsListToSting method, of class StringUtils.
     */
    @Test
    public void testConvertStringsListToSting() {
        System.out.println("convertStringsListToSting");
        List<String> list = null;
        String delimeter = "";
        StringUtils instance = new StringUtils();
        String expResult = "";
        String result = instance.convertStringsListToSting(list, delimeter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertIntegersListToSting method, of class StringUtils.
     */
    @Test
    public void testConvertIntegersListToSting() {
        System.out.println("convertIntegersListToSting");
        List<Integer> list = null;
        String delimeter = "";
        StringUtils instance = new StringUtils();
        String expResult = "";
        String result = instance.convertIntegersListToSting(list, delimeter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
