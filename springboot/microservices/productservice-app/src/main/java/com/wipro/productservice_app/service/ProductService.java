package com.wipro.productservice_app.service;

import java.util.List;

import com.wipro.productservice_app.entity.Product;

public interface ProductService {

	Product saveProduct(Product product);
	
	Product getProductById(long productId);
	
	List<Product> getAllProducts();
	
	void deleteProduct(long productId);
}
