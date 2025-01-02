package com.wipro.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springcore.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("springcontext.xml");		
		Employee emp1 = (Employee) context.getBean("emp1");
		
		System.out.println("EmpId: "+emp1.getEmpId());
		System.out.println("Name: "+emp1.getEmpName());
		System.out.println("Email: "+emp1.getEmail());
		System.out.println("Skills: "+emp1.getSkills());
		
		//operation on collections

	}

}
