package formazione.sessione.film.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import formazione.sessione.film.model.Film;
import formazione.sessione.film.model.Utente;
import formazione.sessione.film.utility.GestioneFile;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		try {
			List<Utente> listaUtenti = GestioneFile.recuperaUtenti();
			List<Film> elencoTuttifilm = recupareElencoFilmDaTuttiUtenti(listaUtenti);
			for (Utente utente : listaUtenti) {
				if(utente.getUsername().equals(username) && utente.getPassword().equals(password)) {
					req.getSession().setAttribute("utente", utente);
					req.getSession().setAttribute("films", elencoTuttifilm);
					req.getServletContext().getRequestDispatcher("/utenteLoggato.jsp").forward(req, resp);
				}
			}
			
			req.getServletContext().getRequestDispatcher("/erroreLogin.jsp").forward(req, resp);
			
			
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private List<Film> recupareElencoFilmDaTuttiUtenti(List<Utente> listaUtenti) {
		
		List<Film> lista = new ArrayList<>();
		
		for (Utente utente : listaUtenti) {
			lista.addAll(utente.getFilmVisti());
		}
		return lista;
	}

}
