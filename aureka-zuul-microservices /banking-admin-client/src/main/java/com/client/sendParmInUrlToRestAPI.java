package com.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


public class sendParmInUrlToRestAPI {
	
	public static void main(String[] args) {
		// sending data as part of query  string 
	    //Accessing Rest API through java code!
		RestTemplate restTemplate= new RestTemplate();
		//JSON to Java Object conversion
 		String baseUrl="http://localhost:8098/admin/test/modest/{code}/{name}";
	//	UriComponentsBuilder.fromUriString(baseUrl).queryParam("code", "H345643").queryParam("name", "halim");
 		UriComponentsBuilder  uri=	UriComponentsBuilder.fromUriString(baseUrl);
		Map<String,String> urlParam= new HashMap<>();
		urlParam.put("code", "H345643");
		urlParam.put("name", "halim");
		HttpHeaders headers= new HttpHeaders();
		HttpEntity<?> request= new HttpEntity<>(headers);
	
		HttpEntity<ApplicationVO> applicationVO=restTemplate.exchange(uri.buildAndExpand(urlParam).toString(),HttpMethod.GET,request,ApplicationVO.class);
 		
 		System.out.println(applicationVO.getBody());
 		System.out.println(applicationVO.getHeaders());
 		System.out.println(applicationVO.getClass());
	}

}
