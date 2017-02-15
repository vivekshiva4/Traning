package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatingTable {

	public void dao()   {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded sucesfully");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","vivek","vivek");
			System.out.println("connection established sucessfully");
			
			String qry="create table day12(sno varchar(255),userId varchar(255));";
			Statement stmt=con.createStatement();
			int x= stmt.executeUpdate(qry);
			System.out.println("table created sucessfully");
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
