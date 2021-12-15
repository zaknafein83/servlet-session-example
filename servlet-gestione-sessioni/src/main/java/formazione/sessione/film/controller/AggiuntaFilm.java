package formazione.sessione.film.controller;

import java.io.IOException;
import java.util.List;

import formazione.sessione.film.model.Film;
import formazione.sessione.film.model.Utente;
import formazione.sessione.film.utility.GestioneFile;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addFilm")
public class AggiuntaFilm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Utente utente = (Utente) req.getSession().getAttribute("utente");

		try {
			List<Utente> recuperaUtenti = GestioneFile.recuperaUtenti();
			recuperaUtenti.remove(utente);
			
			String titolo = req.getParameter("titolo");
			int anno = Integer.parseInt(req.getParameter("anno"));
			String genere = req.getParameter("genere");

			Film nuovoFilm = new Film(titolo, anno, genere);

			utente.getFilmVisti().add(nuovoFilm);

			recuperaUtenti.add(utente);
			GestioneFile.salvaFile(recuperaUtenti);

		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.getServletContext().getRequestDispatcher("/utenteLoggato.jsp").forward(req, resp);

	}

}
