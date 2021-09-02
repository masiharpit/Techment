package com.techment;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
//		Product product = new Product();
//		product.setId(2);
//		product.setName("PS5");
//		product.setPrice(49900);
//		product.setCategory("Electronics");
		
		Product product2 = new Product();
		product2.setId(3);
		product2.setName("OnePlus");
		product2.setPrice(54999);
		product2.setCategory("Electronics");
		
		em.persist(product2);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
