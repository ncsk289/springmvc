package com.curtis.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HomeController {
	String message = "Let's it go !";
	 
	@RequestMapping("/home")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Sir") String name) {
		System.out.println("in HomeController");
 
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

}
