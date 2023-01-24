package com.main.service;

import java.util.List;
import java.util.stream.Collectors;

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
	public List<FoodItem> getFoodItemByCategoryId(int cid){
		List<FoodItem> list = foodItemRepository.findAll();
		List<FoodItem> filteredList=list.stream()
										.filter(e->e.getCategory().getCategoryId()==cid)
										.collect(Collectors.toList());
		return filteredList;
	}
}
