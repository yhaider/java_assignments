package com.yasmeen.auth.controllers;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yasmeen.auth.models.User;
import com.yasmeen.auth.services.UserService;
import com.yasmeen.auth.validator.UserValidator;

@Controller
public class UserController {
	
	private UserValidator userValidator;
	private UserService userService;
	public UserController(UserService userService, UserValidator userValidator) {
	    this.userService = userService;
	    this.userValidator = userValidator;
    }
    
    @RequestMapping("/registration")
    public String registerForm(@Valid @ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    // Directs to the registration page
    
    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        userValidator.validate(user, result);
        if (result.hasErrors()) {
            return "registrationPage.jsp";
        }
        userService.saveWithUserRole(user);
        return "redirect:/login";
    }
    // If there are no errors, it redirects to the login
    
    @RequestMapping("/login")
    public String login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
        if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successfull!");
        }
        return "loginPage.jsp";
    }
    // If there are errors it will display them on the page, if the user logged out,
    // it will display they logged out and if they didn't do either, it will just display the page
    
    @RequestMapping(value = {"/", "/home"})
    public String home(Principal principal, Model model) {
        String email = principal.getName();
        User user = userService.findByEmail(email);
        model.addAttribute("currentUser", userService.findByEmail(email));
        userService.updateUser(user);
        return "homePage.jsp";
    }
    // This displays the home page
    
}
