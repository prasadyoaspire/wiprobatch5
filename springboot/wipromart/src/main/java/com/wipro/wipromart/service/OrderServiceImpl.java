package com.wipro.wipromart.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.wipromart.entity.Customer;
import com.wipro.wipromart.entity.Order;
import com.wipro.wipromart.entity.OrderItem;
import com.wipro.wipromart.entity.Product;
import com.wipro.wipromart.exception.ResourceNotFoundException;
import com.wipro.wipromart.repository.OrderItemRepository;
import com.wipro.wipromart.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
//	@Autowired
//	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService;

	@Override
	public Order saveOrder(Order order) {
	
		long customerId = order.getCustomer().getCustomerId();
		
		//using cusomerId get the customer details
		//Customer customer = customerService.getCustomerById(customerId);
		
	    Customer customer = null;
		
		List<OrderItem> orderItemList = order.getOrderItems();
		
		double orderTotal = 0;
		
		for(OrderItem oi : orderItemList) {
			
			int qty = oi.getQty();
			
//			long productId = oi.getProduct().getProductId();
			
			long productId = oi.getProductId();
			
			//get Product price by productId
			Product product = productService.getProductById(productId);			
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
		order.setCustomer(customer);
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
