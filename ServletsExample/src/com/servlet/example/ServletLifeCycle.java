package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLifeCycle extends GenericServlet{
	
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("initialisation is done for servlet");
	}

	
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		PrintWriter out = servletResponse.getWriter();
		out.write("Initialisation for servlet is completed..... and now serlvet is in service method");
	}	
	
	
	 public void destroy() {
		 System.out.println("servlet is destoryed !!!");
	 }


}
