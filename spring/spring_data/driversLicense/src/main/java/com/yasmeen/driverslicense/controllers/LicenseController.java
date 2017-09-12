package com.yasmeen.driverslicense.controllers;

import java.util.ArrayList;
import java.util.Arrays;

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

import com.yasmeen.driverslicense.models.License;
import com.yasmeen.driverslicense.services.LicenseService;
import com.yasmeen.driverslicense.services.PersonService;

@Controller
@RequestMapping("/licenses/")
public class LicenseController {
	
	@Autowired
	private PersonService personService;
	
	private LicenseService licenseService;
	public LicenseController(LicenseService licenseService) {
		this.licenseService = licenseService;
	}
	// Instantiating services 
	
	@RequestMapping("")
	public String goToNew() {
		return "redirect:/licenses/new";
	}
	
	@RequestMapping("new")
	public String showForm(@ModelAttribute("license") License license, Model model) {
		model.addAttribute("people", personService.withoutLicense());
		ArrayList<String> states = new ArrayList<String>(Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
				"Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
				"Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
				"Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
				"New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
				"Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas",
				"Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"));
		model.addAttribute("states", states);
		return "licenseForm.jsp";
	}
	// Get request displays the create form for licenses
	
	@PostMapping("new")
	public String createLicense(@Valid @ModelAttribute("license") License license, 
								BindingResult result, 
								RedirectAttributes flash) {
		if(result.hasErrors()) {
			flash.addFlashAttribute("errs", result.getAllErrors());
			return "redirect:/licenses/new";
		}
		licenseService.createLicense(license);
		return "redirect:/";
	}
	// Post creates the license
	
	@RequestMapping("delete/{id}")
	public String deleteLicense(@PathVariable Long id) {
		licenseService.deleteLicense(id);
		return "redirect:/";
	}
}
