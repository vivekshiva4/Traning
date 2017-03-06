package day25restTest;

public class Student {
	private int studentId;
	private Book book;

	
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

	public Student(int studentId, Book book) {
		super();
		this.studentId = studentId;
		this.book = book;
	}
public void display(){
	System.out.println("student  id"+studentId);
	System.out.println("bookid is "+book.getBookId());
	System.out.println("book name"+book.getBookName());
	System.out.println("book version"+book.getVersion());

}

}
