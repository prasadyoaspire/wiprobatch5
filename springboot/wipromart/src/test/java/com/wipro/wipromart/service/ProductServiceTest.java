package com.wipro.wipromart.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.wipromart.entity.Product;
import com.wipro.wipromart.exception.ResourceNotFoundException;
import com.wipro.wipromart.repository.ProductRepository;

@SpringBootTest
public class ProductServiceTest {

	@InjectMocks
	private ProductService productService = new ProductServiceImpl();
	
	@Mock
	private ProductRepository productRepository;
	
	@Test
	void testGetProducutById() {
		
		Product product = new Product();
		product.setProductId(200);
		product.setProductName("MyProduct");
		product.setProductPrice(5000);
		product.setMfd(LocalDate.of(2024, 10, 10));
		product.setCategory("dummy");
		
		Optional<Product> optionalProduct = Optional.of(product);
		
		when(productRepository.findById(200L)).thenReturn(optionalProduct);
		
		Product actualProduct = productService.getProductById(200);
		
		assertEquals("MyProduct",actualProduct.getProductName());		
		assertEquals(5000,actualProduct.getProductPrice());		
		
	}
	
	@Test
	void testGetProducutByIdWithException() {
		
		when(productRepository.findById(200L)).thenThrow(ResourceNotFoundException.class);
				
		assertThrows(ResourceNotFoundException.class, ()-> productService.getProductById(200));		
	}
		
}
