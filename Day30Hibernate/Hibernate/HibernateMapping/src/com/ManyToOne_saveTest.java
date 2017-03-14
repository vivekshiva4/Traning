package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import manyToOne.Employee;
import manyToOne.Project;

public class ManyToOne_saveTest {

	public static void main(String[] args) {
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		Project p1=new Project(1024, "icici");
		Project p2 =new  Project(1025, "sbh");
		
		Employee e1=new Employee(1, "kittu", 22225, p1);
		Employee e2=new Employee(2, "kittu1", 22225, p1);
		Employee e3=new Employee(3, "kittu2", 22225, p2);
		Employee e4=new Employee(4, "kittu3", 22225, p2);
		
		se.save(e1);
		se.save(e2);
		se.save(e3);
		se.save(e4);

		se.beginTransaction().commit();
	}

}
