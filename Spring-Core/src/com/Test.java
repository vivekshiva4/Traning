package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		//one method
		Employee e=(Employee) ac.getBean("emp");
		System.out.println("empId is"+e.getEmpId());
		System.out.println("Emp NAme is"+e.getEmpName());
		//second method we cannot type cast here
		Employee e1= ac.getBean("n3", Employee.class);
		//already empid is set to 200 after getbean obj is created if we change the value it has been changed.
		//we can set vallue ti emp id here also.
		e1.setEmpId(2051);
		System.out.println("empd id is"+e1.getEmpId());
		System.out.println("emp name is "+e1.getEmpName());
		//for bean 4 we use singleton so obj is created in result.
	}

}
//if we use prototypes as a scope then new obj is not created until we call ac.getBean()is called.(it means if we use that bean the obj is created).
//singletone scope is default in spring container and obj is created if we are not using that bean also.
//names is used because we can metion multiple name to name component,where as id component has only one value.
//in names we can use urls special charecters and all
//we can use name or id in .getbean(obj)