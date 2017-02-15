package comm;

public class Test {

	public static void main(String[] args) {

		StudentDao dao=new StudentDao();
		Student s1=new  Student();
		s1=dao.getStudent(2);
		System.out.println(s1.sname);
		
	}

}
