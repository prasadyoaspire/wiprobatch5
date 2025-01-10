package com.wipro.wipromart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.wipromart.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{

}
