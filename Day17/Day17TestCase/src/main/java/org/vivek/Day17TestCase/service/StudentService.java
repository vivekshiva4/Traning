package org.vivek.Day17TestCase.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.vivek.Day17TestCase.model.Student;

public class StudentService {

	/*public static HashMap<Integer, Student> getStudentIdMap(){
		return getStudentIdMap;
	}
	
	static HashMap<Integer, Student> getStudentIdMap=getStudentIdMap();
	
	
	public StudentService(){
		if(getStudentIdMap==null){
			getStudentIdMap=new HashMap<Integer, Student>();
			Student one=new Student(1, "vivek", "hyderabad");
			Student two=new Student(2, "viv", "hbd");
			Student three=new Student(3, "vive", "hyd");
			
			getStudentIdMap.put(1, one);
			getStudentIdMap.put(2, two);
			getStudentIdMap.put(3, three);
		}
	}
	
	public List<Student> getAllStudents(){
		List<Student> students=new ArrayList<Student>(getStudentIdMap.values());
		return students;
		
	}*/
	
	/*public HashMap<Integer, Student> students=new HashMap<Integer, Student>();
	public StudentService(){
	Student s1=new Student(1, "name", "location");
	Student s2=new Student(2, "name", "location");
	students.put(1, s1);
	students.put(2, s2);
	
	}
	public List<Student> getAllStudents(){
		List<Student> students1=new ArrayList<Student>(students.values());
		return students1;
	
}*/
	
	public ArrayList<Student> students=new ArrayList<Student>();
	Student s1=new Student(1, "vivek", "hyderabad");
	Student s2=new Student(2, "kittu", "hyderabad");
	Student s3=new Student(3, "kittu1", "hyderabad");
	Student s4=new Student(4, "kittu2", "hyderabad");

	public StudentService(){
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
	}
	public ArrayList<Student> getAllStudents(){
		return students;
	}

	public Student getStudentById(int id){
		return students.get(id);
	}
	
	public Student addStudent(Student student){
		student.setId(students.size()+1);
		students.add(student);
		return student;
	}

}
