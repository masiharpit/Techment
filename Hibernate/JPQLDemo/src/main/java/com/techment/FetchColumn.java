package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("Select p.name from Product p");
		List<String> nameList = query.getResultList();
		
		System.out.println("Name of all Products: ");
		for(String s : nameList)
		{
			System.out.println(s);
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
