<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registered Details</h1>
<c:if test="${!empty fetch}">
<table align="left" border="1">
<tr>
<th>ID</th>
<th>Email</th>
<th>FirstName</th>
<th>LastName</th>
<th>Contact_NO</th>
</tr>
<c:forEach items="${Student}" var="student">
<tr>
<td><c:out value="${student.id}"/></td>
<td><c:out value="${student.email}"/></td>
<td><c:out value="${student.firstName}"/></td>
<td><c:out value="${student.lastName}"/></td>
<td><c:out value="${student.mobileNo}"/></td>
</tr>
</c:forEach>
</table>
</c:if>
</body>
</html>