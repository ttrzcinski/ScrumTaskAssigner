/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner.utils;

import java.util.List;

/**
 *
 * @author tomaszt
 */
public class StringUtils {
    //
    public String convertStringsListToSting(List<String> list, String delimeter) {
        //Lack of delimeter
        if (delimeter == null) {
            delimeter = "";
        }
        //
        StringBuilder stringBuilder = new StringBuilder();
        //
        for (String string : list) {
            stringBuilder.append(string).append(delimeter);
        }
        
        return stringBuilder.toString();
    }
    
    //
    public String convertIntegersListToSting(List<Integer> list, String delimeter) {
        //Lack of delimeter
        if (delimeter == null) {
            delimeter = "";
        }
        //
        StringBuilder stringBuilder = new StringBuilder();
        //
        for (Integer integer : list) {
            stringBuilder.append(integer).append(delimeter);
        }
        
        return stringBuilder.toString();
    }
}
