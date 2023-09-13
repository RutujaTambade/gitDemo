package com.Entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hr")
public class Register_Entity {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
@Column(name="EmpName")
	private String EmpName;
	
@Column(name="skill")
	private String  Skill ;

@Column (name="TotalExprience")	
	private String TotalExprience;

public Register_Entity(int id, String empName, String skill, String totalExprience) {
	super();
	this.id = id;
	EmpName = empName;
	Skill = skill;
	TotalExprience = totalExprience;
}

public Register_Entity() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmpName() {
	return EmpName;
}

public void setEmpName(String empName) {
	EmpName = empName;
}

public String getSkill() {
	return Skill;
}

public void setSkill(String skill) {
	Skill = skill;
}

public String getTotalExprience() {
	return TotalExprience;
}

public void setTotalExprience(String totalExprience) {
	TotalExprience = totalExprience;
}

@Override
public String toString() {
	return "Register_Entity [id=" + id + ", EmpName=" + EmpName + ", Skill=" + Skill + ", TotalExprience="
			+ TotalExprience + "]";
}



	
}
