package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class CompanySave {
	public static void main(String[] args) {
		
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		List<Employee> e=new ArrayList<Employee>();
		Employee e1=new Employee(1, "kittu", 203256);
		Employee e2=new Employee(2, "vivek", 25684);
		Employee e3=new Employee(3, "jhon", 20322);
		Employee e4=new Employee(4, "clarck", 25689);
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);

		ArrayList<Department> d=new ArrayList<Department>();
		Department d1=new Department(1024, "police", "govt");
		d1.setEmps(e);
		d.add(d1);
		
		Country c=new Country(91, "india");
		c.setDept(d);
		
		HashMap<Department, List<Employee>> dept=new HashMap<Department, List<Employee>>();
		dept.put(d1, e);
		
		HashMap<Country,HashMap<Department,List<Employee>>> cout=new HashMap<Country, HashMap<Department,List<Employee>>>();
		cout.put(c,dept);
		
		
			Company co=new Company(121, cout);
			co.getCountry().add(c);
			
			se.save(co);
			se.beginTransaction().commit();
		
		 
		}

}
