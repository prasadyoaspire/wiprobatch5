package com.wipro.abcmart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.abcmart.entity.Customer;
import com.wipro.abcmart.exception.CustomerNotFoundException;
import com.wipro.abcmart.repository.CustomerRepository;

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
	public Customer getCustomerById(int customerId) throws CustomerNotFoundException {
		
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);		
		if(optionalCustomer.isEmpty()) {
			
			throw new CustomerNotFoundException("Customer not existing with id:"+customerId);
		}		
		Customer customer = optionalCustomer.get();		
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		List<Customer> customerList = customerRepository.findAll();		
		return customerList;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		Optional<Customer> optionalCustomer = customerRepository.findById(customer.getCustomerId());		
		if(optionalCustomer.isEmpty()) {
			
			throw new CustomerNotFoundException("Customer not existing with id:"+customer.getCustomerId());
		}		
		
		customerRepository.save(customer);		
		
		return customer;
	}

	@Override
	public void deleteCustomer(int customerId) {
		
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		
		if(optionalCustomer.isEmpty()) {
			
			throw new CustomerNotFoundException("Customer not existing with id:"+customerId);
		}	
		
		Customer customer = optionalCustomer.get();
		
		customerRepository.delete(customer);		
	}	
}
