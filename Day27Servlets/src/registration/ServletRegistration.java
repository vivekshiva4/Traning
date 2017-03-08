package registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		Registration r=new Registration();
		r.setFirstName(request.getParameter("fname"));
		r.setLastName(request.getParameter("lname"));
		r.setEmail(request.getParameter("email"));
		
		RegistrationDao d=new RegistrationDao();
		d.connect();
		boolean status=d.saveData(r);
		if(status==true){
			out.println("Data Saved to DataBase sucessfuly ");
		}
		else{
			out.println("Data not saved to Data Base");
		}
		out.println("<h1><a href=Registration.html>Click Here For New Registration</a>");
	}

}
