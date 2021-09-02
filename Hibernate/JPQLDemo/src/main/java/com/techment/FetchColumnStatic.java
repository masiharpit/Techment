package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FetchColumnStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("find name");
		List<Product> list = query.getResultList();
		
		System.out.println("Prodcut List: ");
		for(Product s : list)
		{
			System.out.println(s.getName()+" "+s.getPrice());
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
