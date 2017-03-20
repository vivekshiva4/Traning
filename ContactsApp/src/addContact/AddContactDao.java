package addContact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import displayContacts.ContactBean;


public class AddContactDao {
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

	public boolean addContact(ContactBean c){
		
		try {
			String qry = "insert into contacts(contactName,contactNumber) values(?,?)";
			ps = con.prepareStatement(qry);
			ps.setString(1,c.getContactName());
			ps.setString(2, c.getContactNumber());
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
