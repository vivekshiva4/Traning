package org.vivek.Day17TestCase;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day17TestCase.model.Student;
import org.vivek.Day17TestCase.service.StudentService;
@Path("/students")
public class StudentResource {
	
	StudentService s=new StudentService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents(){
		return s.getAllStudents();
	}
	/*@GET
	@Path("/{id)")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getSudentId(@PathParam("id") int id){
		return s.getStudentById(id);
	}*/
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Student addStudent(Student student){
		return s.addStudent(student);
	}
	
	
	
}
