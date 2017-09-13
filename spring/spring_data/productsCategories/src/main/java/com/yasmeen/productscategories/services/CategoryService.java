package com.yasmeen.productscategories.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasmeen.productscategories.models.Category;
import com.yasmeen.productscategories.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	// Initialized the category repository
	
	public ArrayList<Category> getAll(){
		return (ArrayList<Category>) categoryRepository.findAll();
	}
	// Get all categories
	
	public Category getOne(Long id) {
		return categoryRepository.findOne(id);
	}
	// Get one category
	
	public void createCategory(Category category) {
		categoryRepository.save(category);
	}
	// Create a category
	
	public void updateCategory(Category category) {
		categoryRepository.save(category);
	}
	// Update a category
	
	public void deleteCategory(Long id) {
		categoryRepository.delete(id);
	}
	// Delete a category
}
