package com.yasmeen.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@RequestMapping("m/{chapter}/0553/{assignmentNumber}")
	public String displayLesson(@PathVariable int chapter, @PathVariable Integer assignmentNumber, Model model) {
		if(assignmentNumber == 733) {
			model.addAttribute("lsn", "set");
		}
		else if(assignmentNumber == 342) {
			model.addAttribute("lsn", "cards");
		}
		else if(assignmentNumber == 347) {
			model.addAttribute("lsn", "adv");
		}
		else {
			return "redirect:/";
		}
		return "lesson.jsp";
	}

	@RequestMapping("m/{chapter}/0483/{assignmentNumber}")
	public String displayAssignment(@PathVariable int chapter, @PathVariable Integer assignmentNumber, Model model) {
		if(assignmentNumber == 345) {
			model.addAttribute("assn", "cf");
		}
		else if(assignmentNumber == 2342) {
			model.addAttribute("assn", "ftb");
		}
		else {
			return "redirect:/";
		}
		return "assignment.jsp";
	}
	
	
	@RequestMapping("")
		public String displayhome(Model model) {
			model.addAttribute("home", true);
			return "lesson.jsp";
	}
}
