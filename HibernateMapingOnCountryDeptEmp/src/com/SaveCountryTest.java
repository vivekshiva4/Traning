package com;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SaveCountryTest {

	public static void main(String[] args) {

		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		ArrayList<Employee> e=new ArrayList<Employee>();
		Employee e1=new Employee(1, "kittu", 203256);
		Employee e2=new Employee(2, "vivek", 25684);
		Employee e3=new Employee(3, "jhon", 20322);
		Employee e4=new Employee(4, "clarck", 25689);
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);

		
		
		Department d=new Department(1024, "police", "govt");
		d.setEmps(e);
		
		
		
		Country c=new Country(91, "india");
		c.getDept().add(d);
		
		se.save(c);
		se.beginTransaction().commit();
	}

}
