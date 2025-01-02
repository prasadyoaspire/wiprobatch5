package com.wipro.hibernatedemo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	public static Session getHibernateSession() {
		
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
				
				return session;
		
	}
}
