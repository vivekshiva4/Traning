package org.vivek.Day17CurdOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day17CurdOperations.model.Student;

@Path("/retrive")
public class StudentResource {
	Student s = new Student();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Student> getdisplay()  {
		return s.display();

	}

}
