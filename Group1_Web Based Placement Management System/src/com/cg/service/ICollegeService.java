package com.cg.service;

import com.cg.entities.College;

public interface ICollegeService 
{
	   public College addCollege(College college);
	   public College updateCollege(College college);
	   public College searchCollege(long id);
	   public boolean deleteCollege(long id);
}
