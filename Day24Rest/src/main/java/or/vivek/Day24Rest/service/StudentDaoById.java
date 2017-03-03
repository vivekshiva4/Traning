package or.vivek.Day24Rest.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import or.vivek.Day24Rest.model.Student;


public class StudentDaoById {

	public static Connection con;
	public static PreparedStatement ps;
	public static ResultSet rs;
	public static Statement stmt;
	
	public void connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Student> getDataByStudentId(int id) {

		ArrayList<Student> list = new ArrayList<Student>();
		try {
			
			String query="select * from studentbook where studentId=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()){
				Student s1=new Student();
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
	
	public Student addStudent(Student student){
		  
		try {
			Student s2= new Student();
			String qry="insert into studentbook values(?,?,?)";
			ps=con.prepareStatement(qry);
			ps.setInt(1, s2.getStudent_book_Id());
			ps.setInt(2, s2.getStudentId());
			ps.setInt(3, s2.getBookId());
			int x=ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return student;
	}


}
