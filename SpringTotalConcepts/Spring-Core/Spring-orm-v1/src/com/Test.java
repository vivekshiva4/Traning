package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;
import com.entity.dao.EmployeeDao;
import com.entity.dao.SaveEmpDao;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Employee e=new Employee();
		e.setEmpId(1236);
		e.setEmpName("name");
		e.setSalary(23.6);
		SaveEmpDao ed=ac.getBean("empDao",EmployeeDao.class);
		ed.saveEmp(e);
	}
}
