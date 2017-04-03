package com.entity.dao;

import org.springframework.transaction.annotation.Transactional;

import com.entity.Employee;

public interface SaveEmpDao {

	void saveEmp(Employee emp);

}