package com.example.ecsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ecsite.repository.ProductRepository;

@Controller
public class ProductController {
	private final ProductRepository productRepository;

	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("products", productRepository.findAll());
		return "home";
	}

	// 他のメソッドなど...

}
