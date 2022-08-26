package com.cg.service;

import java.util.Scanner;

import com.cg.entities.Admin;
import com.cg.repository.AdminRepositoryImpl;

public class AdminServiceImpl implements IAdminService
{
	//Establishing connection between service and repository
	private AdminRepositoryImpl uao;
	
	Scanner s=new Scanner(System.in);
		
		//constructor
		public AdminServiceImpl() 
		{
			uao=new AdminRepositoryImpl();
		}
		
	//Service calls to perform CRUD Operation
	@Override
	public Admin addNewAdmin(Admin admin) 
	{
		uao.beginTransaction();
		uao.addNewAdmin(admin);
		uao.commitTransaction();
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) 
	{
		uao.beginTransaction();
		uao.updateAdmin(admin);
		uao.commitTransaction();
		return admin;
	}

	@Override
	public Admin login(Admin admin) 
	{
		System.out.println("Enter the admin name:");
		String uname=s.nextLine();
		System.out.println("Enter the Password :");
		String upsw=s.nextLine();
		if(uname==admin.getName() && upsw==admin.getPassword()) {
			return admin;
	}
	
	else 
	{
		System.out.println("Invalid admin name or password :");
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

