package com.yasmeen.myportfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("")
	public String home() {
		return "home.html";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "me.html";
	}
	
	@RequestMapping("/myprojects")
	public String projects() {
		return "projects.html";
	}
	
}

// Just routing to the different links as per the assignment
// They just render views