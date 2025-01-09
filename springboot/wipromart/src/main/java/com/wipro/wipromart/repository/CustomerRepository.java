package com.wipro.wipromart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.wipromart.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
