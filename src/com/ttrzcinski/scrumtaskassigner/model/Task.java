/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttrzcinski.scrumtaskassigner.model;

import java.util.List;
import com.ttrzcinski.scrumtaskassigner.utils.StringUtils;

/**
 * Represents instance of task - the smallest piece of processed data in WorkFlow.
 * 
 * @author Tomasz "TomaszT" Trzcinski <trzcinski.tomasz.1988@gmail.com>
 */
public class Task {
    //Flags
    
    //Variables
    private int id;
    private boolean lawBased;
    private String title;
    private String description;
    private List<Integer> realizedInSprints;
    private Integer storyPoints;
    
    //Constructors

    public Task() {
        //
    }

    public Task(int id, boolean lawBased, String title, String description, List<Integer> realizedInSprints) {
        this.id = id;
        this.lawBased = lawBased;
        this.title = title;
        this.description = description;
        this.realizedInSprints = realizedInSprints;
    }
    
    //Inners
    public String asOneLine() {
        StringBuilder stringBuilder = new StringBuilder(getClassName());
        //
        stringBuilder.append("|").append("id").append("=").append(this.getId()).append("|");
        stringBuilder.append("|").append("title").append("=").append(this.getTitle()).append("|");
        stringBuilder.append("|").append("sprint").append("=").append(this.getRealizedInSprints_asString()).append("|");
        stringBuilder.append("|").append("story pts").append("=").append(this.getStoryPoints_asString()).append("|");
        //
        return stringBuilder.toString();
    }
    
    @Override
    public String toString() {
        return this.asOneLine();
    }
    
    //Setters and Getters
    public static String getClassName() {
        return "Task";
    }
    
    public int getId() {
        return this.id;
    }

    public void setLawBased(boolean lawBased) {
        this.lawBased = lawBased;
    }

    public boolean isLawBased() {
        return this.lawBased;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public String getDescription_asShortNote() {
        return this.description == null ? "None" : this.description.substring(0, Math.min(this.description.length(), 30));
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getRealizedInSprints() {
        return this.realizedInSprints;
    }
    
    public String getRealizedInSprints_asString() {
        return this.realizedInSprints == null || this.realizedInSprints.isEmpty() ? 
                "Never" : new StringUtils().convertIntegersListToSting(realizedInSprints, ",");
    }
    
    public Integer[] getRealizedInSprints_asArray() {
        return (Integer[])this.realizedInSprints.toArray();
    }
    
    public boolean isInSprint(Integer sprint) {
        return this.realizedInSprints != null && sprint != null ? 
                this.realizedInSprints.contains(sprint) : false;
    }

    public void setRealizedInSprints(List<Integer> realizedInSprints) {
        this.realizedInSprints = realizedInSprints;
    }

    public Integer getStoryPoints() {
        return this.storyPoints;
    }
    
    public String getStoryPoints_asString() {
        return this.storyPoints != null ? this.storyPoints.toString() : "None";
    }

    public void setStoryPoints(Integer storyPoints) {
        //Is it not null and is negative
        if (storyPoints != null && storyPoints < 0) {
            System.err.println("ERROR, given story points value is negative");
            return;
        }
        //Set it
        this.storyPoints = storyPoints;
    }
}
