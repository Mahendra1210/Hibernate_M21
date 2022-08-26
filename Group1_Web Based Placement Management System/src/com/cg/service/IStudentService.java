package com.cg.service;

import com.cg.entities.Certificate;
import com.cg.entities.Student;

public interface IStudentService 
{
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(long  id);
	public Student searchStudentByHallTicket(long ticketNo);
	public boolean addCertificate(Certificate certificate);
	public boolean updateCertificate(Certificate certificate);
	public boolean deleteStudent(long id);
}
