package com.employee.controller;

import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping(value="welcome")
	public ModelAndView hellospring(){
		ModelAndView mav=new ModelAndView("Display");
		mav.addObject("msg", "hello");
		return mav;
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields("city");
	}
	@RequestMapping(value="Admission")
	public ModelAndView admissionForm(){
		ModelAndView mav=new ModelAndView("Admissionform");
		return mav;
		
	}
//	@RequestMapping(value="sucessAdmission")
//	public ModelAndView sucessAdmission(@RequestParam("fName")String name,@RequestParam("age")int age){
//		ModelAndView mav=new ModelAndView("sucessAdmissionForm");
//		mav.addObject("msg", "hello "+name+" age is "+age);
//		return mav;
//	}
//	
//	@RequestMapping(value="sucessAdmission")
//	public ModelAndView sucessAdmission(@RequestParam Map<String, String> val){
//		String name=val.get("fName");
//		int age=Integer.parseInt(val.get("age"));
//		ModelAndView mav=new ModelAndView("sucessAdmissionForm");
//		mav.addObject("msg", "hello "+name+" age is "+age);
//		return mav;
//	}
//	
	@RequestMapping(value="sucessAdmission")
	public ModelAndView sucessAdmission(@ModelAttribute("emp") Employee emp,BindingResult result){
		if(result.hasErrors()){
			ModelAndView mav=new ModelAndView("Admissionform");
			return mav;
			
		}
		ModelAndView mav=new ModelAndView("sucessAdmissionForm");
		return mav;
	}
	
//@ModelAttribute
//public void addcommonmessage(Model mav){
//	mav.addAttribute("msgege", "Headeer Message");
//}
	
}


