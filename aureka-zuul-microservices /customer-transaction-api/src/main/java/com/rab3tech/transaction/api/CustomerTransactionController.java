package com.rab3tech.transaction.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.rab3tech.transaction.api.dto.CustomerTransactionDTO;



@RestController
@RequestMapping("/customer")
public class CustomerTransactionController {
	
	@GetMapping("/hellot")
	public String tempa(){
		RestTemplate restTemplate= new RestTemplate();
		 HttpHeaders headers= new HttpHeaders();
	       headers.set("authorization", "123463ERTGBNHUZEWSQA");
	       headers.set("location", "USA");
	       HttpEntity<String> request= new HttpEntity<>(headers);
		//JSON to Java Object conversion
 		String uri="http://localhost:8079/product-service/product/halim";
 //		HttpEntity<String> result = restTemplate.exchange(uri.toString(),HttpMethod.GET,request ,String.class);
 		String result=restTemplate.getForObject(uri,String.class);
 		System.out.println(result);
		return "hello"+result;
	}
	
	@GetMapping("transaction/{tid}")
	public CustomerTransactionDTO findCustomerTransaction(@PathVariable String tid){
		CustomerTransactionDTO customerTransactionDTO=new CustomerTransactionDTO();
		customerTransactionDTO.setAmount(1223D);
		customerTransactionDTO.setTxid("T1762626");
		customerTransactionDTO.setUserid("technohunk100@gmail.com");
		return customerTransactionDTO;
	}
	

}
