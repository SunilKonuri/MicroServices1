package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/v1/billing")
public class BillingInfoController {

	
	@RequestMapping("/info")
	public ResponseEntity<String> fetchBillingDetails(){
		
		
		return new ResponseEntity<String>("Final Bill Amount=BillAmount-Discount(Rs.5000)",HttpStatus.OK);
	}
}
