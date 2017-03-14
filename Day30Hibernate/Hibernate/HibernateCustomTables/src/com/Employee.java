package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "hibernateEmployee")
@SecondaryTable(name = "dept")
public class Employee {
	@Id
	private int empId;
	private String empName;
	@Column(table = "dept")
	private String loc;
	@Column(table = "dept")
	private String housing;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String loc, String housing) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.loc = loc;
		this.housing = housing;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getHousing() {
		return housing;
	}

	public void setHousing(String housing) {
		this.housing = housing;
	}

}
