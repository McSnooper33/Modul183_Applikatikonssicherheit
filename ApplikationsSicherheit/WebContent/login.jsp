<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="text-align: center;">
	<form name="loginForm" action="home.jsp" method="post">
	User Name: <input name="username" type="text" id="userName">
		<br/>
		<br/>
		Password: <input name="password" type="password" id="passwort">
		<br/>
		<br/>
		<input type="submit" value="Submit" />
		<br/>
		<a href="newUser.jsp">Registrieren</a>
	</form>
	</div>
	
</body>
</html>