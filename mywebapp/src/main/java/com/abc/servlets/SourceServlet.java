package com.abc.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SourceServlet
 */
@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String param1 = request.getParameter("num1");
		
		if(param1 != "") {
			
			//forward the req to the TargetServlet
			RequestDispatcher rd = request.getRequestDispatcher("TargetServlet");
			rd.forward(request, response);
		}				
				
	}

}
