package com.wipro.springcore2;

import com.wipro.springcore2.bean.Product;
import com.wipro.springcore2.controller.ProductController;
import com.wipro.springcore2.dao.ProductDaoImpl;
import com.wipro.springcore2.service.ProductService;
import com.wipro.springcore2.service.ProductServiceImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		
//		ProductController pController = new ProductController();	
//		
//		ProductDaoImpl productDao = new ProductDaoImpl(); // service dependency object
//		
//		ProductServiceImpl pService = new ProductServiceImpl(); //controller dependency object
//		pService.setProductDao(productDao); // dao injecting 
//		
//		pController.setProductService(pService); // service injecting 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("productcontext.xml");
//		ProductController pController = (ProductController) context.getBean("pController");
		
		ProductController pController = context.getBean(ProductController.class);
		
				
		pController.addNewProduct(p1);
		pController.addNewProduct(p2);
		pController.addNewProduct(p3);
				
		
		pController.fetchAllProducts();

	}

}
