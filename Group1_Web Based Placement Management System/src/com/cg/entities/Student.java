package com.cg.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="student")
public class Student 
{
	@Id
	private long  id;
	private String name;
	private String  college;
	private long roll;
	private String qualification;
	private String course;
	private int year;
	private long hallTicketNo;
	
	//Using One-To-One Mapping for connecting student and certificate table
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="certificate_id")
	private Certificate certificate;
	
	//Getters and setters methods
	public long getId() 
	{
		return id;
	}
	public void setId(long id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCollege() 
	{
		return college;
	}
	public void setCollege(String college) 
	{
		this.college = college;
	}
	public long getRoll() 
	{
		return roll;
	}
	public void setRoll(long roll) 
	{
		this.roll = roll;
	}
	public String getQualification() 
	{
		return qualification;
	}
	public void setQualification(String qualification) 
	{
		this.qualification = qualification;
	}
	public String getCourse() 
	{
		return course;
	}
	public void setCourse(String course) 
	{
		this.course = course;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public long getHallTicketNo() 
	{
		return hallTicketNo;
	}
	public void setHallTicketNo(long hallTicketNo) 
	{
		this.hallTicketNo = hallTicketNo;
	}
	public Certificate getCertificate() 
	{
		return certificate;
	}
	public void setCertificate(Certificate certificate) 
	{
		this.certificate = certificate;
	}
}

