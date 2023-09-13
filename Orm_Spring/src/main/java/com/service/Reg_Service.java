package com.service;

import org.springframework.stereotype.Service;

import com.orm.Dao.Register_Dao;
import com.orm.Entity.Register;

@Service
public class Reg_Service {
       
	private Register_Dao register_Dao;
	
	public int Registeruser(Register register) {
		
		return this.register_Dao.Signup(register);
		
	}

	public void Registeruser(com.controller.Register register) {
		// TODO Auto-generated method stub
		
	}
}
