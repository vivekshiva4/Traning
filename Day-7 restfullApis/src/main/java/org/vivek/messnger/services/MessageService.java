package org.vivek.messnger.services;

import java.awt.List;
import java.util.ArrayList;

import org.vivek.messnger.model.Message;

public class MessageService {
	
	public ArrayList<Message> getAllMessages(){
		Message m1=new Message(1L,"vivek","kittu");
		Message m2=new Message(1L,"vivek","kittu");
		ArrayList<Message> list=new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
