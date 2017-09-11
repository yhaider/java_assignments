package com.yasmeen.grouplanguages.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LanguageController {
	
	@RequestMapping("")
	public String home() {
		return "main.jsp";
	}
}
