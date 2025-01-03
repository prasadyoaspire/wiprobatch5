package com.wipro.springcore2.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wipro.springcore2.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	private List<Product> productList = new ArrayList<>();

	@Override
	public Product save(Product product) {
		 
		productList.add(product);
		return product;
	}

	@Override
	public Product findById(int productId) {
		
		Iterator<Product> i = productList.iterator();
		while(i.hasNext()) {
			Product p = i.next();
			if(p.getProductId() == productId) {
				return p;
			}
		}
		
		return null;
	}

	@Override
	public List<Product> findAll() {	
		
		return productList;
	}

}
