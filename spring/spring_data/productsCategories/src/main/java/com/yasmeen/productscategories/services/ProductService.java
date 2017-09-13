package com.yasmeen.productscategories.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasmeen.productscategories.models.Product;
import com.yasmeen.productscategories.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	// Initializes the repository
	
	
	public ArrayList<Product> getAll(){
		return (ArrayList<Product>) productRepository.findAll();
	}
	// Gets all the products

	public Product getOne(Long id) {
		return productRepository.findOne(id);
	}
	// Gets one product based on the id
	
	public void creatingProduct(Product product) {
		productRepository.save(product);
	}
	// Creates a product
	
	public void updateProduct(Product product) {
		productRepository.save(product);
	}
	// Updates a product
	
	public void deleteProduct(Long id) {
		productRepository.delete(id);
	}
}
