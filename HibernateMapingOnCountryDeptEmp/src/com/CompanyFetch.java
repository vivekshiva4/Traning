package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class CompanyFetch {

	public static void main(String[] args) {
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.configure();
		
		SessionFactory sf=ac.buildSessionFactory();
		Session se=sf.openSession();
		
		Company c=(Company)se.get(Company.class,121);
		System.out.println("company Id is"+c.getId());
		
		List<Country> c1=c.getCountry();
		for(Country c2:c1){
			System.out.println("country id is"+c2.getCountryId());
			System.out.println("country name is "+c2.getCountryName());
		List<Department> d=c2.getDept();
		for(Department d1:d){
			System.out.println("department id is"+d1.getDeptId());
			System.out.println("department name is"+d1.getDeptName());
			List<Employee> e=d1.getEmps();
				for(Employee e1:e){
					System.out.println("employee id is "+e1.getEmpId());
				System.out.println("Employee name is"+e1.getEmpName() );
			}
		}
		}
		

	}

}
