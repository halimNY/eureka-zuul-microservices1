package com.rab3tech.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SpringTransactionBootRunner  {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionBootRunner.class, args);
	}
	
}
