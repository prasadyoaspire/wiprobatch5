package com.abc.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TargetServlet
 */
@WebServlet("/TargetServlet")
public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		
		int cube = num1*num1*num1;
		
		PrintWriter out = response.getWriter();
		
        out.println("<html><body>");
		
		out.println("<h2>Cuber Of The Number: "+cube+"</h2>");
		
		out.println("</body></html>");
		
		out.close();	
	}

}
