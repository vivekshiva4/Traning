package or.vivek.Day24Rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import or.vivek.Day24Rest.model.School;
import or.vivek.Day24Rest.model.Student;
import or.vivek.Day24Rest.service.StudentDaoById;

@Path("/student")
public class StudentResourceById {
	StudentDaoById s=new StudentDaoById();
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Student> getbooksById(@PathParam("id") int id) {
		s.connect();
		return s.getDataByStudentId(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Student addStudentToDb(Student student){
		s.connect();
		return s.addStudent(student);
	}

}
