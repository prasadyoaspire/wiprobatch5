package com.wipro.springcore.bean;

public class Customer {

	private int customerId;
	private String fistName;
	private String lastName;
	private int age;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fistName=" + fistName + ", lastName=" + lastName + ", age="
				+ age + "]";
	}
		
}
