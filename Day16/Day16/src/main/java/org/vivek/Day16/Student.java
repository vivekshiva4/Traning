package org.vivek.Day16;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class Student {
	public static Connection con ;
public ArrayList<Student> display(){
	ArrayList<Student> courseList = new ArrayList<Student>();
		String query="select * from student";
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println("-----------------");
			}
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return courseList;
	}

}
