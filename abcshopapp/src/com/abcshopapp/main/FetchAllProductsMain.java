package com.abcshopapp.main;

import java.util.List;

import com.abcshopapp.dto.Product;
import com.abcshopapp.service.ProductService;
import com.abcshopapp.service.ProductServiceImpl;

public class FetchAllProductsMain {

	public static void main(String[] args) {
		
		ProductService productService = new ProductServiceImpl();
		List<Product> productList = productService.getAllProducts();
		
		productList.forEach(p-> System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()));

	}

}
