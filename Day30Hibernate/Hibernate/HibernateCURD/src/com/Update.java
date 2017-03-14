package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Update {
	
	public static void main(String[] args) {
		
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		Employee e=(Employee) se.get(Employee.class, 101);
		
		e.setEmpName("hey");
		e.setEmpLoc("hi");
		
		se.update(e);
		se.beginTransaction().commit();
		
	}

}
