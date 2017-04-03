package com.entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Employee;


@Repository(value="empDao")
public class EmployeeDao implements SaveEmpDao, DeleteEmpDao {
	
	@Autowired
	private SessionFactory sf;
	
	/* (non-Javadoc)
	 * @see com.entity.dao.SaveEmpDao#saveEmp(com.entity.Employee)
	 */
	@Override
	@Transactional
	public void saveEmp(Employee emp) {
		Session se = sf.getCurrentSession();

		se.save(emp);
	}
	
	/* (non-Javadoc)
	 * @see com.entity.dao.DeleteEmpDao#deleteEmp(int)
	 */
	@Override
	public void deleteEmp(int empId){
		
		Session se=sf.getCurrentSession();
		se.delete(se.get(Employee.class, empId));
		
	}


}
