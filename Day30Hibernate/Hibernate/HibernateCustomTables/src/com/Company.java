package com;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
@Embeddable


public class Company {

private int compId;
private String compName;

public Company() {
	// TODO Auto-generated constructor stub
}

public Company(int compId, String compName) {
	super();
	this.compId = compId;
	this.compName = compName;
}

public int getCompId() {
	return compId;
}

public void setCompId(int compId) {
	this.compId = compId;
}

public String getCompName() {
	return compName;
}

public void setCompName(String compName) {
	this.compName = compName;
}

}
