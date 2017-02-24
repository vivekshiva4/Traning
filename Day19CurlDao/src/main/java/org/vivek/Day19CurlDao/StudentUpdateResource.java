package org.vivek.Day19CurlDao;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day19CurlDao.service.StudentDaoUpdate;;

@Path("/update")
public class StudentUpdateResource {
	StudentDaoUpdate s=new StudentDaoUpdate();
@PUT
@Produces(MediaType.APPLICATION_JSON)

public String updateData(){
	return s.update();
}
}
