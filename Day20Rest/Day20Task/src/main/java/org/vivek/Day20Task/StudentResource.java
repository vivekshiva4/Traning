package org.vivek.Day20Task;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day20Task.service.StudentServiceDao;

@Path("/studentId")
public class StudentResource {
	StudentServiceDao s=new StudentServiceDao();
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String addStudent(){
		return s.insertStudentData();
	}

}
