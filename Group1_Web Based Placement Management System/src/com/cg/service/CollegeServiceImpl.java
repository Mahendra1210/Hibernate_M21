package com.cg.service;

import com.cg.entities.College;
import com.cg.repository.CollegeRepositoryImpl;
import com.cg.repository.ICollegeRepository;

public class CollegeServiceImpl implements ICollegeService
{
    //Step 1:Esatablishing connection between Service and Repo
	private ICollegeRepository dao;
	
	public CollegeServiceImpl() 
	{
		dao = new CollegeRepositoryImpl();
	}

	//Step 2:Service calls to perform CRUD Operation
	@Override
	public College addCollege(College college) 
	{
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) 
	{
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return null;
	}

	@Override
	public College searchCollege(long id) 
	{
		College college = dao.searchCollege(id);
		return college;
	}

	@Override
	public boolean deleteCollege(long id) 
	{
		dao.beginTransaction();
		boolean res2 = dao.deleteCollege(id);
		dao.commitTransaction();
		return res2;
	}
}
