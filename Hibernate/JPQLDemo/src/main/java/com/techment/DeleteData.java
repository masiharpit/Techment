package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Product product = new Product();
		product.setId(4);
		product.setCategory("Electronics");
		product.setName("JBL");
		product.setPrice(36999);
		em.persist(product);
		
		Query query = em.createQuery("delete from Product where id=4");
		query.executeUpdate();
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
