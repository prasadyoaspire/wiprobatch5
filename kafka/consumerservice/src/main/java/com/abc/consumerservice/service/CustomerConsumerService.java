package com.abc.consumerservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.abc.producerservice.model.Customer;

@Service
public class CustomerConsumerService {

	@KafkaListener(topics = "customerTopic", groupId = "sample-group")
	public void consumeMessage(Customer customer) {
		System.out.println("Message From Broker: "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getAge());
	}
}
