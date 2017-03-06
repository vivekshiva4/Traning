package org.vivek.Day25Rest.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.vivek.Day25Rest.model.Book;
import org.vivek.Day25Rest.model.StudentTwo;


public class StudentTwoDao {
	public static Connection con;
	public static PreparedStatement ps;
	public static ResultSet rs;
	public static Statement stmt;

	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<StudentTwo> getAllStudent() {

		ArrayList<StudentTwo> list = new ArrayList<StudentTwo>();
		try {
			String query = "select studentbook.studentId,bookIdInformation.bookId,bookIdInformation.bookName,bookIdInformation.version from bookIdInformation inner join  studentbook on studentbook.bookId=bookIdInformation.bookId  ";
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				StudentTwo s1 = new StudentTwo();
				Book b=new Book();
				b.setBookId(rs.getInt(2));
				b.setBookName(rs.getString(3));
				b.setVersion(rs.getString(4));
				s1.setStudentId(rs.getInt(1));
				s1.setBook(b);
				//s1.setBook(rs.getString(2));
				//s1.setBookName(rs.getString(3));
				//s1.setVersion(rs.getString(4));
				list.add(s1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}


}
