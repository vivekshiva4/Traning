package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import manyToOne.Employee;

public class ManyToOne_FetchTest {

	public static void main(String[] args) {
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		Employee e=(Employee) se.get(Employee.class, 1);
		System.out.println("employee id is "+e.getEmpId());
		System.out.println("employee name is "+e.getEmpName());
		System.out.println("Employee salary is "+e.getSalary());
		System.out.println("employee project id is "+e.getProj().getProjId());
		System.out.println("Employee project name is "+e.getProj().getProjName());
	}

}
