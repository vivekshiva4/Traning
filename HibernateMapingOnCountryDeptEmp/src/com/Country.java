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

@Entity
public class Country {

	@Id
	private int countryId;
	private String countryName;
	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Country(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}


	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="countryDetails",joinColumns={@JoinColumn(name="countryId")},inverseJoinColumns={@JoinColumn(name="deptId")})
	List<Department> dept=new ArrayList<Department>();

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<Department> getDept() {
		return dept;
	}

	public void setDept(List<Department> dept) {
		this.dept = dept;
	}
	
	
}
