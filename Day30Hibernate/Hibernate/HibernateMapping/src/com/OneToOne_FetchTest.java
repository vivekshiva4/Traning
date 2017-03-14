package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import oneToOne.Employee;

public class OneToOne_FetchTest {

	public static void main(String[] args) {

		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		Employee e=(Employee) se.get(Employee.class, 1);
		System.out.println("employee id is"+e.getEmpId());
		System.out.println("employee nameis "+e.getEmpName());
		System.out.println("employee salary is"+e.getSalary());
		System.out.println("project id is"+e.getProj().getProjId());
		System.out.println("project name is"+e.getProj().getProjName());
		System.out.println("dept id is"+e.getDept().getDeptId());
		System.out.println("dept name is"+e.getDept().getDeptName());
		
	}

}
