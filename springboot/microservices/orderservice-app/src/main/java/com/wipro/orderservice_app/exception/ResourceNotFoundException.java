package com.wipro.orderservice_app.exception;

public class ResourceNotFoundException extends RuntimeException  {

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
