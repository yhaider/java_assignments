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
	
	@RequestMapping("/counter")
	public String count(HttpSession session) {
		if(session.getAttribute("count") == null) {
			Integer count = 0;
			session.setAttribute("count", count);
		}
		return "counterpage.jsp";
	}
}
