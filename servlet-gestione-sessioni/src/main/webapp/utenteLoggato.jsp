<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Benvenuto <c:out value="${sessionScope.utente.username }" /></title>
</head>
<body>

<h1>Benvenuto <c:out value="${sessionScope.utente.username }" /> </h1>

<form action="redirect">
	<button name="scelta" value="3" type="submit">Aggiungi nuovo film visto</button><br/>
	<button name="scelta" value="4" type="submit">Elenco di film visti da te</button><br/>
	<button name="scelta" value="5" type="submit">Tutti i film</button><br/>
	<button name="scelta" value="6" type="submit">LogOut</button><br/>

</form>

</body>
</html>