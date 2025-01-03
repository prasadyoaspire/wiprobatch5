package com.wipro.springcore3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.springcore3.config.ProductConfig;
import com.wipro.springcore3.controller.ProductController;
import com.wipro.springcore3.model.Product;

public class Main {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setProductId(10);
		p1.setProductName("Phone-1");
		p1.setProductPrice(20000);
		
		Product p2 = new Product();
		p2.setProductId(20);
		p2.setProductName("Phone-2");
		p2.setProductPrice(30000);
		
		Product p3 = new Product();
		p3.setProductId(30);
		p3.setProductName("Phone-3");
		p3.setProductPrice(40000);

		
		ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);

		ProductController pController = context.getBean(ProductController.class);
						
		pController.addNewProduct(p1);
		pController.addNewProduct(p2);
		pController.addNewProduct(p3);
				
		
		pController.fetchAllProducts();

	}

}
