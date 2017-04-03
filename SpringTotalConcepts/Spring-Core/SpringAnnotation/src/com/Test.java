package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Product p=ac.getBean("product",Product.class);
		
		System.out.println("Prod id is "+p.getProdId());
		System.out.println("Prodname is"+p.getProdName());
		System.out.println("price is "+p.getPrice());
	}

}
//we have to set namespace context in.xml file
//add scan context and context annotation
//xml type have more importance than annotation
//