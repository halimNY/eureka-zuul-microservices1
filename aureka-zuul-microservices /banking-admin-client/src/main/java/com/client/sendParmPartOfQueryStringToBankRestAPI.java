package com.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


public class sendParmPartOfQueryStringToBankRestAPI {
	
	public static void main(String[] args) {
	    //Accessing Rest API through java code!
			RestTemplate restTemplate= new RestTemplate();
			//JSON to Java Object conversion
	 		String baseUrl="http://localhost:8098/admin/test/halim";
	 		UriComponentsBuilder uri=UriComponentsBuilder.fromUriString(baseUrl).queryParam("code", "H3000000").queryParam("name", "halim hacene");
	 
			HttpHeaders headers= new HttpHeaders();
			HttpEntity<?> request= new HttpEntity<>(headers);
		
			HttpEntity<ApplicationVO> applicationVO=restTemplate.exchange(uri.buildAndExpand().toString(),HttpMethod.GET,request,ApplicationVO.class);
	 		
	 		System.out.println(applicationVO.getBody());
	 		System.out.println(applicationVO.getHeaders());
	 		System.out.println(applicationVO.getClass());
	}

}
