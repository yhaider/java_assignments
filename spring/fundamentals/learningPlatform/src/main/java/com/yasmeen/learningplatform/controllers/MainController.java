package com.yasmeen.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("m/{chapter}/0483/{assignmentNumber}")
	public String displayAssignment() {
		return "assignment.jsp";
	}
	
	@RequestMapping("m/{chapter}/0553/{assignmentNumber}")
	public String displayLesson() {
		return "lesson.jsp";
	}
}
