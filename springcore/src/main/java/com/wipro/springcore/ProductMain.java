package com.wipro.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springcore.bean.Product;

public class ProductMain {

	public static void main(String[] args) {
		
		//Product myProduct = new Product(10,"NewPhone",50000);
		
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("springcontext.xml");	
		Product myProduct = (Product) context.getBean("myProduct");
		
		System.out.println("Id: "+myProduct.getProductId());
		System.out.println("Name: "+myProduct.getProductName());
		System.out.println("Price: "+myProduct.getProductPrice());

	}

}
