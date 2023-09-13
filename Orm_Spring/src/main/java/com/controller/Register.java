package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.Reg_Service;


@Controller
public class Register {
        @Autowired
        private Reg_Service reg_service;
        
        @ModelAttribute
    @RequestMapping("/Registers")
	     public String Signup() {
     	System.out.println("hiii..");
		return "Registers";
    }
		@RequestMapping(path="/insertData",method=RequestMethod.POST)
		String registerUser(@ModelAttribute("register")Register register,Model model) {
			System.out.println(register);
			this.reg_service.Registeruser(register);
			 return " Sucess";
		
	}

}
