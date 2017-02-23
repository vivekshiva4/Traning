package org.vivek.Day18CurlDao;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day18CurlDao.model.Student;
import org.vivek.Day18CurlDao.service.StudentDao;




@Path("/retrive")
public class StudentResource {
	StudentDao s = new StudentDao();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Student> getdisplay()  {
		return s.display();

	}

}
