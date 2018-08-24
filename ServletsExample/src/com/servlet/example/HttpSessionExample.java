package com.servlet.example;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionExample extends HttpServlet{

	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		//Gets the session object created by web container 
		HttpSession session = req.getSession();
		System.out.println("Unique sessionId assigned by web container is  "+ session.getId());
		session.setAttribute("Cityname", "Bangalore");
		session.setAttribute("HttpSessionExampleSessionId", session.getId());
		res.sendRedirect("httpsessionexample2");
	}
}
