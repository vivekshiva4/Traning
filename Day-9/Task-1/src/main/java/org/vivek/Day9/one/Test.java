package org.vivek.Day9.one;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/add")
public class Test {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	
	public String getValue(){
		return "hello rest";
	}

}
