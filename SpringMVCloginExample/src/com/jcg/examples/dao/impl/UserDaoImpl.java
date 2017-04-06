package com.jcg.examples.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jcg.examples.viewBean.Student;
@Repository
public class UserDaoImpl implements UserDao  {

	@Autowired
	private SessionFactory sessionFactory;
	
	DataSource dataSource;

	public DataSource getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	
	@Override
	public boolean isValidUser(String username, String password) throws SQLException {
		String query = "Select * from userSprings where userName = ? and password = ?";
		PreparedStatement pstmt = dataSource.getConnection().prepareStatement(query);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		ResultSet resultSet = pstmt.executeQuery();
		if (resultSet.next())
			return true;
		else
			return false;
	}
	
	@Override
	public void addStudent(Student student){
		sessionFactory.getCurrentSession().save(student);
	}

	
	@Override
	public List<Student> getAllStudents(){
		return (List<Student>) sessionFactory.getCurrentSession().createQuery("from Student").list();
		
	}

}