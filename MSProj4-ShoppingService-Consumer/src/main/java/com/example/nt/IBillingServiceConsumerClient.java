package com.example.nt;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient("Billing-Service")
public interface IBillingServiceConsumerClient {

	@GetMapping("/v1/billing/info")
	public String getBillingData() ;
		
	
}
