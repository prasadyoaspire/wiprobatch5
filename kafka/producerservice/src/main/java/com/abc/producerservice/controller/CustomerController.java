package com.abc.producerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.producerservice.model.Customer;
import com.abc.producerservice.service.CustomerProducerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerProducerService customerProducerService;

	@PostMapping("/customer")
	private ResponseEntity<String> sendCustomer(@RequestBody Customer customer) {
		
		customerProducerService.sendCustomerMessage(customer);
		
		return new ResponseEntity<>("message sent",HttpStatus.OK);
	}
	
}
