package com.yasmeen.lookify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yasmeen.lookify.models.Song;

@Controller
@RequestMapping("/")
public class LookifyController {

	@RequestMapping("")
	public String home() {
		return "main.jsp";
	}
	
}
