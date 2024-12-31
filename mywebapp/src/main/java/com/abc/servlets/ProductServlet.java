package com.abc.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import com.abc.model.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get all the parameters
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		double productPrice = Double.parseDouble(request.getParameter("productPrice"));
		String mfd = request.getParameter("mfd"); //need to convert into LocalDate
		String category = request.getParameter("category");
		
		//convert string date to LocalDate
		LocalDate productMfd = LocalDate.parse(mfd);
		
		//call the service (assume that service method return product object)
		Product product = new Product();
		product.setProductId(productId);
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		product.setMfd(productMfd);
		product.setCategory(category);
		
		//add the model data from service to the request object
		request.setAttribute("myProduct", product);
		
		//session.setAttribute("myProduct", product);
		
		//context.setAttribute("myProduct", product);
		
		//dispatch the request to jsp for presentation
		RequestDispatcher rd = request.getRequestDispatcher("product_success.jsp");
		rd.forward(request, response);		
	}

}
