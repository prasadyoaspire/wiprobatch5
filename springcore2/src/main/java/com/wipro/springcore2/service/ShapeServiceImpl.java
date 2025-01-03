package com.wipro.springcore2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wipro.springcore2.bean.Shape;

public class ShapeServiceImpl implements ShapeService {
	
	@Autowired
	@Qualifier("triangleBean")
	private Shape shape; //dependency 
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	@Override
	public void findArea() {	
		double result = shape.area();
		System.out.println("Area: "+result);
	}

}
