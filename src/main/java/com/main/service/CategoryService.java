package com.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Category;
import com.main.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	public void postFoodItem(Category category) {
		categoryRepository.save(category);
	}

	public Category getFoodItemByCategory(int cid) {
		Optional<Category> optional =categoryRepository.findById(cid);
		if(optional !=null)
			return optional.get();
		return null;

		
	}


}
