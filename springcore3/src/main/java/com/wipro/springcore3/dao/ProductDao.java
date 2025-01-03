package com.wipro.springcore3.dao;

import java.util.List;

import com.wipro.springcore3.model.Product;

public interface ProductDao {

	Product save(Product product);
	
	Product findById(int productId);
	
	List<Product> findAll();
}
