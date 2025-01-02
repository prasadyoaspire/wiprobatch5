package com.wipro.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernatedemo.entity.Product;
import com.wipro.hibernatedemo.util.HibernateUtil;

public class ProductDeleteDemo {

	public static void main(String[] args) {
		
		int productId = 2;
		
		Session session = HibernateUtil.getHibernateSession();
		
		Product product = session.get(Product.class, productId); // product object is inside managed state
		
		Transaction txn = session.beginTransaction();
		
		//session.delete(product);
		session.remove(product); // from hibernate 6.0 version
		
		txn.commit();
		session.close();

	}

}
