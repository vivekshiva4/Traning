package com.jcg.examples.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.service.impl.UserService;
import com.jcg.examples.viewBean.LoginBean;
import com.jcg.examples.viewBean.Student;


@Controller
public class LoginController
{
		@Autowired
		private UserService userService;

		@RequestMapping(value="/login",method=RequestMethod.GET)
		public ModelAndView displayLogin(){
			ModelAndView model = new ModelAndView("login");
			return model;
		}
		
		
		@RequestMapping(value="/login",method=RequestMethod.POST)
		public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")LoginBean loginBean)
		{
				ModelAndView model= null;
				try
				{
						boolean isValidUser = userService.isValidUser(loginBean.getUsername(), loginBean.getPassword());
						if(isValidUser==true)
						{
								System.out.println("User Login Successful");
								request.setAttribute("loggedInUser", loginBean.getUsername());
								model = new ModelAndView("welcome");
						}
						else
						{
								model = new ModelAndView("login");
								request.setAttribute("message", "Invalid credentials!!");
						}

				}
				catch(Exception e)
				{
						e.printStackTrace();
				}

				return model;
		}
		@RequestMapping(value="/save",method=RequestMethod.POST)
		public ModelAndView addUser(@ModelAttribute("studentBean")Student student,BindingResult result){
			
			userService.addStudent(student);
			ModelAndView mav=new ModelAndView("login");
			mav.addObject("msgg", "Registered SucessFully");
			return mav;
			
		}
		@RequestMapping(value="/fetch",method=RequestMethod.GET)
		public ModelAndView getallStudents(@ModelAttribute("student")Student student,BindingResult result){
//			Map<String, Object> mav=new HashMap<String,Object>();
//			mav.put("fetch", userService.getAllStudents());
//			return new ModelAndView("registerList",mav);
			ModelAndView mav=new ModelAndView("registerList");
			mav.addObject("Student", userService.getAllStudents());
			return mav;
		}
}
