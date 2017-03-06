package day25restTest;

import java.util.ArrayList;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private int salary;
	
	public Employee() {

	}

	public Employee(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void display(ArrayList<Employee> emps){
		System.out.println("EmpId\tEmpName\tEmpSalary");
		System.out.println("------------------------------");
		for(Employee emp:emps){
			System.out.print(emp.empId+"\t"+emp.empName+"\t"+emp.salary);
			System.out.println();
		}
	}
@Override
public int compareTo(Employee emp) {
	return empId-emp.getEmpId();
}
}
