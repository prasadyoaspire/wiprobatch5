package com.wipro.wipromart.service;

import java.util.List;

import com.wipro.wipromart.entity.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);
	
	Customer getCustomerById(long customerId);
	
	List<Customer> getAllCustomers();
}
