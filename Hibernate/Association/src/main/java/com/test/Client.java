package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Library library = new Library();
		library.setName("Nehru Library");
		
		em.persist(library);
		
		Book book1 = new Book();
		book1.setBookName("Java");
		book1.setAuthor("John R. Hubbard");
		book1.setLibrary(library);
		
		Book book2 = new Book();
		book2.setBookName("Quantitative Aptitude");
		book2.setAuthor("Dr. R.S. Agrawal");
		book2.setLibrary(library);
		
		em.persist(book1);
		em.persist(book2);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
