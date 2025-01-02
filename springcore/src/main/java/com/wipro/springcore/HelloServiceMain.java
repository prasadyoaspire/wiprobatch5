package com.wipro.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springcore.service.HelloService;

public class HelloServiceMain {

	public static void main(String[] args) {
		
		//HelloService helloService = new HelloService();
		//helloService.setMessage("Hello, Spring is saying welcome");
		
		//request container to get the helloService Object
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("appcontext.xml");		
		HelloService helloService = (HelloService) context.getBean("msgBean");
		
		helloService.printMessage();
	}

}
