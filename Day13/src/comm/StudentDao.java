package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	 
	public Student getStudent(int id){
		try {
			
			String qry="select sname from student where id="+id;
			Student s=new Student();
			s.id=id;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","vivek","vivek");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			rs.next();
			String name=rs.getString(1);
			s.sname=name;
			return s;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
