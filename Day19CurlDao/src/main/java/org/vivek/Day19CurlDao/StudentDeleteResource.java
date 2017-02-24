package org.vivek.Day19CurlDao;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day19CurlDao.service.StudentDaoDelete;

@Path("/delete")
public class StudentDeleteResource {
	StudentDaoDelete s1=new StudentDaoDelete();

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteData(){
		return s1.deleteData();
	}
}
