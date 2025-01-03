package com.wipro.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/loginform")
	public String loginForm() {
		
		return "loginForm";
	}
	
	@RequestMapping("/login")
	public ModelAndView doLogin(@RequestParam("uname") String username, @RequestParam("upwd") String password) {
		
		//calls LoginService
		//add the data to model
		
		if(password.equals("1234")) {			
			return new ModelAndView("login-success", "loggedInUserName", username);
		}
		else {
			String errMsg = "Login Failed";
			return new ModelAndView("login-failure", "errorMsg", errMsg);
		}
	}
}
