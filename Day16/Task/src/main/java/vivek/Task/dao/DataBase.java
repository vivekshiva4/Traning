package vivek.Task.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
	public Connection getConnection() throws Exception
	{
	try
	{
	String connectionURL = "jdbc:mysql://localhost:3306/test";
	Connection connection = null;
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	connection = DriverManager.getConnection(connectionURL, "vivek", "vivek");
	return connection;
	} catch (Exception e)
	{
	throw e;
	}
	 
	}

}
