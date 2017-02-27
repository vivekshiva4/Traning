package org.vivek.Day20Task.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.vivek.Day20Task.model.Books;

public class BookServiceByIdDao {
	public Statement stmt;
	public ResultSet rs;
	
	
	
	public Books getBookById(){
		
		Books book=new Books();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("drivers loaded");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("connection establised");

			String query = "select * from books where studentId=1";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				book.setBookId(rs.getInt(1));
				book.setStudentId(rs.getInt(2));
				book.setBookName(rs.getString(3));
				book.setBookAuthor(rs.getString(4));
				book.setBookContent(rs.getString(5));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return book;
	}

}
