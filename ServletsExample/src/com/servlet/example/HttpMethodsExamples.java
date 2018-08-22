package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpMethodsExamples extends HttpServlet {
//
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		PrintWriter out = res.getWriter();
//		out.write("when no HTTP methods are implemented then service method is called irrespective of request method ");
//	}

	//First web container calls service method with request parameters ServletRequest and ServletResponse 
	//serivce method converts servletrequest to HttpRequest and calls service method with HttpRequest as parameter
	//Service method checks the request method and call corresponding doMethodType method 
	//If method type is GET it calls doGet Method 	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.write("doGet method is called when request from client is HTTP GET method ");
		printWriter.close();
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.write("doPost method is called when request from client is HTTP POST method ");printWriter.close();
		printWriter.close();

		
	}


}
