package com.wipro.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.wipro.hibernatedemo.entity.Customer;

public class CustomerSaveDemo {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setCustomerId(223344);
		customer.setCustomerName("Arya");
		customer.setCity("Hyd");
		customer.setEmail("aray@tmail.com");

		// how to save customer object

		// we need a session object to perform database operations

		// how to create a session object? Using SessionFactory

		// how to create a SessionFactory?

		// Step1: Create registry
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		//Step2: Create MetadataSources
		MetadataSources sources = new MetadataSources(registry);

		//Step3:Create Metadata
		Metadata metadata = sources.getMetadataBuilder().build();

		//Step4: Create SessionFactory
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		
		//Step5: Create Session
		Session session = sessionFactory.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(customer);	
		
		txn.commit();		
		System.out.println("New Customer Saved");
		
		session.close();
		
		sessionFactory.close();

	}
}
