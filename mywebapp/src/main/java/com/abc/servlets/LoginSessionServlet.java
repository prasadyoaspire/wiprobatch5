package com.abc.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginSessionServlet
 */
@WebServlet("/LoginSessionServlet")
public class LoginSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		String password = request.getParameter("upwd");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");		
		if(username.equals("admin") && password.equals("1234")) {			
			//create a session			
			HttpSession session = request.getSession();	// session id is generated and added to the response
			
			session.setAttribute("myUsername", username);				
			out.println("<h2>Login Success</h2>");		
			
			out.println("<a href='DashBoardServlet'>Go To DashBoard Page</a>");
			
			out.println("<h4>Session Data</h4>");
			out.println("<br>Session Id: "+session.getId());
			
//			response.sendRedirect("DashBoardServlet");
		}			
		else {
			out.println("<h2>Login Failed</h2>");
		}
		
		out.println("</body></html>");		
		out.close();		
		
	}
}
