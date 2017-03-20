<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@page  import ="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<script language="javascript">
function editRecord(id){
    var f=document.form;
    f.method="post";
    f.action='EditContact.jsp?id='+id;
    f.submit();
}
function deleteRecord(id){
    var f=document.form;
    f.method="post";
    f.action='DeleteContact.jsp?id='+id;
    f.submit();
}

</script>

<%

try {
Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<h2 align="center">Contacts</h2>
<h3 align='right'><a href=ContactsLogin.html>Logout</a><hr>

<form action="searchContact">
<h3 align="center">
Search:
<input name="csearch" type="text">
<input type="submit" value="search">
</h3>
</form>

<form method="post" name="form">
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>
<td><b>S.No</b></td>
<td><b>Contact Name</b></td>
<td><b>Contact Number</b></td>
<td><b>Edit</b></td>
<td><b>Delete</b></td>

</tr>

<%
try{ 
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","vivek","vivek");
statement=connection.createStatement();
String sql ="SELECT * FROM contacts";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr >

<td><%=resultSet.getInt(1) %></td>
<td><%=resultSet.getString(2) %></td>
<td><%=resultSet.getString(3) %></td>
<td><input type="button" name="edit" value="Edit" onClick="editRecord(<%=resultSet.getInt(1)%>);"></td>
<td><input type="button" name="delete" value="Delete" onClick="deleteRecord(<%=resultSet.getInt(1)%>);"></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</form>
<h3 align="center"><a href='AddContact.html'>Add New Contact</a></h5>
