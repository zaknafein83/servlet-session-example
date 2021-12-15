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
<%@ include file ="footer.jsp" %>