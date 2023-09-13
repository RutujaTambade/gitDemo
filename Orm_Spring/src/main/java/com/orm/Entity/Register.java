package com.orm.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Info")
public class Register {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
     @Column(name="Name")
      private String Name;
	@Column(name="Address")
	private String Address;
	@Column(name="City")
	private String City;
	@Column(name="pincode")
	private String pincode;
	@Column(name="Email")
	private String Email;
	@Column(name="Percentage")
	private int Percentage;
	@Column(name="MobileNo")
	private int MobileNo;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String name, String address, String city, String pincode, String email, int percentage,
			int mobileNo) {
		super();
		Name = name;
		Address = address;
		City = city;
		this.pincode = pincode;
		Email = email;
		Percentage = percentage;
		MobileNo = mobileNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPercentage() {
		return Percentage;
	}
	public void setPercentage(int percentage) {
		Percentage = percentage;
	}
	public int getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Register [Name=" + Name + ", Address=" + Address + ", City=" + City + ", pincode=" + pincode
				+ ", Email=" + Email + ", Percentage=" + Percentage + ", MobileNo=" + MobileNo + "]";
	}
	
	
	
}
