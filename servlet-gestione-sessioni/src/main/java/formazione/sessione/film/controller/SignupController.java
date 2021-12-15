package formazione.sessione.film.controller;

import java.io.IOException;
import java.util.List;

import formazione.sessione.film.model.Utente;
import formazione.sessione.film.utility.GestioneFile;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignupController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		try {
			List<Utente> listaUtenti = GestioneFile.recuperaUtenti();

			listaUtenti.add(new Utente(username, password));

			GestioneFile.salvaFile(listaUtenti);

			req.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);

		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
