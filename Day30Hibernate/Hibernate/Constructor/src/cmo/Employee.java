package cmo;

public class Employee {

	int empId;
	String name;
	String company;

	public Employee(int empId, String name, String company) {

		this.empId = empId;
		this.name = name;
		this.company = company;
		System.out.println("empid is:"+empId);
		System.out.println("emp name is:"+name);
		System.out.println("emp company is:"+company);
		System.out.println("------------");
	}
	
}
