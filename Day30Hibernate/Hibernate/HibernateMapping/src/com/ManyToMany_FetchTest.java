package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import manyToMany.Patient;
import manyToMany.Test;

public class ManyToMany_FetchTest {

	public static void main(String[] args) {
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		Patient p=(Patient) se.get(Patient.class, 101);
		System.out.println("patient id is "+p.getPatientId());
		System.out.println("patient name is "+p.getPatientName());
		
		for(Test t:p.getTests()){
			System.out.println("test id is "+t.getTestId());
			System.out.println("Test name is "+t.getTestName());
		}
	}

}
