package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Department {
	@Id
	private int deptId;
	private String deptName;
	private String deptType;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	

	public Department(int deptId, String deptName, String deptType) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptType = deptType;
	}


	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="departmentDetails",joinColumns={@JoinColumn(name="deptId")},inverseJoinColumns={@JoinColumn(name="empId")})
	List<Employee> emps=new ArrayList<Employee>();

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptType() {
		return deptType;
	}

	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
	

}
