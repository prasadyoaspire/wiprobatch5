package com.wipro.wipromart.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
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
	
	@Test
	void testSaveProduct() {
		
		Product product = new Product();
		product.setProductId(200);
		product.setProductName("MyProduct");
		product.setProductPrice(5000);
		product.setMfd(LocalDate.of(2024, 10, 10));
		product.setCategory("dummy");
		
		when(productRepository.save(product)).thenReturn(product);
		
		Product newProduct = productService.saveProduct(product);
		
		assertEquals(200,newProduct.getProductId());
		assertEquals("MyProduct",newProduct.getProductName());
		assertEquals(5000,newProduct.getProductPrice());
		assertEquals("2024-10-10",newProduct.getMfd().toString());		
	}
	
	@Test
	void testGetAllProducts() {
		
		Product product = new Product();
		product.setProductId(200);
		product.setProductName("MyProduct-1");
		product.setProductPrice(5000);
		product.setMfd(LocalDate.of(2024, 10, 10));
		product.setCategory("dummy");
		
		Product product1 = new Product();
		product1.setProductId(300);
		product1.setProductName("MyProduct-2");
		product1.setProductPrice(6000);
		product1.setMfd(LocalDate.of(2024, 10, 10));
		product1.setCategory("dummy");
		
		Product product2 = new Product();
		product2.setProductId(300);
		product2.setProductName("MyProduct-3");
		product2.setProductPrice(7000);
		product2.setMfd(LocalDate.of(2024, 10, 10));
		product2.setCategory("dummy");
		
		List<Product> myProducts = new ArrayList<>();		
		myProducts.add(product);
		myProducts.add(product1);
		myProducts.add(product2);
		
		when(productRepository.findAll()).thenReturn(myProducts);
		
		List<Product> productList = productService.getAllProducts();
		
		assertEquals(myProducts.size(),productList.size());
			
	}
	
	@Test
	void testDeleteProduct() {
		
		Product product = new Product();
		product.setProductId(200);
		product.setProductName("MyProduct");
		product.setProductPrice(5000);
		product.setMfd(LocalDate.of(2024, 10, 10));
		product.setCategory("dummy");
		
		Optional<Product> optionalProduct = Optional.of(product);
		
		when(productRepository.findById(200L)).thenReturn(optionalProduct);
		
		//when(productRepository.delete(optionalProduct.get()))
		
		doNothing().when(productRepository).delete(product);
		
	    productService.deleteProduct(200); // return type is void 
	    	    
	    verify(productRepository,times(1)).findById(200L);
	    verify(productRepository,times(1)).delete(product);			    
	
	}
		
}
