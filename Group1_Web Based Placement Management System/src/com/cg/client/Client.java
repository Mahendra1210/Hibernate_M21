package com.cg.client;


import java.time.LocalDate;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.service.AdminServiceImpl;
import com.cg.service.IAdminService;
import com.cg.service.IPlacementService;
import com.cg.service.IStudentService;
import com.cg.service.PlacementServiceImpl;
import com.cg.service.StudentServiceImpl;


public class Client 
{
	public static void main(String args[])
	{
		//Providing input for Student table
		Student student = new Student();
		IStudentService service = new StudentServiceImpl();
	    student.setId(1063);
		student.setName("Sambhaji");
		student.setCollege("JSPM");
		student.setRoll(7);
		student.setQualification("BE");
		student.setCourse("IT");
		student.setYear(2021);
		student.setHallTicketNo(321);
		
		//Providing input for Certificate table
		Certificate c=new Certificate();
		c.setId(2063);
		c.setYear(2021);
		
		//Setting methods to add certificate and student
		student.setCertificate(c);
		c.setStudent(student);
		
		//adding data including the mapped column in the table
		service.addStudent(student);
		
		//Displaying output for student table
		System.out.println("Student Id is: "+student.getId());
		System.out.println("Student name is: " +student.getName());
		System.out.println("Student Roll no. is: "+student.getRoll());
		System.out.println("Student College is: "+student.getCollege());
		System.out.println("Student Qualification Id is: "+student.getQualification());
		System.out.println("Student Course is: "+student.getCourse());
		System.out.println("Student Year is: "+student.getCollege());
		System.out.println("Student Hall Ticket is: "+student.getHallTicketNo());
		
		//Displaying output for certificate table
		System.out.println("Certificate Id is: "+c.getId());
		System.out.println("Certificate Year is: "+c.getYear());
		
		//Providing input for college table
		College col=new College();
		col.setId(3063);
		col.setCollegeName("PCCOE");
		col.setLocation("Pune");
		
		//Providing input for placement table
		Placement p=new Placement();
		IPlacementService placement =new PlacementServiceImpl();
		p.setId(6026);
		LocalDate date=LocalDate.now();
		p.setDate(date);
		p.setQualification("BE");
		p.setCollege(col);
		p.setName("placement creaters group");
		p.setYear(2022);
		placement.addPlacement(p);
		
		//Setting methods to add college and placement 
		col.setCollegeName("COEP");
	    p.setCollege(col);
	    
	   //adding data including the mapped column in the table
	    placement.addPlacement(p);
	    
	    //Displaying output for college table
	    System.out.println("College Id is: "+col.getId());
		System.out.println("College Name is: "+col.getCollegeName());
		System.out.println("College Location is : "+col.getLocation());
		
		//Displaying output for placement table
		System.out.println("Placement Id is: "+p.getId());
		System.out.println("Placement Date is: "+p.getDate());
		System.out.println("Placement Qualification is: "+p.getQualification());
		System.out.println("Placement College is: "+p.getCollege());
		System.out.println("Placement Name is: "+p.getName());
		System.out.println("Placement Year is : " +p.getYear());
		
		//Providing input for User table
		User u=new User();
		u.setId(4063);
		u.setName("Siddhi ");
		u.setType("New User");
		u.setPassword("Siddhi345");
		
		//Providing input for Admin table
		Admin a=new Admin();
		IAdminService ad=new AdminServiceImpl();
	    a.setId(7063);
		a.setName(" Shabnam ");
		a.setPassword("Shabh2345");
		
		//Setting methods for User and Admin table
		u.setAdmin(a);
	    a.setUser(u);
		
	    //Adding data including the mapped column in the table
	    ad.addNewAdmin(a);
	    
	    //Displaying output for User table
	    System.out.println("User ID is : " +u.getId());
		System.out.println("User Name is: "+u.getName());
		System.out.println("User Type is : "+u.getType());
		System.out.println("User Password is : "+u.getPassword());
		
		//Displaying output for admin table
		System.out.println("Admin ID is : " +a.getId());
		System.out.println("Admin Name is: "+a.getName());
		System.out.println("Admin Password is : "+a.getPassword());
	    
		
	
		System.out.println(" ");
	    System.out.println("Data is inserted");
		
		
	    
	    System.out.println(" ");
		System.out.println("Updated successfully");
		
	}

}