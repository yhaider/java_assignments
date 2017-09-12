package com.yasmeen.lookify.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String home(HttpSession session) {
		session.setAttribute("searchitem", null);
		return "main.jsp";
	}
	// Displays the entering page at root route
	
	@RequestMapping("/dash")
	public String displayDash(Model model, HttpSession session) {
		List<Song> songs = lookifyService.getAll();
		if(session.getAttribute("searchitem") != null) {
			List<Song> searchsongs = new ArrayList<Song>();
			for(int i = 0; i< songs.size(); i++) {
				Song song = songs.get(i);
				if(song.getArtist().toLowerCase().contains((String) session.getAttribute("searchitem"))){
					searchsongs.add(song);
				}
			}
			model.addAttribute("songs", searchsongs);
			return "dashboard.jsp";
		} else {
			model.addAttribute("songs", songs);
			return "dashboard.jsp";
		}
	}
	// Displays the dashboard with table of songs after
	// pulling songs from the service
	
	@RequestMapping("/add")
	public String showForm(@ModelAttribute("song") Song song) {
		return "addSong.jsp";
	}
	// This GET request to "/add" will display the form to add a song
	
	@PostMapping("/addsong")
	public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "redirect:/dash";
		}
		lookifyService.addSong(song);
		return "redirect:/dash";
	}
	// This POST request to "/add" will add a song to the
	// database
	
	@RequestMapping("/delete/{id}")
	public String deleteSong(@PathVariable Long id) {
		lookifyService.deleteSong(id);
		return "redirect:/dash";
	}
	// This deletes the song from the database based on the id
	
	@RequestMapping(path="/search", method=RequestMethod.POST)
	public String search(@RequestParam(value="search") String search, HttpSession session) {
		session.setAttribute("searchitem", search);
		return "redirect:/dash";
	}
	// This deals with searching
	
	@RequestMapping("/reset")
	public String resetSearch(HttpSession session) {
		session.setAttribute("searchitem", null);
		return "redirect:/dash";
	}
	// This resets the search 
	
	@RequestMapping("songs/{id}")
	public String showSong(@PathVariable Long id, Model model) {
		Song song = lookifyService.getOne(id);
		model.addAttribute("song", song);
		return "singleSong.jsp";
	}
	// This displays a single song
	
	@RequestMapping("/top")
	public String displayTop(Model model) {
		model.addAttribute("songs", lookifyService.topTen());
		return "topTen.jsp";
	}
	// Displays the top ten by grabbing them from
	// the Lookify service
}
