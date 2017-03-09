package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckbokServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String one = request.getParameter("maths");
		String two = request.getParameter("physics");
		String three = request.getParameter("chemistry");

		PrintWriter out = response.getWriter();
		out.println("<h1>Checked books are");
		out.println("<h1>" + one);
		out.println("<h1>" + two);
		out.println("<h1>" + three);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
