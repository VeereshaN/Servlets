package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionExample2 extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		PrintWriter out = res.getWriter();
		out.write("HttpSessionExample2SessionId : "+ session.getId()+"\n");
		out.write("HttpSessionExampleSessionId : "+session.getAttribute("HttpSessionExampleSessionId")+"\n");
		out.write("SessionId are same in both servlets \n");
		out.write("CityName "+ session.getAttribute("Cityname"));
		out.close();
	}

}
