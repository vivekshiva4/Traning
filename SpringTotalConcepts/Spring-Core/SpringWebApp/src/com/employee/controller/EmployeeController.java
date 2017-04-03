package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping(value="abc")
	public void processData(){
		System.out.println("Excuteed ProcessData");
	}
	@RequestMapping(value="xyz")
	public void processData1(@RequestParam("fName")String name,@RequestParam("age")int age){
		System.out.println("second process data"+name+"  age"+age);
	}
	 
	@RequestMapping(value="zzz")
	public ModelAndView testData(@ModelAttribute("emp") Employee emp){
		System.out.println(emp.getfName()+emp.getAge());
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("employee", emp);
		mav.setViewName("Display");
		return mav;
	}
	@RequestMapping("welcome")
	public ModelAndView helloController(){
		
		ModelAndView mav=new ModelAndView("Display");
		mav.addObject("msg", "hello");
		return mav;
	}
}
