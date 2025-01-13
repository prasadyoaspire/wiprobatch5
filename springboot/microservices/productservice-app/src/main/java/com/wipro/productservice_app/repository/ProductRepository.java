package com.wipro.productservice_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.productservice_app.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
