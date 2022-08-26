package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.Admin;

public class AdminRepositoryImpl  implements IAdminRepository
{
	//Starting JPA LifeCycle
	private EntityManager entityManager;
	
		//Constructor
		public AdminRepositoryImpl() 
		{
		entityManager=JPAUtil.getEntityManager();
		}

	//Implementing methods
	@Override
	public Admin addNewAdmin(Admin admin) 
	{
		entityManager.persist(admin);
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) 
	{
		entityManager.merge(admin);
		return admin;
	}

	@Override
	public Admin deleteAdmin(long id) 
	{
		entityManager.remove(id);
        return null;
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
