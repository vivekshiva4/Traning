package day25restTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class sortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getEmpName().compareTo(e2.getEmpName());
	}
}
class sortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getSalary()-e2.getSalary();
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e=new Employee();

		Employee e1=new Employee(1025, "vivek", 2569);
		Employee e2=new Employee(1027, "kittu", 2533);
		Employee e3=new Employee(1028, "shiva", 25651);
		
		ArrayList<Employee> emps=new ArrayList<Employee>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		e.display(emps);
		
		System.out.println("\n sorting on emp id ");
		Collections.sort(emps);
		e.display(emps);
		
		System.out.println("\nsorting by name");
		Collections.sort(emps,new sortByName());
		e.display(emps);
		
		System.out.println("\nsorting by salary");
		Collections.sort(emps,new sortBySalary());
		e.display(emps);
		
	}
	

}
