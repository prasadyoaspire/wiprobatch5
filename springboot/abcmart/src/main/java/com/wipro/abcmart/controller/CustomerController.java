package com.wipro.abcmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.abcmart.entity.Customer;
import com.wipro.abcmart.exception.CustomerNotFoundException;
import com.wipro.abcmart.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/save")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {

		customerService.saveCustomer(customer);

		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer, HttpStatus.CREATED);
		
		return responseEntity;
	}

	@GetMapping("/get/{customerId}")
	public ResponseEntity<Customer> fetchCustomer(@PathVariable("customerId") int customerId) {
		Customer customer = customerService.getCustomerById(customerId);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@GetMapping("/get/all")
	public List<Customer> fetchAllCustomer() {

		List<Customer> customers = customerService.getAllCustomers();
		return customers;
	}
	
	@PutMapping("/update")
	public ResponseEntity<Customer> modifyCustomer(@RequestBody Customer customer) {
		
		Customer updatedCustomer = customerService.updateCustomer(customer);		
		return new ResponseEntity<>(updatedCustomer,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{customerId}")
	public ResponseEntity<Void> removeCustomer(@PathVariable int customerId) {
		
		customerService.deleteCustomer(customerId);		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Customer>> fetchCustomersByCity(@RequestParam("city") String city) {
		
		//call service to get the customers by city
		List<Customer> customers = customerService.getCustomersByCity(city);
		
		return new ResponseEntity<>(customers,HttpStatus.OK);
	}	
}
