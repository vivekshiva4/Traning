package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
@Override
public void init() throws ServletException {
	System.out.println("init method called");
}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.println("<h1>hello world");
	}

}
