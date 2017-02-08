package org.vivek.Day8.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.vivek.Day8.database.DatabaseClass;
import org.vivek.Day8.model.Message;

public class MessageService {
	private  HashMap<Long, Message> messages=DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1,"vivek","vivk"));
		messages.put(2L, new Message(2,"vivek","kitt"));
		
	}
	
	public ArrayList<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	public Message addMessage(Message message){
		message.setId(messages.size() +1);
		messages.put(message.getId(), message);
		return message;
	}
	public Message updateMessage(Message message){
		if(message.getId()<=0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	public Message removeMessage(long id){
		return messages.remove(id);
	}
	
}
