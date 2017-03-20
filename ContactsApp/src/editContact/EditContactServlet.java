package editContact;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EditContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		RequestDispatcher rd;
		
		int sno=Integer.parseInt(request.getParameter("cnum"));
		String name=request.getParameter("cname");
		String num=request.getParameter("cnumber");
		
		EditContactDao e=new EditContactDao();
		e.connect();
		boolean status=e.editContact(num, name,sno);
		
		if(status==true){
			response.sendRedirect("DisplayContact.jsp");
		}
		else{
			out.println("<b>You are providing Invalid Info.</b><br>");
			rd = request.getRequestDispatcher("/EditContact.jsp"); 
			rd.include(request, response); 

		}
	}

}
