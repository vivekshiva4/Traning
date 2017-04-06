<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<font color="red">${message}</font>
	<form id="loginForm" method="post" action="login"
		modelAttribute="loginBean">

		<table border=3 align="left">
			<tr>
				<th colspan=2><i><h1>Login Page</h1></th>
			</tr>
			<tr>
				<td>User id:</td>
				<td><input type="email" name="username"></td>
			</tr>
			<br>
			<tr>
				<td>password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<br>
			<tr>
				<th colspan=2><input type="submit" value="login"> <input
					type="reset" value="clear"></th>
			</tr>
		</table>

	</form>
<h3 align="right">${msgg }</h3>
	<form id="studentForm" action="save" method="post"
		modelAttribute="studentBean">

		<table border="2" align="center">
			<tr>
				<th colspan=2><i><h1>Register Here</h1></th>

			</tr>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName"></td>

			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName"></td>

			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email"></td>

			</tr>
			<tr>
				<td>Last name:</td>
				<td><input type="text" name="mobileNo"></td>

			</tr>
			<tr>
				<th colspan=2><input type="submit" value="register"> <input
					type="reset" value="clear"></th>

			</tr>
		</table>



	</form>
</body>
</html>