package com.yasmeen.grouplanguages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.yasmeen.grouplanguages.models.Language;
import com.yasmeen.grouplanguages.services.LanguageServices;

// Note: if at any time, you do not quite understand my logic
// please take a peek at my corresponding JSP files (in webapp/WEB-INF)
// since there tends to be a slight bit of logic in those


@Controller
@RequestMapping("/")
public class LanguageController {
	
	private final LanguageServices langService;

    public LanguageController(LanguageServices langService){
        this.langService = langService;
    }
	// This is instantiating the service
    
    
	@RequestMapping("")
	public String home() {
		return "redirect:/languages";
	}
	// This will redirect the root route over to 
	// our languages which is our main page
	
	@RequestMapping("languages")
	public String showLanguages(Model model, @ModelAttribute("language") Language language) {
		List<Language> langs = langService.allLanguages();
		model.addAttribute("langs", langs);
		return "main.jsp";
	}
	// This will just display our main JSP file which
	// shows all of our languages
	
	@PostMapping("languages/add")
	public String addLang(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/";
		} else {
			langService.addLanguage(language);
		}
		return "redirect:/";
	}
	// This takes information from the form and creates
	// a new language and then redirects to home
	
	@RequestMapping("languages/{id}")
	public String displayOne(@PathVariable Long id, Model model) {
		Language lang = langService.getLang(id);
		if(lang == null) {
			return "redirect:/";
		} else {
			model.addAttribute("lang", lang);
		}
		return "showOne.jsp";
	}
	// This takes the id from the path and finds it in the Language model
	// and stores the information and displays it on our JSP
	
	@RequestMapping(path="languages/update/{id}", method=RequestMethod.GET)
	public String editPage(@PathVariable Long id, Model model, @ModelAttribute("language") Language language) {
		Language l = langService.getLang(id);
		model.addAttribute("lang", l);
		return "editForm.jsp";
	}
	// This takes us to our edit form page which is populated with
	// the correct language's information
	
	@PostMapping("languages/update/{id}")
	public String submitChanges(@PathVariable int id, 
								@Valid @ModelAttribute("language") Language language, 
								BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/languages/update/"+id;
		}
		langService.updateLang(language);
		return "redirect:/languages/"+id;
	}
	// This submits the changes and then redirects to our home page
	
	@RequestMapping("languages/delete/{id}")
	public String deleteLang(@PathVariable Long id) {
		langService.deleteLang(id);
		return "redirect:/";
	}
	// This grabs the correct language based on ID, deletes it
	// and then redirects to home
}
