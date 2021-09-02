package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Address address = new Address();
		address.setDoorNo(162);
		address.setStreetName("Hudco");
		address.setCity("Bhilai");
		
		em.persist(address);
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Arpit");
		employee.setDesignation("Developer");
		employee.setAddress(address);
		
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
