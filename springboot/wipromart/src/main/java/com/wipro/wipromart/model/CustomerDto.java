package com.wipro.wipromart.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerDto {
	
	private long customerId;
	
	@Pattern(regexp = "[A-Za-z]{5,15}", message = "Please provide valid firstName")	
	private String firstName;
	
	private String lastName;
	
	@Email(message = "Please provide a valid email address")
	private String email;

	@Pattern(regexp = "\\d{10}", message = "Kindly Provide a Valid Mobile number")
	
	String mobile;	

	private String city;

}
