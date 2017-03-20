package searchContact;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher rd;

		String search = request.getParameter("csearch");
		
		SearchContactDao s = new SearchContactDao();
		s.connect();

		boolean status = s.searchContact(search);
		
		if (status == true) {
		
		response.setContentType("text/html");
		out.println("<html><head>");
		out.println("<title>Contacts Information</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h4 align='right'><a href=ContactsLogin.html>Logout</a><hr>");
		out.println("<h4 align='right'><a href=DisplayContact.jsp>Home</a>");

			Connection con;
			PreparedStatement ps;
			ResultSet rs;
			Statement stmt;

			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/test", "vivek", "vivek");

				String query = "select * from contacts where contactName like '"
						+ search + "%'";
				ps = con.prepareStatement(query);
				rs = ps.executeQuery();

				out.println("<h1 align='center'>Contacts");
				out.println("<table align='center' border=1 width=50% height=50%>");
				out.println("<tr><th>S.no</th><th>Contact Name</th><th>Number</th><tr>");

				while (rs.next()) {
					int a = rs.getInt(1);
					String b = rs.getString(2);
					String c = rs.getString(3);
					out.println("<tr><td>" + a + "</td><td>" + b + "</td><td>"
							+ c + "</td></tr>");

				}
				out.print("</table>");
				out.println("</body></html>");

			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		else {
			out.println("<H4>No Contacts with that Search.<br>");
			rd = request.getRequestDispatcher("/DisplayContact.jsp");
			rd.include(request, response);
		}
	}
}
