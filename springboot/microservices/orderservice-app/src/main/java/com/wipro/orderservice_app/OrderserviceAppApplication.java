package com.wipro.orderservice_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderserviceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderserviceAppApplication.class, args);
	}
	
	@Bean
	RestTemplate getRestTemplateBean() {
		return new RestTemplate();
	}
}
