package or.vivek.Day23Rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import or.vivek.Day23Rest.model.Books;
import or.vivek.Day23Rest.service.BookDaoServiceById;

@Path("/books")
public class BookResourceById {
	BookDaoServiceById b=new BookDaoServiceById();
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Books> getById(@PathParam("id") int id){
		return b.getBookById(id);
	}

}
