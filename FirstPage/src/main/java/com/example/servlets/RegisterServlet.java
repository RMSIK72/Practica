package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
			  throws ServletException,IOException {
			  PrintWriter out= response.getWriter();
			  response.setContentType("text/html");
			  out.println(request.getParameter("firstname")+" "+ request.getParameter("lastname")+ " "+request.getParameter("gender") );
		 	  out.close();	 
			 }
	
}
