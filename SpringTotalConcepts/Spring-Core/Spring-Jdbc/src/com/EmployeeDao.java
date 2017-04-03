package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value="empDao")
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jt;
	
	public int findempById(){
		return jt.queryForInt("select salary from employee where empId=1");
	}
}
