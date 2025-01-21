package com.abc.consumerservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics = "sampleTopic", groupId = "sample-group")
	public void consumeMessage(String msg) {
		System.out.println("Message From Broker: "+msg);
	}
}
