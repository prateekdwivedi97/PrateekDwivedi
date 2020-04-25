package com.capg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Employ")
public class EmpServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String empid=request.getParameter("emplid");
		String ename=request.getParameter("emplname");
		int salary=Integer.parseInt(request.getParameter("emplsal"));
		String eadd=request.getParameter("empladd");
		String area=request.getParameter("emplarea");
		String city=request.getParameter("emplcity");
		int pincode=Integer.parseInt(request.getParameter("epin"));
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<html><body>");
		out.println("<p>Id is "+empid+"</p><br>");
		out.println("<p>Name is "+ename+"</p>");
		out.println("<p>Salary is"+salary+"</p>");
		out.println("<p>House No. is "+eadd+"</p>");
		out.println("<p>Area is "+area+"</p>");
		out.println("<p>City is "+city+"</p>");
		out.println("<p>Pincode is "+pincode+"</p>");
		out.println("</body></html>");
		out.close();
		
	}

}
