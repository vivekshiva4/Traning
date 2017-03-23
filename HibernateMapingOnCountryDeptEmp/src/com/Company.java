package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
@Entity
public class Company {
	
	@Id
	private int id;
	@Transient
	private HashMap<Country,HashMap<Department,List<Employee>>> office;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(int id, HashMap<Country, HashMap<Department, List<Employee>>> office) {
		super();
		this.id = id;
		this.office = office;
	}
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="companyDetails",joinColumns={@JoinColumn(name="companyId")},inverseJoinColumns={@JoinColumn(name="countryId")})
	List<Country> country=new ArrayList<Country>();
	
	public List<Country> getCountry() {
		return country;
	}
	
	public void setCountry(List<Country> country) {
		this.country = country;
	}
	public HashMap<Country, HashMap<Department, List<Employee>>> getOffice() {
		return office;
	}
	public void setOffice(HashMap<Country, HashMap<Department, List<Employee>>> office) {
		this.office = office;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
