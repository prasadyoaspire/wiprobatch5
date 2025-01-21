package com.abc.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics = "testTopic", groupId = "sample-group")
	public void consumeMessage(String msg) {
		System.out.println("Message From Broker: "+msg);
	}
}
