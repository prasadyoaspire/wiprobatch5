package com.wipro.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

	@RequestMapping("/greeting")
	public String greet(Model model) {
		
		String msg = "This is Model data"; //model data
		
		model.addAttribute("message", msg);
		
		return "greet";
	}	
	
	@RequestMapping("/test")
	public ModelAndView test() {
		
		String data = "Data from DB";
		
		ModelAndView mav = new ModelAndView("success", "mydata", data); //viewname, attributeName, modelData
		
		return mav;		
	}
	
}
