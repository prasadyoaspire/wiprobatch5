package com.abcshopapp.service;

import com.abcshopapp.dto.Invoice;
import com.abcshopapp.dto.Product;

public interface ProductService {

	double calcualeOrderAmount(int customerId,int productId, int qty);
	
//	Invoice calcualeOrderAmount(int customerId,int productId, int qty);
	
	void addProduct(Product product);
}
