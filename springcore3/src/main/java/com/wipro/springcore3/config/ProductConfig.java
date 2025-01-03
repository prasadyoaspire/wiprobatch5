package com.wipro.springcore3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.springcore3.controller.ProductController;
import com.wipro.springcore3.dao.ProductDao;
import com.wipro.springcore3.dao.ProductDaoImpl;
import com.wipro.springcore3.service.ProductService;
import com.wipro.springcore3.service.ProductServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.wipro.springcore3")
public class ProductConfig {

//	@Bean
//	public ProductDao getProductDaoBean() {		
//		ProductDao productDao = new ProductDaoImpl();
//		return productDao;
//	}
//	
//	@Bean
//	public ProductService getProductServiceBean() {				
//		ProductServiceImpl productService = new ProductServiceImpl();
////		productService.setProductDao(getProductDaoBean()); //injecting dependency
//		return productService;
//	}
//	
//	@Bean
//	public ProductController getProductControllerBean() {				
//		ProductController productController = new ProductController();
////		productController.setProductService(getProductServiceBean());//injecting dependency
//		return productController;
//	}
}
