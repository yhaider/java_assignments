package com.yasmeen.productscategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yasmeen.productscategories.services.ProductService;

@Controller
@RequestMapping("/")
public class ProductCategoryController {
	
	@Autowired
	private ProductService productService;
	public ProductCategoryController(ProductService ps) {
		this.productService = ps;
	}
	// Getting the product service
	
	@RequestMapping("")
	public String toHome(Model model) {
		model.addAttribute("products", productService.getAll());
		return "home.jsp";
	}
	// This would just display the home page

}
