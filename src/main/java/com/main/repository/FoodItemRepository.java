package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Integer> {

}
