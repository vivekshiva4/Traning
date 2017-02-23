package org.vivek.Day18CurlDao.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.vivek.Day18CurlDao.model.Student;


public class StudentDao {
	public static Connection con;
	public static Statement stmt;
	public static ResultSet rs;

	public ArrayList<Student> display() {

		ArrayList<Student> courseList = new ArrayList<Student>();
		Student s1 = new Student();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("drivers loaded");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("connection establised");

			String query = "select * from student";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println("-----------------");
				s1.setId(rs.getInt(1));
				s1.setSname(rs.getString(2));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		courseList.add(s1);
		return courseList;
	}

}

