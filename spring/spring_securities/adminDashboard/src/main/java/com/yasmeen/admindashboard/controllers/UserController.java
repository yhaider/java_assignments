package com.yasmeen.admindashboard.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yasmeen.admindashboard.services.UserService;
import com.yasmeen.admindashboard.validators.UserValidator;
import com.yasmeen.admindashboard.models.User;

@Controller
@RequestMapping("/")
public class UserController {

	private UserValidator userValidator;
	private UserService userService;
	public UserController(UserService userService, UserValidator userValidator) {
	    this.userService = userService;
	    this.userValidator = userValidator;
    }
	
	@RequestMapping("/")
    public String loginAndReg(@Valid @ModelAttribute("user") User user) {
        return "loginRegister.jsp";
    }
	
	@PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        userValidator.validate(user, result);

        if (result.hasErrors()) {
            return "loginRegister.jsp";
        }
        else if(userService.getAll().isEmpty() || userService.CheckIfOverallAdmin() == false) {
        		userService.saveUserWithAdminRole(user);
        		return "redirect:/admin";
        }
        else {
        		userService.saveWithUserRole(user);
        		return "redirect:/home";
        }
    }
}
