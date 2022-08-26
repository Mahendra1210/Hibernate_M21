package com.cg.service;
import java.util.Scanner;

import com.cg.entities.User;
import com.cg.repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService
{
	//Esatablishing connection between Service and Repo
	private UserRepositoryImpl uro;
	Scanner s = new Scanner(System.in);
	
	//Constructor
	public UserServiceImpl() 
	{
		uro = new UserRepositoryImpl();
	}
	
	//Service calls to perform CRUD Operation
	@Override
	public User addNewUser(User user) 
	{
		uro.beginTransaction();
		uro.addNewUser(user);
		uro.commitTransaction();
		return user;
	}

	@Override
	public User updateuser(User user) 
	{
		uro.beginTransaction();
		uro.addNewUser(user);
		uro.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) 
	{
		System.out.println("Enter the username : ");
		String username = s.nextLine();
		System.out.println(" Enter the passowrd :");
		String password = s.nextLine();
		if(username == user.getName() && password == user.getPassword())
		{
			return user;
		}
		else
		{
			System.out.println("Invalid Username and Password");
			return null;
		}
		
	}
	
	@Override
	public boolean logout() 
	{
		System.exit(0);
		return true;
	}
}