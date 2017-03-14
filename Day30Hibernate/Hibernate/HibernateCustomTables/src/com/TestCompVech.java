package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestCompVech {

	public static void main(String[] args) {
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		Company c=new Company(102, "compName");
		Vechile v=new Vechile(1024, "vechName", c);
		se.save(v);
		se.beginTransaction().commit();
	}

}
