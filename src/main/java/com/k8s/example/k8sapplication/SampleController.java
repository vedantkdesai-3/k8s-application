package com.k8s.example.k8sapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping
    public String hello(){
        return "Hello To Spring Boot K8S";
    }
    
}