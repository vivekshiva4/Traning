package or.vivek.Day24Rest.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import or.vivek.Day24Rest.model.School;

public class LibraryDaoById {

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

	public ArrayList<School> getDataByStudentId(int id) {

		ArrayList<School> list = new ArrayList<School>();
		try {
			
			String query="select * from library where studentId=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()){
				School school=new School();
				school.setStudentId(rs.getInt(1));
				school.setBookId(rs.getInt(2));
				school.setBookName(rs.getString(3));
				list.add(school);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public ArrayList<School> getTotalData() {

		ArrayList<School> list = new ArrayList<School>();
		try {
			
			String query="select * from library";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()){
				School school=new School();
				school.setStudentId(rs.getInt(1));
				school.setBookId(rs.getInt(2));
				school.setBookName(rs.getString(3));
				list.add(school);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public School addData(School sc1){
		School sc=new School();
		try {
			String query = "insert into bench values(?,?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1, sc.getStudentId());
			ps.setInt(2, sc.getBookId());
			ps.setString(3, sc.getBookName());
			int x = ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sc ;
	}
	
}
