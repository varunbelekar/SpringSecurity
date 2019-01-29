package com.varun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String getHomePage() {
		return "home";
	}
	
	@RequestMapping(value="/private" ,method=RequestMethod.GET)
	public String getPrivatePage() {
		return "private";
	}

}
