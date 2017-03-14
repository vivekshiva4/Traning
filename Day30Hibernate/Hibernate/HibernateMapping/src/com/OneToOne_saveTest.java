package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import oneToOne.Dept;
import oneToOne.Employee;
import oneToOne.Project;


public class OneToOne_saveTest {

	public static void main(String[] args) {

		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		Project proj=new Project();
		proj.setProjId(1024);
		proj.setProjName("project1");
		
		Dept dept=new Dept();
		dept.setDeptId(101);
		dept.setDeptName("hr");
		
		Employee e=new Employee();
		e.setEmpId(1);
		e.setEmpName("vivek");
		e.setSalary(200000);
		e.setProj(proj);
		e.setDept(dept);
		
		//se.save(proj);
		se.save(e);
		
		se.beginTransaction().commit();
	}

}
