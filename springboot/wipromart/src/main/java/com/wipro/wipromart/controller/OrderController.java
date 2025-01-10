package com.wipro.wipromart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.wipromart.entity.Order;
import com.wipro.wipromart.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@PostMapping("/save")
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		
		orderService.saveOrder(order);
		
		return new ResponseEntity<>(order,HttpStatus.CREATED);		
	}
	
	@GetMapping("/get/{orderId}")
	public ResponseEntity<Order> fetchOrder(@PathVariable int orderId) {
		
		Order order = orderService.getOrderDetails(orderId);
		
		return new ResponseEntity<>(order,HttpStatus.OK);
		
	}
}
