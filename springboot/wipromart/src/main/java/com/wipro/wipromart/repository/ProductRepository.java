package com.wipro.wipromart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.wipromart.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
