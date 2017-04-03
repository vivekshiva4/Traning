package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {


		List<String> cart = new ArrayList<String>();
		cart.add("101");
		cart.add("102");
		cart.add("103");

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Billimpl bill = ac.getBean("bill", Billimpl.class);

		double total = bill.getCartTotal(cart);

		System.out.println("Cart 1 Total is " + total);

		cart=new ArrayList<String>();
		
		cart.add("108");
		cart.add("109");

		total = bill.getCartTotal(cart);
		System.out.println("Cart 2 Total is " + total);

		
		
	}
}
