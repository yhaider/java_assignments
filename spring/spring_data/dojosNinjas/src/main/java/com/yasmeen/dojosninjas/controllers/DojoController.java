package com.yasmeen.dojosninjas.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yasmeen.dojosninjas.models.Dojo;
import com.yasmeen.dojosninjas.services.DojoService;


@Controller
@RequestMapping("/")
public class DojoController {

	@Autowired
	private DojoService dojoService;
	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	// Initializing service
	
	@RequestMapping("")
	public String showHome(Model model) {
		ArrayList<Dojo> dojos = dojoService.getAll();
		model.addAttribute("dojos", dojos);
		return "home.jsp";
	}
	// Displaying the home page
	
	@RequestMapping("dojos/new")
	public String showForm(@ModelAttribute("dojo") Dojo dojo) {
		return "dojoForm.jsp";
	}
	// Displays the form for a new dojo
	
	@PostMapping("dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo,
								BindingResult result,
								RedirectAttributes flash) {
		if(result.hasErrors()) {
			flash.addFlashAttribute("errs", result.getAllErrors());
			return "redirect:/dojos/new";
		}
		dojoService.createDojo(dojo);
		return "redirect:/";	
	}
	// Creating a new dojo
	
	@RequestMapping("dojos/{id}")
	public String displayDojo(@PathVariable Long id, Model model) {
		Dojo dojo = dojoService.getOneById(id);
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninjas", dojo.getNinjas());
		return "singleDojo.jsp";
	}
	// Displays one dojo
}
