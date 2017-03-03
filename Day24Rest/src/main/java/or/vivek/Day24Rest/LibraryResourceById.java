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
import or.vivek.Day24Rest.service.LibraryDaoById;

@Path("studentId")
public class LibraryResourceById {

	LibraryDaoById l = new LibraryDaoById();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<School> getTotalBooks() {
		l.connect();
		return l.getTotalData();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<School> getbooksById(@PathParam("id") int id) {
		l.connect();
		return l.getDataByStudentId(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public School insertData(School sc1){
		l.connect();
		return l.addData(sc1);
	}
	

}
