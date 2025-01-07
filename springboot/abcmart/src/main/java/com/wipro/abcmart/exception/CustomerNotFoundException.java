package com.wipro.abcmart.exception;

public class CustomerNotFoundException extends RuntimeException {

	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
