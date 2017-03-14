package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {

		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure("hibernate.cfg.xml");
		
	SessionFactory sc=	ac.buildSessionFactory();
	Session se=sc.openSession();
	
	Vechile v= new Vechile();
	//v.setId(12);
	v.setName("byke");
	v.setColor("blfacbk");
	
	se.save(v);
	se.beginTransaction().commit();
	}

}
