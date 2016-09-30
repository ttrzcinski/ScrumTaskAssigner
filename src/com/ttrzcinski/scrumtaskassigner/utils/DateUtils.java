/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Represents toolkit of methods usable for processing dates.
 * 
 * @author Tomasz "TomaszT" Trzcinski <trzcinski.tomasz.1988@gmail.com>
 */
public class DateUtils {
    /**
     * Represents format of date used as standard with date and time
     */
    public final static String FORMAT_DDMMYYYYHHMMSS = "dd/MM/yyyy/hh:mm:ss";
    
    /**
     * Converts Date given as String to date given as object.
     * 
     * @param date          given date to parse
     * @param format        format, with which date will be parsed
     * @return date object, if parsed, null otherwise
     */
    public Date parseDate(String date, String format) {
        return this.convertStringToDate(date, format);
    }
    
    /**
     * Converts Date given as String to date given as object.
     * 
     * @param dateToParse   given date to parse
     * @param format        format, with which date will be parsed
     * @return date object, if parsed, null otherwise
     */
    public Date convertStringToDate(String dateToParse, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date result = null;
        try {
            result = formatter.parse(dateToParse);
        } catch (Exception exception1) {
            System.err.println(
                    String.format("ERROR, converting from String %s to date with format %s", dateToParse, format)
            );
            result = null;
        }
        return result;
    }
    
    /**
     * Formats given date with given format.
     * 
     * @param date      given date
     * @param format    given format
     * @return object of date, if whole process was OK, null otherwise
     */
    public String formatDate(Date date, String format) {
        return this.convertDateToString(date, format);
    }
    
    /**
     * Converts given date with given pattern to String object.
     * 
     * @param date      given date
     * @param format    given format
     * @return object of date, if whole process was OK, null otherwise
     */
    public String convertDateToString(Date date, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        String dateAsString = dateFormat.format(date);
        return dateAsString;
    }
}
