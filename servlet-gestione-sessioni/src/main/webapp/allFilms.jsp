<%@ include file ="header.jsp" %>

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