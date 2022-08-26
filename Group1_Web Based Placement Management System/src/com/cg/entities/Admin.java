package com.cg.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin 
{
	@Id
	private int id;
	private String name;
	private String password;
	
	//Using One-To-One Mapping for connecting user and admin table
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
	//Getters And Setters Method
	public long getId() 
	{
		return id;
	}
	public void setId(int id) 
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
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public User getUser() 
	{
		return user;	
	}

	public void setUser(User user) 
	{
		this.user = user;	
	}
}
