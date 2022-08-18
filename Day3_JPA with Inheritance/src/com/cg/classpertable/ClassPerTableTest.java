package com.cg.classpertable;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClassPerTableTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		EmployeeN emp2=new EmployeeN();
		emp2.setName("Dev");
		emp2.setSalary(35000);
		em.persist(emp2);//to add the row
		
		//create second Employee
		EmployeeN emp3=new EmployeeN();
		emp3.setName("Jimmy");
		emp3.setSalary(38000);
		em.persist(emp3);
		
		//create one Manager
		ManagerN m1=new ManagerN();
		m1.setName("Vikram");
		m1.setSalary(60000);
		m1.setDeptName("Finance");
		em.persist(m1);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in the database");
		em.close();
		factory.close();

	}

}
