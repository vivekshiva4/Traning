package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jca.cci.core.RecordExtractor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository(value = "empDao")
public class EmployeeDao {
	@Autowired
	private JdbcTemplate jt;

	public int getEmpSalary(int empId) {

		String qry = "select salary from employee where empId=?";
		int salary = jt.queryForInt(qry, new Object[] { empId });

		return salary;
	}

	public Map<String, Object> getEmpsal(int empId) {
		String qry = "select salary from employee where empId=?";
		Map<String, Object> obj = jt.queryForMap(qry, new Object[] { empId });
		return obj;

	}

	public Employee getEmployee(int empId) {
		
		String qry = "select * from employee where empId=?";
		Employee emp = jt.queryForObject(qry, new Object[] { empId }, new empRowMapper());
		return emp;

	}
	
	public List<Employee> getAllEmployes(){
		
		String qry="select * from employee";
		List<Employee> emp=jt.query(qry,new empResultsetExtractor());
		
		
		return emp;
		
		
	}
	
	public class empResultsetExtractor implements ResultSetExtractor<List<Employee>>{
		
		@Override
		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
			ArrayList<Employee> emp=new ArrayList<Employee>();
			while(rs.next()){
				Employee e=new Employee();
				e.setEmpId(rs.getInt(1));
				e.setEmpName(rs.getString(2));
				e.setSalary(rs.getInt(3));
				emp.add(e);
			}
			
			return emp;
		}
		
	}

	public class empRowMapper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rn) throws SQLException {

			Employee emp = new Employee();
			emp.setEmpId(rs.getInt(1));
			emp.setEmpName(rs.getString(2));
			emp.setSalary(rs.getInt(3));
			return emp;
		}
	}
}