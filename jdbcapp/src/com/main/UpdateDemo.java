package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {

	public static void main(String[] args) {
		
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/wiprobatch5db";
		String username = "root";
		String password = "root123";
		
		Connection con = null;
		
		try {
			//step1: Load the driver 
			Class.forName(driverName);
			System.out.println("Driver loaded");
			
			//step2: Establish the connection
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
			
			//step3: perform database operations
			String sql = "update customer_tbl set city = ? where customer_id = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, "Hyderabad");
			ps.setInt(2, 1113);
			
			ps.executeUpdate();
			
			//step4: process the result
			System.out.println("Customer Record updated");	
			
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
