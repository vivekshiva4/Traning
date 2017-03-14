package oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;


@Entity
public class Project {

	public Project() {
	
	}

	public Project(int projId, String projName) {
		super();
		this.projId = projId;
		this.projName = projName;
	}

	@Id
	private int projId;
	@Column(length = 20)
	private String projName;

	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="projDetails",joinColumns={@JoinColumn(name="projId")},inverseJoinColumns={@JoinColumn(name="empId")})

	List<Employee> emps = new ArrayList<Employee>();

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

}

