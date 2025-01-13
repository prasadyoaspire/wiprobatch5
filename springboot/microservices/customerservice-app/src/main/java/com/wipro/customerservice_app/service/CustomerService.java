package com.wipro.customerservice_app.service;

import java.util.List;

import com.wipro.customerservice_app.entity.Customer;


public interface CustomerService {

	Customer saveCustomer(Customer customer);
	
	Customer getCustomerById(long customerId);
	
	List<Customer> getAllCustomers();
}
