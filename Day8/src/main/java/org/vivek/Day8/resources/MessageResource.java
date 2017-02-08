package org.vivek.Day8.resources;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.Day8.model.Message;
import org.vivek.Day8.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageService =new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Message> getMessages(){
		return messageService.getAllMessages();
	}
	

}
