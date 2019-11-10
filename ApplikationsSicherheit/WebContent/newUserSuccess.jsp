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


           
   
    
     <jsp:useBean id="newUser" class="login.dbo.NewUserBean" />

   
   
   <jsp:setProperty property="*" name="newUser" />
                
   <%
   DbConnector loginDao = new DbConnector();
   
   boolean status2 = loginDao.insertNewUser(newUser);
   if (status2) {
           out.print("<h1>Du hast dich erfolgreich registriert</h1>");
   }
   %>
	
	<br/>
	<a href="login.jsp">Login</a>
   

</body>
</html>