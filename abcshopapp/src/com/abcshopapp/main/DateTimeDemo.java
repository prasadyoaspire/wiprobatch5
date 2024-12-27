package com.abcshopapp.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeDemo {

	public static void main(String[] args) {
			
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//LocalDate dob = LocalDate.of(2001, 10, 30);
		
		LocalDate dob = LocalDate.of(2001, Month.OCTOBER, 30);
		System.out.println("DOB:"+ dob);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		//date manipulation
		
		LocalDate todaysDate = LocalDate.now();
		
		LocalDate afterDays = todaysDate.plusDays(35);
		
		System.out.println("After 35 days, date is : "+afterDays);		
		
		//task : input is date of birth ; calculate the age
	}
}
