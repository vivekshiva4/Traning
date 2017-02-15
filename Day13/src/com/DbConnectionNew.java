package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionNew {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded sucesfully");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","vivek","vivek");
			System.out.println("connection established sucessfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
