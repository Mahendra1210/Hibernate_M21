package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.Placement;

public class PlacementRepositoryImpl implements IPlacementRepository
{
    //step 1: Start JPA LifeCycle
	private EntityManager entityManager;
	
	public PlacementRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
   //Create opearation - Repo/DAO
	@Override
	public Placement addPlacement(Placement placement) 
	{
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) 
	{
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(long id) {
		Placement placement =entityManager.find(Placement.class,id);
		return placement;
	}
	
	@Override
	public boolean cancelPlacement(long id) {
		entityManager.remove(id);
		return false;
	}
	
	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
	}
	@Override
	public void commitTransaction() 
	{
		
		entityManager.getTransaction().commit();
	}
	

}
