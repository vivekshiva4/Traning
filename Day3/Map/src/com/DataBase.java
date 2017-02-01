package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase {
	public boolean diplay(){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Drivers has been loaded sucessfully");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "vivek", "vivek");
		System.out.println("connection established sucessfully");

		String qry = "select * from vivek" ;
		Statement stmt = con.createStatement();
		ResultSet rs=stmt.executeQuery(qry);
	while (rs.next()){
		System.out.println("s.no is "+rs.getInt(1));
		System.out.println("first name  is "+rs.getString(2));
		System.out.println("last name "+rs.getString(3));
		System.out.println("--------------------=-----------------");
	}

		

	} 
	catch (Exception e) {

		System.out.println("failed due to " + e);
	}
	return false;
}
}


