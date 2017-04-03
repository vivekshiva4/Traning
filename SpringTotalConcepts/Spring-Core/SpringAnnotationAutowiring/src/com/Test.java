package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e=ac.getBean("employee",Employee.class);
		e.setEmpdId(1024);
		e.setEmpName("kittu");
		e.setSalary(23263);
		e.getDept().setDeptId(10);
		e.getDept().setDeptName("it");
		
		System.out.println("Employee id is "+e.getEmpdId());
		System.out.println("Employee name is "+e.getEmpName());
		System.out.println("employee salary is"+e.getSalary());
		System.out.println("depaetment is "+e.getDept().getDeptId());
		System.out.println("Department name is "+e.getDept().getDeptName());
		
	}

}
