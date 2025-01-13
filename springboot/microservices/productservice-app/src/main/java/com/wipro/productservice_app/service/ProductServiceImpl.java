package com.wipro.productservice_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.productservice_app.entity.Product;
import com.wipro.productservice_app.exception.ResourceNotFoundException;
import com.wipro.productservice_app.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {	
		productRepository.save(product);		
		return product;
	}

	@Override
	public Product getProductById(long productId) {
	
		Optional<Product> optionalProduct = productRepository.findById(productId);
		
		if(optionalProduct.isEmpty()) {		
			throw new ResourceNotFoundException("Product not found with id: "+productId);
		}
		
		Product product = optionalProduct.get();		
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
	
		return productRepository.findAll();
	}

	@Override
	public void deleteProduct(long productId) {
		
		Optional<Product> optionalProduct = productRepository.findById(productId);
		
		if(optionalProduct.isEmpty()) {		
			throw new ResourceNotFoundException("Product not found with id: "+productId);
		}
				
		Product product = optionalProduct.get();	
		
		productRepository.delete(product);		
	}

}
