package com.wipro.springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springcore2.service.ShapeServiceImpl;


public class ShapeServiceMain {

	public static void main(String[] args) {
				
		ApplicationContext  context = new ClassPathXmlApplicationContext("appcontext.xml");	
		
		ShapeServiceImpl shapeService = (ShapeServiceImpl) context.getBean("shapeServiceBean");
		
		shapeService.findArea();

	}

}
