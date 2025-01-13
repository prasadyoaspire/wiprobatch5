package com.wipro.wipromart.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name="customer_tbl")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	
	//@Pattern(regexp = "[A-Za-z]{5,15}", message = "Please provide valid firstName")
	
	@Column(length = 50, nullable = false)
	private String firstName;
	
	@Column(length = 50)
	private String lastName;
	
	//@Email(message = "Please provide a valid email address")
	
	@Column(length = 50, nullable = false, unique = true)
	private String email;

	//@Pattern(regexp = "\\d{10}", message = "Kindly Provide a Valid Mobile number")
	
	@Column(length = 10)
	String mobile;
	
	@Column(length = 30)
	private String city;
	
	@JsonIgnore
	@OneToMany(mappedBy="customer")
	private List<Order> orders;

}
