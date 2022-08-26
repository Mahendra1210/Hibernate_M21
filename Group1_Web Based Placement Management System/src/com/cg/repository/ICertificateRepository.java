package com.cg.repository;

import com.cg.entities.Certificate;

public interface ICertificateRepository 
{
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(long id);
	public Certificate deleteCertificate(long id);
	
	public abstract void commitTransaction();//close an entity manager
	
	public abstract void beginTransaction();//begin the operation of Entity manager

}

