<%@ include file ="header.jsp" %>

<h1>Benvenuto <c:out value="${sessionScope.utente.username }" /></h1>

<form action="addFilm">

	<label for="titolo">Inserisci il titolo del film</label>
	<input type="text" name="titolo" id="titolo">

	<label for="anno">Inserisci anno di pubblicazione del film</label>
	<input type="number" name="anno" id="anno" min="1900" max="2021">
	
	<label for="genere">Inserisci il genere del film</label>
	<input type="text" name="genere" id="genere">
	 
	<input type="submit" value="Salva">

</form>

<%@ include file ="footer.jsp" %>