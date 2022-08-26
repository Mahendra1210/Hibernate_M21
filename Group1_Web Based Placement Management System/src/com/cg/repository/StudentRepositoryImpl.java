package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.Student;


public class StudentRepositoryImpl implements IStudentRepository
{
	
	// step1: Start the JPA LifeCycle 
	private EntityManager em;
	
	
	public StudentRepositoryImpl() 
	{
		super();
		em =JPAUtil.getEntityManager();
	}

	// create opertation  -Repo n/Dao
	@Override
	public Student addStudent(Student student) 
	{
		em.persist(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) 
	{
		em.merge(student);
		return student;
	}

	@Override
	public Student searchStudentById(long id) 
	{
		Student student = em.find(Student.class, id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(long ticketNo) 
	{
		Student student = em.find(Student.class, ticketNo);
		return student;
	}

	@Override
	public boolean deleteStudent(long id) 
	{
		em.remove(id);
		return false;
	}


	@Override
	public void beginTransaction() 
	{
		em.getTransaction().begin();	
	}

	@Override
	public void commitTransaction() 
	{
		em.getTransaction().commit();	
	}
}