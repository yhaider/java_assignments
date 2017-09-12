package com.yasmeen.driverslicense.controllers;

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

import com.yasmeen.driverslicense.models.License;
import com.yasmeen.driverslicense.models.Person;
import com.yasmeen.driverslicense.services.LicenseService;
import com.yasmeen.driverslicense.services.PersonService;

@Controller
@RequestMapping("/")
public class PersonController {
	@Autowired
	private LicenseService licenseService;
	
	private PersonService personService;
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	// Instantiating the service
	
	@RequestMapping("")
	public String goToHome(Model model) {
		ArrayList<License> licenses = licenseService.getAll();
		ArrayList<Person> people = personService.getAll();
		model.addAttribute("people", people);
		model.addAttribute("licenses", licenses);
		return "home.jsp";
	}
	// At the root route, display the home page
	
	@RequestMapping("persons/new")
	public String showForm(@ModelAttribute("person") Person person) {
		return "personForm.jsp";
	}
	// Get request to this route displays the form
	
	@PostMapping("persons/new")
	public String makeNewPerson(@Valid @ModelAttribute("person") Person person, 
								BindingResult result, 
								RedirectAttributes flash) {
		if(result.hasErrors()) {
			flash.addFlashAttribute("errs", result.getAllErrors());
			return "redirect:/persons/new";
		}
		personService.createPerson(person);
		return "redirect:/";
	}
	// Post request to the same route processes creating a new person
	
	@RequestMapping("persons/{id}")
	public String showPerson(@PathVariable Long id, Model model) {
		License license = licenseService.getLicenseByPersonId(id);
		if(license == null) {
			return "redirect:/";
		}
		model.addAttribute("license", license);
		return "showOne.jsp";
	}
	// Showing one license
}
