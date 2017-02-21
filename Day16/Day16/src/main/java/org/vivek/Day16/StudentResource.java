package org.vivek.Day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/retrive")
public class StudentResource {
public  Connection con;
	
@GET
@Produces(MediaType.APPLICATION_JSON)
public ArrayList<Student> display(){
	ArrayList<Student> courseList = new ArrayList<Student>();
		
		try {
			String query="select * from student";
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
public void connect(){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("drivers loaded");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","vivek","vivek");
		System.out.println("connection establised");
	} catch (Exception e) {
		e.printStackTrace();
		}

}

}


