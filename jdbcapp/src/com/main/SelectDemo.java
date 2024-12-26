package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
		
		//String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/wiprobatch5db";
		String username = "root";
		String password = "root123";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			//step1: Load the driver 
//			Class.forName(driverName);
//			System.out.println("Driver loaded");
			
			//step2: Establish the connection
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
			
			//step3: perform database operations
			String sql = "select * from customer_tbl";
			
			st = con.createStatement();			
			rs = st.executeQuery(sql);
			
			//step4: process the result			
			while(rs.next()) {
				int customerId = rs.getInt(1);
				String customerName = rs.getString(2);
				String city = rs.getString("city");
				String email = rs.getString(4);
				
				System.out.println(customerId+ " "+customerName+" "+city+" "+email);
			}			
			
		} 
//		catch (ClassNotFoundException e) {			
//			e.printStackTrace();
//		}
		catch (SQLException e) {			
			e.printStackTrace();
		}
		
		finally {
			
			try {
				//step5: close the resources
				rs.close();
				st.close();
				con.close();
				System.out.println("Connection closed");		
			}
			catch(SQLException e) {
				e.printStackTrace();
			}				
		}
		

	}

}
