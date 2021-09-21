package com.k8s.example.k8sapplication;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping
    public ServerRO index(){
        ServerRO ro  = new ServerRO(K8sApplication.severStartDate, (new Date()));
        return ro;
    }
    
}