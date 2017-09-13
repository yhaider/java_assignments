package com.yasmeen.dojosninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yasmeen.dojosninjas.models.Ninja;
import com.yasmeen.dojosninjas.services.DojoService;
import com.yasmeen.dojosninjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas/")
public class NinjaController {
	
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	public NinjaController(NinjaService ninjaService) {
		this.ninjaService = ninjaService;
	}

	@RequestMapping("")
	public String redirectToHome() {
		return "redirect:/";
	}
	
	@RequestMapping("new")
	public String displayForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.getAll());
		return "ninjaForm.jsp";
	}
	
	@PostMapping("new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, 
								BindingResult result, 
								RedirectAttributes flash) {
		if(result.hasErrors()) {
			flash.addFlashAttribute("errs", result.getAllErrors());
			return "redirect:/ninjas/new";
		}
		ninjaService.createNinja(ninja);
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
}
