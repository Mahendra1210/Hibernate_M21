package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College 

{
  @Id
  
  private int id;
  private String collegeName;
  private String location;
  
  //Getters and Setters method
  public long getId() 
  {
	return id;
  }
  public void setId(int id) 
  {
	this.id = id;
  }
  public String getCollegeName() 
  {
	return collegeName;
  }
  public void setCollegeName(String collegeName) 
  {
	this.collegeName = collegeName;
  }
  public String getLocation() 
  {
	return location;
  }
  public void setLocation(String location) 
  {
	this.location = location;
  }

//To-String Method : To convert object into string
@Override
public String toString() {
	return "collegeName=" + collegeName + "";
}

	

}