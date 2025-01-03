package com.wipro.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.springmvc.model.Customer;

@Controller
public class RegistrationController {

	@RequestMapping("/getregform")
	public String getRegistrationForm(Model model) {
		
		Customer customer = new Customer();
		
		model.addAttribute("regForm", customer);
		
		return "registrationForm";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView doRegistration(@ModelAttribute("regForm") Customer customer) {
		
		//call the service to save the data
		
		return new ModelAndView("reg-success","registedCustomer", customer);
		
	}
}
