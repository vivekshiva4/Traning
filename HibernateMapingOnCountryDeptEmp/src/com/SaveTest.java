package com;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SaveTest {
	public static void main(String[] args) {
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		Employee e1=new Employee(1, "kittu", 203256);
		Employee e2=new Employee(2, "vivek", 25684);
		Employee e3=new Employee(3, "jhon", 20322);
		Employee e4=new Employee(4, "clarck", 25689);

		Department d=new Department(1024, "police", "govt");
		d.getEmps().add(e1);
		d.getEmps().add(e2);
		
		Department d1=new Department(1025, "software", "private");
		d1.getEmps().add(e3);
		d1.getEmps().add(e4);
		
		se.save(d);
		se.save(d1);
		
		se.beginTransaction().commit();
		
	}

}
