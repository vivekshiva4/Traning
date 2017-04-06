package com.jcg.examples.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jcg.examples.dao.impl.UserDao;
import com.jcg.examples.viewBean.Student;
@Service("userService")
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return this.userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean isValidUser(String username, String password) throws SQLException {
		return userDao.isValidUser(username, password);
	}

	@Override
	@Transactional
	public void addStudent(Student student) {
		userDao.addStudent(student);
	}
	
	@Override
	@Transactional
	 public List<Student> getAllStudents(){
		return userDao.getAllStudents();
	}

}
