package org.vivek.Day18CurlDao.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import org.vivek.Day18CurlDao.model.Student;

public class StudentDaoInsert {
	public Connection con;
	public PreparedStatement ps;

	public String insertData() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("drivers loaded");
		    con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("connection establised");

			String query = "insert into student values(?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1, 10256);
			ps.setString(2, "vickyyy");
			int x = ps.executeUpdate();
			if (x != 0) {
				System.out.println("data entered sucessfully");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return "data inserted";

	}

}
