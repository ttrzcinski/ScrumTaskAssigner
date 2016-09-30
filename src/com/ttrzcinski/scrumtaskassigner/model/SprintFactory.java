/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner.model;

import java.util.Date;

/**
 * Represents factory of sprints.
 * 
 * @author Tomasz "TomaszT" Trzcinski <trzcinski.tomasz.1988@gmail.com>
 * @see Sprint
 */
public class SprintFactory {
    //
    private static Integer lastKnownHighestId;
    
    //
    private static SprintFactory factoryInstance;
    
    //Constructors
    /**
     * Hidden constructor to keep singleton structure;
     */
    protected SprintFactory() {
        if (SprintFactory.lastKnownHighestId == null) {
            SprintFactory.lastKnownHighestId = 0;
        }
    }
    
    /**
     * Returns one and only instance of Task Factory.
     * 
     * @return factory instance
     */
    public static SprintFactory getFactory() {
        if (SprintFactory.factoryInstance == null) {
            SprintFactory.factoryInstance = new SprintFactory();
        }
        //
        return SprintFactory.factoryInstance;
    }
    
    //Producing methods
    public Sprint produce(Integer id, Date startDate, Date endDate) {
        return this.produce(id, startDate, endDate, null, null);
    }
    
    public Sprint produce(Integer id, Date startDate, Date endDate, Date closeDate, String closedBy) {
        Sprint sprint = new Sprint(
                (id == null || id < 1 ? this.incLastKnownId() : id),
                startDate, endDate, closeDate, closedBy);
        
        return sprint;
    }
    
    private int incLastKnownId() {
        //
        SprintFactory.lastKnownHighestId++;
        //
        return SprintFactory.lastKnownHighestId;
    }
}
