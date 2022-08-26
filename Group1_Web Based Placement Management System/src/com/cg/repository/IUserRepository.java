package com.cg.repository;

import com.cg.entities.User;

public interface IUserRepository 
{
	User addNewUser(User user);
	User updatedUser(User user);
	User deleteUser(long id);
	void beginTransaction();
	void commitTransaction();
}