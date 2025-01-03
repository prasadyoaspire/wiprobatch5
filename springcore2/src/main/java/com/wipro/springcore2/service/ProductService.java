package com.wipro.springcore2.service;

import java.util.List;

import com.wipro.springcore2.bean.Product;

public interface ProductService {

	void addProduct(Product product); 
	
	Product getProductById(int productId);
	
	List<Product> getAllProducts();
}
