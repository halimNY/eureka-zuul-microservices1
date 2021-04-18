package com.client;

import org.springframework.web.client.RestTemplate;


public class AccesRestAPI {
	
	public static void main(String[] args) {
	    //Accessing Rest API through java code!
		RestTemplate restTemplate= new RestTemplate();
		//JSON to Java Object conversion
 		String url="http://localhost:8098/admin/test/modest";
		ApplicationVO applicationVO=restTemplate.getForObject(url,ApplicationVO.class);
         System.out.println("client side ::::"+applicationVO);


 	
 		//String result = restTemplate.getForObject(url, String.class);
 		String result = restTemplate.getForObject(url, String.class);
 		
 		System.out.println(result);
	}

}
