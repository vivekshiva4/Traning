package org.vivek.Day20Task;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day20Task.service.BookServiceDao;

@Path("/bookName")
public class BookResource {
	BookServiceDao b=new BookServiceDao();
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	
	public String addBook()
	{
		return b.insertBookData();
	}
}
