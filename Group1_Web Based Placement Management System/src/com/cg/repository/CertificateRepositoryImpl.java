package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.Certificate;

public class CertificateRepositoryImpl implements ICertificateRepository
{
	//Step 1: Start JPA LifeCycle
	private EntityManager em;
	
	
	
	//Constructor
	public CertificateRepositoryImpl() 
	{
		super();
		em = JPAUtil.getEntityManager();
	}
	
	// Implementing methods
	@Override
	public Certificate addCertificate(Certificate certificate) {
		em.persist(certificate);
		return certificate ;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		em.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificate(long id) {
	Certificate certificate =em.find(Certificate.class, id);
		return certificate ;
	}

	@Override
	public Certificate deleteCertificate(long id) {
		em.remove(id);
		return null;
		
	}


	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}



}