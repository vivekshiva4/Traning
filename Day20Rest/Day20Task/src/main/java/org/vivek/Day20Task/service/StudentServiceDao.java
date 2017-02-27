package org.vivek.Day20Task.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentServiceDao {
	public Connection con;
	public PreparedStatement ps;

	public String insertStudentData() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("drivers loaded");
			
		    con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("connection establised");

			String query = "insert into students values(?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1, 2);
			ps.setString(2, "kittu");
			int x = ps.executeUpdate();
			if (x != 0) {
				System.out.println("data entered sucessfully");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return "Data inserted sucessfully into Student Table";

	}

}
