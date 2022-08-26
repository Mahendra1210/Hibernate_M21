package com.cg.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  //For Creating Table in MySQL
@Table(name="certificate")

public class Certificate 
{
	
	@Id  //Providing primary key 
	@Column(name="certificate_id")
	
	private long id;
	private int year;
	
	//Using One-To-One Mapping for connecting student and certificate table
	@OneToOne(mappedBy = "certificate")
	private Student student;
	
	//Getters and Setters methods
	public long getId() 
	{
		return id;
	}
	
	public void setId(long id) 
	{
		this.id = id;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public Student getStudent() 
	{
		return student;
	}

	public void setStudent(Student student) 
	{
		this.student = student;	
	}
		
}