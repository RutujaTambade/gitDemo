package com.orm.Dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.Entity.Student;

public class studentDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student)
	{
	
		int i=(Integer) this.hibernateTemplate.save(student);
		return 1;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
