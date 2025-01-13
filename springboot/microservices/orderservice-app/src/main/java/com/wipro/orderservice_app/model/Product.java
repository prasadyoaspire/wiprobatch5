package com.wipro.orderservice_app.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Product {

	private int productId;
	private String productName;
	private double productPrice;
	private LocalDate mfd;
	private String category;
	
}