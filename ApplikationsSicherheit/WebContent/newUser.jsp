<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="text-align: center">
		<form name="loginForm" action="newUserSuccess.jsp" method="post">
			Vorname: <input type="text" name="vorname"/>
			<br/>
			<br/>
			Nachname: <input type="text" name="nachname"/>
			<br/>
			<br/>
			Geschlecht: <select name="geschlecht">
				<option value="m">Herr</option>
				<option value="f">Frau</option>
			</select>
			<br/>
			<br/>
			Telefon: <input type="tel" name="telefon" pattern="^\d{3}\d{3}\d{2}\d{2}$" title="0791231212">
			<br/>
			<br/>
			Geburtsdatum: <input type="date" name="geburtsdatum" pattern="^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\d\d$" title="01-01-2000"/>
			<br/>
			<br/>
			Email: <input type="email" name="email"/>
			<br/>
			<br/>
			Username: <input type="text" name="username" pattern="^.{5,}$" title="min 5 Zeichen"/>
			<br/>
			<br/>
			Password: <input type="password" name="password" pattern="^.{10,}$" title="min 10 Zeichen"/>
			<br/>
			<br/>
			<input type="submit" value="Submit" />
		</form>
	</div>
</body>
</html>