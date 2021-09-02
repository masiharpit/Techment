package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDataAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("select p from Product p where Price between 40000 and 90000");
		List<Product> priceListBetween = query.getResultList();
		
		System.out.println("ID\t\tName\t\tPrice\t\tCategory");
		for(Product p : priceListBetween)
		{
			System.out.println(p.getId()+"\t\t"+p.getName()+"\t\t"+p.getPrice()+"\t\t"+p.getCategory());
		}
		
		Query query2 = em.createQuery("select p from Product p where Category in('Electronics')");
		List<Product> priceListIn = query2.getResultList();
		
		System.out.println("ID\t\tName\t\tPrice\t\tCategory");
		for(Product p : priceListIn)
		{
			System.out.println(p.getId()+"\t\t"+p.getName()+"\t\t"+p.getPrice()+"\t\t"+p.getCategory());
		}
		
		Query query3 = em.createQuery("select p from Product p where Name like '%pl%'");
		List<Product> priceListLike = query3.getResultList();
		
		System.out.println("ID\t\tName\t\tPrice\t\tCategory");
		for(Product p : priceListLike)
		{
			System.out.println(p.getId()+"\t\t"+p.getName()+"\t\t"+p.getPrice()+"\t\t"+p.getCategory());
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
