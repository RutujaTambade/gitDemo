package com.orm.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_details")
public class Student {
       @Id
       @Column(name="student_id")
	private int studentId;
       @Column(name="student_name")
	private String studentName;
       @Column(name="studentcity")
	private String studentcity;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentcity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentcity = studentcity;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentcity=" + studentcity
				+ "]";
	}
	
       
}
