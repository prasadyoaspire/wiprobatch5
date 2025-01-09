package com.wipro.wipromart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.wipromart.entity.Product;
import com.wipro.wipromart.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/save")
	public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) {
		
		productService.saveProduct(product);		
		return new ResponseEntity<>(product,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{productId}")
	public ResponseEntity<Product> fetchProductById(@PathVariable long productId) {
		
		Product product = productService.getProductById(productId);		
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
	
	@GetMapping("/get/all")
	public List<Product> fetchAllProducts() {
		
		List<Product> products = productService.getAllProducts();
		return products;
	}


}
