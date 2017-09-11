package com.yasmeen.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yasmeen.lookify.models.Song;
import com.yasmeen.lookify.services.LookifyService;

@Controller
@RequestMapping("/")
public class LookifyController {

	private final LookifyService lookifyService;
	public LookifyController(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}
	// Initializing the service
	
	@RequestMapping("")
	public String home() {
		return "main.jsp";
	}
	// Displays the entering page at root route
	
	@RequestMapping("/dash")
	public String displayDash(Model model) {
		List<Song> songs = lookifyService.getAll();
		model.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	// Displays the dashboard with table of songs after
	// pulling songs from the service
	
	@RequestMapping("/add")
	public String showForm(@ModelAttribute("song") Song song) {
		return "addSong.jsp";
	}
	// This GET request to "/add" will display the form to add a song
	
	@PostMapping("/add")
	public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/dash";
		}
		lookifyService.addSong(song);
		return "redirect:/dash";
	}
	// This POST request to "/add" will add a song to the
	// database
	
}
