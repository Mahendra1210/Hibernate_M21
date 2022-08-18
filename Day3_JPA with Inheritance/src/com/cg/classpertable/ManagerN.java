package com.cg.classpertable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MGR_table1")
public class ManagerN extends EmployeeN
{
	private static final long serialVersionUID=1L;
	private String deptName;
	public String getDeptName()
	{
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}