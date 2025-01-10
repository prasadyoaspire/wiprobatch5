package com.wipro.wipromart.service;

import java.util.List;

import com.wipro.wipromart.entity.Product;

public interface ProductService {

	Product saveProduct(Product product);
	
	Product getProductById(long productId);
	
	List<Product> getAllProducts();
	
	void deleteProduct(long productId);
}
