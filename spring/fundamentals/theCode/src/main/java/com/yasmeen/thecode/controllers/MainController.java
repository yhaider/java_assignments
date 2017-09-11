package com.yasmeen.thecode.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {
	
	@RequestMapping("")
	public String index(HttpSession session) {
		if(session.getAttribute("res") == null) {
			session.setAttribute("res", "correct");
		}
		return "enter.jsp";
	}
	// This just shows the page where you enter your code
	
	@RequestMapping(path="process", method=RequestMethod.POST)
	public String processpass(@RequestParam(value="code") String code, HttpSession session) {
		String pass = "bushido";
		if(code.equals(pass)) {
			session.setAttribute("res", null);
			return "redirect:/success";
		}
		else {
			session.setAttribute("res", "incorrect");
			return "redirect:/";	
		}
	}
	// Takes the code inputed, compares it to the actual code
	// and if it is correct, redirects to success or if it isn't
	// it redirects to the main page with an error
	
	@RequestMapping("success")
	public String successful() {
		return "success.jsp";
	}
	// This should just display the success paget
}
