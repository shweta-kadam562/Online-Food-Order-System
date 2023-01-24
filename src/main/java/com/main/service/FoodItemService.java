package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.FoodItem;
import com.main.repository.FoodItemRepository;

@Service
public class FoodItemService {
	@Autowired
	private FoodItemRepository foodItemRepository;

	public void postFoodItem(FoodItem foodItem) {
		foodItemRepository.save(foodItem);
	}
//	public List<FoodItem> getFoodItemByCategoryId(int cid){
//		Optional<Category>
//	}
}
