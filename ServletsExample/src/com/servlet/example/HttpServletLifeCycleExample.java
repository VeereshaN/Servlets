package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletLifeCycleExample extends HttpServlet {
	public void init(ServletConfig config) {

		System.out.println("inside the the httHttpServletExamplepse");
	}

	// this method has priority  because web container calls always sends
	// servletRequest not the http request
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.write("service method inside the HttpServletExample ");
		
		  if (!(req instanceof HttpServletRequest &&
	                res instanceof HttpServletResponse)) {
	            throw new ServletException("non-HTTP request or response");
	        }

	        service((HttpServletRequest) req, (HttpServletResponse) res);
	}

	//web container will never call this method directly. Web container call above service method which call this method 
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.write("service method inside the HttpServletExample with HttpServletRequest as request parameter");
	}

	public void destroy() {
		System.out.println("called destory method");
	}

}
