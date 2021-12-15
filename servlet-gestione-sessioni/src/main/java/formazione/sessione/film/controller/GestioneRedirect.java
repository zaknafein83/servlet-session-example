package formazione.sessione.film.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class GestioneRedirect extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String scelta = req.getParameter("scelta");
		
		switch (scelta) {
		case "1":
			req.getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
			break;
		case "2" :
			req.getServletContext().getRequestDispatcher("/nuovaRegistrazione.jsp").forward(req, resp);
			break;
		case "3":
			req.getServletContext().getRequestDispatcher("/aggiungiFilm.jsp").forward(req, resp);
			break;
		case "4":
			req.getServletContext().getRequestDispatcher("/elencoFilm.jsp").forward(req, resp);
			break;
		case "5":
			req.getServletContext().getRequestDispatcher("/allFilms.jsp").forward(req, resp);
			break;
		case "6":
			req.getSession().invalidate();
			req.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
			break;
		default:
			break;
		}
		
	}

}
