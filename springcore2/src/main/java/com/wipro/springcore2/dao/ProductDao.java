package com.wipro.springcore2.dao;

import java.util.List;

import com.wipro.springcore2.bean.Product;

public interface ProductDao {

	Product save(Product product);
	
	Product findById(int productId);
	
	List<Product> findAll();
}
