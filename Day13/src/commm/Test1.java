package commm;

public class Test1 {

	public static void main(String[] args) {
		
		StudenttDao dao=new StudenttDao();
		Studentt s1=new Studentt();
		s1.id=6;
		s1.sname="kiyyyu";
		dao.connect();
		dao.addStudent(s1);
		System.out.println("data added sucessfully");
	}

}

