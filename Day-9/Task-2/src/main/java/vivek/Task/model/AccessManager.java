package vivek.Task.model;
import java.sql.Connection;
import java.util.ArrayList;

import vivek.Task.dao.*;
import vivek.Task.dto.*;
public class AccessManager {
	public ArrayList<Course> getCourses() throws Exception
	{
	ArrayList<Course> courseList = new ArrayList<Course>();
	DataBase db = new DataBase();
	Connection con = db.getConnection();
	Access access = new Access();
	courseList = access.getCourses(con);
	return courseList;
	}
}
