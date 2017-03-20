<%@ page language="java" import="java.util.*"%>
<%@ page language="java" import="java.sql.*"%>
<head>
</head>
<body>
<h3 align="center"><a href='DisplayContact.jsp'>Home</a></h5>


	<%@page import="java.sql.DriverManager"%>
	<%@page import="java.sql.ResultSet"%>
	<%@page import="java.sql.Statement"%>
	<%@page import="java.sql.Connection"%>
	

	<%
		String id = request.getParameter("userId");
		String driverName = "com.mysql.jdbc.Driver";
		String connectionUrl = "jdbc:mysql://localhost:3306/";
		String dbName = "test";
		String userId = "vivek";
		String password = "vivek";

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
	%>
	<%
	int sno=Integer.parseInt(request.getParameter("id"));

		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			statement = connection.createStatement();
			String sql = "SELECT * FROM contacts where S_NO='"+sno+"'";
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
	%>
	<%
				int S_NO = resultSet.getInt(1);
				String contactName = resultSet.getString(2);	
				String contactNumber = resultSet.getString(3);
	%>
	<form name="editform" method="post" action="editContact">
		<br> <br> <br>
		<table border="1" align="center"">

			<td>SNo</td>
			<td><input type="number" name="cnum" value="<%=S_NO%>" readonly="readonly"></td>
			</tr>
			<tr>
				<td>ContactName:</td>
				<td><input type="text" name="cname" value="<%=contactName%>"></td>
			</tr>
			<tr>
				<td>ContactNumber</td>
				<td><input type="text" name="cnumber"
					value="<%=contactNumber%>"></td>
			</tr>


			<tr>
				<th colspan="2"><input type="submit" value="Update"></th>
			</tr>

		</table>
	</form>


	<%
		}

		} catch (Exception e) {
			e.printStackTrace();
		}
	%>

</body>

