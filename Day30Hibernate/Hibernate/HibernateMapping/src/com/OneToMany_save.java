package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import oneToMany.Employee;
import oneToMany.Project;

public class OneToMany_save {

	public static void main(String[] args) {
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		Employee e1=new Employee(1, "kittu", 203256);
		Employee e2=new Employee(2, "vivek", 25684);
		
		Project p=new Project(1024, "one");
		p.getEmps().add(e1);
		p.getEmps().add(e2);
		
		se.save(p);
		se.beginTransaction().commit();
	}

}
