package com.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class AccesRestPostAPI {
	
	public static void main(String[] args) {
	    //Accessing Rest API through java code!
		RestTemplate restTemplate= new RestTemplate();
		
		//JSON to Java Object conversion
 		String uri="http://localhost:8098/admin/test/modest";
 		ApplicationVO applicationVO = new ApplicationVO();
 		applicationVO.setColor("while");
 		applicationVO.setPrice(1000);
 	   HttpHeaders headers= new HttpHeaders();
       headers.set("authorization", "123463ERTGBNHUZEWSQA");
       headers.set("location", "USA");
       HttpEntity<ApplicationVO> request= new HttpEntity<>(applicationVO,headers);
		//String result = restTemplate.getForObject(uri, String.class);
		HttpEntity<String> result = restTemplate.exchange(uri.toString(),HttpMethod.POST,request,String.class);
 	
 		System.out.println(result);
	}

}
