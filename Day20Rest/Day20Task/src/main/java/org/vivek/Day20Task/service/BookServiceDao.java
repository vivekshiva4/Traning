package org.vivek.Day20Task.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookServiceDao {
	public Connection con;
	public PreparedStatement ps;

	public String insertBookData() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("drivers loaded");
			
		    con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("connection establised");

			String query = "insert into books values(?,?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1, 3);
			ps.setInt(2, 2);
			ps.setString(3, "book3");
			ps.setString(4, "patabiRam");
			ps.setString(5, "nature");
			
			int x = ps.executeUpdate();
			if (x != 0) {
				System.out.println("data entered sucessfully");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return "Data inserted sucessfully into Books Table";

	}

}
