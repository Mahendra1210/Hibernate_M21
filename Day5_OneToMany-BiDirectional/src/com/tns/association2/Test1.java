package com.tns.association2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test1 {

	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create a new department
		Department department= new Department();
		department.setId(1);
		department.setName("Sales");
		
		
		Department department1= new Department();
		department1.setId(2);
		department1.setName("Marketing");
		
		//create two instances of employees
		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setName("Priya Sharma"); 
		e1.setSalary(4500);
		e1.setDept(department);
		
		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setName("Dinesh Kumar");
		e2.setSalary(5500);
		e2.setDept(department1);
		
		
		em.persist(e1);
		em.persist(e2);
		//add both employees to department
		department.addEmployee(e1);
		department.addEmployee(e2);
		
		//save department and its employees using entity manager
		em.persist(department);
		em.persist(department1);
		
		System.out.println("Added department along with two employees to database.");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

	

}
