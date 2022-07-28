package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsProj1Ms01Application {

	public static void main(String[] args) {
		SpringApplication.run(MsProj1Ms01Application.class, args);
	}

}
