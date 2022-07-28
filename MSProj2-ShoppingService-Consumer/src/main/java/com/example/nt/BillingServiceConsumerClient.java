package com.example.nt;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class BillingServiceConsumerClient {

	@Autowired
	private DiscoveryClient client;
	
	
	public String getBillingInfo() {
		
		//get billing server instance from eureka server
		List<ServiceInstance> listintance=client.getInstances("Billing-Service");
		
		System.out.println("listintance"+listintance);
		///get single instance from instnace (no load balaing)
		ServiceInstance instance=listintance.get(0);
		
		System.out.println("instance"+instance);
		
		
		
		//get details from Service Instance
		URI uri=instance.getUri();
		
		System.out.println("uri"+uri);
		
		//prepare the MS related URL to consume the method
		String url=uri.toString()+"/v1/billing/info";
		
		System.out.println("url"+url);
		//create the resttemplate object to consume the provider service
		RestTemplate template =new RestTemplate();
		
		//consume the provider service
		ResponseEntity<String>response=template.getForEntity(url, String.class);
		//get the response content from responseEntity body
		String responseContent=response.getBody();
		System.out.println("responseContent"+responseContent);
		return responseContent;
			
	}
	 
	
}
