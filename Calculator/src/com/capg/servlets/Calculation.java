package com.capg.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int oper1=Integer.parseInt(request.getParameter("operation1"));
		int oper2=Integer.parseInt(request.getParameter("operation2"));
		String action=request.getParameter("action");
		int value = 0;
		if(action.equals("Addition"))
		{
			value=oper1+oper2;
		}
		else if(action.equals("Subtraction"))
		{
			value=oper1-oper2;
		}
		else if(action.equals("Multiplication"))
		{
			value=oper1*oper2;
		}
		System.out.println(value);
		RequestDispatcher dispatcher=request.getRequestDispatcher("showServlet");
		request.setAttribute("result", value);
		dispatcher.forward(request, response);
	}

}
