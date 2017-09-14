package com.yasmeen.productscategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yasmeen.productscategories.services.ProductService;

@Controller
@RequestMapping("/products/")
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
		// Gets the service
	
		// After this you would create methods which call
		// CRUD in the service depending on what you want to do
		// and use that information and inject it into the jsp file
		
		// I am not coding this out due to the fact that in order
		// to finish the bootcamp, I will have to take the exam a week
		// earlier and this concept makes sense to me
		// It would be very similar to the methods I made in the controllers
		// in my drivers license and lookify projects
}
