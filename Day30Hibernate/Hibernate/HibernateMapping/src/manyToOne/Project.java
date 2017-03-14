package manyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
@Id
private int projId;
private String projName;
public Project() {
	// TODO Auto-generated constructor stub
}
public Project(int projId, String projName) {
	super();
	this.projId = projId;
	this.projName = projName;
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
