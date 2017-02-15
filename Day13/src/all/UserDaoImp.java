package all;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserDaoImp implements UserDao{
	
	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	private static final String ID = "vivek";
	private static final String PASS = "vivek";
	
	private static final String DELETE = "DELETE FROM student WHERE id=?";
	private static final String FIND_ALL = "SELECT * FROM student";
	private static final String FIND_BY_ID = "SELECT * FROM student WHERE id=?";
	//private static final String INSERT = "INSERT INTO student VALUES(?, ?)";
	private static final String UPDATE = "UPDATE student SET name=? WHERE id=?";
	
	@Override
	public int delete(int id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(DELETE);
			stmt.setInt(1, id);
			
			return stmt.executeUpdate();
		} catch (Exception e) {
			 e.printStackTrace();
			throw new RuntimeException(e);

		
		} 
	}

	@Override
	public ArrayList<User> findAll() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ArrayList<User> list = new ArrayList<User>();
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(FIND_ALL);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				System.out.println("User Id is"+rs.getInt(1));
				System.out.println("User Name is"+rs.getString("sname"));
				System.out.println("------------------------------------");
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return list;

		}
	@Override
	public User findById(int id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(FIND_BY_ID);
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setSname(rs.getString("sname"));
				
				return user;
			} else {
				return null;
			}
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		} 
	}
	
	/*@Override
	public int update(User user) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(UPDATE);
			stmt.setString(1, user.getSname());
			
			return stmt.executeUpdate();
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		} 
	}
	*/
	private Connection getConnection() {
		try {
			Class.forName(DRIVER_NAME);
			return DriverManager.getConnection(DB_URL, ID, PASS);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}


}
