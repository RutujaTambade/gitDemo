package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.Dao.studentDao;
import com.orm.Entity.Student;

public class App {

	
	public static void main(String []args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		studentDao studentDao=context.getBean("studentDao",studentDao.class);
		Student student=new Student(12,"Pradnya bhor","Manchar");
		 int r=studentDao.insert(student);
		 System.out.println("done"+r);
	}
}
