package day25restTest;

public class Test {

	public static void main(String[] args) {
		Book book=new Book(10255, "bookName", "version");
		Student s=new Student(1025, book);
		s.display();	

	}

}
