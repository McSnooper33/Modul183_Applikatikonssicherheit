<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="login.dbo.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="login" class="login.dbo.LoginBean" />
 <jsp:setProperty property="*" name="login" />
 
 <%
 DbConnector loginDao = new DbConnector();
 boolean status = loginDao.validate(login);
 if(status) {
	 %>
	 <h1>Christmas Event</h1>
	 <img src="party.jpg"/>
	 <button onclick='alert("Du hast dich Erfolgreich angemeldet!")'>Anmelden</button>

	 <%
 }else{
		 %>
		 <p>Diese Kombination existiert nicht </p>
		 <a href="login.jsp">Zurück zum Anmelden</a>
	 <%
 }
	 %>
	 
</body>
</html>