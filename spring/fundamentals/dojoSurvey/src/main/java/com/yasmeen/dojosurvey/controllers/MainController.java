package com.yasmeen.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("")
	public String home() {
		return "form.jsp";
	}
	// A simple get request to the root route displays
	// the jsp with the form
	
	@RequestMapping(path="process", method=RequestMethod.POST)
    public String processresults(@RequestParam(value="name") String name, 
    							@RequestParam(value="location") String location,
    							@RequestParam(value="lang") String lang,
    							@RequestParam(value="comment") String comment, HttpSession session){
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("lang", lang);
		session.setAttribute("comment", comment);
		return "redirect:/results";
	}
	// Our form's action goes to "/process" with a POST method, so this
	// stores that information from the form to our session
	
	@RequestMapping("results")
		public String displayresults(HttpSession session) {
			return session.getAttribute("lang").equals("Java") ? "java.jsp" : "results.jsp";
		}
	// We require the session to pull the information stored from the submitted form
	// and as a challenge, if the user chooses Java as their favourite language, they
	// are redirected to a *secret* page (it displays "java rocks" in rainbow colors 50 times!)
	// but if they do not choose Java, then they are redirected to the results page, which
	// just displays their results
}
