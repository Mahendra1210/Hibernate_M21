package com.cg.repository;

import com.cg.entities.Placement;

public interface IPlacementRepository 
{
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement); 
	public Placement searchPlacement(long id);	
	public boolean cancelPlacement(long id);
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
