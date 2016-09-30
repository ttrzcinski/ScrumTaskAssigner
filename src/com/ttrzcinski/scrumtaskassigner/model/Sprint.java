/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner.model;

import java.util.Date;
import static com.ttrzcinski.scrumtaskassigner.model.Task.getClassName;

/**
 * Represents a single sprint as secured part of time in development lifetime.
 * 
 * @author Tomasz "TomaszT" Trzcinski <trzcinski.tomasz.1988@gmail.com>
 */
public class Sprint {
    //Flags
    
    //Variables
    private int id;
    private Date startDate;
    private Date endDate;
    private Date closeDate;
    private String closedBy;
    
    //Constructors
    public Sprint(Integer id, Date startDate, Date endDate, Date closeDate, String closedBy) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.closeDate = closeDate;
        this.closedBy = closedBy;
    }
    
    //Inner methods
    /**
     * Closes sprint with given user name and current moment in time.
     * 
     * @param userName name of user calling close
     * @return true, if closed, false otherwise
     */
    public boolean close(String userName) {
        if (this.getCloseDate() != null) {
            System.err.println("ERROR, call to close Sprint, which is already closed.");
            return false;
        } else if (this.getClosedBy() != null) {
            System.err.println("ERROR, call to close Sprint, which was already closed by somebody.");
            return false;
        } else if (userName == null || userName.trim().isEmpty()) {
            System.err.println("ERROR, call to close Sprint with unusable user name.");
            return false;
        }
        //Obtain current moment to close sprint
        this.closeDate = new Date();
        this.closedBy = userName;
        
        return true;
    }
    
    public String asOneLine() {
        StringBuilder stringBuilder = new StringBuilder(getClassName());
        //
        stringBuilder.append("|").append("#").append(this.getId()).append("|");
        stringBuilder.append("|").append("start").append("=").append(this.getStartDate()).append("|");
        stringBuilder.append("|").append("end").append("=").append(this.getEndDate()).append("|");
        stringBuilder.append("|").append("closeDate").append("=").append(this.getCloseDate()).append("|");
        stringBuilder.append("|").append("closedBy").append("=").append(this.getClosedBy()).append("|");
        //
        return stringBuilder.toString();
    }
    
    @Override
    public String toString() {
        return this.asOneLine();
    }
        
    //Setters and getters
    public static String getClassName() {
        return "Sprint";
    }
    
    public int getId() {
        return this.id;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }
    
    public Date getCloseDate() {
        return this.closeDate;
    }

    public String getClosedBy() {
        return this.closedBy;
    }
}
