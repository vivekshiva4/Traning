package org.vivek.Day25Rest.model;

public class StudentOne {
	private int studentId;
	private int bookId;
	private String bookName;
	private String version;
	
	public StudentOne() {
		// TODO Auto-generated constructor stub
	}

	public StudentOne(int studentId, int bookId,
			String bookName, String version) {
		super();
		this.studentId = studentId;
		this.bookId = bookId;
		this.bookName = bookName;
		this.version = version;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	

}
