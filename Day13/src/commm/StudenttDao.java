package commm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudenttDao {

	Connection con = null;

	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","vivek","vivek");
			
		} catch (Exception e) {
			e.printStackTrace();		}
	}
	
	public void addStudent(Studentt s){
		String query="insert into student values (?,?)";
		PreparedStatement ps;
		try {
			ps=con.prepareStatement(query);
			ps.setInt(1, s.id);
			ps.setString(2, s.sname);
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
