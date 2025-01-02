package com.wipro.springcore;

import com.wipro.springcore.service.ShapeService;
import com.wipro.springcore.service.ShapeServiceImpl;
import com.wipro.springcore.bean.Shape;
import com.wipro.springcore.bean.Triangle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springcore.bean.Circle;
import com.wipro.springcore.bean.Rectangle;


public class ShapeServiceMain {

	public static void main(String[] args) {
		
		//ShapeServiceImpl shapeService = new ShapeServiceImpl();		
		//Shape shape = new Rectangle(); // creating dependency object		
		//shapeService.setShape(shape); // injecting dependency
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("appcontext.xml");	
		
		ShapeServiceImpl shapeService = (ShapeServiceImpl) context.getBean("shapeServiceBean");
		
		shapeService.findArea();

	}

}
