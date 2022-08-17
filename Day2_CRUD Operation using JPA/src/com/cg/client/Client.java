package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		//lazy initialization
		EmployeeService service=new EmployeeeServiceImpl();
		Employee emp=new Employee();
		
		//create operation
		/*emp.setID(104);
		emp.setNAME("Jordan");
		service.addEmployee(emp);*/
		
		//retrieve a data
		/*emp=service.getEmployeeById(102);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp Name: "+emp.getNAME());*/
		
		//update a data
		/*emp=service.getEmployeeById(102);
		emp.setNAME("Max");
		service.updateEmployee(emp);*/
		
		//delete a data
		emp=service.getEmployeeById(104);
		service.removeEmployee(emp);
		
	}

}
