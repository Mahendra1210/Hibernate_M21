package com.cg.service;

import com.cg.entities.Employee;

public interface EmployeeService 
{
	//by default all the method are abstract in the Interface
	void addEmployee(Employee emp);//creation
	void updateEmployee(Employee emp);//updation
	Employee getEmployeeById(int ID);//retrieve
	void removeEmployee(Employee emp);//delete

}
