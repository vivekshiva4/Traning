package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactLoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		PrintWriter out =response.getWriter();
		
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		
		ContactLoginDao c=new ContactLoginDao();
		c.connect();
		boolean status=c.validateUser(userId, password);
		if(status==true){
			response.sendRedirect("DisplayContact.jsp");
		}
		else{
			out.println("<b>Invalid Login Info.</b><br>");
			rd = request.getRequestDispatcher("/ContactsLogin.html"); 
			rd.include(request, response); 
		}
		
	}

}
