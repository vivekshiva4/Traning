package or.vivek.Day23Rest.model;


public class Books {
	private int bookId;
	private int studentId;
	private String bookName;
	private String bookAuthor;
	private String bookContent;

	public Books() {
		// TODO Auto-generated constructor stub
	}

	public Books(int bookId, int studentId, String bookName, String bookAuthor,
			String bookContent) {
		super();
		this.bookId = bookId;
		this.studentId = studentId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookContent = bookContent;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookContent() {
		return bookContent;
	}

	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}

}

