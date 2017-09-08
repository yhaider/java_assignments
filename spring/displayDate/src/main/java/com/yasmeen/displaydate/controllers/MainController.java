package com.yasmeen.displaydate.controllers;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("")
	public String home() {
		return "main.jsp";
	}
	// Shows the main display page
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		model.addAttribute("date", date);
		return "displaydate.jsp";
	}
	// Displays the current date by injecting the
	// dependency in here
	
	@RequestMapping("/time")
	public String time(Model model) { 
		Date time = new Date();
		model.addAttribute("time", time);
		return "displaytime.jsp";
	}
	// Displays the current time by injecting the
	// dependency in here
}
