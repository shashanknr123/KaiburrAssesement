package com.task1.shashanknr_java_rest_api.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author shash
 */
import com.task1.shashanknr_java_rest_api.model.Properties;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface PropertiesRepository extends MongoRepository<Properties, String>{
    
    
}
