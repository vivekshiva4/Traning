package vivek.Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public static Connection con =null;
	public void connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","vivek","vivek");
			
		} catch (Exception e) {
			e.printStackTrace();		}
	
	}
	
	public void display(){
		
		String query="select * from student";
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println("-----------------");
			}
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}

}

