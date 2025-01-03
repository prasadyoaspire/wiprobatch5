package com.wipro.springcore3.service;

public class HelloService {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("Message: "+message);
	}
}
