package registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegistrationDao {
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

	public boolean saveData(Registration r){
		
		try {
			String qry = "insert into servletRegistration values(?,?,?)";
			ps = con.prepareStatement(qry);
			ps.setString(1, r.getFirstName());
			ps.setString(2,r.getLastName());
			ps.setString(3, r.getEmail());
			int x = ps.executeUpdate();
			if(x!=0){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
