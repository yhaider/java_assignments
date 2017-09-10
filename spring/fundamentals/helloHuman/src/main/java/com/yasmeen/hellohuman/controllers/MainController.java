package com.yasmeen.hellohuman.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("")
    public String index(Model model, @RequestParam(value="firstname", defaultValue="Human") String firstname, @RequestParam(value="lastname", defaultValue="") String lastname) {
		model.addAttribute("firstname", firstname);
		model.addAttribute("lastname", lastname);
		return "names.jsp";
    }
	// Displays a more customizable page if there are route parameters, but 
	// if there are not, it sets the default display to be "Human"
	
}
