package com.wipro.wipromart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.wipromart.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {

}
