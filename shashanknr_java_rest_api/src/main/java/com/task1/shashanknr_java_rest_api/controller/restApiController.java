/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package com.task1.shashanknr_java_rest_api.controller;

import com.task1.shashanknr_java_rest_api.model.Properties;
import java.util.Date;
import java.util.List;
import lombok.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author shash
 */

/*
@RestController
@RequestMapping("/restapigenerate")
public class restApiController{
    private final PropertiesRepository propertiesRepository;
    //Properties properties;
    @Autowired
    public restApiController(PropertiesRepository propertiesRepository) {
        this.propertiesRepository = propertiesRepository;
    }
    @GetMapping
    public List<Properties> getAllProperties() {
    return propertiesRepository.findAll();
}

    @GetMapping("{taskId}")
    public Properties getProperties(@PathVariable String taskId){
        return propertiesRepository.findById(taskId).orElse(null);
    }
    
  @PostMapping
    public String createProperties(@RequestBody Properties properties){
        propertiesRepository.save(properties);
        return "post operation is working fine";
    }
    @PutMapping
    public String updateProperties(@RequestBody Properties properties){
        propertiesRepository.save(properties);
        return "update operation is working fine";
    }
    
    @DeleteMapping("{taskId}")
    public String deleteProperties(@PathVariable String taskId){
        propertiesRepository.deleteById(taskId);
        return "task deleted successfully";
    }
    }*/

