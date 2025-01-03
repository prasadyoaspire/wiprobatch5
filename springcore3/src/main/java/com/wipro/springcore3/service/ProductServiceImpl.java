package com.wipro.springcore3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springcore3.dao.ProductDao;
import com.wipro.springcore3.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao; // dependency 
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public void addProduct(Product product) {
		//any logic 
		productDao.save(product);		
	}

	@Override
	public Product getProductById(int productId) {
		
		Product product = productDao.findById(productId);
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		
		List<Product> list = productDao.findAll();
		return list;
	}

}
