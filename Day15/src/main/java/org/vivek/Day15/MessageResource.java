package org.vivek.Day15;


import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day15.user.Message;
import org.vivek.Day15.userService.MessageService;


@Path("/messages")

public class MessageResource {
	MessageService messageService=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Message> getMessage(){
		return messageService.getAllMessages()   ;
	}
/*
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String addMessage(){
		return "Post is working";
	}*/
	
}