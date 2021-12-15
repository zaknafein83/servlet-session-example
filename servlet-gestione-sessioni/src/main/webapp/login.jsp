<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Effettua il login</title>

</head>
<body>


<form action="login" method="post">
	
	<label for="username">Inserisci la tua username</label>
	<input type="text" name="username" id="username">
	
	<label for="password">Inserisci la tua password</label>
	<input type="password" name="password" id="password">
	
	<input type="submit" value="LOGIN">
	
</form>
</body>
</html>