package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded sucesfully");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","vivek","vivek");
			System.out.println("connection established sucessfully");
			
			String qry="update day12 set userId='vivekshiva4' where sno=1 ";
			Statement stmt=con.createStatement();
			int x=stmt.executeUpdate(qry);
			
			System.out.println("Data updated sucessfully");
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
