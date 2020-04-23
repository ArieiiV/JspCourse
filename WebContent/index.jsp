<jsp:useBean id="calcula" class="beans.BeanCursoJsp"
	type="beans.BeanCursoJsp"></jsp:useBean>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="myprefix" uri="WEB-INF/testetag.tld"%>

<%@ page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	<form action="LoginServlet" method="post"></form>
	<label for="login">Login</label>
	<input type="text" id="login" name="login"><br>
	<label for="password">Password</label>
	<input type="text" id="password" name="password"><br>
</body>
</html>