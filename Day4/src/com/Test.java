package com;

public class Test {

	public static void main(String[] args) {

		Test t1=new Test();
		Test t2=new Test();
		
		
		if(!t1.equals(t2)){
			System.out.println("Both are Not Equal.");
		}
		
		if(t2 instanceof Object){
			System.out.println("t1 is a a object"); 
			System.out.println("hello");
		}
	}

}
