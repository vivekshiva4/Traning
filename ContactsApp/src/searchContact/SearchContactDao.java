package searchContact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchContactDao {
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

public boolean searchContact(String search){

	try {
		String qry = "select * from contacts where contactName like '"+search+"%'";
		ps = con.prepareStatement(qry);
		rs=ps.executeQuery();
		while(rs.next()){
			return true;
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return false;
}


}
