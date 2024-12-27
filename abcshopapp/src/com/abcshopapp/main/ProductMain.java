package com.abcshopapp.main;

import java.util.Scanner;
import com.abcshopapp.service.ProductService;
import com.abcshopapp.service.ProductServiceImpl;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter customerId");
		int customerId = sc.nextInt();
		
		System.out.println("Enter productId");
		int pId = sc.nextInt();
		
		System.out.println("Enter Quantity");
		int qty = sc.nextInt();
		
		sc.close();
		
		//calling service 
		ProductService productService = new ProductServiceImpl();
		double orderAmount = productService.calcualeOrderAmount(customerId, pId, qty);
		
		System.out.println("OrderAmount : "+orderAmount);;
	}

}
