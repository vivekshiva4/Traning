package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.LNEG;
public class ServTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		String firstName=request.getParameter("fname");
		String lastName =request.getParameter("lname");
		
		PrintWriter out=response.getWriter();
		out.println("<h1>FirstNAme is :"+firstName);
		out.println("<h1>LastName is :"+lastName);
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
doGet(req, resp);
	}
}
