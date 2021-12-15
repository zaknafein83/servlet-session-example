package formazione.sessione.film.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Utente implements Serializable{
	
	private String username;
	
	private String password;
	
	private List<Film> filmVisti;

	public Utente(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.filmVisti = new ArrayList<>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Film> getFilmVisti() {
		return filmVisti;
	}

	public void setFilmVisti(List<Film> filmVisti) {
		this.filmVisti = filmVisti;
	}


	@Override
	public int hashCode() {
		return Objects.hash(password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}

}
