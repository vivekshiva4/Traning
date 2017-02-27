package org.vivek.Day20Rest;

import java.sql.Statement;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day20Rest.service.StudentServiceDao;;

@Path("/create")
public class StudentCreateResource {
	StudentServiceDao s1=new StudentServiceDao();
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	 public String createTable(){
		return s1.createStudent();
	}

}
