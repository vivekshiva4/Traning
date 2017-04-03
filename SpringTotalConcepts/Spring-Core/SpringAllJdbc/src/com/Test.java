package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeDao e=ac.getBean("empDao",EmployeeDao.class);
		//qrueryfor int
		System.out.println("salary is "+e.getEmpSalary(5));
		System.out.println("slary is "+e.getEmpsal(4));//one methd
		
		//qrueryfor map
		System.out.println("salary is "+e.getEmpsal(2).get("salary"));
		System.out.println("----------------------------");
		//qrueryfor obj
	Employee emp=e.getEmployee(5);
	System.out.println("emp id is"+emp.getEmpId());
	System.out.println("empname is"+emp.getEmpName());
	System.out.println("salary is "+emp.getSalary());
	System.out.println("---------------------------------");
	// qrueryfor resultsetextractor
	
	List<Employee> em=e.getAllEmployes();

	for(Employee ee:em){
		System.out.println(ee.getEmpId());
		System.out.println(ee.getEmpName());
		System.out.println(ee.getSalary());
		System.out.println("--------------------");
	}
	
	}

}
