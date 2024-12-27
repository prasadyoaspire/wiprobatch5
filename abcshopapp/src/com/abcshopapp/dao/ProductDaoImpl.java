package com.abcshopapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.abcshopapp.dto.Product;
import com.abcshopapp.util.DBUtil;

public class ProductDaoImpl implements ProductDao {

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product findById(int productId) {
		
		String sql = "select * from product_tbl where product_id = ?";
		
		Product product = null;
		
		try(Connection con = DBUtil.getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql);) {
			
			ps.setInt(1, productId);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				//get the data from ResultSet object
				int pId = rs.getInt(1);
				String productName = rs.getString(2);
				double productPrice = rs.getDouble(3);
				Date mfd = rs.getDate(4);
				String category = rs.getString(5);
				
				//set the data into product object
				product = new Product();
				product.setProductId(pId);
				product.setProductName(productName);
				product.setProductPrice(productPrice);
				product.setMfd(null);
				product.setCategory(category);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return product;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
