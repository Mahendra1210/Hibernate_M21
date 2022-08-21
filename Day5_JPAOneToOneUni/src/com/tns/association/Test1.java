package com.tns.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test1 {

	public static void main(String[] args) {
		
		EntityManagerFactory factory2=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em2=factory2.createEntityManager();
		em2.getTransaction().begin();
		
		Employee e=new Employee();
		e.setEmployeeName("Mahendra");
		
		
		Address a=new Address();
		a.setAddressId(10);
		a.setStreet("Shankar Nagar");
		a.setCity("Pune");
		a.setState("Maharashtra");
		
		
		
		
		Employee e1=new Employee();
		e1.setEmployeeName("Max");
		
		Address a1=new Address();
		a1.setAddressId(11);
		a1.setStreet("Lajpat Nagar");
		a1.setCity("Nashik");
		a1.setState("Maharashtra");
		
		e.setAddress(a);
		em2.persist(e);
		e1.setAddress(a1);
		em2.persist(e1);
	
		
		System.out.println("Row Inserted");
		em2.getTransaction().commit();
		em2.close();
		factory2.close();
	}

}

