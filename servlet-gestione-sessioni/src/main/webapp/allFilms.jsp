<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tutti i film</title>
</head>
<body>
<h1>Benvenuto <c:out value="${sessionScope.utente.username }" /></h1>
<br>
	<table>
		<tr>
			<th>Titolo</th>
			<th>Anno di pubblicazione</th>
			<th>Genere</th>
		</tr>
		<c:forEach var="film" items="${sessionScope.films }" > 
		<tr>
			<td><c:out value="${film.titolo }"></c:out></td>
			<td><c:out value="${film.annoPubblicazione }"></c:out></td>
			<td><c:out value="${film.genere }"></c:out></td>
		</tr>
		</c:forEach>
	</table>

<%@ include file ="footer.jsp" %>