package com.task1.shashanknr_java_rest_api;

import com.task1.shashanknr_java_rest_api.controller.PropertiesRepository;
import com.task1.shashanknr_java_rest_api.model.Properties;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/restapigenerate")
public class ShashanknrJavaRestApiApplication {

    @Autowired
    private PropertiesRepository repository;
    
    @PostMapping
    public ResponseEntity<Properties> createProperties(@RequestBody Properties properties) {
    try {
        // Validate properties
        // Save properties
        Properties savedProperties = repository.save(properties);
        return ResponseEntity.ok(savedProperties);
    } catch (Exception e) {
        // Handle exception
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
}

    
    @GetMapping
    public List<Properties> getAllProperties() {
    return repository.findAll();
    }
    @PutMapping
    public Properties updateProperties(@RequestBody Properties properties){
        return repository.save(properties);
    }
    @DeleteMapping("/{taskId}")
        public ResponseEntity<String> deleteProperties(@PathVariable String taskId) {

        return ResponseEntity.ok("Deleted successfully");   
}

	public static void main(String[] args) {
		SpringApplication.run(ShashanknrJavaRestApiApplication.class, args);
	}

}
