package com.yasmeen.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	// Note: check out the logic in my JSPs in webapp/WEB-INF
	// if you don't quite understand how the logic works in here
	
	@RequestMapping("m/{chap}/0553/{lessonNumber}")
	public String displayLesson(@PathVariable int chap, @PathVariable Integer lessonNumber, Model model) {
		if(lessonNumber == 733) {
			model.addAttribute("lsn", "set");
			model.addAttribute("home", false);
		}
		else if(lessonNumber == 342) {
			model.addAttribute("lsn", "cards");
			model.addAttribute("home", false);
		}
		else if(lessonNumber == 348) {
			model.addAttribute("lsn", "adv");
			model.addAttribute("home", false);
		}
		else {
			return "redirect:/";
		}
		return "lesson.jsp";
	}
	// The way to tell an assignment from lesson is whether the third parameter 
	// is 0483 or 0553, so since we are only allowed to have two parameters for 
	// our assignment and lesson mapping, this one uses assignments
	// Chapter number does not matter but assignment number impacts what text to show
	// so based on that, we save that info to our model and display it in our jsp

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
	// The way to tell an assignment from lesson is whether the third parameter 
	// is 0483 or 0553, so since we are only allowed to have two parameters for 
	// our assignment and lesson mapping, this one uses assignments
	// Chapter number does not matter but assignment number impacts what text to show
	// so based on that, we save that info to our model and display it in our jsp
	
	@RequestMapping("")
		public String displayhome(Model model) {
			model.addAttribute("home", true);
			return "lesson.jsp";
	}
	// This uses the lesson jsp to just display the home
}
