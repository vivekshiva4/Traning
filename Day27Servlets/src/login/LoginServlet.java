package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String user=request.getParameter("userId");
		String pwd=request.getParameter("password");
		
		LoginDao ld=new LoginDao();
		ld.connect();
		boolean status =ld.login(user,pwd);
		if(status==true){
			response.sendRedirect("Welcome");

		}
		else{
			response.sendRedirect("Login.html");
		}
	}

}
