package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setIntHeader("Refresh", 5);
		response.setContentType("text/html");
		
		Calendar c=new GregorianCalendar();
		String am_pm;
		int hour=c.get(Calendar.HOUR);
		int minutes=c.get(Calendar.MINUTE);
		if(c.get(Calendar.AM_PM)==0){
			am_pm="AM";
		}
		else{
			am_pm="PM";
		}
	      String CT = hour+":"+ minutes +" "+ am_pm;
	      PrintWriter out=response.getWriter();
	      out.println("<h1>Current Time Is:");
	      out.println("<h1>"+CT);

	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
doGet(req, resp);
}
}
