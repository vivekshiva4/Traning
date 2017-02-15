package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded sucesfully");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","vivek","vivek");
			System.out.println("connection established sucessfully");
			
			String qry="delete from day12 where sno=2";
			Statement stmt=con.createStatement();
			int x=stmt.executeUpdate(qry);
			
			System.out.println("Data deleted sucessfully");
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
