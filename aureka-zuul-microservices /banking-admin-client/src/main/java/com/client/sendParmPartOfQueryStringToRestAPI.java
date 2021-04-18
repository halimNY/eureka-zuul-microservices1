package com.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


public class sendParmPartOfQueryStringToRestAPI {
	
	public static void main(String[] args) {
	    //Accessing Rest API through java code!
			RestTemplate restTemplate= new RestTemplate();
			//JSON to Java Object conversion
	 		String baseUrl="http://localhost:444/v3/customer/customerTransactionsByDotDesc";
	 		UriComponentsBuilder uri=UriComponentsBuilder.fromUriString(baseUrl).queryParam("userName ", "javahunk100@gmail.com");
			HttpHeaders headers= new HttpHeaders();
			HttpEntity<?> request= new HttpEntity<>(headers);
		
			HttpEntity<CustomerTransactionVO> CustomerTransactionVO=restTemplate.exchange(uri.buildAndExpand().toString(),HttpMethod.GET,request,CustomerTransactionVO.class);
	 		
	 		System.out.println(CustomerTransactionVO.getBody());
	 		System.out.println(CustomerTransactionVO.getHeaders());
	 		System.out.println(CustomerTransactionVO.getClass());
	}

}
