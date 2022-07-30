package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeServiceOperationController {


	@Value("${dbuser}")
	private String username;
	
	@Value("${dbpwd}")
	private String dbpwd;
	
	
	@GetMapping("/show")
	public ResponseEntity<String> doShopping() {
		return new ResponseEntity<String>("Mircoservices Employee Db details::" +username+"-----"+dbpwd , HttpStatus.OK);

	}

	
}
