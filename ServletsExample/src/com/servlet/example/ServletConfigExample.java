package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigExample extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		ServletConfig config = getServletConfig();
		String servletInitParam = config.getInitParameter("cityName");
		String servletContextParam = config.getServletContext().getInitParameter("stateName");
		PrintWriter out = resp.getWriter();
		out.write("\nServletConfigExample is initialised with cityName : "+ servletInitParam);
		out.write("\nweb Application is initialised with stateName : "+ servletContextParam);
		out.close();
		
	}

}
