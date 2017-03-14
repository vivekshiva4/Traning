package com;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		AnnotationConfiguration ac = new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
//		Employee e=new Employee(10, "empName", "loc", "housing");
//		se.save(e);
//		se.beginTransaction().commit();
		Employee e=(Employee) se.get(Employee.class, 10);
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getHousing());
		System.out.println(e.getLoc());
	}

}
