package com.wipro.customerservice_app.exception;

public class ResourceNotFoundException extends RuntimeException  {

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
