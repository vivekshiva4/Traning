package org.vivek.Day18CurlDao;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day18CurlDao.service.StudentDaoInsert;

@Path("/insert")
public class StudentInserResource {
	StudentDaoInsert s = new StudentDaoInsert();

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String getInsertion() {
		return "data inserted sucessfully" + s.insertData();
	}

}
