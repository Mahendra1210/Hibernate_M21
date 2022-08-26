package com.cg.repository;

import com.cg.entities.College;

public interface ICollegeRepository 
{
   public College addCollege(College college);
   public College updateCollege(College college);
   public College searchCollege(long id);
   public boolean deleteCollege(long id);
   public abstract void beginTransaction();
   public abstract void commitTransaction();
}
