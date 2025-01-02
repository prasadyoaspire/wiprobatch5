package com.wipro.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springcore.bean.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		
//		Customer customer = new Customer();
//		customer.setCustomerId(10);
//		customer.setFistName("Raj");
//		customer.setLastName("Kumar");
//		customer.setAge(30);
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("appcontext.xml");		
		Customer customer = (Customer) context.getBean("customer1");
		
		
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getFistName());
		System.out.println(customer.getLastName());
		System.out.println(customer.getAge());

	}

}
