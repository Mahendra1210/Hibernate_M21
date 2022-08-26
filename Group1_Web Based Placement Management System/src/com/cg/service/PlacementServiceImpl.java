package com.cg.service;

import com.cg.entities.Placement;
import com.cg.repository.PlacementRepositoryImpl;
import com.cg.repository.IPlacementRepository;

public class PlacementServiceImpl implements IPlacementService
{
   //step1 : Establishing connection between Service and Repo
	private IPlacementRepository dao;
	
	public PlacementServiceImpl() 
	{
		dao = new PlacementRepositoryImpl();
	}
	
    //step2 : Service calls to perform CRUD Operation
	@Override
	public Placement addPlacement(Placement placement)
	{
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) 
	{
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(long id) 
	{
		Placement placement = dao.searchPlacement(id);
		return placement;
	}

	@Override
	public boolean cancelPlacement(long id) 
	{
		dao.beginTransaction();
		boolean res1 = dao.cancelPlacement(id);
		dao.commitTransaction();
		return res1;
	}
}