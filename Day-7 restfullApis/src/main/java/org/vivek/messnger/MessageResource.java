package org.vivek.messnger;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivek.messnger.model.Message;
import org.vivek.messnger.services.MessageService;
@Path("/messages")

public class MessageResource {
	MessageService messageService=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Message> getMessage(){
		return messageService.getAllMessages()   ;
	}


}
