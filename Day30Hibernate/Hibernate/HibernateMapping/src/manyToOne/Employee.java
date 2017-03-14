package manyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;


@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	private int salary;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="empDetails",joinColumns={@JoinColumn(name="empId")},inverseJoinColumns={@JoinColumn(name="projId")})
	private Project proj;
	
	
	public Project getProj() {
		return proj;
	}
	public void setProj(Project proj) {
		this.proj = proj;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public Employee(int empId, String empName, int salary, Project proj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.proj = proj;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
