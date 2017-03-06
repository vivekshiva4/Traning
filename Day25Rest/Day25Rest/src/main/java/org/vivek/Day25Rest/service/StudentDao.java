package org.vivek.Day25Rest.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.vivek.Day25Rest.model.Student;

public class StudentDao {
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

	public ArrayList<Student> getAllStudent() {

		ArrayList<Student> list = new ArrayList<Student>();
		try {
			String query = "select * from studentbook";
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				Student s1 = new Student();
				s1.setStudent_book_Id(rs.getInt(1));
				s1.setStudentId(rs.getInt(2));
				s1.setBookId(rs.getInt(3));
				list.add(s1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<Student> getStudentId(int id) {

		ArrayList<Student> list1 = new ArrayList<Student>();
		try {
			String query = "select * from studentbook where studentId=?";
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				Student s1 = new Student();
				s1.setStudent_book_Id(rs.getInt(1));
				s1.setStudentId(rs.getInt(2));
				s1.setBookId(rs.getInt(3));
				list1.add(s1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list1;
	}

	public Student addStudent(Student s1) {

		try {
			String qry = "insert into studentbook(studentId,bookId) values(?,?)";
			ps = con.prepareStatement(qry);
			ps.setInt(1, s1.getStudentId());
			ps.setInt(2, s1.getBookId());
			int x = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return s1;
	}

	public Student deleteStudent(int id) {
		try {
			String qry = "delete from studentbook where student_book_id=?";
			ps = con.prepareStatement(qry);
			ps.setInt(1, id);
			int x = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Student updateStudent(Student s2){
		try {
			String qry = "update  studentbook set bookId=? where student_book_id=?";
			ps = con.prepareStatement(qry);
			ps.setInt(1, s2.getBookId());
			ps.setInt(2, s2.getStudent_book_Id());
			int x = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return s2;
	}
}
