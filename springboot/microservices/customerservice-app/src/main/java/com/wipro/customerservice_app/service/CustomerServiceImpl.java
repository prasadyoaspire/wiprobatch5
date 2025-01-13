package com.wipro.customerservice_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.customerservice_app.entity.Customer;
import com.wipro.customerservice_app.exception.ResourceNotFoundException;
import com.wipro.customerservice_app.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		
		customerRepository.save(customer);
		return customer;
	}

	@Override
	public Customer getCustomerById(long customerId) {
		
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		
		if(optionalCustomer.isEmpty()) {
			throw new ResourceNotFoundException("Customer not found with id: "+customerId);
		}
		
		Customer customer = optionalCustomer.get();		
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

}
