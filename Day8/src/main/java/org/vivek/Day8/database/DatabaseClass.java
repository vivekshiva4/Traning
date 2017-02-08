package org.vivek.Day8.database;

import java.util.HashMap;
import java.util.Map;

import org.vivek.Day8.model.Message;
import org.vivek.Day8.model.Profile;




public class DatabaseClass {
	private static HashMap<Long, Message> messages=new HashMap<Long,Message>();
	private static HashMap<Long, Profile> profiles=new HashMap<Long,Profile>();
	
	public static HashMap<Long, Message> getMessages(){
		return messages;
	}
	public static HashMap<Long, Profile> getProfiles(){
		return profiles;
	}

}
