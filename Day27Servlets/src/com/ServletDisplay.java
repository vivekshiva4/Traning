package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String from=request.getParameter("orgin");
		String to=request.getParameter("destination");
		
		out.println("<h1>Orgin is :"+from);
		out.println("<h1>Destination is:"+to);
		out.println("<h3><a href=index.html>Add new route</a>");
	}

}
