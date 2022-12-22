package com.cg.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication



public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
		System.out.println("consumer module is running");
	}
//	@Bean 
//	//@LoadBalanced
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}

}
