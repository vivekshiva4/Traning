package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import oneToMany.Employee;
import oneToMany.Project;

public class OneToMany_FetchTest {

	public static void main(String[] args) {
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
Project p=(Project)	se.get(Project.class, 1024);
System.out.println("Project id is "+p.getProjId());
System.out.println("project name is"+p.getProjName());


List<Employee> emp=p.getEmps();

for(Employee emps:emp){
	System.out.println("employee id is"+emps.getEmpId());
	System.out.println("employee name is "+emps.getEmpName());
}
	}

}
