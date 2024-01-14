/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.task1.shashanknr_java_rest_api.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author shash
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "properties")


public class Properties {
    @Id
    private String id;
    private String name;
    private String assignee;
    private String project;
    private String startTime;
    private String candidatename;

   /* public Properties() {
    }
    public Properties(String name, String id, String assignee, String project, String dateString, String candidatename) {
        this.name = name;
        this.id = id;
        this.assignee = assignee;
        this.project = project;
        this.startTime = dateString;
        this.candidatename = candidatename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
    public String getStartTime() {
        // Convert the stored string to Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(startTime);
            // Format the Date and return as a string
            return dateFormat.format(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCandidatename() {
        return candidatename;
    }

    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename;
    }

    public String formatDateToString(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return dateTime.format(formatter);
    }*/

   
       
}

