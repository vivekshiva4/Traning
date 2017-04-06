package com.jcg.examples.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.jcg.examples.viewBean.Student;

public interface UserDao {

	boolean isValidUser(String username, String password) throws SQLException;

	void addStudent(Student student);

	List<Student> getAllStudents();

}