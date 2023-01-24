package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Category;
import com.main.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@PostMapping("/api/category/add")
	public ResponseEntity<String> postCategory(@RequestBody Category category) {
		categoryService.postFoodItem(category);
		return ResponseEntity.status(HttpStatus.OK).body("Category Posted..");
	}

}
