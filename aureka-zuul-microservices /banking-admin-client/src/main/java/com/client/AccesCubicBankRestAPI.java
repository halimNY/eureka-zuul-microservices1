package com.client;

import java.util.List;

import org.springframework.web.client.RestTemplate;



public class AccesCubicBankRestAPI {
	
	public static void main(String[] args) {
	    //Accessing Rest API through java code!
		RestTemplate restTemplate= new RestTemplate();
			//JSON to Java Object conversion
			String url="http://localhost:444/v3//customer/customerTransactionsByDotAsc";
			 @SuppressWarnings("unchecked")
			List<CustomerTransactionVO> CustomerTransactionVO=(List<com.client.CustomerTransactionVO>) restTemplate.getForObject(url,CustomerTransactionVO.class);
	         System.out.println("client side ::::"+CustomerTransactionVO);


	 	
	 		//String result = restTemplate.getForObject(url, String.class);
	 		String result = restTemplate.getForObject(url, String.class);
	 		
	 		System.out.println(result);

}
}