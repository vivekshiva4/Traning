package com.emp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emp.entity.Employee;
@Repository(value="empDao")
public class EmployeeDao {

	@Autowired
	private SessionFactory sf;

	@Transactional
	public void saveEmp(Employee emp) {
		Session se = sf.getCurrentSession();

		se.save(emp);
	}

}
