package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class FetchTest {

	public static void main(String[] args) {
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		Department d=(Department) se.get(Department.class,1024 );
		System.out.println("Department name is"+d.getDeptName());
		System.out.println("departmentType is "+d.getDeptType());
		
		List<Employee> emps=d.getEmps();
		for(Employee emp:emps){
			System.out.println("Employee id is"+emp.getEmpId());
			System.out.println("employee Name is "+emp.getEmpName());
			System.out.println("Employee salary is "+emp.getSalary());
		}
	}

}
