package com.yasmeen.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("")
	public String home(HttpSession session) {
		if(session.getAttribute("count") == null) {
			Integer count = 0;
			session.setAttribute("count", count);
		}
		Integer count = (Integer) session.getAttribute("count");
		session.setAttribute("count", count+1);
		return "main.jsp";
	}
	// This deals with setting session "count" if there is none
	// and it updates per page load
	
	@RequestMapping("/counter")
	public String count(HttpSession session) {
		if(session.getAttribute("count") == null) {
			Integer count = 0;
			session.setAttribute("count", count);
		}
		return "counterpage.jsp";
	}
	// This logic is in case someone navigates to the 
	// counter page before the home page! It should be 0.
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", null);
		return "redirect:/counter";
	}
	// This resets the counter and then redirects back to
	// the counter page so you can see it has reset
	
	@RequestMapping("/two")
	public String addtwo(HttpSession session) {
		if(session.getAttribute("count") == null) {
			Integer count = 2;
			session.setAttribute("count", count);
		}
		Integer count = (Integer) session.getAttribute("count");
		session.setAttribute("count", count+2);
		return "redirect:/counter";
	}
	// This adds two to the count and redirects to the counter
	// page so you can see that it has added two
}
