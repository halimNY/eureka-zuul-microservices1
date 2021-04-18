package com.halim.productService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ProductServiceBootRunner  {
	
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceBootRunner.class, args);
	}
	
}
