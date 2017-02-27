package org.vivek.Day20Rest.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class StudentServiceDao {

	public Connection con;
	public Statement stmt;

	public String createStudent() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded sucesfully");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("Connection established sucesfully");

			
			String query = "create table college(id int,firstName varchar(255))";
			Statement stmt = con.createStatement();
			int x = stmt.executeUpdate(query);
			if(x!=0){
				System.out.println("table craeted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Table created to db sucessfully";
	}
}
