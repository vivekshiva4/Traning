package or.vivek.Day24Rest.model;

public class School {
	private int studentId;
	private int bookId;
	private String bookName;
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(int studentId, int bookId, String bookName) {
		super();
		this.studentId = studentId;
		this.bookId = bookId;
		this.bookName = bookName;
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
	

}
