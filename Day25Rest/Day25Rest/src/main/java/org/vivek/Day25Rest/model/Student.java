package org.vivek.Day25Rest.model;

public class Student {
	private int student_book_Id;
	private int studentId;
	private int bookId;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int student_book_Id, int studentId, int bookId) {
		super();
		this.student_book_Id = student_book_Id;
		this.studentId = studentId;
		this.bookId = bookId;
	}

	public int getStudent_book_Id() {
		return student_book_Id;
	}

	public void setStudent_book_Id(int student_book_Id) {
		this.student_book_Id = student_book_Id;
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
	

}
