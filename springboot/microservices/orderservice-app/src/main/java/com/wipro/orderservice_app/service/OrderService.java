package com.wipro.orderservice_app.service;

import java.util.List;

import com.wipro.orderservice_app.entity.Order;

public interface OrderService {
	
	Order saveOrder(Order order);
	
	Order getOrderDetails(int orderId);
	
	List<Order> getAllOrders();

}
