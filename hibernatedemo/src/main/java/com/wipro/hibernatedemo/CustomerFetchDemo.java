package com.wipro.hibernatedemo;

import org.hibernate.Session;

import com.wipro.hibernatedemo.entity.Customer;
import com.wipro.hibernatedemo.util.HibernateUtil;

public class CustomerFetchDemo {

	public static void main(String[] args) {
		
		int customerId = 1113;
		
		Session session = HibernateUtil.getHibernateSession();
		
		Customer customer = session.get(Customer.class, customerId);
		
		if(customer!=null) {
			System.out.println("CustomerId: "+customer.getCustomerId());
			System.out.println("CustomerName: "+customer.getCustomerName());
			System.out.println("City: "+customer.getCity());
			System.out.println("Email: "+customer.getEmail());
		}
		
		session.close();	
	}

}
