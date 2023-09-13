package com.orm.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.orm.Entity.Register;

@Repository
public class Register_Dao {
 @Autowired
	private HibernateTemplate hibernateTemplate;
	
      @Transactional
     public int Signup(Register register)
	{
		int id=(Integer) this.hibernateTemplate.save(register);
		 return id;
	}

	
}


