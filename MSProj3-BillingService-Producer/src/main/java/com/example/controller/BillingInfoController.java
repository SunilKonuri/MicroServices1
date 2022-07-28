package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/v1/billing")
public class BillingInfoController {

	
	@Value("${server.port}")
	private int port;
	
	
	@Value("${eureka.instance.instance-id}")
	private String instanceid;
	
	
	@RequestMapping("/info")
	public ResponseEntity<String> fetchBillingDetails(){
		
		
		return new ResponseEntity<String>("Final Bill Amount=BillAmount-Discount(Rs.5000) using instnace"+instanceid+"@port"+port,HttpStatus.OK);
	}
}
