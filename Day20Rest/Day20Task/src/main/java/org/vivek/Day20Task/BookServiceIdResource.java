package org.vivek.Day20Task;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day20Task.model.Books;
import org.vivek.Day20Task.service.BookServiceByIdDao;

@Path("/bookId")
public class BookServiceIdResource {
	BookServiceByIdDao bd = new BookServiceByIdDao();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Books getBookDetails() {
		return bd.getBookById();
	}

}
