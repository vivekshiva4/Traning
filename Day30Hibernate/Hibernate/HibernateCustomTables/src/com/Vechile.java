package com;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vechile_company")
public class Vechile {
@Id
private int vecId;
private String vechName;
@Embedded
private Company comp;
public Vechile() {
	// TODO Auto-generated constructor stub
}
public Vechile(int vecId, String vechName, Company comp) {
	super();
	this.vecId = vecId;
	this.vechName = vechName;
	this.comp = comp;
}
public int getVecId() {
	return vecId;
}
public void setVecId(int vecId) {
	this.vecId = vecId;
}
public String getVechName() {
	return vechName;
}
public void setVechName(String vechName) {
	this.vechName = vechName;
}
public Company getComp() {
	return comp;
}
public void setComp(Company comp) {
	this.comp = comp;
}



}
