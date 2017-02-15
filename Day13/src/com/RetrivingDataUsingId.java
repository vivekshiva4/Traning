package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrivingDataUsingId {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded sucesfully");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("connection established sucessfully");

			String qry = "select * from day12 where userId='vivek123'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			while (rs.next()) {
				System.out.println("S.no is " + rs.getString(1));
				System.out.println("User Id is " + rs.getString(2));
				System.out.println("------------------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
