package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e=ac.getBean("emp",Employee.class);
		
		System.out.println("Employee id is"+e.getEmpId());
		System.out.println("employee Name is"+e.getEmpName());
		System.out.println("Employee salary is"+e.getSalary());
		
		System.out.println("Department iD is "+e.getDepartment().getDeptId());
		System.out.println("Department name is "+e.getDepartment().getDeptName());
	}
}
//here Dept class is adependency class so it doesn't depends on any other  classes.
//Employee class is a dependent class .because it uses dept class.
//if we want to inject depndency oj to dependent class we use wiring.
//there are two types of wiring manual wiring and auto wiring.
//manual wirig must set the property name  and set ref to that bean id of dept
//auto wiring has two types bytype and byname.
//by type will set to class by automatic.
//btname must set to id name of property in employee to id name of bean class in dept bean.
