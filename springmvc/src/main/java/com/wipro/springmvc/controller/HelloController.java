package com.wipro.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello(Model model) {
	
		return "welcome";  //view is : /WEB-INF/views/welcome.jsp
	}
	
	@RequestMapping("/hi")
	public String sayHi() {
				
		return "home";  //view is : /WEB-INF/views/home.jsp
	}
	
	
}
