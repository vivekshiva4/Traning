package org.vivek.Day19CurlDao.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDaoUpdate {

	public Connection con;
	public Statement stmt;

	public String update() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded sucesfully");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("Connection established sucesfully");

			
			String query="update student set sname='hyderabad' where id=1";
			stmt=con.createStatement();
			int x=stmt.executeUpdate(query);
			if(x!=0){
				System.out.println("Data updated");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Data updated";
	}
}
