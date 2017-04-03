package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emp.dao.EmployeeDao;
import com.emp.entity.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		 Employee emp=new Employee();
		 emp.setEmpId(124);
		 emp.setEmpName("kittu");
		 emp.setSalary(23.36);

		 EmployeeDao ed=ac.getBean("empDao",EmployeeDao.class);
		 ed.saveEmp(emp);
	}

}
