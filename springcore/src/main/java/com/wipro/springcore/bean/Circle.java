package com.wipro.springcore.bean;

public class Circle implements Shape {
	
	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		System.out.println("Circle Area");
		double result = 3.14 * radius * radius;
		return result;
	}

}
