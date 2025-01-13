package com.wipro.orderservice_app.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.orderservice_app.entity.Order;
import com.wipro.orderservice_app.entity.OrderItem;
import com.wipro.orderservice_app.exception.ResourceNotFoundException;
import com.wipro.orderservice_app.model.Customer;
import com.wipro.orderservice_app.model.Product;
import com.wipro.orderservice_app.repository.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Order saveOrder(Order order) {
	
		long customerId = order.getCustomerId();
		
		// using customerId,we can get customer details. but how?		
		// call customer microservice using RestTemplate		
		ResponseEntity<Customer> customerRespEntity = restTemplate.getForEntity("http://localhost:8082/customer/get/"+customerId, Customer.class);
		Customer customer = customerRespEntity.getBody();
		
		
		List<OrderItem> orderItemList = order.getOrderItems();
		
		double orderTotal = 0;
		
		for(OrderItem oi : orderItemList) {
			
			int qty = oi.getQty();
			
//			long productId = oi.getProduct().getProductId();
			
			long productId = oi.getProductId();
			
			//get Product from productId using restTemplate
			
			ResponseEntity<Product> responseEntity = restTemplate.getForEntity("http://localhost:8081/product/get/"+productId,Product.class);
			Product product = responseEntity.getBody();
			
			double productPrice = product.getProductPrice();
			
			//calculate item total
			double itemTotal = productPrice * qty;
		
			//update item total in OrderItem
			oi.setItemTotal(itemTotal);
			
//			oi.setProduct(product);
			
			//calculate orderTotal
			orderTotal = orderTotal + itemTotal;		
			
			//set this orderItem to the Order object
			oi.setOrder(order);		
			
			//save orderItem
			//orderItemRepository.save(oi); //using cascase option we can avoid this
			
		}
		
		//update the order object
		
		order.setOrderAmount(orderTotal);
		order.setOrderDate(LocalDate.now());
		order.setOrderStatus("Success");
//		order.setCustomer(customer);
		order.setOrderItems(orderItemList);
		
		orderRepository.save(order);	
		
		return order;
	}

	@Override
	public Order getOrderDetails(int orderId) {
		
		Optional<Order> optionalOrder = orderRepository.findById(orderId);
		if(optionalOrder.isEmpty()) {
			throw new ResourceNotFoundException("Order not found");
		}
		Order order = optionalOrder.get();
		return order;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
