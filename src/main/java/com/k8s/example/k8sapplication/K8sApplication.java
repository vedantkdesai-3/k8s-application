package com.k8s.example.k8sapplication;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class K8sApplication {

	public static Date severStartDate;

	public static void main(String[] args) {
		severStartDate = new Date();
		SpringApplication.run(K8sApplication.class, args);
	}

}
