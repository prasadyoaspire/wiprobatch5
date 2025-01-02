package com.wipro.springcore.service;

public class HelloService {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		
		System.out.println("Message: "+message);
	}
	
}
