package com.wipro.orderservice_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.orderservice_app.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{

}
