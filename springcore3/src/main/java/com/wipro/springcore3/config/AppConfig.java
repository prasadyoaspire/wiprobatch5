package com.wipro.springcore3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wipro.springcore3.service.HelloService;

@Configuration
public class AppConfig {
	
	
	@Bean
	public HelloService getHelloServiceBean() {
		HelloService helloService = new HelloService();
		helloService.setMessage("Hello, spring says welcome");
		return helloService;
	}
	
}
