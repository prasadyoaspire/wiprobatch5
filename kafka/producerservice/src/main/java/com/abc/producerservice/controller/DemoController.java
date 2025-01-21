package com.abc.producerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.producerservice.service.ProducerService;

@RestController
@RequestMapping("/api")
public class DemoController {

	@Autowired
	private ProducerService producerService;

	@PostMapping("/send")
	public ResponseEntity<String> produce(@RequestBody String textMsg) {
		
		producerService.sendMessage(textMsg);
		
		return new ResponseEntity<>("Message Sent",HttpStatus.OK);
	}
}
