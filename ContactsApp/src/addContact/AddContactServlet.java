package addContact;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import displayContacts.ContactBean;

public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
		PrintWriter out=response.getWriter();
		
		ContactBean c=new ContactBean();
		c.setContactName(request.getParameter("cname"));
		c.setContactNumber(request.getParameter("cnumber"));
		
		AddContactDao a=new AddContactDao();
		a.connect();
		boolean status=a.addContact(c);
		if (status == true) {
			response.sendRedirect("DisplayContact.jsp");
		} else {
			out.println("<h3>error");
		}

		
		
		
	}

}
