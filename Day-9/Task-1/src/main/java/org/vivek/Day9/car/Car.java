package org.vivek.Day9.car;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car {
	
	int id;
	String name;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
