package com.tns.association2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPT_MASTER")
public class Department 
{
	@Id
	private int id;
	private String name;
	//one department has many employess so the dept id's belongs to all the employees
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	private Set<Employee> employees=new HashSet<>(); //initialization required		

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	//the method below will add employee to department 
	//also serves the purpose to avoid cyclic references. 
	public void addEmployee(Employee employee) {
		employee.setDept(this);	//this will avoid nested cascade
		this.getEmployees().add(employee);
	}


}
