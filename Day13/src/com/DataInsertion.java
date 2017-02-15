package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DataInsertion {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded sucesfully");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","vivek","vivek");
			System.out.println("connection established sucessfully");
			
			String qry="insert into day12 values(?,?)";
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setString(1, "5");
			ps.setString(2, "kittu vivek145");
			
			int x=ps.executeUpdate();
			if(x!=0){
				System.out.println("data added sucessfully");
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
