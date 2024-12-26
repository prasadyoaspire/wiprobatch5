package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/wiprobatch5db";
		String username = "root";
		String password = "root123";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter customerId");
		int customerId = sc.nextInt();
		
		System.out.println("Enter customer name");
		String customerName = sc.next();
		
		System.out.println("Enter city");
		String city = sc.next();
		
		System.out.println("Enter email");
		String email = sc.next();
		
		Connection con = null;
		
		try {
			//step1: Load the driver 
			Class.forName(driverName);
			System.out.println("Driver loaded");
			
			//step2: Establish the connection
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
			
			//step3: perform database operations
			 String sql = "insert into customer_tbl values(?,?,?,?)";
			 
			 PreparedStatement ps = con.prepareStatement(sql);
//			 ps.setInt(1,10006);
//			 ps.setString(2, "Goutam");
//			 ps.setString(3, "Noida");
//			 ps.setString(4, "goutam@tmail.com");
			 
			 ps.setInt(1,customerId);
			 ps.setString(2, customerName);
			 ps.setString(3, city);
			 ps.setString(4, email);
			 
			 ps.executeUpdate();
			
			//step4: process the result
			 System.out.println("New Customer Added");	
			
		} 
		catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		catch (SQLException e) {			
			e.printStackTrace();
		}
		
		finally {
			
			try {
				//step5: close the connection
				con.close();
				System.out.println("Connection closed");		
			}
			catch(SQLException e) {
				e.printStackTrace();
			}				
		}
		

	}

}
