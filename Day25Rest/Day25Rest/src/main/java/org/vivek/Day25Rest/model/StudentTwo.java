package org.vivek.Day25Rest.model;

public class StudentTwo {
	private int studentId;
	private Book book;
	public StudentTwo() {
		// TODO Auto-generated constructor stub
	}
	public StudentTwo(int studentId, Book book) {
		super();
		this.studentId = studentId;
		this.book = book;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	

}
