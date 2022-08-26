package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User 
{
	
	@Id
	@Column(name="user_id")
	
	private int id;
	private String name;
	private String type;
	private String password;
	
	//Using One-To-One Mapping for connecting user and admin table
	@OneToOne(mappedBy="user")
	private Admin admin;

	//Getters and setters methods
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

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	public Admin getAdmin() 
	{
		return admin;	
	}

	public void setAdmin(Admin admin) 
	{
		this.admin = admin;	
	}
}
