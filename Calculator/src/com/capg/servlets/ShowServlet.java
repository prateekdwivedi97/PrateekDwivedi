package com.capg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showServlet")
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			int value=(int)( request.getAttribute("result"));
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			out.println("<html><body>");
			out.println("After operation value is:"+value);
			out.println("</body></html>");
			out.close();
	}

}
