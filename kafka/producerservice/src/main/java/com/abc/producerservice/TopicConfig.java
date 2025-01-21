package com.abc.producerservice;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {

	@Bean
	NewTopic createTopic() {
		return TopicBuilder.name("customerTopic").build();
	}
}
