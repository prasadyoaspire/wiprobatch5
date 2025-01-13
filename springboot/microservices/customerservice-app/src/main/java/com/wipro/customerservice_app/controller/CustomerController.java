package com.wipro.customerservice_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.customerservice_app.entity.Customer;
import com.wipro.customerservice_app.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public ResponseEntity<Customer> addCustomer(@Valid @RequestBody Customer customer) {
		
		customerService.saveCustomer(customer);		
		return new ResponseEntity<>(customer,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{customerId}")
	public ResponseEntity<Customer> fetchCustomerById(@PathVariable long customerId) {
		
		Customer customer = customerService.getCustomerById(customerId);	
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/get/all")
	public List<Customer> fetchAllCustomers() {
		
		List<Customer> customers = customerService.getAllCustomers();
		return customers;
	}
}
