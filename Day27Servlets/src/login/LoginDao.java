package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {
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

public boolean login(String userId,String password){

	try {
		String qry = "select * from user where userId=? AND password=?";
		ps = con.prepareStatement(qry);
		ps.setString(1, userId);
		ps.setString(2,password);
		rs=ps.executeQuery();
		if(rs.next()){
			return true;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return false;
}
}
