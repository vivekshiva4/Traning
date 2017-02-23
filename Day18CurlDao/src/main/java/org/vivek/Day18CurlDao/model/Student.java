package org.vivek.Day18CurlDao.model;

public class Student {
	private int id;
	private String sname;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	

}
