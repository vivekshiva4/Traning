package org.vivek.Day17CurdOperations.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Student {
	public static Connection con;
	public static Statement stmt;
	public static ResultSet rs;

	public ArrayList display()  {
		ArrayList courseList = new ArrayList();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("drivers loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("connection establised");
			
			String query = "select * from student";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println("-----------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		courseList.add(rs);
		return courseList;
	}

}
