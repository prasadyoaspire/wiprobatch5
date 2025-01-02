package com.wipro.springcore.service;

import com.wipro.springcore.bean.Circle;
import com.wipro.springcore.bean.Shape;
import com.wipro.springcore.bean.Triangle;

public class ShapeServiceImpl implements ShapeService {
	
	private Shape shape; //dependency 
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	@Override
	public void findArea() {			
		//Shape s = new Circle();	//creating 	dependency object
//		shape = new Triangle();		//creating 	dependency object
		double result = shape.area();
		System.out.println("Area: "+result);
	}

}
