package com.wipro.wipromart.service;

import java.util.List;

import com.wipro.wipromart.entity.Order;

public interface OrderService {
	
	Order saveOrder(Order order);
	
	Order getOrderDetails(int orderId);
	
	List<Order> getAllOrders();

}
