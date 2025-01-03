package com.wipro.springcore3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.springcore3.config.AppConfig;
import com.wipro.springcore3.service.HelloService;

public class HelloServiceMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService helloService = context.getBean(HelloService.class);
		
		helloService.printMessage();

	}

}
