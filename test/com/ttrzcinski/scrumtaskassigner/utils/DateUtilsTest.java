/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner.utils;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests toolkit processing date objects.
 * 
 * @author Tomasz "TomaszT" Trzcinski <trzcinski.tomasz.1988@gmail.com>
 * @see java.util.Date
 */
public class DateUtilsTest {
    
    public DateUtilsTest() {
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
     * Test of parseDate method, of class DateUtils.
     */
    @Test
    public void testParseDate() {
        System.out.println("parseDate");
        String date = "";
        String format = "";
        DateUtils instance = new DateUtils();
        Date expResult = null;
        Date result = instance.parseDate(date, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertStringToDate method, of class DateUtils.
     */
    @Test
    public void testConvertStringToDate() {
        System.out.println("convertStringToDate");
        String dateToParse = "";
        String format = "";
        DateUtils instance = new DateUtils();
        Date expResult = null;
        Date result = instance.convertStringToDate(dateToParse, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatDate method, of class DateUtils.
     */
    @Test
    public void testFormatDate() {
        System.out.println("formatDate");
        Date date = null;
        String format = "";
        DateUtils instance = new DateUtils();
        String expResult = "";
        String result = instance.formatDate(date, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertDateToString method, of class DateUtils.
     */
    @Test
    public void testConvertDateToString() {
        System.out.println("convertDateToString");
        Date date = null;
        String format = "";
        DateUtils instance = new DateUtils();
        String expResult = "";
        String result = instance.convertDateToString(date, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
