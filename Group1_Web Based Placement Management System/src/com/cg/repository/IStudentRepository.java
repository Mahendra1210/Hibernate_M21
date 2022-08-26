package com.cg.repository;

import com.cg.entities.Student;

public interface IStudentRepository
{
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(long  id);
	public Student searchStudentByHallTicket(long  ticketNo);
	public boolean deleteStudent(long id);
	public void beginTransaction();
	public void commitTransaction();
}