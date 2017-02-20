package org.vivek.Day15.userService;

import java.util.ArrayList;

import org.vivek.Day15.user.User;

public class UserService {

	public ArrayList<User> getAllUserDetails() {
		User u1 = new User(10256, "vivek", 23, "hyderabad");
		User u2 = new User(25698, "kittu", 23, "Achampet");
		ArrayList<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		return list;
	}
}
