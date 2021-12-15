package formazione.sessione.film.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import formazione.sessione.film.model.Utente;


public class GestioneFile {

	private final static String PATH = "dbutente.xck";

	public static void salvaFile(List<Utente> listaProdotti) throws ClassNotFoundException, IOException {
		File file = new File(PATH);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(listaProdotti);

		objectOutputStream.close();
		fileOutputStream.close();
	}

	public static List<Utente> recuperaUtenti() throws ClassNotFoundException, IOException {
		File file = new File(PATH);
		if(!file.exists()) {
			return new ArrayList<>();
		}
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		List<Utente> listaPersone = (List<Utente>) inputStream.readObject();
		inputStream.close();
		fileInputStream.close();
		return listaPersone;

	}
	
}