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
	
		<label for="login">login</label>
		<input type="text" id="login" name="login"><br>
		
		<label for="senha">senha</label>
		<input type="password" id="senha" name="senha"><br>
		
		<input type="submit" value="Login">	
	</form>
</body>
</html>