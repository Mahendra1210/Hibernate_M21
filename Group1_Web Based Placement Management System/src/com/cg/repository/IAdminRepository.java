package com.cg.repository;

import com.cg.entities.Admin;

public interface IAdminRepository 
{	
	public Admin addNewAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin deleteAdmin(long id);
	void beginTransaction();
	void commitTransaction();	
}
