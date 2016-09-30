/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner.model;

import java.util.List;

/**
 * Represents factory of tasks.
 * 
 * @author Tomasz "TomaszT" Trzcinski <trzcinski.tomasz.1988@gmail.com>
 * @see Task
 */
public class TaskFactory {
    //
    private static Integer lastKnownHighestId;
    
    //
    private static TaskFactory factoryInstance;
    
    //Constructors
    /**
     * Hidden constructor to keep singleton structure;
     */
    private TaskFactory() {
        if (TaskFactory.lastKnownHighestId == null) {
            TaskFactory.lastKnownHighestId = 0;
        }
    }
    
    /**
     * Returns one and only instance of Task Factory.
     * 
     * @return factory instance
     */
    public static TaskFactory getFactory() {
        if (TaskFactory.factoryInstance == null) {
            TaskFactory.factoryInstance = new TaskFactory();
        }
        //
        return TaskFactory.factoryInstance;
    }
    
    //Producing methods
    public Task produce() {
        Task task = new Task();
        return task;
    }
    
    public Task produce(Integer id, boolean lawBased, String title, String description, List<Integer> realizedInSprints) {
        Task task = new Task(
                (id == null || id < 1 ? this.incLastKnownId() : id),
                lawBased, title, description, realizedInSprints);
        
        return task;
    }
    
    private int incLastKnownId() {
        //
        TaskFactory.lastKnownHighestId++;
        //
        return TaskFactory.lastKnownHighestId;
    }
}
