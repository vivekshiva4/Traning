package org.vivek.Day15;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/login")
public class PostMethodResource {
	  
	    @POST 
	    @Produces(MediaType.APPLICATION_JSON)  
	    @Consumes(MediaType.APPLICATION_JSON)  
	public String sayHello(@QueryParam("username") String username)  
	{  
	    return "Hello  "+username;  
	}  
	}  
