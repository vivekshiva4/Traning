package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="employee")//it is used to registered in spring.xml file
public class Employee {
	
	private int empdId;
	private String empName;
	private double salary;
	
	@Autowired//this is used to link the department class to employee
	private Department dept;

	public int getEmpdId() {
		return empdId;
	}

	public void setEmpdId(int empdId) {
		this.empdId = empdId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
}
