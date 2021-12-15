<%@ include file ="header.jsp" %>

<form action="signup" method="post">
	
	<label for="username">Inserisci la tua username</label>
	<input type="text" name="username" id="username">
	
	<label for="password">Inserisci la tua password</label>
	<input type="password" name="password" id="password">
	
	<input type="submit" value="Registrati">
	
</form>
<%@ include file ="footer.jsp" %>