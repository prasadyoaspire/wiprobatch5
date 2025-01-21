package com.abc.producerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.abc.producerservice.model.Customer;

@Service
public class CustomerProducerService {

	@Autowired
	private KafkaTemplate<String,Customer> kafkaTemplate;
	
	public void sendCustomerMessage(Customer customer) {
		
		kafkaTemplate.send("customerTopic", customer);
	}	
}
