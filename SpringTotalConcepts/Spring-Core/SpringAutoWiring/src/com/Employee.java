package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	private Dept department;
	public Employee() {
		System.out.println("Employee obj");

		// TODO Auto-generated constructor stub
	}

	public Dept getDepartment() {
		return department;
	}

	public void setDepartment(Dept department) {
		this.department = department;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
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

}
