package com.abcshopapp.service;

import java.util.List;

import com.abcshopapp.dao.ProductDao;
import com.abcshopapp.dao.ProductDaoImpl;
import com.abcshopapp.dto.Product;

public class ProductServiceImpl implements ProductService  {

	@Override
	public double calcualeOrderAmount(int customerId, int productId, int qty) {
		
		//calling dao to get the product details
		ProductDao productDao = new ProductDaoImpl();
		
		Product product = productDao.findById(productId);
		
		double totalPrice = product.getProductPrice() * qty;
		
		//System.out.println("Total Price = "+totalPrice);
		
		double orderAmount = totalPrice + (totalPrice* 0.05);
		
		return orderAmount;
		
			
		//TO-DO
		// return invoice object
	}

	@Override
	public void addProduct(Product product) {
		
		//calling dao to get the product details
		ProductDao productDao = new ProductDaoImpl();
		productDao.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		ProductDao productDao = new ProductDaoImpl();
		List<Product> products = productDao.findAll();
		return products;
	}

}
