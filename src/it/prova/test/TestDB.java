package it.prova.test;

import it.prova.Dao.FilmDao;
import it.prova.Dao.RegistaDao;
import it.prova.model.Film;
import it.prova.model.Regista;

public class TestDB {

	public static void main(String[] args) {

		System.out.println("Inizio....");
		//questi servono solo per invocare
		FilmDao filmDaoInstance = new FilmDao();
		
		RegistaDao registaDaoIstance = new RegistaDao();
		
		
		Film film = filmDaoInstance.selectJoinById(1L);
		
		
		film = new Film("harry potter","fantascienza",1229);
		film.setRegista(new Regista("jk","rowling", 10));
		filmDaoInstance.insertCompleto(film);
		
		film = new Film("spiderman","cinecomics",150);
		film.setRegista(new Regista("sten","lee", 0));
		filmDaoInstance.insertCompleto(film);
		
		film = new Film("the wolf of wall street","comico",150);
		film.setRegista(new Regista("jordan","belfort", 1));
		filmDaoInstance.insertCompleto(film);
		

		film = new Film("immagini della nostra vita","romantico",150);
		film.setRegista(new Regista("nicholas","spark", 9));
		filmDaoInstance.insertCompleto(film);
		
		for (Film filmItem : filmDaoInstance.list()) {
			System.out.println(filmItem);
		}
		System.out.println(registaDaoIstance.findByOscarVinti());
		
	}// main
}// class
