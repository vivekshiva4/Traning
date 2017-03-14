package com;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import manyToMany.Patient;
import manyToMany.Test;

public class ManyToMany_saveTest {

	public static void main(String[] args) {
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		Test t1=new Test(1, "blood");
		Test t2=new Test(2, "blood1");
		Test t3=new Test(3, "blood2");
		Test t4=new Test(4, "blood3");
		Patient p=new Patient(101, "vivek");

		
		ArrayList<Test> tests=new ArrayList<Test>();
		
		tests.add(t1);
		tests.add(t2);
		tests.add(t3);
		tests.add(t4);
		
		p.setTests(tests);
		
		se.save(p);
		se.beginTransaction().commit();
	}

}
