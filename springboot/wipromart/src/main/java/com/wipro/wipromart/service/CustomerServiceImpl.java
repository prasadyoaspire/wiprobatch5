package com.wipro.wipromart.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.wipromart.entity.Customer;
import com.wipro.wipromart.exception.ResourceNotFoundException;
import com.wipro.wipromart.model.CustomerDto;
import com.wipro.wipromart.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		
		//convert dto to entity
//		Customer customer = new Customer();
//		customer.setFirstName(customerDto.getFirstName());
//		customer.setLastName(customer.getLastName());
//		customer.setEmail(customerDto.getEmail());
//		customer.setCity(customerDto.getCity());
//		customer.setMobile(customerDto.getMobile());
		
		//ModelMapper modelMapper = new ModelMapper();
	
		Customer customer = modelMapper.map(customerDto, Customer.class);
		
		Customer newCustomer = customerRepository.save(customer);
		
		//convert entity to dto		
//		customerDto.setCustomerId(newCustomer.getCustomerId());
//		customerDto.setFirstName(newCustomer.getFirstName());
//		customerDto.setLastName(newCustomer.getLastName());
//		customerDto.setEmail(newCustomer.getEmail());
//		customerDto.setMobile(newCustomer.getMobile());
//		customerDto.setCity(newCustomer.getCity());
		
		customerDto = modelMapper.map(newCustomer, CustomerDto.class);
		
		return customerDto;
	}

	@Override
	public CustomerDto getCustomerById(long customerId) {
		
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		
		if(optionalCustomer.isEmpty()) {
			throw new ResourceNotFoundException("Customer not found with id: "+customerId);
		}
		
		Customer customer = optionalCustomer.get();	
		
		//convert entity to dto
//		CustomerDto customerDto = new CustomerDto();
//		customerDto.setCustomerId(customer.getCustomerId());
//		customerDto.setFirstName(customer.getFirstName());
//		customerDto.setLastName(customer.getLastName());
//		customerDto.setEmail(customer.getEmail());
//		customerDto.setMobile(customer.getMobile());
//		customerDto.setCity(customer.getCity());
		
		//ModelMapper modelMapper = new ModelMapper();
		
		CustomerDto customerDto = modelMapper.map(customer, CustomerDto.class);	
			
		return customerDto;
	}

	@Override
	public List<CustomerDto> getAllCustomers() {
		
		List<Customer> customers =  customerRepository.findAll();
		
		//convert entity list to dto list
		List<CustomerDto> customerDtos = new ArrayList<>();
		
		customers.forEach(c-> {
			
//			CustomerDto customerDto = new CustomerDto();
//			customerDto.setCustomerId(c.getCustomerId());
//			customerDto.setFirstName(c.getFirstName());
//			customerDto.setLastName(c.getLastName());
//			customerDto.setEmail(c.getEmail());
//			customerDto.setMobile(c.getMobile());
//			customerDto.setCity(c.getCity());
						
			CustomerDto customerDto = modelMapper.map(c, CustomerDto.class);
			
			customerDtos.add(customerDto);
			
		});
		
		return customerDtos;
		
	}
}
