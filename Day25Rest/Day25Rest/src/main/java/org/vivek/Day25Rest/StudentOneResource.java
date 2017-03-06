package org.vivek.Day25Rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day25Rest.model.StudentOne;
import org.vivek.Day25Rest.service.StudentOneDao;
@Path("/getBooksByStudentId")
public class StudentOneResource {
	StudentOneDao s=new StudentOneDao();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<StudentOne> getAllBooks(){
		s.connect();
		return s.getAllStudent();
	}

}
