package com.wipro.customerservice_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.customerservice_app.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
