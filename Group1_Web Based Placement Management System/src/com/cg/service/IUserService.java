package com.cg.service;

import com.cg.entities.User;

public interface IUserService 
{
	User addNewUser(User user);
	User updateuser(User user);
	User login(User user);
	boolean logout();
}