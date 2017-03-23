package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class FetchCountryTest {
public static void main(String[] args) {
	AnnotationConfiguration ac=new AnnotationConfiguration();
	ac.configure();
	
	SessionFactory sf=ac.buildSessionFactory();
	Session se=sf.openSession();
	
	Country c=(Country)se.get(Country.class, 91);
	System.out.println("country id is "+c.getCountryId());
	
	List<Department> d=c.getDept();
	for(Department dd:d){
		System.out.println("DepartmentId is"+dd.getDeptId());
		System.out.println("Department name is"+dd.getDeptName());
		System.out.println("Department Type is "+dd.getDeptType());
		List<Employee> el=dd.getEmps();
		for(Employee emp:el){
			System.out.println("Employee id is"+emp.getEmpId());
			System.out.println("employee Name is "+emp.getEmpName());
			System.out.println("Employee salary is "+emp.getSalary());
		}
	}
	
	

	
	
	
}
}
