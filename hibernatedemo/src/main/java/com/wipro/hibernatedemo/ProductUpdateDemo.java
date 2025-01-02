package com.wipro.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernatedemo.entity.Product;
import com.wipro.hibernatedemo.util.HibernateUtil;

public class ProductUpdateDemo {

	public static void main(String[] args) {
		
		int productId = 1;
		
		Session session = HibernateUtil.getHibernateSession();
		
		Product product = session.get(Product.class, productId); // product object is inside managed state
		
		Transaction txn = session.beginTransaction();
		
		product.setProductPrice(62300); // updating object inside managed state is reflecting in database
		
		txn.commit();
		
		session.close();
		
		
		product.setProductPrice(666600); // now product is inside detached state.
		
	}
}
