package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class StudentController {
	
	@GetMapping("/student")
	public ResponseEntity<String> show(){
		
		
		return new ResponseEntity<String>("Microservies-Actuators",HttpStatus.OK);
	}
	

}
