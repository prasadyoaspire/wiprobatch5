package com.wipro.hibernatedemo;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernatedemo.entity.Product;
import com.wipro.hibernatedemo.util.HibernateUtil;

public class ProductSaveDemo {

	public static void main(String[] args) {
		
		Product product = new Product();
//		product.setProductId(1111111);
		product.setProductName("DellXP");
		product.setProductPrice(163000);
		product.setMfd(LocalDate.of(2025, 01, 02));
		product.setCategory("Laptop");
		
		//saving product		
		Session session = HibernateUtil.getHibernateSession();
		
		Transaction txn = session.beginTransaction();
		
//		session.save(product);
		session.persist(product); // from hibernate 6.0 version
		
		txn.commit();
		
		System.out.println("New Product saved");
		
		session.close();
	}

}
