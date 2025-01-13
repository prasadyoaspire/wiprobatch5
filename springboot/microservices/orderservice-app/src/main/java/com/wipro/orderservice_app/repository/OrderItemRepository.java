package com.wipro.orderservice_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.orderservice_app.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {

}
