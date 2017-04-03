package com.employee.controller;

public class Employee {

	private String fName;
	private int age;
	private Address empAddress;
	public Address getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
