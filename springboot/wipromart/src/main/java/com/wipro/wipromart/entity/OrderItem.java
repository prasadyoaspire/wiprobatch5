package com.wipro.wipromart.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Entity
@Table(name="order_item_tbl")
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderItemId;
	
	private double itemTotal;	
	private int qty;
	
//	@OneToOne
//	@JoinColumn(name="product_id")
//	private Product product;
	
	private long productId;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
	
}
