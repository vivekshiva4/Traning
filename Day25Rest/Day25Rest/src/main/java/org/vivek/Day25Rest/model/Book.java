package org.vivek.Day25Rest.model;

public class Book {
	private int bookId;
	private String bookName;
	private String version;
public Book() {
	// TODO Auto-generated constructor stub
}
public Book(int bookId, String bookName, String version) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.version = version;
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
