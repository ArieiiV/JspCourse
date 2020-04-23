<jsp:useBean id="calcula" class="br.com.jsp.beans.UserBean"
	type="br.com.jsp.beans.UserBean"></jsp:useBean>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>

<c:out value="${'Bem vindo ao JSTL'}  "></c:out>



	<form action="LoginServlet" method="post">
		<label for="user">User</label>
		<input type="text" id="user" name="user"><br>
		<label for="password">Password</label>
		<input type="password" id="password" name="password"><br>
		<input type="submit" value="Login">	
	</form>
</body>
</html>