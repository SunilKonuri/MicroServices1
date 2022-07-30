package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nt.IBillingServiceConsumerClient;

@RestController
@RequestMapping("/v2")
public class ShoppingServiceOperationController {

	@Autowired
	IBillingServiceConsumerClient client;
	
	 
	@GetMapping("/cart")
	public ResponseEntity<String> doShopping(){
		String billingInfo = client.getBillingData();
		System.out.println("Proxy class name:"+client.getClass()+"--");
		
		try {
			Thread.sleep(20000);
		} catch (Exception e) {
         e.printStackTrace();
		}
		
		return new ResponseEntity<String>("Shopping Item(Shirt,Tshirt)::"+billingInfo,HttpStatus.OK);
		
		
	}
	
	//Note:
	//1.run the eureka server MSPROJ2-EUREKA SERVER
	//2.run the producer server MSPROJ2-Billing Service
	//3.run the consumer service Shopping service
	//go to the eureka server console and modfiy the service url for testing 
	//e.g http://localhost/v2/cart
}
