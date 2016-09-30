/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner;

import com.ttrzcinski.scrumtaskassigner.model.SprintFactory;
import com.ttrzcinski.scrumtaskassigner.model.Task;
import com.ttrzcinski.scrumtaskassigner.model.TaskFactory;

/**
 *
 * @author tomaszt
 */
public class ScrumTaskAssigner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize industrial district - prepare factories
        SprintFactory sprintFactory = SprintFactory.getFactory();
        TaskFactory taskFactory = TaskFactory.getFactory();
        //Prepare instances
        System.out.println(taskFactory);
        Task task = taskFactory.produce();
        System.out.println(task);
        Task task2 = taskFactory.produce(-1, false, "Test Task 1", "Test Descrition 1", null);
        System.out.println(task2);
    }
    
}
