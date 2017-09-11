package com.yasmeen.grouplanguages.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LanguageController {
	
	@RequestMapping("")
	public String home() {
		return "redirect:/languages";
	}
	// This will redirect the root route over to 
	// our languages which is our main page
	
	@RequestMapping("languages")
	public String showLanguages() {
		return "main.jsp";
	}
	// This will just display our main JSP file which
	// shows all of our languages
	
	@RequestMapping(path="languages/{id}")
	public String displayOne(@RequestParam(value="id") Integer id) {
		return "showOne.jsp";
	}
	// This takes the id from the path and finds it in the Language model
	// and stores the information and displays it on our JSP
	
	@RequestMapping(path="languages/update/{id}", method=RequestMethod.GET)
	public String editPage(@RequestParam(value="id") Integer id) {
		return "editForm.jsp";
	}
	// This takes us to our edit form page which is populated with
	// the correct language's information
	
	@RequestMapping(path="languages/update/{id}", method=RequestMethod.POST)
	public String submitChanges(@RequestParam(value="id") Integer id) {
		return "redirect:/";
	}
	// This submits the changes and then redirects to our home page
	
	@RequestMapping(path="languages/delete/{id}", method=RequestMethod.POST)
	public String deleteLang(@RequestParam(value="id") Integer id) {
		return "redirect:/";
	}
	// This grabs the correct language based on ID, deletes it
	// and then redirects to home
}
