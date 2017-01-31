package com;

public class Test {

	public static void main(String[] args) {
		CollegeRegistration c;
		
		
		c = new Ece();
		c.register();
		c.display();
		
		c = new Cse();
		c.register();
		c.display();
		
		c = new It();
		c.register();
		c.display();
		
		c = new Mech();
		c.register();
		c.display();
		
		
	}

}
