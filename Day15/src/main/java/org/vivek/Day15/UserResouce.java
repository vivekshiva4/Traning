package org.vivek.Day15;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day15.user.User;
import org.vivek.Day15.userService.UserService;

@Path("/cc")
public class UserResouce {
	UserService u=new UserService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public ArrayList<User> getDetails(){
		return u.getAllUserDetails();
	}


}
