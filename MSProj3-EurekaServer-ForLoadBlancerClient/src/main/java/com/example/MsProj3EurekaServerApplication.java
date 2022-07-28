package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsProj3EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj3EurekaServerApplication.class, args);
	}

}
