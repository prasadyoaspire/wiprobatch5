package com.wipro.springcore2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wipro.springcore2.bean.Product;
import com.wipro.springcore2.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService ; //dependency
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public void addNewProduct(Product product) {
		productService.addProduct(product);
		System.out.println("Product Added");
	}
	
	public void fetchProductDetails(int productId) {
		
		Product product = productService.getProductById(productId);
		
		if(product!=null) {
			System.out.println("Id: "+product.getProductId());
			System.out.println("Name: "+product.getProductName());
			System.out.println("Price: "+product.getProductPrice());
		}
		else {
			System.out.println("Product not found");
		}
	}
	
	public void fetchAllProducts() {
		List<Product> products = productService.getAllProducts();
		products.forEach(p-> System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()));
	}
	
}
