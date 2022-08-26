package com.cg.service;

import com.cg.entities.Certificate;

public interface ICertificateService 
{
	public Certificate addCertificate(Certificate certificate); // Create
	
	public Certificate updateCertificate(Certificate certificate); // Update
	
	public Certificate searchCertificate(long id); // Retrieve
	
	public Certificate deleteCertificate(long id); // Delete

}
