package com.abcshopapp.dao;

import java.util.List;

import com.abcshopapp.dto.Product;

public interface ProductDao {

	void save(Product product);
	
    Product findById(int productId);
	
	List<Product> findAll();
	
}
