package com.servicenow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ServicenowApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicenowApplication.class, args);

	}

}