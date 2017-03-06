package org.vivek.Day25Rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day25Rest.model.Student;
import org.vivek.Day25Rest.service.StudentDao;

@Path("/student")

public class StudentResource {
	StudentDao s=new StudentDao();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Student> getAllBooks(){
		s.connect();
		return s.getAllStudent();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Student> getbooksById(@PathParam("id") int id) {
		s.connect();
		return s.getStudentId(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Student addStudentToDb(Student s1){
		s.connect();
		return s.addStudent(s1);
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student deleteId(@PathParam("id") int id){
		s.connect();
		return s.deleteStudent(id);
	}
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Student updateStudentDetails(Student s2){
		s.connect();
		return s.updateStudent(s2);
	}
	

}
