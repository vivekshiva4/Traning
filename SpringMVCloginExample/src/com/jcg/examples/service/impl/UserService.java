package com.jcg.examples.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.jcg.examples.viewBean.Student;

public interface UserService {

	boolean isValidUser(String username, String password) throws SQLException;

	void addStudent(Student student);

	List<Student> getAllStudents();

}