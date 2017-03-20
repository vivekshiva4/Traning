package editContact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EditContactDao {
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

	public boolean editContact(String number,String name,int sno){
		
		try {
			String qry = "update contacts set contactNumber=?,contactName=? where S_NO=?";
			ps = con.prepareStatement(qry);
			ps.setString(1, number);
			ps.setString(2, name);
			ps.setInt(3,sno);
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
