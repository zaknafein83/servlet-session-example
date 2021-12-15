<%@ include file ="header.jsp" %>

	<table>
		<tr>
			<th>Titolo</th>
			<th>Anno di pubblicazione</th>
			<th>Genere</th>
		</tr>
		<c:forEach var="film" items="${sessionScope.utente.getFilmVisti() }">
		<tr>
			<td><c:out value="${film.getTitolo() }"></c:out></td>
			<td><c:out value="${film.getAnnoPubblicazione() }"></c:out></td>
			<td><c:out value="${film.getGenere() }"></c:out></td>
		</tr>
		</c:forEach>
	</table>
<%@ include file ="footer.jsp" %>