package com.cg.dao;

import com.cg.entities.Employee;

public interface EmployeeDao 
{
	//by default all the method are abstract in the Interface
	void addEmployee(Employee emp);//creation
	void updateEmployee(Employee emp);//updation
	Employee getEmployeeById(int ID);//retrieve
	void removeEmployee(Employee emp);//delete
	
	void commitTransaction();//close an entity manager
	
	void beginTransaction();//begin the operation of Entity manager
}
