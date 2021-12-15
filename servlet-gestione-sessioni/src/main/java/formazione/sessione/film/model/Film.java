package formazione.sessione.film.model;

import java.io.Serializable;

public class Film implements Serializable{
	
	private String titolo;
	
	private int annoPubblicazione;
	
	private String genere;

	public Film(String titolo, int annoPubblicazione, String genere) {
		super();
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.genere = genere;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
}
