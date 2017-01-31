package comm;

public class Employee {
	String name;
	String courseName;
	double courseFees;
	String courseType;
	String courseTime;
	
	public void enroll(){
		
	}
	public void display(){
		System.out.println("course name is "+courseName);
		System.out.println(name+" is enrolled for  "+courseName);
		System.out.println("course fees is "+courseFees);
		System.out.println("course type is " +courseType );
		System.out.println("course time is "+courseTime);
		System.out.println("-------------------------------------------------------------");
	}
	
	

}
