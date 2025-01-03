package com.wipro.springcore3.service;

import java.util.List;

import com.wipro.springcore3.model.Product;

public interface ProductService {

	void addProduct(Product product); 
	
	Product getProductById(int productId);
	
	List<Product> getAllProducts();
}
